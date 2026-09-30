import java.util.List;

public class CreditoImobiliario extends Credito {
    
    private final double valorSolicitado;

    public CreditoImobiliario(
        String modalidade,
        String nomeCliente,
        List<String> documentos,
        double valorSolicitado  
    ){
            super(modalidade, nomeCliente, documentos);

            this.valorSolicitado = valorSolicitado;
    }

    @Override
    public double calcularJuros(){
        return valorSolicitado * 0.008
    }

    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Matrícula do Imóvel",
            "Comprovante de Renda"
        );
    }
}