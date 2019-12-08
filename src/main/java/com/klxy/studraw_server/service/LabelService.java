package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Label;
import com.klxy.studraw_server.model.Role;

import java.util.List;

public interface LabelService {

    List<Label> getAllLabel();

    List<Label> getLabelByuserid(int userid);
}
