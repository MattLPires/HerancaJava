public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(String nome, int idade, String end, double salario){
		super(nome, idade, end);
		this.salario = salario;
	}
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Salario R$: " +this.salario);
	}
}