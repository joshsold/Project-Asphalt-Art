import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */

/*calls all functions to create mural */
public class DawgPainter extends MuralPainter {
public void paintBeauty(){
  paintShadow();
  paintBody();
  paintFace();
}
/*
*paints shadow of dog
*/
  public void paintShadow(){
  while(!isFacingEast()){
    turnLeft();
  }
    /*resets position so no matter when function called, the code is able to excecute*/
  resetPosition();
  turnRight();
while(getY() != 21){
  move();
}
    
  turnLeft();
paintLine("dimGray", 9);
while(getX() != 13){
  move();
/*
  *until coordinate is = to (13, 21), painter moves
  */
}
    
turnToWest();
paintLine("dimGray", 14);
turnToEast();
paintLine("dimGray", 16);
turnToWest();
paintLine("dimGray", 17);
turnToEast();
  paintLine("dimGray", 17);
  turnToWest();
  move();
  paintLine("dimGray", 17);
  turnToEast();
  paintBackground("dimGray", 32);
  }
  /*
  *color = dimGray
  *every time meets border, moves one unit down and continues to paint
  */
  /*
  *resets position again 
  */
public void paintBody(){
  resetPosition();
while(getX() != 12){
  move();
}
turnRight();
while(getY() != 31){
  move();
}
paint("white");
turnToNorth();
paintLine("white", 2);
move();
turnToSouth();
paintLine("white", 4);
turnToNorth();
paintLine("white", 5);
stride(14);
  turnToSouth();
paintLine("white", 6);
  stride(9);
paintLine("white", 5);
turnToNorth();
  paintLine("white", 22);
  turnToSouth();
  paintLine("white", 23);
  turnToNorth();
  paintLine("white", 25);
  turnToSouth();
  move();
  paintLine("white", 25);
  turnToNorth();
  paintLine("white", 26);
  turnToSouth();
  move();
  paintLine("white", 26);
turnToNorth();
  paintLine("white", 26);
  turnToSouth();
  move();
  paintLine("white", 26);
turnToNorth();
  paintLine("white", 26);
  turnToSouth();
  move();
  paintLine("white", 26);
  turnToNorth();
  paintLine("white", 25);
  turnToSouth();
  stride(3);
  paintLine("white", 23);
  turnToNorth();
  paintLine("white", 22);
  turnToSouth();
  stride(3);
  paintLine("white", 7);
  /* small function where painter moves amount of times written inside parenthesis in stride
  */
  stride(9);
  
  paintLine("white", 4);
  turnToNorth();
  paintLine("white", 3);
}
  /* silhouette of dog painted
  */
  /*
  *final function, resets position, paints facial features of the dog */
  public void paintFace(){
    resetPosition();
 while(getX() != 19){
   
   move();
  }
    turnRight();
while(getY() != 8){
  move();
}
turnLeft();
  paint("black");
    while(getX() != 27){
      move();
    }
  paint("black");
   turnRight();
stride(4);
    paintLine("paleVioletRed", 5);
turnRight();
    move();
    turnRight();
    paintLine("paleVioletRed", 3);
    paintLine("black", 3);
    paint("paleVioletRed");
   /* error with functions, tried to make new functions to adapt but didnt work*/
    turnLeft();
    move();
    turnLeft();
    paintLine("black", 6);
    paintLine("paleVioletRed", 3);
turnRight();
move();
    turnRight();
    move();
    paintLine("paleVioletRed", 2);
    paintLine("black", 6);
    paint("paleVioletRed");
turnLeft();
    move();
    turnLeft();
    paint("paleVioletRed");
    move();
    paintLine("black", 6);
    paintLine("paleVioletRed", 2);
turnRight();
    move();
    turnRight();
    move();
    paintLine("paleVioletRed", 3);
    paintLine("black", 5);
    paint("paleVioletRed");
    turnLeft();
    move();
    turnLeft();
    paintLine("black", 4);
    paintLine("paleVioletRed", 4);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("paleVioletRed", 5);
    paintLine("black", 2);
    paint("paleVioletRed");
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("paleVioletRed", 5);
    move();
    turnLeft();
    paintLine("black", 4);
    stride(2);
    paintLine("black", 4);
    
  }

}




