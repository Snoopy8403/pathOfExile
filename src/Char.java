
public class Char {
    CharType type;
    String name;
    int level = 1;
    int strength = 20;
    int dexterity = 20;
    int intelligence = 20;

    boolean isNameValid() {
        return name.length() >= 3 && name.length() <= 20;
    }

    boolean isLevelValid() {
        return level >= 1 && level <= 100;
    }

    boolean isStrengthValid() {
        return strength >= 0;
    }

    boolean isDexterityValid() {
        return dexterity >= 0;
    }

    boolean isIntelligenceValid() {
        return intelligence >= 0;
    }



}
