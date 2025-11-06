//Selection Sort is a comparison-based sorting algorithm.
// It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element.
// This process continues until the entire array is sorted.
//1.First we find the smallest element and swap it with the first element. This way we get the smallest element at its correct position.
//2.Then we find the smallest among remaining elements (or second smallest) and swap it with the second element.
//3.We keep doing this until we get all elements moved to correct position.

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n= arr.length;
        //start from 0 to the 2nd Last element because when comparing 2nd last element will be the last one to be swapped
        for(int i=0;i<n-1;i++){
            int minIndex=i;

            //go from i+1 till last element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
