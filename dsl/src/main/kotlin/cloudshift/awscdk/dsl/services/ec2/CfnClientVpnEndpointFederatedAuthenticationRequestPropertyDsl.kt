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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

/**
 * The IAM SAML identity provider used for federated authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * FederatedAuthenticationRequestProperty federatedAuthenticationRequestProperty =
 * FederatedAuthenticationRequestProperty.builder()
 * .samlProviderArn("samlProviderArn")
 * // the properties below are optional
 * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html)
 */
@CdkDslMarker
public class CfnClientVpnEndpointFederatedAuthenticationRequestPropertyDsl {
    private val cdkBuilder: CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder =
        CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.builder()

    /** @param samlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity provider. */
    public fun samlProviderArn(samlProviderArn: String) {
        cdkBuilder.samlProviderArn(samlProviderArn)
    }

    /**
     * @param selfServiceSamlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity
     *   provider for the self-service portal.
     */
    public fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String) {
        cdkBuilder.selfServiceSamlProviderArn(selfServiceSamlProviderArn)
    }

    public fun build(): CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty =
        cdkBuilder.build()
}
