
public class Cliente extends Usuario
{
 
	private String tipoConta;
	Agencia agencia;
	Conta conta;
	
	public Cliente(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Conta conta,Agencia agencia) {
		super(nome,cpf,dataNasc,estadoCivil,sexo,rua,num,bairro,estado,cep);
		
		setTipoConta(tipoConta);
		setAgencia(agencia);
		setConta(conta);
	}
	
	public Cliente(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Agencia agencia) {
		super(nome,cpf,dataNasc,estadoCivil,sexo,rua,num,bairro,estado,cep);
		
		setTipoConta(tipoConta);
		setAgencia(agencia);
	}

	
	public String getTipoConta() 
	{
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta)
	{
		this.tipoConta = tipoConta;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
    
	
	
	
}
