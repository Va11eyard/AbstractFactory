public class TextPostFactory implements SocialMediaPostFactory{
    @Override
    public SocialMediaPost createPost(){
        return new TextPost();
    }
}
