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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEndpointTrafficRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.TrafficRoutingConfigProperty.Builder =
        CfnEndpoint.TrafficRoutingConfigProperty.builder()

    public fun canarySize(canarySize: IResolvable) {
        cdkBuilder.canarySize(canarySize)
    }

    public fun canarySize(canarySize: CfnEndpoint.CapacitySizeProperty) {
        cdkBuilder.canarySize(canarySize)
    }

    public fun linearStepSize(linearStepSize: IResolvable) {
        cdkBuilder.linearStepSize(linearStepSize)
    }

    public fun linearStepSize(linearStepSize: CfnEndpoint.CapacitySizeProperty) {
        cdkBuilder.linearStepSize(linearStepSize)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
    }

    public fun build(): CfnEndpoint.TrafficRoutingConfigProperty = cdkBuilder.build()
}
