public class Main {
    public static void main(String[] args) {
        
    }
    //// search in the array: return the index if item found
    /// otherwiuse it item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0 ){
            return-1;
        } 

        //run for a loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1; 
    }
}