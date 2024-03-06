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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnReplicator

/**
 * Details of an Amazon VPC which has network connectivity to the Kafka cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * KafkaClusterClientVpcConfigProperty kafkaClusterClientVpcConfigProperty =
 * KafkaClusterClientVpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html)
 */
@CdkDslMarker
public class CfnReplicatorKafkaClusterClientVpcConfigPropertyDsl {
    private val cdkBuilder: CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder =
        CfnReplicator.KafkaClusterClientVpcConfigProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds The AWS security groups to associate with the elastic network
     *   interfaces in order to specify what the replicator has access to. If a security group is
     *   not specified, the default security group associated with the VPC is used.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The AWS security groups to associate with the elastic network
     *   interfaces in order to specify what the replicator has access to. If a security group is
     *   not specified, the default security group associated with the VPC is used.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). AWS
     *   creates elastic network interfaces inside these subnets.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). AWS
     *   creates elastic network interfaces inside these subnets.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnReplicator.KafkaClusterClientVpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
