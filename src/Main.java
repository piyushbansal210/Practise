public class Main {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.dequeue();
        q.dequeue();
        q.display();

        StackLL sll = new StackLL();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.push(50);
        sll.push(60);
        sll.push(70);
        sll.pop();
        sll.pop();
        sll.display();

    }
}