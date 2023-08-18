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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
 *
 * For more information, see
 * [Launching your Amazon OpenSearch Service domains using a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
 * in the *Amazon OpenSearch Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * VPCOptionsProperty vPCOptionsProperty = VPCOptionsProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html)
 */
@CdkDslMarker
public class CfnDomainVPCOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.VPCOptionsProperty.Builder =
        CfnDomain.VPCOptionsProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds The list of security group IDs that are associated with the VPC
     *   endpoints for the domain. If you don't provide a security group ID, OpenSearch Service uses
     *   the default security group for the VPC. To learn more, see
     *   [Security groups for your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The list of security group IDs that are associated with the VPC
     *   endpoints for the domain. If you don't provide a security group ID, OpenSearch Service uses
     *   the default security group for the VPC. To learn more, see
     *   [Security groups for your VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses. For
     *   example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
     *   [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in
     *   the *Amazon VPC User Guide* .
     *
     * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
     * `ZoneAwarenessConfig` within
     * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
     * , otherwise you'll see the error "You must specify exactly one subnet" during template
     * creation.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses. For
     *   example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
     *   [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in
     *   the *Amazon VPC User Guide* .
     *
     * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
     * `ZoneAwarenessConfig` within
     * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
     * , otherwise you'll see the error "You must specify exactly one subnet" during template
     * creation.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnDomain.VPCOptionsProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
