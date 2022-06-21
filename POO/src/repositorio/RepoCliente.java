package repositorio;

import java.util.ArrayList;
import java.util.List;

import classes.Cliente;

public class RepoCliente {

	/* Vamos cadastrar os clientes em uma lista de dados.
	 * Esta lista guardará os dados em mémoria.
	 * Todo novo cliente será inserido nesta lista.
	 * Utilizaremos o comando list e a implementação será feita
	 * com comando Arraylist. Ambos devem ser importados
	 */
	List<Cliente> lista = new ArrayList<Cliente>();
	
	
	//Métodos para cadastrar, listar, atualizar e deletar
	public void  cadastrar(Cliente cliente) {

		//Adicionar novos clientes e a lista
		lista.add(cliente);
		System.out.println("Cliente cadastrado");
	}
	public void listar() {
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i).nome+"-"+lista.get(i).email+"-"+lista.get(i).cpf);
		}
		
		
	}
	public void atualizar(Cliente cliente) {
		
		for (int i = 0 ; i < lista.size() ; i++) {
			if(lista.get(i).nome.equals(cliente.nome)) {
				lista.get(i).nome = cliente.nome;
				lista.get(i).email = cliente.email;
				lista.get(i).cpf = cliente.cpf;
				System.out.println("Cliente atualizdo com sucesso");
				break;// Força a saída do laço for
			}
		}
	}
	
	public void deletar(String nome) {
		for (int i = 0 ; i < lista.size(); i++) {
			if (lista.get(i).nome.equals(nome)) {
				lista.remove(i);
				System.out.println ("Cliente apagado com sucesso");
				break; // Força a saída do laço for
			}
		}
	}

}
