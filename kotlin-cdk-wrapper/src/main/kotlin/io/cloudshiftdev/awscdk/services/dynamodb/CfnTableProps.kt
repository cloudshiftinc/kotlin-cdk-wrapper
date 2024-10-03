@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Object policyDocument;
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
 * .onDemandThroughput(OnDemandThroughputProperty.builder()
 * .maxReadRequestUnits(123)
 * .maxWriteRequestUnits(123)
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
 * // the properties below are optional
 * .approximateCreationDateTimePrecision("approximateCreationDateTimePrecision")
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
 * .onDemandThroughput(OnDemandThroughputProperty.builder()
 * .maxReadRequestUnits(123)
 * .maxWriteRequestUnits(123)
 * .build())
 * .pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty.builder()
 * .pointInTimeRecoveryEnabled(false)
 * .build())
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .readCapacityUnits(123)
 * .writeCapacityUnits(123)
 * .build())
 * .resourcePolicy(ResourcePolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .build())
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * // the properties below are optional
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .sseType("sseType")
 * .build())
 * .streamSpecification(StreamSpecificationProperty.builder()
 * .streamViewType("streamViewType")
 * // the properties below are optional
 * .resourcePolicy(ResourcePolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .build())
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
public interface CfnTableProps {
  /**
   * A list of attributes that describe the key schema for the table and indexes.
   *
   * This property is required to create a DynamoDB table.
   *
   * Update requires: [Some
   * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
   * . Replacement if you edit an existing AttributeDefinition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedefinitions)
   */
  public fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

  /**
   * Specify how you are charged for read and write throughput and how you manage capacity.
   *
   * Valid values include:
   *
   * * `PROVISIONED` - We recommend using `PROVISIONED` for predictable workloads. `PROVISIONED`
   * sets the billing mode to [Provisioned
   * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual)
   * .
   * * `PAY_PER_REQUEST` - We recommend using `PAY_PER_REQUEST` for unpredictable workloads.
   * `PAY_PER_REQUEST` sets the billing mode to [On-Demand
   * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand)
   * .
   *
   * If not specified, the default is `PROVISIONED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode)
   */
  public fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
   */
  public fun contributorInsightsSpecification(): Any? =
      unwrap(this).getContributorInsightsSpecification()

  /**
   * Determines if a table is protected from deletion.
   *
   * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
   * default. For more information, see [Using deletion
   * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
   * in the *Amazon DynamoDB Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
   */
  public fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  /**
   * Global secondary indexes to be created on the table. You can create up to 20 global secondary
   * indexes.
   *
   *
   * If you update a table to include a new global secondary index, AWS CloudFormation initiates the
   * index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for the
   * index to complete creation because the backfilling phase can take a long time, depending on the
   * size of the table. You can't use the index or update the table until the index's status is
   * `ACTIVE` . You can track its status by using the DynamoDB
   * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
   * command.
   *
   * If you add or delete an index during an update, we recommend that you don't update any other
   * resources. If your stack fails to update and is rolled back while adding a new index, you must
   * manually delete the index.
   *
   * Updates are not supported. The following are exceptions:
   *
   * * If you update either the contributor insights specification or the provisioned throughput
   * values of global secondary indexes, you can update the table without interruption.
   * * You can delete or add one global secondary index without interruption. If you do both in the
   * same update (for example, by changing the index's logical ID), the update fails.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-globalsecondaryindexes)
   */
  public fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   *
   *
   * If you specify the `ImportSourceSpecification` property, and also specify either the
   * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
   * the IAM entity creating/updating stack must have `UpdateTable` permission.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-importsourcespecification)
   */
  public fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

  /**
   * Specifies the attributes that make up the primary key for the table.
   *
   * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
   * property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
   */
  public fun keySchema(): Any

  /**
   * The Kinesis Data Streams configuration for the specified table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
   */
  public fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

  /**
   * Local secondary indexes to be created on the table.
   *
   * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key value.
   * The size of each hash key can be up to 10 gigabytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
   */
  public fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  /**
   * Sets the maximum number of read and write units for the specified on-demand table.
   *
   * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` , or
   * both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ondemandthroughput)
   */
  public fun onDemandThroughput(): Any? = unwrap(this).getOnDemandThroughput()

  /**
   * The settings used to enable point in time recovery.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
   */
  public fun pointInTimeRecoverySpecification(): Any? =
      unwrap(this).getPointInTimeRecoverySpecification()

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   *
   * For more information about the contents of a provisioned throughput structure, see [Amazon
   * DynamoDB Table
   * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
   * .
   *
   * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
   * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
   */
  public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  /**
   * A resource-based policy document that contains permissions to add to the specified table.
   *
   * In a CloudFormation template, you can provide the policy in JSON or YAML format because
   * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information about
   * resource-based policies, see [Using resource-based policies for
   * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
   * and [Resource-based policy
   * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
   *
   * When you attach a resource-based policy while creating a table, the policy creation is
   * *strongly consistent* . For information about the considerations that you should keep in mind
   * while attaching a resource-based policy, see [Resource-based policy
   * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
   */
  public fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

  /**
   * Specifies the settings to enable server-side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
   */
  public fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  /**
   * The table class of the new table.
   *
   * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tableclass)
   */
  public fun tableClass(): String? = unwrap(this).getTableClass()

  /**
   * A name for the table.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the table name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the Time to Live (TTL) settings for the table.
   *
   *
   * For detailed information about the limits in DynamoDB, see [Limits in Amazon
   * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
   * Amazon DynamoDB Developer Guide.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
   */
  public fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  /**
   * A builder for [CfnTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    public fun attributeDefinitions(attributeDefinitions: List<Any>)

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any)

    /**
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity.
     * Valid values include:
     *
     * * `PROVISIONED` - We recommend using `PROVISIONED` for predictable workloads. `PROVISIONED`
     * sets the billing mode to [Provisioned
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual)
     * .
     * * `PAY_PER_REQUEST` - We recommend using `PAY_PER_REQUEST` for unpredictable workloads.
     * `PAY_PER_REQUEST` sets the billing mode to [On-Demand
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand)
     * .
     *
     * If not specified, the default is `PROVISIONED` .
     */
    public fun billingMode(billingMode: String)

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty)

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1644175a1c61b50768b3c763c697b7e8547a4ca008ed780d5a622061281063d")
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty.Builder.() -> Unit)

    /**
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    /**
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    public fun importSourceSpecification(importSourceSpecification: IResolvable)

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    public
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty)

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcfa4b8b3fb01671f8a472422d5bd789be1593d7487e0f98b1d617e0645a214e")
    public
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty.Builder.() -> Unit)

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
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

    /**
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty)

    /**
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5545f2eff26e32d19027ab689ca7eaf9191a4441f9db3ea3cb083a8c2f56d")
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    public fun onDemandThroughput(onDemandThroughput: IResolvable)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    public fun onDemandThroughput(onDemandThroughput: CfnTable.OnDemandThroughputProperty)

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc718963042c53d725537d46f01dd6981e8cf3c1c5ce260b1ef47d116d832b4e")
    public
        fun onDemandThroughput(onDemandThroughput: CfnTable.OnDemandThroughputProperty.Builder.() -> Unit)

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty)

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2250375551145bd7288d51c1502890121e3bcf6df7830522d1458980b0ebe40")
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable)

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    public fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty)

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9a9a02708658c9ae241699a945ae841cd09bf4fe303863b1431bdcfc7edcf5c")
    public
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit)

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    public fun resourcePolicy(resourcePolicy: IResolvable)

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    public fun resourcePolicy(resourcePolicy: CfnTable.ResourcePolicyProperty)

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10e80221d99cc74afc329f0fd4a910679ebd3c01b9d358a32301040ee1b08a26")
    public fun resourcePolicy(resourcePolicy: CfnTable.ResourcePolicyProperty.Builder.() -> Unit)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    public fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty)

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a481891b9640fd468b95afe711468471315e15742dd89b43ecfd37efbf8554")
    public
        fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty.Builder.() -> Unit)

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    public fun streamSpecification(streamSpecification: IResolvable)

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    public fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty)

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d2f865f7c33aa163d77d7474b75c0a467e6d3e662eef7765229b5c6e8d8951")
    public
        fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tableClass The table class of the new table.
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     */
    public fun tableClass(tableClass: String)

    /**
     * @param tableName A name for the table.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the table name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun tableName(tableName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty)

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("538d06314b2d8f6c9f1ad9a4139ade75fa91cbf0137fb6283ebc5f4aabeae1d6")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTableProps.Builder =
        software.amazon.awscdk.services.dynamodb.CfnTableProps.builder()

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes.
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     */
    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

    /**
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity.
     * Valid values include:
     *
     * * `PROVISIONED` - We recommend using `PROVISIONED` for predictable workloads. `PROVISIONED`
     * sets the billing mode to [Provisioned
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual)
     * .
     * * `PAY_PER_REQUEST` - We recommend using `PAY_PER_REQUEST` for unpredictable workloads.
     * `PAY_PER_REQUEST` sets the billing mode to [On-Demand
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand)
     * .
     *
     * If not specified, the default is `PROVISIONED` .
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(CfnTable.ContributorInsightsSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1644175a1c61b50768b3c763c697b7e8547a4ca008ed780d5a622061281063d")
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: CfnTable.ContributorInsightsSpecificationProperty.Builder.() -> Unit):
        Unit =
        contributorInsightsSpecification(CfnTable.ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

    /**
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * @param deletionProtectionEnabled Determines if a table is protected from deletion.
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes.
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     */
    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    override fun importSourceSpecification(importSourceSpecification: IResolvable) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    override
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(CfnTable.ImportSourceSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table.
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fcfa4b8b3fb01671f8a472422d5bd789be1593d7487e0f98b1d617e0645a214e")
    override
        fun importSourceSpecification(importSourceSpecification: CfnTable.ImportSourceSpecificationProperty.Builder.() -> Unit):
        Unit =
        importSourceSpecification(CfnTable.ImportSourceSpecificationProperty(importSourceSpecification))

    /**
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     */
    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable.Companion::unwrap))
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
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    override fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(CfnTable.KinesisStreamSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70d5545f2eff26e32d19027ab689ca7eaf9191a4441f9db3ea3cb083a8c2f56d")
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: CfnTable.KinesisStreamSpecificationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSpecification(CfnTable.KinesisStreamSpecificationProperty(kinesisStreamSpecification))

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param localSecondaryIndexes Local secondary indexes to be created on the table.
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     */
    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    override fun onDemandThroughput(onDemandThroughput: IResolvable) {
      cdkBuilder.onDemandThroughput(onDemandThroughput.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    override fun onDemandThroughput(onDemandThroughput: CfnTable.OnDemandThroughputProperty) {
      cdkBuilder.onDemandThroughput(onDemandThroughput.let(CfnTable.OnDemandThroughputProperty.Companion::unwrap))
    }

    /**
     * @param onDemandThroughput Sets the maximum number of read and write units for the specified
     * on-demand table.
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cc718963042c53d725537d46f01dd6981e8cf3c1c5ce260b1ef47d116d832b4e")
    override
        fun onDemandThroughput(onDemandThroughput: CfnTable.OnDemandThroughputProperty.Builder.() -> Unit):
        Unit = onDemandThroughput(CfnTable.OnDemandThroughputProperty(onDemandThroughput))

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    override fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(CfnTable.PointInTimeRecoverySpecificationProperty.Companion::unwrap))
    }

    /**
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2250375551145bd7288d51c1502890121e3bcf6df7830522d1458980b0ebe40")
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: CfnTable.PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
        Unit =
        pointInTimeRecoverySpecification(CfnTable.PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    override
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(CfnTable.ProvisionedThroughputProperty.Companion::unwrap))
    }

    /**
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` .
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9a9a02708658c9ae241699a945ae841cd09bf4fe303863b1431bdcfc7edcf5c")
    override
        fun provisionedThroughput(provisionedThroughput: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(CfnTable.ProvisionedThroughputProperty(provisionedThroughput))

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    override fun resourcePolicy(resourcePolicy: IResolvable) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    override fun resourcePolicy(resourcePolicy: CfnTable.ResourcePolicyProperty) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(CfnTable.ResourcePolicyProperty.Companion::unwrap))
    }

    /**
     * @param resourcePolicy A resource-based policy document that contains permissions to add to
     * the specified table.
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10e80221d99cc74afc329f0fd4a910679ebd3c01b9d358a32301040ee1b08a26")
    override fun resourcePolicy(resourcePolicy: CfnTable.ResourcePolicyProperty.Builder.() -> Unit):
        Unit = resourcePolicy(CfnTable.ResourcePolicyProperty(resourcePolicy))

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    override fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnTable.SSESpecificationProperty.Companion::unwrap))
    }

    /**
     * @param sseSpecification Specifies the settings to enable server-side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71a481891b9640fd468b95afe711468471315e15742dd89b43ecfd37efbf8554")
    override
        fun sseSpecification(sseSpecification: CfnTable.SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnTable.SSESpecificationProperty(sseSpecification))

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    override fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(CfnTable.StreamSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82d2f865f7c33aa163d77d7474b75c0a467e6d3e662eef7765229b5c6e8d8951")
    override
        fun streamSpecification(streamSpecification: CfnTable.StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(CfnTable.StreamSpecificationProperty(streamSpecification))

    /**
     * @param tableClass The table class of the new table.
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     */
    override fun tableClass(tableClass: String) {
      cdkBuilder.tableClass(tableClass)
    }

    /**
     * @param tableName A name for the table.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the table name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
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
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(CfnTable.TimeToLiveSpecificationProperty.Companion::unwrap))
    }

    /**
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table.
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("538d06314b2d8f6c9f1ad9a4139ade75fa91cbf0137fb6283ebc5f4aabeae1d6")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: CfnTable.TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit =
        timeToLiveSpecification(CfnTable.TimeToLiveSpecificationProperty(timeToLiveSpecification))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.CfnTableProps,
  ) : CdkObject(cdkObject),
      CfnTableProps {
    /**
     * A list of attributes that describe the key schema for the table and indexes.
     *
     * This property is required to create a DynamoDB table.
     *
     * Update requires: [Some
     * interruptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-some-interrupt)
     * . Replacement if you edit an existing AttributeDefinition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-attributedefinitions)
     */
    override fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

    /**
     * Specify how you are charged for read and write throughput and how you manage capacity.
     *
     * Valid values include:
     *
     * * `PROVISIONED` - We recommend using `PROVISIONED` for predictable workloads. `PROVISIONED`
     * sets the billing mode to [Provisioned
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.ProvisionedThroughput.Manual)
     * .
     * * `PAY_PER_REQUEST` - We recommend using `PAY_PER_REQUEST` for unpredictable workloads.
     * `PAY_PER_REQUEST` sets the billing mode to [On-Demand
     * Mode](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.OnDemand)
     * .
     *
     * If not specified, the default is `PROVISIONED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-billingmode)
     */
    override fun billingMode(): String? = unwrap(this).getBillingMode()

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     */
    override fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     */
    override fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

    /**
     * Global secondary indexes to be created on the table. You can create up to 20 global secondary
     * indexes.
     *
     *
     * If you update a table to include a new global secondary index, AWS CloudFormation initiates
     * the index creation and then proceeds with the stack update. AWS CloudFormation doesn't wait for
     * the index to complete creation because the backfilling phase can take a long time, depending on
     * the size of the table. You can't use the index or update the table until the index's status is
     * `ACTIVE` . You can track its status by using the DynamoDB
     * [DescribeTable](https://docs.aws.amazon.com/cli/latest/reference/dynamodb/describe-table.html)
     * command.
     *
     * If you add or delete an index during an update, we recommend that you don't update any other
     * resources. If your stack fails to update and is rolled back while adding a new index, you must
     * manually delete the index.
     *
     * Updates are not supported. The following are exceptions:
     *
     * * If you update either the contributor insights specification or the provisioned throughput
     * values of global secondary indexes, you can update the table without interruption.
     * * You can delete or add one global secondary index without interruption. If you do both in
     * the same update (for example, by changing the index's logical ID), the update fails.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-globalsecondaryindexes)
     */
    override fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

    /**
     * Specifies the properties of data being imported from the S3 bucket source to the table.
     *
     *
     * If you specify the `ImportSourceSpecification` property, and also specify either the
     * `StreamSpecification` , the `TableClass` property, or the `DeletionProtectionEnabled` property,
     * the IAM entity creating/updating stack must have `UpdateTable` permission.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-importsourcespecification)
     */
    override fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     */
    override fun keySchema(): Any = unwrap(this).getKeySchema()

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     */
    override fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     */
    override fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

    /**
     * Sets the maximum number of read and write units for the specified on-demand table.
     *
     * If you use this property, you must specify `MaxReadRequestUnits` , `MaxWriteRequestUnits` ,
     * or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ondemandthroughput)
     */
    override fun onDemandThroughput(): Any? = unwrap(this).getOnDemandThroughput()

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     */
    override fun pointInTimeRecoverySpecification(): Any? =
        unwrap(this).getPointInTimeRecoverySpecification()

    /**
     * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
     * `WriteCapacityUnits` .
     *
     * For more information about the contents of a provisioned throughput structure, see [Amazon
     * DynamoDB Table
     * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
     * .
     *
     * If you set `BillingMode` as `PROVISIONED` , you must specify this property. If you set
     * `BillingMode` as `PAY_PER_REQUEST` , you cannot specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-provisionedthroughput)
     */
    override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * A resource-based policy document that contains permissions to add to the specified table.
     *
     * In a CloudFormation template, you can provide the policy in JSON or YAML format because
     * CloudFormation converts YAML to JSON before submitting it to DynamoDB . For more information
     * about resource-based policies, see [Using resource-based policies for
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/access-control-resource-based.html)
     * and [Resource-based policy
     * examples](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-examples.html) .
     *
     * When you attach a resource-based policy while creating a table, the policy creation is
     * *strongly consistent* . For information about the considerations that you should keep in mind
     * while attaching a resource-based policy, see [Resource-based policy
     * considerations](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/rbac-considerations.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-resourcepolicy)
     */
    override fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     */
    override fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

    /**
     * The table class of the new table.
     *
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tableclass)
     */
    override fun tableClass(): String? = unwrap(this).getTableClass()

    /**
     * A name for the table.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the table name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tablename)
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies the Time to Live (TTL) settings for the table.
     *
     *
     * For detailed information about the limits in DynamoDB, see [Limits in Amazon
     * DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in the
     * Amazon DynamoDB Developer Guide.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-timetolivespecification)
     */
    override fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTableProps):
        CfnTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTableProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.dynamodb.CfnTableProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.CfnTableProps
  }
}
