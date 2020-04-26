package Sistema;

public class Comunidade extends PessoaFisica implements VerificarLoginSenhaCPF {

	private boolean acessoCursosLivres;
	private boolean naoPossuiMensalidade;
	
	public Comunidade() {
		super();
		this.acessoCursosLivres = false;
		this.naoPossuiMensalidade = false;
	}

	public boolean isAcessoCursosLivres() {
		return acessoCursosLivres;
	}

	public void setAcessoCursosLivres(boolean acessoCursosLivres) {
		this.acessoCursosLivres = acessoCursosLivres;
	}

	public boolean isNaoPossuiMensalidade() {
		return naoPossuiMensalidade;
	}

	public void setNaoPossuiMensalidade(boolean naoPossuiMensalidade) {
		this.naoPossuiMensalidade = naoPossuiMensalidade;
	}

	@Override
	public boolean verificarLoginSenhaCPF(String usuario, String senha, String cpf) {
		if(((usuario.equals(this.getLogin())) && (senha.equals(this.getSenha())) &&
		  (cpf.equals(this.getCpf())))){
			return true;
		}
		else {
			return false;	
		}
	}
}