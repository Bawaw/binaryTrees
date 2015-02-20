package graphColouring;

public class GraphColourerBacktracking implements IGraphColourer {

	@Override
	public int[] colour(boolean[][] graph, int nColours) {
		int[] colours = new int[graph.length];
		colours[0] = 1;
		return (nodeColouring(graph, colours, nColours, 1)) ? colours : null;
	}

	
	private boolean nodeColouring(boolean[][] graph, int[] colours, int nColours, int node){
		if(node == graph.length)
			return true;
		
		for(int colour = 1; colour <= nColours; ++colour){
			if(isValid(graph, colours, node, colour)){
			    colours[node] = colour;
			    if(nodeColouring(graph, colours, nColours, node+1)){
			    	return true;
			    }
			}
		}
		return false;
	}
	
	private boolean isValid(boolean[][] graph, int[] colours, int node, int colour){
		colours[node] = colour;
			
		for (int i = 0; i < node; i++) {
			if(graph[node][i] && colours[i] == colours[node])
				return false;
		}
		
		return true;
	}
	
}
