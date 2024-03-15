@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun dimensions(dimensions: List<Dimension>)

    public fun dimensions(vararg dimensions: Dimension)

    public fun metricName(metricName: String)

    public fun namespace(namespace: String)

    public fun period(period: Duration)

    public fun region(region: String)

    public fun statistic(statistic: String)

    public fun unitFilter(unitFilter: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricStatConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun dimensions(dimensions: List<Dimension>) {
      cdkBuilder.dimensions(dimensions.map(Dimension::unwrap))
    }

    override fun dimensions(vararg dimensions: Dimension): kotlin.Unit =
        dimensions(dimensions.toList())

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun unitFilter(unitFilter: Unit) {
      cdkBuilder.unitFilter(unitFilter.let(Unit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricStatConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig,
  ) : CdkObject(cdkObject), MetricStatConfig {
    override fun account(): String? = unwrap(this).getAccount()

    override fun dimensions(): List<Dimension> = unwrap(this).getDimensions()?.map(Dimension::wrap)
        ?: emptyList()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun namespace(): String = unwrap(this).getNamespace()

    override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun statistic(): String = unwrap(this).getStatistic()

    override fun unitFilter(): Unit? = unwrap(this).getUnitFilter()?.let(Unit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): MetricStatConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig):
        MetricStatConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricStatConfig):
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MetricStatConfig
  }
}
