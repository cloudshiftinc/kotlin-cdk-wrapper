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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnClientVpnEndpointClientConnectOptionsPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder =
        CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    public fun build(): CfnClientVpnEndpoint.ClientConnectOptionsProperty = cdkBuilder.build()
}
