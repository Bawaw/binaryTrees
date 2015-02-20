package mystery;

public class XFinder {

	/*
	 * w should be an array of strictly positive integers 
	 * S should be a strictly positive integer
	 */
	public void print(int[] w, int S) {
		boolean[] x = new boolean[w.length];
		print(w, S, x, 0, 0);
	}
	
	/*
	 * w zijn getallen
	 * S is getal dat je zoekt
	 * x zijn combinaties < S
	 * k is index
	 * s = som van getallen tot nu toe
	 * 
	 * oplossing: 
	 *  1) je moet bijhouden welke je al geprobeerd hebt
	 *  2) kijken dat som < S is
	 * */
	
	private void print(int[] w, int S, boolean[] x, int k, int s){
		if(k>= w.length){ 
			return;
		}
		
		x[k]=true;
		
		if(s+w[k] == S){ 	//als de som van de tot nu toe gevonde waardes S is 
			print(w,x);
		}
	
		else if(s > S){	//als de s waarde groter is dan de waarde die we zoeken, pak volgende
			return;
		}
	
		else {	
			print(w, S, x, k+1, s+w[k]); //als som kleiner is dan S
		}
		
		x[k]=false;			//na het vinden van een goede som, zoek verder
		if(s == S){ 
			print(w,x);
		} else {
			print(w, S, x, k+1, s);
		}	
	}
	
	private void print(int[] w, boolean[] x){
		for(int i=0; i<w.length; ++i){
			if(x[i])
				System.out.print(w[i] + " ");
		}
		System.out.println();
	}
	


}
