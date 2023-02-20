/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinearSearch;

import java.util.ArrayList;

/**
 *
 * @author thuhuytran
 */
public class InterpolationSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        InterpolationSearch i = new InterpolationSearch();
        int l = i.interpolationSearch(list, 3);
        System.out.println(l);
    }
    public int interpolationSearch(ArrayList<Integer> list,int x){
        int l =0;
        int r = list.size()-1;
        while(list.get(r) != list.get(l) && x>=list.get(l) && x<=list.get(r)){
            int mid = l + (r-l)*(x-list.get(l))/(list.get(r)-list.get(l));
            System.out.println(mid + " mid");
            if(list.get(mid)<x){
                l = mid + 1;
            }else if(list.get(mid)>x){
                r = mid -1;
            }else{
                if(mid>0 && list.get(mid-1)==x){
                    r = mid -1;
                }else{
                    return mid;
                }
                
            }
        }
        if(list.get(l)==x){
            return l;
        }
        return -1;
    }
    
}
