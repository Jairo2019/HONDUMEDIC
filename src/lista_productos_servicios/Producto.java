package lista_productos_servicios;

public class Producto {
    String id;
    String nom;
    float pre;
    int stock;
    String estado;

    public Producto() {
    }

    public Producto(String id, String nom, float pre, String estado, int stock) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
        this.estado = estado;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPre() {
        return pre;
    }

    public void setPre(float pre) {
        this.pre = pre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
