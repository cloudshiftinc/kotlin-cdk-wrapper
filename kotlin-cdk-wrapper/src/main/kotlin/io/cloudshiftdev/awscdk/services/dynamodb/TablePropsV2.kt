@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TablePropsV2 : TableOptionsV2 {
  public fun billing(): Billing? = unwrap(this).getBilling()?.let(Billing::wrap)

  public fun dynamoStream(): StreamViewType? =
      unwrap(this).getDynamoStream()?.let(StreamViewType::wrap)

  public fun encryption(): TableEncryptionV2? =
      unwrap(this).getEncryption()?.let(TableEncryptionV2::wrap)

  public fun globalSecondaryIndexes(): List<GlobalSecondaryIndexPropsV2> =
      unwrap(this).getGlobalSecondaryIndexes()?.map(GlobalSecondaryIndexPropsV2::wrap) ?:
      emptyList()

  public fun localSecondaryIndexes(): List<LocalSecondaryIndexProps> =
      unwrap(this).getLocalSecondaryIndexes()?.map(LocalSecondaryIndexProps::wrap) ?: emptyList()

  public fun partitionKey(): Attribute

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun replicas(): List<ReplicaTableProps> =
      unwrap(this).getReplicas()?.map(ReplicaTableProps::wrap) ?: emptyList()

  public fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

  public fun tableName(): String? = unwrap(this).getTableName()

  public fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()

  @CdkDslMarker
  public interface Builder {
    public fun billing(billing: Billing)

    public fun contributorInsights(contributorInsights: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun dynamoStream(dynamoStream: StreamViewType)

    public fun encryption(encryption: TableEncryptionV2)

    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<GlobalSecondaryIndexPropsV2>)

    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: GlobalSecondaryIndexPropsV2)

    public fun kinesisStream(kinesisStream: IStream)

    public fun localSecondaryIndexes(localSecondaryIndexes: List<LocalSecondaryIndexProps>)

    public fun localSecondaryIndexes(vararg localSecondaryIndexes: LocalSecondaryIndexProps)

    public fun partitionKey(partitionKey: Attribute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("746aa2a75d8e291e9f9388498d8ffa585e49fc106f57258ffb6a4867044fb8ba")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun replicas(replicas: List<ReplicaTableProps>)

    public fun replicas(vararg replicas: ReplicaTableProps)

    public fun sortKey(sortKey: Attribute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14ce5fb3980aa792aa09fc6ca3f5c55b5b61c0b0556fb4d66902ed0d8fb41b9a")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    public fun tableClass(tableClass: TableClass)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeToLiveAttribute(timeToLiveAttribute: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TablePropsV2.Builder =
        software.amazon.awscdk.services.dynamodb.TablePropsV2.builder()

    override fun billing(billing: Billing) {
      cdkBuilder.billing(billing.let(Billing::unwrap))
    }

    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun dynamoStream(dynamoStream: StreamViewType) {
      cdkBuilder.dynamoStream(dynamoStream.let(StreamViewType::unwrap))
    }

    override fun encryption(encryption: TableEncryptionV2) {
      cdkBuilder.encryption(encryption.let(TableEncryptionV2::unwrap))
    }

    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<GlobalSecondaryIndexPropsV2>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.map(GlobalSecondaryIndexPropsV2::unwrap))
    }

    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: GlobalSecondaryIndexPropsV2):
        Unit = globalSecondaryIndexes(globalSecondaryIndexes.toList())

    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    override fun localSecondaryIndexes(localSecondaryIndexes: List<LocalSecondaryIndexProps>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.map(LocalSecondaryIndexProps::unwrap))
    }

    override fun localSecondaryIndexes(vararg localSecondaryIndexes: LocalSecondaryIndexProps): Unit
        = localSecondaryIndexes(localSecondaryIndexes.toList())

    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("746aa2a75d8e291e9f9388498d8ffa585e49fc106f57258ffb6a4867044fb8ba")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun replicas(replicas: List<ReplicaTableProps>) {
      cdkBuilder.replicas(replicas.map(ReplicaTableProps::unwrap))
    }

    override fun replicas(vararg replicas: ReplicaTableProps): Unit = replicas(replicas.toList())

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14ce5fb3980aa792aa09fc6ca3f5c55b5b61c0b0556fb4d66902ed0d8fb41b9a")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeToLiveAttribute(timeToLiveAttribute: String) {
      cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TablePropsV2 = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.TablePropsV2,
  ) : CdkObject(cdkObject), TablePropsV2 {
    override fun billing(): Billing? = unwrap(this).getBilling()?.let(Billing::wrap)

    override fun contributorInsights(): Boolean? = unwrap(this).getContributorInsights()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun dynamoStream(): StreamViewType? =
        unwrap(this).getDynamoStream()?.let(StreamViewType::wrap)

    override fun encryption(): TableEncryptionV2? =
        unwrap(this).getEncryption()?.let(TableEncryptionV2::wrap)

    override fun globalSecondaryIndexes(): List<GlobalSecondaryIndexPropsV2> =
        unwrap(this).getGlobalSecondaryIndexes()?.map(GlobalSecondaryIndexPropsV2::wrap) ?:
        emptyList()

    override fun kinesisStream(): IStream? = unwrap(this).getKinesisStream()?.let(IStream::wrap)

    override fun localSecondaryIndexes(): List<LocalSecondaryIndexProps> =
        unwrap(this).getLocalSecondaryIndexes()?.map(LocalSecondaryIndexProps::wrap) ?: emptyList()

    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun replicas(): List<ReplicaTableProps> =
        unwrap(this).getReplicas()?.map(ReplicaTableProps::wrap) ?: emptyList()

    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    override fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

    override fun tableName(): String? = unwrap(this).getTableName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TablePropsV2 {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TablePropsV2):
        TablePropsV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TablePropsV2):
        software.amazon.awscdk.services.dynamodb.TablePropsV2 = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.TablePropsV2
  }
}
