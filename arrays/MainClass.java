package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import Heaps.KthSmallestElement;
import LinkedList.InsertionImpl;
import LinkedList.ListNode;
import SlidingWindow.LongestSubstringWithKDistinct;
import binarySearch.CountElementInSortedArray;
import binarySearch.ElementInSortedRotatedArray;
import binarySearch.FindFloor;
import binarySearch.FirstAndLastOccurence;
import binarySearch.IndexOfFirstOne;
import binarySearch.InfiniteArray;
import binarySearch.MinDiffEle;
import binarySearch.NearlySortedArray;
import binarySearch.OrderedLinearSearch;
import binarySearch.PeakElement;
import binarySearch.RotatedArray2;
import binarySearch.RotationCount;
import binarySearch.SearchInRotatedArrayTwo;
import practise.Employee;
import practise.Game;
import practise.LambdaDemo;
import practise.MissingPositive;
import practise.Person;
import practise.Scheduler;
import practise.SendEmails;
import practise.ShowInterface;
import practise.ShowList;
import practise.StaticClassExample;
import practise.Student;
import practise.Swap;
import sorting.MergeSort;
import sorting.Quicksort;
import stack.NearestSmallestLeft;

public class MainClass {

	public static <E> void main(String[] args) throws Exception {
		LongestSubstringWithKDistinct cls = new LongestSubstringWithKDistinct();
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(1);
		a.add(0);
		a.add(1);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(5);

		int a2[] = new int[] { 2, 3, 1, 2, 4, 3 };
		// System.out.println(cls.longestSubstring("aabacbebebe", 3));
		// cls.longestSubstring("aabacbebebe", 3);
		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);

		ListNode node5 = new ListNode(6);
		// ListNode node6 = new ListNode(600);
		// ListNode node7 = new ListNode(1);

		InsertionImpl impl = new InsertionImpl();
		// impl.insertAtBeg(node5, node4);
		impl.insertAtBeg(node4, node3);
		impl.insertAtBeg(node3, node2);
		impl.insertAtBeg(node2, node1);
		impl.insertAtBeg(node1, node);
		node4.setNext(node3);
		// impl.insertAtBeg(node5, node6);
		// impl.insertAtBeg(node6, node7);

		// impl.insertAtEnd(node4, node5);
		// impl.insertion(20, 2, node4);
		// impl.traverse(node1);

		// Reverse reverse = new Reverse();
		// ListNode r= reverse.reverse(node4);
		// System.out.println("After reversal");
		// System.out.println(r.getData());
		// impl.traverse(node);

		// Deletion del = new Deletion();
		// del.deleteFromEnd(node4);
		// del.delete(node4, 2);
		// del.deleteWithoutHead(node2);
		// System.out.println("After deletion");
		// impl.traverse(head);
//
//		 RemoveNthfromEnd remove = new RemoveNthfromEnd();
//		 ListNode r = remove.removeNthFromEnd(node1, 2);
//		 System.out.println(" ");
//		 impl.traverse(node);

//		MiddleElement middle = new MiddleElement();
//		System.out.println(" ");
//		System.out.println(middle.middleNode(node7).getData());

//		 Palindrome pal = new Palindrome();
//		 System.out.println(pal.isPalindrome(node));

		// MergeLists merge = new MergeLists();
		// impl.traverse(node);
		// System.out.println(" ");
		// impl.traverse(node4);
		// System.out.println(" ");
		// System.out.println("After merging");
		// ListNode head = merge.mergeTwoLists(node, node4);

		// impl.traverse(node);
		// SortList sort = new SortList();
		// ListNode newHead =sort.mergeSortList(node1);
		// Reorder r = new Reorder();
		// System.out.println("After reordering ");
		// r.reorderList(node);

		// SwapPairs swap = new SwapPairs();
		// ListNode newHead = swap.swapPairs(node);
		// impl.traverse(newHead);

//		ArrayImplementation stack = new ArrayImplementation();
//		try {
//			System.out.println(stack.isEmpty());
//			stack.pushElement(10);
//			stack.pushElement(20);
//			System.out.println(stack.topElement());
//			stack.popElement();
//			System.out.println(stack.topElement());
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("***********************");
//		LinkedStack<Integer> linkedList = new LinkedStack<>();
//		System.out.println(linkedList.isEmpty());
//		try {
//			linkedList.push(10);
//			linkedList.push(20);
//			System.out.println(linkedList.size());
//
//			System.out.println(linkedList.peek());
//			System.out.println(linkedList.pop());
//			System.out.println(linkedList.pop());
//			System.out.println(linkedList.pop());
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// impl.traverse(node);
//        System.out.println("  After rotation");
//		RotateList rotate = new RotateList();
//		ListNode newHead = rotate.rotateRight(node, 4);
//		impl.traverse(newHead);

		// LinkedListCycle2 cycle = new LinkedListCycle2();
		// System.out.println(cycle.detectCycle(node).getData());

		// CheckBalance bal = new CheckBalance();
		// System.out.println(bal.isValid("(()())"));
		// Postfix fix = new Postfix();
		// System.out.println(fix.evaluateExpression("12+2/5*7+"));
		// Infix in = new Infix();
		// System.out.println(in.evaluateExpression("2 * (5 + 3) / 4"));;

//		MinStack minstack = new MinStack();
//		minstack.pushElement(9);
//		minstack.pushElement(9);
//		minstack.pushElement(1);
//		minstack.pushElement(3);
//		System.out.println(minstack.getMinimum());
//		System.out.println(minstack.popElement());
//		System.out.println(minstack.getMinimum());
//
//		
//		isPalindromeStack isPal = new isPalindromeStack();
//		System.out.println(isPal.isPalindrome("abXaba"));
//		System.out.println(isPal.isPalindrome("true"));
//		System.out.println(isPal.isPalindrome("abaXaba"));

//		ArrayWithTwoStacks arrayWithTwoStacks = new ArrayWithTwoStacks(10) ;
//		arrayWithTwoStacks.push(1, 10);
//		arrayWithTwoStacks.push(1, 9);
//		arrayWithTwoStacks.push(1, 8);
//		arrayWithTwoStacks.push(1, 7);
//		arrayWithTwoStacks.push(1, 6);
//		System.out.println(arrayWithTwoStacks.isEmpty(1));
//		System.out.println(arrayWithTwoStacks.isEmpty(2));
//		arrayWithTwoStacks.push(2, 1);
//		arrayWithTwoStacks.push(2, 2);
//		arrayWithTwoStacks.push(2, 3);
//		arrayWithTwoStacks.push(2, 4);
//		arrayWithTwoStacks.push(2, 5);
//		arrayWithTwoStacks.toString();
//		System.out.println(arrayWithTwoStacks.isEmpty(1));
//		System.out.println(arrayWithTwoStacks.isEmpty(2));
//		
//		
//		System.out.println(arrayWithTwoStacks.top(1));
//		System.out.println(arrayWithTwoStacks.top(2));
//
//		arrayWithTwoStacks.pop(1);
//		arrayWithTwoStacks.push(2, 50);
//		arrayWithTwoStacks.toString();

//
//		FixedSizeArray circular = new FixedSizeArray(10);
//		circular.enQueue(1);
//		circular.enQueue(2);
//		circular.enQueue(3);
//		circular.enQueue(4);
//		circular.enQueue(5);
//		circular.enQueue(6);
//		circular.enQueue(7);
//		circular.enQueue(8);
//		circular.enQueue(9);
//		circular.enQueue(7);
//		circular.dequeue();
//		circular.enQueue(10);
//		System.out.println(circular.size());
//		System.out.println(circular.isEmpty());
//		System.out.println(circular.isFull());
//
//		System.out.println(circular.toString());

//		OutermostBraces outer = new OutermostBraces();
//		String st =outer.removeOuterParentheses("(()())(A+B)");
//		System.out.println(st);

		NearestSmallestLeft near = new NearestSmallestLeft();
		int[] arr = new int[] { 1 };

		OrderedLinearSearch or = new OrderedLinearSearch();
		// System.out.println(or.orderedLinearSearch(arr, 67));

		// System.out.println(bs.binarySearch(arr, 5));
		// bs.runDemo();
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		a1.add(5);

		a1.add(7);


//		int[] result = fl.searchRange(arr1, 8);
//		System.out.println(result[0]);
//		System.out.println(result[1]);

//		List<String> names = new ArrayList<>();
//		System.out.println(names instanceof Object);
//		
//		double d = 241.37;
//		float f = 8.7f;
//		int i =12;
//		System.out.println(d+ f+ i);
//		System.out.println(" ".compareTo("pit"));

		// StaticClassExample p = new StaticClassExample();
		// p.setMsg(null);

//		StaticClassExample.NestedStaticClass print = new StaticClassExample.NestedStaticClass();
//		print.printMessage();
//		StaticClassExample oyter = new StaticClassExample();
//		StaticClassExample.InnerClass inner = StaticClassExample.InnerClass();
//		inner.display();
//		StaticClassExample.NestedStaticClass.printMessage();

//		LambdaDemo demo = new LambdaDemo();
//		demo.simpleLambda();
//		
//		List<Employee> employee = new ArrayList<>();
//		employee.add(new Employee("erarica", 28));
//		employee.add(new Employee("jogn", 27));
//		employee.add(new Employee("derek", 32));
//		ShowInterface<Employee> showName = (o -> System.out.println(o.getName()) );
//		employee.forEach(emp -> showName.display(emp));
//		employee.forEach(System.out::print);
//
//		Person p1 = new Person();
//		System.out.println(p1.getAge());
//		p1.display();
//		System.out.println();
//		 
//		Student s = new Student();
//		System.out.println(s.getAge());
//		s.display();
//		System.out.println();
//		
//		Person p2 = new Student();
//		System.out.println(p2.getAge());
//		p2.display();
//		
//		
//		System.out.println("*****************");
//		Person p3 = s;
//		p3.display();
//		Student s2 = null;
//		s2 = (Student) p3;
//		System.out.println(p3 instanceof Person);
//		System.out.println(p3 instanceof Student);
//
//		List<Person> list = new ArrayList<>();
//		list.add(p1);
//		list.add(p2);
//		list.add(s);
//		//list.forEach(p -> p.display());
//		
//		ListIterator<Person> it = list.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Outer.Inner in = new Outer().new Inner();
//        in.toString()	;
		
//*****************BINARY SEARCH******************
		int[] arr1 = new int[] { 2,2,2,0,2,2};
		
//		BinarySearch bs = new BinarySearch();
//		System.out.println(bs.binarySearch(arr1, 20));
//		System.out.println("first and last");
//		FirstAndLastOccurence fl = new FirstAndLastOccurence();
//		System.out.println(fl.getFirstOccurrence(arr1, 16));;
//		CountElementInSortedArray count = new CountElementInSortedArray();
//		System.out.println(count.countElementsInSortedArray(arr1, 5));
//		
//		RotationCount rot = new RotationCount();
//		System.out.println(rot.rotations(arr1));
//		
//		System.out.println("Element in a sorted array");
//		ElementInSortedRotatedArray ele = new ElementInSortedRotatedArray();
//		System.out.println(ele.getElement(arr1, 0));
//		System.out.println(ele.getElement(arr1, 13));
//		
//		System.out.println("Element in a nearly sorted array");
//
//		NearlySortedArray nearlysorted = new NearlySortedArray();
//		System.out.println(nearlysorted.getElement(arr1, 15));
//
//		System.out.println("Floor");
//
//		FindFloor floor = new FindFloor();
//		System.out.println(floor.findFloor(arr1, 18));
//		
//		System.out.println("Infinite Array");
//		InfiniteArray infi = new InfiniteArray();
//		System.out.println(infi.findElement(arr1, 14));
//		
//		IndexOfFirstOne index = new IndexOfFirstOne();
//		//int[] arr2 = new int[] {  -1,-1,-2};
//		System.out.println(index.getFirstOne(arr2));
//		PeakElement peak = new PeakElement();
//		System.out.println("Peak Element");
//		//System.out.println(peak.getPeakElement(arr2));
//		System.out.println(Math.sqrt(32));
//		SqrtRoot sqrt = new SqrtRoot();
//		System.out.println(sqrt.mySqrt(2147395599));
//		System.out.println(Math.sqrt(2147395599));
		
	    int[] arr2 = new int[] {1,2,3,4,5};
	    
//	    MinDiffEle min  = new MinDiffEle();
//	    System.out.println(min.findMinDiffElement(arr2, 3));

//		System.out.println("Answer is");
//		Solution s = new Solution();
//		System.out.println(s.solution(arr2));
//	    
//	    RotatedArray2 rot = new RotatedArray2();
//	    System.out.println(rot.search(arr2, 3));
//	    
//	    TwoSum twoSum = new TwoSum();
//	     int[] res = twoSum.twoSum(arr2, 8);
//	     System.out.println(res[0] + " " + res[1]);
//	     int[] arr3 = new int[] {0,2,1,-3};
	    		
	     
//	     ThreeSum threeSum = new ThreeSum();
//	     System.out.println(threeSum.threeSum(arr3).size());
//	     
//	     ThreeSumClosest threeSumClosest = new ThreeSumClosest();
//	     System.out.println(threeSumClosest.threeSumClosestOptimized(arr3, 1));
	    
//	    
//	    List<Integer> nList = new ArrayList<>(Arrays.asList(3,5,1,4,2));
//	    nList.stream().filter(e -> e%2 ==0).map(e->e*101).sorted().forEach(e ->System.out.print(e + ", "));
//	    
//	    
//	    BuySellStock profit = new BuySellStock();
//	    System.out.println(profit.maxProfit(arr2));
//	    
//	    
////	    MaxDiffIncElement max = new MaxDiffIncElement();
////	    System.out.println(max.maximumDifferences(arr2));
//	    
//	    BuySellStockTwo bands = new BuySellStockTwo();
////	    System.out.println(bands.maxProfit(arr2));
//	    int[] A = new int[] {7,8,9,11,12};
//	    
//	    MissingPositive missing = new MissingPositive();
//	    System.out.println(missing.solution(A));
	    
	   
//	    int[] A = new int[] {2,5,6,0,0,1,2};
//	    SearchInRotatedArrayTwo search = new SearchInRotatedArrayTwo();
//	    System.out.println(search.search(A, 0));
//	    
//	    Scheduler sch = new Scheduler();
//	    SendEmails send = new SendEmails();
//	    send.send();
//	    
	    int[] qr = new int[] {1,1,1,7,2,1};
//	    Quicksort q =new Quicksort();
//	    q.sortArray(qr);
//	    System.out.println("Merge sort");
//	    MergeSort m = new MergeSort();
//	    m.mergesort(qr);
//	    System.out.println("  ----  ");
//	    KthSmallestElement small = new KthSmallestElement();
//	    System.out.println(small.kSmall(qr, 2));
	    
	    
	    SubarrayK k = new SubarrayK();
	    int count = k.subarraySum(qr, 2);
	    System.out.println(count);

	}

}
