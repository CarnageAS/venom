##5. Write a python program to define a student class that includes name,
##usn and marks of 3 subjects. Write functions calculate()- to
##calculate the sum of the marks print() to print the student details.

class student:
    name = " "
    usn  = " "
    sub1 = 0
    sub2 = 0
    sub3 = 0
    total= 0

    def __init__(self,name,usn,sub1,sub2,sub3):
        self.name = name
        self.usn  = usn
        self.sub1 = sub1
        self.sub2 = sub2
        self.sub3 = sub3

    def calculate(self):
        total = self.sub1 + self.sub2 + self.sub3
        print("TOTAL: ",total)

    def print_details(self):
        print("NAME: ",self.name)
        print("USN: ",self.usn)
        print("SUBJECT 1: ",self.sub1)
        print("SUBJECT 2: ",self.sub2)
        print("SUBJECT 3: ",self.sub3)
        
print("enter name:")
name = str(input(">>> "))
print("enter usn:")
usn = str(input(">>> "))
print("enter subject 1 marks:")
m1 = int(input(">>> "))
print("enter subject 2 marks:")
m2 = int(input(">>> "))
print("enter subject 3 marks:")
m3 = int(input(">>> "))

print("--------STUDENT DETAILS--------\n")
s1 = student(name,usn,m1,m2,m3)
s1.print_details()
s1.calculate()


##print("--------STUDENT DETAILS--------\n")
##s1 = student("ABC", "1MS15IS001", 80,70,60)
##s1.print_details()
##s1.calculate()

      



        
        
        
