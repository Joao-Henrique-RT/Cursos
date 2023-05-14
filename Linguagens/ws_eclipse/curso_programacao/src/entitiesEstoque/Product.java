package entitiesEstoque;

public class Product {
	
		public String name;
		public double price;
		public int quantity;
		
	public double totalValueInStock() {
	return	price * quantity;
	}
	
	public  void addProducts(int quantity) {
		//M�todo para adicionar itens no estoque
		
		//This � uma palavra reservado para auto refer�ncia para o objeto
		//neste caso estamos dizendo que Queremos acessar o atributo quantity
		//da classe e n�o o parametro que estamos chamando na fun��o
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		//M�todo para remover itens do estoque
		
		this.quantity -= quantity;
	}
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+", " 
				+ quantity
				+"units, Total: $"
				+String.format("%.2f", totalValueInStock());
	}
	
	
		
		
}
