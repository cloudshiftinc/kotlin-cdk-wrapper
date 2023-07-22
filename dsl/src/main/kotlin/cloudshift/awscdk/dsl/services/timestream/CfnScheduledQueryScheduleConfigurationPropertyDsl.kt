@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryScheduleConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.ScheduleConfigurationProperty.Builder =
      CfnScheduledQuery.ScheduleConfigurationProperty.builder()

  /**
   * @param scheduleExpression An expression that denotes when to trigger the scheduled query run. 
   * This can be a cron expression or a rate expression.
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnScheduledQuery.ScheduleConfigurationProperty = cdkBuilder.build()
}
