/* @File InstaPet.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe que representa um
 * aplicativo de fotos para pet
 * @Date 26/10/2022
*/

package Code;

public class InstaPet {
    // Atributos
    private Usuario[] users;
    private int qntUsers = 0;

    // Métodos
    public void cadastra_usuario(String nome, String email) {
        // Se não tem nenhum usuario, cadastra um
        if (this.users == null) {
            this.users = new Usuario[1];
        } else {
            Usuario[] aux = new Usuario[this.qntUsers + 2];

            // Copia tudo para o auxiliar
            for (int i = 0; i < this.qntUsers; i++) {
                aux[i] = this.users[i];
            }

            this.users = aux;
        }
        // Cria novo usuario
        Usuario novo = new Usuario(nome, email);
        this.users[this.qntUsers] = novo;

        // Atualiza a quantidade de ususarios
        this.qntUsers++;
    }

    public void cadastrar_foto(String email, String url, String desc) {
        boolean valido = false;

        for (int i = 0; i < this.qntUsers; i++) {
            // Achou o usuario
            if (this.users[i].getEmail() == email) {
                users[i].cadastrar_foto(url, desc);

                valido = true;
                break;
            }
        }

        if (!valido) {
            System.out.println("Email invalido");
        }
    }

    public int qnt_pets(String email) {
        boolean valido = false;
        int qntFts = 0;

        for (int i = 0; i < this.qntUsers; i++) {
            // Achou o usuario
            if (this.users[i].getEmail() == email) {
                qntFts = this.users[i].qntFotos;
                System.out.println("> QUANTIDADE DE PETS: " + this.users[i].getEmail());
                System.out.println(qntFts);

                valido = true;
                break;
            }
        }

        if (!valido) {
            System.out.println("Email invalido");
            qntFts = -1; // Vai retornar "código de erro"
        }
        return qntFts;
    }

    public int qnt_usuarios() {
        System.out.println("> QUANTIDADE DE USUARIOS: " + this.qntUsers);
        return this.qntUsers;
    }

    public Fotos[] listar_pets(String email) {
        boolean valido = false;
        Fotos[] ft = null;

        for (int i = 0; i < this.qntUsers; i++) {
            // Achou o usuario
            if (this.users[i].getEmail() == email) {
                System.out.println("> LISTAGEM DE PETS: " + email);
                System.out.println();
                users[i].printar_fts();

                valido = true;
                break;
            }
        }

        if (!valido) {
            System.out.println("Email invalido");
        }

        // Retorna as fotos do usuario
        return ft;
    }

    public Usuario[] listar_Usuarios() {
        System.out.println("> LISTAGEM DE USUÁRIOS");
        System.out.println("");

        // Lista os usuarios cadastrados
        for (int i = 0; i < this.qntUsers; i++) {
            this.users[i].printar_info();
        }
        System.out.println("");

        // Retorna a lista de usuario caso necessario
        return this.users;
    }

    public void alterar_desc(String email, int n, String desc) {
        boolean valido = false;

        for (int i = 0; i < this.qntUsers; i++) {
            // Achou o usuario
            if (this.users[i].getEmail() == email) {
                users[i].alterar_desc(n, desc);

                valido = true;
                break;
            }
        }

        if (!valido) {
            System.out.println("Email invalido");
        }
    }
}