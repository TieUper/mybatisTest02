package com.tie.service;

import com.tie.model.PageInfo;

public interface StudentService {

    PageInfo getStudentPageInfo(String sName, String tName, int pageSize, int pageNumber);
}
