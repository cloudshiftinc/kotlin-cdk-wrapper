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
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy
import software.amazon.awscdk.services.cloudwatch.IAlarm

/**
 * Properties for an Alarm Status Widget.
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
public class AlarmStatusWidgetPropsDsl {
    private val cdkBuilder: AlarmStatusWidgetProps.Builder = AlarmStatusWidgetProps.builder()

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    private val _states: MutableList<AlarmState> = mutableListOf()

    /** @param alarms CloudWatch Alarms to show in widget. */
    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    /** @param alarms CloudWatch Alarms to show in widget. */
    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    /** @param height Height of the widget. */
    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    /** @param sortBy Specifies how to sort the alarms in the widget. */
    public fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
        cdkBuilder.sortBy(sortBy)
    }

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     *   those alarms currently in the specified states. You can specify one or more alarm states in
     *   the value for this field. The alarm states that you can specify are ALARM,
     *   INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    public fun states(vararg states: AlarmState) {
        _states.addAll(listOf(*states))
    }

    /**
     * @param states Use this field to filter the list of alarms displayed in the widget to only
     *   those alarms currently in the specified states. You can specify one or more alarm states in
     *   the value for this field. The alarm states that you can specify are ALARM,
     *   INSUFFICIENT_DATA, and OK.
     *
     * If you omit this field or specify an empty array, all the alarms specifed in alarms are
     * displayed.
     */
    public fun states(states: Collection<AlarmState>) {
        _states.addAll(states)
    }

    /** @param title The title of the widget. */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param width Width of the widget, in a grid of 24 units wide. */
    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): AlarmStatusWidgetProps {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_states.isNotEmpty()) cdkBuilder.states(_states)
        return cdkBuilder.build()
    }
}
