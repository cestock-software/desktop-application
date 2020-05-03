/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda **/
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;

public class AtencionMedicaDAO implements OperacionesCRUD{
    
    DataBase db = new DataBase();

    @Override
    public boolean insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        String sql = "select am.id_atencion_medica, am.nro_ficha, rm.id_receta_medica, cp.rut_paciente, am.fecha_atencion_medica "
                + "from atencion_medica am "
                + "join carnet_paciente cp on cp.nro_ficha = am.nro_ficha "
                + "join receta_medica rm on rm.id_atencion_medica = am.id_atencion_medica "
                + "order by am.fecha_atencion_medica";
    
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
                Object[] fila = new Object[5];
                for(int i=0; i<=4;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error consultar atencion médica: "+e.getMessage());
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
        String sql = "select id_receta_medica, am.id_atencion_medica, am.nro_ficha, cp.rut_paciente, am.fecha_atencion_medica "
                + "from atencion_medica am "
                + "join carnet_paciente cp on cp.nro_ficha = am.nro_ficha "
                + "join receta_medica rm on rm.id_atencion_medica = am.id_atencion_medica "
                +"where cp.rut_paciente like '%"+valor+"%'"
                + "order by am.fecha_atencion_medica";
    
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
                Object[] fila = new Object[5];
                for(int i=0; i<=4;i++){
                    fila[i] = rs.getObject(i+1);
                }
                data.add(fila);
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error filtrar atencion médica: "+e.getMessage());
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
        String sql = "select id_medicamento_recetado,id_medicamento, id_receta_medica, "
                + "duracion, frecuencia, cantidad_recetada "
                + "from medicamento_recetado where id_receta_medica like '"+valor+"'";
    
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
            JOptionPane.showMessageDialog(null, "Error filtrarClick medicamento recetado: "+e.getMessage());
        }finally{
            return data;
        }
    }
    
}
