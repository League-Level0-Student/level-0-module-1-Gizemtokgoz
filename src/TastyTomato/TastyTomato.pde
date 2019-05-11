void setup() {
    size(500, 500);
}
void draw() {
    background(#FFFFFF);
    
    noStroke();
    fill (#EA5C61);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#48ED6F);
    rect(176, 103, 12, 32);
    if (mousePressed) {
      fill (#FFFFFF);
      ellipse(100, 200, 100, 100);
    }
}

   
