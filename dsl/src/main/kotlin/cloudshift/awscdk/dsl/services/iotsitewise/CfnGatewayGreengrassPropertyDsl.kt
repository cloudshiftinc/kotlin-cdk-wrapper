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
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import kotlin.String

@CdkDslMarker
public class CfnGatewayGreengrassPropertyDsl {
    private val cdkBuilder: CfnGateway.GreengrassProperty.Builder =
        CfnGateway.GreengrassProperty.builder()

    public fun groupArn(groupArn: String) {
        cdkBuilder.groupArn(groupArn)
    }

    public fun build(): CfnGateway.GreengrassProperty = cdkBuilder.build()
}
