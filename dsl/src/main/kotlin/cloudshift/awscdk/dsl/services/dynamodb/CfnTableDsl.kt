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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.constructs.Construct

/**
 * The `AWS::DynamoDB::Table` resource creates a DynamoDB table. For more information, see
 * [CreateTable](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_CreateTable.html)
 * in the *Amazon DynamoDB API Reference* .
 *
 * You should be aware of the following behaviors when working with DynamoDB tables:
 * * AWS CloudFormation typically creates DynamoDB tables in parallel. However, if your template
 *   includes multiple DynamoDB tables with indexes, you must declare dependencies so that the
 *   tables are created sequentially. Amazon DynamoDB limits the number of tables with secondary
 *   indexes that are in the creating state. If you create multiple tables with indexes at the same
 *   time, DynamoDB returns an error and the stack operation fails. For an example, see
 *   [DynamoDB Table with a DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#aws-resource-dynamodb-table--examples--DynamoDB_Table_with_a_DependsOn_Attribute)
 *   .
 *
 * Our guidance is to use the latest schema documented here for your AWS CloudFormation templates.
 * This schema supports the provisioning of all table settings below. When using this schema in your
 * AWS CloudFormation templates, please ensure that your Identity and Access Management ( IAM )
 * policies are updated with appropriate permissions to allow for the authorization of these setting
 * changes.
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
@CdkDslMarker
public class CfnTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

    private val _attributeDefinitions: MutableList<Any> = mutableListOf()

    private val _globalSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _keySchema: MutableList<Any> = mutableListOf()

    private val _localSecondaryIndexes: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of attributes that describe the key schema for the table and indexes.
     *
     * This property is required to create a DynamoDB table.
     *
     * Update requires:
     * [Some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     *   and indexes.
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any) {
        _attributeDefinitions.addAll(listOf(*attributeDefinitions))
    }

    /**
     * A list of attributes that describe the key schema for the table and indexes.
     *
     * This property is required to create a DynamoDB table.
     *
     * Update requires:
     * [Some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     *   and indexes.
     */
    public fun attributeDefinitions(attributeDefinitions: Collection<Any>) {
        _attributeDefinitions.addAll(attributeDefinitions)
    }

    /**
     * A list of attributes that describe the key schema for the table and indexes.
     *
     * This property is required to create a DynamoDB table.
     *
     * Update requires:
     * [Some interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedefinitions)
     *
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     *   and indexes.
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable) {
        cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Valid values include:
     * * `PROVISIONED` - We recommend using `PROVISIONED` for predictable workloads. `PROVISIONED`
     *   sets the billing mode to
     *   [Provisioned Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual)
     *   .
     * * `PAY_PER_REQUEST` - We recommend using `PAY_PER_REQUEST` for unpredictable workloads.
     *   `PAY_PER_REQUEST` sets the billing mode to
     *   [On-Demand Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand)
     *   .
     *
     * If not specified, the default is `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode)
     *
     * @param billingMode Specify how you are charged for read and write throughput and how you
     *   manage capacity.
     */
    public fun billingMode(billingMode: String) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     *
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified table.
     */
    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     *
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     *   Contributor Insights for the specified table.
     */
    public fun contributorInsightsSpecification(
        contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty
    ) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification)
    }

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see
     * [Using deletion protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     *
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see
     * [Using deletion protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     *
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
        cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * Global secondary indexes to be created on the table. You can create up to 20 global secondary
     * indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait
     * for the index to complete creation because the backfilling phase can take a long time,
     * depending on the size of the table. You can't use the index or update the table until the
     * index's status is `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you
     * must manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     * * If you update either the contributor insights specification or the provisioned throughput
     *   values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     *   the same update (for example, by changing the index's logical ID), the update fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     *   create up to 20 global secondary indexes.
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any) {
        _globalSecondaryIndexes.addAll(listOf(*globalSecondaryIndexes))
    }

    /**
     * Global secondary indexes to be created on the table. You can create up to 20 global secondary
     * indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait
     * for the index to complete creation because the backfilling phase can take a long time,
     * depending on the size of the table. You can't use the index or update the table until the
     * index's status is `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you
     * must manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     * * If you update either the contributor insights specification or the provisioned throughput
     *   values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     *   the same update (for example, by changing the index's logical ID), the update fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     *   create up to 20 global secondary indexes.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: Collection<Any>) {
        _globalSecondaryIndexes.addAll(globalSecondaryIndexes)
    }

    /**
     * Global secondary indexes to be created on the table. You can create up to 20 global secondary
     * indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait
     * for the index to complete creation because the backfilling phase can take a long time,
     * depending on the size of the table. You can't use the index or update the table until the
     * index's status is `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you
     * must manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     * * If you update either the contributor insights specification or the provisioned throughput
     *   values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     *   the same update (for example, by changing the index's logical ID), the update fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-globalsecondaryindexes)
     *
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     *   create up to 20 global secondary indexes.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
        cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

    /**
     * Specifies the properties of data being imported from the S3 bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled`
     * property, the IAM entity creating/updating stack must have `UpdateTable` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-importsourcespecification)
     *
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     *   bucket source to the table.
     */
    public fun importSourceSpecification(importSourceSpecification: IResolvable) {
        cdkBuilder.importSourceSpecification(importSourceSpecification)
    }

    /**
     * Specifies the properties of data being imported from the S3 bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled`
     * property, the IAM entity creating/updating stack must have `UpdateTable` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-importsourcespecification)
     *
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     *   bucket source to the table.
     */
    public fun importSourceSpecification(
        importSourceSpecification: CfnTable.ImportSourceSpecificationProperty
    ) {
        cdkBuilder.importSourceSpecification(importSourceSpecification)
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     */
    public fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema)
    }

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     *
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     *   table.
     */
    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     *
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     *   table.
     */
    public fun kinesisStreamSpecification(
        kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty
    ) {
        cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any) {
        _localSecondaryIndexes.addAll(listOf(*localSecondaryIndexes))
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: Collection<Any>) {
        _localSecondaryIndexes.addAll(localSecondaryIndexes)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     *
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
        cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     *
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     *
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    public fun pointInTimeRecoverySpecification(
        pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty
    ) {
        cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification)
    }

    /**
     * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
     * `WriteCapacityUnits` .
     *
     * For more information about the contents of a provisioned throughput structure, see
     * [Amazon DynamoDB Table ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
     *
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     *   `ReadCapacityUnits` and `WriteCapacityUnits` .
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
     * `WriteCapacityUnits` .
     *
     * For more information about the contents of a provisioned throughput structure, see
     * [Amazon DynamoDB Table ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
     *
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     *   `ReadCapacityUnits` and `WriteCapacityUnits` .
     */
    public fun provisionedThroughput(
        provisionedThroughput: CfnTable.ProvisionedThroughputProperty
    ) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     *
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     *
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     *
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     *   to items stored in the table.
     */
    public fun streamSpecification(streamSpecification: IResolvable) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     *
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     *   to items stored in the table.
     */
    public fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty) {
        cdkBuilder.streamSpecification(streamSpecification)
    }

    /**
     * The table class of the new table.
     *
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tableclass)
     *
     * @param tableClass The table class of the new table.
     */
    public fun tableClass(tableClass: String) {
        cdkBuilder.tableClass(tableClass)
    }

    /**
     * A name for the table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the table name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
     *
     * @param tableName A name for the table.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see
     * [Limits in Amazon DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html)
     * in the Amazon DynamoDB Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
     *
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    /**
     * Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see
     * [Limits in Amazon DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html)
     * in the Amazon DynamoDB Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
     *
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     */
    public fun timeToLiveSpecification(
        timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty
    ) {
        cdkBuilder.timeToLiveSpecification(timeToLiveSpecification)
    }

    public fun build(): CfnTable {
        if (_attributeDefinitions.isNotEmpty())
            cdkBuilder.attributeDefinitions(_attributeDefinitions)
        if (_globalSecondaryIndexes.isNotEmpty())
            cdkBuilder.globalSecondaryIndexes(_globalSecondaryIndexes)
        if (_keySchema.isNotEmpty()) cdkBuilder.keySchema(_keySchema)
        if (_localSecondaryIndexes.isNotEmpty())
            cdkBuilder.localSecondaryIndexes(_localSecondaryIndexes)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
