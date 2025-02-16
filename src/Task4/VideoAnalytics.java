package Task4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VideoAnalytics {
    public static HashSet<YoutubeVideo> getTopTenViralVideos(List<YoutubeVideo> videos) {
        return videos.stream()
                .sorted((v1,v2) -> v1.getLikes().compareTo(v2.getLikes()))
                .limit(10)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static List<String> showDetailsOfShortVideos(Set<YoutubeVideo> videos) {
        return videos.stream()
                .filter(vid -> vid.getDuration()<=1000)
                .map(vid -> new String(vid.getVideoName()+"-"+vid.getLikes()+"-"+vid.getDuration()))
                .collect(Collectors.toList());
    }
}
