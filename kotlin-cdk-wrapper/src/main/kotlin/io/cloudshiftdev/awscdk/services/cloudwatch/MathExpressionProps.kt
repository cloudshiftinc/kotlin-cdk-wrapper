@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface MathExpressionProps : MathExpressionOptions {
  public fun expression(): String

  public fun usingMetrics(): Map<String, IMetric> =
      unwrap(this).getUsingMetrics()?.mapValues{IMetric.wrap(it.value)} ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun color(color: String)

    public fun expression(expression: String)

    public fun label(label: String)

    public fun period(period: Duration)

    public fun searchAccount(searchAccount: String)

    public fun searchRegion(searchRegion: String)

    public fun usingMetrics(usingMetrics: Map<String, IMetric>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpressionProps.Builder =
        software.amazon.awscdk.services.cloudwatch.MathExpressionProps.builder()

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
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

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpressionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionProps,
  ) : CdkObject(cdkObject), MathExpressionProps {
    override fun color(): String? = unwrap(this).getColor()

    override fun expression(): String = unwrap(this).getExpression()

    override fun label(): String? = unwrap(this).getLabel()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    override fun searchRegion(): String? = unwrap(this).getSearchRegion()

    override fun usingMetrics(): Map<String, IMetric> =
        unwrap(this).getUsingMetrics()?.mapValues{IMetric.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpressionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionProps):
        MathExpressionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MathExpressionProps):
        software.amazon.awscdk.services.cloudwatch.MathExpressionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MathExpressionProps
  }
}
