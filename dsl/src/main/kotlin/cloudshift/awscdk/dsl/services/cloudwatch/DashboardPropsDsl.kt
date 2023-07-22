@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.amazon.awscdk.services.cloudwatch.IVariable
import software.amazon.awscdk.services.cloudwatch.IWidget
import software.amazon.awscdk.services.cloudwatch.PeriodOverride

@CdkDslMarker
public class DashboardPropsDsl {
  private val cdkBuilder: DashboardProps.Builder = DashboardProps.builder()

  private val _variables: MutableList<IVariable> = mutableListOf()

  private val _widgets: MutableList<List<IWidget>> = mutableListOf()

  /**
   * @param dashboardName Name of the dashboard.
   * If set, must only contain alphanumerics, dash (-) and underscore (_)
   */
  public fun dashboardName(dashboardName: String) {
    cdkBuilder.dashboardName(dashboardName)
  }

  /**
   * @param defaultInterval Interval duration for metrics.
   * You can specify defaultInterval with the relative time(eg. cdk.Duration.days(7)).
   */
  public fun defaultInterval(defaultInterval: Duration) {
    cdkBuilder.defaultInterval(defaultInterval)
  }

  /**
   * @param end The end of the time range to use for each widget on the dashboard when the dashboard
   * loads.
   * If you specify a value for end, you must also specify a value for start.
   * Specify an absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
   */
  public fun end(end: String) {
    cdkBuilder.end(end)
  }

  /**
   * @param periodOverride Use this field to specify the period for the graphs when the dashboard
   * loads.
   * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
   * the time range of the dashboard.
   * Specifying `Inherit` ensures that the period set for each graph is always obeyed.
   */
  public fun periodOverride(periodOverride: PeriodOverride) {
    cdkBuilder.periodOverride(periodOverride)
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
   */
  public fun start(start: String) {
    cdkBuilder.start(start)
  }

  /**
   * @param variables A list of dashboard variables.
   */
  public fun variables(vararg variables: IVariable) {
    _variables.addAll(listOf(*variables))
  }

  /**
   * @param variables A list of dashboard variables.
   */
  public fun variables(variables: Collection<IVariable>) {
    _variables.addAll(variables)
  }

  /**
   * @param widgets Initial set of widgets on the dashboard.
   * One array represents a row of widgets.
   */
  public fun widgets(vararg widgets: List<IWidget>) {
    _widgets.addAll(listOf(*widgets))
  }

  /**
   * @param widgets Initial set of widgets on the dashboard.
   * One array represents a row of widgets.
   */
  public fun widgets(widgets: Collection<List<IWidget>>) {
    _widgets.addAll(widgets)
  }

  public fun build(): DashboardProps {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    if(_widgets.isNotEmpty()) cdkBuilder.widgets(_widgets)
    return cdkBuilder.build()
  }
}
