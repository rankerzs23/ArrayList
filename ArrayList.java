/*
 Operations on list:
 1. determine whether the array is empty
 2. determine whether the array is full
 3. find the size of list
 4. clear the list
 5. determine whether the item is the same as a given list element
 6. insert an item in the list at the specified location
 7. remove an item from the list at the specified location
 8. replace an item at the specified location with another item
 9. retrieve an item from the list from the specified location
 10 search the list for a given item.
*/

public class ArrayList{
 //instance variables
 public int count;//monitor the number of elements
 public int items[];//storage of elements
 private int catches[];
 private int nums;
 
 
 public ArrayList (int size){
  items = new int[size];
  count = 0;
 }
 
 public ArrayList(){
  this(10);
 }
 

public boolean isEmpty(){
 return count == 0;
}

public void clear(){

 for(int i = 0; i < count ; i++)
  items[i]  = 0;
 count = 0;
}

public boolean isFull(){
 return count == items.length;
}


public void doubleTheArray(){
 int temp[] = new int[items.length * 2];
 //transfer all elements from the old array
 for(int i = 0; i < items.length; i++)
  temp[i ] = items[i];
 items = temp;
}

public void insertAt(int pos, int item){
 if(pos >= 0 && pos <= count)
    shiftRight(pos);
    items[pos] = item;
       count++;
}

public void shiftRight(int pos){
 int c = count;
 while(c > pos){
  items[c] = items[--c];
 }
}

public void shiftLeft(int pos){
 int c = count;
 while(c > pos){
  items[c] = items[++c];
 }
}



public int getCount(){
 return count;
}
 
//for display
public String toString(){
 StringBuffer sb = new StringBuffer();
 sb.append("{");
 for(int i = 0; i < count; i++)
  sb.append(items[i] + " ");
 sb.append("}");
return sb.toString();
}

public void add(int item){
 items[count++] = item;
}     

public boolean determine(int pos, int item){

 return items[pos] == item;
} 

public void remove(int item){
   int temp = 0;
   for(int i = 0; i < count;i++){
   if(item==items[i]){
   for(int j = 1; j < count-1;j++){
    if(items[j] == item){
      temp = items[j];
      items[j] = items[j+1];
      items[j+1] = temp;
            
    }
    }
    count--;
   // catches[nums++] = item;
    }
  }
}

public void removeLast(){
   int temp = 0;
   for(int i = 0; i < items.length; i++){
      temp = items[i];
      items[i] = items[items.length - i -1];
      items[items.length - i -1] = temp;
   }
   count--;
}
public void removeFirst(){
   
}


public void replace(int pos, int item){
   items[pos] = item;
}

public boolean search(int item){
   boolean check = false;
   for(int i = 0;i < count;i++){
      if(items[i]==item)
      check = true;
   }
   return check;
}

public void retrieve(int item){
   for(int i = 0; i<nums; i++){
      if(catches[i] == item)
      add(item);
   }
}

public int getFirstElement(){
 if(items != null)
  return items[0];
 else return 0;
}

public int getLastElement(){
 if(items != null)
  return items[count-1];
 else return 0;
}

public void addLast(int item){
 items[count++] = item;
}

public void addFirst(int item){
   if(count>0)
   insertAt(0,item);
   else{
      items[0] = item;
      count++;
   }
}

 //for testing purposes
 public static void main(String [] args){
  ArrayList list = new ArrayList();
  list.add(5);
  list.add(6);
  list.add(4);
  list.add(3);
  list.add(9);
  list.add(8);
  list.remove(8);
  list.removeLast();
  if(list.search(4) == true)
  System.out.println("The element is Found!");
  else
  System.out.println("The element is not Found!");
  System.out.println("list = " + list);
  System.out.println("It is in the Elements: "+list.determine(2,2));
  
 }

}