@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineStageTransitionPropertyDsl {
  private val cdkBuilder: CfnPipeline.StageTransitionProperty.Builder =
      CfnPipeline.StageTransitionProperty.builder()

  /**
   * @param reason The reason given to the user that a stage is disabled, such as waiting for manual
   * approval or manual tests. 
   * This message is displayed in the pipeline console UI.
   */
  public fun reason(reason: String) {
    cdkBuilder.reason(reason)
  }

  /**
   * @param stageName The name of the stage where you want to disable the inbound or outbound
   * transition of artifacts. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnPipeline.StageTransitionProperty = cdkBuilder.build()
}
