nota1 = int(input("Digite a primeira nota"))
nota2 = int(input("Digite a segunda nota"))
frequencia = int(input("Digite a frequencia"))

if(frequencia >= 75):
    soma = (nota1 + nota2)  
    if(soma>6):
        print("ALuno aprovado com nota:", soma)
        
    elif(soma>2 and soma<6):        
        print("Aluno irá para recuperação")
else:
    print("Aluno reprovado")