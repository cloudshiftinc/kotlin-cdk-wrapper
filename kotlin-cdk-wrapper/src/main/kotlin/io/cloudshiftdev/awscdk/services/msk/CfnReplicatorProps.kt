@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReplicator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
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
public interface CfnReplicatorProps {
  /**
   * The current version of the MSK replicator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-currentversion)
   */
  public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * A summary description of the replicator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies a list of Kafka clusters which are targets of the replicator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
   */
  public fun kafkaClusters(): Any

  /**
   * A list of replication configurations, where each configuration targets a given source cluster
   * to target cluster replication flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
   */
  public fun replicationInfoList(): Any

  /**
   * The name of the replicator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicatorname)
   */
  public fun replicatorName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
   * resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-serviceexecutionrolearn)
   */
  public fun serviceExecutionRoleArn(): String

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnReplicatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param currentVersion The current version of the MSK replicator.
     */
    public fun currentVersion(currentVersion: String)

    /**
     * @param description A summary description of the replicator.
     */
    public fun description(description: String)

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(kafkaClusters: IResolvable)

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(kafkaClusters: List<Any>)

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(vararg kafkaClusters: Any)

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(replicationInfoList: IResolvable)

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(replicationInfoList: List<Any>)

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(vararg replicationInfoList: Any)

    /**
     * @param replicatorName The name of the replicator. 
     */
    public fun replicatorName(replicatorName: String)

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * replicator to access external resources. 
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnReplicatorProps.Builder =
        software.amazon.awscdk.services.msk.CfnReplicatorProps.builder()

    /**
     * @param currentVersion The current version of the MSK replicator.
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * @param description A summary description of the replicator.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(kafkaClusters: IResolvable) {
      cdkBuilder.kafkaClusters(kafkaClusters.let(IResolvable::unwrap))
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(kafkaClusters: List<Any>) {
      cdkBuilder.kafkaClusters(kafkaClusters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(vararg kafkaClusters: Any): Unit =
        kafkaClusters(kafkaClusters.toList())

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(replicationInfoList: IResolvable) {
      cdkBuilder.replicationInfoList(replicationInfoList.let(IResolvable::unwrap))
    }

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(replicationInfoList: List<Any>) {
      cdkBuilder.replicationInfoList(replicationInfoList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(vararg replicationInfoList: Any): Unit =
        replicationInfoList(replicationInfoList.toList())

    /**
     * @param replicatorName The name of the replicator. 
     */
    override fun replicatorName(replicatorName: String) {
      cdkBuilder.replicatorName(replicatorName)
    }

    /**
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * replicator to access external resources. 
     */
    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnReplicatorProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnReplicatorProps,
  ) : CdkObject(cdkObject), CfnReplicatorProps {
    /**
     * The current version of the MSK replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-currentversion)
     */
    override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    /**
     * A summary description of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     */
    override fun kafkaClusters(): Any = unwrap(this).getKafkaClusters()

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     */
    override fun replicationInfoList(): Any = unwrap(this).getReplicationInfoList()

    /**
     * The name of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicatorname)
     */
    override fun replicatorName(): String = unwrap(this).getReplicatorName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-serviceexecutionrolearn)
     */
    override fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicatorProps):
        CfnReplicatorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnReplicatorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicatorProps):
        software.amazon.awscdk.services.msk.CfnReplicatorProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.msk.CfnReplicatorProps
  }
}
