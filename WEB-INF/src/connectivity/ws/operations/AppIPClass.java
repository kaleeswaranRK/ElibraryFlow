package connectivity.ws.operations;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class AppIPClass {
	public void appIPmethod(SCESession mysession) {
		IVariableField app_Ip = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_APP_IP);
		InetAddress localHost;
		try {
			localHost = InetAddress.getLocalHost();
			app_Ip.setValue(localHost);
		} catch (UnknownHostException e) {
			TraceInfo.trace(ITraceInfo.TRACE_LEVEL_ERROR, e, mysession);
		}
	  
	}
	 
}
