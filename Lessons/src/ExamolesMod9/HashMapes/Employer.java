package ExamolesMod9.HashMapes;

import java.util.Objects;

public class Employer {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override // переопределяем метод
    public int hashCode() { // используем готовый метод Objects.hash()
        return Objects.hash(id,name); // прописываем все поля по которым будет идти сравнение
    }

    // правила равности по equals
    // o1.equals(o1) - рефлекствность = обьект должен быть равен самому себе
    // симетричность - o1.equals(o2)==o2.equals(o1) при смене местами обьекты должны оставаться равными
    // Транзитивность - o1.equals(o2) && o2.equals(o3) => o1.equals(o3)

    @Override
    public boolean equals(Object obj) {
        if(this==obj) { // first rule сравниваемый обьект должен быть равен
            return true;
        }if(obj == null || getClass()!=obj.getClass()){
            return false;
        }
        Employer employer = (Employer) obj;

        return this.id == employer.id && Objects.equals(this.name,employer.name);
    }
}
