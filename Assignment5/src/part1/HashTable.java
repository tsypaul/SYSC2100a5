package part1;

public class HashTable {
	private int size = 0;
	private int hashSize = 26;
	private ChainNode[] table;
	
	public HashTable(){
		table = new ChainNode[hashSize];
	}
	
	public boolean tableIsEmpty(){
		return size == 0;
	}
	
	public int tableSize(){
		return hashSize;
	}
	
	public int hashIndex(char key){
		return (key - 'a')/('b' - 'a') - 1;
	}
	
	public void tableInsert(char key, String value) throws RuntimeException{
		int hash = hashIndex(key);
		if(table[hash] == null){
			table[hash] = new ChainNode(key, value, null);
		}else{
			ChainNode first = table[hash];
			while(first.getNext() != null){
				if(first.getValue() == value){
					System.out.println("Symbol exists.");
					return;
				}
				first = first.getNext();
			}
			first.setNext(new ChainNode(key, value, null));
		}
		size++;
	}
	
	public String tableRetrieve(char key, String value){
		int hash = hashIndex(key);
		if(table[hash] == null){
			return null;
		}else{
			ChainNode first = table[hash];
			for(;first.getNext() != null; first = first.getNext()){
				if(first.getValue() == value){
					return value;
				}
			}
		}
		return null;
	}
	
}
