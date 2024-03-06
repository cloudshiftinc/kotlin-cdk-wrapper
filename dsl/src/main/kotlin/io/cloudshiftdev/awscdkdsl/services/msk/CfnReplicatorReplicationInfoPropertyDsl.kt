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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnReplicator

/**
 * Specifies configuration for replication between a source and target Kafka cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * ReplicationInfoProperty replicationInfoProperty = ReplicationInfoProperty.builder()
 * .consumerGroupReplication(ConsumerGroupReplicationProperty.builder()
 * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
 * // the properties below are optional
 * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
 * .detectAndCopyNewConsumerGroups(false)
 * .synchroniseConsumerGroupOffsets(false)
 * .build())
 * .sourceKafkaClusterArn("sourceKafkaClusterArn")
 * .targetCompressionType("targetCompressionType")
 * .targetKafkaClusterArn("targetKafkaClusterArn")
 * .topicReplication(TopicReplicationProperty.builder()
 * .topicsToReplicate(List.of("topicsToReplicate"))
 * // the properties below are optional
 * .copyAccessControlListsForTopics(false)
 * .copyTopicConfigurations(false)
 * .detectAndCopyNewTopics(false)
 * .topicsToExclude(List.of("topicsToExclude"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html)
 */
@CdkDslMarker
public class CfnReplicatorReplicationInfoPropertyDsl {
    private val cdkBuilder: CfnReplicator.ReplicationInfoProperty.Builder =
        CfnReplicator.ReplicationInfoProperty.builder()

    /** @param consumerGroupReplication Configuration relating to consumer group replication. */
    public fun consumerGroupReplication(consumerGroupReplication: IResolvable) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication)
    }

    /** @param consumerGroupReplication Configuration relating to consumer group replication. */
    public fun consumerGroupReplication(
        consumerGroupReplication: CfnReplicator.ConsumerGroupReplicationProperty
    ) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication)
    }

    /** @param sourceKafkaClusterArn Amazon Resource Name of the source Kafka cluster. */
    public fun sourceKafkaClusterArn(sourceKafkaClusterArn: String) {
        cdkBuilder.sourceKafkaClusterArn(sourceKafkaClusterArn)
    }

    /**
     * @param targetCompressionType The type of compression to use writing records to target Kafka
     *   cluster.
     */
    public fun targetCompressionType(targetCompressionType: String) {
        cdkBuilder.targetCompressionType(targetCompressionType)
    }

    /** @param targetKafkaClusterArn Amazon Resource Name of the target Kafka cluster. */
    public fun targetKafkaClusterArn(targetKafkaClusterArn: String) {
        cdkBuilder.targetKafkaClusterArn(targetKafkaClusterArn)
    }

    /** @param topicReplication the value to be set. */
    public fun topicReplication(topicReplication: IResolvable) {
        cdkBuilder.topicReplication(topicReplication)
    }

    /** @param topicReplication the value to be set. */
    public fun topicReplication(topicReplication: CfnReplicator.TopicReplicationProperty) {
        cdkBuilder.topicReplication(topicReplication)
    }

    public fun build(): CfnReplicator.ReplicationInfoProperty = cdkBuilder.build()
}
