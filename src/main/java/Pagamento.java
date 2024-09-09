import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private boolean sucesso;

	public void setValor(BigDecimal valor2) {
		
	}

	public void setSucesso(Object pagamentoSucesso) {
		
	}

	public void setPedido(Pedido pedido2) {
		
	}

	public boolean isSucesso() {
		return false;
	}

}
