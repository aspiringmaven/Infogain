package me.sumitkawatra.javageek.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import me.sumitkawatra.javageek.form.UserForm;

public class UserAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UserForm userForm = (UserForm) form;

		System.out.println("User Form received in Action " + userForm);
		
		return mapping.findForward("success");
	}

}
