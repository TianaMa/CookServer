package com.demo.cook.modules.recipe.model;

public class RecipeStep {
    private String recipeId;

    private String stepContent;

    private String stepImg;

    private int orderIndex;

    public RecipeStep(String recipeId, String stepContent, String stepImg, int order) {
        this.recipeId = recipeId;
        this.stepContent = stepContent;
        this.stepImg = stepImg;
        this.orderIndex = order;
    }

    public RecipeStep() {
        super();
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId == null ? null : recipeId.trim();
    }

    public String getStepContent() {
        return stepContent;
    }

    public void setStepContent(String stepContent) {
        this.stepContent = stepContent == null ? null : stepContent.trim();
    }

    public String getStepImg() {
        return stepImg;
    }

    public void setStepImg(String stepImg) {
        this.stepImg = stepImg == null ? null : stepImg.trim();
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
}