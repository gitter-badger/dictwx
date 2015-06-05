package com.otw1248.ppp.dict.s.impl;

import com.otw1248.ppp.dict.d.NCD;
import com.otw1248.ppp.dict.s.NCService;
import com.otw1248.ppp.dict.util.NCUtil;
import org.springframework.stereotype.Component;

/**
 * Created by Stephen Xianwei Zhang on 6/5/2015.
 */
@Component
public class NCServiceImpl implements NCService {
    @Override
    public String queryNC(String param) {
        if (param == null || param.length() < 1) {
            return null;
        }
        String p = param.trim().toLowerCase();
        if (p.length() < 2) {
            return null;
        }
        int lNO = 1;
        int vNO = 4;
        vNO = NCUtil.getVolumeNo(p);
        if (p.indexOf("to") > 0) {
            return NCUtil.getLessons(vNO, p);
        }
        lNO = NCUtil.getLessonNo(p);
        lNO = NCUtil.getLessonNo(lNO, vNO);

        String result = NCD.ncAHM.get(vNO).get(lNO);
        return result;
    }
}
