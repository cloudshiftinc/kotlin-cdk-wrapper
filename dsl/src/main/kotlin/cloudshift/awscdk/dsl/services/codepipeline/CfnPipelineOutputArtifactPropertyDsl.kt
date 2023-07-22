@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineOutputArtifactPropertyDsl {
  private val cdkBuilder: CfnPipeline.OutputArtifactProperty.Builder =
      CfnPipeline.OutputArtifactProperty.builder()

  /**
   * @param name The name of the output of an artifact, such as "My App". 
   * The output artifact name must exactly match the input artifact declared for a downstream
   * action. However, the downstream action's input artifact does not have to be the next action in
   * strict sequence from the action that provided the output artifact. Actions in parallel can declare
   * different output artifacts, which are in turn consumed by different following actions.
   *
   * Output artifact names must be unique within a pipeline.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPipeline.OutputArtifactProperty = cdkBuilder.build()
}
