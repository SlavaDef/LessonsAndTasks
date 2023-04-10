package ExamplesMod7;

public enum Pizza {

    CHEEZ(0.565f,"Сыр"),
    TOMATO(0.220f,"Томат"),
    PAPERONI(0.345f,"Паперони"),
    PYPER(0.165f,"Перец"),
    BICON(0.855f,"Бикон"),
    BOW(1.500f,"Лук"),
    DOUGH(0.900f,"Тесто"),
    MUCHRUMS(0.100f,"Грибы");

   private float kilograms;
   private String trunskription;

    Pizza( float kilograms, String trunskription){
        this.kilograms = kilograms;
        this.trunskription = trunskription;
    }

    public float getKilograms() {
        return kilograms;
    }

    public String getTrunskription() {
        return trunskription;
    }

    @Override
    public String toString() { // @Override toString()
        return "Pizza is completid with "+ trunskription+ ", and the pise of this is about "+ kilograms+"kg";
    }

    public float sum(Pizza another){ // в параметры другой Enum
        return kilograms + another.getKilograms();
    }
}
