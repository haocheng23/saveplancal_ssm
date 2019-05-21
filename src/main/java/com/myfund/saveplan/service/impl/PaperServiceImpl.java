package com.myfund.saveplan.service.impl;

import com.myfund.saveplan.dao.PaperDao;
import com.myfund.saveplan.pojo.Paper;
import com.myfund.saveplan.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    //注入dao
    @Autowired
    private PaperDao paperDao;

    @Override
    public int addPaper(Paper paper) {
        return paperDao.addPaper(paper);
    }

    @Override
    public int deletePaperById(long id) {
        return 0;
    }

    @Override
    public int updatePaper(Paper paper) {
        return 0;
    }

    @Override
    public Paper queryById(long id) {
        return null;
    }

    @Override
    public List<Paper> queryAllPaper() {
        return null;
    }
}
