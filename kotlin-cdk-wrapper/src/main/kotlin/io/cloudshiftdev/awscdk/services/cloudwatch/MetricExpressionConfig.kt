@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface MetricExpressionConfig {
  public fun expression(): String

  public fun period(): Number

  public fun searchAccount(): String? = unwrap(this).getSearchAccount()

  public fun searchRegion(): String? = unwrap(this).getSearchRegion()

  public fun usingMetrics(): Map<String, IMetric>

  @CdkDslMarker
  public interface Builder {
    public fun expression(expression: String)

    public fun period(period: Number)

    public fun searchAccount(searchAccount: String)

    public fun searchRegion(searchRegion: String)

    public fun usingMetrics(usingMetrics: Map<String, IMetric>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.builder()

    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
    }

    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    override fun usingMetrics(usingMetrics: Map<String, IMetric>) {
      cdkBuilder.usingMetrics(usingMetrics.mapValues{IMetric.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig,
  ) : CdkObject(cdkObject), MetricExpressionConfig {
    override fun expression(): String = unwrap(this).getExpression()

    override fun period(): Number = unwrap(this).getPeriod()

    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    override fun searchRegion(): String? = unwrap(this).getSearchRegion()

    override fun usingMetrics(): Map<String, IMetric> =
        unwrap(this).getUsingMetrics().mapValues{IMetric.wrap(it.value)}
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricExpressionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig):
        MetricExpressionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricExpressionConfig):
        software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
  }
}
