package dio.web.api.handler;

// Exceção customizada que herda de RuntimeException.
// Esta classe é usada para indicar erros específicos de negócio na aplicação.
public class BusinessException extends RuntimeException {

    // Construtor que aceita uma mensagem de erro simples.
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    // Construtor que aceita uma mensagem de erro e parâmetros adicionais para formatação.
    // varargs ... (abreviação de "variable arguments"), que permite que um método receba um número variável de argumentos do mesmo tipo.
    public BusinessException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
