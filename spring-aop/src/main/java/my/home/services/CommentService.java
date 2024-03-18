package my.home.services;


import my.home.logging.Child;
import my.home.model.Comment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.Logger;

@Service
public class CommentService {

    private static final Logger logger = LogManager.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        Marker marker = MarkerManager.getMarker(CommentService.class.getName());
        Child child = new Child();
        child.logFromChild(marker);
        logger.info("Comment: " + comment.getText());
    }
}
