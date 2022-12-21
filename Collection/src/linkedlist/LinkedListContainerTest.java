package linkedlist;

public class LinkedListContainerTest {             // assignment --> search a node by its length
													// delete kite by owner name
	public static void main(String[] args) {		// search kite by owner
			// search kite by color
		Kite k1 = new Kite("Red", "Alex", 25, true);						// modify node
		// TODO Auto-generated method stub	
		Kite k2 = new Kite ("Blue","John" , 40, true);
		Kite k3 = new Kite ("Green","Ross" , 70, true);
		Kite k4 = new Kite ("Black","Jos" , 30, true);
		Kite k5 = new Kite("White", "paul", 25,true);
		Kite k6 = new Kite("Pink", "Mortal", 23,true);

		
		MyLinkedList myList = new MyLinkedList();
		myList.add(k1);
		myList.showList0();
		
	//	myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);

		myList.showList0();
		
		System.out.println("===========================");
		//Kite k5 = new Kite("White", "paul", 25,true);
		//myList.addAtBegining(k5);
		
		
//		myList.showList0();
		
	//	myList.searchKiteByLength(70);
	//	myList.searchKiteByName("paul");
		
		
		//myList.deleteWithLength(30);
	//	myList.deleteNodeByOwnerName("John");
//		myList.showList0();
		System.out.println("===========================");

		myList.insertKite("paul", k6);
		myList.showList0();
		System.out.println("===========================");

		myList.deleteKite(k5);
		myList.showList0();
	}

}
class MyLinkedList{
	Kite start;
	Kite ptr;
	Kite prev;
	boolean found;
	
	
	void insertKiteAfter(String ownerToFind, Kite newKite) {                   // Assignment
		ptr = start;
		if(start == null) {
			System.out.println("List is empty..... cannot add this object");
		}
		else if(start.owner.equals(ownerToFind)) {
			addAtBegining(newKite);
		}
		else {
			ptr = start ;
			while(ptr != null){
				if(ptr.owner.equals(ownerToFind)) {
					found = true;
					break;
				
				}
				prev = ptr;
				ptr = ptr.next;
			}
			if (found == true) {
				prev.next = newKite;
				newKite.next = ptr;
				System.out.println("Object inserted before...." + ownerToFind);
			}
			else {
				System.out.println("Object not found...." +ownerToFind);
			}
		}
		
	}
	
//-------------------------------------------------------------------------------
	
	void insertKite(String ownerToFind, Kite newKite) {                    //Assignment
		ptr = start;
		if(start == null) {
			System.out.println("List is empty..... cannot add this object");
		}
		else if(start.owner.equals(ownerToFind)) {
			add(newKite);
		}
		else {
			ptr = start ;
			while(ptr != null){
				if(ptr.owner.equals(ownerToFind)) {
					found = true;
					break;
				
				}
				prev = ptr;
				ptr = ptr.next;
			}
			if (found == true) {
				prev.next = newKite;
				newKite.next = ptr;
				System.out.println("Object inserted before...." + ownerToFind);
			}
			else {
				System.out.println("Object not found...." +ownerToFind);
			}
		}
		
	}
	
	
//--------------------------------------------------------------------------------------	
	
	
	void deleteKite(Kite theKite) {                               //Assignment
		boolean found = false;
		if(start ==  null) {
			System.out.println("List is empty .. nothing to delete");
		}
		else if(start == theKite) {
				prev = start;
				start = start.next;
				prev.next = null;
				System.out.println("Deleted Kite from the begining..");
			}
		else {
			ptr = start;
			while(ptr != null) {
				if(ptr == theKite) {
					found = true;
					break;
				}
				prev = ptr;
				ptr = ptr.next;
			}
			if(found == true) {
				prev.next = ptr.next;
				System.out.println("Internal object deleted..... by Kite reference");
				ptr.next = null;
				ptr = null;
			}
			else {
				System.out.println("Kite not found...");
			}
		}
	}
		
	//--------------------------------------------------------------------------------------	
	
	
	
	
	void deleteNodeByOwnerName(String ownerName) {                  //Assignment
		boolean found = false;
		if (start == null) {
			System.out.println("List is Empty...Nothing to delete");
		}
		else if(start.owner.equals(ownerName)){
			prev = start;
			
			start = start.next;
			prev.next = null;
			System.out.println("Dleted owner from begining....");
		}
		else {
			ptr = start;
		//	prev = ptr;
			while(ptr!= null) {
				if(ptr.owner.equals(ownerName)) {
					found = true;
					break;
				}
			}
			
		}
		
	}
	
	
	//--------------------------------------------------------------------------------------	

	
	
	
	void deleteWithLength(int lengthToDelete)
	{
		if(start==null)
		{
			System.out.println("List is Empty ");
		}
		else
		{
			ptr = start;
			while(ptr!=null)
			{
				if(ptr.length==lengthToDelete)
				{
					System.out.println("Delte the Kite:- "+lengthToDelete);
					prev.next = ptr.next;
				}
					prev = ptr;
					ptr = ptr.next;
			}
		}
	}

	
	//--------------------------------------------------------------------------------------	

	
	
	
	void searchKiteByName(String OwnerToSearch)
	{
		boolean found = false;
		
		if(start==null)
		{
			System.out.println("List is Empty, Nothing to Search");
			
		}
		else
		{
			System.out.println("List is not Empty, Searching");
			ptr = start;
			while(ptr!=null)
			{
				if(ptr.owner==OwnerToSearch)
				{
					System.out.println("Owner Found :-"+ptr);
						found = true;
						break;
				}
					ptr = ptr.next;
					if(found!=true)
					{
						System.out.println("Owner Not Found of this Name"+OwnerToSearch);
					}
			}
		}
	}
	
	//--------------------------------------------------------------------------------------	

	
	
	
	void searchKiteByLength(int lengthToSearch) {
		if(start == null) {
			System.out.println("List is Empty nothing to search");			
		}
		else {
			System.out.println("List is not empty....... searching");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite found " +ptr);
					found = true;
					break;
				}
				System.out.println("DATA :"+ptr);
				ptr=ptr.next;
			}
			if(found != true) {
				System.out.println("Kite not found ...of this length: " +lengthToSearch);
			}
		}
	}
	

	
	//--------------------------------------------------------------------------------------	

	
	
	
	void addAtBegining(Kite newKite) {
		if(start != null) {
			System.out.println("You are at the begining .....");
			newKite.next = start;
			start = newKite;
		}
		else {
			System.out.println("You are the first kite");
			start = newKite;
			
			
		}
	}
	
	
	
	//--------------------------------------------------------------------------------------	

	
	
	
	void showList0() {
		if(start == null) {
			System.out.println("List is Empty");			
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr!=null) {
				System.out.println("DATA :" +ptr);
				ptr=ptr.next;
			}
		}
	}
	
	//--------------------------------------------------------------------------------------	

	
	
	
	void add(Kite newKite) {
		if(start == null) {
			System.out.println("Adding first node...");
			start = newKite;
		//	start.next = null;
		}
		else {
			System.out.println("Adding internal node....");
			ptr =start;
			while(ptr != null) {
				System.out.println("Searching.....");
				prev = ptr;
				ptr = ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
		}
		
	}
}