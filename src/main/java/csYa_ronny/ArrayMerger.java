package csYa_ronny;

public class ArrayMerger {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // TODO: Implement the logic to merge two sorted arrays
        int[]arr = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            if (arr1[i]>arr2[j]){
                arr[k]=arr1[j];
                j++;
                k++;
            }
        }
        return arr;
       }

    public static void main(String[] args) {
        // דוגמה לשימוש בשיטה
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] result = mergeSortedArrays(array1, array2);

        // הדפסת המערך הממוזג
        System.out.print("Merged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
