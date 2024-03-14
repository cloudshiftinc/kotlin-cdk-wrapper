package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Unit as KotlinUnit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class MetricFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.MetricFilter,
) : Resource(cdkObject) {
  /**
   * Return the given named metric for this Metric Filter.
   *
   * Default: avg over 5 minutes
   *
   * @param props
   */
  public open fun metric(): Metric = unwrap(this).metric().let(Metric::wrap)

  /**
   * Return the given named metric for this Metric Filter.
   *
   * Default: avg over 5 minutes
   *
   * @param props
   */
  public open fun metric(props: MetricOptions): Metric =
      unwrap(this).metric(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Metric Filter.
   *
   * Default: avg over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec693c07b949f7893ac3c8fd5763a478f511c0166cc34b95609db468d9ef6414")
  public open fun metric(props: MetricOptions.Builder.() -> KotlinUnit): Metric =
      metric(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.MetricFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The value to emit if the pattern does not match a particular event.
     *
     * Default: No metric emitted.
     *
     * @param defaultValue The value to emit if the pattern does not match a particular event. 
     */
    public fun defaultValue(defaultValue: Number)

    /**
     * The fields to use as dimensions for the metric.
     *
     * One metric filter can include as many as three dimensions.
     *
     * Default: - No dimensions attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
     * @param dimensions The fields to use as dimensions for the metric. 
     */
    public fun dimensions(dimensions: Map<String, String>)

    /**
     * The name of the metric filter.
     *
     * Default: - Cloudformation generated name.
     *
     * @param filterName The name of the metric filter. 
     */
    public fun filterName(filterName: String)

    /**
     * Pattern to search for log events.
     *
     * @param filterPattern Pattern to search for log events. 
     */
    public fun filterPattern(filterPattern: IFilterPattern)

    /**
     * The log group to create the filter on.
     *
     * @param logGroup The log group to create the filter on. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * The name of the metric to emit.
     *
     * @param metricName The name of the metric to emit. 
     */
    public fun metricName(metricName: String)

    /**
     * The namespace of the metric to emit.
     *
     * @param metricNamespace The namespace of the metric to emit. 
     */
    public fun metricNamespace(metricNamespace: String)

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
     *
     * @param metricValue The value to emit for the metric. 
     */
    public fun metricValue(metricValue: String)

    /**
     * The unit to assign to the metric.
     *
     * Default: - No unit attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
     * @param unit The unit to assign to the metric. 
     */
    public fun unit(unit: CloudwatchUnit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MetricFilter.Builder =
        software.amazon.awscdk.services.logs.MetricFilter.Builder.create(scope, id)

    /**
     * The value to emit if the pattern does not match a particular event.
     *
     * Default: No metric emitted.
     *
     * @param defaultValue The value to emit if the pattern does not match a particular event. 
     */
    override fun defaultValue(defaultValue: Number) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * The fields to use as dimensions for the metric.
     *
     * One metric filter can include as many as three dimensions.
     *
     * Default: - No dimensions attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
     * @param dimensions The fields to use as dimensions for the metric. 
     */
    override fun dimensions(dimensions: Map<String, String>) {
      cdkBuilder.dimensions(dimensions)
    }

    /**
     * The name of the metric filter.
     *
     * Default: - Cloudformation generated name.
     *
     * @param filterName The name of the metric filter. 
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * Pattern to search for log events.
     *
     * @param filterPattern Pattern to search for log events. 
     */
    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    /**
     * The log group to create the filter on.
     *
     * @param logGroup The log group to create the filter on. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * The name of the metric to emit.
     *
     * @param metricName The name of the metric to emit. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * The namespace of the metric to emit.
     *
     * @param metricNamespace The namespace of the metric to emit. 
     */
    override fun metricNamespace(metricNamespace: String) {
      cdkBuilder.metricNamespace(metricNamespace)
    }

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
     *
     * @param metricValue The value to emit for the metric. 
     */
    override fun metricValue(metricValue: String) {
      cdkBuilder.metricValue(metricValue)
    }

    /**
     * The unit to assign to the metric.
     *
     * Default: - No unit attached to metrics.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
     * @param unit The unit to assign to the metric. 
     */
    override fun unit(unit: CloudwatchUnit) {
      cdkBuilder.unit(unit.let(CloudwatchUnit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.MetricFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> KotlinUnit = {},
    ): MetricFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return MetricFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MetricFilter): MetricFilter =
        MetricFilter(cdkObject)

    internal fun unwrap(wrapped: MetricFilter): software.amazon.awscdk.services.logs.MetricFilter =
        wrapped.cdkObject
  }
}
