package part1;

public class ChainNode {
	private Character key;
	private String value;
	ChainNode next;
	
	public ChainNode(Character c, String s, ChainNode nextNode){
		key = c;
		value = s;
		next = nextNode;
	}
	
	public String getValue(){
		return value;
	}
	
	public Character getKey(){
		return key;
	}
	
	public void setValue(String s){
		this.value = s;
	}
	
	public ChainNode getNext(){
		return next;
	}
	
	public void setNext(ChainNode next){
		this.next = next;
	}
}
