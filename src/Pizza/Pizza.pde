 void setup(){
        size(1000,1000);
        background(#986767);
        
    }

    void draw(){
       fill(#955F0C);
       ellipse(500, 500, 900, 900);
        fill(#E6F528);
       ellipse(500, 500, 800, 800);
       
       PImage pepperoni = loadImage("Pepperoni-3.png"); {
         pepperoni.resize(500, 500);
         image(pepperoni, 400, 400);
       }
       
       PImage KingJong = loadImage("King.png, 100, 100");
       
       image(toppingImage, x, y);
    }