@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.Map

public interface MetricProps : CommonMetricOptions {
  public fun metricName(): String

  public fun namespace(): String

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun color(color: String)

    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    public fun label(label: String)

    public fun metricName(metricName: String)

    public fun namespace(namespace: String)

    public fun period(period: Duration)

    public fun region(region: String)

    public fun statistic(statistic: String)

    public fun unit(unit: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricProps.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricProps.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

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

    override fun unit(unit: Unit) {
      cdkBuilder.unit(unit.let(Unit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricProps,
  ) : CdkObject(cdkObject), MetricProps {
    override fun account(): String? = unwrap(this).getAccount()

    override fun color(): String? = unwrap(this).getColor()

    override fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?:
        emptyMap()

    override fun label(): String? = unwrap(this).getLabel()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun namespace(): String = unwrap(this).getNamespace()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun unit(): Unit? = unwrap(this).getUnit()?.let(Unit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): MetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricProps):
        MetricProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricProps):
        software.amazon.awscdk.services.cloudwatch.MetricProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudwatch.MetricProps
  }
}
