@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

@CdkDslMarker
public class CfnDataIntegrationScheduleConfigPropertyDsl {
  private val cdkBuilder: CfnDataIntegration.ScheduleConfigProperty.Builder =
      CfnDataIntegration.ScheduleConfigProperty.builder()

  public fun firstExecutionFrom(firstExecutionFrom: String) {
    cdkBuilder.firstExecutionFrom(firstExecutionFrom)
  }

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnDataIntegration.ScheduleConfigProperty = cdkBuilder.build()
}
