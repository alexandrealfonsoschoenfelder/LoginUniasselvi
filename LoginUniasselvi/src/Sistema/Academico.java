package Sistema;

public class Academico extends PessoaFisica implements VerificarLoginSenha {

	private boolean status;
	private String curso;
	private String turma;
	
	public Academico() {
		super();
		this.status = false;
		this.curso = "";
		this.turma = "";
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
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
