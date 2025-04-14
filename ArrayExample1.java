package java1;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {45,35,56,67,78,89,78,12,20};
		
		// Sorting an array in ascending order
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
				
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<9;i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}

/* OUTPUT
Sorted array: 
12
20
35
45
56
67
78
78
89
*/
