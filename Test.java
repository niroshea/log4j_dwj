package com.nero.sheh;

import cn.com.hrbb.logSt.Log4jStandard.YYTYPE;
import cn.com.hrbb.logSt.Log4jStandard;

class Thread1 extends Thread{  
    private int name;  
    public Thread1(int name) {  
       this.name=name;  
    }
    public void run() {  
        for (;;) {
        	if(this.name%2 == 1){
        		Log4jStandard.stLog(YYTYPE.YYJYLS,"渠道名","交易流水号","交易返回码","时间","其他定义字段=================================================================================="+this.name);
        	}else{
        		Log4jStandard.stLog(YYTYPE.YYERROR,"渠道名","交易流水号","交易返回码","时间","其他定义字段=================================================================================="+this.name);
        	}
        	
            try {  
                //sleep((int) Math.random() * 10);
            	sleep(100);
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
         
    }  
}

public class Test {

    //private static Logger logger = Logger.getLogger(Main.class);  

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 500 ;i++){
			new Thread1(i).start();
		}

		while(true){
			Thread.sleep(1000);
		}
	}
}
