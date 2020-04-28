/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package dao;

import modelo.Usuario;
import vista.*;
import java.util.logging.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.*;

public class UsuarioDAO {
    
    DataBase db = new DataBase();
    Usuario us = new Usuario();
    
    public void acceder(Usuario us) throws Exception
    {
        Connection con = null;
        PreparedStatement pst;
        ResultSet rs;
        String cap="";
        String nom="";
        String sql=" select * from usuario where rut_usuario=? and contrasena=?";
        
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, us.getRut_usuario());
            pst.setString(2, us.getContrasena());
            rs = pst.executeQuery();

            while(rs.next())
            {
                cap=rs.getString("tipo_usuario");
                nom=rs.getString("nombre_completo");
            }
            
            if(cap.equals("administrativo"))
            {
                JOptionPane.showMessageDialog(null, "Bienvenido "+nom);
                vista.VistaAdministrativo va = new vista.VistaAdministrativo();
                va.setVisible(true);
                va.lblnombre.setText(nom);
            }
            
            if(cap.equals("farmaceutico"))
            {
                JOptionPane.showMessageDialog(null, "Bienvenido "+nom);
                vista.VistaFarmaceutico vf = new vista.VistaFarmaceutico();
                vf.setVisible(true);
                vf.lblnombre.setText(nom);
            }
            
            if(cap.equals("medico"))
            {
                JOptionPane.showMessageDialog(null, "Lo siento Sr. "+nom+" no tiene acceso a este sistema");
            }
            
            if((!cap.equals("administrativo"))&& (!cap.equals("farmaceutico")) && (!cap.equals("medico")))
            {
                Login login=new Login();
                login.setVisible(true);
                JOptionPane.showMessageDialog(null, "Usuario no existe en la base de datos");
            }
        }catch (SQLException | ClassNotFoundException e)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "error "+e.getMessage());
        }
        finally
        {
            con.close();
        }
    }
}
