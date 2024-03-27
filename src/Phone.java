public class Phone {
    public static void main(String[] args)
    {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+7(916)5467876", "Кузнецов");
        phoneBook.add("+7(920)6543458", "Сидоров");
        phoneBook.add("+7(914)2345234", "Воронцов");
        phoneBook.add("+7(953)8765897", "Кузнецов");
        phoneBook.add("+7(945)9876043", "Петров");
        phoneBook.add("+7(953)3456789", "Петров");
        phoneBook.add("+7(948)7654219", "Иванов");

        phoneBook.printByDecreasingNumberOfPersonalPhones();
    }
}
