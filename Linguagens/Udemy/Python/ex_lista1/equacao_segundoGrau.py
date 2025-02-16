# DELTA = B**2 - 4.A.C
#X1 E X2 = X1 = -B +- RAIZ DE DELTA/2.A

import math as m

a = int(input("Digite o valor de A: \n"))
b = int(input("Digite o valor de B: \n"))
c = int(input("Digite o valor de C: \n"))


delta = (b**2) - (4*a*c)

print(delta)

#Calculando as raizes
delta_quadrado = m.sqrt(delta)
x1 = (-b + delta_quadrado)/(2*a)
x2 = (-b -delta_quadrado)/(2*a)

print("O delta é: " ,delta , "\n O X1 é: " , x1 , "\n O X2 é: ", x2)