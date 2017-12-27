##4. Write a python program to read in a list of numbers.
##Use one-line comprehensions of create a new list of even numbers.
##Create another list reversing the elements.

a=[int(x) for x in input(">>>").split()]
b=[y for y in a if y%2==0]
c=b
print(c)
b.reverse()
print(b)


##
##H = [1,2,3,4,5,6,7,8,9,10]
##S = [y for y in H]
##M = [x for x in S if x % 2 == 0]
##M.reverse()
##print(M)
