@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileBehaviorPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.BehaviorProperty.Builder =
      CfnSecurityProfile.BehaviorProperty.builder()

  /**
   * @param criteria The criteria that determine if a device is behaving normally in regard to the
   * `metric` .
   */
  public fun criteria(criteria: IResolvable) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * @param criteria The criteria that determine if a device is behaving normally in regard to the
   * `metric` .
   */
  public fun criteria(criteria: CfnSecurityProfile.BehaviorCriteriaProperty) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * @param metric What is measured by the behavior.
   */
  public fun metric(metric: String) {
    cdkBuilder.metric(metric)
  }

  /**
   * @param metricDimension The dimension of the metric.
   */
  public fun metricDimension(metricDimension: IResolvable) {
    cdkBuilder.metricDimension(metricDimension)
  }

  /**
   * @param metricDimension The dimension of the metric.
   */
  public fun metricDimension(metricDimension: CfnSecurityProfile.MetricDimensionProperty) {
    cdkBuilder.metricDimension(metricDimension)
  }

  /**
   * @param name The name you've given to the behavior. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param suppressAlerts The alert status.
   * If you set the value to `true` , alerts will be suppressed.
   */
  public fun suppressAlerts(suppressAlerts: Boolean) {
    cdkBuilder.suppressAlerts(suppressAlerts)
  }

  /**
   * @param suppressAlerts The alert status.
   * If you set the value to `true` , alerts will be suppressed.
   */
  public fun suppressAlerts(suppressAlerts: IResolvable) {
    cdkBuilder.suppressAlerts(suppressAlerts)
  }

  public fun build(): CfnSecurityProfile.BehaviorProperty = cdkBuilder.build()
}
