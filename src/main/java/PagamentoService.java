import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    public boolean processarPagamento(Pagamento pagamento) {
       
        return pagamento.isSucesso(); 
    }
}
