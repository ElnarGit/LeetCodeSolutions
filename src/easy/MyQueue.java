package easy;

import java.util.Stack;

public class MyQueue {
    // Два стека: stackIn для добавления элементов и stackOut для извлечения
    Stack<Integer> stackIn = new Stack<>(); // Стек для входящих элементов
    Stack<Integer> stackOut = new Stack<>(); // Стек для исходящих элементов

    public MyQueue() {}

    // Метод для добавления элемента в очередь
    public void push(int x){
        // Добавляем элемент в стек входящих элементов (stackIn)
        stackIn.push(x);

    }

    // Метод для удаления элемента из очереди и возвращения его значения
    public int pop(){
        // Если stackOut пуст, необходимо переместить все элементы из stackIn в stackOut
        if(stackOut.isEmpty()){
            // Перемещаем все элементы из stackIn в stackOut, инвертируя порядок
            // Это делается для того, чтобы элемент, добавленный первым, оказался на вершине stackOut
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        // Извлекаем и возвращаем верхний элемент из stackOut
        return stackOut.pop();

    }

    // Метод для получения элемента из очереди без его удаления
    public int peek(){
        // Если stackOut пуст, необходимо переместить все элементы из stackIn в stackOut
        if(stackOut.isEmpty()){
            // Перемещаем все элементы из stackIn в stackOut
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        // Возвращаем элемент на вершине stackOut (это первый элемент очереди)
        return stackOut.peek();
    }

    // Метод для проверки, пуста ли очередь
    public boolean empty() {
        // Очередь пуста, если оба стека пусты
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
