import java.text.DecimalFormat;
public class Statistician extends OrderedList{

public Statistician(int size){
 super(size);
}

public Statistician(){}
  
  public void add(int item){
   //case 1: the list is empty
   
   //case 2: the list is full
   //case 3: the list is not empty
     //check count
      //if count == 1, check if item to be inserted is less than the getFirstElement
        //addFirst()
        //otherwise,addlat()
        //if item to be inserted is greater than getLastelement, addLast
          //false,once less than, call insertAt
        //if item to be inserted is less than the getFirstElement addFirs
        
  if(isFull())
   doubleTheArray();
  if(isEmpty())
   addFirst(item);
  else {
    if(item < getFirstElement())
      addFirst(item);
    else if(item > getLastElement())
      addLast(item);
    else{
     int pos = getCount() - 1;
     while(pos > 0)
     {
      if(item <= items[pos] && item >= items[pos-1]){
       insertAt(pos,item);
       break;
      }
      pos--;
     }
    }
   }
  
  }
  public void remove(int item){
  int temp = 0;
      for(int i = 0; i < count; i++){
         if(item == items[i]){
            for(int j = 1; j < count-1; j++){
               if(item == items[j]){
                  temp = items[j];
                  items[j] = items[j+1];
                  items[j+1] = temp;
                  
               }
            }
            count--;
            break;
         }
      }
  }

public double getMean(){
   double sum = 0;
   for(int i = 0; i < count; i++){
      sum += items[i];
   }
   
   return sum/count;
}

public void setMode(){
   
}

public double getMedian(){
  double c = count;
           
  return (c+1)/2;
}

public int getLargest(){
   int largest = 0;
   for(int i = 0; i < count; i++){
   
      if(items[i] <= largest)
      largest = items[i];
      else 
      largest = items[i];
   }
   return largest;
}

public int getSmallest(){
   int Smallest = 0;
   for(int i = 0; i < count; i++){
   
      if(Smallest < items[0]){
         Smallest = items[i];
      }
   }
   return Smallest;
}

public double getSum(){
   double sum = 0;
   for(int i = 0; i < count; i++){
      sum += items[i];
   }
   
   return sum;
}

public static void main(String[]args){
   
   Statistician stat = new Statistician();
   DecimalFormat DF = new DecimalFormat("##.00");
   stat.add(7);
   stat.add(4);
   stat.add(3);
   stat.add(10);
   stat.add(9);
   stat.add(5);
   stat.add(6);
   stat.add(8);
   stat.add(2);
   stat.add(1);
   System.out.println("list contains :" + stat);
   System.out.println("Mean: " + stat.getMean());
   System.out.println("Median: "+ stat.getMedian());
   //System.out.println("Median: "+ stat.getMode());
   System.out.println("Smallest: "+ stat.getSmallest());
   System.out.println("Sum/Total: "+ stat.getSum());
   System.out.println("Largest: "+ stat.getLargest());
     
   
   
}
}