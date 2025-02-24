# nota1 = int(input("Digite a primeira nota"))
# nota2 = int(input("Digite a segunda nota"))
# frequencia = int(input("Digite a frequencia"))

# if(frequencia >= 75):
#     soma = (nota1 + nota2)  
#     if(soma>6):
#         print("ALuno aprovado com nota:", soma)
        
#     elif(soma>2 and soma<6):        
#         print("Aluno irá para recuperação")
# else:
#     print("Aluno reprovado")

#Verificando se número é par ou impar

# num = int(input("DIgite um número"))

# if(num % 2 == 0):
#     print("Número é par")

# else:
#     print("Número é impar")



# dados = open(r"CIencia_Computacao\Programacao_Computadores\arquivo.txt", "w", encoding='UTF-8')

# dados.write("Ptyhon também tem uns problemas de achar diretórios no windows");

# conteudo = dados

# print(conteudo)

# dados.close()

def criar_arquivo(nome_arquivo, conteudo):
    try:
        with open(nome_arquivo, "w") as arquivo:
            arquivo.write(conteudo)
            print("Arquivo criado com sucesso!")
    except:
        print("Erro ao criar arquivo", Exception)  


criar_arquivo("Escrita.txt", "Escrevi no arquivo")              

