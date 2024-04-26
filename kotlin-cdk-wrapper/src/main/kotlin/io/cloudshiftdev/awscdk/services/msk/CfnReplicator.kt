@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource Type definition for AWS::MSK::Replicator.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnReplicator cfnReplicator = CfnReplicator.Builder.create(this, "MyCfnReplicator")
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
 * .startingPosition(ReplicationStartingPositionProperty.builder()
 * .type("type")
 * .build())
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
public open class CfnReplicator(
  cdkObject: software.amazon.awscdk.services.msk.CfnReplicator,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicatorProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnReplicator(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReplicatorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicatorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReplicatorProps(props)
  )

  /**
   * Amazon Resource Name (ARN) for the created replicator.
   */
  public open fun attrReplicatorArn(): String = unwrap(this).getAttrReplicatorArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The current version of the MSK replicator.
   */
  public open fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  /**
   * The current version of the MSK replicator.
   */
  public open fun currentVersion(`value`: String) {
    unwrap(this).setCurrentVersion(`value`)
  }

  /**
   * A summary description of the replicator.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A summary description of the replicator.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies a list of Kafka clusters which are targets of the replicator.
   */
  public open fun kafkaClusters(): Any = unwrap(this).getKafkaClusters()

  /**
   * Specifies a list of Kafka clusters which are targets of the replicator.
   */
  public open fun kafkaClusters(`value`: IResolvable) {
    unwrap(this).setKafkaClusters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a list of Kafka clusters which are targets of the replicator.
   */
  public open fun kafkaClusters(`value`: List<Any>) {
    unwrap(this).setKafkaClusters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies a list of Kafka clusters which are targets of the replicator.
   */
  public open fun kafkaClusters(vararg `value`: Any): Unit = kafkaClusters(`value`.toList())

  /**
   * A list of replication configurations, where each configuration targets a given source cluster
   * to target cluster replication flow.
   */
  public open fun replicationInfoList(): Any = unwrap(this).getReplicationInfoList()

  /**
   * A list of replication configurations, where each configuration targets a given source cluster
   * to target cluster replication flow.
   */
  public open fun replicationInfoList(`value`: IResolvable) {
    unwrap(this).setReplicationInfoList(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of replication configurations, where each configuration targets a given source cluster
   * to target cluster replication flow.
   */
  public open fun replicationInfoList(`value`: List<Any>) {
    unwrap(this).setReplicationInfoList(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of replication configurations, where each configuration targets a given source cluster
   * to target cluster replication flow.
   */
  public open fun replicationInfoList(vararg `value`: Any): Unit =
      replicationInfoList(`value`.toList())

  /**
   * The name of the replicator.
   */
  public open fun replicatorName(): String = unwrap(this).getReplicatorName()

  /**
   * The name of the replicator.
   */
  public open fun replicatorName(`value`: String) {
    unwrap(this).setReplicatorName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
   * resources.
   */
  public open fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
   * resources.
   */
  public open fun serviceExecutionRoleArn(`value`: String) {
    unwrap(this).setServiceExecutionRoleArn(`value`)
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnReplicator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current version of the MSK replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-currentversion)
     * @param currentVersion The current version of the MSK replicator. 
     */
    public fun currentVersion(currentVersion: String)

    /**
     * A summary description of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-description)
     * @param description A summary description of the replicator. 
     */
    public fun description(description: String)

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(kafkaClusters: IResolvable)

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(kafkaClusters: List<Any>)

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    public fun kafkaClusters(vararg kafkaClusters: Any)

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(replicationInfoList: IResolvable)

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(replicationInfoList: List<Any>)

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    public fun replicationInfoList(vararg replicationInfoList: Any)

    /**
     * The name of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicatorname)
     * @param replicatorName The name of the replicator. 
     */
    public fun replicatorName(replicatorName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-serviceexecutionrolearn)
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * replicator to access external resources. 
     */
    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnReplicator.Builder =
        software.amazon.awscdk.services.msk.CfnReplicator.Builder.create(scope, id)

    /**
     * The current version of the MSK replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-currentversion)
     * @param currentVersion The current version of the MSK replicator. 
     */
    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * A summary description of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-description)
     * @param description A summary description of the replicator. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(kafkaClusters: IResolvable) {
      cdkBuilder.kafkaClusters(kafkaClusters.let(IResolvable::unwrap))
    }

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(kafkaClusters: List<Any>) {
      cdkBuilder.kafkaClusters(kafkaClusters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies a list of Kafka clusters which are targets of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-kafkaclusters)
     * @param kafkaClusters Specifies a list of Kafka clusters which are targets of the replicator. 
     */
    override fun kafkaClusters(vararg kafkaClusters: Any): Unit =
        kafkaClusters(kafkaClusters.toList())

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(replicationInfoList: IResolvable) {
      cdkBuilder.replicationInfoList(replicationInfoList.let(IResolvable::unwrap))
    }

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(replicationInfoList: List<Any>) {
      cdkBuilder.replicationInfoList(replicationInfoList.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of replication configurations, where each configuration targets a given source cluster
     * to target cluster replication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicationinfolist)
     * @param replicationInfoList A list of replication configurations, where each configuration
     * targets a given source cluster to target cluster replication flow. 
     */
    override fun replicationInfoList(vararg replicationInfoList: Any): Unit =
        replicationInfoList(replicationInfoList.toList())

    /**
     * The name of the replicator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-replicatorname)
     * @param replicatorName The name of the replicator. 
     */
    override fun replicatorName(replicatorName: String) {
      cdkBuilder.replicatorName(replicatorName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the replicator to access external
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-serviceexecutionrolearn)
     * @param serviceExecutionRoleArn The Amazon Resource Name (ARN) of the IAM role used by the
     * replicator to access external resources. 
     */
    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-replicator.html#cfn-msk-replicator-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnReplicator = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnReplicator.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator): CfnReplicator =
        CfnReplicator(cdkObject)

    internal fun unwrap(wrapped: CfnReplicator): software.amazon.awscdk.services.msk.CfnReplicator =
        wrapped.cdkObject as software.amazon.awscdk.services.msk.CfnReplicator
  }

  /**
   * Details of an Amazon MSK cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * AmazonMskClusterProperty amazonMskClusterProperty = AmazonMskClusterProperty.builder()
   * .mskClusterArn("mskClusterArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-amazonmskcluster.html)
   */
  public interface AmazonMskClusterProperty {
    /**
     * The ARN of an Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-amazonmskcluster.html#cfn-msk-replicator-amazonmskcluster-mskclusterarn)
     */
    public fun mskClusterArn(): String

    /**
     * A builder for [AmazonMskClusterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mskClusterArn The ARN of an Amazon MSK cluster. 
       */
      public fun mskClusterArn(mskClusterArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.builder()

      /**
       * @param mskClusterArn The ARN of an Amazon MSK cluster. 
       */
      override fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty,
    ) : CdkObject(cdkObject), AmazonMskClusterProperty {
      /**
       * The ARN of an Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-amazonmskcluster.html#cfn-msk-replicator-amazonmskcluster-mskclusterarn)
       */
      override fun mskClusterArn(): String = unwrap(this).getMskClusterArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AmazonMskClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty):
          AmazonMskClusterProperty = CdkObjectWrappers.wrap(cdkObject) as? AmazonMskClusterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonMskClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty
    }
  }

  /**
   * Configuration relating to consumer group replication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ConsumerGroupReplicationProperty consumerGroupReplicationProperty =
   * ConsumerGroupReplicationProperty.builder()
   * .consumerGroupsToReplicate(List.of("consumerGroupsToReplicate"))
   * // the properties below are optional
   * .consumerGroupsToExclude(List.of("consumerGroupsToExclude"))
   * .detectAndCopyNewConsumerGroups(false)
   * .synchroniseConsumerGroupOffsets(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html)
   */
  public interface ConsumerGroupReplicationProperty {
    /**
     * List of regular expression patterns indicating the consumer groups that should not be
     * replicated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-consumergroupstoexclude)
     */
    public fun consumerGroupsToExclude(): List<String> = unwrap(this).getConsumerGroupsToExclude()
        ?: emptyList()

    /**
     * List of regular expression patterns indicating the consumer groups to copy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-consumergroupstoreplicate)
     */
    public fun consumerGroupsToReplicate(): List<String>

    /**
     * Whether to periodically check for new consumer groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-detectandcopynewconsumergroups)
     */
    public fun detectAndCopyNewConsumerGroups(): Any? =
        unwrap(this).getDetectAndCopyNewConsumerGroups()

    /**
     * Whether to periodically write the translated offsets to __consumer_offsets topic in target
     * cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-synchroniseconsumergroupoffsets)
     */
    public fun synchroniseConsumerGroupOffsets(): Any? =
        unwrap(this).getSynchroniseConsumerGroupOffsets()

    /**
     * A builder for [ConsumerGroupReplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
       * groups that should not be replicated.
       */
      public fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>)

      /**
       * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
       * groups that should not be replicated.
       */
      public fun consumerGroupsToExclude(vararg consumerGroupsToExclude: String)

      /**
       * @param consumerGroupsToReplicate List of regular expression patterns indicating the
       * consumer groups to copy. 
       */
      public fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>)

      /**
       * @param consumerGroupsToReplicate List of regular expression patterns indicating the
       * consumer groups to copy. 
       */
      public fun consumerGroupsToReplicate(vararg consumerGroupsToReplicate: String)

      /**
       * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer
       * groups.
       */
      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean)

      /**
       * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer
       * groups.
       */
      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable)

      /**
       * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
       * to __consumer_offsets topic in target cluster.
       */
      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean)

      /**
       * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
       * to __consumer_offsets topic in target cluster.
       */
      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.builder()

      /**
       * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
       * groups that should not be replicated.
       */
      override fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>) {
        cdkBuilder.consumerGroupsToExclude(consumerGroupsToExclude)
      }

      /**
       * @param consumerGroupsToExclude List of regular expression patterns indicating the consumer
       * groups that should not be replicated.
       */
      override fun consumerGroupsToExclude(vararg consumerGroupsToExclude: String): Unit =
          consumerGroupsToExclude(consumerGroupsToExclude.toList())

      /**
       * @param consumerGroupsToReplicate List of regular expression patterns indicating the
       * consumer groups to copy. 
       */
      override fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>) {
        cdkBuilder.consumerGroupsToReplicate(consumerGroupsToReplicate)
      }

      /**
       * @param consumerGroupsToReplicate List of regular expression patterns indicating the
       * consumer groups to copy. 
       */
      override fun consumerGroupsToReplicate(vararg consumerGroupsToReplicate: String): Unit =
          consumerGroupsToReplicate(consumerGroupsToReplicate.toList())

      /**
       * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer
       * groups.
       */
      override fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups)
      }

      /**
       * @param detectAndCopyNewConsumerGroups Whether to periodically check for new consumer
       * groups.
       */
      override fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups.let(IResolvable::unwrap))
      }

      /**
       * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
       * to __consumer_offsets topic in target cluster.
       */
      override fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets)
      }

      /**
       * @param synchroniseConsumerGroupOffsets Whether to periodically write the translated offsets
       * to __consumer_offsets topic in target cluster.
       */
      override fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty,
    ) : CdkObject(cdkObject), ConsumerGroupReplicationProperty {
      /**
       * List of regular expression patterns indicating the consumer groups that should not be
       * replicated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-consumergroupstoexclude)
       */
      override fun consumerGroupsToExclude(): List<String> =
          unwrap(this).getConsumerGroupsToExclude() ?: emptyList()

      /**
       * List of regular expression patterns indicating the consumer groups to copy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-consumergroupstoreplicate)
       */
      override fun consumerGroupsToReplicate(): List<String> =
          unwrap(this).getConsumerGroupsToReplicate()

      /**
       * Whether to periodically check for new consumer groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-detectandcopynewconsumergroups)
       */
      override fun detectAndCopyNewConsumerGroups(): Any? =
          unwrap(this).getDetectAndCopyNewConsumerGroups()

      /**
       * Whether to periodically write the translated offsets to __consumer_offsets topic in target
       * cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-consumergroupreplication.html#cfn-msk-replicator-consumergroupreplication-synchroniseconsumergroupoffsets)
       */
      override fun synchroniseConsumerGroupOffsets(): Any? =
          unwrap(this).getSynchroniseConsumerGroupOffsets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConsumerGroupReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty):
          ConsumerGroupReplicationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConsumerGroupReplicationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsumerGroupReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty
    }
  }

  /**
   * Details of an Amazon VPC which has network connectivity to the Kafka cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
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
  public interface KafkaClusterClientVpcConfigProperty {
    /**
     * The AWS security groups to associate with the elastic network interfaces in order to specify
     * what the replicator has access to.
     *
     * If a security group is not specified, the default security group associated with the VPC is
     * used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html#cfn-msk-replicator-kafkaclusterclientvpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The list of subnets to connect to in the virtual private cloud (VPC).
     *
     * AWS creates elastic network interfaces inside these subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html#cfn-msk-replicator-kafkaclusterclientvpcconfig-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [KafkaClusterClientVpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The AWS security groups to associate with the elastic network
       * interfaces in order to specify what the replicator has access to.
       * If a security group is not specified, the default security group associated with the VPC is
       * used.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The AWS security groups to associate with the elastic network
       * interfaces in order to specify what the replicator has access to.
       * If a security group is not specified, the default security group associated with the VPC is
       * used.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). 
       * AWS creates elastic network interfaces inside these subnets.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). 
       * AWS creates elastic network interfaces inside these subnets.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.builder()

      /**
       * @param securityGroupIds The AWS security groups to associate with the elastic network
       * interfaces in order to specify what the replicator has access to.
       * If a security group is not specified, the default security group associated with the VPC is
       * used.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The AWS security groups to associate with the elastic network
       * interfaces in order to specify what the replicator has access to.
       * If a security group is not specified, the default security group associated with the VPC is
       * used.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). 
       * AWS creates elastic network interfaces inside these subnets.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The list of subnets to connect to in the virtual private cloud (VPC). 
       * AWS creates elastic network interfaces inside these subnets.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty,
    ) : CdkObject(cdkObject), KafkaClusterClientVpcConfigProperty {
      /**
       * The AWS security groups to associate with the elastic network interfaces in order to
       * specify what the replicator has access to.
       *
       * If a security group is not specified, the default security group associated with the VPC is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html#cfn-msk-replicator-kafkaclusterclientvpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The list of subnets to connect to in the virtual private cloud (VPC).
       *
       * AWS creates elastic network interfaces inside these subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkaclusterclientvpcconfig.html#cfn-msk-replicator-kafkaclusterclientvpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KafkaClusterClientVpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty):
          KafkaClusterClientVpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KafkaClusterClientVpcConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterClientVpcConfigProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty
    }
  }

  /**
   * Details of a Kafka cluster for replication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
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
  public interface KafkaClusterProperty {
    /**
     * Details of an Amazon MSK cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html#cfn-msk-replicator-kafkacluster-amazonmskcluster)
     */
    public fun amazonMskCluster(): Any

    /**
     * Details of an Amazon VPC which has network connectivity to the Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html#cfn-msk-replicator-kafkacluster-vpcconfig)
     */
    public fun vpcConfig(): Any

    /**
     * A builder for [KafkaClusterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      public fun amazonMskCluster(amazonMskCluster: IResolvable)

      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty)

      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit)

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      public fun vpcConfig(vpcConfig: IResolvable)

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty)

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.builder()

      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      override fun amazonMskCluster(amazonMskCluster: IResolvable) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(IResolvable::unwrap))
      }

      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      override fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(AmazonMskClusterProperty::unwrap))
      }

      /**
       * @param amazonMskCluster Details of an Amazon MSK cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      override fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit):
          Unit = amazonMskCluster(AmazonMskClusterProperty(amazonMskCluster))

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      override fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(KafkaClusterClientVpcConfigProperty::unwrap))
      }

      /**
       * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka
       * cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      override fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit):
          Unit = vpcConfig(KafkaClusterClientVpcConfigProperty(vpcConfig))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty,
    ) : CdkObject(cdkObject), KafkaClusterProperty {
      /**
       * Details of an Amazon MSK cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html#cfn-msk-replicator-kafkacluster-amazonmskcluster)
       */
      override fun amazonMskCluster(): Any = unwrap(this).getAmazonMskCluster()

      /**
       * Details of an Amazon VPC which has network connectivity to the Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-kafkacluster.html#cfn-msk-replicator-kafkacluster-vpcconfig)
       */
      override fun vpcConfig(): Any = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty):
          KafkaClusterProperty = CdkObjectWrappers.wrap(cdkObject) as? KafkaClusterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty
    }
  }

  /**
   * Specifies configuration for replication between a source and target Kafka cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
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
   * .startingPosition(ReplicationStartingPositionProperty.builder()
   * .type("type")
   * .build())
   * .topicsToExclude(List.of("topicsToExclude"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html)
   */
  public interface ReplicationInfoProperty {
    /**
     * Configuration relating to consumer group replication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-consumergroupreplication)
     */
    public fun consumerGroupReplication(): Any

    /**
     * Amazon Resource Name of the source Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-sourcekafkaclusterarn)
     */
    public fun sourceKafkaClusterArn(): String

    /**
     * The type of compression to use writing records to target Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-targetcompressiontype)
     */
    public fun targetCompressionType(): String

    /**
     * Amazon Resource Name of the target Kafka cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-targetkafkaclusterarn)
     */
    public fun targetKafkaClusterArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-topicreplication)
     */
    public fun topicReplication(): Any

    /**
     * A builder for [ReplicationInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      public fun consumerGroupReplication(consumerGroupReplication: IResolvable)

      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty)

      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit)

      /**
       * @param sourceKafkaClusterArn Amazon Resource Name of the source Kafka cluster. 
       */
      public fun sourceKafkaClusterArn(sourceKafkaClusterArn: String)

      /**
       * @param targetCompressionType The type of compression to use writing records to target Kafka
       * cluster. 
       */
      public fun targetCompressionType(targetCompressionType: String)

      /**
       * @param targetKafkaClusterArn Amazon Resource Name of the target Kafka cluster. 
       */
      public fun targetKafkaClusterArn(targetKafkaClusterArn: String)

      /**
       * @param topicReplication the value to be set. 
       */
      public fun topicReplication(topicReplication: IResolvable)

      /**
       * @param topicReplication the value to be set. 
       */
      public fun topicReplication(topicReplication: TopicReplicationProperty)

      /**
       * @param topicReplication the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      public fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.builder()

      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      override fun consumerGroupReplication(consumerGroupReplication: IResolvable) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(IResolvable::unwrap))
      }

      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(ConsumerGroupReplicationProperty::unwrap))
      }

      /**
       * @param consumerGroupReplication Configuration relating to consumer group replication. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit):
          Unit =
          consumerGroupReplication(ConsumerGroupReplicationProperty(consumerGroupReplication))

      /**
       * @param sourceKafkaClusterArn Amazon Resource Name of the source Kafka cluster. 
       */
      override fun sourceKafkaClusterArn(sourceKafkaClusterArn: String) {
        cdkBuilder.sourceKafkaClusterArn(sourceKafkaClusterArn)
      }

      /**
       * @param targetCompressionType The type of compression to use writing records to target Kafka
       * cluster. 
       */
      override fun targetCompressionType(targetCompressionType: String) {
        cdkBuilder.targetCompressionType(targetCompressionType)
      }

      /**
       * @param targetKafkaClusterArn Amazon Resource Name of the target Kafka cluster. 
       */
      override fun targetKafkaClusterArn(targetKafkaClusterArn: String) {
        cdkBuilder.targetKafkaClusterArn(targetKafkaClusterArn)
      }

      /**
       * @param topicReplication the value to be set. 
       */
      override fun topicReplication(topicReplication: IResolvable) {
        cdkBuilder.topicReplication(topicReplication.let(IResolvable::unwrap))
      }

      /**
       * @param topicReplication the value to be set. 
       */
      override fun topicReplication(topicReplication: TopicReplicationProperty) {
        cdkBuilder.topicReplication(topicReplication.let(TopicReplicationProperty::unwrap))
      }

      /**
       * @param topicReplication the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      override fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit):
          Unit = topicReplication(TopicReplicationProperty(topicReplication))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty,
    ) : CdkObject(cdkObject), ReplicationInfoProperty {
      /**
       * Configuration relating to consumer group replication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-consumergroupreplication)
       */
      override fun consumerGroupReplication(): Any = unwrap(this).getConsumerGroupReplication()

      /**
       * Amazon Resource Name of the source Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-sourcekafkaclusterarn)
       */
      override fun sourceKafkaClusterArn(): String = unwrap(this).getSourceKafkaClusterArn()

      /**
       * The type of compression to use writing records to target Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-targetcompressiontype)
       */
      override fun targetCompressionType(): String = unwrap(this).getTargetCompressionType()

      /**
       * Amazon Resource Name of the target Kafka cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-targetkafkaclusterarn)
       */
      override fun targetKafkaClusterArn(): String = unwrap(this).getTargetKafkaClusterArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationinfo.html#cfn-msk-replicator-replicationinfo-topicreplication)
       */
      override fun topicReplication(): Any = unwrap(this).getTopicReplication()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty):
          ReplicationInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ReplicationInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationInfoProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty
    }
  }

  /**
   * Configuration for specifying the position in the topics to start replicating from.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * ReplicationStartingPositionProperty replicationStartingPositionProperty =
   * ReplicationStartingPositionProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationstartingposition.html)
   */
  public interface ReplicationStartingPositionProperty {
    /**
     * The type of replication starting position.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationstartingposition.html#cfn-msk-replicator-replicationstartingposition-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ReplicationStartingPositionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of replication starting position.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty.builder()

      /**
       * @param type The type of replication starting position.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty,
    ) : CdkObject(cdkObject), ReplicationStartingPositionProperty {
      /**
       * The type of replication starting position.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-replicationstartingposition.html#cfn-msk-replicator-replicationstartingposition-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplicationStartingPositionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty):
          ReplicationStartingPositionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationStartingPositionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationStartingPositionProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationStartingPositionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.msk.*;
   * TopicReplicationProperty topicReplicationProperty = TopicReplicationProperty.builder()
   * .topicsToReplicate(List.of("topicsToReplicate"))
   * // the properties below are optional
   * .copyAccessControlListsForTopics(false)
   * .copyTopicConfigurations(false)
   * .detectAndCopyNewTopics(false)
   * .startingPosition(ReplicationStartingPositionProperty.builder()
   * .type("type")
   * .build())
   * .topicsToExclude(List.of("topicsToExclude"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html)
   */
  public interface TopicReplicationProperty {
    /**
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream
     * topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-copyaccesscontrollistsfortopics)
     */
    public fun copyAccessControlListsForTopics(): Any? =
        unwrap(this).getCopyAccessControlListsForTopics()

    /**
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-copytopicconfigurations)
     */
    public fun copyTopicConfigurations(): Any? = unwrap(this).getCopyTopicConfigurations()

    /**
     * Whether to periodically check for new topics and partitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-detectandcopynewtopics)
     */
    public fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

    /**
     * Configuration for specifying the position in the topics to start replicating from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-startingposition)
     */
    public fun startingPosition(): Any? = unwrap(this).getStartingPosition()

    /**
     * List of regular expression patterns indicating the topics that should not be replicated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-topicstoexclude)
     */
    public fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?: emptyList()

    /**
     * List of regular expression patterns indicating the topics to copy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-topicstoreplicate)
     */
    public fun topicsToReplicate(): List<String>

    /**
     * A builder for [TopicReplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs
       * to match their corresponding upstream topics.
       */
      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean)

      /**
       * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs
       * to match their corresponding upstream topics.
       */
      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable)

      /**
       * @param copyTopicConfigurations Whether to periodically configure remote topics to match
       * their corresponding upstream topics.
       */
      public fun copyTopicConfigurations(copyTopicConfigurations: Boolean)

      /**
       * @param copyTopicConfigurations Whether to periodically configure remote topics to match
       * their corresponding upstream topics.
       */
      public fun copyTopicConfigurations(copyTopicConfigurations: IResolvable)

      /**
       * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
       */
      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean)

      /**
       * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
       */
      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable)

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      public fun startingPosition(startingPosition: IResolvable)

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      public fun startingPosition(startingPosition: ReplicationStartingPositionProperty)

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b216c9fb6cd3c2d96380696c26c913ca537b6a0175cb86fa24f15fddcce2b9d6")
      public
          fun startingPosition(startingPosition: ReplicationStartingPositionProperty.Builder.() -> Unit)

      /**
       * @param topicsToExclude List of regular expression patterns indicating the topics that
       * should not be replicated.
       */
      public fun topicsToExclude(topicsToExclude: List<String>)

      /**
       * @param topicsToExclude List of regular expression patterns indicating the topics that
       * should not be replicated.
       */
      public fun topicsToExclude(vararg topicsToExclude: String)

      /**
       * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
       * 
       */
      public fun topicsToReplicate(topicsToReplicate: List<String>)

      /**
       * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
       * 
       */
      public fun topicsToReplicate(vararg topicsToReplicate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.builder()

      /**
       * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs
       * to match their corresponding upstream topics.
       */
      override fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics)
      }

      /**
       * @param copyAccessControlListsForTopics Whether to periodically configure remote topic ACLs
       * to match their corresponding upstream topics.
       */
      override fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics.let(IResolvable::unwrap))
      }

      /**
       * @param copyTopicConfigurations Whether to periodically configure remote topics to match
       * their corresponding upstream topics.
       */
      override fun copyTopicConfigurations(copyTopicConfigurations: Boolean) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations)
      }

      /**
       * @param copyTopicConfigurations Whether to periodically configure remote topics to match
       * their corresponding upstream topics.
       */
      override fun copyTopicConfigurations(copyTopicConfigurations: IResolvable) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
       */
      override fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics)
      }

      /**
       * @param detectAndCopyNewTopics Whether to periodically check for new topics and partitions.
       */
      override fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics.let(IResolvable::unwrap))
      }

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      override fun startingPosition(startingPosition: IResolvable) {
        cdkBuilder.startingPosition(startingPosition.let(IResolvable::unwrap))
      }

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      override fun startingPosition(startingPosition: ReplicationStartingPositionProperty) {
        cdkBuilder.startingPosition(startingPosition.let(ReplicationStartingPositionProperty::unwrap))
      }

      /**
       * @param startingPosition Configuration for specifying the position in the topics to start
       * replicating from.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b216c9fb6cd3c2d96380696c26c913ca537b6a0175cb86fa24f15fddcce2b9d6")
      override
          fun startingPosition(startingPosition: ReplicationStartingPositionProperty.Builder.() -> Unit):
          Unit = startingPosition(ReplicationStartingPositionProperty(startingPosition))

      /**
       * @param topicsToExclude List of regular expression patterns indicating the topics that
       * should not be replicated.
       */
      override fun topicsToExclude(topicsToExclude: List<String>) {
        cdkBuilder.topicsToExclude(topicsToExclude)
      }

      /**
       * @param topicsToExclude List of regular expression patterns indicating the topics that
       * should not be replicated.
       */
      override fun topicsToExclude(vararg topicsToExclude: String): Unit =
          topicsToExclude(topicsToExclude.toList())

      /**
       * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
       * 
       */
      override fun topicsToReplicate(topicsToReplicate: List<String>) {
        cdkBuilder.topicsToReplicate(topicsToReplicate)
      }

      /**
       * @param topicsToReplicate List of regular expression patterns indicating the topics to copy.
       * 
       */
      override fun topicsToReplicate(vararg topicsToReplicate: String): Unit =
          topicsToReplicate(topicsToReplicate.toList())

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty,
    ) : CdkObject(cdkObject), TopicReplicationProperty {
      /**
       * Whether to periodically configure remote topic ACLs to match their corresponding upstream
       * topics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-copyaccesscontrollistsfortopics)
       */
      override fun copyAccessControlListsForTopics(): Any? =
          unwrap(this).getCopyAccessControlListsForTopics()

      /**
       * Whether to periodically configure remote topics to match their corresponding upstream
       * topics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-copytopicconfigurations)
       */
      override fun copyTopicConfigurations(): Any? = unwrap(this).getCopyTopicConfigurations()

      /**
       * Whether to periodically check for new topics and partitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-detectandcopynewtopics)
       */
      override fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

      /**
       * Configuration for specifying the position in the topics to start replicating from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-startingposition)
       */
      override fun startingPosition(): Any? = unwrap(this).getStartingPosition()

      /**
       * List of regular expression patterns indicating the topics that should not be replicated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-topicstoexclude)
       */
      override fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?:
          emptyList()

      /**
       * List of regular expression patterns indicating the topics to copy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-replicator-topicreplication.html#cfn-msk-replicator-topicreplication-topicstoreplicate)
       */
      override fun topicsToReplicate(): List<String> = unwrap(this).getTopicsToReplicate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty):
          TopicReplicationProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicReplicationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty
    }
  }
}
