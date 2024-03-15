@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Y-Axis.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * Metric gaugeMetric;
 * dashboard.addWidgets(GaugeWidget.Builder.create()
 * .metrics(List.of(gaugeMetric))
 * .leftYAxis(YAxisProps.builder()
 * .min(0)
 * .max(1000)
 * .build())
 * .build());
 * ```
 */
public interface YAxisProps {
  /**
   * The label.
   *
   * Default: - No label
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * The max value.
   *
   * Default: - No maximum value
   */
  public fun max(): Number? = unwrap(this).getMax()

  /**
   * The min value.
   *
   * Default: 0
   */
  public fun min(): Number? = unwrap(this).getMin()

  /**
   * Whether to show units.
   *
   * Default: true
   */
  public fun showUnits(): Boolean? = unwrap(this).getShowUnits()

  /**
   * A builder for [YAxisProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param label The label.
     */
    public fun label(label: String)

    /**
     * @param max The max value.
     */
    public fun max(max: Number)

    /**
     * @param min The min value.
     */
    public fun min(min: Number)

    /**
     * @param showUnits Whether to show units.
     */
    public fun showUnits(showUnits: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.YAxisProps.Builder =
        software.amazon.awscdk.services.cloudwatch.YAxisProps.builder()

    /**
     * @param label The label.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param max The max value.
     */
    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    /**
     * @param min The min value.
     */
    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    /**
     * @param showUnits Whether to show units.
     */
    override fun showUnits(showUnits: Boolean) {
      cdkBuilder.showUnits(showUnits)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.YAxisProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.YAxisProps,
  ) : CdkObject(cdkObject), YAxisProps {
    /**
     * The label.
     *
     * Default: - No label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The max value.
     *
     * Default: - No maximum value
     */
    override fun max(): Number? = unwrap(this).getMax()

    /**
     * The min value.
     *
     * Default: 0
     */
    override fun min(): Number? = unwrap(this).getMin()

    /**
     * Whether to show units.
     *
     * Default: true
     */
    override fun showUnits(): Boolean? = unwrap(this).getShowUnits()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): YAxisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.YAxisProps): YAxisProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: YAxisProps): software.amazon.awscdk.services.cloudwatch.YAxisProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.YAxisProps
  }
}
