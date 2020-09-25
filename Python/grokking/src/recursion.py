"""Recursion code examples"""


def countdown(i):
    """Prints countdown till 0"""
    print(i)
    if i <= 0:
        return
    else:
        countdown(i - 1)


countdown(0)
