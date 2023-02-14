import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What grade are you in?");
    int grade = input.nextInt();
    switch (grade) {
      case 9:
        System.out.println("You just started high school!");
        break;
      case 10:
        System.out.println("You already have a year of high school done!");
        break;
      case 11:
        System.out.println("You only have one more year of high school left!");
        break;
      case 12:
        System.out.println("This is your last year of high school!");
        break;
      default:
        System.out.println("Good luck with your academic endeavors!");

        System.out.println("What letter grade did you get on your last math test?");
        String letter = input.nextLine();
        letter.toLowerCase();
        switch (letter) {
          case "a":
            System.out.println("Fantastic!");
            break;
          case "b":
            System.out.println("Good job.");
            break;
          case "c":
            System.out.println("You have room for improvement.");
            break;
          default:
            System.out.println("Good luck next time.");

        }
    }
  }
}