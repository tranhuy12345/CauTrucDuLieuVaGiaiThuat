
package LinearSearch;

public class PrintTheEvenNumberInOldIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9};
        PrintTheEvenNumberInOldIndex p = new PrintTheEvenNumberInOldIndex();
        String s = p.printNumber(arr);
        System.out.println(s);
        
    }
    public String printNumber(int[] arr){
        String s= "";
        int count=0;
        for (int i = 0; i < arr.length; i=i+2) {
            if(arr[i]%2 != 0){
                count++;
                s += arr[i]+" ";
            }
        }
        if(count==0){
            s = "NULL";
        }
        return s;
        
    }
    
}
