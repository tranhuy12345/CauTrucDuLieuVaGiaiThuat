
package LinearSearch;

import java.util.Arrays;

public class SwitchMinMaxInArray {

   
    public static void main(String[] args) {
        SwitchMinMaxInArray s = new SwitchMinMaxInArray();
        int[] arr = {1,1,2,1};
        s.switchIndex(arr);
        
    }
    public int findIndexMin(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }
    public int findIndexMax(int[] arr){
        int max = arr.length-1;
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public void switchIndex(int[] arr){
        var temp = arr[findIndexMin(arr)];
        arr[findIndexMin(arr)] = arr[findIndexMax(arr)];
        arr[findIndexMax(arr)] = temp;
        System.out.println(Arrays.toString(arr));
        
    }
}
