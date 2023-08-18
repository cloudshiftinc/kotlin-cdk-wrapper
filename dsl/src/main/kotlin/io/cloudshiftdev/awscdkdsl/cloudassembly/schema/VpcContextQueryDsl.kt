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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.VpcContextQuery

/**
 * Query input for looking up a VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * VpcContextQuery vpcContextQuery = VpcContextQuery.builder()
 * .account("account")
 * .filter(Map.of(
 * "filterKey", "filter"))
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .returnAsymmetricSubnets(false)
 * .returnVpnGateways(false)
 * .subnetGroupNameTag("subnetGroupNameTag")
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcContextQueryDsl {
    private val cdkBuilder: VpcContextQuery.Builder = VpcContextQuery.builder()

    /** @param account Query account. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param filter Filters to apply to the VPC. Filter parameters are the same as passed to
     *   DescribeVpcs.
     */
    public fun filter(filter: Map<String, String>) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param region Query region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param returnAsymmetricSubnets Whether to populate the subnetGroups field of the
     *   `VpcContextResponse`, which contains potentially asymmetric subnet groups.
     */
    public fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
        cdkBuilder.returnAsymmetricSubnets(returnAsymmetricSubnets)
    }

    /**
     * @param returnVpnGateways Whether to populate the `vpnGatewayId` field of the
     *   `VpcContextResponse`, which contains the VPN Gateway ID, if one exists. You can explicitly
     *   disable this in order to avoid the lookup if you know the VPC does not have a VPN Gatway
     *   attached.
     */
    public fun returnVpnGateways(returnVpnGateways: Boolean) {
        cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    /**
     * @param subnetGroupNameTag Optional tag for subnet group name. If not provided, we'll look at
     *   the aws-cdk:subnet-name tag. If the subnet does not have the specified tag, we'll use its
     *   type as the name.
     */
    public fun subnetGroupNameTag(subnetGroupNameTag: String) {
        cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public fun build(): VpcContextQuery = cdkBuilder.build()
}
