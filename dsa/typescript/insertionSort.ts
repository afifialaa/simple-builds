let list:number[] = [22, 18, 87, 13, 1, 89, 43, 51, 77, 93];
let newList:number[] = insertionSort(list);
console.log(newList);

function insertionSort(list:number[]):number[]{
    for(let i=1; i<list.length; i++){
        let curr:number = list[i];
        let u;
        for(u=i-1; u >= 0 && list[u] > curr; u--){
            list[u+1] = list[u];
        }

        list[u+1] = curr;
    }
    return list;
}