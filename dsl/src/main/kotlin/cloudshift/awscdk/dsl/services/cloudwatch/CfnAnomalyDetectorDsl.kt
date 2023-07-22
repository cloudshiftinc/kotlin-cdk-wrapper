@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.constructs.Construct

@CdkDslMarker
public class CfnAnomalyDetectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAnomalyDetector.Builder = CfnAnomalyDetector.Builder.create(scope, id)

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * Specifies details about how the anomaly detection model is to be trained, including time ranges
   * to exclude when training and updating the model.
   *
   * The configuration can also include the time zone to use for the metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
   * @param configuration Specifies details about how the anomaly detection model is to be trained,
   * including time ranges to exclude when training and updating the model. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * Specifies details about how the anomaly detection model is to be trained, including time ranges
   * to exclude when training and updating the model.
   *
   * The configuration can also include the time zone to use for the metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
   * @param configuration Specifies details about how the anomaly detection model is to be trained,
   * including time ranges to exclude when training and updating the model. 
   */
  public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * The dimensions of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
   * @param dimensions The dimensions of the metric associated with the anomaly detection band. 
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * The dimensions of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
   * @param dimensions The dimensions of the metric associated with the anomaly detection band. 
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * The dimensions of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
   * @param dimensions The dimensions of the metric associated with the anomaly detection band. 
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * The CloudWatch metric math expression for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
   * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
   * detector. 
   */
  public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  /**
   * The CloudWatch metric math expression for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
   * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
   * detector. 
   */
  public
      fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  /**
   * The name of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
   * @param metricName The name of the metric associated with the anomaly detection band. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The namespace of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
   * @param namespace The namespace of the metric associated with the anomaly detection band. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * The CloudWatch metric and statistic for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
   * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
   * detector. 
   */
  public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  /**
   * The CloudWatch metric and statistic for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
   * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
   * detector. 
   */
  public
      fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  /**
   * The statistic of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
   * @param stat The statistic of the metric associated with the anomaly detection band. 
   */
  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun build(): CfnAnomalyDetector {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
