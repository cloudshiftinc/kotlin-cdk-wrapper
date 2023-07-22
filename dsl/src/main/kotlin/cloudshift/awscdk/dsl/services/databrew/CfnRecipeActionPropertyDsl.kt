@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

@CdkDslMarker
public class CfnRecipeActionPropertyDsl {
  private val cdkBuilder: CfnRecipe.ActionProperty.Builder = CfnRecipe.ActionProperty.builder()

  /**
   * @param operation The name of a valid DataBrew transformation to be performed on the data. 
   */
  public fun operation(operation: String) {
    cdkBuilder.operation(operation)
  }

  /**
   * @param parameters Contextual parameters for the transformation.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters Contextual parameters for the transformation.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnRecipe.ActionProperty = cdkBuilder.build()
}
