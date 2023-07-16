@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule

@CdkDslMarker
public class CfnRotationScheduleRotationRulesPropertyDsl {
  private val cdkBuilder: CfnRotationSchedule.RotationRulesProperty.Builder =
      CfnRotationSchedule.RotationRulesProperty.builder()

  public fun automaticallyAfterDays(automaticallyAfterDays: Number) {
    cdkBuilder.automaticallyAfterDays(automaticallyAfterDays)
  }

  public fun duration(duration: String) {
    cdkBuilder.duration(duration)
  }

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnRotationSchedule.RotationRulesProperty = cdkBuilder.build()
}
