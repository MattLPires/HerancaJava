public class Professor extends Funcionario {
	private String disciplina;
	
	public Professor(String nome, int idade, String end, double salario, String disciplina) {
		super(nome, idade, end, salario);
		this.disciplina = disciplina;
	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Disciplina: " +this.disciplina);
	}
}