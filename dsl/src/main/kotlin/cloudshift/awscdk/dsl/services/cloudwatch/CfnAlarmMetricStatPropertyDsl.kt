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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAlarm
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAlarmMetricStatPropertyDsl {
    private val cdkBuilder: CfnAlarm.MetricStatProperty.Builder =
        CfnAlarm.MetricStatProperty.builder()

    public fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric)
    }

    public fun metric(metric: CfnAlarm.MetricProperty) {
        cdkBuilder.metric(metric)
    }

    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    public fun stat(stat: String) {
        cdkBuilder.stat(stat)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnAlarm.MetricStatProperty = cdkBuilder.build()
}
