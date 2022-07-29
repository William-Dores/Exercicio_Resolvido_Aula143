package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ProdutosUsado extends Produto {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeFabricacao;
	
	public ProdutosUsado() {
		
	}
	
	public ProdutosUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	

	@Override
	public String toString() {
		return getNome() + " (used) $ "
				+String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+sdf.format(dataDeFabricacao)+")";
	}
	
	
	
}
