package manager;

import java.util.ArrayList;
import java.util.List;

public interface IManager<P> {
    boolean add(P product);
    boolean edit(int id, P product);
    boolean delete(int id);
    List<P> showAll();
}
