#escriba un programa en python para adivinar un numero al azar entre el 1 y el 10
import random

number = int(input("Ingrese un numero: "))
random_number = random.randint(1, 10)


while number != random_number:
    print("No adivinaste, ingrese otro numero: ")
    #random_number = random.randint(1, 10)
    number = int(input("Ingrese un numero: "))

print("Adivinaste!")