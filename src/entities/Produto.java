package entities;

public class Produto {
	
	private String nome;
	private Long id;
	private Double preco;
	
	public Produto() {
	}

	public Produto(String nome, Long id, Double preco) {
		super();
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", id=" + id + ", preco=" + preco + "]";
	}
	
	

}
