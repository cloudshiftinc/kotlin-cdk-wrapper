@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineStageTransitionPropertyDsl {
  private val cdkBuilder: CfnPipeline.StageTransitionProperty.Builder =
      CfnPipeline.StageTransitionProperty.builder()

  public fun reason(reason: String) {
    cdkBuilder.reason(reason)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnPipeline.StageTransitionProperty = cdkBuilder.build()
}
