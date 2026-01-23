package Main;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Классная Работа


        // System.out.println("Имя:");
        // String name = sc.nextLine();

        // System.out.println("Возраст:");
        // int age = sc.nextInt();
        // sc.nextLine();
        
        // System.out.println("Город:");
        // String city = sc.nextLine();

        // System.out.println("--------");
        // System.out.println("Имя: " + name);
        // System.out.println("Возраст: " + age);
        // System.out.println("Город: " + city);        

        // boolean isAuth = false;
        // while(true){
        //     System.out.println("Введите команду: ");
        //     System.out.println("/Reg   /Login   /Out");
        //     String command = sc.nextLine();

        //     switch (command) {
        //                 case "/Reg":
        //                     if(isAuth == true){
        //                         System.out.println("Вы уже зарегестрироовались");
        //                         break;
        //                     }
        //                     else{
        //                         System.out.println("Вы Зарегестрировались!");
        //                         isAuth = true;
        //                         break;
        //                     }
                            
        //                 case "/Login":
        //                     if(isAuth != true){
        //                         System.out.println("Вы не зарегестировались!");
        //                     }
        //                     else{
        //                         System.out.println("Добро пожаловать");
        //                     }
        //                     break;
        //                 case "/Out":
        //                     System.out.println("Пока !");
        //                     return;
        //                 default:
        //                     System.out.println("Ашибка");
        //                     break;
        //             }
        //         }


        // System.out.println("Введите имя");
        // String name = sc.nextLine();

        // System.out.println("введите фамилию");
        // String surname = sc.nextLine();

        // System.out.println("введите Возраст");
        // int age = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Имя : " + name);
        // System.out.println("Фамилия : " + surname);
        // System.out.println("Возраст : " + age);


        // System.out.println("Введите число A");
        // int A = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Введите число B");
        // int B = sc.nextInt();
        // sc.nextLine();

        // System.out.println(A + B);
        // System.out.println(A - B);
        // System.out.println(A * B);
        // System.out.println(A / B);

        // System.out.println("Введите радиус окружномти");
        // double r = sc.nextDouble();
        // sc.nextLine();
        // double area = Math.PI * r * r;
        // System.out.println("Площадь круга: " + area);

        // System.out.println("Введите цену товара");
        // int price = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Введите Кол-во товара");
        // int score = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Итоговая цена : " + (price * score));


            // System.out.println("Введите Любую Цитату");
            // String text = sc.nextLine();

            // System.out.println("Длинна строки : " + text.length());
            // System.out.println("Первый символ : " + text.charAt(0));
            // System.out.println("Последний символ : " + text.charAt(text.length()));

            // System.out.println("Введите возраст");
            // int age = sc.nextInt();
            // sc.nextLine();

            // if(age < 18){
            //     System.out.println("Ди нах");
            // }
            // else{
            //     System.out.println("Ладно не иди ");
            // }    

            // System.out.println("Введите число");
            // int num = sc.nextInt();
            // sc.nextLine();

            // if(num > 0){
            //     System.out.println("положительное");
            // }
            // else if(num < 0){
            //     System.out.println("отрицательное");
            // }
            // else{
            //     System.out.println("ноль");
            // }

            // System.out.println("Введите число 1");
            // int num1 = sc.nextInt();
            // sc.nextLine();
            // System.out.println("Введите число 2");
            // int num2 = sc.nextInt();
            // sc.nextLine();
            // System.out.println("Введите число 3");
            // int num3 = sc.nextInt();
            // sc.nextLine();

            // if(num1 > num2 && num1 > num3){
            //     System.out.println("Самое большое число : " + num1);
            // }
            // else if(num2 > num1 && num2 > num3){
            //     System.out.println("Самое большое число : " + num2);
            // }
            // else if(num3 > num1 && num3 > num2){
            //     System.out.println("Самое большое число : " + num3);
            // }
            // else{
            //     System.out.println("Чет какая то делюга не такая");
            // }            

                       
            // System.out.println("Введите кол-во баллов ");
            // int grade = sc.nextInt();
            // sc.nextLine();

            // if (grade >= 80) {
            //     System.out.println("Отлично");
            // }
            // else if (grade >= 60) {
            //     System.out.println("нормально");
            // }
            // else if (grade >= 40) {
            //     System.out.println("ну такое");
            // }
            // else{
            //     System.out.println("хня");
            // }

            // System.out.println("Введите Логин");
            // String login = sc.nextLine();


            // System.out.println("Введите Пароль");
            // int password = sc.nextInt();
            // sc.nextLine();

            // if(login == "Admin" && password == 1234){
            //     System.out.println("Вход разрешен");
            // }
            // else{
            //     System.out.println("Пади ты на");
            // }

            // System.out.println("Введите день недели");
            // int day = sc.nextInt();
            // sc.nextLine();

            // switch (day) {
            //     case 1:
            //         System.out.println("Понедельник");
            //         break;
            //     case 2:
            //         System.out.println("Вторник");
            //         break;
            //     case 3:
            //         System.out.println("Среда");
            //         break;
            //     case 4:
            //         System.out.println("четверг");
            //         break;
            //     case 5:
            //         System.out.println("пятница");
            //         break;
            //     case 6:
            //         System.out.println("суббота");
            //         break;
            //     case 7:
            //         System.out.println("воскресенье");
            //         break;
            
            //     default:
            //         System.out.println("Что то не так");
            //         break;
            // }

            // System.out.println("Введите число 1");
            // int num1 = sc.nextInt();
            // sc.nextLine();

            // System.out.println("Введите число 2");
            // int num2 = sc.nextInt();
            // sc.nextLine();

            // System.out.println("Введите оператор");
            // System.out.println("+  -  *  /");

            // String op = sc.nextLine();
            // switch (op) {
            //     case "+":
            //         System.out.println(num1 + num2);
            //         break;
            //     case "-":
            //         System.out.println(num1 - num2);
            //         break;
            //     case "*":
            //         System.out.println(num1 * num2);
            //         break;
            //     case "/":
            //         System.out.println(num1 / num2);
            //         break;
            
            //     default:
            //         System.out.println("Это не оператор");
            //         break;
            // }

            // int balance = 10000;

            // System.out.println("Введите команду");
            // System.out.println("/Баланс    /Пополнение   /Списание   /Выход");

            // String op = sc.nextLine();
            // switch (op) {
            //     case "/Баланс":
            //         System.out.println(balance);
            //         break;
            //     case "/Пополнение":
            //         System.out.println("На сколько пополнить баланс");
            //         int up = sc.nextInt();
            //         sc.nextLine();
            //         System.out.println("Ваш баланс пополнен на " + up);
            //         System.out.println("Текущий баланс составляет:" + (balance + up) );
            //         break;
            //     case "/Списание":
            //         System.out.println("Сколько хотите снять ?");
            //         int down = sc.nextInt();
            //         sc.nextLine();
            //         System.out.println("С вашего счета было списанно " + down);
            //         System.out.println("Текущий баланс составляет:" + (balance - down) );
            //         break;
            //     case "/Выход":
            //         System.out.println("Будем вас ждать");
            //         break;
            
            //     default:
            //         System.out.println("Ашибка");
            //         break;
            // }

            // System.out.println("Введите номер месяца");
            // int month = sc.nextInt();
            // sc.nextLine();

            // switch (month) {
            //     case 12:
            //     case 1:
            //     case 2:
            //         System.out.println("Зима");
            //         break;
            //     case 3:
            //     case 4:
            //     case 5:
            //         System.out.println("Весна");
            //         break;
            //     case 6:
            //     case 7:
            //     case 8:
            //         System.out.println("Лето");
            //         break;
            //     case 9:
            //     case 10:
            //     case 11:
            //         System.out.println("Осень");
            //         break;
            
            //     default:
            //         System.out.println("Это не номер месяца");
            //         break;
            // }

            // System.out.println("Введите код ошибки");
            // int err = sc.nextInt();

            // switch (err) {
            //     case 400:
            //         System.out.println("Bad Request");
            //         break;
            //     case 401:
            //         System.out.println("Unauthorized");
            //         break;
            //     case 403:
            //         System.out.println("Forbidden");
            //         break;
            //     case 404:
            //         System.out.println("Nothing Found");
            //         break;
            //     case 500:
            //         System.out.println("Server Error");
            //         break;
            
            //     default:
            //         System.out.println("Такого кода ошибки нет в программе");
            //         System.out.println("Коды Ошибок:  400   401   403   404   500");
            //         break;
            // }
            // int i = 0;
            // while (true) {
            //     if (i == 20) {
            //         break;
                    
            //     }
            //     System.out.println(i);
            //     i++;
            // }
            // int sum = 0;
            // while(true){
            //     System.out.println("Введите число или 0 для завершения");
            //     int num = sc.nextInt();


            //     if (num == 0) {
            //         break;
            //     }

            //     sum += num;

            //     System.out.println("Сумма равна " + sum);

                
            // }
            



                double num1 = 0;
                double num2;
                double result = 0;
                double lastRes = 0;

                int operationCount = 0;
                boolean hasResult = false;

                while (true) {

                    System.out.println("""
                        ===== CALC MENU =====
                        1 - Сложение (+)
                        2 - Вычитание (-)
                        3 - Умножение (*)
                        4 - Деление (/)
                        5 - Остаток (%)
                        6 - Степень (a^b)
                        7 - Среднее из N чисел
                        8 - Показать статистику
                        0 - Выход
                        =====================
                        """);

                    int answ = sc.nextInt();

                    if (answ == 0) {
                        System.out.println("Пакаааа");
                        break;
                    }

                    if (answ == 8) {
                        System.out.println("Количество операций: " + operationCount);
                        System.out.println("Последний результат: " + lastRes);
                        continue;
                    }

                    if (hasResult) {
                        num1 = lastRes;
                        System.out.println("Используем последний результат: " + num1);
                    } else {
                        System.out.println("Введите первое число:");
                        num1 = sc.nextDouble();
                    }

                    switch (answ) {

                        case 1:
                            System.out.println("Введите второе число:");
                            num2 = sc.nextDouble();
                            result = num1 + num2;
                            break;

                        case 2:
                            System.out.println("Введите второе число:");
                            num2 = sc.nextDouble();
                            result = num1 - num2;
                            break;

                        case 3:
                            System.out.println("Введите второе число:");
                            num2 = sc.nextDouble();
                            result = num1 * num2;
                            break;

                        case 4:
                            System.out.println("Введите второе число:");
                            num2 = sc.nextDouble();
                            if (num2 == 0) {
                                System.out.println("Делить на 0 нельзя");
                                continue;
                            }
                            result = num1 / num2;
                            break;

                        case 5:
                            System.out.println("Введите второе число:");
                            num2 = sc.nextDouble();
                            result = num1 % num2;
                            break;

                        case 6:
                            System.out.println("Введите степень:");
                            num2 = sc.nextDouble();
                            result = Math.pow(num1, num2);
                            break;

                        case 7:
                            System.out.println("Введите количество чисел:");
                            int n = sc.nextInt();
                            if (n <= 0) {
                                System.out.println("N должно быть > 0");
                                continue;
                            }

                            double sum = 0;
                            for (int i = 1; i <= n; i++) {
                                System.out.println("Введите число " + i + ":");
                                sum += sc.nextDouble();
                            }
                            result = sum / n;
                            break;

                        default:
                            System.out.println("Неверный пункт меню");
                            continue;
                    }

                    System.out.println("Результат: " + result);
                    lastRes = result;
                    hasResult = true;
                    operationCount++;
                }

}
}

