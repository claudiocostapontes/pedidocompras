import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PagamentoService pagamentoService;

    public PedidoService(PedidoRepository pedidoRepository, PagamentoService pagamentoService) {
        this.pedidoRepository = pedidoRepository;
        this.pagamentoService = pagamentoService;
    }

    @Transactional
    public void criarPedido(Pedido pedido, Pagamento pagamento) {
        pedido.setStatus(StatusPedido.PENDENTE);
        pedidoRepository.save(pedido);

        boolean pagamentoBemSucedido = pagamentoService.processarPagamento(pagamento);
        
        if (!pagamentoBemSucedido) {
            pedido.setStatus(StatusPedido.CANCELADO);
            pedidoRepository.save(pedido);
        } else {
            pedido.setStatus(StatusPedido.CONFIRMADO);
            pedidoRepository.save(pedido);
        }
    }
}
