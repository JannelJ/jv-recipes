package org.example.recipe;
import jakarta.persistence.*;
import org.example.user.User;
import java.util.Date;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    Long id;

    String title;
    String instructions;
    String preparationTime;
    String cookingTime;
    int servings;

    @Enumerated(EnumType.STRING)
    DifficultyLevel difficultyLevel;

    int rating;
    List<Ingredient> listOfIngredients;
    List<Category> listOfCategories;

    @ManyToOne
    User creator;

    @Temporal(TemporalType.TIMESTAMP)
    Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    Date lastModified;

    public Recipe(String title, String instructions, String preparationTime, String cookingTime, int servings, DifficultyLevel difficultyLevel, List<Ingredient> listOfIngredients, List<Category> listOfCategories, User creator) {
        this.title = title;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.listOfIngredients = listOfIngredients;
        this.listOfCategories = listOfCategories;
        this.creator = creator;
        this.dateCreated = new Date();
        this.lastModified = new Date();
    }

    public Recipe(){}

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Ingredient> getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(List<Ingredient> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public List<Category> getListOfCategories() {
        return listOfCategories;
    }

    public void setListOfCategories(List<Category> listOfCategories) {
        this.listOfCategories = listOfCategories;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = new Date();
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = new Date();
    }
}
