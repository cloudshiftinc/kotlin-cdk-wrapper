@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAcknowledgeFlowPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AcknowledgeFlowProperty.Builder =
      CfnAlarmModel.AcknowledgeFlowProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnAlarmModel.AcknowledgeFlowProperty = cdkBuilder.build()
}
