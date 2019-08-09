package cn.itcast.ssm.po;

import lombok.Getter;
import lombok.Setter;

/**
 * @author LFX
 * @create 2019-08-06 17:24
 */

@Getter
@Setter
public class Orderdetail {
	private Integer id;
	private Integer ordersId;
	private Integer itemsId;
	private Integer itemsNum;

	@Override
	public String toString() {
		return "Orderdetail{" +
				"id=" + id +
				", ordersId=" + ordersId +
				", itemsId=" + itemsId +
				", itemsNum=" + itemsNum +
				'}';
	}
}