package com.demo.cook.modules.recipe.service;

import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.recipe.model.MyPublishRecipe;
import com.demo.cook.modules.recipe.model.Recipe;

import java.util.List;

public interface IRecipeService {

    RtnResult<Recipe> publishRecipe(Recipe recipe) throws Exception;


    RtnResult<List<MyPublishRecipe>> queryMyPublishRecipe(String username) throws Exception;


    RtnResult<Recipe> queryRecipeDetails(String recipeId) throws Exception;

    RtnResult updateMyRecipe(Recipe recipe) throws Exception;

}
