class Main {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        int val=q.dequeue();
        System.out.println("removed value:" +val);
        q.print();
        System.out.println("length of queue:" +q.length());
    }
}




class queue{
    int data;
    temp next;
    queue(int data){
        this.data=data;
        this.next=temp;
        temp=temp.next;
    }
    boolean isfull(){
        if(top==1){
            System.err.println("queue is full");
            return true;
            
        }else{
            return false;
        }
    }
    boolean isempty(){
        if(rear==-1){
            System.out.println("queue is empty");
            return true;
        }else{
            return false;
        }
         void enqueue(int val){
            if(isfull()){
                return;
            }
            top=top+1;
            queue[top]=val;
        }
        int dequeue(){
            
            if(isempty()){
                return;
            }
            int val=queue[top];
            top=top-1;
        }
    }
    void print(){
        for(int i=top;i>=0;i--){
            System.out.println("|" +queue [i] +"|");
        }
        System.out.println("------");
    }
}



output:
the queue is empty
-------------
|50|
|40|
|30|
|20|
------------
the queue length is 5
