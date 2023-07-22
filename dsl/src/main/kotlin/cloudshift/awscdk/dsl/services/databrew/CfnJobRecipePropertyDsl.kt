@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobRecipePropertyDsl {
  private val cdkBuilder: CfnJob.RecipeProperty.Builder = CfnJob.RecipeProperty.builder()

  /**
   * @param name The unique name for the recipe. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param version The identifier for the version for the recipe.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnJob.RecipeProperty = cdkBuilder.build()
}
