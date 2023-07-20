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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnAutoScalingScheduledAction
import kotlin.Boolean

@CdkDslMarker
public class CfnAutoScalingScheduledActionDsl {
    private val cdkBuilder: CfnAutoScalingScheduledAction.Builder =
        CfnAutoScalingScheduledAction.builder()

    public fun ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties: Boolean) {
        cdkBuilder.ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties)
    }

    public fun build(): CfnAutoScalingScheduledAction = cdkBuilder.build()
}
