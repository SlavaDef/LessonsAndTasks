package ExamplesMod7;

class Peoples {

    private int age, id;
    private String name, surName, mobPhone, keyWord, password, webPage;

    public Peoples(){

    }

    public Peoples(int age, int id, String name, String surName, String mobPhone, String keyWord, String password, String webPage) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.mobPhone = mobPhone;
        this.keyWord = keyWord;
        this.password = password;
        this.webPage = webPage;
    }

    @Override
    public String toString() {
        return "Peoples{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", mobPhone='" + mobPhone + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", password='" + password + '\'' +
                ", webPage='" + webPage + '\'' +
                '}';
    }

    public static OptimizeWithBilder getOptimizeWithBilder(){
        return new OptimizeWithBilder();
}

    // если много полей то конструктор и много сетеров это не очень на помощь прийдет StringBilder;
    public static class OptimizeWithBilder {
        private int age, id;
        private String name, surName, mobPhone, keyWord, password, webPage;

public OptimizeWithBilder id(int id){
    this.id = id;
    return this; // поточный обьект по сути билдер  return сам себя
}

public OptimizeWithBilder name(String name){
    this.name = name;
    return this;
}
        public Peoples build() {
            return new Peoples(age, id, name, surName, mobPhone, keyWord, password, webPage);
        }
    }
}