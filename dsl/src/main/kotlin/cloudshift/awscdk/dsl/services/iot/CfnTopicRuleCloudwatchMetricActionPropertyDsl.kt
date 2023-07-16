@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleCloudwatchMetricActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.CloudwatchMetricActionProperty.Builder =
      CfnTopicRule.CloudwatchMetricActionProperty.builder()

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun metricNamespace(metricNamespace: String) {
    cdkBuilder.metricNamespace(metricNamespace)
  }

  public fun metricTimestamp(metricTimestamp: String) {
    cdkBuilder.metricTimestamp(metricTimestamp)
  }

  public fun metricUnit(metricUnit: String) {
    cdkBuilder.metricUnit(metricUnit)
  }

  public fun metricValue(metricValue: String) {
    cdkBuilder.metricValue(metricValue)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.CloudwatchMetricActionProperty = cdkBuilder.build()
}
