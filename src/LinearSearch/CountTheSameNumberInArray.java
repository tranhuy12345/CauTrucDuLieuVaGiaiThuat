
package LinearSearch;

public class CountTheSameNumberInArray {

    public static void main(String[] args) {
       int[] arr = {1,2,3,1,1,1,1,1,1};
       CountTheSameNumberInArray c = new CountTheSameNumberInArray();
       int check = c.countNumber(arr, 1);
        System.out.println(check);
    }
    
    public int countNumber(int[] arr, int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    
}
