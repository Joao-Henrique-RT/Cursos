package entities;
/*Classe publica triangle, dentro da claase declaramos os membros
da classe, adicionamos os atributos a,b e c. 

- S�o public e por isso podem ser acessadas por outros arquivos.

- Criamos dentro do pacote de entidades poruqi eo trinagulo � uma entidade do nosso 
Projeto/programa 

- Para pegarmos estes parametros precisamos instanciar a classe em
nosso programa

ex; Triangle x, y;
x = new Triangle();
y = new Triangle ();


*/
public class Triangle {
		public double a; //Atributo!
		public double b; //atributo!
		public double c; //atributo!
		
		public double area() {
			double p = (a + b + c)/2.0;
			double area = Math.sqrt(p*(p - a )* (p - b) * (p  - c));
			return area;
		}
		
		
}

/*
 * CLASSE � A DEFINI�A� DO TIPO
 * 
 * OBJETOS S�O INSTANCIAS DA CLASSE;
 * 
 * 
 * 
 * 
 * 
 * */
