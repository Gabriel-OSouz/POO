
public class Conta extends Cliente
{

	private int numConta;
	private float saldo;
	private String data_de_abertura;
	Cliente cliente;
	
	public Conta(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep, Conta conta,Agencia agencia,String data_de_abertura,int numConta)
	{
		super(nome, cpf, dataNasc, estadoCivil, sexo, rua, num,bairro,estado,cep,conta,agencia);
		setData_de_abertura(data_de_abertura);
		setNumConta(numConta);
		setSaldo(0);
	}
	
	public Conta(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Agencia agencia,String data_de_abertura,int numConta)
	{
		super(nome, cpf, dataNasc, estadoCivil, sexo, rua, num,bairro,estado,cep,agencia);
		setData_de_abertura(data_de_abertura);
		setNumConta(numConta);
		setSaldo(0);
	}
	
	
	
	public int getNumConta()
	{
		return numConta;
	}
	
	public void setNumConta(int numConta)
	{
		if(numConta > 0) {
			this.numConta = numConta;
		}else {
			   System.out.println("Número da conta não pode ser negativo\n");
			   System.exit(5);
		      }
	}
	
	public float getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(float saldo) 
	{
		if(saldo > 0) {
			this.saldo = this.saldo + saldo;
		}else {
			   System.out.println("Saldo inválido\n");
			   System.exit(5);
		      }
	}
	
	public String getData_de_abertura() 
	{
		return data_de_abertura;
	}
	
	public void setData_de_abertura(String data_de_abertura) 
	{
		if(data_de_abertura.length() > 0){
			this.data_de_abertura = data_de_abertura;
		}else {
				System.out.println("Saldo inválido\n");
				System.exit(5);
		      }
	}
	
   public void saque_trans(float valor)
   {
	   if(valor > 0) {
		   this.saldo = this.saldo - valor;
	   } else {
		       System.out.println("Saque ou Tranferência negado...");
		       System.exit(5);
	          }
   }
}
