import entities.ListNode;
import java.util.Arrays;
public class MergeTwoSortedList {
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        while(list1.next != null) {
            if(list2.val >= list1.val) {
                while(list2.next != null) {
                    if (list2.val <= list1.next.val) {
                        list3.val = list2.val;
                        if(list2.next.val >= list2.val && list1.next.val <= list2.next.val) {
                            list3.next = list2.next;
                        } else {
                            list3.next = list1.next;
                        }
                    }
                    list2 = list2.next;
                }
            }
            list1 = list1.next;
        }
        return list3;
    }
}
