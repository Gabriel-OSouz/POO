
public class ContaCorrente extends Conta
{

	private float limi_chEsp;
	private float taxa_adm;
	
	public ContaCorrente(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Agencia agencia,String data_de_abertura,int numConta,float taxa_adm,float limi_chEsp) {
		super(nome, cpf, dataNasc, estadoCivil, sexo, rua, num, bairro, estado, cep,agencia, data_de_abertura, numConta);
		setTaxa_adm(taxa_adm);
		setLimi_chEsp(limi_chEsp);
			
	}

	public float getLimi_chEsp() 
	{
		return limi_chEsp;
	}

	public void setLimi_chEsp(float limi_chEsp) 
	{
		if(limi_chEsp > 0) {
			this.limi_chEsp = limi_chEsp;
		}else {
			    System.out.println("Taxa administriva não pode ser negativa.");
			    System.exit(9);
		      }
	}

	public float getTaxa_adm() 
	{
		return taxa_adm;
	}

	public void setTaxa_adm(float taxa_adm) 
	{
		if(taxa_adm > 0) {
			this.taxa_adm = taxa_adm;
		}else {
			    System.out.println("Taxa administriva não pode ser negativa.");
			    System.exit(9);
		      }
			
	}
	
	
	
}
