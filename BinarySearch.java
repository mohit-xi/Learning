public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int low=0, high= arr.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}
