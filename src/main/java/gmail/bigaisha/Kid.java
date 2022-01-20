package gmail.bigaisha;

public class Kid {
    public int sex;
    public int yearOfBirth;
    public int monthOfBirth;
    public int dayOfBirth;
    public int age;
    public int grade;
    public int ageDifference;

    public static void main(String[] args) {
        String thirdName = "Bolat";
        int startSchoolAge = 6;

        Kid First = new Kid();
        String firstKidName = "Nurali";
        First.yearOfBirth = 2014;
        First.monthOfBirth = 4;
        First.dayOfBirth = 3;
        First.sex = 1;

        First.age = 2022 - First.yearOfBirth;
        First.grade = 2022 - First.yearOfBirth - startSchoolAge;

        System.out.println("This kid's name is " + firstKidName + " " + thirdName);
        System.out.println(firstKidName + " is " + First.age + " years old");
        System.out.println(firstKidName + " is in " + First.grade + " grade");


        if (First.sex == 1) {
            System.out.println("He is a boy");
        }
        else {
            System.out.println("She is a girl");
        }



        Kid Second = new Kid();
        String secondKidName = "Torekhan";
        Second.yearOfBirth = 2014;
        Second.monthOfBirth = 2;
        Second.dayOfBirth = 9;
        Second.sex = 1;

        Second.age = 2022 - Second.yearOfBirth;
        Second.grade = 2022 - Second.yearOfBirth - startSchoolAge;

        System.out.println("This kid's name is " + thirdName + " " +  secondKidName);
        System.out.println(secondKidName + " is " + Second.age + " years old");
        System.out.println(secondKidName + " is in " + Second.grade + " grade");


        if (Second.sex == 1) {
            System.out.println("He is a boy");
        }
        else {
            System.out.println("She is a girl");
        }

        int ageDifference = First.age - Second.age;

        if (ageDifference > 0) {

            // Nurali is 2 years older than Torekhan
            System.out.println(firstKidName + " is " + ageDifference + " years older than " + secondKidName);
        }
        else {
            System.out.println(secondKidName + " is " + ageDifference*(-1) + " years older than " + firstKidName);
        }

    }
}
