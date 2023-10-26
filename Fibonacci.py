def fibonacci(n):
    a = 0
    b = 1
    d = [0,1]
    if n < 0:
        print("Incorrect input")
    elif n == 0:
        return a
    elif n == 1:
        return b
    else:
        for i in range(2, n+1):
            c = a + b
            a = b
            b = c
            d.append(b)
    return(d)

 
print(fibonacci(2))