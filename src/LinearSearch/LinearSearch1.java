
package LinearSearch;


public class LinearSearch1 {

    
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        LinearSearch1 l = new LinearSearch1();
        int i = l.linearSearch(arr, 4);
        System.out.println(i);
    }
    public int linearSearch(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
