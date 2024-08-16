import entities.ListNode;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        list1.next = list2;
        list2.next = list3;

        ListNode newList = new ListNode(1);
        ListNode newList2 = new ListNode(3);
        newList.next = newList2;

        ListNode response = MergeTwoSortedList.merge(list1,newList);
        while(response != null) {
            System.out.println(response.val);
            response = response.next;
        }
    }
}