package com.demo.cook.modules.recipe.controller;


import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.recipe.model.MyPublishRecipe;
import com.demo.cook.modules.recipe.model.Recipe;
import com.demo.cook.modules.recipe.service.IRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/recipe")
public class RecipeController {


    private IRecipeService recipeService;

    @Autowired
    public void setRecipeService(IRecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/publish",method = RequestMethod.POST)
    public RtnResult publish(@RequestBody Recipe recipe)  {
        try {
            System.out.println("publish==========");
            return recipeService.publishRecipe(recipe);
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }

    @RequestMapping(value = "/queryMyPublish",method = RequestMethod.GET)
    public RtnResult<List<MyPublishRecipe>> queryMyPublish(HttpServletRequest params)  {
        try {
            return recipeService.queryMyPublishRecipe(params.getParameter("username"));
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }


    @RequestMapping(value = "/queryRecipeDetails",method = RequestMethod.GET)
    public RtnResult<Recipe> queryRecipeDetails(HttpServletRequest params)  {
        try {
            return recipeService.queryRecipeDetails(params.getParameter("recipeId"));
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }


    @RequestMapping(value = "/updateMyRecipe",method = RequestMethod.POST)
    public RtnResult updateMyRecipe(@RequestBody Recipe recipe)  {
        try {
            System.out.println("updateMyRecipe==========");
            return recipeService.updateMyRecipe(recipe);
        } catch (Exception e) {
            e.printStackTrace();
            return new RtnResult<>(Rtn.serviceException);
        }
    }



}
