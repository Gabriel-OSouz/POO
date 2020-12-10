
public class Funcionario extends Usuario
{

	static float salario_basic = 1000;
	private String cargo;
	private String data_admissao;
	
	public Funcionario(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,String cargo, String data_admissao) {
	super(nome,cpf,dataNasc,estadoCivil,sexo,rua,num,bairro,estado,cep);	
		setCargo(cargo);
		setData_admissao(data_admissao);
	}
	
	public String getCargo() 
	{
		return cargo;
	}



	public void setCargo(String cargo) 
	{
		if(cargo.length() > 0) {
			this.cargo = cargo;
		}else {
				System.out.println("Data de admissão inválida, insira uma data válida\n");
				System.exit(2);
		      }
	}



	public String getData_admissao() 
	{
		return data_admissao;
	}



	public void setData_admissao(String data_admissao) 
	{
		if(data_admissao.length() > 0) {
			this.data_admissao = data_admissao;
		}else {
				System.out.println("Data de admissão inválida, insira uma data válida\n");
				System.exit(2);
		      }
	}



	public static float getSalario_basic() 
	{
		return salario_basic;
	}
	
	public float calc_salarioESp() {
		return salario_basic;
	}
	
	
}
