package Iterator;

import java.util.List;

public interface Iterator<Object>  {
    public boolean hasNext(List<Object> list,int i);
    public Object next(List<Object> list,int i);
}
