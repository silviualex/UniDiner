package diner.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "id_order")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user", nullable = false)
	private UserDiner userDiner;
	
	@OneToMany(mappedBy="order")
	private List<OrderQuantity> orderQuantities;
	
	@Column(name = "taken")
	private Boolean taken;

	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "hour")
	private String hour;
	
	public Order() {
		super();
	}

	public Order(Integer id, UserDiner userDiner, Boolean taken, String date, String hour) {
		super();
		this.id = id;
		this.userDiner = userDiner;
		this.taken = taken;
		this.date = date;
		this.hour = hour;
	}
	
	public Order(UserDiner userDiner, Boolean taken, String date, String hour) {
		super();
		this.userDiner = userDiner;
		this.taken = taken;
		this.date = date;
		this.hour = hour;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserDiner getUserDiner() {
		return userDiner;
	}

	public void setUserDiner(UserDiner userDiner) {
		this.userDiner = userDiner;
	}

	public List<OrderQuantity> getOrderQuantities() {
		return orderQuantities;
	}

	public void setOrderQuantities(List<OrderQuantity> orderQuantities) {
		this.orderQuantities = orderQuantities;
	}

	public Boolean getTaken() {
		return taken;
	}

	public void setTaken(Boolean taken) {
		this.taken = taken;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", taken=" + taken + ", date=" + date + ", hour=" + hour + "]";
	}
}