int Y=0;int X=400;
int randomNumber=400;
void setup(){size(800,500);
}
void draw(){
 
  noStroke();
drawFish(); 

fill(#ffce00);

  ellipse(randomNumber,Y,10,10);
  
  ellipse(randomNumber+50,Y,10,10);

  ellipse(randomNumber+100,Y,10,10);
 
  ellipse(randomNumber+150,Y,10,10);
  Y=Y+4;
  if(Y>height){
     randomNumber = (int) random(width-200);
    Y=0;}
}
 void drawFish(){

  background(141,233,237);

  noStroke();

  fill(255,255,255);

  ellipse(mouseX-17,mouseY-17,20,20); //back side eye

  fill(255,200,88);

  ellipse(mouseX,mouseY,90,50); //body

  triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail

  stroke(0);

  triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin

  noStroke();

  fill(255,200,88);

  ellipse(mouseX,mouseY,15,15); //side fin cover

  noStroke();

  fill(255,255,255);

  ellipse(mouseX-25,mouseY-15,20,20); //front eye

  fill(0,0,0);

  ellipse(mouseX-25,mouseY-15,5,5); //pupil

  fill(141,233,237);

  ellipse(mouseX-45,mouseY,25,25); //mouth

}