const express = require('express');
const app = express();
app.use(express.json());

const port = 3000;

app.post('/processar-pagamento', (req, res) => {
    const { valor, pagamentoSucesso } = req.body;
    // Lógica para processar o pagamento
    // ...

    // Simula o sucesso do pagamento
    if (pagamentoSucesso) {
        res.json(true);
    } else {
        res.json(false);
    }
});

app.listen(port, () => {
    console.log(`Payment Gateway listening at http://localhost:${port}`);
});
