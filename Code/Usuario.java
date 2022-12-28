/* @File Usuario.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe de usuario
 * para o aplicativo "InstaPet"
 * @Date 26/10/2022
*/

package Code;

public class Usuario {
    // Atributos
    private String nome;
    private String email;
    public Fotos[] fts;
    public int qntFotos;

    // Getters
    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Construtores
    Usuario() {
    }

    Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Métodos
    public void printar_info() {
        System.out.println(this.nome + " - " + email);
    }

    public void cadastrar_foto(String url, String desc) {
        // Se não tem nenhuma foto, cadastra uma
        if (this.fts == null) {
            this.fts = new Fotos[1];
        } else {
            Fotos[] aux = new Fotos[this.qntFotos + 2];

            // Copia tudo para o auxiliar
            for (int i = 0; i < this.qntFotos; i++) {
                aux[i] = this.fts[i];
            }

            this.fts = aux;
        }
        // Cria nova foto
        Fotos novo = new Fotos(url, desc);
        this.fts[this.qntFotos] = novo;

        // Atualiza a quantidade de fotos
        this.qntFotos++;
    }

    public void alterar_desc(int n, String desc) {
        n--;

        if (n > this.qntFotos) {
            System.out.println("Falha na alteração, foto invalida");
            System.out.println("");
        } else {
            fts[n].setDesc(desc);
        }
    }

    public void printar_fts() {
        for (int i = 0; i < this.qntFotos; i++) {
            System.out.println("Link: " + this.fts[i].getUrl());
            System.out.println("Descrição: " + this.fts[i].getDesc());
            System.out.println();
        }
    }
}