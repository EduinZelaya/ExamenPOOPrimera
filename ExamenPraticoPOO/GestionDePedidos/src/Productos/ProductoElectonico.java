package Productos;
public class ProductoElectonico extends Productos{
    private int garantia;

    public ProductoElectonico(String nombre, int precio, int stock, int garantia) {
        super(nombre, precio, stock);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
}
