public class TwoSumUsingPointers {
    static boolean isSumPresent(int[] arr,int sum){
        int left=0,right= arr.length-1;
        while(left < right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==sum){
                return true;
            }
            if(currentSum < sum) {
                left = left + 1;
            }
            else{
                right=right-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 8, 10, 13 };
        System.out.println(isSumPresent(arr,15));
        System.out.println(isSumPresent(arr,14));
    }
}
