In this project you have to create Map-like data structure - Dictionary. In general it is a good practice to provide several implementations of such data structures as different problems have different requirements. For example, in Java API ArrayList and LinkedList implement same interface, but they use different approaches to solve same problems. Therefore we are going to provide 2 different implementations of Dictionary as well: ListDictionary and SetDictionary. You have to implement these classes and some additional helper classes.

Option
Implement a generic class Option. It may or may not contain a non-null value. Implement following methods:

2 constructors. One with a value as an parameter and another with no parameter at all. To restrict storing null as a value, these constructors MUST be private. The first constructor should store the given value as a class attribute. The second constructor should not store anything and mark object as empty.
As constructors are private we need static methods to create objects of class Option. Implement static generic method some that takes a value as an parameter and creates an Option object storing it.
Implement static generic method none that does not take any parameters and creates an Option object without any value stored (empty option).
get method should return the stored value. If it does not contain any value then throw EmptyOptionException.
getOrDefault method should return the stored value. If it does not contain any value, then return default value given as the parameter.
isNone should return true if object does not contain value, otherwise it should return false.
Dictionary
You should write 2 implementations of Dictionary interface. Dictionary interface is already given. It has 2 generic type parameters: K - key type, V - value type. Dictionary objects should store a mapping of K type keys to V type values.

Interface has following methods:

get(K key) takes a key as a parameter and should find value mapped to this key. If such a key exists in the dictionary, the method should return Option object with value stored in it. If such key does not exist in the map, it should return empty Option object.
get(K key, V defaultValue) takes a key as a 1st parameter and should find value mapped to this key. If such key exists in the dictionary, the method should return the value associated with it. If there is no such key, return defaultValue given as a 2nd parameter.
containsKey should check if the given key exists in dictionary and return true if it exists and return false otherwise.
put takes 2 parameters: key and value. Method should check if such key already exists in dictionary. If it does return false, otherwise store this new key-value mapping and return true.
update takes 2 parameters: key and value. Method should check if such key already exists in dictionary. If it does NOT exist, return false. Otherwise, find value associated with the given key and change old one with the new value and return true.
clear gets key as a patameter. Find if this key exists in the dictionary and if it does remove both key and value associated with it.
keyStream should return stream that contains all keys from the dictionary.
valueStream should return stream that contains all values from the dictionary. Note: duplicate values are allowed.
List Dictionary
Implement ListDictionary class. This class should implement Dictionary interface (and therefore all it's methods). ListDictionary should have 2 attributes: List<K> keys and List<V> values. You should use these 2 lists to store key-value mappings: i-th element in values list should be a value associated with the key on i-th index from keys list.

For example, if lists are following:
values := ["A", "B", "C"]
keys := [17, 1, 9]
It means that we have following key-value pairs: 17-"A", 1-"B", 9-"C".

You should implement all methods from Dictionary interface using these 2 lists. You are NOT allowed to add any other attributes to the ListDictionary class. Adding other attributes will result in getting 0 points.

Set Dictionary
Implement SetDictionary class. This class should implement the Dictionary interface. SetDictionary should have only 1 attribute: Set<Pair<K, V>> entries. You should use this set to store key-value mappings: each pair from the list represents one key-value mapping, the first element from the pair is a key and the second one is a value. Pair<T1,T2> class is already given.

For example, if set is following:
entries := [new Pair(17,"A"), new Pair(1,"B"), new Pair(9, "C")]
It means that we have following key-value pairs: 17-"A", 1-"B", 9-"C".

You should implement all methods from Dictionary interface using this one set. You are NOT allowed to add any other attributes to the SetDictionary class. Adding other attributes will result in getting 0 points.

NOTE: Submitted code should not have any compilation errors! If your code can not be compiled and run you will get 0 points automatically.
