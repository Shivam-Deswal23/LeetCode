class Solution {
    public void rotate(int[] arr, int k) {
       
        int n = arr.length;
        k = k % n; // to handle cases where k is larger than n
        if (k < 0) {
            k = n + k; // to handle negative values of k
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
}