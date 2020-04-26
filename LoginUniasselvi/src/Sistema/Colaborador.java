package Sistema;

public class Colaborador extends PessoaFisica implements VerificarLoginSenhaCPF {

	private String senhaColaborador;
	private String setor;
	private String cargo;
	private String cidade;
	private String estado;	
	private float salario;

	public Colaborador() {
		this.senhaColaborador = "";
		this.setor = "";
		this.cargo = "";
		this.salario = 0f;
		this.cidade = "";
		this.estado = "";
	}

	public String getSenhaColaborador() {
		return senhaColaborador;
	}

	public void setSenhaColaborador(String senhaColaborador) {
		this.senhaColaborador = senhaColaborador;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
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
