public class StackLL {
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            Node next=null;
        }
    }
    public Node Head;
    public Node Tail;

    public void push(int data){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            Tail.next=node;
            Tail=node;
        }
    }
    public void pop(){
        var current=Head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        Tail=current;
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
    }
    public void top(){
        System.out.println(Tail.data);
    }
}

