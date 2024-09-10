import java.math.BigDecimal;
import java.util.List;

public class PedidoRequest {
	
	 private Long id;
	    private String nomeCliente;
	    private BigDecimal valorTotal;
	    private List<String> itens;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNomeCliente() {
	        return nomeCliente;
	    }

	    public void setNomeCliente(String nomeCliente) {
	        this.nomeCliente = nomeCliente;
	    }

	    public BigDecimal getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(BigDecimal valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public List<String> getItens() {
	        return itens;
	    }

	    public void setItens(List<String> itens) {
	        this.itens = itens;
	    }
	}

