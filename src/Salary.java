/*
15 янв 2021. Программа подсчёта заработной платы исходя из количества отработанных минут.
 */
public class Salary {
    public static void main(String[] args) {
        // Тут мы экономим время, чтобы писать вместо целого слова, одну-две буквы
        String v = " Выходной";
        String sb = " Суббота";
        String vs = " Воскресенье";
        String j = " января: ";
        String h = " час. ";
        String m = " мин. ";
        String al = "Всего минут: ";
        String zp = ". Зарплата: ";
        // Далее мы "сходим с ума" и все цифры пишем через переменные, чисто для тренировки ;)))
        String a = "0";
        int b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, r = 7, i = 8, k = 9;
        // В часе - 60 минут
        int m60 = 60;
        System.out.println("Считаем зарплату за Январь:");
        System.out.println();
        System.out.println("Календарные дни:");
        System.out.println(a+b+j+v);
        System.out.println(a+c+j+v);
        System.out.println(a+d+j+v);
        int d04h = 8, d04m = 7; // Рабочий день 4 января - 8 часов, 7 минут
        System.out.print(a+e+j+d04h+h+d04m+m);
        int min = d04h * m60 + d04m;
        System.out.print(al+min+zp);
        double sph = 0.76;
        System.out.println(min * sph);
        int d05h = 8, d05m = 24;
        System.out.println(a+f+j+d05h+h+d05m+m);
        System.out.println(a+g+j+v);
        System.out.println(a+r+j+v);
        System.out.println(a+i+j+v);
        System.out.println(a+k+j+v);
    }
}
