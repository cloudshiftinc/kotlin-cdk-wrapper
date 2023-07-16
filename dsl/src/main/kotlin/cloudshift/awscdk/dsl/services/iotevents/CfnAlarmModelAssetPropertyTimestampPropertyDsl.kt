@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAssetPropertyTimestampPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AssetPropertyTimestampProperty.Builder =
      CfnAlarmModel.AssetPropertyTimestampProperty.builder()

  public fun offsetInNanos(offsetInNanos: String) {
    cdkBuilder.offsetInNanos(offsetInNanos)
  }

  public fun timeInSeconds(timeInSeconds: String) {
    cdkBuilder.timeInSeconds(timeInSeconds)
  }

  public fun build(): CfnAlarmModel.AssetPropertyTimestampProperty = cdkBuilder.build()
}
