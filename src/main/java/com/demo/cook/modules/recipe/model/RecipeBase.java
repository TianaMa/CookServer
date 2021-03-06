package com.demo.cook.modules.recipe.model;

public class RecipeBase {

    private String recipeId;

    private String recipeName;

    private String cover;

    private String recipeDescribe;

    private String tips;

    private String sortId;

    private String issuer;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getRecipeDescribe() {
        return recipeDescribe;
    }

    public void setRecipeDescribe(String recipeDescribe) {
        this.recipeDescribe = recipeDescribe;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
