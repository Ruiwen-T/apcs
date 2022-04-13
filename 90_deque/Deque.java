/*
Mr. K: May Qiu, Raven (Ruiwen) Tang, Kaitlin Ho
APCS pd6
HW90 -- Swabbing the Deque / implementing Deque in compliance with interface
2022-04-12
time spent: 1.0 hr
*/

public interface Deque<Card>{
	public int size();

	public void addLast(Card x);
	
	public boolean add(Card x);
	
	public boolean offer(Card x);
	
	public boolean offerLast(Card x);

	public void addFirst(Card x);
	
	public boolean offerFirst(Card x);

	public Card peekFirst();
	
	public Card element();
	
	public Card getFirst();
	
	public Card peek();

	public Card peekLast();
	
	public Card getLast();

	public Card removeFirst();
	
	public Card poll();
	
	public Card pollFirst();

	public Card removeLast();
	
/*	
	
	public boolean remove();
	
	public Card removeFirst();
	
	public Card pollLast();
	
	public Card removeLast();
	
	public boolean contains(Card x);
	
	public boolean remove(Card x);
	
	public boolean removeFirstOccurrence(Card x);
	
	public boolean removeLastOccurrence(Card x);
	
	public Iterator<Card> iterator();
	
	public Iterator<Card> descendingIterator();
	
	public Card pop();
	
	public void push(Card x);
	*/
}
