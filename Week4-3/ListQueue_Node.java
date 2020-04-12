
public class ListQueue_Node <E> {
	private E item;
	private ListQueue_Node<E> next;
	
	public ListQueue_Node(E newItem, ListQueue_Node<E> node) {
		item = newItem;
		next = node;
	}
	
	public E getItem()	{return item;}
	public ListQueue_Node<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(ListQueue_Node<E> newNext) {next = newNext;}
}
