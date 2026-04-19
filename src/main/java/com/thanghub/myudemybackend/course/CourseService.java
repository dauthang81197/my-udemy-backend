package com.thanghub.myudemybackend.course;

import com.thanghub.myudemybackend.common.response.PaginationResponse;
import com.thanghub.myudemybackend.course.response.CourseResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CourseService {
    Page<CourseResponse> getCourses(Pageable pageable);
}
