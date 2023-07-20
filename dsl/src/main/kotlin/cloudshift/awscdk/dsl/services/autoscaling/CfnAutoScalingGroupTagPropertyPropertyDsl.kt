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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnAutoScalingGroupTagPropertyPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.TagPropertyProperty.Builder =
        CfnAutoScalingGroup.TagPropertyProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun propagateAtLaunch(propagateAtLaunch: Boolean) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch)
    }

    public fun propagateAtLaunch(propagateAtLaunch: IResolvable) {
        cdkBuilder.propagateAtLaunch(propagateAtLaunch)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAutoScalingGroup.TagPropertyProperty = cdkBuilder.build()
}
