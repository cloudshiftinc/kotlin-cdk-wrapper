@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationScheduledTriggerPropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.ScheduledTriggerPropertiesProperty.Builder =
      CfnIntegration.ScheduledTriggerPropertiesProperty.builder()

  public fun dataPullMode(dataPullMode: String) {
    cdkBuilder.dataPullMode(dataPullMode)
  }

  public fun firstExecutionFrom(firstExecutionFrom: Number) {
    cdkBuilder.firstExecutionFrom(firstExecutionFrom)
  }

  public fun scheduleEndTime(scheduleEndTime: Number) {
    cdkBuilder.scheduleEndTime(scheduleEndTime)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun scheduleOffset(scheduleOffset: Number) {
    cdkBuilder.scheduleOffset(scheduleOffset)
  }

  public fun scheduleStartTime(scheduleStartTime: Number) {
    cdkBuilder.scheduleStartTime(scheduleStartTime)
  }

  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnIntegration.ScheduledTriggerPropertiesProperty = cdkBuilder.build()
}
