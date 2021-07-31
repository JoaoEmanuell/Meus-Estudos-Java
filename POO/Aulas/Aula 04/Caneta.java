import java.util.Locale;

public class Caneta {

    // PROPERTIES
        private String model, color;
        private Double tip;
        private Boolean iscaped;

    // CONSTRUCTOR
/* // Simples
    public Caneta(){
        this.iscaped = true;
        this.color = "BLUE";
    }
*/

    // COMPLEXO

    public Caneta(String model, String color, Double tip){
        this.iscaped = true;
        setModel(model);
        setTip(tip);
        setColor(color);
    }
    // GETTERS

    public String getModel(){
        return model;
    }

    public Double getTip(){
        return tip;
    }
    // SETTERS
    public void setModel(String model){
        this.model = model.toUpperCase();
    }

    public void setTip(Double tip){
        this.tip = tip;
    }

    public void setColor(String color){
        this.color = color.toUpperCase();
    }

    // METHODS

    public void uncapping(){
        this.iscaped = false;
    }

    public void cap(){
        this.iscaped = true;
    }

    // STATUS

    /*
     private String model, color;
        private Double tip;
        private Boolean iscaped;
     */

    public String status(){
        return model + " " + color + " " + tip.toString() + " " + iscaped.toString();
    }
}
