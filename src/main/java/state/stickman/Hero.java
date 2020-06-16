package state.stickman;

import org.json.simple.JSONObject;

public class Hero extends MovableEntity {

    double lives = 3;
    State state;
    String size;

    /**
     * @param path
     * @param xPos
     * @param yPos
     * @param height
     * @param width
     */

    public Hero(JSONObject heroInfo){
        this.imagePath = heroInfo.get("path").toString();
        this.xPos = Double.parseDouble(heroInfo.get("xPos").toString());
        this.size = heroInfo.get("size").toString();
        if (size.equalsIgnoreCase("tiny")){
            this.height = 34*0.8;
            this.width = 20*0.8;
            this.yPos = 300-height;
        }
        if (size.equalsIgnoreCase("normal")){
            this.height = 34;
            this.width = 20;
            this.yPos = 300-height;
        }
        if (size.equalsIgnoreCase("large")){
            this.height = 34*1.2;
            this.width = 20*1.2;
            this.yPos = 300-height;
        }
        if (size.equalsIgnoreCase("giant")){
            this.height = 34*1.6;
            this.width = 20*1.6;
            this.yPos = 300-height;
        }
        state = new NormalState();
    }


    @Override
    public String getIdentifier() {
        return null;
    }

    public void jump(){
        yPos = state.jump(yPos, yVelocity);
        return;
    }

    public void walk(){
        xPos = state.walk(xPos, xVelocity);
        return;
    }

    @Override
    public void setImagePathLeft() {
        imagePath = "ch_walk6.png";
        return;
    }

    @Override
    public void setImagePathRight() {
        imagePath = "ch_walk2.png";
        return;
    }

    @Override
    public void setImagePathJump() {
        imagePath = "ch_stand1.png";
        return;
    }


    public boolean subtractLife(){
        this.lives -= 1;
        if (this.lives < 0){
            return false;
        }
        return true;
    }

    public double getLives(){
        return this.lives;
    }

    public void setState(State state){
        this.state = state;
    }


}


