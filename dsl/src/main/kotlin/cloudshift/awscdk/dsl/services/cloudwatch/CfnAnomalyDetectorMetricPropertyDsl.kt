@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

/**
 * Represents a specific metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricProperty metricProperty = MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorMetricPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricProperty.Builder =
      CfnAnomalyDetector.MetricProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param dimensions The dimensions for the metric.
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The dimensions for the metric.
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The dimensions for the metric.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricName The name of the metric. 
   * This is a required field.
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace of the metric. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnAnomalyDetector.MetricProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
