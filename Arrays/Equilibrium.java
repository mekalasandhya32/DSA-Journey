class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            totalsum-=arr[i];
            if(leftsum==totalsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
        
    }
}
