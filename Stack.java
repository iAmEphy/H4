public class Stack
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
    
    Node(String z)
    {
      this(z, null);
    }
  }
  
  Node top = null;
  
  public boolean isEmpty()
  {
    return top == null;
  }
  
  public int getLength()
  {
    int size = 0;
    Node length = top;
    
    while(length != null)
    {
      size++;
      length = length.next;
    }
    return size;
  }
  
  public void push(String data)
  {
    top = new Node(data, top);
 
  }
  
  
  public String pop()
  {
    if(isEmpty())
    {
      System.out.println("Empty stack");
      return null;
    }
    
    else 
    {
      String popValue = top.value;
      top = top.next;
      return popValue;
    }
  }
  
  public String peek()
  {
    if(isEmpty())
    {
      System.out.println("Empty stack");
      return null;
    }
    
    else
    {
      return top.value;
    }
  }
      
  
  public void traverse()
  {
    Node print = top;
    
    while(print != null)
    {
      System.out.println(print.value);
      print = print.next;
    }
  }
}