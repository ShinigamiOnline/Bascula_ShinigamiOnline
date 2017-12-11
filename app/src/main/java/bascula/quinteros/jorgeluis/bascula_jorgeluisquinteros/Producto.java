package bascula.quinteros.jorgeluis.bascula_jorgeluisquinteros;

/**
 * Created by Shinigami Online on 08/12/2017.
 */

public class Producto {
    int idImage;
    String nomProducto;
    double cantidad;
    double subTotal;


    public Producto(int idImage, String nomProducto, double cantidad,double subTotal) {
        this.idImage = idImage;
        this.nomProducto = nomProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }
}
