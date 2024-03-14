package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Table internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.Table,
) : TableBase(cdkObject) {
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexProps) {
    unwrap(this).addGlobalSecondaryIndex(props.let(GlobalSecondaryIndexProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a29007f317200f09c22dd8ee35e2f15602715637a0d24ca11cf6b8264742a3f")
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexProps.Builder.() -> Unit): Unit
      = addGlobalSecondaryIndex(GlobalSecondaryIndexProps(props))

  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps) {
    unwrap(this).addLocalSecondaryIndex(props.let(LocalSecondaryIndexProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7142e3f823d9e48e8377acf13a8870674ffcae3b2bebcc19da6e0d90bb8889be")
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps.Builder.() -> Unit): Unit =
      addLocalSecondaryIndex(LocalSecondaryIndexProps(props))

  public open fun autoScaleGlobalSecondaryIndexReadCapacity(indexName: String,
      props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleGlobalSecondaryIndexReadCapacity(indexName,
      props.let(EnableScalingProps::unwrap)).let(IScalableTableAttribute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d87923174146be919555fedb7cccae8fc99f967ccb88c54fd7a55678de1c99ff")
  public open fun autoScaleGlobalSecondaryIndexReadCapacity(indexName: String,
      props: EnableScalingProps.Builder.() -> Unit): IScalableTableAttribute =
      autoScaleGlobalSecondaryIndexReadCapacity(indexName, EnableScalingProps(props))

  public open fun autoScaleGlobalSecondaryIndexWriteCapacity(indexName: String,
      props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleGlobalSecondaryIndexWriteCapacity(indexName,
      props.let(EnableScalingProps::unwrap)).let(IScalableTableAttribute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d132623ee542cd660831380fa7d113a5cb9ade74a62abec6b65b205596e8f913")
  public open fun autoScaleGlobalSecondaryIndexWriteCapacity(indexName: String,
      props: EnableScalingProps.Builder.() -> Unit): IScalableTableAttribute =
      autoScaleGlobalSecondaryIndexWriteCapacity(indexName, EnableScalingProps(props))

  public open fun autoScaleReadCapacity(props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleReadCapacity(props.let(EnableScalingProps::unwrap)).let(IScalableTableAttribute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e86c41a83c3e4cc01253b01f7cfb694f05fe5a6535799c944a07083d61e0c074")
  public open fun autoScaleReadCapacity(props: EnableScalingProps.Builder.() -> Unit):
      IScalableTableAttribute = autoScaleReadCapacity(EnableScalingProps(props))

  public open fun autoScaleWriteCapacity(props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleWriteCapacity(props.let(EnableScalingProps::unwrap)).let(IScalableTableAttribute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad6bacf42ee369463ab608f6edaf023fac0e77d00ffc8a640777c38ec1cde143")
  public open fun autoScaleWriteCapacity(props: EnableScalingProps.Builder.() -> Unit):
      IScalableTableAttribute = autoScaleWriteCapacity(EnableScalingProps(props))

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public open fun schema(): SchemaOptions = unwrap(this).schema().let(SchemaOptions::wrap)

  public open fun schema(indexName: String): SchemaOptions =
      unwrap(this).schema(indexName).let(SchemaOptions::wrap)

  public override fun tableArn(): String = unwrap(this).getTableArn()

  public override fun tableName(): String = unwrap(this).getTableName()

  public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  public interface Builder {
    public fun billingMode(billingMode: BillingMode)

    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun encryption(encryption: TableEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun importSource(importSource: ImportSourceSpecification)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2f70bbf86ecde413627217be1d1e3d8fdc03a709cc0c706605cdcb1bf7f7d6")
    public fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit)

    public fun kinesisStream(kinesisStream: IStream)

    public fun partitionKey(partitionKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e27f78e8d2e12f325d6d5e093919fbdc99062bf2df8bac245822de05c0bd5b")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    public fun readCapacity(readCapacity: Number)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun replicationRegions(replicationRegions: List<String>)

    public fun replicationTimeout(replicationTimeout: Duration)

    public fun sortKey(sortKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89c5f7f943bcf4ae622e2bec85e4287402b229325cb3f71be2ef432328ee9c23")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    public fun stream(stream: StreamViewType)

    public fun tableClass(tableClass: TableClass)

    public fun tableName(tableName: String)

    public fun timeToLiveAttribute(timeToLiveAttribute: String)

    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean)

    public fun writeCapacity(writeCapacity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.Table.Builder =
        software.amazon.awscdk.services.dynamodb.Table.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2f70bbf86ecde413627217be1d1e3d8fdc03a709cc0c706605cdcb1bf7f7d6")
    override fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit): Unit =
        importSource(ImportSourceSpecification(importSource))

    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream::unwrap))
    }

    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73e27f78e8d2e12f325d6d5e093919fbdc99062bf2df8bac245822de05c0bd5b")
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

    override fun replicationTimeout(replicationTimeout: Duration) {
      cdkBuilder.replicationTimeout(replicationTimeout.let(Duration::unwrap))
    }

    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89c5f7f943bcf4ae622e2bec85e4287402b229325cb3f71be2ef432328ee9c23")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    override fun stream(stream: StreamViewType) {
      cdkBuilder.stream(stream.let(StreamViewType::unwrap))
    }

    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
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

    public fun build(): software.amazon.awscdk.services.dynamodb.Table = cdkBuilder.build()
  }

  public companion object {
    public open fun fromTableArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableArn: String,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, tableArn).let(ITable::wrap)

    public open fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributes,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TableAttributes::unwrap)).let(ITable::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62bcd05214907d2b15967422d696b87c576a19fd7d7eda43e7c503e51c260176")
    public open fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributes.Builder.() -> Unit,
    ): ITable = fromTableAttributes(scope, id, TableAttributes(attrs))

    public open fun fromTableName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableName: String,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, tableName).let(ITable::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Table {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Table(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Table): Table =
        Table(cdkObject)

    internal fun unwrap(wrapped: Table): software.amazon.awscdk.services.dynamodb.Table =
        wrapped.cdkObject
  }
}
