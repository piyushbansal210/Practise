public class Queue {
    int[] arr;
    int front=-1;
    int rear=-1;

    public Queue(int size){
        this.arr=new int[size];
    }

    public void enqueue(int data){
        if(front==-1){
            front++;
            rear++;
            arr[rear]=data;
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }

    public void dequeue(){
        front++;
    }

    public void display(){
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
