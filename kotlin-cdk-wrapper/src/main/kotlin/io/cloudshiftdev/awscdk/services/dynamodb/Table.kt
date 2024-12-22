@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kinesis.IStream
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides a DynamoDB table.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.kms.Key;
 * Function fn;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .stream(StreamViewType.NEW_IMAGE)
 * .build();
 * // Your self managed KMS key
 * IKey myKey = Key.fromKeyArn(this, "SourceBucketEncryptionKey",
 * "arn:aws:kms:us-east-1:123456789012:key/&lt;key-id&gt;");
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.LATEST)
 * .filters(List.of(FilterCriteria.filter(Map.of("eventName", FilterRule.isEqual("INSERT")))))
 * .filterEncryption(myKey)
 * .build());
 * ```
 */
public open class Table(
  cdkObject: software.amazon.awscdk.services.dynamodb.Table,
) : TableBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TableProps,
  ) :
      this(software.amazon.awscdk.services.dynamodb.Table(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TableProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TableProps.Builder.() -> Unit,
  ) : this(scope, id, TableProps(props)
  )

  /**
   * Add a global secondary index of table.
   *
   * @param props the property of global secondary index. 
   */
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexProps) {
    unwrap(this).addGlobalSecondaryIndex(props.let(GlobalSecondaryIndexProps.Companion::unwrap))
  }

  /**
   * Add a global secondary index of table.
   *
   * @param props the property of global secondary index. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a29007f317200f09c22dd8ee35e2f15602715637a0d24ca11cf6b8264742a3f")
  public open fun addGlobalSecondaryIndex(props: GlobalSecondaryIndexProps.Builder.() -> Unit): Unit
      = addGlobalSecondaryIndex(GlobalSecondaryIndexProps(props))

  /**
   * Add a local secondary index of table.
   *
   * @param props the property of local secondary index. 
   */
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps) {
    unwrap(this).addLocalSecondaryIndex(props.let(LocalSecondaryIndexProps.Companion::unwrap))
  }

  /**
   * Add a local secondary index of table.
   *
   * @param props the property of local secondary index. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7142e3f823d9e48e8377acf13a8870674ffcae3b2bebcc19da6e0d90bb8889be")
  public open fun addLocalSecondaryIndex(props: LocalSecondaryIndexProps.Builder.() -> Unit): Unit =
      addLocalSecondaryIndex(LocalSecondaryIndexProps(props))

  /**
   * Enable read capacity scaling for the given GSI.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param indexName 
   * @param props 
   */
  public open fun autoScaleGlobalSecondaryIndexReadCapacity(indexName: String,
      props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleGlobalSecondaryIndexReadCapacity(indexName,
      props.let(EnableScalingProps.Companion::unwrap)).let(IScalableTableAttribute::wrap)

  /**
   * Enable read capacity scaling for the given GSI.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param indexName 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d87923174146be919555fedb7cccae8fc99f967ccb88c54fd7a55678de1c99ff")
  public open fun autoScaleGlobalSecondaryIndexReadCapacity(indexName: String,
      props: EnableScalingProps.Builder.() -> Unit): IScalableTableAttribute =
      autoScaleGlobalSecondaryIndexReadCapacity(indexName, EnableScalingProps(props))

  /**
   * Enable write capacity scaling for the given GSI.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param indexName 
   * @param props 
   */
  public open fun autoScaleGlobalSecondaryIndexWriteCapacity(indexName: String,
      props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleGlobalSecondaryIndexWriteCapacity(indexName,
      props.let(EnableScalingProps.Companion::unwrap)).let(IScalableTableAttribute::wrap)

  /**
   * Enable write capacity scaling for the given GSI.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param indexName 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d132623ee542cd660831380fa7d113a5cb9ade74a62abec6b65b205596e8f913")
  public open fun autoScaleGlobalSecondaryIndexWriteCapacity(indexName: String,
      props: EnableScalingProps.Builder.() -> Unit): IScalableTableAttribute =
      autoScaleGlobalSecondaryIndexWriteCapacity(indexName, EnableScalingProps(props))

  /**
   * Enable read capacity scaling for this table.
   *
   * @return An object to configure additional AutoScaling settings
   * @param props 
   */
  public open fun autoScaleReadCapacity(props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleReadCapacity(props.let(EnableScalingProps.Companion::unwrap)).let(IScalableTableAttribute::wrap)

  /**
   * Enable read capacity scaling for this table.
   *
   * @return An object to configure additional AutoScaling settings
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e86c41a83c3e4cc01253b01f7cfb694f05fe5a6535799c944a07083d61e0c074")
  public open fun autoScaleReadCapacity(props: EnableScalingProps.Builder.() -> Unit):
      IScalableTableAttribute = autoScaleReadCapacity(EnableScalingProps(props))

  /**
   * Enable write capacity scaling for this table.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param props 
   */
  public open fun autoScaleWriteCapacity(props: EnableScalingProps): IScalableTableAttribute =
      unwrap(this).autoScaleWriteCapacity(props.let(EnableScalingProps.Companion::unwrap)).let(IScalableTableAttribute::wrap)

  /**
   * Enable write capacity scaling for this table.
   *
   * @return An object to configure additional AutoScaling settings for this attribute
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad6bacf42ee369463ab608f6edaf023fac0e77d00ffc8a640777c38ec1cde143")
  public open fun autoScaleWriteCapacity(props: EnableScalingProps.Builder.() -> Unit):
      IScalableTableAttribute = autoScaleWriteCapacity(EnableScalingProps(props))

  /**
   * KMS encryption key, if this table uses a customer-managed encryption key.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Resource policy to assign to DynamoDB Table.
   *
   * Default: - No resource policy statements are added to the created table.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-resourcepolicy.html)
   */
  public override fun resourcePolicy(): PolicyDocument? =
      unwrap(this).getResourcePolicy()?.let(PolicyDocument::wrap)

  /**
   * Resource policy to assign to DynamoDB Table.
   *
   * Default: - No resource policy statements are added to the created table.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-resourcepolicy.html)
   */
  public override fun resourcePolicy(`value`: PolicyDocument) {
    unwrap(this).setResourcePolicy(`value`.let(PolicyDocument.Companion::unwrap))
  }

  /**
   * Resource policy to assign to DynamoDB Table.
   *
   * Default: - No resource policy statements are added to the created table.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-resourcepolicy.html)
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86a422cdfbd7ab1eb4700fbb0990116f2f653f87b45d5d6a5ce2846099e124d0")
  public override fun resourcePolicy(`value`: PolicyDocument.Builder.() -> Unit): Unit =
      resourcePolicy(PolicyDocument(`value`))

  /**
   * Get schema attributes of table or index.
   *
   * @return Schema of table or index.
   * @param indexName
   */
  public open fun schema(): SchemaOptions = unwrap(this).schema().let(SchemaOptions::wrap)

  /**
   * Get schema attributes of table or index.
   *
   * @return Schema of table or index.
   * @param indexName
   */
  public open fun schema(indexName: String): SchemaOptions =
      unwrap(this).schema(indexName).let(SchemaOptions::wrap)

  /**
   * Arn of the dynamodb table.
   */
  public override fun tableArn(): String = unwrap(this).getTableArn()

  /**
   * Table name of the dynamodb table.
   */
  public override fun tableName(): String = unwrap(this).getTableName()

  /**
   * ARN of the table's stream, if there is one.
   */
  public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dynamodb.Table].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Default: PROVISIONED if `replicationRegions` is not specified, PAY_PER_REQUEST otherwise
     *
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity. 
     */
    public fun billingMode(billingMode: BillingMode)

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled. 
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    /**
     * Enables deletion protection for the table.
     *
     * Default: false
     *
     * @param deletionProtection Enables deletion protection for the table. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Whether server-side encryption with an AWS managed customer master key is enabled.
     *
     * This property cannot be set if `serverSideEncryption` is set.
     *
     *
     * **NOTE**: if you set this to `CUSTOMER_MANAGED` and `encryptionKey` is not
     * specified, the key that the Tablet generates for you will be created with
     * default permissions. If you are using CDKv2, these permissions will be
     * sufficient to enable the key for use with DynamoDB tables.  If you are
     * using CDKv1, make sure the feature flag
     * `&#64;aws-cdk/aws-kms:defaultKeyPolicies` is set to `true` in your `cdk.json`.
     *
     *
     * Default: - The table is encrypted with an encryption key managed by DynamoDB, and you are not
     * charged any fee for using it.
     *
     * @param encryption Whether server-side encryption with an AWS managed customer master key is
     * enabled. 
     */
    public fun encryption(encryption: TableEncryption)

    /**
     * External KMS key to use for table encryption.
     *
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     *
     * Default: - If `encryption` is set to `TableEncryption.CUSTOMER_MANAGED` and this
     * property is undefined, a new KMS key will be created and associated with this table.
     * If `encryption` and this property are both undefined, then the table is encrypted with
     * an encryption key managed by DynamoDB, and you are not charged any fee for using it.
     *
     * @param encryptionKey External KMS key to use for table encryption. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table. 
     */
    public fun importSource(importSource: ImportSourceSpecification)

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2f70bbf86ecde413627217be1d1e3d8fdc03a709cc0c706605cdcb1bf7f7d6")
    public fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit)

    /**
     * Kinesis Data Stream approximate creation timestamp prescision.
     *
     * Default: ApproximateCreationDateTimePrecision.MICROSECOND
     *
     * @param kinesisPrecisionTimestamp Kinesis Data Stream approximate creation timestamp
     * prescision. 
     */
    public
        fun kinesisPrecisionTimestamp(kinesisPrecisionTimestamp: ApproximateCreationDateTimePrecision)

    /**
     * Kinesis Data Stream to capture item-level changes for the table.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item-level changes for the table. 
     */
    public fun kinesisStream(kinesisStream: IStream)

    /**
     * The maximum read request units for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's maximum on-demand throughput.
     *
     * Can only be provided if billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     *
     * @param maxReadRequestUnits The maximum read request units for the table. 
     */
    public fun maxReadRequestUnits(maxReadRequestUnits: Number)

    /**
     * The write request units for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's maximum on-demand throughput.
     *
     * Can only be provided if billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     *
     * @param maxWriteRequestUnits The write request units for the table. 
     */
    public fun maxWriteRequestUnits(maxWriteRequestUnits: Number)

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
    @JvmName("73e27f78e8d2e12f325d6d5e093919fbdc99062bf2df8bac245822de05c0bd5b")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: - point-in-time recovery is disabled
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled. 
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    /**
     * The read capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param readCapacity The read capacity for the table. 
     */
    public fun readCapacity(readCapacity: Number)

    /**
     * The removal policy to apply to the DynamoDB Table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the DynamoDB Table. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created. 
     */
    public fun replicationRegions(replicationRegions: List<String>)

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created. 
     */
    public fun replicationRegions(vararg replicationRegions: String)

    /**
     * The timeout for a table replication operation in a single region.
     *
     * Default: Duration.minutes(30)
     *
     * @param replicationTimeout The timeout for a table replication operation in a single region. 
     */
    public fun replicationTimeout(replicationTimeout: Duration)

    /**
     * Resource policy to assign to table.
     *
     * Default: - No resource policy statement
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
     * @param resourcePolicy Resource policy to assign to table. 
     */
    public fun resourcePolicy(resourcePolicy: PolicyDocument)

    /**
     * Resource policy to assign to table.
     *
     * Default: - No resource policy statement
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
     * @param resourcePolicy Resource policy to assign to table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71f4b00d83d7ce16c3636bbdeceecf6431cc6844d714f8831df7885b6bd11458")
    public fun resourcePolicy(resourcePolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89c5f7f943bcf4ae622e2bec85e4287402b229325cb3f71be2ef432328ee9c23")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream for this table.
     *
     * Default: - streams are disabled unless `replicationRegions` is specified
     *
     * @param stream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream for this table. 
     */
    public fun stream(stream: StreamViewType)

    /**
     * Specify the table class.
     *
     * Default: STANDARD
     *
     * @param tableClass Specify the table class. 
     */
    public fun tableClass(tableClass: TableClass)

    /**
     * Enforces a particular physical table name.
     *
     * Default: <generated>
     *
     * @param tableName Enforces a particular physical table name. 
     */
    public fun tableName(tableName: String)

    /**
     * The name of TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of TTL attribute. 
     */
    public fun timeToLiveAttribute(timeToLiveAttribute: String)

    /**
     * [WARNING: Use this flag with caution, misusing this flag may cause deleting existing
     * replicas, refer to the detailed documentation for more information] Indicates whether
     * CloudFormation stack waits for replication to finish.
     *
     * If set to false, the CloudFormation resource will mark the resource as
     * created and replication will be completed asynchronously. This property is
     * ignored if replicationRegions property is not set.
     *
     * WARNING:
     * DO NOT UNSET this property if adding/removing multiple replicationRegions
     * in one deployment, as CloudFormation only supports one region replication
     * at a time. CDK overcomes this limitation by waiting for replication to
     * finish before starting new replicationRegion.
     *
     * If the custom resource which handles replication has a physical resource
     * ID with the format `region` instead of `tablename-region` (this would happen
     * if the custom resource hasn't received an event since v1.91.0), DO NOT SET
     * this property to false without making a change to the table name.
     * This will cause the existing replicas to be deleted.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param waitForReplicationToFinish [WARNING: Use this flag with caution, misusing this flag
     * may cause deleting existing replicas, refer to the detailed documentation for more information]
     * Indicates whether CloudFormation stack waits for replication to finish. 
     */
    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean)

    /**
     * Specify values to pre-warm you DynamoDB Table Warm Throughput feature is not available for
     * Global Table replicas using the `Table` construct.
     *
     * To enable Warm Throughput, use the `TableV2` construct instead.
     *
     * Default: - warm throughput is not configured
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-warmthroughput)
     * @param warmThroughput Specify values to pre-warm you DynamoDB Table Warm Throughput feature
     * is not available for Global Table replicas using the `Table` construct. 
     */
    public fun warmThroughput(warmThroughput: WarmThroughput)

    /**
     * Specify values to pre-warm you DynamoDB Table Warm Throughput feature is not available for
     * Global Table replicas using the `Table` construct.
     *
     * To enable Warm Throughput, use the `TableV2` construct instead.
     *
     * Default: - warm throughput is not configured
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-warmthroughput)
     * @param warmThroughput Specify values to pre-warm you DynamoDB Table Warm Throughput feature
     * is not available for Global Table replicas using the `Table` construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("105c71b31b15f5e5358ec9fd11559289b782dcb520a5b0786e59497b9ee9f78b")
    public fun warmThroughput(warmThroughput: WarmThroughput.Builder.() -> Unit)

    /**
     * The write capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param writeCapacity The write capacity for the table. 
     */
    public fun writeCapacity(writeCapacity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.Table.Builder =
        software.amazon.awscdk.services.dynamodb.Table.Builder.create(scope, id)

    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Default: PROVISIONED if `replicationRegions` is not specified, PAY_PER_REQUEST otherwise
     *
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity. 
     */
    override fun billingMode(billingMode: BillingMode) {
      cdkBuilder.billingMode(billingMode.let(BillingMode.Companion::unwrap))
    }

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     *
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled. 
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * Enables deletion protection for the table.
     *
     * Default: false
     *
     * @param deletionProtection Enables deletion protection for the table. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Whether server-side encryption with an AWS managed customer master key is enabled.
     *
     * This property cannot be set if `serverSideEncryption` is set.
     *
     *
     * **NOTE**: if you set this to `CUSTOMER_MANAGED` and `encryptionKey` is not
     * specified, the key that the Tablet generates for you will be created with
     * default permissions. If you are using CDKv2, these permissions will be
     * sufficient to enable the key for use with DynamoDB tables.  If you are
     * using CDKv1, make sure the feature flag
     * `&#64;aws-cdk/aws-kms:defaultKeyPolicies` is set to `true` in your `cdk.json`.
     *
     *
     * Default: - The table is encrypted with an encryption key managed by DynamoDB, and you are not
     * charged any fee for using it.
     *
     * @param encryption Whether server-side encryption with an AWS managed customer master key is
     * enabled. 
     */
    override fun encryption(encryption: TableEncryption) {
      cdkBuilder.encryption(encryption.let(TableEncryption.Companion::unwrap))
    }

    /**
     * External KMS key to use for table encryption.
     *
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     *
     * Default: - If `encryption` is set to `TableEncryption.CUSTOMER_MANAGED` and this
     * property is undefined, a new KMS key will be created and associated with this table.
     * If `encryption` and this property are both undefined, then the table is encrypted with
     * an encryption key managed by DynamoDB, and you are not charged any fee for using it.
     *
     * @param encryptionKey External KMS key to use for table encryption. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table. 
     */
    override fun importSource(importSource: ImportSourceSpecification) {
      cdkBuilder.importSource(importSource.let(ImportSourceSpecification.Companion::unwrap))
    }

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     *
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2f70bbf86ecde413627217be1d1e3d8fdc03a709cc0c706605cdcb1bf7f7d6")
    override fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit): Unit =
        importSource(ImportSourceSpecification(importSource))

    /**
     * Kinesis Data Stream approximate creation timestamp prescision.
     *
     * Default: ApproximateCreationDateTimePrecision.MICROSECOND
     *
     * @param kinesisPrecisionTimestamp Kinesis Data Stream approximate creation timestamp
     * prescision. 
     */
    override
        fun kinesisPrecisionTimestamp(kinesisPrecisionTimestamp: ApproximateCreationDateTimePrecision) {
      cdkBuilder.kinesisPrecisionTimestamp(kinesisPrecisionTimestamp.let(ApproximateCreationDateTimePrecision.Companion::unwrap))
    }

    /**
     * Kinesis Data Stream to capture item-level changes for the table.
     *
     * Default: - no Kinesis Data Stream
     *
     * @param kinesisStream Kinesis Data Stream to capture item-level changes for the table. 
     */
    override fun kinesisStream(kinesisStream: IStream) {
      cdkBuilder.kinesisStream(kinesisStream.let(IStream.Companion::unwrap))
    }

    /**
     * The maximum read request units for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's maximum on-demand throughput.
     *
     * Can only be provided if billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     *
     * @param maxReadRequestUnits The maximum read request units for the table. 
     */
    override fun maxReadRequestUnits(maxReadRequestUnits: Number) {
      cdkBuilder.maxReadRequestUnits(maxReadRequestUnits)
    }

    /**
     * The write request units for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's maximum on-demand throughput.
     *
     * Can only be provided if billingMode is PAY_PER_REQUEST.
     *
     * Default: - on-demand throughput is disabled
     *
     * @param maxWriteRequestUnits The write request units for the table. 
     */
    override fun maxWriteRequestUnits(maxWriteRequestUnits: Number) {
      cdkBuilder.maxWriteRequestUnits(maxWriteRequestUnits)
    }

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
    @JvmName("73e27f78e8d2e12f325d6d5e093919fbdc99062bf2df8bac245822de05c0bd5b")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: - point-in-time recovery is disabled
     *
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled. 
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * The read capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param readCapacity The read capacity for the table. 
     */
    override fun readCapacity(readCapacity: Number) {
      cdkBuilder.readCapacity(readCapacity)
    }

    /**
     * The removal policy to apply to the DynamoDB Table.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the DynamoDB Table. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created. 
     */
    override fun replicationRegions(replicationRegions: List<String>) {
      cdkBuilder.replicationRegions(replicationRegions)
    }

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     *
     * @param replicationRegions Regions where replica tables will be created. 
     */
    override fun replicationRegions(vararg replicationRegions: String): Unit =
        replicationRegions(replicationRegions.toList())

    /**
     * The timeout for a table replication operation in a single region.
     *
     * Default: Duration.minutes(30)
     *
     * @param replicationTimeout The timeout for a table replication operation in a single region. 
     */
    override fun replicationTimeout(replicationTimeout: Duration) {
      cdkBuilder.replicationTimeout(replicationTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * Resource policy to assign to table.
     *
     * Default: - No resource policy statement
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
     * @param resourcePolicy Resource policy to assign to table. 
     */
    override fun resourcePolicy(resourcePolicy: PolicyDocument) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(PolicyDocument.Companion::unwrap))
    }

    /**
     * Resource policy to assign to table.
     *
     * Default: - No resource policy statement
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
     * @param resourcePolicy Resource policy to assign to table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71f4b00d83d7ce16c3636bbdeceecf6431cc6844d714f8831df7885b6bd11458")
    override fun resourcePolicy(resourcePolicy: PolicyDocument.Builder.() -> Unit): Unit =
        resourcePolicy(PolicyDocument(resourcePolicy))

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute.Companion::unwrap))
    }

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     *
     * @param sortKey Sort key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89c5f7f943bcf4ae622e2bec85e4287402b229325cb3f71be2ef432328ee9c23")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream for this table.
     *
     * Default: - streams are disabled unless `replicationRegions` is specified
     *
     * @param stream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream for this table. 
     */
    override fun stream(stream: StreamViewType) {
      cdkBuilder.stream(stream.let(StreamViewType.Companion::unwrap))
    }

    /**
     * Specify the table class.
     *
     * Default: STANDARD
     *
     * @param tableClass Specify the table class. 
     */
    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass.Companion::unwrap))
    }

    /**
     * Enforces a particular physical table name.
     *
     * Default: <generated>
     *
     * @param tableName Enforces a particular physical table name. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * The name of TTL attribute.
     *
     * Default: - TTL is disabled
     *
     * @param timeToLiveAttribute The name of TTL attribute. 
     */
    override fun timeToLiveAttribute(timeToLiveAttribute: String) {
      cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    /**
     * [WARNING: Use this flag with caution, misusing this flag may cause deleting existing
     * replicas, refer to the detailed documentation for more information] Indicates whether
     * CloudFormation stack waits for replication to finish.
     *
     * If set to false, the CloudFormation resource will mark the resource as
     * created and replication will be completed asynchronously. This property is
     * ignored if replicationRegions property is not set.
     *
     * WARNING:
     * DO NOT UNSET this property if adding/removing multiple replicationRegions
     * in one deployment, as CloudFormation only supports one region replication
     * at a time. CDK overcomes this limitation by waiting for replication to
     * finish before starting new replicationRegion.
     *
     * If the custom resource which handles replication has a physical resource
     * ID with the format `region` instead of `tablename-region` (this would happen
     * if the custom resource hasn't received an event since v1.91.0), DO NOT SET
     * this property to false without making a change to the table name.
     * This will cause the existing replicas to be deleted.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     * @param waitForReplicationToFinish [WARNING: Use this flag with caution, misusing this flag
     * may cause deleting existing replicas, refer to the detailed documentation for more information]
     * Indicates whether CloudFormation stack waits for replication to finish. 
     */
    override fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
      cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
    }

    /**
     * Specify values to pre-warm you DynamoDB Table Warm Throughput feature is not available for
     * Global Table replicas using the `Table` construct.
     *
     * To enable Warm Throughput, use the `TableV2` construct instead.
     *
     * Default: - warm throughput is not configured
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-warmthroughput)
     * @param warmThroughput Specify values to pre-warm you DynamoDB Table Warm Throughput feature
     * is not available for Global Table replicas using the `Table` construct. 
     */
    override fun warmThroughput(warmThroughput: WarmThroughput) {
      cdkBuilder.warmThroughput(warmThroughput.let(WarmThroughput.Companion::unwrap))
    }

    /**
     * Specify values to pre-warm you DynamoDB Table Warm Throughput feature is not available for
     * Global Table replicas using the `Table` construct.
     *
     * To enable Warm Throughput, use the `TableV2` construct instead.
     *
     * Default: - warm throughput is not configured
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-warmthroughput)
     * @param warmThroughput Specify values to pre-warm you DynamoDB Table Warm Throughput feature
     * is not available for Global Table replicas using the `Table` construct. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("105c71b31b15f5e5358ec9fd11559289b782dcb520a5b0786e59497b9ee9f78b")
    override fun warmThroughput(warmThroughput: WarmThroughput.Builder.() -> Unit): Unit =
        warmThroughput(WarmThroughput(warmThroughput))

    /**
     * The write capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     *
     * @param writeCapacity The write capacity for the table. 
     */
    override fun writeCapacity(writeCapacity: Number) {
      cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.Table = cdkBuilder.build()
  }

  public companion object {
    public fun fromTableArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableArn: String,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, tableArn).let(ITable::wrap)

    public fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributes,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(TableAttributes.Companion::unwrap)).let(ITable::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62bcd05214907d2b15967422d696b87c576a19fd7d7eda43e7c503e51c260176")
    public fun fromTableAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TableAttributes.Builder.() -> Unit,
    ): ITable = fromTableAttributes(scope, id, TableAttributes(attrs))

    public fun fromTableName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      tableName: String,
    ): ITable =
        software.amazon.awscdk.services.dynamodb.Table.fromTableName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
        wrapped.cdkObject as software.amazon.awscdk.services.dynamodb.Table
  }
}
