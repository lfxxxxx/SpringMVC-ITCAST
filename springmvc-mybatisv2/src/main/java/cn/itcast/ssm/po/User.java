package cn.itcast.ssm.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author LFX
 * @create 2019-08-06 17:24
 */

@Getter
@Setter
public class User {
	private Integer id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", birthday=" + birthday +
				", sex='" + sex + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}