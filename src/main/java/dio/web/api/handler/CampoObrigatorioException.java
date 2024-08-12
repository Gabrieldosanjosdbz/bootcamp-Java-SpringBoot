package dio.web.api.handler;

// Exceção customizada que herda de BusinessException, usada para indicar que um campo obrigatório está ausente.
public class CampoObrigatorioException extends BusinessException{

    // Construtor que aceita o nome do campo obrigatório e cria uma mensagem de erro formatada.
    public CampoObrigatorioException(String campo) {
        super("O campo %d é obrigatorio. ", campo);
    }
}
