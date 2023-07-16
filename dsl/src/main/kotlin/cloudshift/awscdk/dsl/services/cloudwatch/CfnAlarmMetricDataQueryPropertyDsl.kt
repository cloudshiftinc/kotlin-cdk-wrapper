@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

@CdkDslMarker
public class CfnAlarmMetricDataQueryPropertyDsl {
  private val cdkBuilder: CfnAlarm.MetricDataQueryProperty.Builder =
      CfnAlarm.MetricDataQueryProperty.builder()

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun metricStat(metricStat: IResolvable) {
    cdkBuilder.metricStat(metricStat)
  }

  public fun metricStat(metricStat: CfnAlarm.MetricStatProperty) {
    cdkBuilder.metricStat(metricStat)
  }

  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  public fun returnData(returnData: Boolean) {
    cdkBuilder.returnData(returnData)
  }

  public fun returnData(returnData: IResolvable) {
    cdkBuilder.returnData(returnData)
  }

  public fun build(): CfnAlarm.MetricDataQueryProperty = cdkBuilder.build()
}
