/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package dao;

import java.util.ArrayList;
import modelo.OperacionesCRUD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.*;

public class PacienteDAO implements OperacionesCRUD{
    
    DataBase db = new DataBase();
    Paciente p = new Paciente();
    CallableStatement cst;
    
    @Override
    public boolean insertar(Object obj) {
        p = (Paciente) obj;
        Connection con;
        String sp = "{call SP_INSERTAR_PACIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setString(1, p.getRut_paciente());
            cst.setString(2, p.getNombre());
            cst.setString(3, p.getAp_paterno());
            cst.setString(4, p.getAp_materno());
            cst.setString(5, p.getDireccion());
            cst.setString(6, p.getEmail());
            cst.setString(7, p.getNro_celular());
            cst.setString(8, p.getFecha_nacimiento()); 
            cst.setString(9, p.getSexo());
            cst.setString(10, p.getComuna());
            cst.setString(11, p.getNombre_familiar());
            cst.setString(12, p.getNro_familiar());
            cst.setString(13, p.getEmail_familiar());
            
            int filas = cst.executeUpdate();
            
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error insertar paciente: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        p = (Paciente) obj;
        Connection con;
        String sp = "{call SP_ELIMINAR_PACIENTE (?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setString(1, p.getRut_paciente());
            int filas = cst.executeUpdate();
            
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error eliminar paciente: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        p = (Paciente) obj;
        Connection con;
        String sp = "{call SP_ACTUALIZAR_PACIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setString(1, p.getRut_paciente());
            cst.setString(2, p.getNombre());
            cst.setString(3, p.getAp_paterno());
            cst.setString(4, p.getAp_materno());
            cst.setString(5, p.getDireccion());
            cst.setString(6, p.getEmail());
            cst.setString(7, p.getNro_celular());
            cst.setString(8, p.getFecha_nacimiento()); 
            cst.setString(9, p.getSexo());
            cst.setString(10, p.getComuna());
            cst.setString(11, p.getNombre_familiar());
            cst.setString(12, p.getNro_familiar());
            cst.setString(13, p.getEmail_familiar());  
            int filas = cst.executeUpdate();
            
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error modificar paciente: "+e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select rut_paciente, upper(nombre), "
                + "upper(ap_paterno), upper(ap_materno), upper(direccion),"
                + "upper(email),nro_celular,fecha_nacimiento,upper(sexo),"
                + "upper(comuna),upper(nombre_familiar),nro_familiar,upper(email_familiar) "
                + "from paciente order by rut_paciente";
    
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Object[] fila = new Object[13];
                for(int i=0; i<=12;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error consultar medicamento: "+e.getMessage());
        }finally{
            return data;
        }
    }

    @Override
    public ArrayList<Object[]> filtrar(String valor) {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select rut_paciente, upper(nombre), "
                + "upper(ap_paterno), upper(ap_materno), upper(direccion),"
                + "upper(email),nro_celular,fecha_nacimiento,upper(sexo),"
                + "upper(comuna),upper(nombre_familiar),nro_familiar,upper(email_familiar) "
                + "where rut_paciente like '"+valor+"' or upper(nombre) "
                + "like upper('%"+valor+"%') or upper(ap_paterno) like upper('%"+valor+"%')"
                + "or upper(ap_materno) like upper('%"+valor+"%') from paciente order by rut_paciente";
    
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Object[] fila = new Object[13];
                for(int i=0; i<=12;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error consultar medicamento: "+e.getMessage());
        }finally{
            return data;
        }
    }

    @Override
    public ArrayList<Object[]> filtrarClick(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
