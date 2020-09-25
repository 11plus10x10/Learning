"""Recursive factorial function"""


def fact(x):
    """Recursive factorial function"""
    if x == 1:
        return 1
    else:
        return x * fact(x - 1)
