package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,6,4,10};
        int n = arr.length;
        System.out.println(n);
        int k =2;
        System.out.println(countDistinct(arr, n,k));

	}
	
	static int countDistinct(int arr[], int n,int k)
    {
        int res = 0;
 
        // Pick all elements one by one
        for (int i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < n; j++)
            	if(i==j) {
            		continue;
            	}else {
                if (arr[i] - arr[j] == k)
                    res++;
            	}

        }
        return res;
    }
}
