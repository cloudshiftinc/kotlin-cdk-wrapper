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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnGateway

@CdkDslMarker
public class CfnGatewayGatewayPlatformPropertyDsl {
    private val cdkBuilder: CfnGateway.GatewayPlatformProperty.Builder =
        CfnGateway.GatewayPlatformProperty.builder()

    public fun greengrass(greengrass: IResolvable) {
        cdkBuilder.greengrass(greengrass)
    }

    public fun greengrass(greengrass: CfnGateway.GreengrassProperty) {
        cdkBuilder.greengrass(greengrass)
    }

    public fun greengrassV2(greengrassV2: IResolvable) {
        cdkBuilder.greengrassV2(greengrassV2)
    }

    public fun greengrassV2(greengrassV2: CfnGateway.GreengrassV2Property) {
        cdkBuilder.greengrassV2(greengrassV2)
    }

    public fun build(): CfnGateway.GatewayPlatformProperty = cdkBuilder.build()
}
