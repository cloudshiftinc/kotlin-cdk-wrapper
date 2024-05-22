@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

/**
 * Properties for a MetricFilter.
 *
 * Example:
 *
 * ```
 * MetricFilter.Builder.create(this, "MetricFilter")
 * .logGroup(logGroup)
 * .metricNamespace("MyApp")
 * .metricName("Latency")
 * .filterPattern(FilterPattern.exists("$.latency"))
 * .metricValue("$.latency")
 * .build();
 * ```
 */
public interface MetricFilterProps : MetricFilterOptions {
  /**
   * The log group to create the filter on.
   */
  public fun logGroup(): ILogGroup

  /**
   * A builder for [MetricFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultValue The value to emit if the pattern does not match a particular event.
     */
    public fun defaultValue(defaultValue: Number)

    /**
     * @param dimensions The fields to use as dimensions for the metric.
     * One metric filter can include as many as three dimensions.
     */
    public fun dimensions(dimensions: Map<String, String>)

    /**
     * @param filterName The name of the metric filter.
     */
    public fun filterName(filterName: String)

    /**
     * @param filterPattern Pattern to search for log events. 
     */
    public fun filterPattern(filterPattern: IFilterPattern)

    /**
     * @param logGroup The log group to create the filter on. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param metricName The name of the metric to emit. 
     */
    public fun metricName(metricName: String)

    /**
     * @param metricNamespace The namespace of the metric to emit. 
     */
    public fun metricNamespace(metricNamespace: String)

    /**
     * @param metricValue The value to emit for the metric.
     * Can either be a literal number (typically "1"), or the name of a field in the structure
     * to take the value from the matched event. If you are using a field value, the field
     * value must have been matched using the pattern.
     *
     * If you want to specify a field from a matched JSON structure, use '$.fieldName',
     * and make sure the field is in the pattern (if only as '$.fieldName = *').
     *
     * If you want to specify a field from a matched space-delimited structure,
     * use '$fieldName'.
     */
    public fun metricValue(metricValue: String)

    /**
     * @param unit The unit to assign to the metric.
     */
    public fun unit(unit: CloudwatchUnit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MetricFilterProps.Builder =
        software.amazon.awscdk.services.logs.MetricFilterProps.builder()

    /**
     * @param defaultValue The value to emit if the pattern does not match a particular event.
     */
    override fun defaultValue(defaultValue: Number) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param dimensions The fields to use as dimensions for the metric.
     * One metric filter can include as many as three dimensions.
     */
    override fun dimensions(dimensions: Map<String, String>) {
      cdkBuilder.dimensions(dimensions)
    }

    /**
     * @param filterName The name of the metric filter.
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern Pattern to search for log events. 
     */
    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern.Companion::unwrap))
    }

    /**
     * @param logGroup The log group to create the filter on. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param metricName The name of the metric to emit. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param metricNamespace The namespace of the metric to emit. 
     */
    override fun metricNamespace(metricNamespace: String) {
      cdkBuilder.metricNamespace(metricNamespace)
    }

    /**
     * @param metricValue The value to emit for the metric.
     * Can either be a literal number (typically "1"), or the name of a field in the structure
     * to take the value from the matched event. If you are using a field value, the field
     * value must have been matched using the pattern.
     *
     * If you want to specify a field from a matched JSON structure, use '$.fieldName',
     * and make sure the field is in the pattern (if only as '$.fieldName = *').
     *
     * If you want to specify a field from a matched space-delimited structure,
     * use '$fieldName'.
     */
    override fun metricValue(metricValue: String) {
      cdkBuilder.metricValue(metricValue)
    }

    /**
     * @param unit The unit to assign to the metric.
     */
    override fun unit(unit: CloudwatchUnit) {
      cdkBuilder.unit(unit.let(CloudwatchUnit.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.MetricFilterProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.MetricFilterProps,
  ) : CdkObject(cdkObject), MetricFilterProps {
    /**
     * The value to emit if the pattern does not match a particular event.
     *
     * Default: No metric emitted.
     */
    override fun defaultValue(): Number? = unwrap(this).getDefaultValue()

    /**
     * The fields to use as dimensions for the metric.
     *
     * One metric filter can include as many as three dimensions.
     *
     * Default: - No dimensions attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
     */
    override fun dimensions(): Map<String, String> = unwrap(this).getDimensions() ?: emptyMap()

    /**
     * The name of the metric filter.
     *
     * Default: - Cloudformation generated name.
     */
    override fun filterName(): String? = unwrap(this).getFilterName()

    /**
     * Pattern to search for log events.
     */
    override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)

    /**
     * The log group to create the filter on.
     */
    override fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

    /**
     * The name of the metric to emit.
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * The namespace of the metric to emit.
     */
    override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

    /**
     * The value to emit for the metric.
     *
     * Can either be a literal number (typically "1"), or the name of a field in the structure
     * to take the value from the matched event. If you are using a field value, the field
     * value must have been matched using the pattern.
     *
     * If you want to specify a field from a matched JSON structure, use '$.fieldName',
     * and make sure the field is in the pattern (if only as '$.fieldName = *').
     *
     * If you want to specify a field from a matched space-delimited structure,
     * use '$fieldName'.
     *
     * Default: "1"
     */
    override fun metricValue(): String? = unwrap(this).getMetricValue()

    /**
     * The unit to assign to the metric.
     *
     * Default: - No unit attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
     */
    override fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> KotlinUnit = {}): MetricFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MetricFilterProps):
        MetricFilterProps = CdkObjectWrappers.wrap(cdkObject) as? MetricFilterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricFilterProps):
        software.amazon.awscdk.services.logs.MetricFilterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.MetricFilterProps
  }
}
