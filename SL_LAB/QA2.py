##2. Write a python program to count the frequency of words in a given file.

file = open("QA2.txt")
worddic = { }
for line in file:  
        myline = line.split()
        for word in myline:
                w = worddic.get(word,0)
                worddic[word] = w + 1 
print (worddic ,"\n ")

##OR


##from collections import Counter
##def word_count(fname):
##        with open(fname) as f:
##                return Counter(f.read().split())
##
##print("Number of words in the file :",word_count("QA2.txt"))
