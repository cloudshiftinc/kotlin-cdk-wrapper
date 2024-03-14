package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TableV2 internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.TableV2,
) : TableBaseV2(cdkObject) {
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexPropsV2) {
    unwrap(this).addGlobalSecondaryIndex(props.let(GlobalSecondaryIndexPropsV2::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7b68edc7d1a9c1d2da6fec1c48a5a5c0635a07cfdb379c0dfa221013ecfb72c3")
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexPropsV2.Builder.() -> Unit):
      Unit = addGlobalSecondaryIndex(GlobalSecondaryIndexPropsV2(props))

  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps) {
    unwrap(this).addLocalSecondaryIndex(props.let(LocalSecondaryIndexProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7142e3f823d9e48e8377acf13a8870674ffcae3b2bebcc19da6e0d90bb8889be")
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps.Builder.() -> Unit): Unit =
      addLocalSecondaryIndex(LocalSecondaryIndexProps(props))

  public open fun addReplica(props: ReplicaTableProps) {
    unwrap(this).addReplica(props.let(ReplicaTableProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9db4da9329be516faf4e59165d2ec519ea8439666c3a0cb201c2d10767f5d1a")
  public open fun addReplica(props: ReplicaTableProps.Builder.() -> Unit): Unit =
      addReplica(ReplicaTableProps(props))

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public open fun replica(region: String): ITableV2 =
      unwrap(this).replica(region).let(ITableV2::wrap)

  public override fun tableArn(): String = unwrap(this).getTableArn()

  public override fun tableId(): String? = unwrap(this).getTableId()

  public override fun tableName(): String = unwrap(this).getTableName()

  public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e56ec7777300e0919af1ffc1053b4a84c8e0604db2560193f3c3aff5d452a8")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun replicas(replicas: List<ReplicaTableProps>)

    public fun replicas(vararg replicas: ReplicaTableProps)

    public fun sortKey(sortKey: Attribute)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd049c9f249b74178367efacad85937c08aee402e561bb19ee5f7397f0eb5542")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    public fun tableClass(tableClass: TableClass)

    public fun tableName(tableName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeToLiveAttribute(timeToLiveAttribute: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableV2.Builder =
        software.amazon.awscdk.services.dynamodb.TableV2.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e56ec7777300e0919af1ffc1053b4a84c8e0604db2560193f3c3aff5d452a8")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd049c9f249b74178367efacad85937c08aee402e561bb19ee5f7397f0eb5542")
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

    public fun build(): software.amazon.awscdk.services.dynamodb.TableV2 = cdkBuilder.build()
  }

  public companion object {
    public open fun fromTableArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableArn: String,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, tableArn).let(ITableV2::wrap)

    public open fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributesV2,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TableAttributesV2::unwrap)).let(ITableV2::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("372c946c79c90401b2fe4249b59cb6d3bf9278dc8e195126ce781bb179c557b6")
    public open fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributesV2.Builder.() -> Unit,
    ): ITableV2 = fromTableAttributes(scope, id, TableAttributesV2(attrs))

    public open fun fromTableName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableName: String,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, tableName).let(ITableV2::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TableV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TableV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableV2): TableV2 =
        TableV2(cdkObject)

    internal fun unwrap(wrapped: TableV2): software.amazon.awscdk.services.dynamodb.TableV2 =
        wrapped.cdkObject
  }
}
