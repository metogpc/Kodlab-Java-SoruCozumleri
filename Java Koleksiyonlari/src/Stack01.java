import java.util.LinkedList;

public class Stack01 {

	private LinkedList list=new LinkedList();
	
	
	public void push(Object o) {
		list.addFirst(o);
	}
	
	public Object pop() {
		Object a=list.getFirst();
		list.removeFirst();
		return a;
	}
	
	public Object peek() {
		return list.getFirst();
	}
	
	
}