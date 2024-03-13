package io.cloudshiftdev.awscdk.services.logs

import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

public interface MetricFilterOptions {
  public fun defaultValue(): Number? = unwrap(this).getDefaultValue()

  public fun dimensions(): Map<String, String> = unwrap(this).getDimensions() ?: emptyMap()

  public fun filterName(): String? = unwrap(this).getFilterName()

  public fun filterPattern(): IFilterPattern

  public fun metricName(): String

  public fun metricNamespace(): String

  public fun metricValue(): String? = unwrap(this).getMetricValue()

  public fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)

  public interface Builder {
    public fun defaultValue(defaultValue: Number) {
    }

    public fun dimensions(dimensions: Map<String, String>) {
    }

    public fun filterName(filterName: String) {
    }

    public fun filterPattern(filterPattern: IFilterPattern) {
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.MetricFilterOptions.Builder =
        software.amazon.awscdk.services.logs.MetricFilterOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.logs.MetricFilterOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.MetricFilterOptions,
  ) : MetricFilterOptions {
    public override fun defaultValue(): Number? = unwrap(this).getDefaultValue()

    public override fun dimensions(): Map<String, String> = unwrap(this).getDimensions() ?:
        emptyMap()

    public override fun filterName(): String? = unwrap(this).getFilterName()

    public override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)

    public override fun metricName(): String = unwrap(this).getMetricName()

    public override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

    public override fun metricValue(): String? = unwrap(this).getMetricValue()

    public override fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> KotlinUnit = {}): MetricFilterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.MetricFilterOptions):
        MetricFilterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricFilterOptions):
        software.amazon.awscdk.services.logs.MetricFilterOptions = (wrapped as Wrapper).cdkObject
  }
}
