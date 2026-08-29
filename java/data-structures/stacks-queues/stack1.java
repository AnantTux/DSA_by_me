import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(234);
        s.push(1);
        s.push(012);
        s.push(12);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
