@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetStateMachineParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetStateMachineParametersProperty.Builder =
      CfnPipe.PipeTargetStateMachineParametersProperty.builder()

  public fun invocationType(invocationType: String) {
    cdkBuilder.invocationType(invocationType)
  }

  public fun build(): CfnPipe.PipeTargetStateMachineParametersProperty = cdkBuilder.build()
}
