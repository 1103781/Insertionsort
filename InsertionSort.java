public class sorting
{

	public static void main(string[]args)
  {
	
         int[] a=(5,2,6,1,4,3);
	 int i,j,key;
      for(int i=1;i<arr.length)
     {
          key = a[i];
	  j=i;
      while(j>0 && a[j-1]>key)
	     {
		   a[j]=a[j-1];
		   j=j-1;
	    }
            a[j]= key;
      }
        for(int i=0;i<a.length;i++)
         system.out.print(a[i]+" ");
   }
}