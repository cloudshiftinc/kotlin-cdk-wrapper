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
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.ComparisonOperator
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.TreatMissingData
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class AlarmDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Alarm.Builder = Alarm.Builder.create(scope, id)

    public fun actionsEnabled(actionsEnabled: Boolean) {
        cdkBuilder.actionsEnabled(actionsEnabled)
    }

    public fun alarmDescription(alarmDescription: String) {
        cdkBuilder.alarmDescription(alarmDescription)
    }

    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    public fun comparisonOperator(comparisonOperator: ComparisonOperator) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
        cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    public fun metric(metric: IMetric) {
        cdkBuilder.metric(metric)
    }

    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun treatMissingData(treatMissingData: TreatMissingData) {
        cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): Alarm = cdkBuilder.build()
}
