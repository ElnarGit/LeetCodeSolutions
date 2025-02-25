package solved;

public class ReverseLinkedList {

    // Метод для разворота односвязного списка
    public ListNode reverseList(ListNode head){
        // Инициализируем переменную для предыдущего узла, которая будет на старте равна null
       ListNode previousNode = null;

        // Текущий узел на старте это голова списка
       ListNode currentNode = head;

        // Проходим по всему списку, пока не дойдем до конца (currentNode не равен null)
       while (currentNode != null){
           // Сохраняем следующий узел, чтобы не потерять связь
           ListNode nextNode = currentNode.next;

           // Меняем указатель next текущего узла на предыдущий
           currentNode.next = previousNode;

           // Сдвигаем предыдущий узел на текущий (теперь это новый "предыдущий")
           previousNode = currentNode;

           // Сдвигаем текущий узел на следующий (т.е. продолжаем движение по списку)
           currentNode = nextNode;
       }

       // После завершения цикла, previousNode будет указывать на новый головной элемент списка
       return previousNode;
    }
}
