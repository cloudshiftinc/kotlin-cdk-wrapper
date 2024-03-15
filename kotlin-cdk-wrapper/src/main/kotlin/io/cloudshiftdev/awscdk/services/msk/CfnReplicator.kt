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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.msk.CfnReplicator,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrReplicatorArn(): String = unwrap(this).getAttrReplicatorArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun currentVersion(): String? = unwrap(this).getCurrentVersion()

  public open fun currentVersion(`value`: String) {
    unwrap(this).setCurrentVersion(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kafkaClusters(): Any = unwrap(this).getKafkaClusters()

  public open fun kafkaClusters(`value`: IResolvable) {
    unwrap(this).setKafkaClusters(`value`.let(IResolvable::unwrap))
  }

  public open fun kafkaClusters(__idx_ac66f0: List<Any>) {
    unwrap(this).setKafkaClusters(__idx_ac66f0)
  }

  public open fun kafkaClusters(vararg __idx_ac66f0: Any): Unit =
      kafkaClusters(__idx_ac66f0.toList())

  public open fun replicationInfoList(): Any = unwrap(this).getReplicationInfoList()

  public open fun replicationInfoList(`value`: IResolvable) {
    unwrap(this).setReplicationInfoList(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationInfoList(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicationInfoList(__idx_ac66f0)
  }

  public open fun replicationInfoList(vararg __idx_ac66f0: Any): Unit =
      replicationInfoList(__idx_ac66f0.toList())

  public open fun replicatorName(): String = unwrap(this).getReplicatorName()

  public open fun replicatorName(`value`: String) {
    unwrap(this).setReplicatorName(`value`)
  }

  public open fun serviceExecutionRoleArn(): String = unwrap(this).getServiceExecutionRoleArn()

  public open fun serviceExecutionRoleArn(`value`: String) {
    unwrap(this).setServiceExecutionRoleArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun currentVersion(currentVersion: String)

    public fun description(description: String)

    public fun kafkaClusters(kafkaClusters: IResolvable)

    public fun kafkaClusters(kafkaClusters: List<Any>)

    public fun kafkaClusters(vararg kafkaClusters: Any)

    public fun replicationInfoList(replicationInfoList: IResolvable)

    public fun replicationInfoList(replicationInfoList: List<Any>)

    public fun replicationInfoList(vararg replicationInfoList: Any)

    public fun replicatorName(replicatorName: String)

    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnReplicator.Builder =
        software.amazon.awscdk.services.msk.CfnReplicator.Builder.create(scope, id)

    override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kafkaClusters(kafkaClusters: IResolvable) {
      cdkBuilder.kafkaClusters(kafkaClusters.let(IResolvable::unwrap))
    }

    override fun kafkaClusters(kafkaClusters: List<Any>) {
      cdkBuilder.kafkaClusters(kafkaClusters)
    }

    override fun kafkaClusters(vararg kafkaClusters: Any): Unit =
        kafkaClusters(kafkaClusters.toList())

    override fun replicationInfoList(replicationInfoList: IResolvable) {
      cdkBuilder.replicationInfoList(replicationInfoList.let(IResolvable::unwrap))
    }

    override fun replicationInfoList(replicationInfoList: List<Any>) {
      cdkBuilder.replicationInfoList(replicationInfoList)
    }

    override fun replicationInfoList(vararg replicationInfoList: Any): Unit =
        replicationInfoList(replicationInfoList.toList())

    override fun replicatorName(replicatorName: String) {
      cdkBuilder.replicatorName(replicatorName)
    }

    override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
        wrapped.cdkObject
  }

  public interface AmazonMskClusterProperty {
    public fun mskClusterArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun mskClusterArn(mskClusterArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.builder()

      override fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty,
    ) : CdkObject(cdkObject), AmazonMskClusterProperty {
      override fun mskClusterArn(): String = unwrap(this).getMskClusterArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AmazonMskClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty):
          AmazonMskClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonMskClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty
    }
  }

  public interface TopicReplicationProperty {
    public fun copyAccessControlListsForTopics(): Any? =
        unwrap(this).getCopyAccessControlListsForTopics()

    public fun copyTopicConfigurations(): Any? = unwrap(this).getCopyTopicConfigurations()

    public fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

    public fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?: emptyList()

    public fun topicsToReplicate(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean)

      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable)

      public fun copyTopicConfigurations(copyTopicConfigurations: Boolean)

      public fun copyTopicConfigurations(copyTopicConfigurations: IResolvable)

      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean)

      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable)

      public fun topicsToExclude(topicsToExclude: List<String>)

      public fun topicsToExclude(vararg topicsToExclude: String)

      public fun topicsToReplicate(topicsToReplicate: List<String>)

      public fun topicsToReplicate(vararg topicsToReplicate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.builder()

      override fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics)
      }

      override fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics.let(IResolvable::unwrap))
      }

      override fun copyTopicConfigurations(copyTopicConfigurations: Boolean) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations)
      }

      override fun copyTopicConfigurations(copyTopicConfigurations: IResolvable) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations.let(IResolvable::unwrap))
      }

      override fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics)
      }

      override fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics.let(IResolvable::unwrap))
      }

      override fun topicsToExclude(topicsToExclude: List<String>) {
        cdkBuilder.topicsToExclude(topicsToExclude)
      }

      override fun topicsToExclude(vararg topicsToExclude: String): Unit =
          topicsToExclude(topicsToExclude.toList())

      override fun topicsToReplicate(topicsToReplicate: List<String>) {
        cdkBuilder.topicsToReplicate(topicsToReplicate)
      }

      override fun topicsToReplicate(vararg topicsToReplicate: String): Unit =
          topicsToReplicate(topicsToReplicate.toList())

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty,
    ) : CdkObject(cdkObject), TopicReplicationProperty {
      override fun copyAccessControlListsForTopics(): Any? =
          unwrap(this).getCopyAccessControlListsForTopics()

      override fun copyTopicConfigurations(): Any? = unwrap(this).getCopyTopicConfigurations()

      override fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

      override fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?:
          emptyList()

      override fun topicsToReplicate(): List<String> = unwrap(this).getTopicsToReplicate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty):
          TopicReplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty
    }
  }

  public interface KafkaClusterClientVpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty,
    ) : CdkObject(cdkObject), KafkaClusterClientVpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

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
          KafkaClusterClientVpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterClientVpcConfigProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty
    }
  }

  public interface KafkaClusterProperty {
    public fun amazonMskCluster(): Any

    public fun vpcConfig(): Any

    @CdkDslMarker
    public interface Builder {
      public fun amazonMskCluster(amazonMskCluster: IResolvable)

      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit)

      public fun vpcConfig(vpcConfig: IResolvable)

      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.builder()

      override fun amazonMskCluster(amazonMskCluster: IResolvable) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(IResolvable::unwrap))
      }

      override fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(AmazonMskClusterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      override fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit):
          Unit = amazonMskCluster(AmazonMskClusterProperty(amazonMskCluster))

      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      override fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(KafkaClusterClientVpcConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      override fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit):
          Unit = vpcConfig(KafkaClusterClientVpcConfigProperty(vpcConfig))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty,
    ) : CdkObject(cdkObject), KafkaClusterProperty {
      override fun amazonMskCluster(): Any = unwrap(this).getAmazonMskCluster()

      override fun vpcConfig(): Any = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty):
          KafkaClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty
    }
  }

  public interface ReplicationInfoProperty {
    public fun consumerGroupReplication(): Any

    public fun sourceKafkaClusterArn(): String

    public fun targetCompressionType(): String

    public fun targetKafkaClusterArn(): String

    public fun topicReplication(): Any

    @CdkDslMarker
    public interface Builder {
      public fun consumerGroupReplication(consumerGroupReplication: IResolvable)

      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit)

      public fun sourceKafkaClusterArn(sourceKafkaClusterArn: String)

      public fun targetCompressionType(targetCompressionType: String)

      public fun targetKafkaClusterArn(targetKafkaClusterArn: String)

      public fun topicReplication(topicReplication: IResolvable)

      public fun topicReplication(topicReplication: TopicReplicationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      public fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.builder()

      override fun consumerGroupReplication(consumerGroupReplication: IResolvable) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(IResolvable::unwrap))
      }

      override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(ConsumerGroupReplicationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit):
          Unit =
          consumerGroupReplication(ConsumerGroupReplicationProperty(consumerGroupReplication))

      override fun sourceKafkaClusterArn(sourceKafkaClusterArn: String) {
        cdkBuilder.sourceKafkaClusterArn(sourceKafkaClusterArn)
      }

      override fun targetCompressionType(targetCompressionType: String) {
        cdkBuilder.targetCompressionType(targetCompressionType)
      }

      override fun targetKafkaClusterArn(targetKafkaClusterArn: String) {
        cdkBuilder.targetKafkaClusterArn(targetKafkaClusterArn)
      }

      override fun topicReplication(topicReplication: IResolvable) {
        cdkBuilder.topicReplication(topicReplication.let(IResolvable::unwrap))
      }

      override fun topicReplication(topicReplication: TopicReplicationProperty) {
        cdkBuilder.topicReplication(topicReplication.let(TopicReplicationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      override fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit):
          Unit = topicReplication(TopicReplicationProperty(topicReplication))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty,
    ) : CdkObject(cdkObject), ReplicationInfoProperty {
      override fun consumerGroupReplication(): Any = unwrap(this).getConsumerGroupReplication()

      override fun sourceKafkaClusterArn(): String = unwrap(this).getSourceKafkaClusterArn()

      override fun targetCompressionType(): String = unwrap(this).getTargetCompressionType()

      override fun targetKafkaClusterArn(): String = unwrap(this).getTargetKafkaClusterArn()

      override fun topicReplication(): Any = unwrap(this).getTopicReplication()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty):
          ReplicationInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationInfoProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty
    }
  }

  public interface ConsumerGroupReplicationProperty {
    public fun consumerGroupsToExclude(): List<String> = unwrap(this).getConsumerGroupsToExclude()
        ?: emptyList()

    public fun consumerGroupsToReplicate(): List<String>

    public fun detectAndCopyNewConsumerGroups(): Any? =
        unwrap(this).getDetectAndCopyNewConsumerGroups()

    public fun synchroniseConsumerGroupOffsets(): Any? =
        unwrap(this).getSynchroniseConsumerGroupOffsets()

    @CdkDslMarker
    public interface Builder {
      public fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>)

      public fun consumerGroupsToExclude(vararg consumerGroupsToExclude: String)

      public fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>)

      public fun consumerGroupsToReplicate(vararg consumerGroupsToReplicate: String)

      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean)

      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable)

      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean)

      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.builder()

      override fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>) {
        cdkBuilder.consumerGroupsToExclude(consumerGroupsToExclude)
      }

      override fun consumerGroupsToExclude(vararg consumerGroupsToExclude: String): Unit =
          consumerGroupsToExclude(consumerGroupsToExclude.toList())

      override fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>) {
        cdkBuilder.consumerGroupsToReplicate(consumerGroupsToReplicate)
      }

      override fun consumerGroupsToReplicate(vararg consumerGroupsToReplicate: String): Unit =
          consumerGroupsToReplicate(consumerGroupsToReplicate.toList())

      override fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups)
      }

      override fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups.let(IResolvable::unwrap))
      }

      override fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets)
      }

      override fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty,
    ) : CdkObject(cdkObject), ConsumerGroupReplicationProperty {
      override fun consumerGroupsToExclude(): List<String> =
          unwrap(this).getConsumerGroupsToExclude() ?: emptyList()

      override fun consumerGroupsToReplicate(): List<String> =
          unwrap(this).getConsumerGroupsToReplicate()

      override fun detectAndCopyNewConsumerGroups(): Any? =
          unwrap(this).getDetectAndCopyNewConsumerGroups()

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
          ConsumerGroupReplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsumerGroupReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty
    }
  }
}
