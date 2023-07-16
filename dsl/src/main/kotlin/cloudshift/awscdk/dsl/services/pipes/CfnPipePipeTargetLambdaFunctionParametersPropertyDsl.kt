@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetLambdaFunctionParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetLambdaFunctionParametersProperty.Builder =
      CfnPipe.PipeTargetLambdaFunctionParametersProperty.builder()

  public fun invocationType(invocationType: String) {
    cdkBuilder.invocationType(invocationType)
  }

  public fun build(): CfnPipe.PipeTargetLambdaFunctionParametersProperty = cdkBuilder.build()
}
