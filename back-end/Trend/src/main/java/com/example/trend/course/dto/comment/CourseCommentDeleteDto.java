package com.example.trend.course.dto.comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseCommentDeleteDto {
    private int courseId;
    private int commentId;
    private String userId;
}
