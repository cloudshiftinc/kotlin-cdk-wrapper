@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeRecipeStepPropertyDsl {
  private val cdkBuilder: CfnRecipe.RecipeStepProperty.Builder =
      CfnRecipe.RecipeStepProperty.builder()

  private val _conditionExpressions: MutableList<Any> = mutableListOf()

  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  public fun action(action: CfnRecipe.ActionProperty) {
    cdkBuilder.action(action)
  }

  public fun conditionExpressions(vararg conditionExpressions: Any) {
    _conditionExpressions.addAll(listOf(*conditionExpressions))
  }

  public fun conditionExpressions(conditionExpressions: Collection<Any>) {
    _conditionExpressions.addAll(conditionExpressions)
  }

  public fun conditionExpressions(conditionExpressions: IResolvable) {
    cdkBuilder.conditionExpressions(conditionExpressions)
  }

  public fun build(): CfnRecipe.RecipeStepProperty {
    if(_conditionExpressions.isNotEmpty()) cdkBuilder.conditionExpressions(_conditionExpressions)
    return cdkBuilder.build()
  }
}
