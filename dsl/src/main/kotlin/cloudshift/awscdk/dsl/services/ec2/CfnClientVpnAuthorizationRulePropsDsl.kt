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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps

/**
 * Properties for defining a `CfnClientVpnAuthorizationRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnClientVpnAuthorizationRuleProps cfnClientVpnAuthorizationRuleProps =
 * CfnClientVpnAuthorizationRuleProps.builder()
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .targetNetworkCidr("targetNetworkCidr")
 * // the properties below are optional
 * .accessGroupId("accessGroupId")
 * .authorizeAllGroups(false)
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnauthorizationrule.html)
 */
@CdkDslMarker
public class CfnClientVpnAuthorizationRulePropsDsl {
    private val cdkBuilder: CfnClientVpnAuthorizationRuleProps.Builder =
        CfnClientVpnAuthorizationRuleProps.builder()

    /**
     * @param accessGroupId The ID of the group to grant access to, for example, the Active
     *   Directory group or identity provider (IdP) group. Required if `AuthorizeAllGroups` is
     *   `false` or not specified.
     */
    public fun accessGroupId(accessGroupId: String) {
        cdkBuilder.accessGroupId(accessGroupId)
    }

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients. Specify `true` to
     *   grant all clients who successfully establish a VPN connection access to the network. Must
     *   be set to `true` if `AccessGroupId` is not specified.
     */
    public fun authorizeAllGroups(authorizeAllGroups: Boolean) {
        cdkBuilder.authorizeAllGroups(authorizeAllGroups)
    }

    /**
     * @param authorizeAllGroups Indicates whether to grant access to all clients. Specify `true` to
     *   grant all clients who successfully establish a VPN connection access to the network. Must
     *   be set to `true` if `AccessGroupId` is not specified.
     */
    public fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
        cdkBuilder.authorizeAllGroups(authorizeAllGroups)
    }

    /** @param clientVpnEndpointId The ID of the Client VPN endpoint. */
    public fun clientVpnEndpointId(clientVpnEndpointId: String) {
        cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /** @param description A brief description of the authorization rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param targetNetworkCidr The IPv4 address range, in CIDR notation, of the network for which
     *   access is being authorized.
     */
    public fun targetNetworkCidr(targetNetworkCidr: String) {
        cdkBuilder.targetNetworkCidr(targetNetworkCidr)
    }

    public fun build(): CfnClientVpnAuthorizationRuleProps = cdkBuilder.build()
}
