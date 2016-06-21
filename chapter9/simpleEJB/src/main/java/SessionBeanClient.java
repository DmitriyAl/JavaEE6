import javax.ejb.EJB;

/**
 * Created by Андрей on 10.06.2016.
 */
public class SessionBeanClient {

    @EJB
    private static SimpleSession simpleSession;

    private void invokeSessionBeansMethods() {
        System.out.println(simpleSession.getMessage());
        System.out.println("simpleSession type is: " + simpleSession.getClass().getName());
    }
}
