package solved;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        // Создаем хеш-таблицу для соответствия закрывающих и открывающих скобок
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){
            // Если символ является закрывающей скобкой
            if(map.containsKey(c)){
                // Проверяем, пуст ли стек или верхний элемент стека не соответствует текущей закрывающей скобке
                if(stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }else {
                // Если символ является открывающей скобкой, добавляем его в стек
                stack.push(c);
            }
        }
        // Если стек пуст, значит все скобки закрыты правильно
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("()"));
    }
}
