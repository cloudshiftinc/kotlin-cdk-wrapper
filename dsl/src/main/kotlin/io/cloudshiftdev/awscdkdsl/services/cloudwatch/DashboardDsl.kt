@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.IVariable
import software.amazon.awscdk.services.cloudwatch.IWidget
import software.amazon.awscdk.services.cloudwatch.PeriodOverride
import software.constructs.Construct

/**
 * A CloudWatch dashboard.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
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
@CdkDslMarker
public class DashboardDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Dashboard.Builder = Dashboard.Builder.create(scope, id)

    private val _variables: MutableList<IVariable> = mutableListOf()

    private val _widgets: MutableList<List<IWidget>> = mutableListOf()

    /**
     * Name of the dashboard.
     *
     * If set, must only contain alphanumerics, dash (-) and underscore (_)
     *
     * Default: - automatically generated name
     *
     * @param dashboardName Name of the dashboard.
     */
    public fun dashboardName(dashboardName: String) {
        cdkBuilder.dashboardName(dashboardName)
    }

    /**
     * Interval duration for metrics. You can specify defaultInterval with the relative time(eg.
     * cdk.Duration.days(7)).
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     *
     * Default: When the dashboard loads, the defaultInterval time will be the default time range.
     *
     * @param defaultInterval Interval duration for metrics. You can specify defaultInterval with
     *   the relative time(eg. cdk.Duration.days(7)).
     */
    public fun defaultInterval(defaultInterval: Duration) {
        cdkBuilder.defaultInterval(defaultInterval)
    }

    /**
     * The end of the time range to use for each widget on the dashboard when the dashboard loads.
     *
     * If you specify a value for end, you must also specify a value for start. Specify an absolute
     * time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Default: When the dashboard loads, the end date will be the current time.
     *
     * @param end The end of the time range to use for each widget on the dashboard when the
     *   dashboard loads.
     */
    public fun end(end: String) {
        cdkBuilder.end(end)
    }

    /**
     * Use this field to specify the period for the graphs when the dashboard loads.
     *
     * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt to
     * the time range of the dashboard. Specifying `Inherit` ensures that the period set for each
     * graph is always obeyed.
     *
     * Default: Auto
     *
     * @param periodOverride Use this field to specify the period for the graphs when the dashboard
     *   loads.
     */
    public fun periodOverride(periodOverride: PeriodOverride) {
        cdkBuilder.periodOverride(periodOverride)
    }

    /**
     * The start of the time range to use for each widget on the dashboard.
     *
     * You can specify start without specifying end to specify a relative time range that ends with
     * the current time. In this case, the value of start must begin with -P, and you can use M, H,
     * D, W and M as abbreviations for minutes, hours, days, weeks and months. For example, -PT8H
     * shows the last 8 hours and -P3M shows the last three months. You can also use start along
     * with an end field, to specify an absolute time range. When specifying an absolute time range,
     * use the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
     *
     * Both properties `defaultInterval` and `start` cannot be set at once.
     *
     * Default: When the dashboard loads, the start time will be the default time range.
     *
     * @param start The start of the time range to use for each widget on the dashboard.
     */
    public fun start(start: String) {
        cdkBuilder.start(start)
    }

    /**
     * A list of dashboard variables.
     *
     * Default: - No variables
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
     *
     * @param variables A list of dashboard variables.
     */
    public fun variables(vararg variables: IVariable) {
        _variables.addAll(listOf(*variables))
    }

    /**
     * A list of dashboard variables.
     *
     * Default: - No variables
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
     *
     * @param variables A list of dashboard variables.
     */
    public fun variables(variables: Collection<IVariable>) {
        _variables.addAll(variables)
    }

    /**
     * Initial set of widgets on the dashboard.
     *
     * One array represents a row of widgets.
     *
     * Default: - No widgets
     *
     * @param widgets Initial set of widgets on the dashboard.
     */
    public fun widgets(vararg widgets: List<IWidget>) {
        _widgets.addAll(listOf(*widgets))
    }

    /**
     * Initial set of widgets on the dashboard.
     *
     * One array represents a row of widgets.
     *
     * Default: - No widgets
     *
     * @param widgets Initial set of widgets on the dashboard.
     */
    public fun widgets(widgets: Collection<List<IWidget>>) {
        _widgets.addAll(widgets)
    }

    public fun build(): Dashboard {
        if (_variables.isNotEmpty()) cdkBuilder.variables(_variables)
        if (_widgets.isNotEmpty()) cdkBuilder.widgets(_widgets)
        return cdkBuilder.build()
    }
}
