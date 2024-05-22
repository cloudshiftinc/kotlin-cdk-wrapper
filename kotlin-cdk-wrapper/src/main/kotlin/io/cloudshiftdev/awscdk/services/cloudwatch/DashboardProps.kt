@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a CloudWatch Dashboard.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("region2")
 * .type(VariableType.PATTERN)
 * .label("RegionPattern")
 * .inputType(VariableInputType.INPUT)
 * .value("us-east-1")
 * .defaultValue(DefaultValue.value("us-east-1"))
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
public interface DashboardProps {
  /**
   * Name of the dashboard.
   *
   * If set, must only contain alphanumerics, dash (-) and underscore (_)
   *
   * Default: - automatically generated name
   */
  public fun dashboardName(): String? = unwrap(this).getDashboardName()

  /**
   * Interval duration for metrics. You can specify defaultInterval with the relative time(eg.
   * cdk.Duration.days(7)).
   *
   * Both properties `defaultInterval` and `start` cannot be set at once.
   *
   * Default: When the dashboard loads, the defaultInterval time will be the default time range.
   */
  public fun defaultInterval(): Duration? = unwrap(this).getDefaultInterval()?.let(Duration::wrap)

  /**
   * The end of the time range to use for each widget on the dashboard when the dashboard loads.
   *
   * If you specify a value for end, you must also specify a value for start.
   * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
   *
   * Default: When the dashboard loads, the end date will be the current time.
   */
  public fun end(): String? = unwrap(this).getEnd()

  /**
   * Use this field to specify the period for the graphs when the dashboard loads.
   *
   * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
   * the time range of the dashboard.
   * Specifying `Inherit` ensures that the period set for each graph is always obeyed.
   *
   * Default: Auto
   */
  public fun periodOverride(): PeriodOverride? =
      unwrap(this).getPeriodOverride()?.let(PeriodOverride::wrap)

  /**
   * The start of the time range to use for each widget on the dashboard.
   *
   * You can specify start without specifying end to specify a relative time range that ends with
   * the current time.
   * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
   * abbreviations for
   * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
   * shows the last three months.
   * You can also use start along with an end field, to specify an absolute time range.
   * When specifying an absolute time range, use the ISO 8601 format. For example,
   * 2018-12-17T06:00:00.000Z.
   *
   * Both properties `defaultInterval` and `start` cannot be set at once.
   *
   * Default: When the dashboard loads, the start time will be the default time range.
   */
  public fun start(): String? = unwrap(this).getStart()

  /**
   * A list of dashboard variables.
   *
   * Default: - No variables
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
   */
  public fun variables(): List<IVariable> = unwrap(this).getVariables()?.map(IVariable::wrap) ?:
      emptyList()

  /**
   * Initial set of widgets on the dashboard.
   *
   * One array represents a row of widgets.
   *
   * Default: - No widgets
   */
  public fun widgets(): List<List<IWidget>> = unwrap(this).getWidgets()?.map{ it.map(IWidget::wrap)
      } ?: emptyList()

  /**
   * A builder for [DashboardProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dashboardName Name of the dashboard.
     * If set, must only contain alphanumerics, dash (-) and underscore (_)
     */
    public fun dashboardName(dashboardName: String)

    /**
     * @param defaultInterval Interval duration for metrics. You can specify defaultInterval with
     * the relative time(eg. cdk.Duration.days(7)).
     * Both properties `defaultInterval` and `start` cannot be set at once.
     */
    public fun defaultInterval(defaultInterval: Duration)

    /**
     * @param end The end of the time range to use for each widget on the dashboard when the
     * dashboard loads.
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    public fun end(end: String)

    /**
     * @param periodOverride Use this field to specify the period for the graphs when the dashboard
     * loads.
     * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
     * the time range of the dashboard.
     * Specifying `Inherit` ensures that the period set for each graph is always obeyed.
     */
    public fun periodOverride(periodOverride: PeriodOverride)

    /**
     * @param start The start of the time range to use for each widget on the dashboard.
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     */
    public fun start(start: String)

    /**
     * @param variables A list of dashboard variables.
     */
    public fun variables(variables: List<IVariable>)

    /**
     * @param variables A list of dashboard variables.
     */
    public fun variables(vararg variables: IVariable)

    /**
     * @param widgets Initial set of widgets on the dashboard.
     * One array represents a row of widgets.
     */
    public fun widgets(widgets: List<List<IWidget>>)

    /**
     * @param widgets Initial set of widgets on the dashboard.
     * One array represents a row of widgets.
     */
    public fun widgets(vararg widgets: List<IWidget>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardProps.builder()

    /**
     * @param dashboardName Name of the dashboard.
     * If set, must only contain alphanumerics, dash (-) and underscore (_)
     */
    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    /**
     * @param defaultInterval Interval duration for metrics. You can specify defaultInterval with
     * the relative time(eg. cdk.Duration.days(7)).
     * Both properties `defaultInterval` and `start` cannot be set at once.
     */
    override fun defaultInterval(defaultInterval: Duration) {
      cdkBuilder.defaultInterval(defaultInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param end The end of the time range to use for each widget on the dashboard when the
     * dashboard loads.
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     */
    override fun end(end: String) {
      cdkBuilder.end(end)
    }

    /**
     * @param periodOverride Use this field to specify the period for the graphs when the dashboard
     * loads.
     * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
     * the time range of the dashboard.
     * Specifying `Inherit` ensures that the period set for each graph is always obeyed.
     */
    override fun periodOverride(periodOverride: PeriodOverride) {
      cdkBuilder.periodOverride(periodOverride.let(PeriodOverride.Companion::unwrap))
    }

    /**
     * @param start The start of the time range to use for each widget on the dashboard.
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     */
    override fun start(start: String) {
      cdkBuilder.start(start)
    }

    /**
     * @param variables A list of dashboard variables.
     */
    override fun variables(variables: List<IVariable>) {
      cdkBuilder.variables(variables.map(IVariable.Companion::unwrap))
    }

    /**
     * @param variables A list of dashboard variables.
     */
    override fun variables(vararg variables: IVariable): Unit = variables(variables.toList())

    /**
     * @param widgets Initial set of widgets on the dashboard.
     * One array represents a row of widgets.
     */
    override fun widgets(widgets: List<List<IWidget>>) {
      cdkBuilder.widgets(widgets.map{ it.map(IWidget.Companion::unwrap) })
    }

    /**
     * @param widgets Initial set of widgets on the dashboard.
     * One array represents a row of widgets.
     */
    override fun widgets(vararg widgets: List<IWidget>): Unit = widgets(widgets.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.DashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardProps,
  ) : CdkObject(cdkObject), DashboardProps {
    /**
     * Name of the dashboard.
     *
     * If set, must only contain alphanumerics, dash (-) and underscore (_)
     *
     * Default: - automatically generated name
     */
    override fun dashboardName(): String? = unwrap(this).getDashboardName()

    /**
     * Interval duration for metrics. You can specify defaultInterval with the relative time(eg.
     * cdk.Duration.days(7)).
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     *
     * Default: When the dashboard loads, the defaultInterval time will be the default time range.
     */
    override fun defaultInterval(): Duration? =
        unwrap(this).getDefaultInterval()?.let(Duration::wrap)

    /**
     * The end of the time range to use for each widget on the dashboard when the dashboard loads.
     *
     * If you specify a value for end, you must also specify a value for start.
     * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     */
    override fun end(): String? = unwrap(this).getEnd()

    /**
     * Use this field to specify the period for the graphs when the dashboard loads.
     *
     * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
     * the time range of the dashboard.
     * Specifying `Inherit` ensures that the period set for each graph is always obeyed.
     *
     * Default: Auto
     */
    override fun periodOverride(): PeriodOverride? =
        unwrap(this).getPeriodOverride()?.let(PeriodOverride::wrap)

    /**
     * The start of the time range to use for each widget on the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time.
     * In this case, the value of start must begin with -P, and you can use M, H, D, W and M as
     * abbreviations for
     * minutes, hours, days, weeks and months. For example, -PT8H shows the last 8 hours and -P3M
     * shows the last three months.
     * You can also use start along with an end field, to specify an absolute time range.
     * When specifying an absolute time range, use the ISO 8601 format. For example,
     * 2018-12-17T06:00:00.000Z.
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     */
    override fun start(): String? = unwrap(this).getStart()

    /**
     * A list of dashboard variables.
     *
     * Default: - No variables
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
     */
    override fun variables(): List<IVariable> = unwrap(this).getVariables()?.map(IVariable::wrap) ?:
        emptyList()

    /**
     * Initial set of widgets on the dashboard.
     *
     * One array represents a row of widgets.
     *
     * Default: - No widgets
     */
    override fun widgets(): List<List<IWidget>> = unwrap(this).getWidgets()?.map{
        it.map(IWidget::wrap) } ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardProps):
        DashboardProps = CdkObjectWrappers.wrap(cdkObject) as? DashboardProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DashboardProps):
        software.amazon.awscdk.services.cloudwatch.DashboardProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.DashboardProps
  }
}
