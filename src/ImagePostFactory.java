public class ImagePostFactory implements SocialMediaPostFactory{
    @Override
    public SocialMediaPost createPost(){
        return new ImagePost();
    }
}
