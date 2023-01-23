package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int topping;
    boolean ExtraCheeseAdded;
    boolean ExtraToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.ExtraCheeseAdded=false;
        this.ExtraToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;
        this.bill="";
        if(isVeg){
         this.price=300;
         this.topping=70;
        }
        else{
           this.price=400;
           this.topping=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza:"+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ExtraCheeseAdded){
            this.price=this.price+cheese;
            ExtraCheeseAdded=true;
        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!ExtraToppingsAdded){
            this.price=this.price+topping;
            ExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(ExtraCheeseAdded) {
                this.bill += "Extra Cheese Added:"+this.cheese+"\n";
            }
            if(ExtraToppingsAdded){
                this.bill+="Extra Toppings Added:"+this.topping+"\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added:"+"20"+"\n";//concatinating string using "+"
            }
            this.bill+="Total Price:"+ this.price+"\n";
            isBillGenerated=true;

        }
        return this.bill;
    }
}
