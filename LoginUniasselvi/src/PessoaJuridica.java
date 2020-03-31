
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	PessoaJuridica() {
		super();
		this.cnpj = "";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
