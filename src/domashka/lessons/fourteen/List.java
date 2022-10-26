package domashka.lessons.fourteen;

public class List {

    Node first;
    Node last;

    public  void add(int data){

        Node node = new Node();
        node.data = data;

        if (first==null){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int data){

        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    public void addLast(int data){
        add(data);
    }

    public void deleteFirst(){

        if (first!=null){
            first = first.next;
        }

    }

    public void deleteLast(){

        if (first==null){
            return;
        }

        Node n = first;

        while (n.next!=null){

            if (n.next==last){

                n.next = null;
                last = n;
            }else {
                n = n.next;
            }
        }
    }

    public boolean isEmpty(){

        return first==null&&last==null;
    }
}
