Algoritmo "M�dia com aprova��o automatica"

// Descri��o   : Programa atualizado para calculo de m�dias
// Autor(a)    : Jo�o henrique Ribeiro Teixeira
// Data atual  : 18/11/2021
Var
// Se��o de Declara��es das vari�veis 

media: real
nota1,nota2,nota3,nota4:real


Inicio


Escreval ("Escreva as suas notas")
leia (nota1,nota2,nota3,nota4)
media<-(nota1+nota2+nota3+nota4)/4
se media>=7 entao
escreval ("Parab�ns, voc� foi aprovado!")
Escreval ("Sua m�dia �: ", media)
senao
escreval ("Infelizmente voc� foi reprovado")
Escreval ("Sua m�dia �: ", media)
Escreval ("Para ser aprovado voc� precisa ter uma nota igual ou superior a 7")
fimse
Fimalgoritmo