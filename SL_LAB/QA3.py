#3. Write a python program to find the longest words in a file.

file = open("QA3.txt")
max_word = []

for line in file:
    myline = line.split()
    max_len = 0

    for word in myline:
        word_len = len(word)
        if word_len > max_len:
            max_len = word_len

    for words in myline:
        if(len(words) == max_len):
            max_word.append(words)
            
print(max_word,":" ,max_len)


##  OR

##def longest_word(filename):
##    with open(filename, 'r') as infile:
##              words = infile.read().split()
##    max_len = len(max(words, key=len))
##    return [word for word in words if len(word) == max_len]
##
##print(longest_word('QA3.txt'))


