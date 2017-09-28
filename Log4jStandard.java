package cn.com.hrbb.logSt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jStandard {

    private static Log jylsLog = LogFactory.getLog("YYJYLS_F");  
    private static Log errorLog = LogFactory.getLog("YYERROR_F");  
	
	public enum YYTYPE{
		YYJYLS,YYERROR
	}
	/*
	logType:日志类型==> 应用交易流水日志，应用报错日志
	qdm:渠道名称
	jylsh:交易流水号
	jyfhm:交易返回码
	*/
	public static void stLog(YYTYPE logType,String qdm,String jylsh,String jyfhm,String timeStr,String otherStr){
		StringBuffer buf = new StringBuffer();
		if(logType == YYTYPE.YYJYLS){
			jylsLog.info(buf.append("|").append("应用交易流水日志").append("|")
					.append(qdm).append("|")
					.append(jyfhm).append("|").append(timeStr).append("|").append(otherStr).append("|").toString());
		}else if(logType == YYTYPE.YYERROR){
			errorLog.error(buf.append("|").append("应用报错日志").append("|")
					.append(qdm).append("|")
					.append(jyfhm).append("|").append(timeStr).append("|").append(otherStr).append("|").toString());
		}
	}
}
