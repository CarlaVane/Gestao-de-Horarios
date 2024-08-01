


package my.managementsystem;


//import Controller.HorarioController;
import Controller.HorarioController;
import View.Login;
import View.ViewMenuPrincipalAdmin;

/**-----
 *
 * @author Carla Morais
 */
public class ManagementSystem {

    public static void main(String[] args) {

        HorarioController horario =  new HorarioController();
        horario.CriarView();
                
      // Login login = new Login();
       // login.setVisible(true);

     ViewMenuPrincipalAdmin abrir  = new ViewMenuPrincipalAdmin();
      abrir.setVisible(true);
        
    }

}
