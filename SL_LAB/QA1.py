##1. Write a python program to read in a list of elements. Create a new list
##that holds all the elements minus the duplicates (Use functions).

a = []
new_a = []
final_list = []

def new_list(a,size):
    for num in a:
        if num not in new_a:
            new_a.append(num)
    return new_a


print("enter size of list\n")
size = int(input(">>> "))

print("ENTER A LIST OF ELEMENTS")
for i in range(size):
    n = int(input(">>> "))
    a.append(n)
    i = i + 1

final_list = new_list(a,size)
i=0
for i in range(len(final_list)):
    print(final_list[i])
    print("\n")


    
