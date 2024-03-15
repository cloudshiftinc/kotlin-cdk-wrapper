@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class MathExpression internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpression,
) : CdkObject(cdkObject), IMetric {
  public open fun color(): String? = unwrap(this).getColor()

  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions,
  ): Alarm = unwrap(this).createAlarm(scope.let(Construct::unwrap), id,
      props.let(CreateAlarmOptions::unwrap)).let(Alarm::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e03736e112999f1b75773f76c5cb9dc73905e2afad3ba0d5d2a8408be21202b")
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions.Builder.() -> Unit,
  ): Alarm = createAlarm(scope, id, CreateAlarmOptions(props))

  public open fun expression(): String = unwrap(this).getExpression()

  public open fun label(): String? = unwrap(this).getLabel()

  public open fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

  public open fun searchAccount(): String? = unwrap(this).getSearchAccount()

  public open fun searchRegion(): String? = unwrap(this).getSearchRegion()

  public override fun toMetricConfig(): MetricConfig =
      unwrap(this).toMetricConfig().let(MetricConfig::wrap)

  public open fun usingMetrics(): Map<String, IMetric> =
      unwrap(this).getUsingMetrics().mapValues{IMetric.wrap(it.value)}

  @Deprecated(message = "deprecated in CDK")
  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  public open fun with(props: MathExpressionOptions): MathExpression =
      unwrap(this).with(props.let(MathExpressionOptions::unwrap)).let(MathExpression::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0ff43fd6c00818abf7bc21f37d5472ceadccaac268d3b4f841dd9abaaea03d1")
  public open fun with(props: MathExpressionOptions.Builder.() -> Unit): MathExpression =
      with(MathExpressionOptions(props))

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpression.Builder =
        software.amazon.awscdk.services.cloudwatch.MathExpression.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpression =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpression {
      val builderImpl = BuilderImpl()
      return MathExpression(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpression):
        MathExpression = MathExpression(cdkObject)

    internal fun unwrap(wrapped: MathExpression):
        software.amazon.awscdk.services.cloudwatch.MathExpression = wrapped.cdkObject
  }
}
