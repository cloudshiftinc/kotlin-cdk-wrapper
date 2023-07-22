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

  /**
   * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
   * final build image, prior to creating the new AMI.
   * If this is set to true, then the agent is removed from the final image. If it's set to false,
   * then the agent is left in, so that it is included in the new AMI. The default value is false.
   */
  public fun uninstallAfterBuild(uninstallAfterBuild: Boolean) {
    cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
  }

  /**
   * @param uninstallAfterBuild Controls whether the Systems Manager agent is removed from your
   * final build image, prior to creating the new AMI.
   * If this is set to true, then the agent is removed from the final image. If it's set to false,
   * then the agent is left in, so that it is included in the new AMI. The default value is false.
   */
  public fun uninstallAfterBuild(uninstallAfterBuild: IResolvable) {
    cdkBuilder.uninstallAfterBuild(uninstallAfterBuild)
  }

  public fun build(): CfnImageRecipe.SystemsManagerAgentProperty = cdkBuilder.build()
}
