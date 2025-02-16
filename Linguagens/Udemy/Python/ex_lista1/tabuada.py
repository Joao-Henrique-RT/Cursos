num1 = int(input("Digite o numero que irá multiplicar"))
num2 = int(input("Digite quatras vezes o numero irá multiplicar"))

for i in range(num2+1): #PARA SER EXIBIDO ATÉ O NÚMERO QUE FOI INFORMADO
   print(str(num1) + "X" + str(i) + "=" + str(i*num1))

