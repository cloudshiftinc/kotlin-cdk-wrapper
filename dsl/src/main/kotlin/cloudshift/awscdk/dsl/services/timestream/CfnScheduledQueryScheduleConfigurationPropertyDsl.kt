@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryScheduleConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.ScheduleConfigurationProperty.Builder =
      CfnScheduledQuery.ScheduleConfigurationProperty.builder()

  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnScheduledQuery.ScheduleConfigurationProperty = cdkBuilder.build()
}
