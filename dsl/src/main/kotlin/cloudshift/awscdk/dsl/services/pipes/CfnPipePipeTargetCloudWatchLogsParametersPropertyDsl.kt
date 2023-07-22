@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder =
      CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

  /**
   * @param logStreamName The name of the log stream.
   */
  public fun logStreamName(logStreamName: String) {
    cdkBuilder.logStreamName(logStreamName)
  }

  /**
   * @param timestamp The time the event occurred, expressed as the number of milliseconds after Jan
   * 1, 1970 00:00:00 UTC.
   */
  public fun timestamp(timestamp: String) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun build(): CfnPipe.PipeTargetCloudWatchLogsParametersProperty = cdkBuilder.build()
}
