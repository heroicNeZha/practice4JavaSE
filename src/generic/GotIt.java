package generic;

public class GotIt<K, V> {
	public K key;
	public V value;
	
	public GotIt(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
