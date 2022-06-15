word = input("ingrese una palabra")
vocals = ["a", "e", "i", "o", "u"]
word2 = ""

if(word.isalpha()):
    for i in range(len(word)):
        if(word[i] in vocals):
            word2 += word[i].upper()
        else:
            word2 += word[i]
else:
    print("ingrese una palabra valida")

print(word2)