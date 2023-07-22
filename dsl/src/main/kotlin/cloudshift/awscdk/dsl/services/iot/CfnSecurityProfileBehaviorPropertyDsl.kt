@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * A Device Defender security profile behavior.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * BehaviorProperty behaviorProperty = BehaviorProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .criteria(BehaviorCriteriaProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .consecutiveDatapointsToAlarm(123)
 * .consecutiveDatapointsToClear(123)
 * .durationSeconds(123)
 * .mlDetectionConfig(MachineLearningDetectionConfigProperty.builder()
 * .confidenceLevel("confidenceLevel")
 * .build())
 * .statisticalThreshold(StatisticalThresholdProperty.builder()
 * .statistic("statistic")
 * .build())
 * .value(MetricValueProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .count("count")
 * .number(123)
 * .numbers(List.of(123))
 * .ports(List.of(123))
 * .strings(List.of("strings"))
 * .build())
 * .build())
 * .metric("metric")
 * .metricDimension(MetricDimensionProperty.builder()
 * .dimensionName("dimensionName")
 * // the properties below are optional
 * .operator("operator")
 * .build())
 * .suppressAlerts(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-behavior.html)
 */
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
