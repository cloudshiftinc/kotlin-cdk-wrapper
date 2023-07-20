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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnServiceLoadBalancerPropertyDsl {
    private val cdkBuilder: CfnService.LoadBalancerProperty.Builder =
        CfnService.LoadBalancerProperty.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun build(): CfnService.LoadBalancerProperty = cdkBuilder.build()
}
