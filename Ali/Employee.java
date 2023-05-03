package Ali;

import Saif.Identification;

public class Employee extends Identification {
    private static int idCounter = 0;
    private static Employee[] employees = new Employee[5];
    private double payCheck = 1000;

    Employee(){
    }
    Employee(String name){
        idCounter++;
        setId(idCounter);

        int i = 0;
        boolean flag = true;
        while (i<employees.length && flag){
            if(employees[i] == null){
                employees[i] = this;
                flag = false;
            }
            i++;
        }

        if(i == employees.length -1){
            resizeArray();
            employees[i+1] = this;
        }
    }

    private void resizeArray(){
        final int increaseBy = 1;
        Employee[] temp = new Employee[employees.length + increaseBy];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public void increasePayCheck(double money){
        this.payCheck += money;
    }
}
