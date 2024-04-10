class Solution {
    public void rotate(int[] arr, int k) {
        // int n = nums.length;

        // for(int j=0; j<k; j++){
        // int temp = nums[n-1];

        // for(int i=n-1; i>0; i--){
        //     nums[i] = nums[i-1];
        // }
        // nums[0] = temp;
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(nums[i]+" ");
        // }
        // int n = arr.length;
        // k = k % n; // to handle cases where k is larger than n
        // if (k < 0) {
        //     k = n + k; // to handle negative values of k
        // }

        // for (int i = 0; i < k; i++) {
        //     int temp = arr[n - 1];
        //     for (int j = n - 1; j > 0; j--) {
        //         arr[j] = arr[j - 1];
        //     }
        //     arr[0] = temp;
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }

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