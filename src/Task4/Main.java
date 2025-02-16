package Task4;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        YoutubeVideo video1 = new YoutubeVideo(1L, "Introduction to Java", new BigInteger("150000"), 900);
        YoutubeVideo video2 = new YoutubeVideo(2L, "Advanced Python Tutorial", new BigInteger("250000"), 1800);
        YoutubeVideo video3 = new YoutubeVideo(3L, "Data Structures and Algorithms", new BigInteger("120000"), 1500);
        YoutubeVideo video4 = new YoutubeVideo(4L, "Web Development Basics", new BigInteger("300000"), 2000);
        YoutubeVideo video5 = new YoutubeVideo(5L, "Machine Learning 101", new BigInteger("500000"), 2500);
        YoutubeVideo video6 = new YoutubeVideo(6L, "Introduction to SQL", new BigInteger("180000"), 1600);
        YoutubeVideo video7 = new YoutubeVideo(7L, "React JS Crash Course", new BigInteger("220000"), 1400);
        YoutubeVideo video8 = new YoutubeVideo(8L, "Kubernetes Tutorial", new BigInteger("210000"), 1300);
        YoutubeVideo video9 = new YoutubeVideo(9L, "Docker Basics", new BigInteger("190000"), 1100);
        YoutubeVideo video10 = new YoutubeVideo(10L, "Artificial Intelligence Overview", new BigInteger("270000"), 1700);
        YoutubeVideo video11 = new YoutubeVideo(11L, "Introduction to Cloud Computing", new BigInteger("230000"), 1900);
        YoutubeVideo video12 = new YoutubeVideo(12L, "JavaScript for Beginners", new BigInteger("160000"), 1000);
        YoutubeVideo video13 = new YoutubeVideo(13L, "C++ Programming Basics", new BigInteger("140000"), 1500);
        YoutubeVideo video14 = new YoutubeVideo(14L, "Introduction to Data Science", new BigInteger("240000"), 1800);
        YoutubeVideo video15 = new YoutubeVideo(15L, "Python for Data Analysis", new BigInteger("260000"), 2000);
        YoutubeVideo video16 = new YoutubeVideo(16L, "Deep Learning with TensorFlow", new BigInteger("280000"), 2100);
        YoutubeVideo video17 = new YoutubeVideo(17L, "Introduction to Big Data", new BigInteger("170000"), 1900);
        YoutubeVideo video18 = new YoutubeVideo(18L, "Agile Methodologies", new BigInteger("200000"), 1200);
        YoutubeVideo video19 = new YoutubeVideo(19L, "Software Testing Fundamentals", new BigInteger("130000"), 900);
        YoutubeVideo video20 = new YoutubeVideo(20L, "Cyber Secu1rity Basics", new BigInteger("300000"), 2500);
        List<YoutubeVideo> videos = Stream.of(video1 ,video2 ,video3 ,video4 ,video5 ,
                                video6 ,video7 ,video8 ,video9 ,video10,
                                video11,video12,video13,video14,video15,video16,video17,
                                video18,video19,video20).collect(Collectors.toList());
        System.out.println(VideoAnalytics.showDetailsOfShortVideos(VideoAnalytics.getTopTenViralVideos(videos)));
    }
}
