package com.demo.cook.modules.recipe.service;


import com.demo.cook.common.response.Rtn;
import com.demo.cook.common.response.RtnResult;
import com.demo.cook.modules.recipe.mapper.RecipeMapper;
import com.demo.cook.modules.recipe.mapper.RecipeMaterialMapper;
import com.demo.cook.modules.recipe.mapper.RecipeStepMapper;
import com.demo.cook.modules.recipe.model.MyPublishRecipe;
import com.demo.cook.modules.recipe.model.Recipe;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecipeServiceImpl implements IRecipeService{

    private RecipeMapper recipeMapper;
    private RecipeMaterialMapper recipeMaterialMapper;
    private RecipeStepMapper recipeStepMapper;

    @Autowired
    public void setRecipeMapper(RecipeMapper recipeMapper) {
        this.recipeMapper = recipeMapper;
    }
    @Autowired
    public void setRecipeMaterialMapper(RecipeMaterialMapper recipeMaterialMapper) {
        this.recipeMaterialMapper = recipeMaterialMapper;
    }
    @Autowired
    public void setRecipeStepMapper(RecipeStepMapper recipeStepMapper) {
        this.recipeStepMapper = recipeStepMapper;
    }

    @Override
    public RtnResult<Recipe> publishRecipe(Recipe recipe) throws Exception {

        String recipeId = UUID.randomUUID().toString();
        recipe.setRecipeId(recipeId);

        recipeMapper.insertSelective(recipe);

        recipeMaterialMapper.batchInsertMaterial(recipeId,recipe.getRecipeMaterialList());

        recipeStepMapper.batchInsertStep(recipeId,recipe.getRecipeStepList());

        return new RtnResult<>(Rtn.success);
    }

    @Override
    public RtnResult<List<MyPublishRecipe>> queryMyPublishRecipe(String username) throws Exception {

        if(StringUtils.isNullOrEmpty(username)){
            return new RtnResult<>(Rtn.missingParameter);
        }
        return new RtnResult<>(Rtn.success,recipeMapper.queryMyPublishRecipe(username));
    }

    @Override
    public RtnResult<Recipe> queryRecipeDetails(String recipeId) throws Exception {
        if(StringUtils.isNullOrEmpty(recipeId)){
            return new RtnResult<>(Rtn.missingParameter);
        }

        Recipe recipe = recipeMapper.selectByPrimaryKey(recipeId);
        if (recipe==null){
            return new RtnResult<>(Rtn.noData);
        }
        recipe.setRecipeMaterialList(recipeMaterialMapper.selectMaterialListByRecipeId(recipeId));
        recipe.setRecipeStepList(recipeStepMapper.selectStepListByRecipeId(recipeId));

        return new RtnResult<>(Rtn.success,recipe);
    }

    @Override
    public RtnResult updateMyRecipe(Recipe recipe) throws Exception {

        recipeMapper.updateByPrimaryKeySelective(recipe);

        recipeMaterialMapper.deleteByRecipeId(recipe.getRecipeId());
        recipeStepMapper.deleteStepByRecipeId(recipe.getRecipeId());

        recipeMaterialMapper.batchInsertMaterial(recipe.getRecipeId(),recipe.getRecipeMaterialList());
        recipeStepMapper.batchInsertStep(recipe.getRecipeId(),recipe.getRecipeStepList());

        return new RtnResult<>(Rtn.success);
    }


}
