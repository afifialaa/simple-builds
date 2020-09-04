package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] list = new int[10];
        list[0] = 22;
        list[1] = 18;
        list[2] = 40;
        list[3] = 12;
        list[4] = 1;
        list[5] = 90;
        list[6] = 72;
        list[7] = 110;
        list[8] = 9;
        list[9] = 51;

        int[] newList = mergeSort(list);
        for(int item:newList){
            System.out.println(item);
        }
    }

    public static int[] mergeSort(int[] list){
        if(list.length == 1){
            return list;
        }

        int mid = (int) Math.floor(list.length / 2);
        int[] left = mergeSort(Arrays.copyOfRange(list, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(list, mid, list.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        
    }
}
