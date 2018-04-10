package com.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.Form.LoginForm;

public class LoginAction extends Action{
		@Override
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			LoginForm loginForm=(LoginForm)form;
			if(loginForm.getUser()==null || loginForm.getPassword()==null || !loginForm.getUser().equalsIgnoreCase("suhas") || !loginForm.getPassword().equalsIgnoreCase("bhame")) {
				return mapping.findForward("failure");
			}
			else
				return mapping.findForward("success");
		}
}
