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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnReplicator

/**
 * Details of a Kafka cluster for replication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * KafkaClusterProperty kafkaClusterProperty = KafkaClusterProperty.builder()
 * .amazonMskCluster(AmazonMskClusterProperty.builder()
 * .mskClusterArn("mskClusterArn")
 * .build())
 * .vpcConfig(KafkaClusterClientVpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html)
 */
@CdkDslMarker
public class CfnReplicatorKafkaClusterPropertyDsl {
    private val cdkBuilder: CfnReplicator.KafkaClusterProperty.Builder =
        CfnReplicator.KafkaClusterProperty.builder()

    /** @param amazonMskCluster Details of an Amazon MSK cluster. */
    public fun amazonMskCluster(amazonMskCluster: IResolvable) {
        cdkBuilder.amazonMskCluster(amazonMskCluster)
    }

    /** @param amazonMskCluster Details of an Amazon MSK cluster. */
    public fun amazonMskCluster(amazonMskCluster: CfnReplicator.AmazonMskClusterProperty) {
        cdkBuilder.amazonMskCluster(amazonMskCluster)
    }

    /**
     * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
     *   cluster.
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
     *   cluster.
     */
    public fun vpcConfig(vpcConfig: CfnReplicator.KafkaClusterClientVpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnReplicator.KafkaClusterProperty = cdkBuilder.build()
}
