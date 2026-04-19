package com.thanghub.myudemybackend.course.response;

import com.thanghub.myudemybackend.common.enums.CourseStatusEnum;
import com.thanghub.myudemybackend.common.enums.LevelEnum;
import lombok.Builder;

@Builder
public class CourseResponse {
    private Long id;
    private String title;
    private String description;
    private LevelEnum level;
    private CourseStatusEnum status;
}
