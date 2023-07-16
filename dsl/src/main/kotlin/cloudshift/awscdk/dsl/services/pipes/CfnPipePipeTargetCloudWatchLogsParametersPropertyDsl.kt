@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder =
      CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  public fun timestamp(timestamp: String) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun build(): CfnPipe.PipeTargetCloudWatchLogsParametersProperty = cdkBuilder.build()
}
