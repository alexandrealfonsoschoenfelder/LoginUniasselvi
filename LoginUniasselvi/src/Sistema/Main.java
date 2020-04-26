package Sistema;

import java.util.Scanner;

public class Main {

	private static String informarUsuario() {
		System.out.println("Digite o seu código de usuário: ");
		Scanner scan = new Scanner(System.in);
		String usuario = scan.next();
		return usuario;
	}
	
	private static String informarSenha() {
		System.out.println("Digite a sua senha: ");
		Scanner scan = new Scanner(System.in);
		String senha = scan.next();
		return senha;		
	}
	
	private static String informarCPF() {
		System.out.println("Digite o seu CPF: ");
		Scanner scan = new Scanner(System.in);
		String cpf = scan.next();
		return cpf;				
	}
	
	private static void verificarLogin(boolean realizouLogin) {
		if (realizouLogin == true) {
			System.out.println("Acesso realizado com sucesso!");
		}
		else {
			System.out.println("Dados Incorretos! Por favor tente novamente!");
		}
	}
		
	public static void main(String[] args) {
			
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a opção desejada:");
		System.out.println("1 - Acadêmico");
		System.out.println("2 - Acadêmico Sala Virtual");
		System.out.println("3 - Colaborador");
		System.out.println("4 - Empresa");
		System.out.println("5 - Comunidade");
		System.out.println("\nDigite a opção desejada: ");
        opcao = scan.nextInt();
        
        String usuario = "";
        String senha = "";
        String cpf = "";
        boolean realizouLogin = false;
        
        switch(opcao) {
        
        case 1:
        
    	Academico academico01 = new Academico();
    	academico01.setCpf("11111111111");
    	academico01.setCurso("Sistemas da Informação");
    	academico01.setEmail("1029267@aluno.uniasselvi.com.br");
    	academico01.setLogin("1029267");
    	academico01.setSenha("@teste");
    	academico01.setStatus(true);
    	academico01.setTurma("INF000");	
        	
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = academico01.verificarLoginSenha(usuario, senha);
        Main.verificarLogin(realizouLogin);
        break;
        
        case 2:
        AcademicoSalaVirtual academicoSV = new AcademicoSalaVirtual();
        academicoSV.setCpf("11111111111");
        academicoSV.setCurso("Sistemas da Informação");
        academicoSV.setEmail("academicoSV");
        academicoSV.setLogin("1029267");
        academicoSV.setSenha("@teste");
        academicoSV.setStatus(true);
        academicoSV.setTurma("INF000");
        academicoSV.setEmailUniasselvi("1029267@aluno.uniasselvi.com.br");
        academicoSV.setSenhaTeams("@teste");
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = academicoSV.loginTeams(usuario, senha);
        Main.verificarLogin(realizouLogin);        
        
        break;
        	
        case 3:
        Colaborador colaborador = new Colaborador();
        colaborador.setCpf("11111111111");
        colaborador.setCidade("Pomerode");
        colaborador.setCargo("Professor");
        colaborador.setEmail("11111111111@uniasselvi.com.br");
        colaborador.setEstado("SC");
        colaborador.setLogin("1029267");
        colaborador.setNome("Alexandre Alfonso");
        colaborador.setSalario(8500.00f);
        colaborador.setSenha("@AA1029267");
        colaborador.setSenhaColaborador("");
        colaborador.setSetor("Professor");
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        cpf = Main.informarCPF();
        realizouLogin = colaborador.verificarLoginSenhaCPF(usuario, senha, cpf);
        Main.verificarLogin(realizouLogin);
        
        break;
        
        case 4: 
        Empresa empresa = new Empresa();
        empresa.setCnpj("11111111111111");
        empresa.setLogin("XPTO");
        empresa.setEmail("suporte@xpto.com.br");
        empresa.setNome("XPTO Sistemas");
        empresa.setSenha("suporte@xpto");
        
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = empresa.verificarLoginSenha(usuario, senha);
        Main.verificarLogin(realizouLogin);
        break;
        
        case 5:
        Comunidade comunidade = new Comunidade();
        comunidade.setCpf("11111111111");
        comunidade.setEmail("alexandrealfonsoschoenfelder@gmail.com");
        comunidade.setLogin("1029267");
        comunidade.setNome("Alexandre");
        comunidade.setSenha("@minhasenha123");
        
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        cpf = Main.informarCPF();
        realizouLogin = comunidade.verificarLoginSenhaCPF(usuario, senha, cpf);
        Main.verificarLogin(realizouLogin);
        break;
        
        default:
        System.out.println("Informe uma opção válida!");
        }
	}
}