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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.scheduler.CfnSchedule
import kotlin.String

@CdkDslMarker
public class CfnScheduleDeadLetterConfigPropertyDsl {
    private val cdkBuilder: CfnSchedule.DeadLetterConfigProperty.Builder =
        CfnSchedule.DeadLetterConfigProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnSchedule.DeadLetterConfigProperty = cdkBuilder.build()
}
