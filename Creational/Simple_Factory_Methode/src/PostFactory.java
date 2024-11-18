public class PostFactory {
    public static Post creatPost(String type){
        switch (type){
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("post type is unknown");
        }
    }
}
