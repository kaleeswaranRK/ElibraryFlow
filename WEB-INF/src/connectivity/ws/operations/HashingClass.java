package connectivity.ws.operations;

import java.security.MessageDigest;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.SCESession;

public class HashingClass {
	public static String getSha256(String value,SCESession mySession) {
	    try{
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(value.getBytes());
	        return bytesToHex(md.digest());
	    } catch(Exception ex){
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, ex.getLocalizedMessage(), mySession);
	    }
		return value;
	 }
	 private static String bytesToHex(byte[] hash) {
		 StringBuilder hexString = new StringBuilder(2 * hash.length);
		    for (int i = 0; i < hash.length; i++) {
		        String hex = Integer.toHexString(0xff & hash[i]);
		        if(hex.length() == 1) {
		            hexString.append('0');
		        }
		        hexString.append(hex);
		    }
		    return hexString.toString();
	 }
}
