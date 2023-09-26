package exemple.model;

public class Rebelde {
    private Long idRebelde;
    private String nome;
    private int idade;
    private String genero;
    private String galaxia;
    private boolean traira;
    private int inventario;

    public Rebelde(Long idRebelde, String nome, int idade, String genero, String galaxia, boolean traira, int inventario) {
        this.idRebelde = idRebelde;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.galaxia = galaxia;
        this.traira = traira;
        this.inventario = inventario;
    }

    public Rebelde(String nome, int idade, String genero, String galaxia, boolean traira, int inventario) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.galaxia = galaxia;
        this.traira = traira;
        this.inventario = inventario;
    }
    public Rebelde(String nome, int idade, String genero, String base) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.galaxia = galaxia;
        this.traira = false;
        this.inventario = 0;
    }
    public Rebelde (){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.galaxia = galaxia;
        this.traira = traira;
        this.inventario = inventario;
    }

    public Long getIdRebelde() {
        return idRebelde;
    }

    public void setIdRebelde(Long idRebelde) {
        this.idRebelde = idRebelde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }

    public boolean isTraira() {
        return traira;
    }

    public void setTraira(boolean traira) {
        this.traira = traira;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Rebelde{" +
                "idRebelde=" + idRebelde +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", galaxia='" + galaxia + '\'' +
                ", traira=" + traira +
                ", inventario=" + inventario +
                '}';
    }
}
