package exam;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class SetDictionary<K, V> implements Dictionary<K,V> {
    Set<Pair<K,V>> entries = new HashSet<>();
    @Override
    public Option<V> get(K key) {
        V second = null;
      for (Pair<K,V> pair: entries)
      {
          if(pair.first == key) second = pair.second;
      }
       if(second == null) return Option.none();
       return Option.some(second);
    }

    @Override
    public V get(K key, V defaultValue) {

        V second = null;
        for (Pair<K,V> pair: entries)
        {
            if(pair.first == key) second = pair.second;
        }
        if(second == null) return defaultValue;
        return second;
    }

    @Override
    public boolean containsKey(K key) {
        boolean t=false;
       for (Pair<K,V> pair : entries)
       {
           if(pair.first == key) t=true;
       }
       return t;
    }

    @Override
    public boolean put(K key, V value) {
        if (this.containsKey(key)) {
            return false;
        }
        entries.add(new Pair<K,V> (key,value));
        return true;
    }

    @Override
    public boolean update(K key, V value) {
        if(!this.containsKey(key)) return false;
        for (Pair<K,V> pair : entries)
        {
            if(pair.first == key) pair.second = value;
        }
        return true;
    }

    @Override
    public void clear(K key) {
        if (this.containsKey(key))
        {
            entries.removeIf(pair -> pair.first == key);
        }
    }

    @Override
    public Stream<K> keyStream() {
        List<K> keys = new ArrayList<>();
         for (Pair<K,V> pair : entries)
         {
             keys.add(pair.first);
         }
         return keys.stream();
    }

    @Override
    public Stream<V> valueStream() {
        List<V> values = new ArrayList<>();
        for (Pair<K,V> pair : entries)
        {
            values.add(pair.second);
        }
        return values.stream();
    }


}
