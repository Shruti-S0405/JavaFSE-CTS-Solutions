import java.util.*;
public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner sc = new Scanner(System.in);
        taskList.addTask(new Task(1, "Write Report", "Pending"));
        taskList.addTask(new Task(2, "Email Client", "Completed"));
        taskList.addTask(new Task(3, "Team Meeting", "In Progress"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("Searching Task ID, Enter the id to search:");
        Task found = taskList.searchTask(sc.nextInt());
        System.out.println(found != null ? found : "Task not found");

        System.out.println("Deleting Task ID, Enter the id to delete:");
        boolean deleted = taskList.deleteTask(sc.nextInt());
        System.out.println(deleted ? "Deleted successfully" : "Task not found");

        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}
