package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.msk.CfnReplicator,
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

  public open fun replicationInfoList(): Any = unwrap(this).getReplicationInfoList()

  public open fun replicationInfoList(`value`: IResolvable) {
    unwrap(this).setReplicationInfoList(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationInfoList(__idx_ac66f0: List<Any>) {
    unwrap(this).setReplicationInfoList(__idx_ac66f0)
  }

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

  public interface Builder {
    public fun currentVersion(currentVersion: String) {
    }

    public fun description(description: String) {
    }

    public fun kafkaClusters(kafkaClusters: IResolvable) {
    }

    public fun kafkaClusters(kafkaClusters: List<Any>) {
    }

    public fun replicationInfoList(replicationInfoList: IResolvable) {
    }

    public fun replicationInfoList(replicationInfoList: List<Any>) {
    }

    public fun replicatorName(replicatorName: String) {
    }

    public fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnReplicator.Builder =
        software.amazon.awscdk.services.msk.CfnReplicator.Builder.create(scope, id)

    public override fun currentVersion(currentVersion: String) {
      cdkBuilder.currentVersion(currentVersion)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun kafkaClusters(kafkaClusters: IResolvable) {
      cdkBuilder.kafkaClusters(kafkaClusters.let(IResolvable::unwrap))
    }

    public override fun kafkaClusters(kafkaClusters: List<Any>) {
      cdkBuilder.kafkaClusters(kafkaClusters)
    }

    public override fun replicationInfoList(replicationInfoList: IResolvable) {
      cdkBuilder.replicationInfoList(replicationInfoList.let(IResolvable::unwrap))
    }

    public override fun replicationInfoList(replicationInfoList: List<Any>) {
      cdkBuilder.replicationInfoList(replicationInfoList)
    }

    public override fun replicatorName(replicatorName: String) {
      cdkBuilder.replicatorName(replicatorName)
    }

    public override fun serviceExecutionRoleArn(serviceExecutionRoleArn: String) {
      cdkBuilder.serviceExecutionRoleArn(serviceExecutionRoleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnReplicator = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun mskClusterArn(mskClusterArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty.builder()

      public override fun mskClusterArn(mskClusterArn: String) {
        cdkBuilder.mskClusterArn(mskClusterArn)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty,
    ) : AmazonMskClusterProperty {
      public override fun mskClusterArn(): String = unwrap(this).getMskClusterArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AmazonMskClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty):
          AmazonMskClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonMskClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.AmazonMskClusterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicReplicationProperty {
    public fun copyAccessControlListsForTopics(): Any? =
        unwrap(this).getCopyAccessControlListsForTopics()

    public fun copyTopicConfigurations(): Any? = unwrap(this).getCopyTopicConfigurations()

    public fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

    public fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?: emptyList()

    public fun topicsToReplicate(): List<String>

    public interface Builder {
      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean) {
      }

      public fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable) {
      }

      public fun copyTopicConfigurations(copyTopicConfigurations: Boolean) {
      }

      public fun copyTopicConfigurations(copyTopicConfigurations: IResolvable) {
      }

      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean) {
      }

      public fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable) {
      }

      public fun topicsToExclude(topicsToExclude: List<String>) {
      }

      public fun topicsToReplicate(topicsToReplicate: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty.builder()

      public override
          fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: Boolean) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics)
      }

      public override
          fun copyAccessControlListsForTopics(copyAccessControlListsForTopics: IResolvable) {
        cdkBuilder.copyAccessControlListsForTopics(copyAccessControlListsForTopics.let(IResolvable::unwrap))
      }

      public override fun copyTopicConfigurations(copyTopicConfigurations: Boolean) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations)
      }

      public override fun copyTopicConfigurations(copyTopicConfigurations: IResolvable) {
        cdkBuilder.copyTopicConfigurations(copyTopicConfigurations.let(IResolvable::unwrap))
      }

      public override fun detectAndCopyNewTopics(detectAndCopyNewTopics: Boolean) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics)
      }

      public override fun detectAndCopyNewTopics(detectAndCopyNewTopics: IResolvable) {
        cdkBuilder.detectAndCopyNewTopics(detectAndCopyNewTopics.let(IResolvable::unwrap))
      }

      public override fun topicsToExclude(topicsToExclude: List<String>) {
        cdkBuilder.topicsToExclude(topicsToExclude)
      }

      public override fun topicsToReplicate(topicsToReplicate: List<String>) {
        cdkBuilder.topicsToReplicate(topicsToReplicate)
      }

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty,
    ) : TopicReplicationProperty {
      public override fun copyAccessControlListsForTopics(): Any? =
          unwrap(this).getCopyAccessControlListsForTopics()

      public override fun copyTopicConfigurations(): Any? =
          unwrap(this).getCopyTopicConfigurations()

      public override fun detectAndCopyNewTopics(): Any? = unwrap(this).getDetectAndCopyNewTopics()

      public override fun topicsToExclude(): List<String> = unwrap(this).getTopicsToExclude() ?:
          emptyList()

      public override fun topicsToReplicate(): List<String> = unwrap(this).getTopicsToReplicate() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty):
          TopicReplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.TopicReplicationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KafkaClusterClientVpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterClientVpcConfigProperty,
    ) : KafkaClusterClientVpcConfigProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KafkaClusterProperty {
    public fun amazonMskCluster(): Any

    public fun vpcConfig(): Any

    public interface Builder {
      public fun amazonMskCluster(amazonMskCluster: IResolvable) {
      }

      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      public fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit) {
      }

      public fun vpcConfig(vpcConfig: IResolvable) {
      }

      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      public fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty.builder()

      public override fun amazonMskCluster(amazonMskCluster: IResolvable) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(IResolvable::unwrap))
      }

      public override fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty) {
        cdkBuilder.amazonMskCluster(amazonMskCluster.let(AmazonMskClusterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda93ffc922370d5d74a50c420b24e226789fea4da484ef0c991e73974b1ce90")
      public override
          fun amazonMskCluster(amazonMskCluster: AmazonMskClusterProperty.Builder.() -> Unit): Unit
          = amazonMskCluster(AmazonMskClusterProperty(amazonMskCluster))

      public override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      public override fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(KafkaClusterClientVpcConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("971c41287b8b9b103a2fd7f3b3412307fa940f7bd71dd3482fcf4ea230d661f3")
      public override
          fun vpcConfig(vpcConfig: KafkaClusterClientVpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(KafkaClusterClientVpcConfigProperty(vpcConfig))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty,
    ) : KafkaClusterProperty {
      public override fun amazonMskCluster(): Any = unwrap(this).getAmazonMskCluster()

      public override fun vpcConfig(): Any = unwrap(this).getVpcConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KafkaClusterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty):
          KafkaClusterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KafkaClusterProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.KafkaClusterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReplicationInfoProperty {
    public fun consumerGroupReplication(): Any

    public fun sourceKafkaClusterArn(): String

    public fun targetCompressionType(): String

    public fun targetKafkaClusterArn(): String

    public fun topicReplication(): Any

    public interface Builder {
      public fun consumerGroupReplication(consumerGroupReplication: IResolvable) {
      }

      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      public
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit) {
      }

      public fun sourceKafkaClusterArn(sourceKafkaClusterArn: String) {
      }

      public fun targetCompressionType(targetCompressionType: String) {
      }

      public fun targetKafkaClusterArn(targetKafkaClusterArn: String) {
      }

      public fun topicReplication(topicReplication: IResolvable) {
      }

      public fun topicReplication(topicReplication: TopicReplicationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      public fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.Builder =
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty.builder()

      public override fun consumerGroupReplication(consumerGroupReplication: IResolvable) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(IResolvable::unwrap))
      }

      public override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty) {
        cdkBuilder.consumerGroupReplication(consumerGroupReplication.let(ConsumerGroupReplicationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05f5479a672384c88e01c1a13642595a239ae9daed947beb969d960f09acab00")
      public override
          fun consumerGroupReplication(consumerGroupReplication: ConsumerGroupReplicationProperty.Builder.() -> Unit):
          Unit =
          consumerGroupReplication(ConsumerGroupReplicationProperty(consumerGroupReplication))

      public override fun sourceKafkaClusterArn(sourceKafkaClusterArn: String) {
        cdkBuilder.sourceKafkaClusterArn(sourceKafkaClusterArn)
      }

      public override fun targetCompressionType(targetCompressionType: String) {
        cdkBuilder.targetCompressionType(targetCompressionType)
      }

      public override fun targetKafkaClusterArn(targetKafkaClusterArn: String) {
        cdkBuilder.targetKafkaClusterArn(targetKafkaClusterArn)
      }

      public override fun topicReplication(topicReplication: IResolvable) {
        cdkBuilder.topicReplication(topicReplication.let(IResolvable::unwrap))
      }

      public override fun topicReplication(topicReplication: TopicReplicationProperty) {
        cdkBuilder.topicReplication(topicReplication.let(TopicReplicationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b4ee2bf42bc2bd82f557b0d4373d457139166eb17a251e2f001dc2ab5ced9364")
      public override
          fun topicReplication(topicReplication: TopicReplicationProperty.Builder.() -> Unit): Unit
          = topicReplication(TopicReplicationProperty(topicReplication))

      public fun build(): software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty,
    ) : ReplicationInfoProperty {
      public override fun consumerGroupReplication(): Any =
          unwrap(this).getConsumerGroupReplication()

      public override fun sourceKafkaClusterArn(): String = unwrap(this).getSourceKafkaClusterArn()

      public override fun targetCompressionType(): String = unwrap(this).getTargetCompressionType()

      public override fun targetKafkaClusterArn(): String = unwrap(this).getTargetKafkaClusterArn()

      public override fun topicReplication(): Any = unwrap(this).getTopicReplication()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty):
          ReplicationInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationInfoProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ReplicationInfoProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>) {
      }

      public fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>) {
      }

      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean) {
      }

      public fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable) {
      }

      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean) {
      }

      public fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.Builder
          =
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty.builder()

      public override fun consumerGroupsToExclude(consumerGroupsToExclude: List<String>) {
        cdkBuilder.consumerGroupsToExclude(consumerGroupsToExclude)
      }

      public override fun consumerGroupsToReplicate(consumerGroupsToReplicate: List<String>) {
        cdkBuilder.consumerGroupsToReplicate(consumerGroupsToReplicate)
      }

      public override fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: Boolean) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups)
      }

      public override
          fun detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups: IResolvable) {
        cdkBuilder.detectAndCopyNewConsumerGroups(detectAndCopyNewConsumerGroups.let(IResolvable::unwrap))
      }

      public override
          fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: Boolean) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets)
      }

      public override
          fun synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets: IResolvable) {
        cdkBuilder.synchroniseConsumerGroupOffsets(synchroniseConsumerGroupOffsets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty,
    ) : ConsumerGroupReplicationProperty {
      public override fun consumerGroupsToExclude(): List<String> =
          unwrap(this).getConsumerGroupsToExclude() ?: emptyList()

      public override fun consumerGroupsToReplicate(): List<String> =
          unwrap(this).getConsumerGroupsToReplicate() ?: emptyList()

      public override fun detectAndCopyNewConsumerGroups(): Any? =
          unwrap(this).getDetectAndCopyNewConsumerGroups()

      public override fun synchroniseConsumerGroupOffsets(): Any? =
          unwrap(this).getSynchroniseConsumerGroupOffsets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConsumerGroupReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty):
          ConsumerGroupReplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsumerGroupReplicationProperty):
          software.amazon.awscdk.services.msk.CfnReplicator.ConsumerGroupReplicationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
