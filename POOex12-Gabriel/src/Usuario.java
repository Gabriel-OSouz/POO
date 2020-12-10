
public class Usuario extends Endereco
{ 

	private String nome;
	private String cpf;
	private String dataNasc;
	private String estadoCivil;
	private String sexo;
	
	public Usuario(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep) {
		super(rua,num,bairro,estado, cep);
		setNome(nome);
		setCpf(cpf);
		setDataNasc(dataNasc);
		setEstadoCivil(estadoCivil);
		setSexo(sexo);
	}
	
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		if(nome.length() > 0) {
			this.nome = nome;
		} else {
			    System.out.println("Nome inválido, insira um nome válido\n");
			    System.exit(1);
		       }
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		if(cpf.length() > 0) {
			this.cpf = cpf;
		} else {
		     	System.out.println("CPF inválido, insira um cpf válido\n");
		     	System.exit(1);
		       }
		
	}
	
	public String getDataNasc() 
	{
		return dataNasc;
	}
	
	public void setDataNasc(String dataNasc) 
	{
		if (dataNasc.length() > 0) {
			this.dataNasc = dataNasc;
		} else {
				System.out.println("Data inválido, insira uma data válido\n");
		       }
	}
	
	public String getEstadoCivil()
	{
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) 
	{
		if(estadoCivil.length() > 0) {
			this.estadoCivil = estadoCivil;
		}else {
			   System.out.println("Esado Civil inválido inválido, insira um estado civil válido\n");
		       System.exit(1);
		      }
	}
	
	public String getSexo() 
	{
		return sexo;
	}
	
	public void setSexo(String sexo) 
	{
		if(sexo.length() > 0) {
			this.sexo = sexo;
		}else {
			   System.out.println("Nome inválido, insira um nome válido\n");
			   System.exit(1);
		      }
	}
	
	
}
