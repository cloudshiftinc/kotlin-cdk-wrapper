package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
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
  public open fun metric(): Metric = unwrap(this).metric().let(Metric::wrap)

  public open fun metric(props: MetricOptions): Metric =
      unwrap(this).metric(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec693c07b949f7893ac3c8fd5763a478f511c0166cc34b95609db468d9ef6414")
  public open fun metric(props: MetricOptions.Builder.() -> KotlinUnit): Metric =
      metric(MetricOptions(props))

  public interface Builder {
    public fun defaultValue(defaultValue: Number) {
    }

    public fun dimensions(dimensions: Map<String, String>) {
    }

    public fun filterName(filterName: String) {
    }

    public fun filterPattern(filterPattern: IFilterPattern) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun metricName(metricName: String) {
    }

    public fun metricNamespace(metricNamespace: String) {
    }

    public fun metricValue(metricValue: String) {
    }

    public fun unit(unit: CloudwatchUnit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MetricFilter.Builder =
        software.amazon.awscdk.services.logs.MetricFilter.Builder.create(scope, id)

    public override fun defaultValue(defaultValue: Number) {
      cdkBuilder.defaultValue(defaultValue)
    }

    public override fun dimensions(dimensions: Map<String, String>) {
      cdkBuilder.dimensions(dimensions)
    }

    public override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    public override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun metricNamespace(metricNamespace: String) {
      cdkBuilder.metricNamespace(metricNamespace)
    }

    public override fun metricValue(metricValue: String) {
      cdkBuilder.metricValue(metricValue)
    }

    public override fun unit(unit: CloudwatchUnit) {
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
