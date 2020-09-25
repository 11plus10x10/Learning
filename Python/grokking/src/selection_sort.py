"""Selection sort algorithm"""


def find_smallest(arr):
    """Returns smallest number index in array"""
    smallest = arr[0]
    smallest_i = 0
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_i = i
    return smallest_i


def selection_sort(arr):
    """Returns array selection sorted array"""
    new_arr = []
    for i in range(len(arr)):
        smallest = find_smallest(arr)
        new_arr.append(arr.pop(smallest))
    return new_arr


print(selection_sort([5, 3, 6, 2, 10]))
