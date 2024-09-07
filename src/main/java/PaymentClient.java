import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentClient {

    private final RestTemplate restTemplate;

    public PaymentClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean processarPagamento(PedidoRequest pedidoRequest) {
        String url = "http://localhost:3000/processar-pagamento"; // URL do microsserviço de pagamento
        // Envia a solicitação para o microsserviço de pagamento e obtém a resposta
        Boolean sucesso = restTemplate.postForObject(url, pedidoRequest, Boolean.class);
        return sucesso != null && sucesso;
    }
}
