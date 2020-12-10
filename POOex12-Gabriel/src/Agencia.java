
public class Agencia 
{

	private String nomeAgencia;
	private int numAgencia;
	
	public Agencia(String nomeAgencia,int numAgencia) {
		setNomeAgencia(nomeAgencia);
		setNumAgencia(numAgencia);
	}
	
	public String getNomeAgencia() 
	{
		return nomeAgencia;
	}
	
	public void setNomeAgencia(String nomeAgencia) 
	{
		if(nomeAgencia.length() > 0) {
			this.nomeAgencia = nomeAgencia;
		}else {
				System.out.println("Nome da agencia inválida, insira um nome válido\n");
				System.exit(4);
		      }
	}
	
	public int getNumAgencia()
	{
		return numAgencia;
	}
	
	public void setNumAgencia(int numAgencia) 
	{
		if(numAgencia > 0) {
			this.numAgencia = numAgencia;
		}else {
				System.out.println("Numero da agencia não pode ser negativo\n");
				System.exit(4);
		      }
	}

	
	
}
