package sorting;

public class InsertionSort {
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

        int[] newList = insertionSort(list);
        for(int item:newList){
            System.out.println(item);
        }

    }

    public static int[] insertionSort(int[] list){
        for(int i=0; i<list.length; i++){
            int curr = list[i];
            int u;
            for(u=i-1; u >= 0 && list[u] > curr; u--){
                list[u+1] = list[u];
            }

            list[u+1] = curr;
        }
        return list;
    }
}
