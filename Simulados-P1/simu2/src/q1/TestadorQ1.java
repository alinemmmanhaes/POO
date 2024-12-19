package q1;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		Empresa ambev = new Empresa();
		Departamento vendas = new Departamento();
		ambev.adicionaDepartamento(vendas);

		Setor rh = new Setor();
		Setor ti = new Setor();
		vendas.adicionaSetor(rh);
		vendas.adicionaSetor(ti);

		Funcionario aline = new Funcionario(1000.50, ti);
		Funcionario tales = new Funcionario(302.99, rh);
		Funcionario malu = new Funcionario(2067.2, rh);
		ti.adicionaFuncionario(aline);
		rh.adicionaFuncionario(tales);
		rh.adicionaFuncionario(malu);

		System.out.println(rh.getSalarioMedio());
		System.out.println(ti.getSalarioMedio());
		System.out.println(vendas.getSalarioMedio());

		malu.alteraSetor(ti);
		
		System.out.println(rh.getSalarioMedio());
		System.out.println(ti.getSalarioMedio());
		System.out.println(vendas.getSalarioMedio());
	}

}
