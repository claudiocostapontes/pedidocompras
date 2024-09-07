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
    private BigDecimal valor;
    private boolean pagamentoSucesso;

    // Getters e Setters
}
