algoritmo "Equações 2º Grau"
// Função : programa calcula funções do segundo grau utilizando bhaskara. (Funciona apenas quando ja estão igualadas a zero)

// Autor : João Henrique Ribeiro teixeira
// Data : 25/10/2021
// Seção de Declarações 
var
a,b,c,delta,X1,X2: real
equacao: caractere

inicio
      //Comandos primários
      Escreval (" Diga seu a (x²)")
      leia (a)
      escreval ("Diga seu b (x)")
      leia (b)
      escreval ("Diga seu c (termo idenpendete)")
      leia (c)

      //Aplicação da fórmula
      delta<-((b^2)-4*a*c)
      Escreval ("  Delta é: ",(delta))


      //Verificação de resultados e raízes
      SE (delta>=0) entao
      X1<- ((-b)+ raizq (delta))/(2*a)
      X2<- ((-b)- raizq (delta))/(2*a)
      escreval (" Suas raízes são:",(X1),(X2))
      senao
      Escreval (" Não possui raízes reais ")

      fimse

      




fimalgoritmo
