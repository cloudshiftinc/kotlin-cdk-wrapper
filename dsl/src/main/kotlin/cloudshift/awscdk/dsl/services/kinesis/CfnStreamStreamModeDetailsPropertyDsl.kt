@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStream

@CdkDslMarker
public class CfnStreamStreamModeDetailsPropertyDsl {
  private val cdkBuilder: CfnStream.StreamModeDetailsProperty.Builder =
      CfnStream.StreamModeDetailsProperty.builder()

  /**
   * @param streamMode Specifies the capacity mode to which you want to set your data stream. 
   * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
   * *provisioned* capacity mode for your data streams.
   */
  public fun streamMode(streamMode: String) {
    cdkBuilder.streamMode(streamMode)
  }

  public fun build(): CfnStream.StreamModeDetailsProperty = cdkBuilder.build()
}
