import java.util.List;

public class CreditoConsignado extends Credito {
    
    private final double valorSolicitado;

    public CreditoConsignado(
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
        return valorSolicitado * 0.018
    }

    @Override
    public List<String> listarDocumentos(){
        return List.of(
            "Contra Cheque",
            "Extrato de Benefício"
        );
    }
}