
import java.util.Scanner;

class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}

class Profile {
    private String name;
    private int age;
    
    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void updateProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Question {
    private String question;
    private String[] options;
    private int correctOption;
    
    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String[] getOptions() {
        return options;
    }
    
    public int getCorrectOption() {
        return correctOption;
    }
}

class Exam {
    private Question[] questions;
    private int timer;
    
    public Exam(Question[] questions, int timer) {
        this.questions = questions;
        this.timer = timer;
    }
    
    public void startExam(User user) {
        System.out.println("Welcome, " + user.getUsername() + "!");
        System.out.println("You have " + timer + " minutes to complete the exam.");
        
        // Code for displaying and answering questions goes here
        
        // After the timer expires or user submits the exam
        System.out.println("Exam submitted successfully.");
    }
}

public class OnlineExamSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a sample user
        User user = new User("john123", "password");
        
        // Login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            System.out.println("Login successful.");
            
            // Update profile
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            Profile profile = new Profile(name, age);
            System.out.println("Profile updated successfully.");
            
            // Select answers for MCQs
            Question[] questions = new Question[5];  // Sample questions
            
            // Start the exam
            Exam exam = new Exam(questions, 60);  // 60 minutes timer
            exam.startExam(user);
            
            // Closing session and logout
            System.out.println("Logged out successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        scanner.close();
    }
}
