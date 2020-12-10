import java.util.Random;
public class Transacao
{
	private String data_transacao;
	Agencia agencia_transacao;
	protected float valor;
	private int identificador;
	
	public Transacao(Conta conta,Agencia agencia,String data_transacao,Agencia agencia_transacao,float valor) {
			 setData_transacao(data_transacao);
			 setAgencia_transacao(agencia_transacao);
			 setValor(valor);
	}
	
	public String getData_transacao() 
	{
		return data_transacao;
	}
	
	public void setData_transacao(String data_transacao)
	{
		this.data_transacao = data_transacao;
	}
	
	public Agencia getAgencia_transacao()
	{
		return agencia_transacao;
	}
	
	public void setAgencia_transacao(Agencia agencia_transacao) 
	{
		this.agencia_transacao = agencia_transacao;
	}
	
	public float getValor() 
	{
		return valor;
	}
	
	public void setValor(float valor) 
	{
		this.valor = valor;
	}
	
	public int getIdentificador()
	{
		return identificador;
	}
	
	public void setIdentificador()
	{
		Random gerador = new Random();
		
		this.identificador = gerador.nextInt();
	
	}
	
	
	
}
