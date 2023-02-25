
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2;

        int [] arr3 = new int [l3];
        for(int x = 0; x < l1; x++){
            arr3[x] = arr1[x];
        }
        for(int x = 0; x < l2; x++){
            arr3[x+l1] = arr2[x];
        }
        for (int i = 0; i < l3; i = i + 1) {
              
            
            System.out.println(arr3[i]);
        }
        return arr3;
    }
}
