package com.example.teachermanagementsystem.service.impl;

import com.example.teachermanagementsystem.entity.Teacher;
import com.example.teachermanagementsystem.repository.TeacherRepository;
import com.example.teachermanagementsystem.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
}
