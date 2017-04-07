public class Queue
{
  class Node
  {
    String value;
    Node next;
    
    Node(String x, Node y)
    {
      value = x;
      next = y;
    }
    
    Node(String x)
    {
      this(x, null);
    }
    
  }
  
  Node razer = null;
  Node back = null;
  
  public boolean isEmpty()
  {
    return razer == null;
  }
  
  public int getLength()
  {
    int size = 0;
    
    Node length = razer;
    
    while(length != null)
    {
      size++;
      length = length.next;
    }
    
    return size;
  }
  
  
  public void enqueue(String data)
  {
    if(back != null)
    {
      back.next = new Node(data, null);
      back = back.next;
    }
    
    else
    {
      back = new Node(data, null);
      razer = back;
    }
  }
  
  
  public String dequeue()
  {
    if(isEmpty())
    {
      System.out.println("Empty queue");
      return null;
    }
    
    else
    {
      String newValue = razer.value;
      razer = razer.next;
      
      
      if(razer == null)
      {
        back = null;
      }
      
      return newValue;
    }
  }
  
  public String peek()
  {
    if(isEmpty())
    {
      System.out.println("Empty queue");
      return null;
    }
    
    else
    {
      return razer.value;
    }
    
  }
  
  public void traverse()
  {
    Node noChange = razer;
    
    while(noChange != null)
    {
      System.out.println(noChange.value);
      noChange = noChange.next;
    }
  }
}