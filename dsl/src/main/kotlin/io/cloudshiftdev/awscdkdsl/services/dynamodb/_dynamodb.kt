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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.CfnTableProps
import software.amazon.awscdk.services.dynamodb.EnableScalingProps
import software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.LocalSecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.OperationsMetricOptions
import software.amazon.awscdk.services.dynamodb.SchemaOptions
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps
import software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableAttributes
import software.amazon.awscdk.services.dynamodb.TableOptions
import software.amazon.awscdk.services.dynamodb.TableProps
import software.amazon.awscdk.services.dynamodb.UtilizationScalingProps
import software.constructs.Construct

public object dynamodb {
    /**
     * Represents an attribute for describing the key schema for the table and indexes.
     *
     * Example:
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
    public inline fun attribute(block: AttributeDsl.() -> Unit = {}): Attribute {
        val builder = AttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DynamoDB::GlobalTable` resource enables you to create and manage a Version
     * 2019.11.21 global table. This resource cannot be used to create or manage a Version
     * 2017.11.29 global table. For more information, see
     * [Global tables](https://docs.aws.amazon.com//amazondynamodb/latest/developerguide/GlobalTables.html)
     * .
     *
     * You cannot convert a resource of type `AWS::DynamoDB::Table` into a resource of type
     * `AWS::DynamoDB::GlobalTable` by changing its type in your template. *Doing so might result in
     * the deletion of your DynamoDB table.*
     *
     * You can instead use the GlobalTable resource to create a new table in a single Region. This
     * will be billed the same as a single Region table. If you later update the stack to add other
     * Regions then Global Tables pricing will apply.
     *
     * You should be aware of the following behaviors when working with DynamoDB global tables.
     * * The IAM Principal executing the stack operation must have the permissions listed below in
     *   all regions where you plan to have a global table replica. The IAM Principal's permissions
     *   should not have restrictions based on IP source address. Some global tables operations (for
     *   example, adding a replica) are asynchronous, and require that the IAM Principal is valid
     *   until they complete. You should not delete the Principal (user or IAM role) until
     *   CloudFormation has finished updating your stack.
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
     * * When using provisioned billing mode, CloudFormation will create an auto scaling policy on
     *   each of your replicas to control their write capacities. You must configure this policy
     *   using the `WriteProvisionedThroughputSettings` property. CloudFormation will ensure that
     *   all replicas have the same write capacity auto scaling property. You cannot directly
     *   specify a value for write capacity for a global table.
     * * If your table uses provisioned capacity, you must configure auto scaling directly in the
     *   `AWS::DynamoDB::GlobalTable` resource. You should not configure additional auto scaling
     *   policies on any of the table replicas or global secondary indexes, either via API or via
     *   `AWS::ApplicationAutoScaling::ScalableTarget` or
     *   `AWS::ApplicationAutoScaling::ScalingPolicy` . Doing so might result in unexpected behavior
     *   and is unsupported.
     * * In AWS CloudFormation , each global table is controlled by a single stack, in a single
     *   region, regardless of the number of replicas. When you deploy your template, CloudFormation
     *   will create/update all replicas as part of a single stack operation. You should not deploy
     *   the same `AWS::DynamoDB::GlobalTable` resource in multiple regions. Doing so will result in
     *   errors, and is unsupported. If you deploy your application template in multiple regions,
     *   you can use conditions to only create the resource in a single region. Alternatively, you
     *   can choose to define your `AWS::DynamoDB::GlobalTable` resources in a stack separate from
     *   your application stack, and make sure it is only deployed to a single region.
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
    public inline fun cfnGlobalTable(
        scope: Construct,
        id: String,
        block: CfnGlobalTableDsl.() -> Unit = {},
    ): CfnGlobalTable {
        val builder = CfnGlobalTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an attribute for describing the key schema for the table and indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * AttributeDefinitionProperty attributeDefinitionProperty = AttributeDefinitionProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-attributedefinition.html)
     */
    public inline fun cfnGlobalTableAttributeDefinitionProperty(
        block: CfnGlobalTableAttributeDefinitionPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.AttributeDefinitionProperty {
        val builder = CfnGlobalTableAttributeDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures a scalable target and an autoscaling policy for a table or global secondary
     * index's read or write capacity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * CapacityAutoScalingSettingsProperty capacityAutoScalingSettingsProperty =
     * CapacityAutoScalingSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-capacityautoscalingsettings.html)
     */
    public inline fun cfnGlobalTableCapacityAutoScalingSettingsProperty(
        block: CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.CapacityAutoScalingSettingsProperty {
        val builder = CfnGlobalTableCapacityAutoScalingSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures contributor insights settings for a replica or one of its indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ContributorInsightsSpecificationProperty contributorInsightsSpecificationProperty =
     * ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-contributorinsightsspecification.html)
     */
    public inline fun cfnGlobalTableContributorInsightsSpecificationProperty(
        block: CfnGlobalTableContributorInsightsSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ContributorInsightsSpecificationProperty {
        val builder = CfnGlobalTableContributorInsightsSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to specify a global secondary index for the global table.
     *
     * The index will be defined on all replicas.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * GlobalSecondaryIndexProperty globalSecondaryIndexProperty =
     * GlobalSecondaryIndexProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-globalsecondaryindex.html)
     */
    public inline fun cfnGlobalTableGlobalSecondaryIndexProperty(
        block: CfnGlobalTableGlobalSecondaryIndexPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.GlobalSecondaryIndexProperty {
        val builder = CfnGlobalTableGlobalSecondaryIndexPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents *a single element* of a key schema.
     *
     * A key schema specifies the attributes that make up the primary key of a table, or the key
     * attributes of an index.
     *
     * A `KeySchemaElement` represents exactly one attribute of the primary key. For example, a
     * simple primary key would be represented by one `KeySchemaElement` (for the partition key). A
     * composite primary key would require one `KeySchemaElement` for the partition key, and another
     * `KeySchemaElement` for the sort key.
     *
     * A `KeySchemaElement` must be a scalar, top-level attribute (not a nested attribute). The data
     * type must be one of String, Number, or Binary. The attribute cannot be nested within a List
     * or a Map.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * KeySchemaProperty keySchemaProperty = KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-keyschema.html)
     */
    public inline fun cfnGlobalTableKeySchemaProperty(
        block: CfnGlobalTableKeySchemaPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.KeySchemaProperty {
        val builder = CfnGlobalTableKeySchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Kinesis Data Streams configuration for the specified global table replica.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * KinesisStreamSpecificationProperty kinesisStreamSpecificationProperty =
     * KinesisStreamSpecificationProperty.builder()
     * .streamArn("streamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html)
     */
    public inline fun cfnGlobalTableKinesisStreamSpecificationProperty(
        block: CfnGlobalTableKinesisStreamSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.KinesisStreamSpecificationProperty {
        val builder = CfnGlobalTableKinesisStreamSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of a local secondary index.
     *
     * A local secondary index can only be created when its parent table is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * LocalSecondaryIndexProperty localSecondaryIndexProperty = LocalSecondaryIndexProperty.builder()
     * .indexName("indexName")
     * .keySchema(List.of(KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build()))
     * .projection(ProjectionProperty.builder()
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType("projectionType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-localsecondaryindex.html)
     */
    public inline fun cfnGlobalTableLocalSecondaryIndexProperty(
        block: CfnGlobalTableLocalSecondaryIndexPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.LocalSecondaryIndexProperty {
        val builder = CfnGlobalTableLocalSecondaryIndexPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the settings used to enable point in time recovery.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * PointInTimeRecoverySpecificationProperty pointInTimeRecoverySpecificationProperty =
     * PointInTimeRecoverySpecificationProperty.builder()
     * .pointInTimeRecoveryEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-pointintimerecoveryspecification.html)
     */
    public inline fun cfnGlobalTablePointInTimeRecoverySpecificationProperty(
        block: CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.PointInTimeRecoverySpecificationProperty {
        val builder = CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents attributes that are copied (projected) from the table into an index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ProjectionProperty projectionProperty = ProjectionProperty.builder()
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType("projectionType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-projection.html)
     */
    public inline fun cfnGlobalTableProjectionProperty(
        block: CfnGlobalTableProjectionPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ProjectionProperty {
        val builder = CfnGlobalTableProjectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGlobalTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
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
    public inline fun cfnGlobalTableProps(
        block: CfnGlobalTablePropsDsl.() -> Unit = {}
    ): CfnGlobalTableProps {
        val builder = CfnGlobalTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to specify the read capacity settings for a replica table or a replica global
     * secondary index when the `BillingMode` is set to `PROVISIONED` .
     *
     * You must specify a value for either `ReadCapacityUnits` or `ReadCapacityAutoScalingSettings`
     * , but not both. You can switch between fixed capacity and auto scaling.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ReadProvisionedThroughputSettingsProperty readProvisionedThroughputSettingsProperty =
     * ReadProvisionedThroughputSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-readprovisionedthroughputsettings.html)
     */
    public inline fun cfnGlobalTableReadProvisionedThroughputSettingsProperty(
        block: CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ReadProvisionedThroughputSettingsProperty {
        val builder = CfnGlobalTableReadProvisionedThroughputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of a global secondary index that can be set on a per-replica basis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ReplicaGlobalSecondaryIndexSpecificationProperty
     * replicaGlobalSecondaryIndexSpecificationProperty =
     * ReplicaGlobalSecondaryIndexSpecificationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaglobalsecondaryindexspecification.html)
     */
    public inline fun cfnGlobalTableReplicaGlobalSecondaryIndexSpecificationProperty(
        block: CfnGlobalTableReplicaGlobalSecondaryIndexSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ReplicaGlobalSecondaryIndexSpecificationProperty {
        val builder = CfnGlobalTableReplicaGlobalSecondaryIndexSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allows you to specify a KMS key identifier to be used for server-side encryption.
     *
     * The key can be specified via ARN, key ID, or alias. The key must be created in the same
     * region as the replica.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ReplicaSSESpecificationProperty replicaSSESpecificationProperty =
     * ReplicaSSESpecificationProperty.builder()
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicassespecification.html)
     */
    public inline fun cfnGlobalTableReplicaSSESpecificationProperty(
        block: CfnGlobalTableReplicaSSESpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ReplicaSSESpecificationProperty {
        val builder = CfnGlobalTableReplicaSSESpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines settings specific to a single replica of a global table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ReplicaSpecificationProperty replicaSpecificationProperty =
     * ReplicaSpecificationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-replicaspecification.html)
     */
    public inline fun cfnGlobalTableReplicaSpecificationProperty(
        block: CfnGlobalTableReplicaSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.ReplicaSpecificationProperty {
        val builder = CfnGlobalTableReplicaSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the settings used to enable server-side encryption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * // the properties below are optional
     * .sseType("sseType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-ssespecification.html)
     */
    public inline fun cfnGlobalTableSSESpecificationProperty(
        block: CfnGlobalTableSSESpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.SSESpecificationProperty {
        val builder = CfnGlobalTableSSESpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the DynamoDB Streams configuration for a table in DynamoDB.
     *
     * You can only modify this value if your `AWS::DynamoDB::GlobalTable` contains only one entry
     * in `Replicas` . You must specify a value for this property if your
     * `AWS::DynamoDB::GlobalTable` contains more than one replica.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * StreamSpecificationProperty streamSpecificationProperty = StreamSpecificationProperty.builder()
     * .streamViewType("streamViewType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-streamspecification.html)
     */
    public inline fun cfnGlobalTableStreamSpecificationProperty(
        block: CfnGlobalTableStreamSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.StreamSpecificationProperty {
        val builder = CfnGlobalTableStreamSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a target tracking scaling policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * TargetTrackingScalingPolicyConfigurationProperty
     * targetTrackingScalingPolicyConfigurationProperty =
     * TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-targettrackingscalingpolicyconfiguration.html)
     */
    public inline fun cfnGlobalTableTargetTrackingScalingPolicyConfigurationProperty(
        block: CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty {
        val builder = CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
     *
     * All replicas will have the same time to live configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * TimeToLiveSpecificationProperty timeToLiveSpecificationProperty =
     * TimeToLiveSpecificationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeName("attributeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-timetolivespecification.html)
     */
    public inline fun cfnGlobalTableTimeToLiveSpecificationProperty(
        block: CfnGlobalTableTimeToLiveSpecificationPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.TimeToLiveSpecificationProperty {
        val builder = CfnGlobalTableTimeToLiveSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an auto scaling policy for write capacity.
     *
     * This policy will be applied to all replicas. This setting must be specified if `BillingMode`
     * is set to `PROVISIONED` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * WriteProvisionedThroughputSettingsProperty writeProvisionedThroughputSettingsProperty =
     * WriteProvisionedThroughputSettingsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-writeprovisionedthroughputsettings.html)
     */
    public inline fun cfnGlobalTableWriteProvisionedThroughputSettingsProperty(
        block: CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl.() -> Unit = {}
    ): CfnGlobalTable.WriteProvisionedThroughputSettingsProperty {
        val builder = CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::DynamoDB::Table` resource creates a DynamoDB table. For more information, see
     * [CreateTable](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_CreateTable.html)
     * in the *Amazon DynamoDB API Reference* .
     *
     * You should be aware of the following behaviors when working with DynamoDB tables:
     * * AWS CloudFormation typically creates DynamoDB tables in parallel. However, if your template
     *   includes multiple DynamoDB tables with indexes, you must declare dependencies so that the
     *   tables are created sequentially. Amazon DynamoDB limits the number of tables with secondary
     *   indexes that are in the creating state. If you create multiple tables with indexes at the
     *   same time, DynamoDB returns an error and the stack operation fails. For an example, see
     *   [DynamoDB Table with a DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#aws-resource-dynamodb-table--examples--DynamoDB_Table_with_a_DependsOn_Attribute)
     *   .
     *
     * Our guidance is to use the latest schema documented here for your AWS CloudFormation
     * templates. This schema supports the provisioning of all table settings below. When using this
     * schema in your AWS CloudFormation templates, please ensure that your Identity and Access
     * Management ( IAM ) policies are updated with appropriate permissions to allow for the
     * authorization of these setting changes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
     * .keySchema(List.of(KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build()))
     * // the properties below are optional
     * .attributeDefinitions(List.of(AttributeDefinitionProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build()))
     * .billingMode("billingMode")
     * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build())
     * .deletionProtectionEnabled(false)
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
     * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build()))
     * .importSourceSpecification(ImportSourceSpecificationProperty.builder()
     * .inputFormat("inputFormat")
     * .s3BucketSource(S3BucketSourceProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3BucketOwner("s3BucketOwner")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * // the properties below are optional
     * .inputCompressionType("inputCompressionType")
     * .inputFormatOptions(InputFormatOptionsProperty.builder()
     * .csv(CsvProperty.builder()
     * .delimiter("delimiter")
     * .headerList(List.of("headerList"))
     * .build())
     * .build())
     * .build())
     * .kinesisStreamSpecification(KinesisStreamSpecificationProperty.builder()
     * .streamArn("streamArn")
     * .build())
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
     * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty.builder()
     * .pointInTimeRecoveryEnabled(false)
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .sseSpecification(SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .sseType("sseType")
     * .build())
     * .streamSpecification(StreamSpecificationProperty.builder()
     * .streamViewType("streamViewType")
     * .build())
     * .tableClass("tableClass")
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeToLiveSpecification(TimeToLiveSpecificationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeName("attributeName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html)
     */
    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an attribute for describing the key schema for the table and indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * AttributeDefinitionProperty attributeDefinitionProperty = AttributeDefinitionProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html)
     */
    public inline fun cfnTableAttributeDefinitionProperty(
        block: CfnTableAttributeDefinitionPropertyDsl.() -> Unit = {}
    ): CfnTable.AttributeDefinitionProperty {
        val builder = CfnTableAttributeDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ContributorInsightsSpecificationProperty contributorInsightsSpecificationProperty =
     * ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-contributorinsightsspecification.html)
     */
    public inline fun cfnTableContributorInsightsSpecificationProperty(
        block: CfnTableContributorInsightsSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.ContributorInsightsSpecificationProperty {
        val builder = CfnTableContributorInsightsSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for imported source files in CSV format.
     *
     * The values are Delimiter and HeaderList.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * CsvProperty csvProperty = CsvProperty.builder()
     * .delimiter("delimiter")
     * .headerList(List.of("headerList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html)
     */
    public inline fun cfnTableCsvProperty(
        block: CfnTableCsvPropertyDsl.() -> Unit = {}
    ): CfnTable.CsvProperty {
        val builder = CfnTableCsvPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of a global secondary index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * GlobalSecondaryIndexProperty globalSecondaryIndexProperty =
     * GlobalSecondaryIndexProperty.builder()
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
     * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html)
     */
    public inline fun cfnTableGlobalSecondaryIndexProperty(
        block: CfnTableGlobalSecondaryIndexPropertyDsl.() -> Unit = {}
    ): CfnTable.GlobalSecondaryIndexProperty {
        val builder = CfnTableGlobalSecondaryIndexPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the properties of data being imported from the S3 bucket source to the table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ImportSourceSpecificationProperty importSourceSpecificationProperty =
     * ImportSourceSpecificationProperty.builder()
     * .inputFormat("inputFormat")
     * .s3BucketSource(S3BucketSourceProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3BucketOwner("s3BucketOwner")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * // the properties below are optional
     * .inputCompressionType("inputCompressionType")
     * .inputFormatOptions(InputFormatOptionsProperty.builder()
     * .csv(CsvProperty.builder()
     * .delimiter("delimiter")
     * .headerList(List.of("headerList"))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html)
     */
    public inline fun cfnTableImportSourceSpecificationProperty(
        block: CfnTableImportSourceSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.ImportSourceSpecificationProperty {
        val builder = CfnTableImportSourceSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The format options for the data that was imported into the target table.
     *
     * There is one value, CsvOption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * InputFormatOptionsProperty inputFormatOptionsProperty = InputFormatOptionsProperty.builder()
     * .csv(CsvProperty.builder()
     * .delimiter("delimiter")
     * .headerList(List.of("headerList"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-inputformatoptions.html)
     */
    public inline fun cfnTableInputFormatOptionsProperty(
        block: CfnTableInputFormatOptionsPropertyDsl.() -> Unit = {}
    ): CfnTable.InputFormatOptionsProperty {
        val builder = CfnTableInputFormatOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents *a single element* of a key schema.
     *
     * A key schema specifies the attributes that make up the primary key of a table, or the key
     * attributes of an index.
     *
     * A `KeySchemaElement` represents exactly one attribute of the primary key. For example, a
     * simple primary key would be represented by one `KeySchemaElement` (for the partition key). A
     * composite primary key would require one `KeySchemaElement` for the partition key, and another
     * `KeySchemaElement` for the sort key.
     *
     * A `KeySchemaElement` must be a scalar, top-level attribute (not a nested attribute). The data
     * type must be one of String, Number, or Binary. The attribute cannot be nested within a List
     * or a Map.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * KeySchemaProperty keySchemaProperty = KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html)
     */
    public inline fun cfnTableKeySchemaProperty(
        block: CfnTableKeySchemaPropertyDsl.() -> Unit = {}
    ): CfnTable.KeySchemaProperty {
        val builder = CfnTableKeySchemaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * KinesisStreamSpecificationProperty kinesisStreamSpecificationProperty =
     * KinesisStreamSpecificationProperty.builder()
     * .streamArn("streamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html)
     */
    public inline fun cfnTableKinesisStreamSpecificationProperty(
        block: CfnTableKinesisStreamSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.KinesisStreamSpecificationProperty {
        val builder = CfnTableKinesisStreamSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the properties of a local secondary index.
     *
     * A local secondary index can only be created when its parent table is created.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * LocalSecondaryIndexProperty localSecondaryIndexProperty = LocalSecondaryIndexProperty.builder()
     * .indexName("indexName")
     * .keySchema(List.of(KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build()))
     * .projection(ProjectionProperty.builder()
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType("projectionType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html)
     */
    public inline fun cfnTableLocalSecondaryIndexProperty(
        block: CfnTableLocalSecondaryIndexPropertyDsl.() -> Unit = {}
    ): CfnTable.LocalSecondaryIndexProperty {
        val builder = CfnTableLocalSecondaryIndexPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings used to enable point in time recovery.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * PointInTimeRecoverySpecificationProperty pointInTimeRecoverySpecificationProperty =
     * PointInTimeRecoverySpecificationProperty.builder()
     * .pointInTimeRecoveryEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html)
     */
    public inline fun cfnTablePointInTimeRecoverySpecificationProperty(
        block: CfnTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.PointInTimeRecoverySpecificationProperty {
        val builder = CfnTablePointInTimeRecoverySpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents attributes that are copied (projected) from the table into an index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ProjectionProperty projectionProperty = ProjectionProperty.builder()
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType("projectionType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html)
     */
    public inline fun cfnTableProjectionProperty(
        block: CfnTableProjectionPropertyDsl.() -> Unit = {}
    ): CfnTable.ProjectionProperty {
        val builder = CfnTableProjectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * CfnTableProps cfnTableProps = CfnTableProps.builder()
     * .keySchema(List.of(KeySchemaProperty.builder()
     * .attributeName("attributeName")
     * .keyType("keyType")
     * .build()))
     * // the properties below are optional
     * .attributeDefinitions(List.of(AttributeDefinitionProperty.builder()
     * .attributeName("attributeName")
     * .attributeType("attributeType")
     * .build()))
     * .billingMode("billingMode")
     * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build())
     * .deletionProtectionEnabled(false)
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
     * .contributorInsightsSpecification(ContributorInsightsSpecificationProperty.builder()
     * .enabled(false)
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build()))
     * .importSourceSpecification(ImportSourceSpecificationProperty.builder()
     * .inputFormat("inputFormat")
     * .s3BucketSource(S3BucketSourceProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3BucketOwner("s3BucketOwner")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * // the properties below are optional
     * .inputCompressionType("inputCompressionType")
     * .inputFormatOptions(InputFormatOptionsProperty.builder()
     * .csv(CsvProperty.builder()
     * .delimiter("delimiter")
     * .headerList(List.of("headerList"))
     * .build())
     * .build())
     * .build())
     * .kinesisStreamSpecification(KinesisStreamSpecificationProperty.builder()
     * .streamArn("streamArn")
     * .build())
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
     * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty.builder()
     * .pointInTimeRecoveryEnabled(false)
     * .build())
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .sseSpecification(SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .sseType("sseType")
     * .build())
     * .streamSpecification(StreamSpecificationProperty.builder()
     * .streamViewType("streamViewType")
     * .build())
     * .tableClass("tableClass")
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .timeToLiveSpecification(TimeToLiveSpecificationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeName("attributeName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html)
     */
    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
     * `WriteCapacityUnits` .
     *
     * For more information about the contents of a provisioned throughput structure, see
     * [Amazon DynamoDB Table ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * ProvisionedThroughputProperty provisionedThroughputProperty =
     * ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html)
     */
    public inline fun cfnTableProvisionedThroughputProperty(
        block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit = {}
    ): CfnTable.ProvisionedThroughputProperty {
        val builder = CfnTableProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The S3 bucket that is being imported from.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * S3BucketSourceProperty s3BucketSourceProperty = S3BucketSourceProperty.builder()
     * .s3Bucket("s3Bucket")
     * // the properties below are optional
     * .s3BucketOwner("s3BucketOwner")
     * .s3KeyPrefix("s3KeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html)
     */
    public inline fun cfnTableS3BucketSourceProperty(
        block: CfnTableS3BucketSourcePropertyDsl.() -> Unit = {}
    ): CfnTable.S3BucketSourceProperty {
        val builder = CfnTableS3BucketSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the settings used to enable server-side encryption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
     * .sseEnabled(false)
     * // the properties below are optional
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .sseType("sseType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html)
     */
    public inline fun cfnTableSSESpecificationProperty(
        block: CfnTableSSESpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.SSESpecificationProperty {
        val builder = CfnTableSSESpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the DynamoDB Streams configuration for a table in DynamoDB.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * StreamSpecificationProperty streamSpecificationProperty = StreamSpecificationProperty.builder()
     * .streamViewType("streamViewType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-streamspecification.html)
     */
    public inline fun cfnTableStreamSpecificationProperty(
        block: CfnTableStreamSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.StreamSpecificationProperty {
        val builder = CfnTableStreamSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * TimeToLiveSpecificationProperty timeToLiveSpecificationProperty =
     * TimeToLiveSpecificationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .attributeName("attributeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-timetolivespecification.html)
     */
    public inline fun cfnTableTimeToLiveSpecificationProperty(
        block: CfnTableTimeToLiveSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.TimeToLiveSpecificationProperty {
        val builder = CfnTableTimeToLiveSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling DynamoDB capacity scaling.
     *
     * Example:
     * ```
     * Table globalTable = Table.Builder.create(this, "Table")
     * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
     * .replicationRegions(List.of("us-east-1", "us-east-2", "us-west-2"))
     * .billingMode(BillingMode.PROVISIONED)
     * .build();
     * globalTable.autoScaleWriteCapacity(EnableScalingProps.builder()
     * .minCapacity(1)
     * .maxCapacity(10)
     * .build()).scaleOnUtilization(UtilizationScalingProps.builder().targetUtilizationPercent(75).build());
     * ```
     */
    public inline fun enableScalingProps(
        block: EnableScalingPropsDsl.() -> Unit = {}
    ): EnableScalingProps {
        val builder = EnableScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a global secondary index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * GlobalSecondaryIndexProps globalSecondaryIndexProps = GlobalSecondaryIndexProps.builder()
     * .indexName("indexName")
     * .partitionKey(Attribute.builder()
     * .name("name")
     * .type(AttributeType.BINARY)
     * .build())
     * // the properties below are optional
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType(ProjectionType.KEYS_ONLY)
     * .readCapacity(123)
     * .sortKey(Attribute.builder()
     * .name("name")
     * .type(AttributeType.BINARY)
     * .build())
     * .writeCapacity(123)
     * .build();
     * ```
     */
    public inline fun globalSecondaryIndexProps(
        block: GlobalSecondaryIndexPropsDsl.() -> Unit = {}
    ): GlobalSecondaryIndexProps {
        val builder = GlobalSecondaryIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a local secondary index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * LocalSecondaryIndexProps localSecondaryIndexProps = LocalSecondaryIndexProps.builder()
     * .indexName("indexName")
     * .sortKey(Attribute.builder()
     * .name("name")
     * .type(AttributeType.BINARY)
     * .build())
     * // the properties below are optional
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType(ProjectionType.KEYS_ONLY)
     * .build();
     * ```
     */
    public inline fun localSecondaryIndexProps(
        block: LocalSecondaryIndexPropsDsl.() -> Unit = {}
    ): LocalSecondaryIndexProps {
        val builder = LocalSecondaryIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring metrics that considers multiple operations.
     *
     * Example:
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
    public inline fun operationsMetricOptions(
        block: OperationsMetricOptionsDsl.() -> Unit = {}
    ): OperationsMetricOptions {
        val builder = OperationsMetricOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents the table schema attributes.
     *
     * Example:
     * ```
     * Table table;
     * SchemaOptions schema = table.schema();
     * Attribute partitionKey = schema.getPartitionKey();
     * Attribute sortKey = schema.getSortKey();
     * ```
     */
    public inline fun schemaOptions(block: SchemaOptionsDsl.() -> Unit = {}): SchemaOptions {
        val builder = SchemaOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a secondary index.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * SecondaryIndexProps secondaryIndexProps = SecondaryIndexProps.builder()
     * .indexName("indexName")
     * // the properties below are optional
     * .nonKeyAttributes(List.of("nonKeyAttributes"))
     * .projectionType(ProjectionType.KEYS_ONLY)
     * .build();
     * ```
     */
    public inline fun secondaryIndexProps(
        block: SecondaryIndexPropsDsl.() -> Unit = {}
    ): SecondaryIndexProps {
        val builder = SecondaryIndexPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring a system errors metric that considers multiple operations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * import software.amazon.awscdk.services.dynamodb.*;
     * SystemErrorsForOperationsMetricOptions systemErrorsForOperationsMetricOptions =
     * SystemErrorsForOperationsMetricOptions.builder()
     * .account("account")
     * .color("color")
     * .dimensionsMap(Map.of(
     * "dimensionsMapKey", "dimensionsMap"))
     * .label("label")
     * .operations(List.of(Operation.GET_ITEM))
     * .period(Duration.minutes(30))
     * .region("region")
     * .statistic("statistic")
     * .unit(Unit.SECONDS)
     * .build();
     * ```
     */
    public inline fun systemErrorsForOperationsMetricOptions(
        block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit = {}
    ): SystemErrorsForOperationsMetricOptions {
        val builder = SystemErrorsForOperationsMetricOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides a DynamoDB table.
     *
     * Example:
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
    public inline fun table(
        scope: Construct,
        id: String,
        block: TableDsl.() -> Unit = {},
    ): Table {
        val builder = TableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to a dynamodb table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.dynamodb.*;
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * TableAttributes tableAttributes = TableAttributes.builder()
     * .encryptionKey(key)
     * .globalIndexes(List.of("globalIndexes"))
     * .grantIndexPermissions(false)
     * .localIndexes(List.of("localIndexes"))
     * .tableArn("tableArn")
     * .tableName("tableName")
     * .tableStreamArn("tableStreamArn")
     * .build();
     * ```
     */
    public inline fun tableAttributes(block: TableAttributesDsl.() -> Unit = {}): TableAttributes {
        val builder = TableAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a DynamoDB Table.
     *
     * Use `TableProps` for all table properties
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.dynamodb.*;
     * import software.amazon.awscdk.services.kms.*;
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
    public inline fun tableOptions(block: TableOptionsDsl.() -> Unit = {}): TableOptions {
        val builder = TableOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a DynamoDB Table.
     *
     * Example:
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
    public inline fun tableProps(block: TablePropsDsl.() -> Unit = {}): TableProps {
        val builder = TablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for enabling DynamoDB utilization tracking.
     *
     * Example:
     * ```
     * Table globalTable = Table.Builder.create(this, "Table")
     * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
     * .replicationRegions(List.of("us-east-1", "us-east-2", "us-west-2"))
     * .billingMode(BillingMode.PROVISIONED)
     * .build();
     * globalTable.autoScaleWriteCapacity(EnableScalingProps.builder()
     * .minCapacity(1)
     * .maxCapacity(10)
     * .build()).scaleOnUtilization(UtilizationScalingProps.builder().targetUtilizationPercent(75).build());
     * ```
     */
    public inline fun utilizationScalingProps(
        block: UtilizationScalingPropsDsl.() -> Unit = {}
    ): UtilizationScalingProps {
        val builder = UtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
