var list = [22, 18, 87, 13, 1, 89, 43, 51, 77, 93];
var newList = bubbleSort(list);
console.log(newList);
function bubbleSort(list) {
    for (var i = 1; i < list.length; i++) {
        var swapped = false;
        for (var u = 0; u < list.length - 1; u++) {
            if (list[u] > list[u + 1]) {
                var temp = list[u];
                list[u] = list[u + 1];
                list[u + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
    return list;
}
