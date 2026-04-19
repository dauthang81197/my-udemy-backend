package com.thanghub.myudemybackend.course;

import com.thanghub.myudemybackend.common.BaseEntity;
import com.thanghub.myudemybackend.common.enums.CourseStatusEnum;
import com.thanghub.myudemybackend.common.enums.LessonTypeEnum;
import com.thanghub.myudemybackend.common.enums.LevelEnum;
import com.thanghub.myudemybackend.section.Section;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lesson extends BaseEntity {
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LessonTypeEnum type = LessonTypeEnum.VIDEO;

    @Column(nullable = false)
    private String video_url;

    @Column(nullable = false, columnDefinition = "false")
    private Boolean is_preview;

    @Column(nullable = false, columnDefinition = "0")
    private Integer sort_order;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CourseStatusEnum status = CourseStatusEnum.DRAFT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;
}