import java.util.*;
public class Main{
    static int pId = 1;
    static HashMap<Integer, Employee> employee = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean flag = true;
        while(flag){
            System.out.println("Welcome to the Employee Management System! \n" +
                    "0. Exit \n" +
                    "1. Add a Employee \n" +
                    "2. Search a Employee \n" +
                    "3. Delete a Employee \n" +
                    "4. Traverse Employee\n"
            );
            value = sc.nextInt();
            switch(value){
                case 0:
                    flag = false;
                    System.out.println("Exiting... Thank you!");
                    break;
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    searchEmployee(sc);
                    break;
                case 3:
                    deleteEmployee(sc);
                    break;
                case 4:
                    traverseEmployee(sc);
                    break;
            }
        }
    }
    public static void addEmployee(Scanner sc){
        System.out.println("Enter the name of the Employee to add:");
        String name = sc.next();
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter the Position: ");
        sc.nextLine();
        String position = sc.nextLine();
        Employee p = new Employee(pId, name, position, salary);
        employee.put(pId, p);
        pId++;
        System.out.println("Employee added successfully!");
    }

    public static void searchEmployee(Scanner sc){
        System.out.println("Enter the Employee ID to search: ");
        int id = sc.nextInt();
        if(employee.containsKey(id)){
            System.out.println(employee.get(id));
        }
        else{
            System.out.println("ID not Found :(");
        }
    }

    public static void deleteEmployee(Scanner sc){
        System.out.println("Enter the Employee ID to be deleted");
        int id = sc.nextInt();
        if(employee.containsKey(id)){
            employee.remove(id);
            System.out.println("Successfully removed the Employee!");
        }
        else{
            System.out.println("ID not found");
        }
    }

    public static void traverseEmployee(Scanner sc){
        for(Employee p: employee.values()){
            System.out.println(p);
        }
    }
}
