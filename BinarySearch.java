import java.util.Scanner;
class BinarySearch
{
	int temp;
	void sortArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}	
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);	
		}
	}

	int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
	public static void main(String arg[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element for array");
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search");
		num=sc.nextInt();
		BinarySearch bs=new BinarySearch();

		bs.sortArray(arr);
		int ans=bs.binarySearch(arr, num);
		
		if(ans!=-1)
		{
			System.out.println("\n\nElement found at "+ans);
		}
		else
		{
			System.out.println("\n\nElement not found");
		}	
	}
}