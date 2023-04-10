package ExamplesMod7;

import java.util.Arrays;

public class CustomStringBilder {

    // идея StringBilder это накопление рядков в массиве байтов не рядков


   // private int COPASITY = 1024*1024; // = 1mb of memory
   private int COPASITY = 16;

    private byte [] bytes = new byte[COPASITY];

     private int currentLight = 0; // длинна заполнености массива

    public void append(String str){
        byte[] newBytes = str.getBytes(); // переводтим строку в байты

        int minLength = newBytes.length + currentLight;

           if(minLength > COPASITY){ // если длинна масиву+ currentLight больше условной длинны массива
           int newCopasity = Math.max((COPASITY*2),minLength);// макс из первоночальной длинны *2 или int minLength
             COPASITY = newCopasity;
              bytes =  Arrays.copyOf(bytes,newCopasity);// наш масив будет равен новому массиву + нов длинна newCopasity
}

        // 1 - что копируем, 2 - с какой позиции, 3 - куда копируем, 4 - с какого индекса записывать,
        // 5 кол во элементов которые копируем

        System.arraycopy(newBytes,0, bytes, currentLight, newBytes.length); // возмет один массив и допишет его в след
        currentLight+=newBytes.length;

    }

    @Override
    public String toString() {

        // конструктор String принимает массив байтов с какого индекса  до какого выводим, остаток обрезаем
        return new String(bytes,0,currentLight); // все что сверх currentLight будет delate
    }

    public void append2(String str){
        // чому час виконання цього методу 20631, а з прикладу 44, додавання працюэ коректно.
        // без if + невеликi змiни у методi Arrays.copyOf
        // newBytes.length+bytes.length = довжина масиву байтiв + довжина вхiдного массиву

        byte[] newBytes = str.getBytes();

        bytes =  Arrays.copyOf(bytes,newBytes.length+bytes.length);

        System.arraycopy(newBytes,0, bytes, currentLight, newBytes.length);

        currentLight+=newBytes.length;

    }

    public void append3(String str){
        byte[] newBytes = str.getBytes();
        COPASITY = currentLight+newBytes.length;

        System.arraycopy(newBytes,0, bytes, currentLight, newBytes.length);
        currentLight+=newBytes.length;

    }
    public void append(int ithem){ // перегрузка метода для int
        append(Integer.toString(ithem));// принимает в себя int параметр и переводит его в строковое представление


    }


    public static void main(String[] args) {
        CustomStringBilder customStringBilder = new CustomStringBilder();

        customStringBilder.append2("66");
        customStringBilder.append2(" = ");
        customStringBilder.append2("whot? ");
        customStringBilder.append2("you saying mutherfaca about yesterday meeting in four oclock after half day...");
        customStringBilder.append2(" 6jjjj");
        customStringBilder.append2("  lllll");

        String res = customStringBilder.toString();
        System.out.println(res);
    }
}
