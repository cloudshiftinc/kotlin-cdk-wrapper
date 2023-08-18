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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.redshift.CfnEndpointAccessProps

/**
 * Properties for defining a `CfnEndpointAccess`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnEndpointAccessProps cfnEndpointAccessProps = CfnEndpointAccessProps.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .endpointName("endpointName")
 * .subnetGroupName("subnetGroupName")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * // the properties below are optional
 * .resourceOwner("resourceOwner")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html)
 */
@CdkDslMarker
public class CfnEndpointAccessPropsDsl {
    private val cdkBuilder: CfnEndpointAccessProps.Builder = CfnEndpointAccessProps.builder()

    private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param clusterIdentifier The cluster identifier of the cluster associated with the endpoint.
     */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /** @param endpointName The name of the endpoint. */
    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    /** @param resourceOwner The AWS account ID of the owner of the cluster. */
    public fun resourceOwner(resourceOwner: String) {
        cdkBuilder.resourceOwner(resourceOwner)
    }

    /**
     * @param subnetGroupName The subnet group name where Amazon Redshift chooses to deploy the
     *   endpoint.
     */
    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     *   for inbound traffic that you are authorizing into your endpoint.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
        _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
    }

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     *   for inbound traffic that you are authorizing into your endpoint.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
        _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
    }

    public fun build(): CfnEndpointAccessProps {
        if (_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
        return cdkBuilder.build()
    }
}
