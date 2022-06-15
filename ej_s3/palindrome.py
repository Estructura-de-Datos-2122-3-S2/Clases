word = input("ingrese una palabra: ")
word2 = ""

for i in range(len(word)):
    #word2 += word[::-1][i]
    #word2 += word[len(word)-1-i]
    print(word[i])

if (word == word2):
    print("es palindromo")
else:
    print("no es")