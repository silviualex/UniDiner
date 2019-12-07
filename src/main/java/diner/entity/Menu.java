package diner.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import diner.constants.MenuStates;

@Entity
@Table(name="menu")
public class Menu 
{
	@Id
	@Column(name="id_menu")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="menu_data")
	private String date;
	
	@Column(name="menu_state")
	private String state;
	
	@Column(name="menu_title")
	private String title;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "menu")
	private List<Dish> dishes;

	public Menu() {
		super();
		this.dishes = new ArrayList<>();
		this.state = MenuStates.NEW.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
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
		Menu other = (Menu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menu [" + id + ", " + date + ", " + state + ", " + title + "]";
	}
}
