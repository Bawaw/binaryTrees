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
	
	
	private void print(int[] w, int S, boolean[] x, int k, int s){
		if(k>= w.length){ 
			return;
		}
		
		x[k]=true;
		if(s+w[k] == S){ 
			print(w,x);
		} else {
			print(w, S, x, k+1, s+w[k]);
		}
		
		x[k]=false;
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
