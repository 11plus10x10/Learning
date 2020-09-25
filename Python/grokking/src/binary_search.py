"""Шлифует на отличненько"""


def binary_search(seq, item):
    """Return guess using binary search"""
    low = 0
    high = len(seq) - 1

    while low <= high:
        mid = (low + high) // 2
        guess = seq[mid]
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return None


myList = [1, 3, 5, 7, 9]
print(binary_search(myList, 3))
print(binary_search(myList, -1))
print()