// The array numbers is already exists. Write only exchange actions here.
val buff = numbers[0]
numbers[0] = numbers[numbers.lastIndex]
numbers[numbers.lastIndex] = buff
