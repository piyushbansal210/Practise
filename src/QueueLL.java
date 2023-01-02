public class QueueLL {
   private class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
   } 
   private Node Head;
   private Node Tail;

   public void enqueue(int data){
        Node node = new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            Tail.next=node;
            Tail=node;
        }
   }
   public void dequeue(){
        var node =Head.next;
        Head=node;
   }
   public void display(){
        var current=Head;
        while(current!=null){
            System.out.print(current.data);
            if(current!=Tail){
                System.out.print("->");
            }
            current=current.next;
        }
        System.out.println();
   }
}


// 10 -> 20 -> 30 -> 40 -> 50
// 20 -> 30 -> 40 -> 50
// 30 -> 40 -> 50
// 40 -> 50
// 50