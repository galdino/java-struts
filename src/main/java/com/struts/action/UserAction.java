package com.struts.action;

import com.struts.dao.UserDao;
import com.struts.model.User;
import com.struts.service.UserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserAction extends MappingDispatchAction {
    private UserService userService;

    public UserAction() {
        this.userService = new UserService();
    }

//    public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        return mapping.findForward("addUser");
//    }

    public ActionForward addUserPost(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = (User) form;
        userService.addUser(user);

        return mapping.findForward("success");
    }

    public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.valueOf(request.getParameter("userId"));
        userService.deleteUser(id);

        return mapping.findForward("deleteUser");
    }

    public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return mapping.findForward("updateUser");
    }

    public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//
//        User user = (User) form;
//        user.setName(name);
//        user.setAge(Integer.valueOf(age));

        int id = Integer.valueOf(request.getParameter("userId"));
//        UserService userService  = new UserService();
        User user = userService.getUserById(id);

        request.setAttribute("u", user);
        return mapping.findForward("viewUser");
    }

    public ActionForward listUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> users = userService.getUsers();

        request.setAttribute("userList", users);

        return mapping.findForward("listUser");
    }
}
