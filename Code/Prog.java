/* Main, utilizado para testar as classes
* "Usuario.java", "Fotos.java" e "InstaPet.java"
*/

package Code;

public class Prog {
    public static void main(String[] args) {
        InstaPet insta = new InstaPet();

        insta.cadastra_usuario("Igor Barroso Almeida", "igorba867@gmail.com"); // teste 3 pets
        insta.cadastra_usuario("Leandro rodrigues marques", "Leandro@gmail.com"); // teste 2 pets
        insta.cadastra_usuario("João Pedro Neffa", "Neffa@gmail.com"); // teste 3 pets
        insta.cadastra_usuario("Julia Almeida Luna", "Juju@gmail.com"); // teste 1 pet
        insta.cadastra_usuario("Lorena Ricoy", "Loló@gmail.com"); // teste 0 pets

        insta.cadastrar_foto("igorba867@gmail.com", "https://bit.ly/4Dfg24add", "Meu doguinho :p");
        insta.cadastrar_foto("igorba867@gmail.com", "https://bit.ly/52AsdjE21", "Meu gatinhu :p");
        insta.cadastrar_foto("igorba867@gmail.com", "https://bit.ly/jS2kkaiea", "Minha tartaru :p");

        insta.cadastrar_foto("Leandro@gmail.com", "https://bit.ly/31djjE0kE", "Chorro lindo :O");
        insta.cadastrar_foto("Leandro@gmail.com", "https://bit.ly/0221fsdaA", "Miau Miau :O");

        insta.cadastrar_foto("Neffa@gmail.com", "https://bit.ly/92DSJHqza", "Meu dog :)");
        insta.cadastrar_foto("Neffa@gmail.com", "https://bit.ly/alksdjE12", "Meu gato :)");
        insta.cadastrar_foto("Neffa@gmail.com", "https://bit.ly/021sadkEa", "Minha tartruga :)");

        insta.cadastrar_foto("Juju@gmail.com", "https://bit.ly/LLEq0341E", "Meu gatao :3");

        // Testa quantidade de usuarios
        insta.qnt_usuarios();
        // Testa a quantidade de pets de cada um
        insta.qnt_pets("igorba867@gmail.com");
        insta.qnt_pets("Leandro@gmail.com");
        insta.qnt_pets("Neffa@gmail.com");
        insta.qnt_pets("Juju@gmail.com");
        insta.qnt_pets("Loló@gmail.com");
        // Testa listagem de pets
        insta.listar_pets("igorba867@gmail.com");
        insta.listar_pets("Leandro@gmail.com");
        insta.listar_pets("Neffa@gmail.com");
        insta.listar_pets("Juju@gmail.com");
        insta.listar_pets("Loló@gmail.com");

        // Testa listagem de usuarios
        insta.listar_Usuarios();

        insta.alterar_desc("igorba867@gmail.com", 3, "Nova descriçãoo");
        insta.alterar_desc("Juju@gmail.com", 3, "Vai dar erro");
        insta.listar_pets("igorba867@gmail.com");

        insta.alterar_desc("igorba867@gmail.com", 3, "Nova descriçãoo mais nova");
        insta.listar_pets("igorba867@gmail.com");
        insta.listar_pets("Juju@gmail.com");

        insta.alterar_desc("Juju@gmail.com", 1, "Agora da certo");
        insta.listar_pets("Juju@gmail.com");
    }
}