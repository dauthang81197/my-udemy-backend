package com.thanghub.myudemybackend.course;

import com.thanghub.myudemybackend.common.response.PaginationResponse;
import com.thanghub.myudemybackend.course.response.CourseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service()
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Override
    public Page<CourseResponse> getCourses(Pageable pageable) {
        return courseRepository.findAll(pageable)
                .map(this::toResponse);
    }

    private CourseResponse toResponse(Course course) {
        return CourseResponse.builder()
                .id(course.getId())
                .title(course.getTitle())
                .description(course.getDescription())
                .level(course.getLevel())
                .status(course.getStatus())
                .build();
    }
}
