@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGlobalTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Object policyDocument;
 * CfnGlobalTableProps cfnGlobalTableProps = CfnGlobalTableProps.builder()
 * .attributeDefinitions(List.of(AttributeDefinitionProperty.builder()
 * .attributeName("attributeName")
 * .attributeType("attributeType")
 * .build()))
 * .keySchema(List.of(KeySchemaProperty.builder()
 * .attributeName("attributeName")
 * .keyType("keyType")
 * .build()))
 * .replicas(List.of(ReplicaSpecificationProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build())
 * .deletionProtectionEnabled(false)
 * .globalSecondaryIndexes(List.of(ReplicaGlobalSecondaryIndexSpecificationProperty.builder()
 * .indexName("indexName")
 * // the properties below are optional
 * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build())
 * .readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty.builder()
 * .readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .readCapacityUnits(123)
 * .build())
 * .build()))
 * .kinesisStreamSpecification(KinesisStreamSpecificationProperty.builder()
 * .streamArn("streamArn")
 * // the properties below are optional
 * .approximateCreationDateTimePrecision("approximateCreationDateTimePrecision")
 * .build())
 * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty.builder()
 * .pointInTimeRecoveryEnabled(false)
 * .build())
 * .readProvisionedThroughputSettings(ReadProvisionedThroughputSettingsProperty.builder()
 * .readCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .readCapacityUnits(123)
 * .build())
 * .replicaStreamSpecification(ReplicaStreamSpecificationProperty.builder()
 * .resourcePolicy(ResourcePolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .build())
 * .build())
 * .resourcePolicy(ResourcePolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .build())
 * .sseSpecification(ReplicaSSESpecificationProperty.builder()
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .build())
 * .tableClass("tableClass")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .billingMode("billingMode")
 * .globalSecondaryIndexes(List.of(GlobalSecondaryIndexProperty.builder()
 * .indexName("indexName")
 * .keySchema(List.of(KeySchemaProperty.builder()
 * .attributeName("attributeName")
 * .keyType("keyType")
 * .build()))
 * .projection(ProjectionProperty.builder()
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType("projectionType")
 * .build())
 * // the properties below are optional
 * .writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty.builder()
 * .writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .build())
 * .build()))
 * .localSecondaryIndexes(List.of(LocalSecondaryIndexProperty.builder()
 * .indexName("indexName")
 * .keySchema(List.of(KeySchemaProperty.builder()
 * .attributeName("attributeName")
 * .keyType("keyType")
 * .build()))
 * .projection(ProjectionProperty.builder()
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType("projectionType")
 * .build())
 * .build()))
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * // the properties below are optional
 * .sseType("sseType")
 * .build())
 * .streamSpecification(StreamSpecificationProperty.builder()
 * .streamViewType("streamViewType")
 * .build())
 * .tableName("tableName")
 * .timeToLiveSpecification(TimeToLiveSpecificationProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .attributeName("attributeName")
 * .build())
 * .writeProvisionedThroughputSettings(WriteProvisionedThroughputSettingsProperty.builder()
 * .writeCapacityAutoScalingSettings(CapacityAutoScalingSettingsProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * // the properties below are optional
 * .seedCapacity(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html)
 */
public interface CfnGlobalTableProps {
  /**
   * A list of attributes that describe the key schema for the global table and indexes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
   */
  public fun attributeDefinitions(): Any

  /**
   * Specifies how you are charged for read and write throughput and how you manage capacity. Valid
   * values are:.
   *
   * * `PAY_PER_REQUEST`
   * * `PROVISIONED`
   *
   * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
   * billing mode, you must provide an auto scaling configuration via the
   * `WriteProvisionedThroughputSettings` property. The default value of this property is `PROVISIONED`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-billingmode)
   */
  public fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * Global secondary indexes to be created on the global table.
   *
   * You can create up to 20 global secondary indexes. Each replica in your global table will have
   * the same global secondary index settings. You can only create or delete one global secondary index
   * in a single stack operation.
   *
   * Since the backfilling of an index could take a long time, CloudFormation does not wait for the
   * index to become active. If a stack operation rolls back, CloudFormation might not delete an index
   * that has been added. In that case, you will need to delete the index manually.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
   */
  public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  /**
   * Specifies the attributes that make up the primary key for the table.
   *
   * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
   * property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
   */
  public fun keySchema(): Any

  /**
   * Local secondary indexes to be created on the table.
   *
   * You can create up to five local secondary indexes. Each index is scoped to a given hash key
   * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table will
   * have the same local secondary index settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
   */
  public fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  /**
   * Specifies the list of replicas for your global table.
   *
   * The list must contain at least one element, the region where the stack defining the global
   * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
   * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
   * stack region.
   *
   *
   * Adding a replica might take a few minutes for an empty table, or up to several hours for large
   * tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack` operation
   * containing only that change.
   *
   * If you add or delete a replica during an update, we recommend that you don't update any other
   * resources. If your stack fails to update and is rolled back while adding a new replica, you might
   * need to manually delete the replica.
   *
   *
   * You can create a new global table with as many replicas as needed. You can add or remove
   * replicas after table creation, but you can only add or remove a single replica in each update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
   */
  public fun replicas(): Any

  /**
   * Specifies the settings to enable server-side encryption.
   *
   * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
   * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
   * property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * Specifies the streams settings on your global table.
   *
   * You must provide a value for this property if your global table contains more than one replica.
   * You can only change the streams settings if your global table has only one replica.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
   */
  public fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  /**
   * A name for the global table.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
   * table name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-tablename)
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * Specifies the time to live (TTL) settings for the table.
   *
   * This setting will be applied to all replicas.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
   */
  public fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  /**
   * Specifies an auto scaling policy for write capacity.
   *
   * This policy will be applied to all replicas. This setting must be specified if `BillingMode` is
   * set to `PROVISIONED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
   */
  public fun writeProvisionedThroughputSettings(): Any? =
      unwrap(this).getWriteProvisionedThroughputSettings()

  /**
   * A builder for [CfnGlobalTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    /**
     * @param billingMode Specifies how you are charged for read and write throughput and how you
     * manage capacity. Valid values are:.
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     */
    public fun billingMode(billingMode: String)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    public fun keySchema(keySchema: IResolvable)

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    public fun keySchema(keySchema: List<Any>)

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    public fun keySchema(vararg keySchema: Any)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    public fun replicas(replicas: IResolvable)

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    public fun replicas(replicas: List<Any>)

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    public fun replicas(vararg replicas: Any)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    public fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e1503ea99565c1db8e633f38c3a2fe8395ca4d2ede3fcbab2b7f5468da16fe")
    public
        fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty.Builder.() -> Unit)

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    public fun streamSpecification(streamSpecification: IResolvable)

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    public fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty)

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4f9b31fb0659ae8acbde94b33870b3a9b0ea251163265714a8659f838ca2139")
    public
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tableName A name for the global table.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun tableName(tableName: String)

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty)

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d07074555f98035fd07bcadc9bbbe0e53b333c641fbf0359ddedec23f7e5be9")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder.() -> Unit)

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable)

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty)

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a8836677ce2db7a810bf48b9e8c73d2a52c6d895be759c5c431b863602fc213")
    public
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.builder()

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     * table and indexes. 
     */
    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

    /**
     * @param billingMode Specifies how you are charged for read and write throughput and how you
     * manage capacity. Valid values are:.
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     */
    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     */
    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    override fun replicas(replicas: IResolvable) {
      cdkBuilder.replicas(replicas.let(IResolvable::unwrap))
    }

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    override fun replicas(replicas: List<Any>) {
      cdkBuilder.replicas(replicas.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param replicas Specifies the list of replicas for your global table. 
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     */
    override fun replicas(vararg replicas: Any): Unit = replicas(replicas.toList())

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    override fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnGlobalTable.SSESpecificationProperty::unwrap))
    }

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e1503ea99565c1db8e633f38c3a2fe8395ca4d2ede3fcbab2b7f5468da16fe")
    override
        fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnGlobalTable.SSESpecificationProperty(sseSpecification))

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    override
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(CfnGlobalTable.StreamSpecificationProperty::unwrap))
    }

    /**
     * @param streamSpecification Specifies the streams settings on your global table.
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4f9b31fb0659ae8acbde94b33870b3a9b0ea251163265714a8659f838ca2139")
    override
        fun streamSpecification(streamSpecification: CfnGlobalTable.StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(CfnGlobalTable.StreamSpecificationProperty(streamSpecification))

    /**
     * @param tableName A name for the global table.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(CfnGlobalTable.TimeToLiveSpecificationProperty::unwrap))
    }

    /**
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     * This setting will be applied to all replicas.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d07074555f98035fd07bcadc9bbbe0e53b333c641fbf0359ddedec23f7e5be9")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit =
        timeToLiveSpecification(CfnGlobalTable.TimeToLiveSpecificationProperty(timeToLiveSpecification))

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(IResolvable::unwrap))
    }

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty) {
      cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.let(CfnGlobalTable.WriteProvisionedThroughputSettingsProperty::unwrap))
    }

    /**
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     * capacity.
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a8836677ce2db7a810bf48b9e8c73d2a52c6d895be759c5c431b863602fc213")
    override
        fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
        Unit =
        writeProvisionedThroughputSettings(CfnGlobalTable.WriteProvisionedThroughputSettingsProperty(writeProvisionedThroughputSettings))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps,
  ) : CdkObject(cdkObject), CfnGlobalTableProps {
    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     */
    override fun attributeDefinitions(): Any = unwrap(this).getAttributeDefinitions()

    /**
     * Specifies how you are charged for read and write throughput and how you manage capacity.
     * Valid values are:.
     *
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-billingmode)
     */
    override fun billingMode(): String? = unwrap(this).getBillingMode()

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete an
     * index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     */
    override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     */
    override fun keySchema(): Any = unwrap(this).getKeySchema()

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     */
    override fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1, you
     * must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica in the
     * stack region.
     *
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an `UpdateStack`
     * operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     */
    override fun replicas(): Any = unwrap(this).getReplicas()

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the `ReplicaSpecification.ReplicaSSESpecification`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     */
    override fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

    /**
     * A name for the global table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-tablename)
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     */
    override fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     */
    override fun writeProvisionedThroughputSettings(): Any? =
        unwrap(this).getWriteProvisionedThroughputSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps):
        CfnGlobalTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGlobalTableProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalTableProps):
        software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
  }
}
