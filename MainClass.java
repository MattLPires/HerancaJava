public class MainClass{
	public static void main(String args []){
		Pessoa p;
		Pessoa p2;
		Pessoa p3;
		Pessoa p4;
		Pessoa p5;
		
		p = new Pessoa("Jose", 42, "Av.Mathias de Camargo, 29");
		p2 = new Funcionario ("Luana", 18, "R.Wanda, 29", 1200.0);
		p3 = new Professor ("Andrea Machion", 38, "FATEC Carapicuiba", 10000.0, "Estrutura de Dados");
		p4 = new FuncAdm ("Gaspar", 42, "FATEC Carapicuiba", 8000.0, "ADM", "Recepcionista");
		p5 = new Aluno ("Matheus", 22, "R.Palmas, 29", "3 Semestre", "ADS");
		
		p.exibirDados();
		p2.exibirDados();
		p3.exibirDados();
		p4.exibirDados();
		p5.exibirDados();
	}
}