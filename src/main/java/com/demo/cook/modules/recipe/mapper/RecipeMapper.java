package com.demo.cook.modules.recipe.mapper;

import com.demo.cook.modules.recipe.model.MyPublishRecipe;
import com.demo.cook.modules.recipe.model.Recipe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeMapper {


    int insertSelective(Recipe record) throws Exception;

    List<MyPublishRecipe> queryMyPublishRecipe(String username) throws Exception;

    int deleteByPrimaryKey(String recipeId) throws Exception;



    Recipe selectByPrimaryKey(String recipeId) throws Exception;

    int updateByPrimaryKeySelective(Recipe record) throws Exception;

}