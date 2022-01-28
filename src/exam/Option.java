package exam;

import java.util.EmptyStackException;

public class Option<T> {
    private T atr;
    private Option(T atr)
    {
        this.atr = atr;
    }
    private  Option ()
    {

    }
    public static <T> Option<T>  some (T arg)
    {
        return new Option<T>(arg);
    }
    public static <T> Option<T>   none ()
    {
       return  new Option<T>();
    }

    public T get() throws EmptyOptionException {
        if(atr == null) throw new EmptyOptionException();
            return atr;
    }
    public T getOrDefault(T arg)  {
        if(atr == null) return arg;
            return atr;
    }
    public boolean isNone ()
    {
        return atr==null;
    }
}
