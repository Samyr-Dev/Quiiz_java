
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Cabeçalho
        System.out.println("-----------------------------------------");

        //Faculdade
        System.out.println("Unifan - Centro Universitário Alfredo Nasser.");

        //Nome_aluno =
        System.out.println("Aluno: Samyr Silva Tertuliano Deusdará.");

        //Nome_professor
        System.out.println("Professor: Brenno.");
        System.out.println("-----------------------------------------");
        //Boas_vindas
        System.out.println("");
        System.out.println("Olá, Seja bem-vindo(a). Você irá responder 15 questões de múltipla escolha acerca da arte. Essas questões abrangem diferentes formas de arte, desde literatura clássica até cinema e escultura. Diverta-se ;)");

//
        Questao q1 = new Questao();
        q1.pergunta = "1- Qual é o nome da famosa pintura de Leonardo da Vinci que retrata uma mulher com um sorriso enigmático?";
        q1.opcaoA = "A) A Noite Estrelada";
        q1.opcaoB = "B) A Última Ceia";
        q1.opcaoC = "C) Mona Lisa";
        q1.opcaoD = "D) O Nascimento de Vênus";
        q1.opcaoE = "E) O Grito";
        q1.correta = "C";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

        //
        Questao q2 = new Questao();
        q2.pergunta = "2-Quem dirigiu o filme 'O Poderoso Chefão', considerado um clássico do cinema?";
        q2.opcaoA = "A) Martin Scorsese";
        q2.opcaoB = "B) Steven Spielberg";
        q2.opcaoC = "C) Stanley Kubrick";
        q2.opcaoD = "D) Quentin Tarantino";
        q2.opcaoE = "E) Francis Ford Coppola";
        q2.correta = "E";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

    }
}