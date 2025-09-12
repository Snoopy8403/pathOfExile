
public class Char {
    private CharType type;
    private String name;
    private int level = 1;
    private int strength = 20;
    private int dexterity = 20;
    private int intelligence = 20;

    public CharType getType() {
        return type;
    }

    public void setType(CharType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isTypeValid(){
       return type != null;
   }

    public boolean isNameValid() {
        return name.length() >= 3 && name.length() <= 20;
    }

    public boolean isLevelValid() {
        return level >= 1 && level <= 100;
    }

    public boolean isStrengthValid() {
        return strength >= 0;
    }

    public boolean isDexterityValid() {
        return dexterity >= 0;
    }

    public boolean isIntelligenceValid() {
        return intelligence >= 0;
    }



}
