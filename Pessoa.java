public class Pessoa {
	private String nome;
	private int idade;
	private String end;
	
	public Pessoa(String nome, int idade, String end){
		this.nome = nome;
		this.idade = idade;
		this.end = end;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: " +this.idade);
		System.out.println("Endereco: " +this.end);
	}
}