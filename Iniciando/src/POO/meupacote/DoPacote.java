package POO.meupacote;

public class DoPacote {
    public static void main(String[] args) {
        DeDentro objeto = new DeDentro();
        objeto.A = 10; //OK: o atributo A foi declarado como public
        //objeto.B = 7.0; //ERRO: o atributo B foi declarado como private
        objeto.C = 'R'; //OK: o atributo C foi declarado como protected
        objeto.D = "Teste de acesso"; //OK: o atributo D tem acesso padrão

        objeto.atribuirValores();
        objeto.imprimirAtributos();
    }
}