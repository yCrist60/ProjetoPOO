
public class Usuario {
	public String nomeUsuario;
	public String senha;
	public String nivelAcesso;
	


	public void criarUsuario( ) {
		System.out.println("Usu�rio criado com sucesso");
	}
	public void logar(String nomeUsuario, String senha) {
		if(this.nomeUsuario != nomeUsuario) {
			System.out.println("Usu�rio n�o encontrado");
		}
		else {
			System.out.println("Bem vindo");
		}
	}
	
	
	
	
}


if (this.nomeUsuario==nomeUsuario && this.senha==senha){
    System.out.println("Bem vindo!");
}
else{
    System.out.println("Usu�rio ou senha incorretas");
}
}