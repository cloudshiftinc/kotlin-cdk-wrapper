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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.AlarmState
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy
import software.amazon.awscdk.services.cloudwatch.IAlarm

/**
 * A dashboard widget that displays alarms in a grid view.
 *
 * Example:
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * dashboard.addWidgets(
 * AlarmStatusWidget.Builder.create()
 * .alarms(List.of(errorAlarm))
 * .build());
 * ```
 */
@CdkDslMarker
public class AlarmStatusWidgetDsl {
    private val cdkBuilder: AlarmStatusWidget.Builder = AlarmStatusWidget.Builder.create()

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    private val _states: MutableList<AlarmState> = mutableListOf()

    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget.
     */
    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    /**
     * CloudWatch Alarms to show in widget.
     *
     * @param alarms CloudWatch Alarms to show in widget.
     */
    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    /**
     * Height of the widget.
     *
     * Default: 3
     *
     * @param height Height of the widget.
     */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /**
     * Specifies how to sort the alarms in the widget.
     *
     * Default: - alphabetical order
     *
     * @param sortBy Specifies how to sort the alarms in the widget.
     */
    public fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
        cdkBuilder.sortBy(sortBy)
    }

    /**
     * Use this field to filter the list of alarms displayed in the widget to only those alarms
     * currently in the specified states.
     *
     * You can specify one or more alarm states in the value for this field. The alarm states that
     * you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     *
     * Default: - all the alarms specified in alarms are displayed.
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     *   those alarms currently in the specified states.
     */
    public fun states(vararg states: AlarmState) {
        _states.addAll(listOf(*states))
    }

    /**
     * Use this field to filter the list of alarms displayed in the widget to only those alarms
     * currently in the specified states.
     *
     * You can specify one or more alarm states in the value for this field. The alarm states that
     * you can specify are ALARM, INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     *
     * Default: - all the alarms specified in alarms are displayed.
     *
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     *   those alarms currently in the specified states.
     */
    public fun states(states: Collection<AlarmState>) {
        _states.addAll(states)
    }

    /**
     * The title of the widget.
     *
     * Default: 'Alarm Status'
     *
     * @param title The title of the widget.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): AlarmStatusWidget {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_states.isNotEmpty()) cdkBuilder.states(_states)
        return cdkBuilder.build()
    }
}
