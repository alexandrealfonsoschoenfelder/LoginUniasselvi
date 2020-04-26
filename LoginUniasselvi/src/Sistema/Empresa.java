package Sistema;

public class Empresa extends PessoaJuridica implements VerificarLoginSenha{

	private float percentualDesconto;
	private int numeroAlunosConv;
	
	public Empresa() {
		super();
		this.percentualDesconto = 0f;
		this.numeroAlunosConv = 0;
	}

	public float getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(float percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public int getNumeroAlunosConv() {
		return numeroAlunosConv;
	}

	public void setNumeroAlunosConv(int numeroAlunosConv) {
		this.numeroAlunosConv = numeroAlunosConv;
	}

	@Override
	public boolean verificarLoginSenha(String usuario, String senha) {
		if ((senha.equals(this.getSenha())) && (usuario.equals(this.getLogin()))) {
			return true;
		}
		else {
			return false;	
		}
	}
}