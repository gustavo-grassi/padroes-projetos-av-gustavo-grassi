import java.util.List;

public class CreditoPessoal extends Credito {
    
    private final double valorSolicitado;

    public CreditoPessoal(
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
        return valorSolicitado * 0.035; 
    }
    
    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Documento de Identidade",
            "Comprovante de Renda"
        );
    }
}