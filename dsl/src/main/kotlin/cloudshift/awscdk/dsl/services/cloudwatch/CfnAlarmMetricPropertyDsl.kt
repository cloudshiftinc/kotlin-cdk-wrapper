@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

/**
 * The `Metric` property type represents a specific metric.
 *
 * `Metric` is a property of the
 * [MetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricProperty metricProperty = MetricProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html)
 */
@CdkDslMarker
public class CfnAlarmMetricPropertyDsl {
  private val cdkBuilder: CfnAlarm.MetricProperty.Builder = CfnAlarm.MetricProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param dimensions The metric dimensions that you want to be used for the metric that the alarm
   * will watch.
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The metric dimensions that you want to be used for the metric that the alarm
   * will watch.
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The metric dimensions that you want to be used for the metric that the alarm
   * will watch.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricName The name of the metric that you want the alarm to watch.
   * This is a required field.
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace of the metric that the alarm will watch.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnAlarm.MetricProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
