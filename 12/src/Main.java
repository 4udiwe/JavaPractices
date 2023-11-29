import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 24680, number2 = 13579;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        //24680, 13579
        gameOnStack(number1, number2);
        gameOnQueue(number1, number2);
        gameOnDeque(number1, number2);
    }
    public static void gameOnDeque(int number1, int number2){
        Deque<Integer> queue1 = new ArrayDeque<>();
        Deque<Integer> queue2 = new ArrayDeque<>();
        for (int i = 1; i <= 10000; i *= 10) {
            queue1.add((number1 / i) % 10);
            queue2.add((number2 / i) % 10);
        }

        //System.out.println(queue1);
        //System.out.println(queue2);
        int count = 0;
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            if (count >= 106){
                System.out.println("botva");
                break;
            }
            if (queue1.element() == 0 && queue2.element() == 9){
                //забирает 1
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue1.add(card2);
                queue1.add(card1);
            }
            else if (queue1.element() == 9 && queue2.element() == 0){
                //забирает 2
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue2.add(card1);
                queue2.add(card2);
            }
            else if (queue1.element() > queue2.element()){
                //забирает 1
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue1.add(card2);
                queue1.add(card1);
            }
            else {
                //забирает 2
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue2.add(card1);
                queue2.add(card2);
            }
            //System.out.println("que1 = " + queue1);
            //System.out.println("que2 = " + queue2);
            count++;
        }
        if (queue1.peek() == null)
            System.out.println("second " + count);
        else
            System.out.println("first " + count);
    }
    public static void gameOnQueue(int number1, int number2){
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 1; i <= 10000; i *= 10) {
            queue1.add((number1 / i) % 10);
            queue2.add((number2 / i) % 10);
        }

        //System.out.println(queue1);
        //System.out.println(queue2);

        int count = 0;
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            if (count >= 106){
                System.out.println("botva");
                break;
            }
            if (queue1.element() == 0 && queue2.element() == 9){
                //забирает 1
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue1.add(card2);
                queue1.add(card1);
            }
            else if (queue1.element() == 9 && queue2.element() == 0){
                //забирает 2
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue2.add(card1);
                queue2.add(card2);
            }
            else if (queue1.element() > queue2.element()){
                //забирает 1
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue1.add(card2);
                queue1.add(card1);
            }
            else {
                //забирает 2
                int card1 = queue1.remove(), card2 = queue2.remove();
                queue2.add(card1);
                queue2.add(card2);
            }
            //System.out.println("que1 = " + queue1);
            //System.out.println("que2 = " + queue2);
            count++;
        }
        if (queue1.peek() == null)
            System.out.println("second " + count);
        else
            System.out.println("first " + count);
    }
    public static void gameOnStack(int number1, int number2){
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        for (int i = 10000; i >= 1; i/=10) {
            stack1.push((number1 / i) % 10);
            stack2.push((number2 / i) % 10);
        }
        //System.out.println(stack1);
        //System.out.println(stack2);
        int counter = 0;
        while (!stack1.empty() && !stack2.empty()){
            if (counter >= 106){
                System.out.println("botva");
                break;
            }
            if (stack1.peek() == 9 && stack2.peek() == 0){
                //забирает 2
                int card1 = stack1.pop();
                int card2 = stack2.pop();
                Stack<Integer> tempstack = new Stack<Integer>();
                while (!stack2.empty())
                    tempstack.push(stack2.pop());
                stack2.push(card2);
                stack2.push(card1);
                while (!tempstack.empty())
                    stack2.push(tempstack.pop());
            }
            else if (stack1.peek() == 0 && stack2.peek() == 9){
                //забирает 1
                int card1 = stack1.pop();
                int card2 = stack2.pop();
                Stack<Integer> tempstack = new Stack<Integer>();
                while (!stack1.empty())
                    tempstack.push(stack1.pop());
                stack1.push(card1);
                stack1.push(card2);
                while (!tempstack.empty())
                    stack1.push(tempstack.pop());
            }
            else if (stack1.peek() > stack2.peek()){
                //забирает 1
                int card1 = stack1.pop();
                int card2 = stack2.pop();
                Stack<Integer> tempstack = new Stack<Integer>();
                while (!stack1.empty())
                    tempstack.push(stack1.pop());
                stack1.push(card1);
                stack1.push(card2);
                while (!tempstack.empty())
                    stack1.push(tempstack.pop());
            }
            else {
                //забирает 2
                int card1 = stack1.pop();
                int card2 = stack2.pop();
                Stack<Integer> tempstack = new Stack<Integer>();
                while (!stack2.empty())
                    tempstack.push(stack2.pop());
                stack2.push(card2);
                stack2.push(card1);
                while (!tempstack.empty())
                    stack2.push(tempstack.pop());
            }
            //System.out.println("stack 1 = " + stack1);
            //System.out.println("stack 2 = " + stack2);
            counter++;
        }
        if (stack1.empty())
            System.out.println("second " + counter);
        else
            System.out.println("first " + counter);
    }
}