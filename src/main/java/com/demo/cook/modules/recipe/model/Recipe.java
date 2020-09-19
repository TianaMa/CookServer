package com.demo.cook.modules.recipe.model;

import java.util.List;

public class Recipe {


    private String recipeId;

    private String issuer;

    private String recipeName;

    private String cover;

    private String recipeDescribe;

    private String tips;

    private List<RecipeMaterial> recipeMaterialList;

    private List<RecipeStep> recipeStepList;

    public List<RecipeMaterial> getRecipeMaterialList() {
        return recipeMaterialList;
    }

    public void setRecipeMaterialList(List<RecipeMaterial> recipeMaterialList) {
        this.recipeMaterialList = recipeMaterialList;
    }

    public List<RecipeStep> getRecipeStepList() {
        return recipeStepList;
    }

    public void setRecipeStepList(List<RecipeStep> recipeStepList) {
        this.recipeStepList = recipeStepList;
    }

    public Recipe(String recipeId, String issuer, String recipeName, String cover, String recipeDescribe, String tips) {
        this.recipeId = recipeId;
        this.issuer = issuer;
        this.recipeName = recipeName;
        this.cover = cover;
        this.recipeDescribe = recipeDescribe;
        this.tips = tips;
    }

    public Recipe() {
        super();
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId == null ? null : recipeId.trim();
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer == null ? null : issuer.trim();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName == null ? null : recipeName.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getRecipeDescribe() {
        return recipeDescribe;
    }

    public void setRecipeDescribe(String recipeDescribe) {
        this.recipeDescribe = recipeDescribe == null ? null : recipeDescribe.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }
}