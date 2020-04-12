
public class ListStack_Node <E> {
	private E item;
	private ListStack_Node<E> next;
	public ListStack_Node(E newItem, ListStack_Node<E> node) {
		item = newItem;
		next = node;
	}
	
	public E getItem() {return item;}
	public ListStack_Node<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(ListStack_Node<E> newNext) {next = newNext;}
	}

