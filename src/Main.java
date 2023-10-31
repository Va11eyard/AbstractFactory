public class Main {
    public static void main(String[] args) {
        //text
        SocialMediaPostFactory textFactory = new TextPostFactory();
        SocialMediaPost textPost = textFactory.createPost();
        textPost.share();

        //image
        SocialMediaPostFactory imageFactory = new ImagePostFactory();
        SocialMediaPost imagePost = imageFactory.createPost();
        imagePost.share();

        //video
        SocialMediaPostFactory videoFactory = new VideoPostFactory();
        SocialMediaPost videoPost = videoFactory.createPost();
        videoPost.share();
    }
}