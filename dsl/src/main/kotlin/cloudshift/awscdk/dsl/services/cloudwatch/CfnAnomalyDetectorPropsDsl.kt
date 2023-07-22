@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps

/**
 * Properties for defining a `CfnAnomalyDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnAnomalyDetectorProps cfnAnomalyDetectorProps = CfnAnomalyDetectorProps.builder()
 * .configuration(ConfigurationProperty.builder()
 * .excludedTimeRanges(List.of(RangeProperty.builder()
 * .endTime("endTime")
 * .startTime("startTime")
 * .build()))
 * .metricTimeZone("metricTimeZone")
 * .build())
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accountId("accountId")
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .period(123)
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .period(123)
 * .returnData(false)
 * .build()))
 * .build())
 * .metricName("metricName")
 * .namespace("namespace")
 * .singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .stat("stat")
 * .build())
 * .stat("stat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorPropsDsl {
  private val cdkBuilder: CfnAnomalyDetectorProps.Builder = CfnAnomalyDetectorProps.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param configuration Specifies details about how the anomaly detection model is to be trained,
   * including time ranges to exclude when training and updating the model.
   * The configuration can also include the time zone to use for the metric.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration Specifies details about how the anomaly detection model is to be trained,
   * including time ranges to exclude when training and updating the model.
   * The configuration can also include the time zone to use for the metric.
   */
  public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param dimensions The dimensions of the metric associated with the anomaly detection band.
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The dimensions of the metric associated with the anomaly detection band.
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The dimensions of the metric associated with the anomaly detection band.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
   * detector.
   */
  public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  /**
   * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
   * detector.
   */
  public
      fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  /**
   * @param metricName The name of the metric associated with the anomaly detection band.
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace of the metric associated with the anomaly detection band.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
   * detector.
   */
  public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  /**
   * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
   * detector.
   */
  public
      fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  /**
   * @param stat The statistic of the metric associated with the anomaly detection band.
   */
  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun build(): CfnAnomalyDetectorProps {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
