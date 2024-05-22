@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A DynamoDB Table.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * // applys to all replicas, i.e., us-west-2, us-east-1, us-east-2
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build(),
 * ReplicaTableProps.builder().region("us-east-2").build()))
 * .build();
 * ```
 */
public open class TableV2(
  cdkObject: software.amazon.awscdk.services.dynamodb.TableV2,
) : TableBaseV2(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TablePropsV2,
  ) :
      this(software.amazon.awscdk.services.dynamodb.TableV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TablePropsV2.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TablePropsV2.Builder.() -> Unit,
  ) : this(scope, id, TablePropsV2(props)
  )

  /**
   * Add a global secondary index to the table.
   *
   * Note: Global secondary indexes will be inherited by all replica tables.
   *
   * @param props the properties of the global secondary index. 
   */
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexPropsV2) {
    unwrap(this).addGlobalSecondaryIndex(props.let(GlobalSecondaryIndexPropsV2.Companion::unwrap))
  }

  /**
   * Add a global secondary index to the table.
   *
   * Note: Global secondary indexes will be inherited by all replica tables.
   *
   * @param props the properties of the global secondary index. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7b68edc7d1a9c1d2da6fec1c48a5a5c0635a07cfdb379c0dfa221013ecfb72c3")
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexPropsV2.Builder.() -> Unit):
      Unit = addGlobalSecondaryIndex(GlobalSecondaryIndexPropsV2(props))

  /**
   * Add a local secondary index to the table.
   *
   * Note: Local secondary indexes will be inherited by all replica tables.
   *
   * @param props the properties of the local secondary index. 
   */
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps) {
    unwrap(this).addLocalSecondaryIndex(props.let(LocalSecondaryIndexProps.Companion::unwrap))
  }

  /**
   * Add a local secondary index to the table.
   *
   * Note: Local secondary indexes will be inherited by all replica tables.
   *
   * @param props the properties of the local secondary index. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7142e3f823d9e48e8377acf13a8870674ffcae3b2bebcc19da6e0d90bb8889be")
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps.Builder.() -> Unit): Unit =
      addLocalSecondaryIndex(LocalSecondaryIndexProps(props))

  /**
   * Add a replica table.
   *
   * Note: Adding a replica table will allow you to use your table as a global table.
   *
   * @param props the properties of the replica table to add. 
   */
  public open fun addReplica(props: ReplicaTableProps) {
    unwrap(this).addReplica(props.let(ReplicaTableProps.Companion::unwrap))
  }

  /**
   * Add a replica table.
   *
   * Note: Adding a replica table will allow you to use your table as a global table.
   *
   * @param props the properties of the replica table to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9db4da9329be516faf4e59165d2ec519ea8439666c3a0cb201c2d10767f5d1a")
  public open fun addReplica(props: ReplicaTableProps.Builder.() -> Unit): Unit =
      addReplica(ReplicaTableProps(props))

  /**
   * The KMS encryption key for the table.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Retrieve a replica table.
   *
   * Note: Replica tables are not supported in a region agnostic stack.
   *
   * @param region the region of the replica table. 
   */
  public open fun replica(region: String): ITableV2 =
      unwrap(this).replica(region).let(ITableV2::wrap)

  /**
   * The ARN of the table.
   */
  public override fun tableArn(): String = unwrap(this).getTableArn()

  /**
   * The ID of the table.
   */
  public override fun tableId(): String? = unwrap(this).getTableId()

  /**
   * The name of the table.
   */
  public override fun tableName(): String = unwrap(this).getTableName()

  /**
   * The stream ARN of the table.
   */
  public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dynamodb.TableV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The billing mode and capacity settings to apply to the table.
     *
     * Default: Billing.onDemand()
     *
     * @param billing The billing mode and capacity settings to apply to the table. 
     */
    public fun billing(billing: Billing)

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsights Whether CloudWatch contributor insights is enabled. 
     */
    public fun contributorInsights(contributorInsights: Boolean)

    /**
     * Whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Whether deletion protection is enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream.
     *
     * Default: - streams are disabled if replicas are not configured and this property is
     * not specified. If this property is not specified when replicas are configured, then
     * NEW_AND_OLD_IMAGES will be the StreamViewType for all replicas
     *
     * @param dynamoStream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream. 
     */
    public fun dynamoStream(dynamoStream: StreamViewType)

    /**
     * The server-side encryption.
     *
     * Default: TableEncryptionV2.dynamoOwnedKey()
     *
     * @param encryption The server-side encryption. 
     */
    public fun encryption(encryption: TableEncryptionV2)

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes. 
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<GlobalSecondaryIndexPropsV2>)

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes. 
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: GlobalSecondaryIndexPropsV2)

    /**
     * Kinesis Data Stream to capture item level changes.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item level changes. 
     */
    public fun kinesisStream(kinesisStream: IStream)

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes. 
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: List<LocalSecondaryIndexProps>)

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes. 
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: LocalSecondaryIndexProps)

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition. 
     */
    public fun partitionKey(partitionKey: Attribute)

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e56ec7777300e0919af1ffc1053b4a84c8e0604db2560193f3c3aff5d452a8")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: false
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled. 
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    /**
     * The removal policy applied to the table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy applied to the table. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You
     * cannot specify a replica table in the region that the primary table will be deployed
     * to. Replica tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table. 
     */
    public fun replicas(replicas: List<ReplicaTableProps>)

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You
     * cannot specify a replica table in the region that the primary table will be deployed
     * to. Replica tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table. 
     */
    public fun replicas(vararg replicas: ReplicaTableProps)

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd049c9f249b74178367efacad85937c08aee402e561bb19ee5f7397f0eb5542")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    /**
     * The table class.
     *
     * Default: TableClass.STANDARD
     *
     * @param tableClass The table class. 
     */
    public fun tableClass(tableClass: TableClass)

    /**
     * The name of the table.
     *
     * Default: - generated by CloudFormation
     *
     * @param tableName The name of the table. 
     */
    public fun tableName(tableName: String)

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of the TTL attribute. 
     */
    public fun timeToLiveAttribute(timeToLiveAttribute: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableV2.Builder =
        software.amazon.awscdk.services.dynamodb.TableV2.Builder.create(scope, id)

    /**
     * The billing mode and capacity settings to apply to the table.
     *
     * Default: Billing.onDemand()
     *
     * @param billing The billing mode and capacity settings to apply to the table. 
     */
    override fun billing(billing: Billing) {
      cdkBuilder.billing(billing.let(Billing.Companion::unwrap))
    }

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsights Whether CloudWatch contributor insights is enabled. 
     */
    override fun contributorInsights(contributorInsights: Boolean) {
      cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * Whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Whether deletion protection is enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream.
     *
     * Default: - streams are disabled if replicas are not configured and this property is
     * not specified. If this property is not specified when replicas are configured, then
     * NEW_AND_OLD_IMAGES will be the StreamViewType for all replicas
     *
     * @param dynamoStream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream. 
     */
    override fun dynamoStream(dynamoStream: StreamViewType) {
      cdkBuilder.dynamoStream(dynamoStream.let(StreamViewType.Companion::unwrap))
    }

    /**
     * The server-side encryption.
     *
     * Default: TableEncryptionV2.dynamoOwnedKey()
     *
     * @param encryption The server-side encryption. 
     */
    override fun encryption(encryption: TableEncryptionV2) {
      cdkBuilder.encryption(encryption.let(TableEncryptionV2.Companion::unwrap))
    }

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes. 
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<GlobalSecondaryIndexPropsV2>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.map(GlobalSecondaryIndexPropsV2.Companion::unwrap))
    }

    /**
     * Global secondary indexes.
     *
     * Note: You can provide a maximum of 20 global secondary indexes.
     *
     * Default: - no global secondary indexes
     *
     * @param globalSecondaryIndexes Global secondary indexes. 
     */
    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: GlobalSecondaryIndexPropsV2):
        Unit = globalSecondaryIndexes(globalSecondaryIndexes.toList())

    /**
     * Kinesis Data Stream to capture item level changes.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item level changes. 
     */
    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream.Companion::unwrap))
    }

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes. 
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: List<LocalSecondaryIndexProps>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.map(LocalSecondaryIndexProps.Companion::unwrap))
    }

    /**
     * Local secondary indexes.
     *
     * Note: You can only provide a maximum of 5 local secondary indexes.
     *
     * Default: - no local secondary indexes
     *
     * @param localSecondaryIndexes Local secondary indexes. 
     */
    override fun localSecondaryIndexes(vararg localSecondaryIndexes: LocalSecondaryIndexProps): Unit
        = localSecondaryIndexes(localSecondaryIndexes.toList())

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition. 
     */
    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute.Companion::unwrap))
    }

    /**
     * Partition key attribute definition.
     *
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e56ec7777300e0919af1ffc1053b4a84c8e0604db2560193f3c3aff5d452a8")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: false
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled. 
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * The removal policy applied to the table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy applied to the table. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You
     * cannot specify a replica table in the region that the primary table will be deployed
     * to. Replica tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table. 
     */
    override fun replicas(replicas: List<ReplicaTableProps>) {
      cdkBuilder.replicas(replicas.map(ReplicaTableProps.Companion::unwrap))
    }

    /**
     * Replica tables to deploy with the primary table.
     *
     * Note: Adding replica tables allows you to use your table as a global table. You
     * cannot specify a replica table in the region that the primary table will be deployed
     * to. Replica tables will only be supported if the stack deployment region is defined.
     *
     * Default: - no replica tables
     *
     * @param replicas Replica tables to deploy with the primary table. 
     */
    override fun replicas(vararg replicas: ReplicaTableProps): Unit = replicas(replicas.toList())

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute.Companion::unwrap))
    }

    /**
     * Sort key attribute definition.
     *
     * Default: - no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd049c9f249b74178367efacad85937c08aee402e561bb19ee5f7397f0eb5542")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * The table class.
     *
     * Default: TableClass.STANDARD
     *
     * @param tableClass The table class. 
     */
    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass.Companion::unwrap))
    }

    /**
     * The name of the table.
     *
     * Default: - generated by CloudFormation
     *
     * @param tableName The name of the table. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags to be applied to the table or replica table.
     *
     * Default: - no tags
     *
     * @param tags Tags to be applied to the table or replica table. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of the TTL attribute. 
     */
    override fun timeToLiveAttribute(timeToLiveAttribute: String) {
      cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableV2 = cdkBuilder.build()
  }

  public companion object {
    public fun fromTableArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableArn: String,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, tableArn).let(ITableV2::wrap)

    public fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributesV2,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(TableAttributesV2.Companion::unwrap)).let(ITableV2::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("372c946c79c90401b2fe4249b59cb6d3bf9278dc8e195126ce781bb179c557b6")
    public fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributesV2.Builder.() -> Unit,
    ): ITableV2 = fromTableAttributes(scope, id, TableAttributesV2(attrs))

    public fun fromTableName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableName: String,
    ): ITableV2 =
        software.amazon.awscdk.services.dynamodb.TableV2.fromTableName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
        wrapped.cdkObject as software.amazon.awscdk.services.dynamodb.TableV2
  }
}
