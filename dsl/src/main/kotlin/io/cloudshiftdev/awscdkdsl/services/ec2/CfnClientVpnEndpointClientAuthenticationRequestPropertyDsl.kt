@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * Describes the authentication method to be used by a Client VPN endpoint.
 *
 * For more information, see
 * [Authentication](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication)
 * in the *AWS Client VPN Administrator Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClientAuthenticationRequestProperty clientAuthenticationRequestProperty =
 * ClientAuthenticationRequestProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
 * .directoryId("directoryId")
 * .build())
 * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
 * .samlProviderArn("samlProviderArn")
 * // the properties below are optional
 * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
 * .build())
 * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
 * .clientRootCertificateChainArn("clientRootCertificateChainArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointClientAuthenticationRequestPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder()

    /**
     * @param activeDirectory Information about the Active Directory to be used, if applicable. You
     *   must provide this information if *Type* is `directory-service-authentication` .
     */
    public fun activeDirectory(activeDirectory: IResolvable) {
        cdkBuilder.activeDirectory(activeDirectory)
    }

    /**
     * @param activeDirectory Information about the Active Directory to be used, if applicable. You
     *   must provide this information if *Type* is `directory-service-authentication` .
     */
    public fun activeDirectory(
        activeDirectory: CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty
    ) {
        cdkBuilder.activeDirectory(activeDirectory)
    }

    /**
     * @param federatedAuthentication Information about the IAM SAML identity provider, if
     *   applicable.
     */
    public fun federatedAuthentication(federatedAuthentication: IResolvable) {
        cdkBuilder.federatedAuthentication(federatedAuthentication)
    }

    /**
     * @param federatedAuthentication Information about the IAM SAML identity provider, if
     *   applicable.
     */
    public fun federatedAuthentication(
        federatedAuthentication: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty
    ) {
        cdkBuilder.federatedAuthentication(federatedAuthentication)
    }

    /**
     * @param mutualAuthentication Information about the authentication certificates to be used, if
     *   applicable. You must provide this information if *Type* is `certificate-authentication` .
     */
    public fun mutualAuthentication(mutualAuthentication: IResolvable) {
        cdkBuilder.mutualAuthentication(mutualAuthentication)
    }

    /**
     * @param mutualAuthentication Information about the authentication certificates to be used, if
     *   applicable. You must provide this information if *Type* is `certificate-authentication` .
     */
    public fun mutualAuthentication(
        mutualAuthentication: CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty
    ) {
        cdkBuilder.mutualAuthentication(mutualAuthentication)
    }

    /** @param type The type of client authentication to be used. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnClientVpnEndpoint.ClientAuthenticationRequestProperty =
        cdkBuilder.build()
}
