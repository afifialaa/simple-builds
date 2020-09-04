let list:number[] = [22, 18, 87, 13, 1, 89, 43, 51, 77, 93];
let newList:number[] = bubbleSort(list);
console.log(newList);

function bubbleSort(list:number[]):number[]{
    for(let i=1; i<list.length; i++){
        let swapped:boolean = false;

        for(let u=0; u<list.length-1; u++){
            if(list[u] > list[u+1]){
                let temp:number = list[u];
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