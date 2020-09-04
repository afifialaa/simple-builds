let list:number[] = [14, 33, 27, 10, 35, 19, 42, 44];
console.log(mergeSort(list));

function mergeSort(list:number[]){
    if(list.length <= 1) return list;

    let mid = Math.floor(list.length / 2);

    let list1 = mergeSort(list.slice(0, mid));
    let list2 = mergeSort(list.slice(mid));

    return merge(list1, list2);
}

function merge(list1:number[], list2:number[]){

    let temp:number[] = [];

    while(list1.length && list2.length){
        if(list1[0] > list2[0]){
            temp.push(list2.shift());
        }else{
            temp.push(list1.shift());
        }
    }
    console.log('temp is ' + temp);

    return temp.concat(list1.slice().concat(list2.slice()));
}