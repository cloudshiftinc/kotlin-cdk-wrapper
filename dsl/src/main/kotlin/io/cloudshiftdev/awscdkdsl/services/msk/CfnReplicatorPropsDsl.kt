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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnReplicatorProps

/**
 * Properties for defining a `CfnReplicator`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnReplicatorProps cfnReplicatorProps = CfnReplicatorProps.builder()
 * .kafkaClusters(List.of(KafkaClusterProperty.builder()
 * .amazonMskCluster(AmazonMskClusterProperty.builder()
 * .mskClusterArn("mskClusterArn")
 * .build())
 * .vpcConfig(KafkaClusterClientVpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .build()))
 * .replicationInfoList(List.of(ReplicationInfoProperty.builder()
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
 * .build()))
 * .replicatorName("replicatorName")
 * .serviceExecutionRoleArn("serviceExecutionRoleArn")
 * // the properties below are optional
 * .currentVersion("currentVersion")
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html)
 */
@CdkDslMarker
public class CfnReplicatorPropsDsl {
    private val cdkBuilder: CfnReplicatorProps.Builder = CfnReplicatorProps.builder()

    private val _kafkaClusters: MutableList<Any> = mutableListOf()

    private val _replicationInfoList: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param currentVersion The current version of the MSK replicator. */
    public fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
    }

    /** @param description A summary description of the replicator. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator.
     */
    public fun kafkaClusters(vararg kafkaClusters: Any) {
        _kafkaClusters.addAll(listOf(*kafkaClusters))
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator.
     */
    public fun kafkaClusters(kafkaClusters: Collection<Any>) {
        _kafkaClusters.addAll(kafkaClusters)
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator.
     */
    public fun kafkaClusters(kafkaClusters: IResolvable) {
        cdkBuilder.kafkaClusters(kafkaClusters)
    }

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     *   targets a given source cluster to target cluster replication flow.
     */
    public fun replicationInfoList(vararg replicationInfoList: Any) {
        _replicationInfoList.addAll(listOf(*replicationInfoList))
    }

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     *   targets a given source cluster to target cluster replication flow.
     */
    public fun replicationInfoList(replicationInfoList: Collection<Any>) {
        _replicationInfoList.addAll(replicationInfoList)
    }

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     *   targets a given source cluster to target cluster replication flow.
     */
    public fun replicationInfoList(replicationInfoList: IResolvable) {
        cdkBuilder.replicationInfoList(replicationInfoList)
    }

    /** @param replicatorName The name of the replicator. */
    public fun replicatorName(replicatorName: String) {
        cdkBuilder.replicatorName(replicatorName)
    }

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     *   replicator to access external resources.
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
        cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReplicatorProps {
        if (_kafkaClusters.isNotEmpty()) cdkBuilder.kafkaClusters(_kafkaClusters)
        if (_replicationInfoList.isNotEmpty()) cdkBuilder.replicationInfoList(_replicationInfoList)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
