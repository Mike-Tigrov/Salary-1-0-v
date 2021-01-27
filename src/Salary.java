/*
Создано 15 янв 2021. Программа подсчёта заработной платы исходя из количества отработанных минут.
По мере повышения опыта, проект будет модернизирован.

Конечная цель:
1. Бесплатное приложение на Google play market для вычисления зарплаты по часам;
2. Реклама встроена в приложение;

Идеи для реализации:
- Конвертер времени - из часов и % по минутам в минуты;
- Графики по месяцам;
- Сравнение зарплаты полученной и прогнозной;
- Встроенный календарь;
- Сколько надо часов для выполения плана по часам;
 */
public class Salary {
    public static void main(String[] args) {
        // Тут мы экономим время, чтобы писать вместо целого слова, одну-две буквы
        String v = "Выходной";
        String sb = " Суббота";
        String vs = " Воскресенье";
        String j = " января: ";
        String h = " час. ";
        String m = " мин. ";
        String al = "Всего минут: ";
        String zp = ". Зарплата: ";

        // Далее мы "сходим с ума" и все даты пишем через переменные, качаем внимательность к деталям ;)))
        String a = "0", b = "1", c = "2"; //Первые три через текстовый тип, чтобы они не складывались при выводе
        int d = 3, e = 4, f = 5, g = 6, r = 7, i = 8, k = 9;
        int m60 = 60; // В часе - 60 минут
        double sph = 0.76; // Ставка зарплаты за 1 минуту

        // Список дней (календарных)
        System.out.println("Считаем зарплату за Январь:");
        System.out.println();
        System.out.println("Календарные дни:");
        System.out.println(a+b+j+v);
        System.out.println(a+c+j+v);
        System.out.println(a+d+j+v);

        // Рабочий день 4 января - 8 часов, 7 минут
        int d04h = 8, d04m = 7;
        System.out.print(a+e+j+d04h+h+d04m+m); // Дата, месяц, часы, минуты
        int min = d04h * m60 + d04m;
        // 8 часов и 7 минут = 487 минут
        System.out.print(al+min+zp); // Всего минут
        System.out.println(min * sph); // Зарплата за 487 минут

        int d05h = 8, d05m = 24; // 5 января
        System.out.println(a+f+j+d05h+h+d05m+m+al+(d05h*m60+d05m)+zp+(d05h*m60+d05m)*sph);

        int d06h = 8, d06m = 25; // 6 января
        System.out.println(a+g+j+d06h+h+d06m+m+al+(d06h*m60+d06m)+zp+(d06h*m60+d06m)*sph);

        System.out.println(a+r+j+v); // 7 января
        System.out.println(a+i+j+v); // 8 января
        System.out.println(a+k+j+v+sb); // 9 января
        System.out.println(b+a+j+v+vs); //10 января

        int d11h = 8, d11m = 33;
        System.out.println(b+b+j+d11h+h+d11m+m+al+(d11h*m60+d11m)+zp+(d11h*m60+d11m)*sph);

        int d12h = 8, d12m = 50;
        System.out.println(b+c+j+d12h+h+d12m+m+al+(d12h*m60+d12m)+zp+(d12h*m60+d12m)*sph);

        int d13h = 8, d13m = 38;
        System.out.println(b+d+j+d13h+h+d13m+m+al+(d13h*m60+d13m)+zp+(d13h*m60+d13m)*sph);

        int d14h = 8, d14m = 14;
        System.out.println(b+e+j+d14h+h+d14m+m+al+(d14h*m60+d14m)+zp+(d14h*m60+d14m)*sph);

        int d15h = 8, d15m = 57;
        System.out.println(b+f+j+d15h+h+d15m+m+al+(d15h*m60+d15m)+zp+(d15h*m60+d15m)*sph);

        int d16h = 8, d16m = 4;
        System.out.println(b+g+j+d16h+h+d16m+m+al+(d16h*m60+d16m)+zp+(d16h*m60+d16m)*sph);

        System.out.println(b+r+j+v+vs);

        int d18h = 8, d18m = 23;
        System.out.println(b+i+j+d18h+h+d18m+m+al+(d18h*m60+d18m)+zp+(d18h*m60+d18m)*sph);

        int d19h = 9, d19m = 23;
        System.out.println(b+k+j+d19h+h+d19m+m+al+(d19h*m60+d19m)+zp+(d19h*m60+d19m)*sph);

        int d20h = 8, d20m = 24;
        System.out.println(c+a+j+d20h+h+d20m+m+al+(d20h*m60+d20m)+zp+(d20h*m60+d20m)*sph);

        int d21h = 8, d21m = 9;
        System.out.println(c+a+j+d21h+h+d21m+m+al+(d21h*m60+d21m)+zp+(d21h*m60+d21m)*sph);

        int d22h = 9, d22m = 47;
        System.out.println(c+a+j+d22h+h+d22m+m+al+(d22h*m60+d22m)+zp+(d22h*m60+d22m)*sph);

        int d23h = 0, d23m = 0; // сб
        System.out.println(c+a+j+v+sb);

        int d24h = 0, d24m = 0; // вс
        System.out.println(c+a+j+v+vs);

        int d25h = 8, d25m = 52;
        System.out.println(c+a+j+d25h+h+d25m+m+al+(d25h*m60+d25m)+zp+(d25h*m60+d25m)*sph);

        int d26h = 8, d26m = 38;
        System.out.println(c+a+j+d26h+h+d26m+m+al+(d26h*m60+d26m)+zp+(d26h*m60+d26m)*sph);

        int d27h = 8, d27m = 15;
        System.out.println(c+a+j+d27h+h+d27m+m+al+(d27h*m60+d27m)+zp+(d27h*m60+d27m)*sph);

        int d28h = 0, d28m = 0;
        System.out.println();

        int d29h = 0, d29m = 0;
        System.out.println();

        int d30h = 0, d30m = 0;
        System.out.println();

        int d31h = 0, d31m = 0;
        System.out.println();

        int allm = m60*(d04h+d05h+d06h+d11h+d12h+d13h+d14h+d15h+d16h+d18h+d19h)+
                +(d04m+d05m+d06m+d11m+d12m+d13m+d14m+d15m+d16m+d18m+d19m);
        double allzp = allm * sph;
        System.out.println(al+allm+zp+allzp+" на 19.01.2021");




    }
}
