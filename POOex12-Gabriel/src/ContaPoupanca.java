
public class ContaPoupanca extends Conta
{
	private float rend_mesAtual;
	public ContaPoupanca(String nome, String cpf, String dataNasc, String estadoCivil, String sexo,String rua, int num, String bairro, String estado,String cep,Agencia agencia,String data_de_abertura,int numConta,float saldo_min) {
		super(nome, cpf, dataNasc, estadoCivil, sexo, rua, num, bairro, estado, cep,agencia, data_de_abertura, numConta);
		setRend_mesAtual(rend_mesAtual);
	}
	public float getRend_mesAtual() {
		return rend_mesAtual;
	}
	public void setRend_mesAtual(float rend_mesAtual) {
		if(rend_mesAtual > 0)
			{
			this.rend_mesAtual = rend_mesAtual;
			} else {
				    System.out.println("Rendimento não pode ser negativo\n");
				    System.exit(9);
			       }
	}
	
}
