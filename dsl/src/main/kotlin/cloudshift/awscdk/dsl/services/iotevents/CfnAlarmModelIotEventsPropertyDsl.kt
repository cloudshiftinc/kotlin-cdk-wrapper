@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelIotEventsPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.IotEventsProperty.Builder =
      CfnAlarmModel.IotEventsProperty.builder()

  public fun inputName(inputName: String) {
    cdkBuilder.inputName(inputName)
  }

  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun build(): CfnAlarmModel.IotEventsProperty = cdkBuilder.build()
}
