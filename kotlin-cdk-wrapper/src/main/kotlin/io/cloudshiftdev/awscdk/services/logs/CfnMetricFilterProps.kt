@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMetricFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnMetricFilterProps cfnMetricFilterProps = CfnMetricFilterProps.builder()
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * .metricTransformations(List.of(MetricTransformationProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricValue("metricValue")
 * // the properties below are optional
 * .defaultValue(123)
 * .dimensions(List.of(DimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build()))
 * // the properties below are optional
 * .filterName("filterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
 */
public interface CfnMetricFilterProps {
  /**
   * The name of the metric filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filtername)
   */
  public fun filterName(): String? = unwrap(this).getFilterName()

  /**
   * A filter pattern for extracting metric data out of ingested log events.
   *
   * For more information, see [Filter and Pattern
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filterpattern)
   */
  public fun filterPattern(): String

  /**
   * The name of an existing log group that you want to associate with this metric filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-loggroupname)
   */
  public fun logGroupName(): String

  /**
   * The metric transformations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
   */
  public fun metricTransformations(): Any

  /**
   * A builder for [CfnMetricFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filterName The name of the metric filter.
     */
    public fun filterName(filterName: String)

    /**
     * @param filterPattern A filter pattern for extracting metric data out of ingested log events. 
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    public fun filterPattern(filterPattern: String)

    /**
     * @param logGroupName The name of an existing log group that you want to associate with this
     * metric filter. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(metricTransformations: IResolvable)

    /**
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(metricTransformations: List<Any>)

    /**
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(vararg metricTransformations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnMetricFilterProps.Builder =
        software.amazon.awscdk.services.logs.CfnMetricFilterProps.builder()

    /**
     * @param filterName The name of the metric filter.
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern A filter pattern for extracting metric data out of ingested log events. 
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param logGroupName The name of an existing log group that you want to associate with this
     * metric filter. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(metricTransformations: IResolvable) {
      cdkBuilder.metricTransformations(metricTransformations.let(IResolvable::unwrap))
    }

    /**
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(metricTransformations: List<Any>) {
      cdkBuilder.metricTransformations(metricTransformations)
    }

    /**
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(vararg metricTransformations: Any): Unit =
        metricTransformations(metricTransformations.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilterProps,
  ) : CdkObject(cdkObject), CfnMetricFilterProps {
    /**
     * The name of the metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filtername)
     */
    override fun filterName(): String? = unwrap(this).getFilterName()

    /**
     * A filter pattern for extracting metric data out of ingested log events.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filterpattern)
     */
    override fun filterPattern(): String = unwrap(this).getFilterPattern()

    /**
     * The name of an existing log group that you want to associate with this metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-loggroupname)
     */
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     */
    override fun metricTransformations(): Any = unwrap(this).getMetricTransformations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMetricFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilterProps):
        CfnMetricFilterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMetricFilterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMetricFilterProps):
        software.amazon.awscdk.services.logs.CfnMetricFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.CfnMetricFilterProps
  }
}
