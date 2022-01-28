package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListDictionary<K, V> implements Dictionary<K,V> {
    List<K> keys = new ArrayList<>();
    List<V> values = new ArrayList<>();

    @Override
    public Option<V> get(K key) {
        int i=0;
        for (K k:keys)
        {
            if(k==key) break;
            i++;
        }
        if(i==keys.size())
        {

            return Option.none();
        }
        int k=0;
        return Option.some(values.get(i));


    }

    @Override
    public V get(K key, V defaultValue) {
        int i=0;
        for (K k:keys)
        {
            if(k==key) break;
            i++;
        }
        if(i==keys.size())
        {
            return defaultValue;

        }

        return  values.get(i);
    }

    @Override
    public boolean containsKey(K key) {
        for (int i=0;i<keys.size();i++)
            if(keys.get(i) == key) return true;
            return false;
    }

    @Override
    public boolean put(K key, V value) {
        for (K k: keys )
        {
            if(k==key) return false;
        }
        keys.add(key);
        values.add(value);
        return true;

    }

    @Override
    public boolean update(K key, V value) {
        int i=0;
        for (K k: keys )
        {
            if(k==key) break;
             i++;
        }
        if(i==keys.size()) return false;
        values.set(i,value);
        return true;
    }

    @Override
    public void clear(K key) {
     for (int i=0;i<keys.size();i++)
     {
         if(keys.get(i) == key)
         {
             keys.remove(i);
             values.remove(i);
             break;
         }
     }
    }

    @Override
    public Stream<K> keyStream() {
        return keys.stream();
    }

    @Override
    public Stream<V> valueStream() {
        return values.stream();
    }
}
