PImage mustache; 
PImage friend;
int X=0;int Y=0;
void setup(){
  friend=loadImage("spongebob.jpg");
  size(500,500);
  friend.resize(500,500);
  mustache=loadImage("mustacho.png");
  mustache.resize(200,50);
}
void draw(){
  background(friend);
  if(X>0){
    image(mustache,X,Y);}
    else{
  image(mustache,mouseX,mouseY);}
  if(mousePressed){
  X=mouseX; Y=mouseY;
}
}