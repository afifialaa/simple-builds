package search;

import java.rmi.dgc.VMID;

public class BinarySearch {
    public static void main(String []args){
        int[] list = new int[10];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        list[6] = 7;
        list[7] = 8;
        list[8] = 9;
        list[9] = 10;

        int ans = binarySearch(list, 41);
        System.out.println(ans);
    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(low <= high){
            int mid = (int)Math.floor((high + low) / 2);
            if(list[mid] == key){
                return mid;
            }else if(list[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
