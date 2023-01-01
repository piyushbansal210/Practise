public class CircularLL {
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

    public void insertLast(int data){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        else{
            Tail.next=node;
            Tail=node;
            node.next=Head;
        }
    }
    public void insertBegining(int data){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=node;
        }
        node.next=Head;
        Tail.next=node;
        Head=node;
    }
    public void insertBetween(int data,int position){
        Node node=new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=null;
        }
        else{
            int count=1;
            var current=Head;
            while(count<position){
                current=current.next;
                count++;
            }
            node.next=current.next;
            current.next=node;
        }
        
    }
    public void deleteFirst(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            Tail.next=Head.next;
            Head=Head.next;
        }
    }
    public void deleteLast(){
        if(Head==null && Tail==null){
            System.out.println("Empty List");
        }
        else{
            var current=Head;
            while(current.next!=Tail){
                current=current.next;
            }
            current.next=Head;
            current=Tail;
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
        }
    }
    public void traverser(){
        Node current=Head;
        do{
            System.out.println(current.data);
            current=current.next;
        }while(current!=Head);
    } 
}
