@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionStreamSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.StreamSAMPTProperty.Builder =
      CfnFunction.StreamSAMPTProperty.builder()

  /**
   * @param streamName the value to be set. 
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnFunction.StreamSAMPTProperty = cdkBuilder.build()
}
