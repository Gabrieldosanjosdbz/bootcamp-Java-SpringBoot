package estruturaRepeticao;

public class ExemploForEach {
    public static void main(String[] args)  {

        String[] alunos = {"Gabriel", "Kaynah Lima", "Lucas", "João"};

        // da maneira complicada
        for(int i=0; i < alunos.length; i++){
            System.out.println("Os alunos são: " + alunos[i]);
        }

        // da maneira convencional. Funciona com um for in
        for(String aluno : alunos){
            System.out.println("Os alunos são: " + aluno);
        }
    }
}
