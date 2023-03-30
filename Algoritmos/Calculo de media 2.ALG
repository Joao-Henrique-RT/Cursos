Algoritmo "Média com aprovação automatica"

// Descrição   : Programa atualizado para calculo de médias
// Autor(a)    : João henrique Ribeiro Teixeira
// Data atual  : 18/11/2021
Var
// Seção de Declarações das variáveis 

media: real
nota1,nota2,nota3,nota4:real


Inicio


Escreval ("Escreva as suas notas")
leia (nota1,nota2,nota3,nota4)
media<-(nota1+nota2+nota3+nota4)/4
se media>=7 entao
escreval ("Parabéns, você foi aprovado!")
Escreval ("Sua média é: ", media)
senao
escreval ("Infelizmente você foi reprovado")
Escreval ("Sua média é: ", media)
Escreval ("Para ser aprovado você precisa ter uma nota igual ou superior a 7")
fimse
Fimalgoritmo