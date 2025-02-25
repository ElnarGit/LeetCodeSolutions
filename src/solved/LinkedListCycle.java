package solved;

public class LinkedListCycle {

    // Метод для проверки, есть ли цикл в связанном списке
    public boolean hasCycle(ListNode head){
        // Если список пустой, то цикла не может быть
        if(head == null){
            return false;
        }

        // Указатели slow и fast начинаются с головы списка
        ListNode slow = head;
        ListNode fast = head;

        // Цикл продолжается, пока быстрый указатель не достигнет конца списка
        while (fast != null && fast.next != null){

            // Медленный указатель двигается на 1 шаг за раз
            slow = slow.next;

            // Быстрый указатель двигается на 2 шага за раз
            fast = fast.next.next;

            // Если slow и fast указатели встретились, значит, в списке есть цикл
            if(slow == fast){
                return true;
            }
        }

        // Если быстрый указатель достиг конца списка, значит, цикла нет
        return false;
    }
}
