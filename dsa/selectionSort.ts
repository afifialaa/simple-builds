function selectionSort(list){
    for(let i=0; i<list.length-1; i++){
        let min = i;
        for(let u=i+1; u<list.length; u++){
            if(list[u] < list[min]){
                min = u;
            }
        }

        let temp = list[i];
        list[i] = list[min];
        list[min] = temp;
    }

    return list;
}

let list = [4, 3, 5, 2, 1];
let ans = selectionSort(list);
console.log(ans);