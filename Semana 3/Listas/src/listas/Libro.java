package listas;

public class Libro {
    private String name;
    private String autor;
    private String codigo;

    public Libro(String name, String autor, String codigo) {
        this.name = name;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
