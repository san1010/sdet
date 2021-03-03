username=input("Enter your name")
age=int(input("Enter your age"))

x=100-age
text="You will turn 100 in {} years"
print(text.format(x))
	
year = str( ( 2020 - age ) + 100 )
print(username+"will turn 100 in the year "+year)