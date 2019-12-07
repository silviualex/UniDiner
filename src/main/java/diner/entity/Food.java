package diner.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_food")
	private Integer id;
	
	@Column(name="food_name")
	private String name;
	
	@Column(name="food_ingredients")
	private String ingredients;
	
	@Column(name="food_weight")
	private int weight;
	
	@Column(name="food_price")
	private double price;
	
	@ManyToMany(mappedBy = "foods")
	private List<Dish> dishes;
	
	@OneToMany(mappedBy="foodd")
	private List<OrderQuantity> foodss;
	
	public Food() {
		super();
		this.dishes = new ArrayList<>();
		this.foodss = new ArrayList<>();
	}

	public Food(String name, String ingredients, int weight, double price) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.weight = weight;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public List<OrderQuantity> getFoodss() {
		return foodss;
	}

	public void setFoodss(List<OrderQuantity> foodss) {
		this.foodss = foodss;
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
		Food other = (Food) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [" + id + ", " + name + ", " + ingredients + ", " + weight + ", "
				+ price + "]";
	}
}