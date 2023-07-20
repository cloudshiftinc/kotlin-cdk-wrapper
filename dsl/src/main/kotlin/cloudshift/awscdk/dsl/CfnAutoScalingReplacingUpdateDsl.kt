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
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate
import kotlin.Boolean

@CdkDslMarker
public class CfnAutoScalingReplacingUpdateDsl {
    private val cdkBuilder: CfnAutoScalingReplacingUpdate.Builder =
        CfnAutoScalingReplacingUpdate.builder()

    public fun willReplace(willReplace: Boolean) {
        cdkBuilder.willReplace(willReplace)
    }

    public fun build(): CfnAutoScalingReplacingUpdate = cdkBuilder.build()
}
