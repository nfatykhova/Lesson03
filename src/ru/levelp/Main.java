package ru.levelp;

/**
 * Created by natalie on 26.02.16.
 */
public class Main {

    public static void main(String[] args) {

        // Циклы и массивы

        //  int i = 0; // i - счетчик, обычно начинается с нуля

/*        while (i < 10) { // цикл выполнит 10 итераций
            System.out.println("Я люблю Java " + i); // код, который будет выполняться, пока условие true
            i = i + 1; // после каждого прохода цикла (ИТЕРАЦИИ) i увеличивается на единицу*/

        // 1 2 3
        // a b c
        // надо вывести все возможные пары: сочетание

 /*    i = 1;
        char ch = 'a'; // fn+shift+F6 переименование

        while (i < 4) { // редко используют <=
            while (ch < 'd') {
                System.out.println(i + " " + ch);
                ch++; // инкремент ch на 1 в каждую итерацию
            }
            i++;
            ch = 'a'; // после 2 цикла ch = d
        }
*/
//        int x = 4;
//        x += 3 - 1; // x = x + 3 - 1
//        x -= 7; // x = x - 7
//        x++; // инкремент x +=1; x = x + 1
//        x--; // декремент x -=1; x = x - 1

        // Вывести таблицу умножения

//        int i = 1;
//        int x = 1;
//        while (i < 10) {
//            while (x < 10) {
//                System.out.print(i * x + "\t");
//                x++;
//            }
//            System.out.println(); // пустой sout делает перенос строки
//            x = 1;
//            i++;
//        }

        /*
        FOR  - если мы знаем точное кол-во итераций
        WHILE - бесконечный цикл, ИЛИ не знаем, когда цикл закончится
         */

//        for (int k = 0; k < 5; k++) {    // (инициализация счетчика; условие; операция в конце итерации)
//            System.out.println(k);
//        }

        // можно сделать for (; k < 5; )

//        while (!server.hasConnection()) { // ждем ответа сервера !отрицание
//            System.out.println("Wait");
//        }


//        int[] array = new int[10]; // массив хранит однотипные данные. по дефолту все значения =0
//
//        array[0] = 76; // нумерация у массивов всегда с нуля
//        array[1] = array[0] * 3;
//        // ...
//        array[9] = 494; // заполняется в любом порядке, главное не пропустить

//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) { // .length определяет конец массива
//            // for (int i = array.length - 1; i >= 0; i++) пройдет по массиву с конца
//            array[i] = array.length - i - 1; // если просто -i, то начнет с 20
//         //   break; - аварийно прервать цикл: например, при считывании чисел с файла
//
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // Сортировка

        int array[] = new int[10];
         for (int i = 0; i < array.length; i++) {
             array[i] = (int)(Math.random() * 1042 - 1098); // превращаем диапазон 0::1 в 0::100, смещение границ
             System.out.print(array[i]+" ");
         }

        if (array.length > 0) {
            int min = array[0];
            for (int el =  )
        }
        System.out.println("min = " + min);

//        if (arr.length>0) {
//            int min = arr[0];
//            for(int el:arr) {
//                if (el<min) min=el;
//            }
//            return min;

        // *20 + 45 диапазон 45::60
        // *30 - 77 диапазон -77::47

        // Заполнить в нужном диапазоне -1098 :: -56

        // -347::935
        // всего чисел 935+347 = 1282  кол-во чисел на отрезке
        // math.random()*1282 - 347   сдвигаем диапазон (обе границы)
        // math.random()*L - d  L - длина диапазона, d - сдвиг диапазона

        // Вывести массив в одну строку
        // Вывести мин = ...


    }
}
/* ДЗ
1) Отличие постфиксный и префиксный инкремент/декремент
2) Диапазоны чисел: см на гите (доделать умножение)
Поиск минимума
3) Сортировка "пузырьком" массива случайных чисел - не списывать :)
4) сайт sorting.at - визуализация сортировок
сдвигом, слиянием, вставками
 */

