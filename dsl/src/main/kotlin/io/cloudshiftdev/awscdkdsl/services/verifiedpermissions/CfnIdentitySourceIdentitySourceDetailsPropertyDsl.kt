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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource

/**
 * A structure that contains configuration of the identity source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.verifiedpermissions.*;
 * IdentitySourceDetailsProperty identitySourceDetailsProperty =
 * IdentitySourceDetailsProperty.builder()
 * .clientIds(List.of("clientIds"))
 * .discoveryUrl("discoveryUrl")
 * .openIdIssuer("openIdIssuer")
 * .userPoolArn("userPoolArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html)
 */
@CdkDslMarker
public class CfnIdentitySourceIdentitySourceDetailsPropertyDsl {
    private val cdkBuilder: CfnIdentitySource.IdentitySourceDetailsProperty.Builder =
        CfnIdentitySource.IdentitySourceDetailsProperty.builder()

    private val _clientIds: MutableList<String> = mutableListOf()

    /**
     * @param clientIds The application client IDs associated with the specified Amazon Cognito user
     *   pool that are enabled for this identity source.
     */
    public fun clientIds(vararg clientIds: String) {
        _clientIds.addAll(listOf(*clientIds))
    }

    /**
     * @param clientIds The application client IDs associated with the specified Amazon Cognito user
     *   pool that are enabled for this identity source.
     */
    public fun clientIds(clientIds: Collection<String>) {
        _clientIds.addAll(clientIds)
    }

    /**
     * @param discoveryUrl The well-known URL that points to this user pool's OIDC discovery
     *   endpoint. This is a URL string in the following format. This URL replaces the placeholders
     *   for both the AWS Region and the user pool identifier with those appropriate for this user
     *   pool.
     *
     * `https://cognito-idp. *&lt;region&gt;* .amazonaws.com/ *&lt;user-pool-id&gt;*
     * /.well-known/openid-configuration`
     */
    public fun discoveryUrl(discoveryUrl: String) {
        cdkBuilder.discoveryUrl(discoveryUrl)
    }

    /**
     * @param openIdIssuer A string that identifies the type of OIDC service represented by this
     *   identity source. At this time, the only valid value is `cognito` .
     */
    public fun openIdIssuer(openIdIssuer: String) {
        cdkBuilder.openIdIssuer(openIdIssuer)
    }

    /**
     * @param userPoolArn The
     *   [Amazon Resource Name (ARN)](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
     *   of the Amazon Cognito user pool whose identities are accessible to this Verified
     *   Permissions policy store.
     */
    public fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
    }

    public fun build(): CfnIdentitySource.IdentitySourceDetailsProperty {
        if (_clientIds.isNotEmpty()) cdkBuilder.clientIds(_clientIds)
        return cdkBuilder.build()
    }
}
