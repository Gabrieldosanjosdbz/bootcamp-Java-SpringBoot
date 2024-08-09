package dio.Springboot;

import org.springframework.stereotype.Component;

//Indica que esta classe é um componente gerenciado pelo Spring. O Spring a detecta e cria um bean para ela.
@Component
public class Calculadora {

    public int somar(int numero1, int numero2){
        return numero1 + numero2;
    }
}
