package sorting;

public class BubbleSort {
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

        int[] newList = bubbleSort(list);
        for(int item:newList){
            System.out.println(item);
        }
    }

    public static int[] bubbleSort(int[] list){
        for(int i=1; i<list.length; i++){
            boolean swapped = false;
            for(int u=0; u<list.length-1; u++){
                if(list[u] > list[u+1]){
                    int temp = list[u];
                    list[u] = list[u+1];
                    list[u+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return list;
    }
}
