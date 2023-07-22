@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeConditionExpressionPropertyDsl {
  private val cdkBuilder: CfnRecipe.ConditionExpressionProperty.Builder =
      CfnRecipe.ConditionExpressionProperty.builder()

  /**
   * @param condition A specific condition to apply to a recipe action. 
   * For more information, see [Recipe
   * structure](https://docs.aws.amazon.com/databrew/latest/dg/recipe-structure.html) in the *AWS Glue
   * DataBrew Developer Guide* .
   */
  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param targetColumn A column to apply this condition to. 
   */
  public fun targetColumn(targetColumn: String) {
    cdkBuilder.targetColumn(targetColumn)
  }

  /**
   * @param value A value that the condition must evaluate to for the condition to succeed.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRecipe.ConditionExpressionProperty = cdkBuilder.build()
}
