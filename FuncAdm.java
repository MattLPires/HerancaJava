public class FuncAdm extends Funcionario {
	private String setor;
	private String funcao;
	
	public FuncAdm(String nome, int idade, String end, double salario, String setor, String funcao){
		super(nome, idade, end, salario);
		this.setor = setor;
		this.funcao = funcao;
	}
	
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Setor: " +setor);
		System.out.println("Funcao: " +funcao);
	}
}