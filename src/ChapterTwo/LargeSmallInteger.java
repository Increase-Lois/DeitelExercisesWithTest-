package ChapterTwo;

public class LargeSmallInteger {
    public String getInput(String message) {
        return message;
    }

    public int displayLargestNumber(int a, int b, int i, int j, int k) {
        return Math.max(a, Math.max(b, Math.max(i, Math.max(j, k))));
//        if (a > b) {
//            if (a > i) {
//                if (a > j) {
//                    if (a > k) {
//                        return  a;
//                    }
//                }
//            }
//        }
//        if (b > a) {
//            if (b > i) {
//                if (b > j) {
//                    if (b > k) {
//                            return b;
//                    }
//                }
//            }
//        }
//        if (i > a) {
//            if (i > b) {
//                if (i > j) {
//                    if (i > k) {
//                        return i;
//                    }
//                }
//            }
//        }
//
//        if (j > a) {
//            if (j > b) {
//                if (j > i) {
//                    if (j > k) {
//                        return j;
//                    }
//                }
//            }
//        }
//        if (k > a) {
//            if (k > b) {
//                if (k > i) {
//                    if (k > j) {
//                        return k;
//                    }
//                }
//            }
//        }
//        return 0;
//
//    }
    }

    public int displaySmallestNumber(int a, int b , int i ,int j, int k) {
        return Math.min(a,Math.min(b,Math.min(i,Math.min(j,k))));
//        if (a<b){
//            if (a<i){
//                if (a<j){
//                    if (a<k){
//                        return a;
//                    }
//                }
//            }
//        }
//
//        if (b<a){
//            if (b<i){
//                if (b<j){
//                    if (b<k){
//                        return b;
//                    }
//                }
//            }
//        }
//
//        if (i<a){
//            if (i<b){
//                if (i<j){
//                    if (i<k){
//                        return i;
//                    }
//                }
//            }
//        }
//
//        if (j<a){
//            if (j<b){
//                if (j<i){
//                    if (j<k){
//                        return j;
//                    }
//                }
//            }
//        }
//
//        if (k<a){
//            if (k<b){
//                if (k<i){
//                    if (k<j){
//                        return k;
//                    }
//                }
//            }
//        }
//            return 0;
    }

}
