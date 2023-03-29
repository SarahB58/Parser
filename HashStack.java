import java.util.Stack;

public class HashStack {

    Stack<hashMap> hashStack = new Stack<hashMap>();

    public void push(hashMap map) {
        hashStack.push(map);
    }
    public hashMap pop() {
        return hashStack.pop();
    }

    public hashMap topStack(){
        return hashStack.peek();
    }
    public boolean isEmpty(){
        if(hashStack.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

}

