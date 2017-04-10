public class Main
{
  
  public static Queue stackToQueue(Stack inputS)
  {
    Queue newQ = new Queue();
    
    Stack.Node queueNode = inputS.top;
    
    while(queueNode != null)
    {
      newQ.enqueue(queueNode.value);
      queueNode = queueNode.next;
    }
    
    return newQ;
  }
  
  public static Stack moveQS(Queue inputQ)
  {
    Stack newS = new Stack();
    String [] array = new String[inputQ.getLength()];
    
    Queue.Node pushNode = inputQ.razer;
   
    int setArray = 0;
    
    while(pushNode != null)
    {
      array[setArray] = pushNode.value;
      setArray++;
      
      pushNode = pushNode.next;
    }
    
    for(int x = array.length - 1; x >= 0; x--)
    {
      newS.push(array[x]);
    }
    return newS;
  }
  
  public static Stack moveSS(Stack inputS)
  {
    Stack copy = new Stack();
    String [] array = new String[inputS.getLength()];
    
    Stack.Node pushpushNode = inputS.top;
    
    int setArray = 0;
    
    while(pushpushNode != null)
    {
      array[setArray] = pushpushNode.value;
      setArray++;
      pushpushNode = pushpushNode.next;
    }
    
    for(int x = array.length - 1; x >= 0; x--)
    {
      copy.push(array[x]);
    }
    return copy;
  }

  public static void main(String [] args)
  {
    Stack stackTest = new Stack();
    Queue queueTest = new Queue();
    
    System.out.println("Stack = " + stackTest + " has: ");
    stackTest.push("One");
    stackTest.push("Two");
    stackTest.push("Three");
    stackTest.push("Four");
    stackTest.traverse();
    
    String data = stackTest.pop();
    System.out.println("Popped four from list " + data);
    System.out.println("new list:");
    stackTest.traverse();
    
    System.out.println("Peeking the stack: " + stackTest);
    System.out.println(stackTest.peek());
    
    
    
    System.out.println("Queue = " + queueTest + " has: ");
    queueTest.enqueue("One");
    queueTest.enqueue("Two");
    queueTest.enqueue("Three");
    queueTest.enqueue("Four");
    queueTest.traverse();
    
    String data2 = queueTest.dequeue();
    System.out.println("Dequeue from list: " + data2);
    System.out.println("new list:");
    queueTest.traverse();
    
    System.out.println("Peeking the stack: " + queueTest);
    System.out.println(queueTest.peek());
    
    System.out.println("Testing new stack & queue");
    Stack stackTest2 = new Stack();
    Queue queueTest2 = new Queue();
    
    System.out.println("Stack = " + stackTest + " has: ");
    stackTest2.push("One");
    stackTest2.push("Two");
    stackTest2.push("Three");
    stackTest2.push("Four");
    stackTest2.traverse();
    
    System.out.println("Queue = " + queueTest + " has: ");
    queueTest2.enqueue("One");
    queueTest2.enqueue("Two");
    queueTest2.enqueue("Three");
    queueTest2.enqueue("Four");
    queueTest2.traverse();
 

    System.out.println("Testing the method that moves stack to queue");
    Queue queueTest3 = new Queue();
    
    queueTest3 = stackToQueue(stackTest2);
    System.out.println("The stack has: ");
    stackTest.traverse();
    System.out.println("The queue has: ");
    queueTest3.traverse();
    
    
    System.out.println("Testing the method that moves queue to stack");
    Stack stackTest3 = new Stack();
    
    stackTest3 = moveQS(queueTest2);
    System.out.println("The queue has: ");
    queueTest2.traverse();
    System.out.println("The stack has: ");
    stackTest3.traverse();
    
    System.out.println("Testing the method that moves stack to another stack");
    Stack stackTest4 = new Stack();
    
    stackTest4 = moveSS(stackTest2);
    System.out.println("The stack has: ");
    stackTest2.traverse();
    System.out.println("The next stack has: ");
    stackTest4.traverse();
    
  }
  
  
}