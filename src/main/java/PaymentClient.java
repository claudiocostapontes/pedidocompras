import java.net.http.HttpRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentClient {

    private final RestTemplate restTemplate;

    public PaymentClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean processarPagamento(HttpRequest pedidoRequest) {
        String url = "http://localhost:8080/processar-pagamento"; 
      
        Boolean sucesso = restTemplate.postForObject(url, pedidoRequest, Boolean.class);
        return sucesso != null && sucesso;
    }
}
