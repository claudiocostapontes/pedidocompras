import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    // Getters e Setters
}

public enum StatusPedido {
    PENDENTE,
    CONFIRMADO,
    CANCELADO
}
