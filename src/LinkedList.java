public class LinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    private Node Head;
    private Node Tail;

    public void insertLast(int val){
        Node node=new Node(val);
        if(Head==null  && Tail==null){
            Head=Tail=node;
        }
        else{
            var current=Head;
            while(current.next!=null){
                current=current.next;
            } 
            current.next=node;
            Tail=current;
        }
    }
    public void insertBegining(int data){
        Node node = new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            node.next=Head; 
            Head=node;
        }
    }
    public void insertBetween(int data,int position){
        Node node=new Node(data);
        Node current=Head;
        int count=1;
        while(count<position){
            current=current.next;
            count++;
        }
        node.next=current.next;
        current.next=node;
    }
    public void deleteFirst(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        var node = Head.next;
        Head=node;
    }
    public void deleteLast(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            var current=Head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
            Tail=current;
        }
    }
    public void deleteBetween(int position){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            int count=1;
            var current=Head;
            while(count<position-1){
                current=current.next;
                count++;
            }
            current.next=current.next.next;
        }
    }
    public void traverser(){
        Node current=Head;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
}
