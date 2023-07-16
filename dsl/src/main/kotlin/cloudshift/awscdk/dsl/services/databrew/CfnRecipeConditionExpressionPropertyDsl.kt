@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeConditionExpressionPropertyDsl {
  private val cdkBuilder: CfnRecipe.ConditionExpressionProperty.Builder =
      CfnRecipe.ConditionExpressionProperty.builder()

  public fun condition(condition: String) {
    cdkBuilder.condition(condition)
  }

  public fun targetColumn(targetColumn: String) {
    cdkBuilder.targetColumn(targetColumn)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRecipe.ConditionExpressionProperty = cdkBuilder.build()
}
