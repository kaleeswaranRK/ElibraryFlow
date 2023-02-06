package connectivity.ws.beans;

public class CallHistory {
	String flowName;
	String ucidNo;
	String sessionId;
	String dnisNo;
	String clidNo;
	String StartingDate;
	String EndDate;
	String Duration;
	String exitLocation;
	String endReason;
	String appIp;

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getUcidNo() {
		return ucidNo;
	}

	public void setUcidNo(String ucidNo) {
		this.ucidNo = ucidNo;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getDnisNo() {
		return dnisNo;
	}

	public void setDnisNo(String dnisNo) {
		this.dnisNo = dnisNo;
	}

	public String getClidNo() {
		return clidNo;
	}

	public void setClidNo(String clidNo) {
		this.clidNo = clidNo;
	}

	public String getStartingDate() {
		return StartingDate;
	}

	public void setStartingDate(String startingDate) {
		StartingDate = startingDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getExitLocation() {
		return exitLocation;
	}

	public void setExitLocation(String exitLocation) {
		this.exitLocation = exitLocation;
	}

	public String getEndReason() {
		return endReason;
	}

	public void setEndReason(String endReason) {
		this.endReason = endReason;
	}

	public String getAppIp() {
		return appIp;
	}

	public void setAppIp(String appIp) {
		this.appIp = appIp;
	}
}
