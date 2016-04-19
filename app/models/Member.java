package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sunway on 2016/4/12.
 */
@Entity
@Table(name= "cor_member")
public class Member {
    @Id //PRIMARY KEYを設定
    @Column(name = "member_id") //カラム名を定義
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENTを宣言
//
    public Long id;

    @Column(name = "member_name")
    public String name;
    @Column(name = "member_passwd")
    public String password;
    @Column(name = "member_tel")
    public String phone;
    public static Model.Finder<Long, Member> find = new Model.Finder<Long, Member>("mysql", Member.class);

    public static List<Member> findByTableName() {
//        find.where()
        return find.where().findList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
