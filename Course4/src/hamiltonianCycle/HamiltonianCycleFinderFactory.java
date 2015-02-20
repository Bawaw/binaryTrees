package hamiltonianCycle;


public class HamiltonianCycleFinderFactory {
	
	static IHamiltonianCycleFinder hamiltonianCycleFinderBruteforce = new HamiltonianCycleFinderBruteforce();
	static IHamiltonianCycleFinder hamiltonianCycleBackTracking = new HamiltonianCycleBackTracking();
	
	static IHamiltonianCycleFinder create(HamiltonianCycleFinderType type){
		if(type == HamiltonianCycleFinderType.BRUTEFORCE){
			return hamiltonianCycleFinderBruteforce;
		} 
		else {
			return hamiltonianCycleBackTracking;
		}
		
	}
}
