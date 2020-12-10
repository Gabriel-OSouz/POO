
public class Gerente extends Funcionario
{
 
	private String dataIngresso;
	private boolean cursobasico;
	private float bonificacao;
	Agencia agencia;
	
	public Gerente(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,String cargo, String data_admissao,String dataIngresso,boolean cursobasico,float bonificacao, Agencia agencia )
	{
		super(nome, cpf, dataNasc, estadoCivil, sexo,rua, num, bairro, estado, cep,cargo, data_admissao);
	    
		setDataIngresso(dataIngresso);
		setCursobasico(cursobasico);
		setBonificacao(bonificacao);
	}
	
	
	public String getDataIngresso() 
	{
		return dataIngresso;
	}
	
	public void setDataIngresso(String dataIngresso)
	{
		if(dataIngresso.length() > 0) {
			this.dataIngresso = dataIngresso;
		}else {
			  System.out.println("Data inválida, digite uma data valida\n");
			  System.exit(3);
		      }
	}
	
	public boolean isCursobasico() 
	{
		return cursobasico;
	}
	
	public void setCursobasico(boolean cursobasico) 
	{
		if(cursobasico == true || cursobasico == false){
			this.cursobasico = cursobasico;
		}else {
			  System.out.println("Boolean inválido digite 'true' ou 'false'\n");
			  System.exit(3);
		      }
	}
	
	public float getBonificacao()
	{
		return bonificacao;
	} 
	
	public void setBonificacao(float bonificacao)
	{
		
		if(bonificacao > 0){
			this.bonificacao = bonificacao;
		}else {
			  System.out.println("Bonificação não pode ser nagativa'\n");
			  System.exit(3);
		      }
	}


	public Agencia getE() {
		return agencia;
	}


	public void setE(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	public float calc_salarioESp(int nroAnosEmpresa)
	{
		return (super.getSalario_basic() + (bonificacao*nroAnosEmpresa));
	}
	
}
