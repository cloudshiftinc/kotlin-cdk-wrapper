package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

public interface MetricFilterOptions {
  /**
   * The value to emit if the pattern does not match a particular event.
   *
   * Default: No metric emitted.
   */
  public fun defaultValue(): Number? = unwrap(this).getDefaultValue()

  /**
   * The fields to use as dimensions for the metric.
   *
   * One metric filter can include as many as three dimensions.
   *
   * Default: - No dimensions attached to metrics.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
   */
  public fun dimensions(): Map<String, String> = unwrap(this).getDimensions() ?: emptyMap()

  /**
   * The name of the metric filter.
   *
   * Default: - Cloudformation generated name.
   */
  public fun filterName(): String? = unwrap(this).getFilterName()

  /**
   * Pattern to search for log events.
   */
  public fun filterPattern(): IFilterPattern

  /**
   * The name of the metric to emit.
   */
  public fun metricName(): String

  /**
   * The namespace of the metric to emit.
   */
  public fun metricNamespace(): String

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
  public fun metricValue(): String? = unwrap(this).getMetricValue()

  /**
   * The unit to assign to the metric.
   *
   * Default: - No unit attached to metrics.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
   */
  public fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)

  /**
   * A builder for [MetricFilterOptions]
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
    private val cdkBuilder: software.amazon.awscdk.services.logs.MetricFilterOptions.Builder =
        software.amazon.awscdk.services.logs.MetricFilterOptions.builder()

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
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
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
      cdkBuilder.unit(unit.let(CloudwatchUnit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.MetricFilterOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.MetricFilterOptions,
  ) : CdkObject(cdkObject), MetricFilterOptions {
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
    public operator fun invoke(block: Builder.() -> KotlinUnit = {}): MetricFilterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MetricFilterOptions):
        MetricFilterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricFilterOptions):
        software.amazon.awscdk.services.logs.MetricFilterOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.logs.MetricFilterOptions
  }
}
