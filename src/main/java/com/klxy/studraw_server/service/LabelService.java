package com.klxy.studraw_server.service;

import com.klxy.studraw_server.model.Label;


import java.util.List;

public interface LabelService {

    List<Label> getAllLabel();

    List<Label> getLabelByuserid(int userid);

    //++

    Integer addLabel(Label label);

    Integer uptLabel(Label label);

    Integer delLabel(int id);

}
