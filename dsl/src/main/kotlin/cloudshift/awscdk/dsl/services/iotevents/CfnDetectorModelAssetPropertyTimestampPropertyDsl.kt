@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelAssetPropertyTimestampPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.AssetPropertyTimestampProperty.Builder =
      CfnDetectorModel.AssetPropertyTimestampProperty.builder()

  /**
   * @param offsetInNanos The nanosecond offset converted from `timeInSeconds` .
   * The valid range is between 0-999999999.
   */
  public fun offsetInNanos(offsetInNanos: String) {
    cdkBuilder.offsetInNanos(offsetInNanos)
  }

  /**
   * @param timeInSeconds The timestamp, in seconds, in the Unix epoch format. 
   * The valid range is between 1-31556889864403199.
   */
  public fun timeInSeconds(timeInSeconds: String) {
    cdkBuilder.timeInSeconds(timeInSeconds)
  }

  public fun build(): CfnDetectorModel.AssetPropertyTimestampProperty = cdkBuilder.build()
}
