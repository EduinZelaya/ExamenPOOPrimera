package Productos;
public class ProductoAlimenticio extends Productos{
    private int fecha_Expiracion;

    public ProductoAlimenticio(String nombre, int precio, int stock, int fecha_Expiracion) {
        super(nombre, precio, stock);
        this.fecha_Expiracion = fecha_Expiracion;
    }

    public int getFecha_Expiracion() {
        return fecha_Expiracion;
    }

    public void setFecha_Expiracion(int fecha_Expiracion) {
        this.fecha_Expiracion = fecha_Expiracion;
    }
    
    
}
