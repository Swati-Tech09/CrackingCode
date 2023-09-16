import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapExample {

    public static class Employee
    {
        int id;
        String name;

        public Employee(int i, String a) {
            this.id=i;
            this.name=a;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
      ObjectMapExample.Employee e =new ObjectMapExample.Employee(1,"SS");
      ObjectMapExample.Employee e1 =new ObjectMapExample.Employee(2,"AG");

        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(1, e);
        employeeHashMap.put(2, e1);

        for (int i: employeeHashMap.keySet())
        {
            System.out.println(i);
        }

        for (Map.Entry<Integer, Employee> i: employeeHashMap.entrySet())
        {
            System.out.println(i.getKey() + "==" + i.getValue());
        }
    }
}
