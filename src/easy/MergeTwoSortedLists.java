package easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Создаем "псевдосписок", который будет служить началом нового списка.
        // Он не содержит значений, а просто помогает удобно добавлять элементы.
        ListNode dummy = new ListNode();

        // Указатель на текущий элемент в новом списке, начиная с dummy.
        ListNode current = dummy;

        // Пока оба списка не пустые, сравниваем их элементы и добавляем меньший в новый список.
        while(list1 != null && list2 != null){
            // Если значение в list1 меньше, чем в list2, добавляем list1 в новый список.
            if(list1.val < list2.val){
                current.next = list1; // Связываем current с элементом list1.
                list1 = list1.next; // Двигаем указатель list1 на следующий элемент.
            }else {
                // Если значение в list2 меньше или равно, добавляем list2 в новый список.
                current.next = list2; // Связываем current с элементом list2.
                list2 = list2.next; // Двигаем указатель list2 на следующий элемент.
            }

            // Перемещаем указатель current на новый элемент, который только что был добавлен в список.
            current = current.next;
        }

        // После завершения основного цикла один из списков может быть пустым.
        // Если list1 не пустой, добавляем оставшиеся элементы из list1 в новый список.
        if(list1 != null){
            current.next = list1;
        }else {
            // Если list2 не пустой, добавляем оставшиеся элементы из list2 в новый список.
            current.next = list2;
        }

        // Возвращаем новый список, начиная с элемента после dummy (так как dummy — это просто вспомогательный узел).
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Пример 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        printList(mergedList); // Вывод: [1, 1, 2, 3, 4, 4]

        // Пример 2
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        printList(mergedList2); // Вывод: []

        // Пример 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        printList(mergedList3); // Вывод: [0]
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
