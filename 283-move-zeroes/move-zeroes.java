class Solution {
    public int[] moveZeroes(int[] arr) {
       int j = -1;
        int temp;
        for(int i=0; i<arr.length; i++){  // storing 0 in j
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return arr;
        }

        for(int i=j+1; i<arr.length; i++){
            if(arr[i] != 0){
                // swapping
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}