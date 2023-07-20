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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import kotlin.Number

@CdkDslMarker
public class CfnConnectorAutoScalingPropertyDsl {
    private val cdkBuilder: CfnConnector.AutoScalingProperty.Builder =
        CfnConnector.AutoScalingProperty.builder()

    public fun maxWorkerCount(maxWorkerCount: Number) {
        cdkBuilder.maxWorkerCount(maxWorkerCount)
    }

    public fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
    }

    public fun minWorkerCount(minWorkerCount: Number) {
        cdkBuilder.minWorkerCount(minWorkerCount)
    }

    public fun scaleInPolicy(scaleInPolicy: IResolvable) {
        cdkBuilder.scaleInPolicy(scaleInPolicy)
    }

    public fun scaleInPolicy(scaleInPolicy: CfnConnector.ScaleInPolicyProperty) {
        cdkBuilder.scaleInPolicy(scaleInPolicy)
    }

    public fun scaleOutPolicy(scaleOutPolicy: IResolvable) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy)
    }

    public fun scaleOutPolicy(scaleOutPolicy: CfnConnector.ScaleOutPolicyProperty) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy)
    }

    public fun build(): CfnConnector.AutoScalingProperty = cdkBuilder.build()
}
