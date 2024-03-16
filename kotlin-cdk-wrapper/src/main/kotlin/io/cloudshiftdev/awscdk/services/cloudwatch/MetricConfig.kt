@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties of a rendered metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * Object renderingProperties;
 * Object value;
 * MetricConfig metricConfig = MetricConfig.builder()
 * .mathExpression(MetricExpressionConfig.builder()
 * .expression("expression")
 * .period(123)
 * .usingMetrics(Map.of(
 * "usingMetricsKey", metric))
 * // the properties below are optional
 * .searchAccount("searchAccount")
 * .searchRegion("searchRegion")
 * .build())
 * .metricStat(MetricStatConfig.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .period(Duration.minutes(30))
 * .statistic("statistic")
 * // the properties below are optional
 * .account("account")
 * .dimensions(List.of(Dimension.builder()
 * .name("name")
 * .value(value)
 * .build()))
 * .region("region")
 * .unitFilter(Unit.SECONDS)
 * .build())
 * .renderingProperties(Map.of(
 * "renderingPropertiesKey", renderingProperties))
 * .build();
 * ```
 */
public interface MetricConfig {
  /**
   * In case the metric is a math expression, the details of the math expression.
   *
   * Default: - None
   */
  public fun mathExpression(): MetricExpressionConfig? =
      unwrap(this).getMathExpression()?.let(MetricExpressionConfig::wrap)

  /**
   * In case the metric represents a query, the details of the query.
   *
   * Default: - None
   */
  public fun metricStat(): MetricStatConfig? =
      unwrap(this).getMetricStat()?.let(MetricStatConfig::wrap)

  /**
   * Additional properties which will be rendered if the metric is used in a dashboard.
   *
   * Examples are 'label' and 'color', but any key in here will be
   * added to dashboard graphs.
   *
   * Default: - None
   */
  public fun renderingProperties(): Map<String, Any> = unwrap(this).getRenderingProperties() ?:
      emptyMap()

  /**
   * A builder for [MetricConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     * expression.
     */
    public fun mathExpression(mathExpression: MetricExpressionConfig)

    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     * expression.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b7aad7c8400113e536b8b057f2afc2217765aa5ff5734b93f9d325fc51f506")
    public fun mathExpression(mathExpression: MetricExpressionConfig.Builder.() -> Unit)

    /**
     * @param metricStat In case the metric represents a query, the details of the query.
     */
    public fun metricStat(metricStat: MetricStatConfig)

    /**
     * @param metricStat In case the metric represents a query, the details of the query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaaa3d0e652423463266af56c3c0fdf91bc825914182cc2ad220f28df32d7b1b")
    public fun metricStat(metricStat: MetricStatConfig.Builder.() -> Unit)

    /**
     * @param renderingProperties Additional properties which will be rendered if the metric is used
     * in a dashboard.
     * Examples are 'label' and 'color', but any key in here will be
     * added to dashboard graphs.
     */
    public fun renderingProperties(renderingProperties: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricConfig.builder()

    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     * expression.
     */
    override fun mathExpression(mathExpression: MetricExpressionConfig) {
      cdkBuilder.mathExpression(mathExpression.let(MetricExpressionConfig::unwrap))
    }

    /**
     * @param mathExpression In case the metric is a math expression, the details of the math
     * expression.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08b7aad7c8400113e536b8b057f2afc2217765aa5ff5734b93f9d325fc51f506")
    override fun mathExpression(mathExpression: MetricExpressionConfig.Builder.() -> Unit): Unit =
        mathExpression(MetricExpressionConfig(mathExpression))

    /**
     * @param metricStat In case the metric represents a query, the details of the query.
     */
    override fun metricStat(metricStat: MetricStatConfig) {
      cdkBuilder.metricStat(metricStat.let(MetricStatConfig::unwrap))
    }

    /**
     * @param metricStat In case the metric represents a query, the details of the query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aaaa3d0e652423463266af56c3c0fdf91bc825914182cc2ad220f28df32d7b1b")
    override fun metricStat(metricStat: MetricStatConfig.Builder.() -> Unit): Unit =
        metricStat(MetricStatConfig(metricStat))

    /**
     * @param renderingProperties Additional properties which will be rendered if the metric is used
     * in a dashboard.
     * Examples are 'label' and 'color', but any key in here will be
     * added to dashboard graphs.
     */
    override fun renderingProperties(renderingProperties: Map<String, Any>) {
      cdkBuilder.renderingProperties(renderingProperties)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricConfig,
  ) : CdkObject(cdkObject), MetricConfig {
    /**
     * In case the metric is a math expression, the details of the math expression.
     *
     * Default: - None
     */
    override fun mathExpression(): MetricExpressionConfig? =
        unwrap(this).getMathExpression()?.let(MetricExpressionConfig::wrap)

    /**
     * In case the metric represents a query, the details of the query.
     *
     * Default: - None
     */
    override fun metricStat(): MetricStatConfig? =
        unwrap(this).getMetricStat()?.let(MetricStatConfig::wrap)

    /**
     * Additional properties which will be rendered if the metric is used in a dashboard.
     *
     * Examples are 'label' and 'color', but any key in here will be
     * added to dashboard graphs.
     *
     * Default: - None
     */
    override fun renderingProperties(): Map<String, Any> = unwrap(this).getRenderingProperties() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricConfig):
        MetricConfig = CdkObjectWrappers.wrap(cdkObject) as MetricConfig

    internal fun unwrap(wrapped: MetricConfig):
        software.amazon.awscdk.services.cloudwatch.MetricConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.MetricConfig
  }
}
