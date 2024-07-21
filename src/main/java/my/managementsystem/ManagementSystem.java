


package my.managementsystem;


//import Controller.HorarioController;
import Controller.HorarioController;
import View.Login;

/**-----
 *
 * @author Carla Morais
 */
public class ManagementSystem {

    public static void main(String[] args) {

        HorarioController horario =  new HorarioController();
        horario.CriarView();
                
        Login login = new Login();
        login.setVisible(true);

    }

}
