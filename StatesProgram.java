/*
    Find the states:

    Eight houses represented as cells, are arranged in a straight line.
    Each day every cell completed with its adjacent cells (neighbors).
    An integer value of 1 represents an active cell and a value of 0 represents inactive cell.
    If the neighbors on both the side of a cell are either active or inactive, the cell becomes inactive on the other day; otherwise cell becomes active.
    The two cells on each end have a single adjacent cell, so assume that the occupied space on the opposite side is an inactive cell.
    Even after updating cell state, consider it's previous state when updating the state of other cells.
    The state info of all cells should be updates simultaneously.

Write an algorithm to output state of the cells after the given number of days.

Input:
The input to the function consists of two arguments:
state: a list of integers representing the current state of cells. days: an integer representing the number of days.

Output:
Return a list of integers representing the state of cells after the given number of days.

Sample Input:

Testcase 1:
Input: 
[1, 0, 1, 1, 0, 1, 0],
3

Expected Return Value:
[1, 1, 0, 0, 0, 1, 1]

Testcase 2:
Input: 
[0, 0, 1, 0, 0, 1, 1], 
5

Expected Return Value:
[1, 0, 1, 0, 1, 0, 1]

*/
class StatesProgram {
  public static void main(String[] args) {
    findStates(new int[]{0, 0, 1, 0, 0, 1, 1}, 5);
  }

  public static void findStates(int[] array, int days){

    // Boundary Case 1
    if(days<0) return;
    // Boundary Case 2
    if(days==1) {printArray(array); return;}

    int prev=0;
    for(int i=0; i<days;i++){
      prev=0;
      for(int j=0; j<array.length-1;j++){
        int current=array[j];

        if(j==array.length-2){
          array[j]=nextState(prev, array[j+1]);
          prev=current;
          array[j+1]=nextState(0, prev);
          break;
        }else{
          array[j]=nextState(prev, array[j+1]);
          prev=current;
        }
      } // j-loop ends here
    } // i-loop ends here
    printArray(array);
  }

  static int nextState(int a, int b){
    if(a==b) return 0;
    else return 1;
  }

  static void printArray(int [] array){
    
    for(int i=0; i<array.length;i++){
      System.out.print(array[i] +" ");
    }
    System.out.println();
  }

}