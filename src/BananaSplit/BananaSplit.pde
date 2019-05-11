int Ice = 25;
int Cream = 25;

void setup() {
  size (100,100);
}

void draw() {
  background(#EAA3E3);
  for (int i = 1; i <= 3; i++) {
    text("ice cream", Ice, Cream +10*i);
  }
  text("banana", 25, 65);
}
