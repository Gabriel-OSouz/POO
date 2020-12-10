
public class ContaSalario extends Conta
{
	private float saldo_min;

	
		public ContaSalario(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Agencia agencia,String data_de_abertura,int numConta,float saldo_min) {
			super(nome, cpf, dataNasc, estadoCivil, sexo, rua, num, bairro, estado, cep,agencia, data_de_abertura, numConta);
		    setSaldo_min(saldo_min);
		}
	
	public float getSaldo_min() {
		return saldo_min;
	}

	public void setSaldo_min(float saldo_min) {
		
		if(saldo_min > 0) {
			this.saldo_min = saldo_min;
		}else {
			   System.out.println("Saldo mínino não pode ser negativo");
			   System.exit(9);
		      }
	}
	
	

}
