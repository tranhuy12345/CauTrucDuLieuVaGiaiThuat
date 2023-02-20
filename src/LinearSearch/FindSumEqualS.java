
package LinearSearch;

import java.util.ArrayList;


public class FindSumEqualS {

   
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(7);
       list.add(6);
       list.add(6);
       list.add(5);
       list.add(6);
       list.add(5);
       list.add(2);
       list.add(3);
       list.add(5);
       list.add(3);
       FindSumEqualS f = new FindSumEqualS();
       f.solve(list, 10);
    }
    public String findSum(int[] arr,int x){
        String s ="";
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {           
            sum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j];
                if(sum==x){
                    for (int k = i; k <= j; k++) {
                        s += arr[k]+ " ";
                    }                  
                }             
            }
            
        }
        return s;
    }
    /*
    input: arr[] a, s
    int[] b,
    b[0] = a[0]
    for i -> a.length
        b[i] = b[i-1] + a[i];
    for i -> n;
    if(b[i]==s)
        for j : 0 -> i
            print j
    if(b[i]<s)
        int l = binSearch(b,b[i]-s)
    
    */
    public void solve(ArrayList<Integer> list, int s){
        ArrayList<Integer> sumList = new ArrayList<>();
        sumList.add(0, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sumList.add(i, sumList.get(i-1)+list.get(i));
        }
//        System.out.println(sumList.toString());
        for (int i = 0; i < sumList.size(); i++) {
            if(sumList.get(i)==s){
               printList(list,0,i);
               break;
            }
            if(sumList.get(i)>s){
                int l = binarySearch(sumList,sumList.get(i)-s);
                if(l != -1){
                    printList(list, l+1, i);
                    break;
                }
            }
        }
        
        
    }

    private void printList(ArrayList<Integer> list, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    private int binarySearch(ArrayList<Integer> sumList, int x) {
        int l = 0;
        int r = sumList.size()-1;
        while(l<r){
            int mid = (l+r)/2;
            if(sumList.get(mid)<x){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        if(sumList.get(l)==x){
            return l;
        }
        return -1;
    }
    
}
