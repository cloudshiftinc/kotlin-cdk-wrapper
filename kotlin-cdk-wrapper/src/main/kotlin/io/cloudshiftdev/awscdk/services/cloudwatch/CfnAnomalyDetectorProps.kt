@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnomalyDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
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
public interface CfnAnomalyDetectorProps {
  /**
   * Specifies details about how the anomaly detection model is to be trained, including time ranges
   * to exclude when training and updating the model.
   *
   * The configuration can also include the time zone to use for the metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The dimensions of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
   */
  public fun dimensions(): Any? = unwrap(this).getDimensions()

  /**
   * The CloudWatch metric math expression for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
   */
  public fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

  /**
   * The name of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
   */
  public fun metricName(): String? = unwrap(this).getMetricName()

  /**
   * The namespace of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The CloudWatch metric and statistic for this anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
   */
  public fun singleMetricAnomalyDetector(): Any? = unwrap(this).getSingleMetricAnomalyDetector()

  /**
   * The statistic of the metric associated with the anomaly detection band.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
   */
  public fun stat(): String? = unwrap(this).getStat()

  /**
   * A builder for [CfnAnomalyDetectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty)

    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25bd114a6c7a4667628132574afbbca7299c476555f34520512679937557f2bc")
    public
        fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit)

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(dimensions: IResolvable)

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(dimensions: List<Any>)

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    public fun dimensions(vararg dimensions: Any)

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable)

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty)

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("615efef0f72ead6c8c61bebef40805d2487f946d1642d75dea42d5839efa1002")
    public
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder.() -> Unit)

    /**
     * @param metricName The name of the metric associated with the anomaly detection band.
     */
    public fun metricName(metricName: String)

    /**
     * @param namespace The namespace of the metric associated with the anomaly detection band.
     */
    public fun namespace(namespace: String)

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable)

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty)

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1ed043ff6d65d69068d05a416a85fff02a77d84ac3944ec2e1c58b9a617491a")
    public
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit)

    /**
     * @param stat The statistic of the metric associated with the anomaly detection band.
     */
    public fun stat(stat: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps.builder()

    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    override fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnAnomalyDetector.ConfigurationProperty::unwrap))
    }

    /**
     * @param configuration Specifies details about how the anomaly detection model is to be
     * trained, including time ranges to exclude when training and updating the model.
     * The configuration can also include the time zone to use for the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25bd114a6c7a4667628132574afbbca7299c476555f34520512679937557f2bc")
    override
        fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnAnomalyDetector.ConfigurationProperty(configuration))

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    override fun dimensions(dimensions: IResolvable) {
      cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
    }

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    override fun dimensions(dimensions: List<Any>) {
      cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param dimensions The dimensions of the metric associated with the anomaly detection band.
     */
    override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    override fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(IResolvable::unwrap))
    }

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty) {
      cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector.let(CfnAnomalyDetector.MetricMathAnomalyDetectorProperty::unwrap))
    }

    /**
     * @param metricMathAnomalyDetector The CloudWatch metric math expression for this anomaly
     * detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("615efef0f72ead6c8c61bebef40805d2487f946d1642d75dea42d5839efa1002")
    override
        fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        metricMathAnomalyDetector(CfnAnomalyDetector.MetricMathAnomalyDetectorProperty(metricMathAnomalyDetector))

    /**
     * @param metricName The name of the metric associated with the anomaly detection band.
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param namespace The namespace of the metric associated with the anomaly detection band.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    override fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(IResolvable::unwrap))
    }

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty) {
      cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector.let(CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty::unwrap))
    }

    /**
     * @param singleMetricAnomalyDetector The CloudWatch metric and statistic for this anomaly
     * detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1ed043ff6d65d69068d05a416a85fff02a77d84ac3944ec2e1c58b9a617491a")
    override
        fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder.() -> Unit):
        Unit =
        singleMetricAnomalyDetector(CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty(singleMetricAnomalyDetector))

    /**
     * @param stat The statistic of the metric associated with the anomaly detection band.
     */
    override fun stat(stat: String) {
      cdkBuilder.stat(stat)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnAnomalyDetectorProps {
    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     *
     * The configuration can also include the time zone to use for the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The dimensions of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-dimensions)
     */
    override fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The CloudWatch metric math expression for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricmathanomalydetector)
     */
    override fun metricMathAnomalyDetector(): Any? = unwrap(this).getMetricMathAnomalyDetector()

    /**
     * The name of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-metricname)
     */
    override fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The namespace of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-namespace)
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The CloudWatch metric and statistic for this anomaly detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-singlemetricanomalydetector)
     */
    override fun singleMetricAnomalyDetector(): Any? = unwrap(this).getSingleMetricAnomalyDetector()

    /**
     * The statistic of the metric associated with the anomaly detection band.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html#cfn-cloudwatch-anomalydetector-stat)
     */
    override fun stat(): String? = unwrap(this).getStat()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps):
        CfnAnomalyDetectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAnomalyDetectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetectorProps):
        software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
  }
}
