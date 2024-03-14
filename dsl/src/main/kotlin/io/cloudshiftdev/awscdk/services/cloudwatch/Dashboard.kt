package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Dashboard
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudwatch.Dashboard,
) : Resource(cdkObject) {
    /**
     * Add a variable to the dashboard.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html)
     *
     * @param variable
     */
    public open fun addVariable(variable: IVariable) {
        unwrap(this).addVariable(variable.let(IVariable::unwrap))
    }

    /**
     * Add a widget to the dashboard.
     *
     * Widgets given in multiple calls to add() will be laid out stacked on top of each other.
     *
     * Multiple widgets added in the same call to add() will be laid out next to each other.
     *
     * @param widgets
     */
    public open fun addWidgets(widgets: IWidget) {
        unwrap(this).addWidgets(widgets.let(IWidget::unwrap))
    }

    /** ARN of this dashboard. */
    public open fun dashboardArn(): String = unwrap(this).getDashboardArn()

    /** The name of this dashboard. */
    public open fun dashboardName(): String = unwrap(this).getDashboardName()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.Dashboard]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Name of the dashboard.
         *
         * If set, must only contain alphanumerics, dash (-) and underscore (_)
         *
         * Default: - automatically generated name
         *
         * @param dashboardName Name of the dashboard.
         */
        public fun dashboardName(dashboardName: String)

        /**
         * Interval duration for metrics. You can specify defaultInterval with the relative time(eg.
         * cdk.Duration.days(7)).
         *
         * Both properties `defaultInterval` and `start` cannot be set at once.
         *
         * Default: When the dashboard loads, the defaultInterval time will be the default time
         * range.
         *
         * @param defaultInterval Interval duration for metrics. You can specify defaultInterval
         *   with the relative time(eg. cdk.Duration.days(7)).
         */
        public fun defaultInterval(defaultInterval: Duration)

        /**
         * The end of the time range to use for each widget on the dashboard when the dashboard
         * loads.
         *
         * If you specify a value for end, you must also specify a value for start. Specify an
         * absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
         *
         * Default: When the dashboard loads, the end date will be the current time.
         *
         * @param end The end of the time range to use for each widget on the dashboard when the
         *   dashboard loads.
         */
        public fun end(end: String)

        /**
         * Use this field to specify the period for the graphs when the dashboard loads.
         *
         * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt
         * to the time range of the dashboard. Specifying `Inherit` ensures that the period set for
         * each graph is always obeyed.
         *
         * Default: Auto
         *
         * @param periodOverride Use this field to specify the period for the graphs when the
         *   dashboard loads.
         */
        public fun periodOverride(periodOverride: PeriodOverride)

        /**
         * The start of the time range to use for each widget on the dashboard.
         *
         * You can specify start without specifying end to specify a relative time range that ends
         * with the current time. In this case, the value of start must begin with -P, and you can
         * use M, H, D, W and M as abbreviations for minutes, hours, days, weeks and months. For
         * example, -PT8H shows the last 8 hours and -P3M shows the last three months. You can also
         * use start along with an end field, to specify an absolute time range. When specifying an
         * absolute time range, use the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
         *
         * Both properties `defaultInterval` and `start` cannot be set at once.
         *
         * Default: When the dashboard loads, the start time will be the default time range.
         *
         * @param start The start of the time range to use for each widget on the dashboard.
         */
        public fun start(start: String)

        /**
         * A list of dashboard variables.
         *
         * Default: - No variables
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
         *
         * @param variables A list of dashboard variables.
         */
        public fun variables(variables: List<IVariable>)

        /**
         * A list of dashboard variables.
         *
         * Default: - No variables
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_dashboard_variables.html#cloudwatch_dashboard_variables_types)
         *
         * @param variables A list of dashboard variables.
         */
        public fun variables(vararg variables: IVariable)

        /**
         * Initial set of widgets on the dashboard.
         *
         * One array represents a row of widgets.
         *
         * Default: - No widgets
         *
         * @param widgets Initial set of widgets on the dashboard.
         */
        public fun widgets(widgets: List<List<IWidget>>)

        /**
         * Initial set of widgets on the dashboard.
         *
         * One array represents a row of widgets.
         *
         * Default: - No widgets
         *
         * @param widgets Initial set of widgets on the dashboard.
         */
        public fun widgets(vararg widgets: List<IWidget>)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Dashboard.Builder =
            software.amazon.awscdk.services.cloudwatch.Dashboard.Builder.create(scope, id)

        /**
         * Name of the dashboard.
         *
         * If set, must only contain alphanumerics, dash (-) and underscore (_)
         *
         * Default: - automatically generated name
         *
         * @param dashboardName Name of the dashboard.
         */
        override fun dashboardName(dashboardName: String) {
            cdkBuilder.dashboardName(dashboardName)
        }

        /**
         * Interval duration for metrics. You can specify defaultInterval with the relative time(eg.
         * cdk.Duration.days(7)).
         *
         * Both properties `defaultInterval` and `start` cannot be set at once.
         *
         * Default: When the dashboard loads, the defaultInterval time will be the default time
         * range.
         *
         * @param defaultInterval Interval duration for metrics. You can specify defaultInterval
         *   with the relative time(eg. cdk.Duration.days(7)).
         */
        override fun defaultInterval(defaultInterval: Duration) {
            cdkBuilder.defaultInterval(defaultInterval.let(Duration::unwrap))
        }

        /**
         * The end of the time range to use for each widget on the dashboard when the dashboard
         * loads.
         *
         * If you specify a value for end, you must also specify a value for start. Specify an
         * absolute time in the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
         *
         * Default: When the dashboard loads, the end date will be the current time.
         *
         * @param end The end of the time range to use for each widget on the dashboard when the
         *   dashboard loads.
         */
        override fun end(end: String) {
            cdkBuilder.end(end)
        }

        /**
         * Use this field to specify the period for the graphs when the dashboard loads.
         *
         * Specifying `Auto` causes the period of all graphs on the dashboard to automatically adapt
         * to the time range of the dashboard. Specifying `Inherit` ensures that the period set for
         * each graph is always obeyed.
         *
         * Default: Auto
         *
         * @param periodOverride Use this field to specify the period for the graphs when the
         *   dashboard loads.
         */
        override fun periodOverride(periodOverride: PeriodOverride) {
            cdkBuilder.periodOverride(periodOverride.let(PeriodOverride::unwrap))
        }

        /**
         * The start of the time range to use for each widget on the dashboard.
         *
         * You can specify start without specifying end to specify a relative time range that ends
         * with the current time. In this case, the value of start must begin with -P, and you can
         * use M, H, D, W and M as abbreviations for minutes, hours, days, weeks and months. For
         * example, -PT8H shows the last 8 hours and -P3M shows the last three months. You can also
         * use start along with an end field, to specify an absolute time range. When specifying an
         * absolute time range, use the ISO 8601 format. For example, 2018-12-17T06:00:00.000Z.
         *
         * Both properties `defaultInterval` and `start` cannot be set at once.
         *
         * Default: When the dashboard loads, the start time will be the default time range.
         *
         * @param start The start of the time range to use for each widget on the dashboard.
         */
        override fun start(start: String) {
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
        override fun variables(variables: List<IVariable>) {
            cdkBuilder.variables(variables.map(IVariable::unwrap))
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
        override fun variables(vararg variables: IVariable): Unit = variables(variables.toList())

        /**
         * Initial set of widgets on the dashboard.
         *
         * One array represents a row of widgets.
         *
         * Default: - No widgets
         *
         * @param widgets Initial set of widgets on the dashboard.
         */
        override fun widgets(widgets: List<List<IWidget>>) {
            cdkBuilder.widgets(widgets.map { it.map(IWidget::unwrap) })
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
        override fun widgets(vararg widgets: List<IWidget>): Unit = widgets(widgets.toList())

        public fun build(): software.amazon.awscdk.services.cloudwatch.Dashboard =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Dashboard {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Dashboard(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.Dashboard
        ): Dashboard = Dashboard(cdkObject)

        internal fun unwrap(
            wrapped: Dashboard
        ): software.amazon.awscdk.services.cloudwatch.Dashboard = wrapped.cdkObject
    }
}
