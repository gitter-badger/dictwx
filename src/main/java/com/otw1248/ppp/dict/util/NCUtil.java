package com.otw1248.ppp.dict.util;

import com.otw1248.ppp.dict.d.NCD;

import java.util.Map;

/**
 * Created by Stephen Xianwei Zhang on 6/5/2015.
 */
public class NCUtil {


    public static String getLessons(final Integer vNO, final String p) {
        int i = Integer.parseInt(p.substring(1, p.indexOf("to")));
        int j = Integer.parseInt(p.substring(p.indexOf("to") + 2));
        StringBuffer stringBuffer = new StringBuffer("");
        Map<Integer, String> nchm = NCD.ncAHM.get(vNO);
        for (; i <= j; i++) {
            if (vNO == 1 && i % 2 == 0) {
                continue;
            }
            stringBuffer.append(nchm.get(i)).append("\n");
        }
        return stringBuffer.toString();
    }

    public static int getLessonNo(int lNO, int vNo) {
        if (vNo == 1 && lNO % 2 == 0) {
            return lNO - 1;
        }
        return lNO;
    }

    public static int getLessonNo(final String p) {
        try {
            return Integer.parseInt(p.substring(1));
        } catch (Exception e) {
        }
        return 1;
    }

    /**
     * @param p
     * @return
     */
    public static int getVolumeNo(final String p) {
        try {
            return Integer.parseInt(p.substring(0, 1));
        } catch (Exception e) {
            String str = p.substring(0, 1);
            if ("i".equalsIgnoreCase(str) || "a".equalsIgnoreCase(str)) {
                return 1;
            } else if ("ii".equalsIgnoreCase(str) || "b".equalsIgnoreCase(str)) {
                return 2;
            } else if ("iii".equalsIgnoreCase(str) || "c".equalsIgnoreCase(str)) {
                return 3;
            } else if ("iv".equalsIgnoreCase(str) || "d".equalsIgnoreCase(str)) {
                return 4;
            }
        }
        return 4;
    }
}
