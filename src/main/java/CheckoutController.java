import java.net.http.HttpRequest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    private final PaymentClient paymentClient;

    public CheckoutController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @PostMapping
    public String criarPedido(@RequestBody HttpRequest pedidoRequest) {
      
     
        boolean pagamentoSucesso = paymentClient.processarPagamento(pedidoRequest);

        if (pagamentoSucesso) {
            return "Pedido confirmado";
        } else {
            return "Falha no pagamento";
        }
    }
}
