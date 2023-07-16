@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@CdkDslMarker
public class CfnImageRecipeSystemsManagerAgentPropertyDsl {
  private val cdkBuilder: CfnImageRecipe.SystemsManagerAgentProperty.Builder =
      CfnImageRecipe.SystemsManagerAgentProperty.builder()

  public fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
    cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
  }

  public fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
    cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
  }

  public fun build(): CfnImageRecipe.SystemsManagerAgentProperty = cdkBuilder.build()
}
