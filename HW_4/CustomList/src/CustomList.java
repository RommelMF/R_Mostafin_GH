import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by Home on 30.10.2016.
 */
public class CustomList implements List {

    private Object[] _internalArray;
    private int _currentLastIndex;


    public CustomList(){
        _internalArray = new Object[3];
        _currentLastIndex = 0;
    }

    @Override
    public int size() {
        return _currentLastIndex;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        for ( int i=0;i<size();i++) {
            if(get(i).equals(o))return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(_currentLastIndex >= _internalArray.length){
            System.out.println("LIST IS FULL");
            return false;
        }
        else{
            _internalArray[_currentLastIndex] = o;
            _currentLastIndex++;
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= _currentLastIndex; i++) {
            _internalArray[i]=null;

        }

    }

    @Override
    public Object get(int index) {
        Object element=null;
        if(index>-1&index<=_currentLastIndex) {
            element = _internalArray[index];
        }else{
            System.out.println("Not index");
        }
        return element;

    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public synchronized void add(int index, Object element) {

    }

    @Override
    public synchronized Object remove(int index) {
        _internalArray[index]=null;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }



}

