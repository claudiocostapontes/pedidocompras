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
		// TODO Auto-generated method stub
		
	}

	public void setSucesso(Object pagamentoSucesso) {
		// TODO Auto-generated method stub
		
	}

	public void setPedido(Pedido pedido2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isSucesso() {
		// TODO Auto-generated method stub
		return false;
	}

    // Getters e Setters
}
