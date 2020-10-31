package sorting;

import java.util.Random;

public class SelectionSort {
    public static Random r = new Random();
    public static void main(String[] args) {
        int[] list = new int[10];
        for(int i=0; i<list.length; i++){
            list[i] = r.nextInt(100-0)+0;
        }

        for(int item:list){
            System.out.println(item);
        }

        selectionSort(list);
        System.out.println("+++++++++++++++++++++");

        for(int item:list){
            System.out.println(item);
        }
    }

    public static void selectionSort(int[] list){
        for(int i=0; i<list.length-1; i++){
            int minIndex = i;
            for(int u=i+1; u<list.length; u++){
                if(list[u] < list[minIndex]){
                    minIndex = u;
                }
              }

            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
}
