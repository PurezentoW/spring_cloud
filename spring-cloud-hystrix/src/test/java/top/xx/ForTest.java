package top.xx;

import org.junit.Test;

public class ForTest {
    @Test
    public void mmm() {
        System.out.println(this.returnTest());
    }

    private String returnTest(){
        String[] str = {"1","2","3","4","6","7"};
        boolean mark = false;
        for(String s:str){
            if(s.equals("1")){
                return null;
            }
        }

        

        return String.valueOf(mark);
    }
}
