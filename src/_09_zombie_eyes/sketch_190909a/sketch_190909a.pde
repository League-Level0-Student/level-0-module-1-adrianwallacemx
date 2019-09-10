void setup(){
   PImage face = loadImage("dog.jpg");    

size(500,500);

image(face,0,0);

    }

    void draw(){
      println(mouseY);
      fill(mouseY, mouseX, mouseX);
ellipse(230,150,50,50);
ellipse(380,160,50,50);

    }
