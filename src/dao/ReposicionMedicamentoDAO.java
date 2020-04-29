/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

public class ReposicionMedicamentoDAO implements OperacionesCRUD{
    
    DataBase db = new DataBase();
    ReposicionMedicamento rm = new ReposicionMedicamento();
    CallableStatement cst,cst2;
    
    @Override
    public boolean insertar(Object obj) {
        rm = (ReposicionMedicamento) obj;
        Connection con;
        String sp = "{call SP_INSERTAR_REPOSICION(?,?,?,?,?)}";
        String sp2 = "{call SP_ACTUALIZAR_STOCK_MEDICAMENTO(?,?)}";
                
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setInt(1, rm.getId_medicamento());
            cst.setInt(2, rm.getCantidad_repuesta());
            cst.setString(3, rm.getFecha_reposicion());
            cst.setString(4, rm.getFecha_vencimiento());
            cst.setString(5, rm.getNombre_farmaceutico());
            int filas = cst.executeUpdate();
            
            if(filas>0){
                cst2 = con.prepareCall(sp2);
                cst2.setInt(1, rm.getId_medicamento()); 
                cst2.setInt(2, rm.getCantidad_repuesta());
                cst2.executeUpdate();               
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error insertar reposicion medicamento: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        rm = (ReposicionMedicamento) obj;
        Connection con;
        String sp = "{call SP_ELIMINAR_REPOSICION(?)}";
        String sp2 = "{call SP_ACTUALIZAR_STOCK_MEDICAMENTO_QUITAR(?,?)}";
         
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setInt(1, rm.getId_reposicion());
            int filas = cst.executeUpdate();
            
            if(filas>0){
                cst2 = con.prepareCall(sp2);
                cst2.setInt(1, rm.getId_medicamento()); 
                cst2.setInt(2, rm.getCantidad_repuesta());
                cst2.executeUpdate();  
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error eliminar reposicion medicamento: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select id_reposicion,id_medicamento,cantidad_repuesta,fecha_reposicion,fecha_vencimiento,nombre_farmaceutico from reposicion";
    
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
                Object[] fila = new Object[6];
                for(int i=0; i<=5;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error consultar reposicion medicamento: "+e.getMessage());
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
        String sql = "select upper(id_medicamento), upper(nombre_medicamento), upper(formato), upper(gr_ml), upper(laboratorio),total_disponible from medicamento where id_medicamento like '"+valor+"' or upper(nombre_medicamento) like upper('%"+valor+"%') order by id_reposicion";
        
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
                Object[] fila = new Object[6];
                for(int i=0; i<=5;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error filtrar reposicion medicamento: "+e.getMessage());
        }finally{
            return data;
        }
    }

    @Override
    public ArrayList<Object[]> filtrarClick(String valor) {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select id_reposicion,id_medicamento, cantidad_repuesta, fecha_reposicion, fecha_vencimiento, nombre_farmaceutico from reposicion where id_medicamento like '"+valor+"'";
    
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
                Object[] fila = new Object[6];
                for(int i=0; i<=5;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error filtrarClick reposicion medicamento: "+e.getMessage());
        }finally{
            return data;
        }
    }
}
