package Iterator;

import java.util.List;

public class NameIterator<Object> implements Iterator<Object> {

    @Override
    public boolean hasNext(List<Object> list,int i) {
        if(i<list.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next(List<Object> list,int i ) {
        if(this.hasNext(list,i)){
            return list.get(i);
        }
        return null;
    }
}
