package com.thanghub.myudemybackend.course;

import com.thanghub.myudemybackend.common.mapper.PaginationMapper;
import com.thanghub.myudemybackend.common.response.PaginationResponse;
import com.thanghub.myudemybackend.course.response.CourseResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.*;

@RestController
@RequestMapping("/api/admin/courses")
@RequiredArgsConstructor
@Tag(name = "")
public class CourseAdminController {
    private final CourseService courseService;

    @GetMapping()
    @SecurityRequirements
    public PaginationResponse<CourseResponse> getCourses(Pageable pageable) {
        Page<CourseResponse> page = courseService.getCourses(pageable);
        return PaginationMapper.from(page);
    }
}
