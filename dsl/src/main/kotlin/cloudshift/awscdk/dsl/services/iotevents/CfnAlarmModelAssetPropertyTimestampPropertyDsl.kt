@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAssetPropertyTimestampPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AssetPropertyTimestampProperty.Builder =
      CfnAlarmModel.AssetPropertyTimestampProperty.builder()

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

  public fun build(): CfnAlarmModel.AssetPropertyTimestampProperty = cdkBuilder.build()
}
