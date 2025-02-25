package solved;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head){
        // Если список пустой или состоит из одного элемента, он уже является палиндромом
        if(head == null || head.next == null) return true;

        // Используем два указателя (медленный и быстрый) для нахождения середины списка
        ListNode slow = head;
        ListNode fast = head;

        // Шаг 1: Найти середину списка
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // На этом этапе slow указывает на начало второй половины списка

        // Шаг 2: Развернуть вторую половину списка
        ListNode secondHalfHead = reverseLinkedList(slow); // начало развернутой второй половины
        ListNode firstHalfHead = head;                     // начало первой половины списка

        // Сохраняем ссылку на развернутую вторую половину, чтобы потом восстановить список
        ListNode tempSecondHalfHead = secondHalfHead;

        // Флаг для результата проверки
        boolean isPalindrome = true;

        // Шаг 3: Сравнить первую и вторую половины
        while (secondHalfHead != null){
            if(firstHalfHead.val != secondHalfHead.val){
                isPalindrome = false; // Если значения не совпадают, список — не палиндром
                break;
            }
            // Переходим к следующему элементу в обеих половинах
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        // Шаг 4: Восстановить вторую половину списка в исходное состояние
        reverseLinkedList(tempSecondHalfHead);

        // Шаг 5: Вернуть результат проверки
        return isPalindrome;
    }


    /**
     * Метод для разворота односвязного списка.
     * @param head Начало списка, который нужно развернуть.
     * @return Новая голова развернутого списка.
     */
    private ListNode reverseLinkedList(ListNode head){
        ListNode prev = null; // Предыдущий элемент, изначально null
        while (head != null){
            ListNode nextNode = head.next;  // Сохраняем ссылку на следующий узел
            head.next = prev;               // Переворачиваем указатель текущего узла
            prev = head;                    // Переходим к следующему узлу
            head = nextNode;                // Двигаемся вперед по списку
        }

        // Возвращаем новую голову развернутого списка
        return prev;
    }
}
