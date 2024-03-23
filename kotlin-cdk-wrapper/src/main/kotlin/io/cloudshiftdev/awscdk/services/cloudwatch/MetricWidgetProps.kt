@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Basic properties for widgets that display metrics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * MetricWidgetProps metricWidgetProps = MetricWidgetProps.builder()
 * .height(123)
 * .region("region")
 * .title("title")
 * .width(123)
 * .build();
 * ```
 */
public interface MetricWidgetProps {
  /**
   * Height of the widget.
   *
   * Default: - 6 for Alarm and Graph widgets.
   * 3 for single value widgets where most recent value of a metric is displayed.
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * The region the metrics of this graph should be taken from.
   *
   * Default: - Current region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Title for the graph.
   *
   * Default: - None
   */
  public fun title(): String? = unwrap(this).getTitle()

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [MetricWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param region The region the metrics of this graph should be taken from.
     */
    public fun region(region: String)

    /**
     * @param title Title for the graph.
     */
    public fun title(title: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.builder()

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param region The region the metrics of this graph should be taken from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param title Title for the graph.
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps,
  ) : CdkObject(cdkObject), MetricWidgetProps {
    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Title for the graph.
     *
     * Default: - None
     */
    override fun title(): String? = unwrap(this).getTitle()

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps):
        MetricWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? MetricWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricWidgetProps):
        software.amazon.awscdk.services.cloudwatch.MetricWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MetricWidgetProps
  }
}
