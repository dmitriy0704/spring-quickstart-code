package my.home;

import my.home.config.ProjectConfig;
import my.home.model.Comment;
import my.home.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Dmitriy");
        comment.setText("My super comment!");

        service.publishComment(comment);
    }
}