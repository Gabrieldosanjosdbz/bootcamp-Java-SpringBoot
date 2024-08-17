import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;

public class Teste {

	public static void main(String[] args) {
		
		// Singleton
		// TODAS AS "INSTANCIAS" RETORNAM A MESMA COISA!	
		SingletonLazy teste = SingletonLazy.getInstancia();
		System.out.println(teste);
		SingletonLazy teste2 = SingletonLazy.getInstancia();
		System.out.println(teste2);
		
		SingletonEager teste3 = SingletonEager.getInstancia();
		System.out.println(teste3);
		SingletonEager teste4 = SingletonEager.getInstancia();
		System.out.println(teste4);
		
		SingletonLazyHolder teste5 = SingletonLazyHolder.getInstancia();
		System.out.println(teste5);
		SingletonLazyHolder teste6 = SingletonLazyHolder.getInstancia();
		System.out.println(teste6);
		
		// Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		Robo robo = new Robo();
		
		robo.setStrategy(normal);
		robo.movendosse();
		robo.setStrategy(defensivo);
		robo.movendosse();
		robo.setStrategy(agressivo);
		robo.movendosse();
		
		// Facade
		Facade facade = new Facade();
		
		facade.migrarCliente("Gabriel", "04852-012");
	}
}
