package leetcode;

import java.util.Arrays;

public class Truncate {
    public static void main(String[] args) {
        System.out.println(truncateSentence("w XiB l ayg HqBSF wS LvoG mC on vGj Wi r a HS X Js Id KRb JC COBN tgt TZQ jxCeAF S bNRlBRalfPbaIS FZrzIntgpyVfFxfd LRNO GmYfBXfy gK cxV L KsR Pw ebXN bxo kV vyFBHPPg EQ OkN kn u hm K GeR r XRiLk MhbX tGGoASRfTnP FxtS xiW Ifd RwuMGJ vJgP Eq rloxSf ejc gR s FEQ Th KAwKpfQM qC iS XMz Z esVoSzC tNlq JjC rPux hvDL PFEnxNiP kf GOLSOU SBb lqu SxKps w Jj X zMbN yp xQ amg Z r gyB D FbHcm nhwr o Yx xiS e aEzrb FQMj M U dMkA", 76));
    }
    public static String truncateSentence(String s, int k) {
        String[] stringArray = s.split(" ");

        if(k >= stringArray.length) return s;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(stringArray[i]).append(" ");
        }

        return sb.toString().trim();


    }

}
