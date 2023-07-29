@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.constructs.Construct

/**
 * The `AWS::DynamoDB::GlobalTable` resource enables you to create and manage a Version 2019.11.21
 * global table. This resource cannot be used to create or manage a Version 2017.11.29 global table.
 * For more information, see
 * [Global tables](https://docs.aws.amazon.com//amazondynamodb/latest/developerguide/GlobalTables.html)
 * .
 *
 * You cannot convert a resource of type `AWS::DynamoDB::Table` into a resource of type
 * `AWS::DynamoDB::GlobalTable` by changing its type in your template. *Doing so might result in the
 * deletion of your DynamoDB table.*
 *
 * You can instead use the GlobalTable resource to create a new table in a single Region. This will
 * be billed the same as a single Region table. If you later update the stack to add other Regions
 * then Global Tables pricing will apply.
 *
 * You should be aware of the following behaviors when working with DynamoDB global tables.
 * * The IAM Principal executing the stack operation must have the permissions listed below in all
 *   regions where you plan to have a global table replica. The IAM Principal's permissions should
 *   not have restrictions based on IP source address. Some global tables operations (for example,
 *   adding a replica) are asynchronous, and require that the IAM Principal is valid until they
 *   complete. You should not delete the Principal (user or IAM role) until CloudFormation has
 *   finished updating your stack.
 * * `dynamodb:CreateTable`
 * * `dynamodb:UpdateTable`
 * * `dynamodb:DeleteTable`
 * * `dynamodb:DescribeContinuousBackups`
 * * `dynamodb:DescribeContributorInsights`
 * * `dynamodb:DescribeTable`
 * * `dynamodb:DescribeTableReplicaAutoScaling`
 * * `dynamodb:DescribeTimeToLive`
 * * `dynamodb:ListTables`
 * * `dynamodb:UpdateTimeToLive`
 * * `dynamodb:UpdateContributorInsights`
 * * `dynamodb:UpdateContinuousBackups`
 * * `dynamodb:ListTagsOfResource`
 * * `dynamodb:TableClass`
 * * `dynamodb:TagResource`
 * * `dynamodb:UntagResource`
 * * `dynamodb:BatchWriteItem`
 * * `dynamodb:CreateTableReplica`
 * * `dynamodb:DeleteItem`
 * * `dynamodb:DeleteTableReplica`
 * * `dynamodb:DisableKinesisStreamingDestination`
 * * `dynamodb:EnableKinesisStreamingDestination`
 * * `dynamodb:GetItem`
 * * `dynamodb:PutItem`
 * * `dynamodb:Query`
 * * `dynamodb:Scan`
 * * `dynamodb:UpdateItem`
 * * `dynamodb:DescribeTableReplicaAutoScaling`
 * * `dynamodb:UpdateTableReplicaAutoScaling`
 * * `iam:CreateServiceLinkedRole`
 * * `kms:CreateGrant`
 * * `kms:DescribeKey`
 * * `application-autoscaling:DeleteScalingPolicy`
 * * `application-autoscaling:DeleteScheduledAction`
 * * `application-autoscaling:DeregisterScalableTarget`
 * * `application-autoscaling:DescribeScalingPolicies`
 * * `application-autoscaling:DescribeScalableTargets`
 * * `application-autoscaling:PutScalingPolicy`
 * * `application-autoscaling:PutScheduledAction`
 * * `application-autoscaling:RegisterScalableTarget`
 * * When using provisioned billing mode, CloudFormation will create an auto scaling policy on each
 *   of your replicas to control their write capacities. You must configure this policy using the
 *   `WriteProvisionedThroughputSettings` property. CloudFormation will ensure that all replicas
 *   have the same write capacity auto scaling property. You cannot directly specify a value for
 *   write capacity for a global table.
 * * If your table uses provisioned capacity, you must configure auto scaling directly in the
 *   `AWS::DynamoDB::GlobalTable` resource. You should not configure additional auto scaling
 *   policies on any of the table replicas or global secondary indexes, either via API or via
 *   `AWS::ApplicationAutoScaling::ScalableTarget` or `AWS::ApplicationAutoScaling::ScalingPolicy` .
 *   Doing so might result in unexpected behavior and is unsupported.
 * * In AWS CloudFormation , each global table is controlled by a single stack, in a single region,
 *   regardless of the number of replicas. When you deploy your template, CloudFormation will
 *   create/update all replicas as part of a single stack operation. You should not deploy the same
 *   `AWS::DynamoDB::GlobalTable` resource in multiple regions. Doing so will result in errors, and
 *   is unsupported. If you deploy your application template in multiple regions, you can use
 *   conditions to only create the resource in a single region. Alternatively, you can choose to
 *   define your `AWS::DynamoDB::GlobalTable` resources in a stack separate from your application
 *   stack, and make sure it is only deployed to a single region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * CfnGlobalTable cfnGlobalTable = CfnGlobalTable.Builder.create(this, "MyCfnGlobalTable")
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
@CdkDslMarker
public class CfnGlobalTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGlobalTable.Builder = CfnGlobalTable.Builder.create(scope, id)

    private val _attributeDefinitions: MutableList<Any> = mutableListOf()

    private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _keySchema: MutableList<Any> = mutableListOf()

    private val _localSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _replicas: MutableList<Any> = mutableListOf()

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     *   table and indexes.
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any) {
        _attributeDefinitions.addAll(listOf(*attributeDefinitions))
    }

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     *   table and indexes.
     */
    public fun attributeDefinitions(attributeDefinitions: Collection<Any>) {
        _attributeDefinitions.addAll(attributeDefinitions)
    }

    /**
     * A list of attributes that describe the key schema for the global table and indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the global
     *   table and indexes.
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable) {
        cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    /**
     * Specifies how you are charged for read and write throughput and how you manage capacity.
     * Valid values are:.
     * * `PAY_PER_REQUEST`
     * * `PROVISIONED`
     *
     * All replicas in your global table will have the same billing mode. If you use `PROVISIONED`
     * billing mode, you must provide an auto scaling configuration via the
     * `WriteProvisionedThroughputSettings` property. The default value of this property is
     * `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-billingmode)
     *
     * @param billingMode Specifies how you are charged for read and write throughput and how you
     *   manage capacity. Valid values are:.
     */
    public fun billingMode(billingMode: String) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete
     * an index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
        _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete
     * an index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    /**
     * Global secondary indexes to be created on the global table.
     *
     * You can create up to 20 global secondary indexes. Each replica in your global table will have
     * the same global secondary index settings. You can only create or delete one global secondary
     * index in a single stack operation.
     *
     * Since the backfilling of an index could take a long time, CloudFormation does not wait for
     * the index to become active. If a stack operation rolls back, CloudFormation might not delete
     * an index that has been added. In that case, you will need to delete the index manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the global table.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     */
    public fun keySchema(vararg keySchema: Any) {
        _keySchema.addAll(listOf(*keySchema))
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     */
    public fun keySchema(keySchema: Collection<Any>) {
        _keySchema.addAll(keySchema)
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-keyschema)
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     */
    public fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any) {
        _localSecondaryIndexes.addAll(listOf(*localSecondaryIndexes))
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: Collection<Any>) {
        _localSecondaryIndexes.addAll(localSecondaryIndexes)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to five local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes. Each replica in your global table
     * will have the same local secondary index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
        cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1,
     * you must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica
     * in the stack region.
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an
     * `UpdateStack` operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     *
     * @param replicas Specifies the list of replicas for your global table.
     */
    public fun replicas(vararg replicas: Any) {
        _replicas.addAll(listOf(*replicas))
    }

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1,
     * you must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica
     * in the stack region.
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an
     * `UpdateStack` operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     *
     * @param replicas Specifies the list of replicas for your global table.
     */
    public fun replicas(replicas: Collection<Any>) {
        _replicas.addAll(replicas)
    }

    /**
     * Specifies the list of replicas for your global table.
     *
     * The list must contain at least one element, the region where the stack defining the global
     * table is deployed. For example, if you define your table in a stack deployed to us-east-1,
     * you must have an entry in `Replicas` with the region us-east-1. You cannot remove the replica
     * in the stack region.
     *
     * Adding a replica might take a few minutes for an empty table, or up to several hours for
     * large tables. If you want to add or remove a replica, we recommend submitting an
     * `UpdateStack` operation containing only that change.
     *
     * If you add or delete a replica during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new replica, you
     * might need to manually delete the replica.
     *
     * You can create a new global table with as many replicas as needed. You can add or remove
     * replicas after table creation, but you can only add or remove a single replica in each
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-replicas)
     *
     * @param replicas Specifies the list of replicas for your global table.
     */
    public fun replicas(replicas: IResolvable) {
        cdkBuilder.replicas(replicas)
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the
     * `ReplicaSpecification.ReplicaSSESpecification` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     *
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * These settings will be applied to all replicas. If you plan to use customer-managed KMS keys,
     * you must provide a key for each replica using the
     * `ReplicaSpecification.ReplicaSSESpecification` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-ssespecification)
     *
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: CfnGlobalTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     *
     * @param streamSpecification Specifies the streams settings on your global table.
     */
    public fun streamSpecification(streamSpecification: IResolvable) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    /**
     * Specifies the streams settings on your global table.
     *
     * You must provide a value for this property if your global table contains more than one
     * replica. You can only change the streams settings if your global table has only one replica.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-streamspecification)
     *
     * @param streamSpecification Specifies the streams settings on your global table.
     */
    public fun streamSpecification(
        streamSpecification: CfnGlobalTable.StreamSpecificationProperty
    ) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    /**
     * A name for the global table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID as the
     * table name. For more information, see
     * [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-tablename)
     *
     * @param tableName A name for the global table.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     *
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    /**
     * Specifies the time to live (TTL) settings for the table.
     *
     * This setting will be applied to all replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-timetolivespecification)
     *
     * @param timeToLiveSpecification Specifies the time to live (TTL) settings for the table.
     */
    public fun timeToLiveSpecification(
        timeToLiveSpecification: CfnGlobalTable.TimeToLiveSpecificationProperty
    ) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     *
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     *   capacity.
     */
    public fun writeProvisionedThroughputSettings(writeProvisionedThroughputSettings: IResolvable) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-globaltable.html#cfn-dynamodb-globaltable-writeprovisionedthroughputsettings)
     *
     * @param writeProvisionedThroughputSettings Specifies an auto scaling policy for write
     *   capacity.
     */
    public fun writeProvisionedThroughputSettings(
        writeProvisionedThroughputSettings:
            CfnGlobalTable.WriteProvisionedThroughputSettingsProperty
    ) {
        cdkBuilder.writeProvisionedThroughputSettings(writeProvisionedThroughputSettings)
    }

    public fun build(): CfnGlobalTable {
        if (_attributeDefinitions.isNotEmpty())
            cdkBuilder.attributeDefinitions(_attributeDefinitions)
        if (_globalSecondaryIndexes.isNotEmpty())
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        if (_localSecondaryIndexes.isNotEmpty())
            cdkBuilder.localSecondaryIndexes(_localSecondaryIndexes)
        if (_replicas.isNotEmpty()) cdkBuilder.replicas(_replicas)
        return cdkBuilder.build()
    }
}
