package controllers;

import models.ColumnModel;
import models.Member;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.aa;
import views.html.member;

import java.util.List;

/**
 * Created by sunway on 2016/4/12.
 */
public class MemberController extends Controller {

    public Result index() {
        List<Member> list = Member.findByTableName();

        return  ok(member.render(list));
    }

}
