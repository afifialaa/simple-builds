let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let ans = binarySearch(list, 3);
console.log(ans);

function binarySearch(list, key) {

    let low = 0;
    let high = list.length - 1;
    let mid = (low + high) / 2;

    let index = -1;


    let searching: boolean = true;
    while ( high >= low) {
        if (list[mid] == key) {
            searching = false;
        }
        if (list[mid] > key) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    return index;
}