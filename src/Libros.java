
import java.util.ArrayList;

public class Libros {
    private ArrayList<String> autores=new ArrayList();
    private String titulo;
    private String genero;
    private ArrayList<String> editoriales=new ArrayList();
    private String idioma;
    private int anioescribio;
    private String ISBN;
    private int aniolibreria;
    private int estado;
    private String estadodelibro;
    private String persona;
    private int cuentapersona;

    public Libros() {
    }

    public Libros(String titulo, String genero, String idioma, int anioescribio, String ISBN, int aniolibreria) {
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        this.anioescribio = anioescribio;
        this.ISBN = ISBN;
        this.aniolibreria = aniolibreria;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<String> editoriales) {
        this.editoriales = editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnioescribio() {
        return anioescribio;
    }

    public void setAnioescribio(int anioescribio) {
        this.anioescribio = anioescribio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAniolibreria() {
        return aniolibreria;
    }

    public void setAniolibreria(int aniolibreria) {
        this.aniolibreria = aniolibreria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        if(estado==0){
            estadodelibro="Prestado";
        }if(estado==1){
            estadodelibro="Disponible";
        }else{
            estadodelibro="Fuera de inventario";
        }
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getCuentapersona() {
        return cuentapersona;
    }

    public void setCuentapersona(int cuentapersona) {
        this.cuentapersona = cuentapersona;
    }

    @Override
    public String toString() {
        return "Libros{" + "autores=" + autores + ", titulo=" + titulo + ", genero=" + genero + ", editoriales=" + editoriales + ", idioma=" + idioma + ", anioescribio=" + anioescribio + ", ISBN=" + ISBN + ", aniolibreria=" + aniolibreria + ", estadodelibro=" + estadodelibro + ", persona=" + persona + ", cuentapersona=" + cuentapersona + '}';
    }
    
    
}
