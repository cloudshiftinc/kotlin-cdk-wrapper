@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.constructs.Construct

/**
 * The `AWS::CloudWatch::AnomalyDetector` type specifies an anomaly detection band for a certain
 * metric and statistic.
 *
 * The band represents the expected "normal" range for the metric values. Anomaly detection bands
 * can be used for visualization of a metric's expected values, and for alarms.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnAnomalyDetector cfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this,
 * "MyCfnAnomalyDetector")
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
public class CfnAnomalyDetectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAnomalyDetector.Builder =
        CfnAnomalyDetector.Builder.create(scope, id)

    private val _dimensions: MutableList<Any> = mutableListOf()

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     *
     * The configuration can also include the time zone to use for the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
     *
     * @param configuration Specifies details about how the anomaly detection model is to be
     *   trained, including time ranges to exclude when training and updating the model.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     *
     * The configuration can also include the time zone to use for the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
     *
     * @param configuration Specifies details about how the anomaly detection model is to be
     *   trained, including time ranges to exclude when training and updating the model.
     */
    public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The dimensions of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
     *
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /**
     * The dimensions of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
     *
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * The dimensions of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
     *
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /**
     * The CloudWatch metric math expression for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
     *
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     *   detector.
     */
    public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
        cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
    }

    /**
     * The CloudWatch metric math expression for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
     *
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     *   detector.
     */
    public fun metricMathAnomalyDetector(
        metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty
    ) {
        cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
    }

    /**
     * The name of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
     *
     * @param metricName The name of the metric associated with the anomaly detection band.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * The namespace of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
     *
     * @param namespace The namespace of the metric associated with the anomaly detection band.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * The CloudWatch metric and statistic for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
     *
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     *   detector.
     */
    public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
        cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
    }

    /**
     * The CloudWatch metric and statistic for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
     *
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     *   detector.
     */
    public fun singleMetricAnomalyDetector(
        singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty
    ) {
        cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
    }

    /**
     * The statistic of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
     *
     * @param stat The statistic of the metric associated with the anomaly detection band.
     */
    public fun stat(stat: String) {
        cdkBuilder.stat(stat)
    }

    public fun build(): CfnAnomalyDetector {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
