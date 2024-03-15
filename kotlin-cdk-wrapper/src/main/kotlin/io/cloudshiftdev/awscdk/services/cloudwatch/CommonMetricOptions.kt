@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.Map

public interface CommonMetricOptions {
  public fun account(): String? = unwrap(this).getAccount()

  public fun color(): String? = unwrap(this).getColor()

  public fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?: emptyMap()

  public fun label(): String? = unwrap(this).getLabel()

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun region(): String? = unwrap(this).getRegion()

  public fun statistic(): String? = unwrap(this).getStatistic()

  public fun unit(): Unit? = unwrap(this).getUnit()?.let(Unit::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun color(color: String)

    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    public fun label(label: String)

    public fun period(period: Duration)

    public fun region(region: String)

    public fun statistic(statistic: String)

    public fun unit(unit: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CommonMetricOptions.Builder =
        software.amazon.awscdk.services.cloudwatch.CommonMetricOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.CommonMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CommonMetricOptions,
  ) : CdkObject(cdkObject), CommonMetricOptions {
    override fun account(): String? = unwrap(this).getAccount()

    override fun color(): String? = unwrap(this).getColor()

    override fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?:
        emptyMap()

    override fun label(): String? = unwrap(this).getLabel()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun unit(): Unit? = unwrap(this).getUnit()?.let(Unit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): CommonMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CommonMetricOptions):
        CommonMetricOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonMetricOptions):
        software.amazon.awscdk.services.cloudwatch.CommonMetricOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CommonMetricOptions
  }
}
