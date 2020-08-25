let list = [1, 2, 3, 4, 5, 6, 7, 8, 9];

let ans = linearSearch(list, 10);
console.log(ans);

function linearSearch(list, key){
    let pos = -1;
    list.forEach( (item, index) => {
        if(item == key){
            pos = index;
        }
    })
    return pos;
}
