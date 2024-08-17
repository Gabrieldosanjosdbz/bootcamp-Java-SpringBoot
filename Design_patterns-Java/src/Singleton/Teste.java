package Singleton;

public class Teste {
	public static void main(String[] args) {
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
	}
	
	// TODAS AS "INSTANCIAS" RETORNAM A MESMA COISA!	
}
