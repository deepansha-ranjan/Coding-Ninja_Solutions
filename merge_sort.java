package CodingNinjas;

public class merge_sort {
	
		
		public static void mergeSort(int [] s1,int [] s2,int []d) {
		int i=0;
		int j=0;
		int k=0;
		while(i<s1.length&&j<s2.length) {
			if(s1[i]<s2[j]) {
				d[k]=s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				k++;
				j++;
			}
		}
		
			while(i<s1.length) {
				d[k]=s1[i];
				i++;
				k++;
			}
		
		
			while(j<s2.length) {
				d[k]=s2[j];
				
				k++;
				j++;
			}
		
		
	}
	public static void mergeSort (int[] input) {
		if(input.length<=1) {
			return;
		}
		 int b[]=new int[input.length/2];
		 int c[]=new int[input.length-b.length];
		 
		 for( int i=0;i<input.length/2;i++) {
			 b[i]=input[i];
		 }
		 
		 for(int i=input.length/2;i<input.length;i++) {
			 c[i - input.length/2]=input[i];
		 }
		 mergeSort(b);
		 mergeSort(c);
		 mergeSort(b,c,input);
		
}



}
