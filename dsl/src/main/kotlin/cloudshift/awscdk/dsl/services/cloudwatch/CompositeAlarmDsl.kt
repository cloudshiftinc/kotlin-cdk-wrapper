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
import software.amazon.awscdk.services.cloudwatch.CompositeAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.IAlarmRule
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CompositeAlarmDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CompositeAlarm.Builder = CompositeAlarm.Builder.create(scope, id)

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

    public fun build(): CompositeAlarm = cdkBuilder.build()
}
