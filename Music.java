interface Payable{
    public void play();
}

class MusicPlayer implements Payable{

    @Override
    public void play(){
        System.out.println("Music is played");
    }
}
class VideoPlayer implements Payable{

    @Override
    public void play(){
        System.out.println("Video is played");
    }
}

public class Music{
    public static void main(String[] args) {
        
        Payable music = new MusicPlayer();
        Payable video = new VideoPlayer();

        music.play();
        video.play();

    }
}