package Formularios;

import Conexion.DBConnection;

/**
 *
 * @author f3rma
 */
public class main {
    public void main (String [ ] args ){
        DBConnection obj=new DBConnection();
        obj.establecerConexion();
    }
    
}
