import java.math.BigDecimal;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public void criarPedido(@RequestBody PedidoRequest pedidoRequest) {
        Pedido pedido = new Pedido();
        pedido.setValor(pedidoRequest.getValor());

        Pagamento pagamento = new Pagamento();
        pagamento.setPedido(pedido);
        pagamento.setValor(pedidoRequest.getValor());
        pagamento.setSucesso(pedidoRequest.isPagamentoSucesso());

        pedidoService.criarPedido(pedido, pagamento);
    }
}

class PedidoRequest {
    @SuppressWarnings("unused")
	private BigDecimal valor;
    @SuppressWarnings("unused")
	private boolean pagamentoSucesso;
	public BigDecimal getValor() {
		return null;
	}
	public Object isPagamentoSucesso() {
		return null;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public void setPagamentoSucesso(boolean pagamentoSucesso) {
		this.pagamentoSucesso = pagamentoSucesso;
	}

}
