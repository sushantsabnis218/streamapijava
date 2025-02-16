package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PortalCredentialsCreator {
    public static List<UserName> createListOfUserNames(List<Student> studentsList) {
        List<UserName> userNames = new ArrayList<>();
        return studentsList.stream()
                            .map(student -> { 
                                return new UserName(student.getFname()+" "+student.getLname());
                            }).collect(Collectors.toList());

    }
    public static List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList.stream()
                        .map(student -> {
                            return new PassWord(generateRandomString(8,20));
                        }).collect(Collectors.toList());
    }

    public static String generateRandomString(int minLength, int maxLength) {
        if (minLength < 0 || maxLength < 0 || minLength > maxLength) {
            throw new IllegalArgumentException("Invalid length range.");
        }

        int length = new Random().nextInt(maxLength - minLength + 1) + minLength; // Generates length within range

        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}:<>"; // Characters to choose from

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
