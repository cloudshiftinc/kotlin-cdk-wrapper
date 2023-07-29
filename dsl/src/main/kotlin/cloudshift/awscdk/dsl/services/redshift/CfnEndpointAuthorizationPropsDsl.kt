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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps

/**
 * Properties for defining a `CfnEndpointAuthorization`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnEndpointAuthorizationProps cfnEndpointAuthorizationProps =
 * CfnEndpointAuthorizationProps.builder()
 * .account("account")
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .force(false)
 * .vpcIds(List.of("vpcIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html)
 */
@CdkDslMarker
public class CfnEndpointAuthorizationPropsDsl {
    private val cdkBuilder: CfnEndpointAuthorizationProps.Builder =
        CfnEndpointAuthorizationProps.builder()

    private val _vpcIds: MutableList<String> = mutableListOf()

    /**
     * @param account The AWS account ID of either the cluster owner (grantor) or grantee. If
     *   `Grantee` parameter is true, then the `Account` value is of the grantor.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /** @param clusterIdentifier The cluster identifier. */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param force Indicates whether to force the revoke action. If true, the Redshift-managed VPC
     *   endpoints associated with the endpoint authorization are also deleted.
     */
    public fun force(force: Boolean) {
        cdkBuilder.force(force)
    }

    /**
     * @param force Indicates whether to force the revoke action. If true, the Redshift-managed VPC
     *   endpoints associated with the endpoint authorization are also deleted.
     */
    public fun force(force: IResolvable) {
        cdkBuilder.force(force)
    }

    /** @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. */
    public fun vpcIds(vararg vpcIds: String) {
        _vpcIds.addAll(listOf(*vpcIds))
    }

    /** @param vpcIds The virtual private cloud (VPC) identifiers to grant access to. */
    public fun vpcIds(vpcIds: Collection<String>) {
        _vpcIds.addAll(vpcIds)
    }

    public fun build(): CfnEndpointAuthorizationProps {
        if (_vpcIds.isNotEmpty()) cdkBuilder.vpcIds(_vpcIds)
        return cdkBuilder.build()
    }
}
