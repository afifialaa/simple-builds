let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let ans = binarySearch(list, 11);
console.log(ans);

function binarySearch(list, key) {

    let low = 0;
    let high = list.length - 1;

    while ( low <= high) {
        let mid:number = Math.floor((high + low) / 2);
        if (list[mid] == key) {
            return mid;
        }
        if (list[mid] > key) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;
}