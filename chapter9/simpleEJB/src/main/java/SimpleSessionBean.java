import javax.ejb.Stateless;

/**
 * Created by Андрей on 10.06.2016.
 */
@Stateless
public class SimpleSessionBean implements SimpleSession{
    private String message = "If you don't see it, this one doesn't work";

    public String getMessage() {
        return message;
    }
}
