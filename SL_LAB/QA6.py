##6) Write a recursive python function that has a parameter
##representing a list of integers and returns the maximum stored in the list.

num = [12,45,39,780,65]

def Max(num):
	if len(num) == 1:
		return num[0]

	elif len(num) == 0:
		print("list is empty")	

	else:
		m = Max(num[1:])
		if m > num[0] :
			return m
		else :
			return num[0]

maximum_element = Max(num)
print(maximum_element)
