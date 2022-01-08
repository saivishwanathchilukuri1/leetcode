package educative.io;

public class Binarysearchprogram {
	

		  static int binSearch(int[] A, int key) {
			  
			  int high = A.length-1;
			  int low=0;
			  while(low<=high)
			  {
				  int mid= low+((high-low)/2);
					  if(key==A[mid])
					  {
						  return mid;
					  }
					  
						 
					  
						  if(key>A[mid])
						  {
						 
							  low= mid+1;
						  }
					      else
					      {
							  high=mid-1;
					      }
			  }
						 return -1;
						
			  
				  }
			  
	public static void main(String[] args) {
		int A[]= {1,5,9,11,14,17,19,21,24,25,26,27,29,30};
		int key[]= {3,5,11,25,29};
		// TODO Auto-generated method stub
		for(int i=0; i<key.length;i++)
		{
		System.out.println("binSearch(arr," +key[i]+")="+binSearch(A,key[i]));
	}
}
}

