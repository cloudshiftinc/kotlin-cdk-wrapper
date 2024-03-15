@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Display the metric associated with an alarm, including the alarm line.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * dashboard.addWidgets(AlarmWidget.Builder.create()
 * .title("Errors")
 * .alarm(errorAlarm)
 * .build());
 * ```
 */
public open class AlarmWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidget,
) : ConcreteWidget(cdkObject) {
  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.AlarmWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The alarm to show.
     *
     * @param alarm The alarm to show. 
     */
    public fun alarm(alarm: IAlarm)

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * Left Y axis.
     *
     * Default: - No minimum or maximum values for the left Y-axis
     *
     * @param leftYAxis Left Y axis. 
     */
    public fun leftYAxis(leftYAxis: YAxisProps)

    /**
     * Left Y axis.
     *
     * Default: - No minimum or maximum values for the left Y-axis
     *
     * @param leftYAxis Left Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e98dee4b45e28568feace8dfc1b6eb50ad70495704ca102671a28ff9294f9b6")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    public fun region(region: String)

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    public fun title(title: String)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmWidget.Builder.create()

    /**
     * The alarm to show.
     *
     * @param alarm The alarm to show. 
     */
    override fun alarm(alarm: IAlarm) {
      cdkBuilder.alarm(alarm.let(IAlarm::unwrap))
    }

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Left Y axis.
     *
     * Default: - No minimum or maximum values for the left Y-axis
     *
     * @param leftYAxis Left Y axis. 
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps::unwrap))
    }

    /**
     * Left Y axis.
     *
     * Default: - No minimum or maximum values for the left Y-axis
     *
     * @param leftYAxis Left Y axis. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e98dee4b45e28568feace8dfc1b6eb50ad70495704ca102671a28ff9294f9b6")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

    /**
     * The region the metrics of this graph should be taken from.
     *
     * Default: - Current region
     *
     * @param region The region the metrics of this graph should be taken from. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * Title for the graph.
     *
     * Default: - None
     *
     * @param title Title for the graph. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmWidget {
      val builderImpl = BuilderImpl()
      return AlarmWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidget):
        AlarmWidget = AlarmWidget(cdkObject)

    internal fun unwrap(wrapped: AlarmWidget):
        software.amazon.awscdk.services.cloudwatch.AlarmWidget = wrapped.cdkObject
  }
}
