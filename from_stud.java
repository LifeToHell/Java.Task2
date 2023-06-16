/*
 * Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.sym.Name;

public class from_stud {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name", "Ivanov");
        myHashMap.put("country", "Russia");
        myHashMap.put("city", "Moscow");
        myHashMap.put("age", null);

        StringBuilder sb = new StringBuilder();
        sb.append("from students WHERE");

        for (Map.Entry<String, String> entry : myHashMap.entrySet()) {
            if (entry.getValue() != null) {
                sb.append(" " + entry.getKey() + " = " + entry.getValue());
                sb.append(" AND");
            }
        }
        sb.setLength(sb.length() - 3);

        System.out.print(sb.toString() + ".");

    }
}