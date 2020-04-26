package Sistema;

public class AcademicoSalaVirtual extends Academico {

	private String emailUniasselvi;
	private String senhaTeams;
	
	public AcademicoSalaVirtual() {
		super();
		this.emailUniasselvi = "";
		this.senhaTeams = "";
	}

	public String getEmailUniasselvi() {
		return emailUniasselvi;
	}

	public void setEmailUniasselvi(String emailUniasselvi) {
		this.emailUniasselvi = emailUniasselvi;
	}

	public String getSenhaTeams() {
		return senhaTeams;
	}

	public void setSenhaTeams(String senhaTeams) {
		this.senhaTeams = senhaTeams;
	}
	
	public boolean loginTeams(String usuario, String senha) {
		usuario = usuario + "@aluno.uniasselvi.com.br";
		
		if ((this.emailUniasselvi.equals(usuario)) && (this.senhaTeams.equals(senha))) {
			return true;
		}
		else {
			return false;	
		}
	}
}