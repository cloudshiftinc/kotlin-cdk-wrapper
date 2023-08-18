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

package io.cloudshiftdev.awscdkdsl.services.kafkaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The details of the Apache Kafka cluster to which the connector is connected.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * KafkaClusterProperty kafkaClusterProperty = KafkaClusterProperty.builder()
 * .apacheKafkaCluster(ApacheKafkaClusterProperty.builder()
 * .bootstrapServers("bootstrapServers")
 * .vpc(VpcProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-kafkacluster.html)
 */
@CdkDslMarker
public class CfnConnectorKafkaClusterPropertyDsl {
    private val cdkBuilder: CfnConnector.KafkaClusterProperty.Builder =
        CfnConnector.KafkaClusterProperty.builder()

    /** @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. */
    public fun apacheKafkaCluster(apacheKafkaCluster: IResolvable) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster)
    }

    /** @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. */
    public fun apacheKafkaCluster(apacheKafkaCluster: CfnConnector.ApacheKafkaClusterProperty) {
        cdkBuilder.apacheKafkaCluster(apacheKafkaCluster)
    }

    public fun build(): CfnConnector.KafkaClusterProperty = cdkBuilder.build()
}
