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
public class CfnScheduleSqsParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.SqsParametersProperty.Builder =
        CfnSchedule.SqsParametersProperty.builder()

    public fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
    }

    public fun build(): CfnSchedule.SqsParametersProperty = cdkBuilder.build()
}
