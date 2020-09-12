import math
def binarySearch(a, key):
    low = 0
    high = len(a)-1

    while low <= high:
        mid = int(math.floor((low + high) / 2))

        if a[mid] == key:
            return mid
        elif a[mid] > key:
            high = mid-1
        else:
            low = mid+1

    return -1

a = [1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12]
ans = binarySearch(a, 70)
print(ans)

