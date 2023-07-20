@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.AlarmState
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetSortBy
import software.amazon.awscdk.services.cloudwatch.IAlarm
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AlarmStatusWidgetDsl {
    private val cdkBuilder: AlarmStatusWidget.Builder = AlarmStatusWidget.Builder.create()

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    private val _states: MutableList<AlarmState> = mutableListOf()

    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun sortBy(sortBy: AlarmStatusWidgetSortBy) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun states(vararg states: AlarmState) {
        _states.addAll(listOf(*states))
    }

    public fun states(states: Collection<AlarmState>) {
        _states.addAll(states)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): AlarmStatusWidget {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_states.isNotEmpty()) cdkBuilder.states(_states)
        return cdkBuilder.build()
    }
}
