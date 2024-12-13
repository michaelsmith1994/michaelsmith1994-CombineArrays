
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] arr3;
        if(arr1 != null && arr2 != null){
            int array1len = arr1.length;
            int array2len = arr2.length;
            
            //Avoiding using the array library for this ill be iterating manually with loops as this is a practical.

            arr3 = new int[array1len+array2len];//set a length to it of arr1 + arr2
            
            for(int i = 0; i<array1len; i++){
                //setting my arr1 values
                arr3[i] = arr1[i];          
            }
            for(int i = 0; i < array2len; i++){
                //setting my arr2 values
                arr3[array1len + i] = arr2[i];
            }
            return arr3;
        }
        return null; // return a null if im sent an empty array from main
    }
}
