public class Lutador {

    // PROPRIETIES
    private String name, nationality, category;
    private Integer age, victories, defeats, draws;
    private Double height, weight;

    // CONSTRUCT

    public Lutador(String name, String nationality, Integer age, Double height, Double weight, Integer victories, Integer defeats, Integer draws){
        setAge(age);
        setDefeats(defeats);
        setDraws(draws);
        setHeight(height);
        setName(name);
        setNationality(nationality);
        setVictories(victories);
        setWeight(weight);
        setCategory();
    }

    // GETTERS

    public String getName(){ return this.name; }

    public String getNationality(){ return this.nationality; }

    public String getCategory(){ return this.category; }

    public Integer getAge(){ return this.age; }

    public Integer getVictories(){ return this.victories; }

    public Integer getDefeats(){ return this.defeats; }

    public Integer getDraws(){ return this.draws; }

    public Double getHeight(){ return this.height; };

    public Double getWeight(){ return this.weight; }
    // SETTERS

    public void setName(String name){ this.name = name; }

    public void setNationality(String nationality){ this.nationality = nationality.toUpperCase(); }

    private void setCategory(){
        if (getWeight() >= 52.2 && getWeight() <= 70.3){
            this.category = "LEVE";
        } else if(getWeight() <= 83.9){
            this.category = "MÉDIO";
        } else if(getWeight() <= 120.2){
            this.category = "PESADO";
        } else{
            this.category = "INVALIDO";
        }
    }

    public void setAge(Integer age){ this.age = age; }

    public void setVictories(Integer victories){ this.victories = victories;}

    public void setDefeats(Integer defeats){ this.defeats = defeats; }

    public void setDraws(Integer draws){ this.draws = draws; }

    public void setHeight(Double height){ this.height = height; }

    public void setWeight(Double weight){ this.weight = weight; setCategory();}

    // METHODS

    public String Present(){
        print(getName().toString() + " Com " + getVictories().toString() + " Vítorias " + "Irá lutar hoje!");
        return getName();
    }
    /*
        private Short name, nationality, category;
        private Integer age, victories, defeats, draws;
        private Double height, weight;
     */
    public String Status(){
        return getName() + " " + getNationality() + " " + getAge() + " " +
                getHeight() + " " + getWeight()+ " " + getCategory() + " " +
                getVictories() + " " + getDefeats() + " " + getDraws();
    }

    public Integer winFight(){
        setVictories(getVictories() + 1);
        return getVictories();
    }

    public Integer loserFight(){
        setDefeats(getDefeats() + 1);
        return getDefeats();
    }

    public Integer drawFight(){
        setDraws(getDraws() + 1);
        return getDraws();
    }
    public static void print(String text){
        System.out.println(text);
    }
}


