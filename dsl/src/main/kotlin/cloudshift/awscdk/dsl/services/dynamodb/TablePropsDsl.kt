@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.BillingMode
import software.amazon.awscdk.services.dynamodb.StreamViewType
import software.amazon.awscdk.services.dynamodb.TableClass
import software.amazon.awscdk.services.dynamodb.TableEncryption
import software.amazon.awscdk.services.dynamodb.TableProps
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties for a DynamoDB Table.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .build();
 * IMetric metric = table.metricThrottledRequestsForOperations(OperationsMetricOptions.builder()
 * .operations(List.of(Operation.PUT_ITEM))
 * .period(Duration.minutes(1))
 * .build());
 * Alarm.Builder.create(this, "Alarm")
 * .metric(metric)
 * .evaluationPeriods(1)
 * .threshold(1)
 * .build();
 * ```
 */
@CdkDslMarker
public class TablePropsDsl {
  private val cdkBuilder: TableProps.Builder = TableProps.builder()

  private val _replicationRegions: MutableList<String> = mutableListOf()

  /**
   * @param billingMode Specify how you are charged for read and write throughput and how you manage
   * capacity.
   */
  public fun billingMode(billingMode: BillingMode) {
    cdkBuilder.billingMode(billingMode)
  }

  /**
   * @param contributorInsightsEnabled Whether CloudWatch contributor insights is enabled.
   */
  public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
    cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
  }

  /**
   * @param deletionProtection Enables deletion protection for the table.
   */
  public fun deletionProtection(deletionProtection: Boolean) {
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
  public fun encryption(encryption: TableEncryption) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryptionKey External KMS key to use for table encryption.
   * This property can only be set if `encryption` is set to `TableEncryption.CUSTOMER_MANAGED`.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param kinesisStream Kinesis Data Stream to capture item-level changes for the table.
   */
  public fun kinesisStream(kinesisStream: IStream) {
    cdkBuilder.kinesisStream(kinesisStream)
  }

  /**
   * @param partitionKey Partition key attribute definition. 
   */
  public fun partitionKey(partitionKey: AttributeDsl.() -> Unit = {}) {
    val builder = AttributeDsl()
    builder.apply(partitionKey)
    cdkBuilder.partitionKey(builder.build())
  }

  /**
   * @param partitionKey Partition key attribute definition. 
   */
  public fun partitionKey(partitionKey: Attribute) {
    cdkBuilder.partitionKey(partitionKey)
  }

  /**
   * @param pointInTimeRecovery Whether point-in-time recovery is enabled.
   */
  public fun pointInTimeRecovery(pointInTimeRecovery: Boolean) {
    cdkBuilder.pointInTimeRecovery(pointInTimeRecovery)
  }

  /**
   * @param readCapacity The read capacity for the table.
   * Careful if you add Global Secondary Indexes, as
   * those will share the table's provisioned throughput.
   *
   * Can only be provided if billingMode is Provisioned.
   */
  public fun readCapacity(readCapacity: Number) {
    cdkBuilder.readCapacity(readCapacity)
  }

  /**
   * @param removalPolicy The removal policy to apply to the DynamoDB Table.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param replicationRegions Regions where replica tables will be created.
   */
  public fun replicationRegions(vararg replicationRegions: String) {
    _replicationRegions.addAll(listOf(*replicationRegions))
  }

  /**
   * @param replicationRegions Regions where replica tables will be created.
   */
  public fun replicationRegions(replicationRegions: Collection<String>) {
    _replicationRegions.addAll(replicationRegions)
  }

  /**
   * @param replicationTimeout The timeout for a table replication operation in a single region.
   */
  public fun replicationTimeout(replicationTimeout: Duration) {
    cdkBuilder.replicationTimeout(replicationTimeout)
  }

  /**
   * @param sortKey Sort key attribute definition.
   */
  public fun sortKey(sortKey: AttributeDsl.() -> Unit = {}) {
    val builder = AttributeDsl()
    builder.apply(sortKey)
    cdkBuilder.sortKey(builder.build())
  }

  /**
   * @param sortKey Sort key attribute definition.
   */
  public fun sortKey(sortKey: Attribute) {
    cdkBuilder.sortKey(sortKey)
  }

  /**
   * @param stream When an item in the table is modified, StreamViewType determines what information
   * is written to the stream for this table.
   */
  public fun stream(stream: StreamViewType) {
    cdkBuilder.stream(stream)
  }

  /**
   * @param tableClass Specify the table class.
   */
  public fun tableClass(tableClass: TableClass) {
    cdkBuilder.tableClass(tableClass)
  }

  /**
   * @param tableName Enforces a particular physical table name.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param timeToLiveAttribute The name of TTL attribute.
   */
  public fun timeToLiveAttribute(timeToLiveAttribute: String) {
    cdkBuilder.timeToLiveAttribute(timeToLiveAttribute)
  }

  /**
   * @param waitForReplicationToFinish Indicates whether CloudFormation stack waits for replication
   * to finish.
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
  public fun waitForReplicationToFinish(waitForReplicationToFinish: Boolean) {
    cdkBuilder.waitForReplicationToFinish(waitForReplicationToFinish)
  }

  /**
   * @param writeCapacity The write capacity for the table.
   * Careful if you add Global Secondary Indexes, as
   * those will share the table's provisioned throughput.
   *
   * Can only be provided if billingMode is Provisioned.
   */
  public fun writeCapacity(writeCapacity: Number) {
    cdkBuilder.writeCapacity(writeCapacity)
  }

  public fun build(): TableProps {
    if(_replicationRegions.isNotEmpty()) cdkBuilder.replicationRegions(_replicationRegions)
    return cdkBuilder.build()
  }
}
