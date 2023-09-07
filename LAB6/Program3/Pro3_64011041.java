package Program3;

public class Pro3_64011041 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i=0;i<20;i++){
            queue.enqueue(i+1);
        }
        System.out.print("Queue is ");
        while(!queue.empty()){
            System.out.print(queue.dequeue()+" ");
        }
    }
}