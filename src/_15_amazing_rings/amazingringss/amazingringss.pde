int x = 400;
int y = 500;
int a = 600;
int b = 1;

void setup(){
  size(1000, 1000);
  
}
void draw(){
  background(255);
  for(int i = 20;i>=0;i--){
    noFill();
    ellipse(x, y, i*25, i*25);
    x = x + b;
    ellipse(a, 500, i*25, i*25);
    a= a - b;
    if(x>1000){
      b = -b;
    }
    else if(x<0){
      b= -b;
    }
    
    else if(a<0){
      b = -b;
    }
    else if(a>1000){
      b = -b;
    }
    
  }
}
