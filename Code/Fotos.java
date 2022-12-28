/* @File Fotos.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe que representa
 * uma foto
 * @Date 26/10/2022
*/

package Code;

public class Fotos {
    // Atributos
    private String url;
    private String desc;

    // Getters
    public String getUrl() {
        return this.url;
    }

    public String getDesc() {
        return this.desc;
    }

    // Setters
    public void setUrl(String url) {
        this.url = url;
    }

    public void setDesc(String descricao) {
        this.desc = descricao;
    }

    // Contrutores
    public Fotos() {
    }

    public Fotos(String url, String descricao) {
        this.url = url;
        this.desc = descricao;
    }
}