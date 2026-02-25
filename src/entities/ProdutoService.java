package entities;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
	
	private List<Produto> prod = new ArrayList<>();
	
	public void cadastrar(String nome, Long id, Double preco) {
		Produto produto = new Produto(nome, id, preco);
		prod.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}
	
	public void listar() {
		if (prod.isEmpty()) {
			System.out.println("Nenhum produto cadastrado");
			return;
		}
		for (Produto p : prod) {
			System.out.println(p);
		}
	}
	
	public Produto buscarPorId(Long id) {
		for (Produto p : prod) {
			if (p.getId().equals(id)) {
				return p;
		  	}
	      }
		return null;
     	}
	
	public void atualizar(String nome, Long id, Double preco) {
		Produto produto = buscarPorId(id);
		if (produto != null) {
			produto.setNome(nome);
			produto.setPreco(preco);
			System.out.println("Produto atualizado com sucesso!");
		}
		else {
			System.out.println("Produto não encontrado.");
		}
	}
	
}


