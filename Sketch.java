import processing.core.PApplet;

public class Sketch extends PApplet {
	
    float sunX = 100;
    float sunY = 100;

    float r = 255;
    float g = 100;
    float b = 0;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup(){}
  
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //Backround
    if(mousePressed){
      background(0);
    }
    else{
      background(50, 150, 200);
    }

    //Sun / Moon
    if(mousePressed){
      fill(255);
    }
    else{
      fill(255, 255, 0);
    }
    stroke(0);

    if(keyPressed){
      if (keyCode == UP){
        sunY--;
      } 
      else if (keyCode == DOWN){
        sunY++;
      } 
      else if(keyCode == LEFT){
        sunX--;
      }
      else if(keyCode == RIGHT){
       sunX++; 
      }
    }
    ellipse(sunX, sunY, 75, 75);

    //House
    drawHouse(width, height);
    //Grass
    drawGrass(width, height);
    //Flower
    drawFlower(width, height, width, height);
    //key code function
    textSize(50);
    text(key, 550, 575);
    //Dog
    drawDog();
    
  }

  /**
   * Draws a house 
   * @param widthHouse integer value that will comput width values of the components in the house
   * @param heightHouse integer value that will comput height values of the components in the house
   */
  public void drawHouse(int widthHouse, int heightHouse){

    fill(96, 130, 182);
    stroke(0);
    rect((float) (width/4), (float) (height/2), (float) (width/2), (float) (width/3));
 
    triangle((float) (widthHouse/4), (float) (heightHouse/2), (float) (widthHouse * 0.75), (float) (heightHouse/2), (float) (widthHouse/2), (float) (heightHouse/3));
    fill(255, 50, 50);
    rect((float) (widthHouse/2.181818182), (float) (heightHouse/1.5), (float) (widthHouse/8), (float) (heightHouse/6));
 
    fill(0, 0, 0);
    ellipse((float) (widthHouse * 0.55), (float) (heightHouse/1.304347826), (float) (widthHouse/75), (float) (heightHouse/75));
 
    fill(255);
    rect((float) (widthHouse * 0.316666666), (float) (heightHouse * 0.55), (float) (widthHouse/12.5), (float) (heightHouse/12.5));
    fill(0);
    line((float) (widthHouse * 0.356666666), (float) (heightHouse * 0.55), (float) (widthHouse * 0.356666666), (float) (heightHouse * 0.63));
    line((float) (widthHouse * 0.316666666), (float) (heightHouse * 0.59), (float) (widthHouse * 0.396666666), (float) (heightHouse * 0.59));
  }
  
  /**
   * Draws the grass
   * @param widthgrass integer value that will comput the width of the grass 
   * @param heightgrass integer value that will comput the height of the grass
   */
  public void drawGrass(int widthgrass, int heightgrass){
      
    fill(100, 250 , 50);
    stroke(0);
    rect(0, (float) (heightgrass/1.2), widthgrass, heightgrass);
  }

  public void mouseWheel(){
    r = 150;
    g = 111;
    b = 214;
  }

  /**
   * Draws a flower
   * @param widthflower width of the flower
   * @param heightflower height of the flower
   * @param flowerX X cordinate of flower
   * @param flowerY Y cordinate of flower
   */
  public void drawFlower(int widthflower, int heightflower, float flowerX, float flowerY){

    //Draw green stem
    strokeWeight(10);
    stroke(0, 128, 0);
    line( (float)(flowerX * .875), (float)(flowerY * .917), (float) (widthflower * .875), (float)(heightflower / 1.2));

    //Change stroke back to thin black line
    strokeWeight(1);
    stroke(0);

    //Draw petals
    fill(r, g, b);
    ellipse((float) (flowerX *.85), (float) (flowerY *.801), (float) (widthflower/18), (float) (heightflower/18));
    ellipse((float) (flowerX *.85), (float) (flowerY *.857), (float) (widthflower/18), (float) (heightflower/18));
    ellipse((float) (flowerX *.9), (float) (flowerY *.801), (float) (widthflower/18), (float) (heightflower/18));
    ellipse((float) (flowerX *.9), (float) (flowerY *.857), (float) (widthflower/18), (float) (heightflower/18));

    //Draw middle part
    if(keyPressed){
      fill(255, 0, 0);
    }
    else{
      fill(255, 128, 0);
    }
    ellipse((float) (flowerX * .875), (float)(flowerY / 1.2), (float) (widthflower/20), (float) (heightflower/20));
  }

  public void drawDog(){

    //Head
    fill(102, 51, 0); 
    triangle(mouseX-30, mouseY-10, mouseX, mouseY-40, mouseX, mouseY+20); 
    triangle(mouseX, mouseY-40, mouseX, mouseY-50, mouseX-10, mouseY-45); 
    line(mouseX-20, mouseY, mouseX-10, mouseY); 
    line(mouseX-10, mouseY, mouseX-5,mouseY-8); 

    fill(mouseX, 0, mouseY); 
    ellipse(mouseX-8, mouseY-20, 10, 10); 

    //Body
    fill(102, 51, 0); 
    rect(mouseX, mouseY, 80, 50); 
    rect(mouseX, mouseY+50, 15, 20); 
    rect(mouseX+65, mouseY+50, 15, 20); 
    line(mouseX+100, mouseY, mouseX+60, mouseY); 
  }
	
}
