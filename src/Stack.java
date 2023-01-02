public class Stack {
    private int top=-1;
    private int size;
    private int[]arr;
    public Stack(int size){
        this.size=size;
        this.arr=new int[size];
    }
    public void pop(){
        if(top==-1){
            System.out.println("UNDERFLOW EXCEPTION");
        }
        else{
            top--;
            System.out.println("ITEM DELETED");
        }
    }
    public void push(int data){
        if(top<size){
            top++;
            arr[top]=data;
        }
        else{
            System.out.println("...CANNOT PUT MORE ITEMS...");
        }
    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public void top(){
        if(top==-1){
            System.out.println("...UNDERFLOW...");
        }
        else{
            System.out.println(arr[top]);
        }
    }
}
