package java1;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[] = {'A','X','D','Z','Y','C','W','B'};
		
		
		//sorting an array in descending order
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i] > arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for(int i=0;i<8;i++)
		{
			System.out.println(arr[i]);
		}

	}

}


/*OUTPUT
Sorted array: 
Z
Y
X
W
D
C
B
A
*/

