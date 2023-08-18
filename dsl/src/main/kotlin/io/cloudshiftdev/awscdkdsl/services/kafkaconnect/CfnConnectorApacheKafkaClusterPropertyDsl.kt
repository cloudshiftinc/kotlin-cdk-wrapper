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
import kotlin.String
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
 * ApacheKafkaClusterProperty apacheKafkaClusterProperty = ApacheKafkaClusterProperty.builder()
 * .bootstrapServers("bootstrapServers")
 * .vpc(VpcProperty.builder()
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-apachekafkacluster.html)
 */
@CdkDslMarker
public class CfnConnectorApacheKafkaClusterPropertyDsl {
    private val cdkBuilder: CfnConnector.ApacheKafkaClusterProperty.Builder =
        CfnConnector.ApacheKafkaClusterProperty.builder()

    /** @param bootstrapServers The bootstrap servers of the cluster. */
    public fun bootstrapServers(bootstrapServers: String) {
        cdkBuilder.bootstrapServers(bootstrapServers)
    }

    /**
     * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
     *   cluster.
     */
    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka
     *   cluster.
     */
    public fun vpc(vpc: CfnConnector.VpcProperty) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnConnector.ApacheKafkaClusterProperty = cdkBuilder.build()
}
