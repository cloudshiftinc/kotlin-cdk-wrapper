@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TableOptions : SchemaOptions {
  public fun billingMode(): BillingMode? = unwrap(this).getBillingMode()?.let(BillingMode::wrap)

  public fun contributorInsightsEnabled(): Boolean? = unwrap(this).getContributorInsightsEnabled()

  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  public fun encryption(): TableEncryption? =
      unwrap(this).getEncryption()?.let(TableEncryption::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun importSource(): ImportSourceSpecification? =
      unwrap(this).getImportSource()?.let(ImportSourceSpecification::wrap)

  public fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

  public fun readCapacity(): Number? = unwrap(this).getReadCapacity()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun replicationRegions(): List<String> = unwrap(this).getReplicationRegions() ?:
      emptyList()

  public fun replicationTimeout(): Duration? =
      unwrap(this).getReplicationTimeout()?.let(Duration::wrap)

  public fun stream(): StreamViewType? = unwrap(this).getStream()?.let(StreamViewType::wrap)

  public fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

  public fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()

  public fun waitForReplicationToFinish(): Boolean? = unwrap(this).getWaitForReplicationToFinish()

  public fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()

  @CdkDslMarker
  public interface Builder {
    public fun billingMode(billingMode: BillingMode)

    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun encryption(encryption: TableEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun importSource(importSource: ImportSourceSpecification)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b5a193033e54be623552e1517771253e336b6b48c749a3321b6da6737850e19")
    public fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit)

    public fun partitionKey(partitionKey: Attribute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31195377ec6f837eb4c33bf17408c97e4be3240e6b715a13f257a349df6ee3d")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    public fun readCapacity(readCapacity: Number)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun replicationRegions(replicationRegions: List<String>)

    public fun replicationRegions(vararg replicationRegions: String)

    public fun replicationTimeout(replicationTimeout: Duration)

    public fun sortKey(sortKey: Attribute)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9378946440963ef30f3dd6f5cc07deafb7ad97dfcccb381e0154d7e279efd1c")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    public fun stream(stream: StreamViewType)

    public fun tableClass(tableClass: TableClass)

    public fun timeToLiveAttribute(timeToLiveAttribute: String)

    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean)

    public fun writeCapacity(writeCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableOptions.Builder =
        software.amazon.awscdk.services.dynamodb.TableOptions.builder()

    override fun billingMode(billingMode: BillingMode) {
      cdkBuilder.billingMode(billingMode.let(BillingMode::unwrap))
    }

    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun encryption(encryption: TableEncryption) {
      cdkBuilder.encryption(encryption.let(TableEncryption::unwrap))
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun importSource(importSource: ImportSourceSpecification) {
      cdkBuilder.importSource(importSource.let(ImportSourceSpecification::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b5a193033e54be623552e1517771253e336b6b48c749a3321b6da6737850e19")
    override fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit): Unit =
        importSource(ImportSourceSpecification(importSource))

    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31195377ec6f837eb4c33bf17408c97e4be3240e6b715a13f257a349df6ee3d")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    override fun readCapacity(readCapacity: Number) {
      cdkBuilder.readCapacity(readCapacity)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun replicationRegions(replicationRegions: List<String>) {
      cdkBuilder.replicationRegions(replicationRegions)
    }

    override fun replicationRegions(vararg replicationRegions: String): Unit =
        replicationRegions(replicationRegions.toList())

    override fun replicationTimeout(replicationTimeout: Duration) {
      cdkBuilder.replicationTimeout(replicationTimeout.let(Duration::unwrap))
    }

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9378946440963ef30f3dd6f5cc07deafb7ad97dfcccb381e0154d7e279efd1c")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    override fun stream(stream: StreamViewType) {
      cdkBuilder.stream(stream.let(StreamViewType::unwrap))
    }

    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    override fun timeToLiveAttribute(timeToLiveAttribute: String) {
      cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    override fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
      cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
    }

    override fun writeCapacity(writeCapacity: Number) {
      cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.TableOptions,
  ) : CdkObject(cdkObject), TableOptions {
    override fun billingMode(): BillingMode? = unwrap(this).getBillingMode()?.let(BillingMode::wrap)

    override fun contributorInsightsEnabled(): Boolean? =
        unwrap(this).getContributorInsightsEnabled()

    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    override fun encryption(): TableEncryption? =
        unwrap(this).getEncryption()?.let(TableEncryption::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun importSource(): ImportSourceSpecification? =
        unwrap(this).getImportSource()?.let(ImportSourceSpecification::wrap)

    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    override fun readCapacity(): Number? = unwrap(this).getReadCapacity()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun replicationRegions(): List<String> = unwrap(this).getReplicationRegions() ?:
        emptyList()

    override fun replicationTimeout(): Duration? =
        unwrap(this).getReplicationTimeout()?.let(Duration::wrap)

    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    override fun stream(): StreamViewType? = unwrap(this).getStream()?.let(StreamViewType::wrap)

    override fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

    override fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()

    override fun waitForReplicationToFinish(): Boolean? =
        unwrap(this).getWaitForReplicationToFinish()

    override fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableOptions):
        TableOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableOptions):
        software.amazon.awscdk.services.dynamodb.TableOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.TableOptions
  }
}
