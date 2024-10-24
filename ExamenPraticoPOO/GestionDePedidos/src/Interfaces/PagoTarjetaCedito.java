package Interfaces;

public class PagoTarjetaCedito implements MetodoPago{
    private int saldoDisponible=50000;
    @Override
    public void procesar_Pago(int monto) {
        if (monto>saldoDisponible) {
            System.out.println("Fondos induficientes");
        }else{
            System.out.println("Prosesando pago...");
            System.out.println("Pago procesado correctamente");
        }
    }
    
}
