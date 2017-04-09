public class Main
{
  
  public static Queue stackToQueue(Stack inputS)
  {
    Queue newQ = new Queue();
    
    Stack.Node queueNode = inputS.top;
    
    while(queueNode != null)
    {
    }
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
    
    
    
    System.out.println("Stack = " + queueTest + " has: ");
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
    
    
    Stack testStack2 = new Stack(); //initializes testStack as new Stack
  Queue testQueue2 = new Queue(); //initializes testQueue as new Queue
  
  System.out.println("\nThe second testStack, " + testStack2 + ", includes: ");
  testStack2.push("One");
  testStack2.push("Two");
  testStack2.push("Three");
  testStack2.push("Four");
  testStack2.push("Five");
  testStack2.push("Six");
  testStack2.push("Seven");
  testStack2.push("Eight");
  testStack2.push("Nine");
  testStack2.traverse();
  
  System.out.println("\nThe second testQueue, " + testQueue2 + ", includes: ");
  testQueue2.enqueue("One");
  testQueue2.enqueue("Two");
  testQueue2.enqueue("Three");
  testQueue2.enqueue("Four");
  testQueue2.enqueue("Five");
  testQueue2.enqueue("Six");
  testQueue2.enqueue("Seven");
  testQueue2.enqueue("Eight");
  testQueue2.enqueue("Nine");
  testQueue2.traverse();
  
  System.out.println();
  
  //testing moveStackToQueue method
  System.out.println("Testing moveStackToQueue method: ");
  Queue testQueue3 = new Queue();
  
  testQueue3 = moveStackToQueue(testStack2);
  System.out.println("The Stack: ");
  testStack2.traverseForwardAndPrint();
  System.out.println("\nThe Queue: ");
  testQueue3.traverseForwardAndPrint();
  
  System.out.println();
  
  //testing moveQueueToStack method
  System.out.println("Testing moveQueueToStack method: ");
  Stack testStack3 = new Stack();
  
  testStack3 = moveQueueToStack(testQueue2);
  System.out.println("The Queue: ");
  testQueue2.traverseForwardAndPrint();
  System.out.println("\nThe Stack: ");
  testStack3.traverseForwardAndPrint();
  
  System.out.println();
  
  //testing moveStackToStack method
  System.out.println("Testing moveStackToStack method: ");
  Stack testStack4 = new Stack();
  
  testStack4 = moveStackToStack(testStack2);
  System.out.println("The Stack: ");
  testStack2.traverseForwardAndPrint();
  System.out.println("\nThe second Stack: ");
  testStack4.traverseForwardAndPrint();

  }
  
  
}