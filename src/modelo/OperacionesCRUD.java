/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

import java.util.ArrayList;

public interface OperacionesCRUD {   
    public boolean insertar(Object obj);
    public boolean eliminar(Object obj);
    public boolean modificar(Object obj);
    public ArrayList<Object[]> consultar();
    public ArrayList<Object[]> filtrar(String valor);
    public ArrayList<Object[]> filtrarClick( String valor);
}
