class MaxWater{
    public int maxWater(int arr[]) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left],arr[right]);
            int area=width*height;
            maxarea=Math.max(maxarea,area);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}