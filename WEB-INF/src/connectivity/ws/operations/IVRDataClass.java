package connectivity.ws.operations;

import com.avaya.sce.runtime.tracking.TraceInfo;
import com.avaya.sce.runtimecommon.ITraceInfo;
import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class IVRDataClass {
	public void ivRdataMethod(SCESession mysession) {
		IVariableField flowName = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_FLOW_NAME);
		IVariableField ucidNo = mysession.getVariableField(IProjectVariables.SESSION,
				IProjectVariables.SESSION_FIELD_UCID);
		IVariableField sessionId = mysession.getVariableField(IProjectVariables.SESSION,
				IProjectVariables.SESSION_FIELD_SESSIONID);
		IVariableField dnisNo = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_DNIS);
		IVariableField clidNo = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_CLID);
		IVariableField startDate = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_START_DATE);
		IVariableField endDate = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_END_DATE);
		IVariableField duration = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_DURATION);
		IVariableField exitLocation = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_EXIT_LOCATION);
		IVariableField endReason = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_END_REASON);
		IVariableField app_Ip = mysession.getVariableField(IProjectVariables.DATA_ELIBRARY,
				IProjectVariables.DATA_ELIBRARY_FIELD_APP_IP);
		
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "1.Flow Name : "+flowName, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO," 2.UCID NO : "+ucidNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "3.sessionId : "+sessionId, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "4.DNIS NO : "+dnisNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "5.CLID NO : "+clidNo.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "6.StartingDate : "+startDate.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "7.End Date : "+endDate.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "8.Duration : "+duration.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "9.Exit Location : "+exitLocation.getStringValue(), mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "10.Exit Reason : "+endReason, mysession);
		TraceInfo.trace(ITraceInfo.TRACE_LEVEL_INFO, "11.appIP : "+app_Ip.getStringValue(), mysession);

		

		
	}
}
