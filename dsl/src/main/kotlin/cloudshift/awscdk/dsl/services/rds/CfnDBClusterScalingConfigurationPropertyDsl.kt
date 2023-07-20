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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBCluster
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDBClusterScalingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDBCluster.ScalingConfigurationProperty.Builder =
        CfnDBCluster.ScalingConfigurationProperty.builder()

    public fun autoPause(autoPause: Boolean) {
        cdkBuilder.autoPause(autoPause)
    }

    public fun autoPause(autoPause: IResolvable) {
        cdkBuilder.autoPause(autoPause)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
        cdkBuilder.secondsBeforeTimeout(secondsBeforeTimeout)
    }

    public fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
        cdkBuilder.secondsUntilAutoPause(secondsUntilAutoPause)
    }

    public fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    public fun build(): CfnDBCluster.ScalingConfigurationProperty = cdkBuilder.build()
}
