public class KeyInRotatedSortedArray {
    static int findKey(int[] arr,int key){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(key==arr[mid]){
                return mid;
            }

            if(arr[mid]>=arr[low]){
                if(key< arr[mid] && key>=arr[low]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(findKey(arr, key));
    }
}
