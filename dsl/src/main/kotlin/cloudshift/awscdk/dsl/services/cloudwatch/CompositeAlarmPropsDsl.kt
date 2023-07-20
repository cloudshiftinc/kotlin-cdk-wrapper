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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarmRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CompositeAlarmPropsDsl {
    private val cdkBuilder: CompositeAlarmProps.Builder = CompositeAlarmProps.builder()

    public fun actionsEnabled(actionsEnabled: Boolean) {
        cdkBuilder.actionsEnabled(actionsEnabled)
    }

    public fun actionsSuppressor(actionsSuppressor: IAlarm) {
        cdkBuilder.actionsSuppressor(actionsSuppressor)
    }

    public fun actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod: Duration) {
        cdkBuilder.actionsSuppressorExtensionPeriod(actionsSuppressorExtensionPeriod)
    }

    public fun actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod: Duration) {
        cdkBuilder.actionsSuppressorWaitPeriod(actionsSuppressorWaitPeriod)
    }

    public fun alarmDescription(alarmDescription: String) {
        cdkBuilder.alarmDescription(alarmDescription)
    }

    public fun alarmRule(alarmRule: IAlarmRule) {
        cdkBuilder.alarmRule(alarmRule)
    }

    public fun compositeAlarmName(compositeAlarmName: String) {
        cdkBuilder.compositeAlarmName(compositeAlarmName)
    }

    public fun build(): CompositeAlarmProps = cdkBuilder.build()
}
