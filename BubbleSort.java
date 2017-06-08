package javatest2;

public class BubbleSort {
	
	public static void main(String args[]){
		int a[] = {5,12,9,30,4,17,0,26,43,7,16,24};
		int b[]= Sort(a);
		
		
		for(int i=0;i<b.length ; i++){
			System.out.print(b[i]+" ");
		}
		
	}
	
	public static int[] Sort(int[] array)
    {
        for (int i = array.length - 1; i > 0; --i)
            for (int j = 0; j < i; ++j)
                if (array[j] > array[j + 1])
                    Swap(array, j, j + 1);
        return array;
    }
 
    private static void Swap(int[] array, int indexA, int indexB)
    {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

}
