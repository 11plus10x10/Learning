"""Simple callstack example"""


def greet(name):
    """Greets"""
    print(f"Hello, {name}!")
    greet2(name)
    print("getting ready to say bye...")
    bye()


def greet2(name):
    """Asks how are you"""
    print(f"How are you, {name}?")


def bye():
    """Says goodbye"""
    print("Ok, bye!")


greet("maggie")
