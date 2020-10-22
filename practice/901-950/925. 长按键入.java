class Solution {
     public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();

    }
}
//    int indexName = 0;
//    int indexTyped = 0;
//        while(indexTyped<typed.length() && indexName<name.length()){
//        if(name.charAt(indexName) == typed.charAt(indexTyped)){
//            indexName++;
//            indexTyped++;
//        }else{
//            if(indexTyped == 0)return false;
//            while(typed.charAt(indexTyped) == typed.charAt(indexTyped+1)){
//                indexTyped++;
//            }
//            if(name.charAt(indexName) == typed.charAt(indexTyped)){
//                indexName++;
//                indexTyped++;
//            }else return false;
//        }
//    }
//        if(indexName<name.length())return false;
//        while (indexTyped < typed.length()) {
//        if (typed.charAt(indexTyped) == typed.charAt(indexTyped)) indexTyped++;
//        else return false;
//    }
//        return true;