public class ControleRemoto implements Controlador {
    // PROPRIETIES
    private Integer volume;
    private Boolean isOn, playing;

    // CONSTRUCT

    public ControleRemoto(){
        this.volume = 50;
        this.isOn = false;
        this.playing = false;
    }

    // GETTERS

    private Integer getVolume(){
        return volume;
    }

    private Boolean getIsOn(){
        return isOn;
    }

    private Boolean getPlaying(){
        return playing;
    }

    // SETTERS

    private void setVolume(Integer volume){
        this.volume = volume;
    }

    private void setIsOn(Boolean isOn){
        this.isOn = isOn;
    }

    private void setPlaying(Boolean playing){
        this.playing = playing;
    }
    // ABSTRACTS METHODS
    @Override
    public void bind() {
        setIsOn(true);
    }

    @Override
    public void off() {
        setIsOn(false);
    }

    @Override
    public void openMenu() {
        print(getIsOn().toString());
        print(getVolume().toString());
        for (int i = 0; i <= getVolume(); i += 10){
            System.out.print("|");
        }
        print(getPlaying().toString());
    }

    @Override
    public void closeMenu() {
        print("Fechando o menu!");
    }

    @Override
    public void increaseVolume() {
        if (this.getIsOn() && this.getVolume() <= 100){
            setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.getIsOn() && this.getVolume() >= 0){
            setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void callmute() {
        if (this.getIsOn() && this.getVolume() >= 0){
            this.setVolume(0);
        }
    }

    @Override
    public void mutedoff() {
        if (this.getIsOn() && this.getVolume() >= 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getIsOn() && !this.getPlaying()){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.getIsOn() && this.getPlaying()){
            this.setPlaying(false);
        }
    }

    protected static void print(String text){
        System.out.println(text);
    }
}
