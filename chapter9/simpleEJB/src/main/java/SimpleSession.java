import javax.ejb.Remote;

/**
 * Created by Андрей on 10.06.2016.
 */
@Remote
public interface SimpleSession {
    String getMessage();
}
