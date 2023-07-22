@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

@CdkDslMarker
public class CfnInputInputDestinationRequestPropertyDsl {
  private val cdkBuilder: CfnInput.InputDestinationRequestProperty.Builder =
      CfnInput.InputDestinationRequestProperty.builder()

  /**
   * @param streamName The stream name (application name/application instance) for the location the
   * RTMP source content will be pushed to in MediaLive.
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnInput.InputDestinationRequestProperty = cdkBuilder.build()
}
