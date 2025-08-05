@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for an AlarmWidget.
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
public interface AlarmWidgetProps : MetricWidgetProps {
  /**
   * The alarm to show.
   */
  public fun alarm(): IAlarm

  /**
   * Left Y axis.
   *
   * Default: - No minimum or maximum values for the left Y-axis
   */
  public fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

  /**
   * A builder for [AlarmWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The AWS account ID where the metrics are located.
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     */
    public fun accountId(accountId: String)

    /**
     * @param alarm The alarm to show. 
     */
    public fun alarm(alarm: IAlarm)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param leftYAxis Left Y axis.
     */
    public fun leftYAxis(leftYAxis: YAxisProps)

    /**
     * @param leftYAxis Left Y axis.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("359cbd81f29574533cf491d58375db2c4dc8e5b3501ac0ad881d5dbe4f435993")
    public fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps.builder()

    /**
     * @param accountId The AWS account ID where the metrics are located.
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param alarm The alarm to show. 
     */
    override fun alarm(alarm: IAlarm) {
      cdkBuilder.alarm(alarm.let(IAlarm.Companion::unwrap))
    }

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param leftYAxis Left Y axis.
     */
    override fun leftYAxis(leftYAxis: YAxisProps) {
      cdkBuilder.leftYAxis(leftYAxis.let(YAxisProps.Companion::unwrap))
    }

    /**
     * @param leftYAxis Left Y axis.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("359cbd81f29574533cf491d58375db2c4dc8e5b3501ac0ad881d5dbe4f435993")
    override fun leftYAxis(leftYAxis: YAxisProps.Builder.() -> Unit): Unit =
        leftYAxis(YAxisProps(leftYAxis))

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps,
  ) : CdkObject(cdkObject),
      AlarmWidgetProps {
    /**
     * The AWS account ID where the metrics are located.
     *
     * This enables cross-account functionality for CloudWatch dashboards.
     * Before using this feature, ensure that proper cross-account sharing is configured
     * between the monitoring account and source account.
     *
     * For more information, see:
     * https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html
     *
     * Default: - Current account
     */
    override fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * The alarm to show.
     */
    override fun alarm(): IAlarm = unwrap(this).getAlarm().let(IAlarm::wrap)

    /**
     * Height of the widget.
     *
     * Default: - 6 for Alarm and Graph widgets.
     * 3 for single value widgets where most recent value of a metric is displayed.
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Left Y axis.
     *
     * Default: - No minimum or maximum values for the left Y-axis
     */
    override fun leftYAxis(): YAxisProps? = unwrap(this).getLeftYAxis()?.let(YAxisProps::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps):
        AlarmWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? AlarmWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmWidgetProps):
        software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps
  }
}
