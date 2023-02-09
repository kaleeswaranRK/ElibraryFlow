package connectivity.ws.operations;

import com.avaya.sce.runtimecommon.IVariableField;
import com.avaya.sce.runtimecommon.SCESession;

import flow.IProjectVariables;

public class ProjectVariablesMenuClass {
	public void projectVariableSetValue(SCESession mySession,String value,int variableNumber) {
		switch (variableNumber) {
		case 1:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_1).setValue(value);
			break;
		case 2:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_2).setValue(value);
			break;
		case 3:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_3).setValue(value);
			break;
		case 4:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_4).setValue(value);
			break;
		case 5:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_5).setValue(value);
			break;
		case 6:
			mySession.getVariableField(IProjectVariables.MENU_COMMON,
					IProjectVariables.MENU_COMMON_FIELD_MENU_OPTION_VALUE_6).setValue(value);
			break;

		default:
			break;
		}

	}
}
