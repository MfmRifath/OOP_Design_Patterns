public class PostFactory {
    public static Post creatPost(String type){
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("post type is unknown");
        };
    }
}
