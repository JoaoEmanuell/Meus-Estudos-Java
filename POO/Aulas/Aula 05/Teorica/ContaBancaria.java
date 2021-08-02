public class ContaBancaria {
    // PROPERTIES
    private Integer numbercont;
    private String tip, owner;
    private Double balance;
    private Boolean isOpen;

    // CONSTRUCT

    public ContaBancaria(Integer numbercont ,String tip, String owner, Double balance){
        isOpen = true;
        setNumbercont(numbercont);
        setTip(tip);
        setBalance(balance);
        setOwner(owner);
    }

    // GETTERS
    /*
    private Integer numbercont;
    private String tip, owner;
    private Double balance;
     */
    public Integer getNumbercont(){return this.numbercont;}
    public String getTip(){return this.tip;}
    public String getOwner(){return this.owner;}
    public Double getBalance(){return this.balance;}

    // SETTERS
    public void setTip(String tip){
        this.tip = tip.toUpperCase();
    }

    public void setOwner(String owner){
        this.owner = owner.toUpperCase();
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void setNumbercont(Integer numbercont){
        this.numbercont = numbercont;
    }

    public void setIsOpen(Boolean isOpen){
        this.isOpen = isOpen;
    }

    // METHODS

    public void openAccount(){
        setIsOpen(true);
    }

    public String closeAccount(){
        if (this.balance > 0){
            return "Conta com dinheiro";
        } else if(this.balance < 0){
            return "Conta em débito";
        }
        else {
            setIsOpen(false);
            return "true";
        }
    }

    public String deposit(Double value){
        if (!isOpen){
            return "Conta fechada, impossivel depositar, primeiro abra a conta";
        } else{
            Double acutalbalance = getBalance();
            acutalbalance += value;
            setBalance(acutalbalance);
            return "Deposito realizado com sucesso";
        }
    }

    public String withdraw(Double value){
        if (!isOpen){
            return "Conta fechada, impossivel sacar, primeiro abra a conta";
        } else if(value > getBalance()){
            return "Impossivel sacar, valor superior ao disponivel";
        } else {
            Double acutalbalance = getBalance();
            acutalbalance -= value;
            setBalance(acutalbalance);
            return "Valor depositado com sucesso!";
        }
    }

    public String paymonthly(){
        if (!isOpen){
            return "Conta fechada, impossivel pagar mensalidade, primeiro abra a conta";
        } else if(getBalance() < 50.0){
            return "Valor da conta insuficiente para pagar a mensalidade, por favor realize um deposito";
        } else{
            Double acutalbalance = getBalance();
            acutalbalance -= 50.00;
            setBalance(acutalbalance);
            return "R$ 50.00 foram descontados da sua conta";
        }
    }
    // STATUS

    public String status(){
        return this.tip + " " + this.owner + " " + this.balance + " " + this.numbercont + " " + this.isOpen;
    }
}
