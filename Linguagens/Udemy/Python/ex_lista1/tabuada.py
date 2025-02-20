# num1 = int(input("Digite o numero que irá multiplicar"))
# num2 = int(input("Digite quatras vezes o numero irá multiplicar"))

# for i in range(num2+1): #PARA SER EXIBIDO ATÉ O NÚMERO QUE FOI INFORMADO
#    print(str(num1) + "X" + str(i) + "=" + str(i*num1))



# sexo = ""
# idade = 0
# qtdMulheres = 0
# qtdHomens = 0
# valorIdade = 0

# for i in range(0,3):
#    sexo = input("Digite o sexo M ou H")
#    idade = int(input("Digite a idade"))

#    if (sexo=="M" or "m"):
#       qtdMulheres+=1

#       valorIdade+=idade

# mediaIdade = valorIdade/qtdMulheres

# print("MUlheres: ",qtdMulheres)
# print("Media ", mediaIdade)


dicionario = {"Nome": "João", "Idade": "21", "Email": "joaolindo"}
dicionario.popitem("Idade")
print(dicionario)