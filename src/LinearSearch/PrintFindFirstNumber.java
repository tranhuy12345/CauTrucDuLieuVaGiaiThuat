
package LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;


public class PrintFindFirstNumber {

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        PrintFindFirstNumber p = new PrintFindFirstNumber();
        int a = p.findFirstNumber(list, 2);
        System.out.println(a);
    }
    
    public int findFirstNumber(ArrayList<Integer> list,int x){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==x){
                return i;
            }
        }
        return -1;
    }
    
}
