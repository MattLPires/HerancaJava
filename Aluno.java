public class Aluno extends Pessoa {
	private String semestre;
	private String curso;
	
	public Aluno(String nome, int idade, String end, String semestre, String curso){
		super(nome, idade, end);
		this.semestre = semestre;
		this.curso = curso;
 	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Semestre: " +semestre);
		System.out.println("Curso: " +curso);
	}
}