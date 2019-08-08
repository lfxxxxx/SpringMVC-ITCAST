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
public class Orders {
	private Integer id;
	private Integer userId;
	private String number;
	private Date createtime;
	private String note;

	@Override
	public String toString() {
		return "Orders{" +
				"id=" + id +
				", userId=" + userId +
				", number='" + number + '\'' +
				", createtime=" + createtime +
				", note='" + note + '\'' +
				'}';
	}
}