import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    public boolean processarPagamento(Pagamento pagamento) {
        // Simular a lógica de pagamento
        return pagamento.isSucesso(); // Simulação simples
    }
}
