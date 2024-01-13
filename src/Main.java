public class Main {
    public static void main(String[] args) {
        int temperature = 12;
        int numberOfStudents = 6;
        boolean isRainy = false;

        if (temperature > 10 && temperature < 40) { // логический оператор И (AND)
            System.out.println("Go to park");
        }

        if (temperature > 20 && numberOfStudents > 5) { // логический оператор И (AND)
            System.out.println("Go swimming");
        }

        if (temperature < 15 || isRainy) { // логический оператор ИЛИ (OR)
            System.out.println("Go shopping");
        }

        if (isRainy || numberOfStudents < 10 && temperature < 20) {
            // false || true && true => 0 + 1 * 1 => 0 + 1 = 1 (TRUE)
            System.out.println("Go to school");
        }

        if ((isRainy || numberOfStudents < 10) && temperature < 20) {
            // (false || true) && true => (0 + 1) * 1 => 1 * 1 = 1 (TRUE)
            System.out.println("Go to work");
        }

        if (isRainy && numberOfStudents < 10 || temperature < 20) {
            // false && true || true => 0 * 1 + 1 => 0 + 1 = 1 (TRUE)
            System.out.println("Go to Cafe");
        }

        if (isRainy) {
            System.out.println("Take an umbrella");
        }
        if (!isRainy) { // логический оператор отрицания НЕ (NOT)
            System.out.println("Go to street");
        }

        if (!(isRainy || numberOfStudents < 10) && temperature < 20) {
            // !(false || true) && true => !(0 + 1) * 1 => 0 * 1 = 0 (FALSE)
            System.out.println("Go to party");
        }
        // Hi Sensei

        if (temperature != 10) { // != проверка на неравенство
            System.out.println("Something");
        }
    }
}
