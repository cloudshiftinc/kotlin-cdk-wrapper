@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties of a DynamoDB Table.
 *
 * Use `TableProps` for all table properties
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * InputFormat inputFormat;
 * Key key;
 * TableOptions tableOptions = TableOptions.builder()
 * .partitionKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * // the properties below are optional
 * .billingMode(BillingMode.PAY_PER_REQUEST)
 * .contributorInsightsEnabled(false)
 * .deletionProtection(false)
 * .encryption(TableEncryption.DEFAULT)
 * .encryptionKey(key)
 * .importSource(ImportSourceSpecification.builder()
 * .bucket(bucket)
 * .inputFormat(inputFormat)
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .compressionType(InputCompressionType.GZIP)
 * .keyPrefix("keyPrefix")
 * .build())
 * .pointInTimeRecovery(false)
 * .readCapacity(123)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .replicationRegions(List.of("replicationRegions"))
 * .replicationTimeout(Duration.minutes(30))
 * .sortKey(Attribute.builder()
 * .name("name")
 * .type(AttributeType.BINARY)
 * .build())
 * .stream(StreamViewType.NEW_IMAGE)
 * .tableClass(TableClass.STANDARD)
 * .timeToLiveAttribute("timeToLiveAttribute")
 * .waitForReplicationToFinish(false)
 * .writeCapacity(123)
 * .build();
 * ```
 */
public interface TableOptions : SchemaOptions {
  /**
   * Specify how you are charged for read and write throughput and how you manage capacity.
   *
   * Default: PROVISIONED if `replicationRegions` is not specified, PAY_PER_REQUEST otherwise
   */
  public fun billingMode(): BillingMode? = unwrap(this).getBillingMode()?.let(BillingMode::wrap)

  /**
   * Whether CloudWatch contributor insights is enabled.
   *
   * Default: false
   */
  public fun contributorInsightsEnabled(): Boolean? = unwrap(this).getContributorInsightsEnabled()

  /**
   * Enables deletion protection for the table.
   *
   * Default: false
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

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
   */
  public fun encryption(): TableEncryption? =
      unwrap(this).getEncryption()?.let(TableEncryption::wrap)

  /**
   * External KMS key to use for table encryption.
   *
   * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
   *
   * Default: - If `encryption` is set to `TableEncryption.CUSTOMER_MANAGED` and this
   * property is undefined, a new KMS key will be created and associated with this table.
   * If `encryption` and this property are both undefined, then the table is encrypted with
   * an encryption key managed by DynamoDB, and you are not charged any fee for using it.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The properties of data being imported from the S3 bucket source to the table.
   *
   * Default: - no data import from the S3 bucket
   */
  public fun importSource(): ImportSourceSpecification? =
      unwrap(this).getImportSource()?.let(ImportSourceSpecification::wrap)

  /**
   * Whether point-in-time recovery is enabled.
   *
   * Default: - point-in-time recovery is disabled
   */
  public fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

  /**
   * The read capacity for the table.
   *
   * Careful if you add Global Secondary Indexes, as
   * those will share the table's provisioned throughput.
   *
   * Can only be provided if billingMode is Provisioned.
   *
   * Default: 5
   */
  public fun readCapacity(): Number? = unwrap(this).getReadCapacity()

  /**
   * The removal policy to apply to the DynamoDB Table.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Regions where replica tables will be created.
   *
   * Default: - no replica tables are created
   */
  public fun replicationRegions(): List<String> = unwrap(this).getReplicationRegions() ?:
      emptyList()

  /**
   * The timeout for a table replication operation in a single region.
   *
   * Default: Duration.minutes(30)
   */
  public fun replicationTimeout(): Duration? =
      unwrap(this).getReplicationTimeout()?.let(Duration::wrap)

  /**
   * When an item in the table is modified, StreamViewType determines what information is written to
   * the stream for this table.
   *
   * Default: - streams are disabled unless `replicationRegions` is specified
   */
  public fun stream(): StreamViewType? = unwrap(this).getStream()?.let(StreamViewType::wrap)

  /**
   * Specify the table class.
   *
   * Default: STANDARD
   */
  public fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

  /**
   * The name of TTL attribute.
   *
   * Default: - TTL is disabled
   */
  public fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()

  /**
   * Indicates whether CloudFormation stack waits for replication to finish.
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
   */
  public fun waitForReplicationToFinish(): Boolean? = unwrap(this).getWaitForReplicationToFinish()

  /**
   * The write capacity for the table.
   *
   * Careful if you add Global Secondary Indexes, as
   * those will share the table's provisioned throughput.
   *
   * Can only be provided if billingMode is Provisioned.
   *
   * Default: 5
   */
  public fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()

  /**
   * A builder for [TableOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity.
     */
    public fun billingMode(billingMode: BillingMode)

    /**
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled.
     */
    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean)

    /**
     * @param deletionProtection Enables deletion protection for the table.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param encryption Whether server-side encryption with an AWS managed customer master key is
     * enabled.
     * This property cannot be set if `serverSideEncryption` is set.
     *
     *
     * **NOTE**: if you set this to `CUSTOMER_MANAGED` and `encryptionKey` is not
     * specified, the key that the Tablet generates for you will be created with
     * default permissions. If you are using CDKv2, these permissions will be
     * sufficient to enable the key for use with DynamoDB tables.  If you are
     * using CDKv1, make sure the feature flag
     * `&#64;aws-cdk/aws-kms:defaultKeyPolicies` is set to `true` in your `cdk.json`.
     */
    public fun encryption(encryption: TableEncryption)

    /**
     * @param encryptionKey External KMS key to use for table encryption.
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table.
     */
    public fun importSource(importSource: ImportSourceSpecification)

    /**
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b5a193033e54be623552e1517771253e336b6b48c749a3321b6da6737850e19")
    public fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit)

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    public fun partitionKey(partitionKey: Attribute)

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31195377ec6f837eb4c33bf17408c97e4be3240e6b715a13f257a349df6ee3d")
    public fun partitionKey(partitionKey: Attribute.Builder.() -> Unit)

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    public fun pointInTimeRecovery(pointInTimeRecovery: Boolean)

    /**
     * @param readCapacity The read capacity for the table.
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     */
    public fun readCapacity(readCapacity: Number)

    /**
     * @param removalPolicy The removal policy to apply to the DynamoDB Table.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param replicationRegions Regions where replica tables will be created.
     */
    public fun replicationRegions(replicationRegions: List<String>)

    /**
     * @param replicationRegions Regions where replica tables will be created.
     */
    public fun replicationRegions(vararg replicationRegions: String)

    /**
     * @param replicationTimeout The timeout for a table replication operation in a single region.
     */
    public fun replicationTimeout(replicationTimeout: Duration)

    /**
     * @param sortKey Sort key attribute definition.
     */
    public fun sortKey(sortKey: Attribute)

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9378946440963ef30f3dd6f5cc07deafb7ad97dfcccb381e0154d7e279efd1c")
    public fun sortKey(sortKey: Attribute.Builder.() -> Unit)

    /**
     * @param stream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream for this table.
     */
    public fun stream(stream: StreamViewType)

    /**
     * @param tableClass Specify the table class.
     */
    public fun tableClass(tableClass: TableClass)

    /**
     * @param timeToLiveAttribute The name of TTL attribute.
     */
    public fun timeToLiveAttribute(timeToLiveAttribute: String)

    /**
     * @param waitForReplicationToFinish Indicates whether CloudFormation stack waits for
     * replication to finish.
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
     */
    public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean)

    /**
     * @param writeCapacity The write capacity for the table.
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     */
    public fun writeCapacity(writeCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.TableOptions.Builder =
        software.amazon.awscdk.services.dynamodb.TableOptions.builder()

    /**
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity.
     */
    override fun billingMode(billingMode: BillingMode) {
      cdkBuilder.billingMode(billingMode.let(BillingMode::unwrap))
    }

    /**
     * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled.
     */
    override fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
      cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    /**
     * @param deletionProtection Enables deletion protection for the table.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param encryption Whether server-side encryption with an AWS managed customer master key is
     * enabled.
     * This property cannot be set if `serverSideEncryption` is set.
     *
     *
     * **NOTE**: if you set this to `CUSTOMER_MANAGED` and `encryptionKey` is not
     * specified, the key that the Tablet generates for you will be created with
     * default permissions. If you are using CDKv2, these permissions will be
     * sufficient to enable the key for use with DynamoDB tables.  If you are
     * using CDKv1, make sure the feature flag
     * `&#64;aws-cdk/aws-kms:defaultKeyPolicies` is set to `true` in your `cdk.json`.
     */
    override fun encryption(encryption: TableEncryption) {
      cdkBuilder.encryption(encryption.let(TableEncryption::unwrap))
    }

    /**
     * @param encryptionKey External KMS key to use for table encryption.
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table.
     */
    override fun importSource(importSource: ImportSourceSpecification) {
      cdkBuilder.importSource(importSource.let(ImportSourceSpecification::unwrap))
    }

    /**
     * @param importSource The properties of data being imported from the S3 bucket source to the
     * table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b5a193033e54be623552e1517771253e336b6b48c749a3321b6da6737850e19")
    override fun importSource(importSource: ImportSourceSpecification.Builder.() -> Unit): Unit =
        importSource(ImportSourceSpecification(importSource))

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    override fun partitionKey(partitionKey: Attribute) {
      cdkBuilder.partitionKey(partitionKey.let(Attribute::unwrap))
    }

    /**
     * @param partitionKey Partition key attribute definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f31195377ec6f837eb4c33bf17408c97e4be3240e6b715a13f257a349df6ee3d")
    override fun partitionKey(partitionKey: Attribute.Builder.() -> Unit): Unit =
        partitionKey(Attribute(partitionKey))

    /**
     * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
     */
    override fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
      cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
    }

    /**
     * @param readCapacity The read capacity for the table.
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     */
    override fun readCapacity(readCapacity: Number) {
      cdkBuilder.readCapacity(readCapacity)
    }

    /**
     * @param removalPolicy The removal policy to apply to the DynamoDB Table.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param replicationRegions Regions where replica tables will be created.
     */
    override fun replicationRegions(replicationRegions: List<String>) {
      cdkBuilder.replicationRegions(replicationRegions)
    }

    /**
     * @param replicationRegions Regions where replica tables will be created.
     */
    override fun replicationRegions(vararg replicationRegions: String): Unit =
        replicationRegions(replicationRegions.toList())

    /**
     * @param replicationTimeout The timeout for a table replication operation in a single region.
     */
    override fun replicationTimeout(replicationTimeout: Duration) {
      cdkBuilder.replicationTimeout(replicationTimeout.let(Duration::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    override fun sortKey(sortKey: Attribute) {
      cdkBuilder.sortKey(sortKey.let(Attribute::unwrap))
    }

    /**
     * @param sortKey Sort key attribute definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9378946440963ef30f3dd6f5cc07deafb7ad97dfcccb381e0154d7e279efd1c")
    override fun sortKey(sortKey: Attribute.Builder.() -> Unit): Unit = sortKey(Attribute(sortKey))

    /**
     * @param stream When an item in the table is modified, StreamViewType determines what
     * information is written to the stream for this table.
     */
    override fun stream(stream: StreamViewType) {
      cdkBuilder.stream(stream.let(StreamViewType::unwrap))
    }

    /**
     * @param tableClass Specify the table class.
     */
    override fun tableClass(tableClass: TableClass) {
      cdkBuilder.tableClass(tableClass.let(TableClass::unwrap))
    }

    /**
     * @param timeToLiveAttribute The name of TTL attribute.
     */
    override fun timeToLiveAttribute(timeToLiveAttribute: String) {
      cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
    }

    /**
     * @param waitForReplicationToFinish Indicates whether CloudFormation stack waits for
     * replication to finish.
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
     */
    override fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
      cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
    }

    /**
     * @param writeCapacity The write capacity for the table.
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     */
    override fun writeCapacity(writeCapacity: Number) {
      cdkBuilder.writeCapacity(writeCapacity)
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.TableOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.TableOptions,
  ) : CdkObject(cdkObject), TableOptions {
    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Default: PROVISIONED if `replicationRegions` is not specified, PAY_PER_REQUEST otherwise
     */
    override fun billingMode(): BillingMode? = unwrap(this).getBillingMode()?.let(BillingMode::wrap)

    /**
     * Whether CloudWatch contributor insights is enabled.
     *
     * Default: false
     */
    override fun contributorInsightsEnabled(): Boolean? =
        unwrap(this).getContributorInsightsEnabled()

    /**
     * Enables deletion protection for the table.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

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
     */
    override fun encryption(): TableEncryption? =
        unwrap(this).getEncryption()?.let(TableEncryption::wrap)

    /**
     * External KMS key to use for table encryption.
     *
     * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
     *
     * Default: - If `encryption` is set to `TableEncryption.CUSTOMER_MANAGED` and this
     * property is undefined, a new KMS key will be created and associated with this table.
     * If `encryption` and this property are both undefined, then the table is encrypted with
     * an encryption key managed by DynamoDB, and you are not charged any fee for using it.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The properties of data being imported from the S3 bucket source to the table.
     *
     * Default: - no data import from the S3 bucket
     */
    override fun importSource(): ImportSourceSpecification? =
        unwrap(this).getImportSource()?.let(ImportSourceSpecification::wrap)

    /**
     * Partition key attribute definition.
     */
    override fun partitionKey(): Attribute = unwrap(this).getPartitionKey().let(Attribute::wrap)

    /**
     * Whether point-in-time recovery is enabled.
     *
     * Default: - point-in-time recovery is disabled
     */
    override fun pointInTimeRecovery(): Boolean? = unwrap(this).getPointInTimeRecovery()

    /**
     * The read capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     */
    override fun readCapacity(): Number? = unwrap(this).getReadCapacity()

    /**
     * The removal policy to apply to the DynamoDB Table.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Regions where replica tables will be created.
     *
     * Default: - no replica tables are created
     */
    override fun replicationRegions(): List<String> = unwrap(this).getReplicationRegions() ?:
        emptyList()

    /**
     * The timeout for a table replication operation in a single region.
     *
     * Default: Duration.minutes(30)
     */
    override fun replicationTimeout(): Duration? =
        unwrap(this).getReplicationTimeout()?.let(Duration::wrap)

    /**
     * Sort key attribute definition.
     *
     * Default: no sort key
     */
    override fun sortKey(): Attribute? = unwrap(this).getSortKey()?.let(Attribute::wrap)

    /**
     * When an item in the table is modified, StreamViewType determines what information is written
     * to the stream for this table.
     *
     * Default: - streams are disabled unless `replicationRegions` is specified
     */
    override fun stream(): StreamViewType? = unwrap(this).getStream()?.let(StreamViewType::wrap)

    /**
     * Specify the table class.
     *
     * Default: STANDARD
     */
    override fun tableClass(): TableClass? = unwrap(this).getTableClass()?.let(TableClass::wrap)

    /**
     * The name of TTL attribute.
     *
     * Default: - TTL is disabled
     */
    override fun timeToLiveAttribute(): String? = unwrap(this).getTimeToLiveAttribute()

    /**
     * Indicates whether CloudFormation stack waits for replication to finish.
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
     */
    override fun waitForReplicationToFinish(): Boolean? =
        unwrap(this).getWaitForReplicationToFinish()

    /**
     * The write capacity for the table.
     *
     * Careful if you add Global Secondary Indexes, as
     * those will share the table's provisioned throughput.
     *
     * Can only be provided if billingMode is Provisioned.
     *
     * Default: 5
     */
    override fun writeCapacity(): Number? = unwrap(this).getWriteCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TableOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableOptions):
        TableOptions = CdkObjectWrappers.wrap(cdkObject) as? TableOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableOptions):
        software.amazon.awscdk.services.dynamodb.TableOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.TableOptions
  }
}
