package co.binarylife.generics;

public class MyGenClass<K, V> implements MyGenInterface<K, V>{
	
	private K key;
	private V value;
	
	public MyGenClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		return key;
	}
	
	@Override
	public V getValue() {
		return value;
	}

}
