public abstract class Player {
    private String name;
    private String choice;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public abstract void Choice();
}
