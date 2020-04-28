/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package modelo;

public class DataBase {
    String url;
    String uss;
    String pwd;
    String driver;

    public DataBase() {
        this.url = "jdbc:oracle:thin:@//localhost:1521/xepdb1";   
        this.uss = "CESTOCK";
        this.pwd = "cestock";
        this.driver = "oracle.jdbc.OracleDriver";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUss() {
        return uss;
    }

    public void setUss(String uss) {
        this.uss = uss;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    
    
}
