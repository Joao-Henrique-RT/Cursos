algoritmo "Equa��es 2� Grau"
// Fun��o : programa calcula fun��es do segundo grau utilizando bhaskara. (Funciona apenas quando ja est�o igualadas a zero)

// Autor : Jo�o Henrique Ribeiro teixeira
// Data : 25/10/2021
// Se��o de Declara��es 
var
a,b,c,delta,X1,X2: real
equacao: caractere

inicio
      //Comandos prim�rios
      Escreval (" Diga seu a (x�)")
      leia (a)
      escreval ("Diga seu b (x)")
      leia (b)
      escreval ("Diga seu c (termo idenpendete)")
      leia (c)

      //Aplica��o da f�rmula
      delta<-((b^2)-4*a*c)
      Escreval ("  Delta �: ",(delta))


      //Verifica��o de resultados e ra�zes
      SE (delta>=0) entao
      X1<- ((-b)+ raizq (delta))/(2*a)
      X2<- ((-b)- raizq (delta))/(2*a)
      escreval (" Suas ra�zes s�o:",(X1),(X2))
      senao
      Escreval (" N�o possui ra�zes reais ")

      fimse

      




fimalgoritmo
