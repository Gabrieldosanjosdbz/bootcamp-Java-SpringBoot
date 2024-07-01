package estruturaExcepcionais;

public class AFormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            formatarCep("2323232323232323");
        } catch (CepInvalidoException e) {
            // executará a mensagem do tratamento de erro
            e.printStackTrace();;
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException { //definindo que a função tem um tratamento de erro CepInvalidoException
        if (cep.length() != 8)
            // excecutará a função do construtor
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
