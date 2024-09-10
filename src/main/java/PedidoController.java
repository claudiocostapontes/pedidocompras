import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private static final String Object = null;
	private final PedidoService pedidoService;
	private char[] isPagamentoSucesso;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public <PedidoRequest> String criarPedido(@RequestBody PedidoRequest pedidoRequest, char[] getNomeCliente) {
        Pedido pedido = new Pedido();
        pedido.setId(((Pedido) pedidoRequest).getId());
        pedido.setValor(((Pedido) pedidoRequest).getValor());

        	System.out.println(getNomeCliente);
        
        Pagamento pagamento = new Pagamento();
        pagamento.setPedido(pedido);
        pagamento.setValor(((Pedido) pedidoRequest).getValor());
        pagamento.setSucesso ((Object));
        
        System.out.println(isPagamentoSucesso);

       
        boolean pedidoCriado = pedidoService.criarPedido(pedido, pagamento);

        if (pedidoCriado) {
            return "Pedido criado com sucesso!";
        } else {
            return "Falha ao criar o pedido.";
        }
    }
}
