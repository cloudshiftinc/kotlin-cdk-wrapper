package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.collections.List

public interface MetricStatConfig {
  public fun account(): String? = unwrap(this).getAccount()

  public fun dimensions(): List<Dimension> = unwrap(this).getDimensions()?.map(Dimension::wrap) ?:
      emptyList()

  public fun metricName(): String

  public fun namespace(): String

  public fun period(): Duration

  public fun region(): String? = unwrap(this).getRegion()

  public fun statistic(): String

  public fun unitFilter(): Unit? = unwrap(this).getUnitFilter()?.let(Unit::wrap)

  public interface Builder {
    public fun account(account: String) {
    }

    public fun dimensions(dimensions: List<Dimension>) {
    }

    public fun metricName(metricName: String) {
    }

    public fun namespace(namespace: String) {
    }

    public fun period(period: Duration) {
    }

    public fun region(region: String) {
    }

    public fun statistic(statistic: String) {
    }

    public fun unitFilter(unitFilter: Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricStatConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun dimensions(dimensions: List<Dimension>) {
      cdkBuilder.dimensions(dimensions.map(Dimension::unwrap))
    }

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    public override fun unitFilter(unitFilter: Unit) {
      cdkBuilder.unitFilter(unitFilter.let(Unit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricStatConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig,
  ) : MetricStatConfig {
    public override fun account(): String? = unwrap(this).getAccount()

    public override fun dimensions(): List<Dimension> =
        unwrap(this).getDimensions()?.map(Dimension::wrap) ?: emptyList()

    public override fun metricName(): String = unwrap(this).getMetricName()

    public override fun namespace(): String = unwrap(this).getNamespace()

    public override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun statistic(): String = unwrap(this).getStatistic()

    public override fun unitFilter(): Unit? = unwrap(this).getUnitFilter()?.let(Unit::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): MetricStatConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig):
        MetricStatConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricStatConfig):
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig = (wrapped as Wrapper).cdkObject
  }
}
