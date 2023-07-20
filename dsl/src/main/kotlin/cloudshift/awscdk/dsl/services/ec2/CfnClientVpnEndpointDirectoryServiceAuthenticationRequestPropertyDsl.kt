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
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import kotlin.String

@CdkDslMarker
public class CfnClientVpnEndpointDirectoryServiceAuthenticationRequestPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder()

    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    public fun build(): CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty =
        cdkBuilder.build()
}
