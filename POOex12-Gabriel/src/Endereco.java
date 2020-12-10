public class Endereco
{

	private String rua;
	private int num;
	private String bairro;
	private String estado;
	private String cep;
	
	public Endereco(String rua, int num, String bairro, String estado,String cep) {
		
		setRua(rua);
		setNum(num);
		setBairro(bairro);
		setEstado(estado);
		setCep(cep);
		
	}
	
	public String getRua() 
	{
		return rua;
	}
	
	public void setRua(String rua)
	{
		
		if(rua.length() > 0) {
			this.rua = rua;
		} else {
			    System.out.println("Rua inválido, insira uma rua válido\n");
			    System.exit(0);
		       }
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void setNum(int num)
	{
		if(num > 0) {
			this.num = num;
		}else {
				System.out.println("Nome inválido, insira um nome válido\n");
				System.exit(0);
		      }
	}
	
	public String getBairro()
	{
		return bairro;
	}
	
	public void setBairro(String bairro)
	{
		if(bairro.length() > 0) {
			this.bairro = bairro;
		}else {
			   System.out.println("Nome inválido, insira um nome válido\n");
			   System.exit(0);
		      }
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		if(estado.length() > 0) {
			this.estado = estado;
		}else {
			   System.out.println("Nome inválido, insira um nome válido\n");
			   System.exit(0);
			  }
	}
	
	public String getCep()
	{
		return cep;
	}
	
	public void setCep(String cep)
	{
		if(cep.length() > 0) {
			this.cep = cep;
		}else {
			   System.out.println("Nome inválido, insira um nome válido\n");
			   System.exit(0);
	       	  }
	}
	
}
