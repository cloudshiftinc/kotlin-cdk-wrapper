@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Configurable options for MathExpressions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * MathExpressionOptions mathExpressionOptions = MathExpressionOptions.builder()
 * .color("color")
 * .label("label")
 * .period(Duration.minutes(30))
 * .searchAccount("searchAccount")
 * .searchRegion("searchRegion")
 * .build();
 * ```
 */
public interface MathExpressionOptions {
  /**
   * Color for this metric when added to a Graph in a Dashboard.
   *
   * Default: - Automatic color
   */
  public fun color(): String? = unwrap(this).getColor()

  /**
   * Label for this expression when added to a Graph in a Dashboard.
   *
   * If this expression evaluates to more than one time series (for
   * example, through the use of `METRICS()` or `SEARCH()` expressions),
   * each time series will appear in the graph using a combination of the
   * expression label and the individual metric label. Specify the empty
   * string (`''`) to suppress the expression label and only keep the
   * metric label.
   *
   * You can use [dynamic
   * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
   * to show summary information about the displayed time series
   * in the legend. For example, if you use:
   *
   * ```
   * [max: ${MAX}] MyMetric
   * ```
   *
   * As the metric label, the maximum value in the visible range will
   * be shown next to the time series name in the graph's legend. If the
   * math expression produces more than one time series, the maximum
   * will be shown for each individual time series produce by this
   * math expression.
   *
   * Default: - Expression value is used as label
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * The period over which the expression's statistics are applied.
   *
   * This period overrides all periods in the metrics used in this
   * math expression.
   *
   * Default: Duration.minutes(5)
   */
  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  /**
   * Account to evaluate search expressions within.
   *
   * Specifying a searchAccount has no effect to the account used
   * for metrics within the expression (passed via usingMetrics).
   *
   * Default: - Deployment account.
   */
  public fun searchAccount(): String? = unwrap(this).getSearchAccount()

  /**
   * Region to evaluate search expressions within.
   *
   * Specifying a searchRegion has no effect to the region used
   * for metrics within the expression (passed via usingMetrics).
   *
   * Default: - Deployment region.
   */
  public fun searchRegion(): String? = unwrap(this).getSearchRegion()

  /**
   * A builder for [MathExpressionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    public fun color(color: String)

    /**
     * @param label Label for this expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     */
    public fun label(label: String)

    /**
     * @param period The period over which the expression's statistics are applied.
     * This period overrides all periods in the metrics used in this
     * math expression.
     */
    public fun period(period: Duration)

    /**
     * @param searchAccount Account to evaluate search expressions within.
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     */
    public fun searchAccount(searchAccount: String)

    /**
     * @param searchRegion Region to evaluate search expressions within.
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     */
    public fun searchRegion(searchRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions.Builder
        = software.amazon.awscdk.services.cloudwatch.MathExpressionOptions.builder()

    /**
     * @param color Color for this metric when added to a Graph in a Dashboard.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param label Label for this expression when added to a Graph in a Dashboard.
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param period The period over which the expression's statistics are applied.
     * This period overrides all periods in the metrics used in this
     * math expression.
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    /**
     * @param searchAccount Account to evaluate search expressions within.
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     */
    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    /**
     * @param searchRegion Region to evaluate search expressions within.
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     */
    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpressionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions,
  ) : CdkObject(cdkObject), MathExpressionOptions {
    /**
     * Color for this metric when added to a Graph in a Dashboard.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * Label for this expression when added to a Graph in a Dashboard.
     *
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     *
     * Default: - Expression value is used as label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The period over which the expression's statistics are applied.
     *
     * This period overrides all periods in the metrics used in this
     * math expression.
     *
     * Default: Duration.minutes(5)
     */
    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    /**
     * Account to evaluate search expressions within.
     *
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment account.
     */
    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    /**
     * Region to evaluate search expressions within.
     *
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment region.
     */
    override fun searchRegion(): String? = unwrap(this).getSearchRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpressionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions):
        MathExpressionOptions = CdkObjectWrappers.wrap(cdkObject) as? MathExpressionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MathExpressionOptions):
        software.amazon.awscdk.services.cloudwatch.MathExpressionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MathExpressionOptions
  }
}
