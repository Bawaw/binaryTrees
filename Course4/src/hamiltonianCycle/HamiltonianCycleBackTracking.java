package hamiltonianCycle;

public class HamiltonianCycleBackTracking implements IHamiltonianCycleFinder {

	@Override
	public int[] find(boolean[][] graph) {
		int[] cycle = new int[graph.length];
		cycle[0] = 0;
		return addNode(graph, cycle, 1) ? cycle : null;
	}

	private boolean addNode(boolean[][] graph, int[] cycle, int index) {
		if (index == graph.length && graph[cycle[cycle.length-1]][cycle[0]])
			return true;

		for (int node = 1; node < graph.length; ++node) {
			if (isValid(graph, cycle, index, node)) {
				cycle[index] = node;
				if (addNode(graph, cycle, index + 1))
					return true;
			}
		}
		return false;
	}

	private boolean isValid(boolean[][] graph, int[] cycle, int index, int node) {
		if(index >= graph.length)
			return false;
		
		cycle[index] = node;
		boolean[] had = new boolean[cycle.length];

		for (int i = 0; i <= index; i++) {
			if (had[cycle[i]])
				return false;
			had[cycle[i]] = true;
		}
		if (!graph[node][cycle[--index]])
			return false;

		return true;
	}
}
