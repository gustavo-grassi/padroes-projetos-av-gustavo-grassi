import java.util.List;

public abstract class Credito{
    
    private final String modalidade;
    private final String nomeCliente;
    private final List<String> documentos;

    public Credito(
        String modalidade,
        String nomeCliente,
        List<String> documentos    
    ){
            this.modalidade = modalidade;
            this.nomeCliente = nomeCliente;
            this.documentos = documentos;
    }

    public abstract double calcularJuros();

    public abstract List<String> listarDocumentos();

    public abstract String gerarResumo(){
        return String.format(
            """
            Modalidade: %s
            Nome do Cliente: %s
            Juros do Primeiro Mês: R$ %.2f
            """,
            modalidade,
            nomeCliente,
            calcularJuros(),
            String.join(", ", listarDocumentos())
        )
    };

    public String getModalidade(){
        return modalidade;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public List<String> getDocumentos(){
        return listarDocumentos;
    }
}