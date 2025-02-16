package Task4;

import java.math.BigInteger;

public class YoutubeVideo {
    private long videoId;
    private String videoName;
    private BigInteger likes;
    private int duration;
    public YoutubeVideo() {
    }
    
    public YoutubeVideo(long videoId, String videoName, BigInteger likes, int duration) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.likes = likes;
        this.duration = duration;
    }

    public long getVideoId() {
        return videoId;
    }
    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }
    public String getVideoName() {
        return videoName;
    }
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
    public BigInteger getLikes() {
        return likes;
    }
    public void setLikes(BigInteger likes) {
        this.likes = likes;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "YoutubeVideo [videoId=" + videoId + ", videoName=" + videoName + ", likes=" + likes + ", duration="
                + duration + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (videoId ^ (videoId >>> 32));
        result = prime * result + ((videoName == null) ? 0 : videoName.hashCode());
        result = prime * result + ((likes == null) ? 0 : likes.hashCode());
        result = prime * result + duration;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        YoutubeVideo other = (YoutubeVideo) obj;
        if (videoId != other.videoId)
            return false;
        if (videoName == null) {
            if (other.videoName != null)
                return false;
        } else if (!videoName.equals(other.videoName))
            return false;
        if (likes == null) {
            if (other.likes != null)
                return false;
        } else if (!likes.equals(other.likes))
            return false;
        if (duration != other.duration)
            return false;
        return true;
    }
    
}
