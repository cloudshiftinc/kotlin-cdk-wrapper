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
import kotlin.String

@CdkDslMarker
public class CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder()

    public fun activeDirectory(activeDirectory: IResolvable) {
        cdkBuilder.activeDirectory(activeDirectory)
    }

    public fun activeDirectory(activeDirectory: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty) {
        cdkBuilder.activeDirectory(activeDirectory)
    }

    public fun federatedAuthentication(federatedAuthentication: IResolvable) {
        cdkBuilder.federatedAuthentication(federatedAuthentication)
    }

    public fun federatedAuthentication(federatedAuthentication: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty) {
        cdkBuilder.federatedAuthentication(federatedAuthentication)
    }

    public fun mutualAuthentication(mutualAuthentication: IResolvable) {
        cdkBuilder.mutualAuthentication(mutualAuthentication)
    }

    public fun mutualAuthentication(mutualAuthentication: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty) {
        cdkBuilder.mutualAuthentication(mutualAuthentication)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty = cdkBuilder.build()
}
