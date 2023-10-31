public class VideoPostFactory implements SocialMediaPostFactory{
    @Override
    public SocialMediaPost createPost(){
        return new VideoPost();
    }
}
