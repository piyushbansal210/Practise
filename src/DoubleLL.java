public class DoubleLL {
    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private Node Head;
    private Node Tail;

    public void insertBegin(int data){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            node.next=Head;
            Head=node;
        }
    }
    public void insertEnd(int data){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            var current=Head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.prev=current;
            node=Tail;
        }
    }
    public void insertBetween(int data, int position){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            var current=Head;
            int count=1;
            while(count<position-1){
                current=current.next;
                count++;
            }
            node.next=current.next;
            node.prev=current;
            current.next=node;
            current.next.prev=node;
        }
    }
    public void deleteBegin(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            var node =Head.next;
            Head=node;
            node.prev=null;
        }
    }
    public void deleteEnd(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            var current=Head;
            while(current.next!=null){
                current=current.next;
            }
            current.prev.next=null;
            current.prev=null;
        }
    }
    public void deleteBetween(int position){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            var current=Head;
            int count=1;
            while(count<position-1){
                current=current.next;
                count++;
            }
            current.next=current.next.next;
            current.next.next.prev=current;
        }
    }
    public void traverse(){
        Node current=Head;
        while(current!=null){
            System.out.print(current.data+" ");
            System.out.println();
            current=current.next;
        }
    }
}
