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

public class MedicamentoDAO implements OperacionesCRUD {
    
    DataBase db = new DataBase();
    Medicamento m = new Medicamento();
    CallableStatement cst;
    
    @Override
    public boolean insertar(Object obj) {
        m = (Medicamento) obj;
        Connection con;
        String sp = "{call SP_INSERTAR_MEDICAMENTO(?,?,?,?,?,?,?,?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setInt(1, m.getCodigo_medicamento());
            cst.setString(2, m.getNombre_medicamento());
            cst.setString(3, m.getFormato());
            cst.setString(4, m.getGr_ml());
            cst.setString(5, m.getLaboratorio());
            cst.setInt(6, 0);
            cst.setInt(7, 0);
            cst.setInt(8, 0); 
            int filas = cst.executeUpdate();
            
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error insertar medicamento: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        m = (Medicamento) obj;
        Connection con;
        String sp = "{call SP_ELIMINAR_MEDICAMENTO(?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp);
            cst.setInt(1, m.getCodigo_medicamento());
            
            int filas = cst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error eliminar medicamento: "+e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        m = (Medicamento) obj;
        Connection con;
        String sp = "{call SP_ACTUALIZAR_MEDICAMENTO(?,?,?,?,?)}";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            cst = con.prepareCall(sp); 
            cst.setString(1, m.getNombre_medicamento());
            cst.setString(2, m.getFormato());
            cst.setString(3, m.getGr_ml());
            cst.setString(4, m.getLaboratorio());
            cst.setInt(5, m.getCodigo_medicamento());
            
            int filas = cst.executeUpdate();
            if(filas>0){
                con.close();
                return true;
            }else{
                con.close();
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error modificar medicamento: "+e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select upper(id_medicamento), upper(nombre_medicamento), upper(formato), upper(gr_ml), upper(laboratorio),total_disponible from medicamento order by id_medicamento";
    
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
        String sql = "select upper(id_medicamento), upper(nombre_medicamento), upper(formato), upper(gr_ml), upper(laboratorio),total_disponible from medicamento where id_medicamento like '"+valor+"' or upper(nombre_medicamento) like upper('%"+valor+"%') order by id_medicamento";
    
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
            JOptionPane.showMessageDialog(null, "Error filtrar medicamento: "+e.getMessage());
        }finally{
            return data;
        }
    }

    @Override
    public ArrayList<Object[]> filtrarClick(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
