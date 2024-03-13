package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface MetricConfig {
  public fun mathExpression(): MetricExpressionConfig? =
      unwrap(this).getMathExpression()?.let(MetricExpressionConfig::wrap)

  public fun metricStat(): MetricStatConfig? =
      unwrap(this).getMetricStat()?.let(MetricStatConfig::wrap)

  public fun renderingProperties(): Map<String, Any> = unwrap(this).getRenderingProperties() ?:
      emptyMap()

  public interface Builder {
    public fun mathExpression(mathExpression: MetricExpressionConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b7aad7c8400113e536b8b057f2afc2217765aa5ff5734b93f9d325fc51f506")
    public fun mathExpression(mathExpression: MetricExpressionConfig.Builder.() -> Unit) {
    }

    public fun metricStat(metricStat: MetricStatConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaaa3d0e652423463266af56c3c0fdf91bc825914182cc2ad220f28df32d7b1b")
    public fun metricStat(metricStat: MetricStatConfig.Builder.() -> Unit) {
    }

    public fun renderingProperties(renderingProperties: Map<String, Any>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricConfig.builder()

    public override fun mathExpression(mathExpression: MetricExpressionConfig) {
      cdkBuilder.mathExpression(mathExpression.let(MetricExpressionConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b7aad7c8400113e536b8b057f2afc2217765aa5ff5734b93f9d325fc51f506")
    public override fun mathExpression(mathExpression: MetricExpressionConfig.Builder.() -> Unit):
        Unit = mathExpression(MetricExpressionConfig(mathExpression))

    public override fun metricStat(metricStat: MetricStatConfig) {
      cdkBuilder.metricStat(metricStat.let(MetricStatConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaaa3d0e652423463266af56c3c0fdf91bc825914182cc2ad220f28df32d7b1b")
    public override fun metricStat(metricStat: MetricStatConfig.Builder.() -> Unit): Unit =
        metricStat(MetricStatConfig(metricStat))

    public override fun renderingProperties(renderingProperties: Map<String, Any>) {
      cdkBuilder.renderingProperties(renderingProperties)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricConfig,
  ) : MetricConfig {
    public override fun mathExpression(): MetricExpressionConfig? =
        unwrap(this).getMathExpression()?.let(MetricExpressionConfig::wrap)

    public override fun metricStat(): MetricStatConfig? =
        unwrap(this).getMetricStat()?.let(MetricStatConfig::wrap)

    public override fun renderingProperties(): Map<String, Any> =
        unwrap(this).getRenderingProperties() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MetricConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricConfig):
        MetricConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricConfig):
        software.amazon.awscdk.services.cloudwatch.MetricConfig = (wrapped as Wrapper).cdkObject
  }
}
