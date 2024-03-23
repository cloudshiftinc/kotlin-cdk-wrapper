@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DynamoDB::Table` resource creates a DynamoDB table. For more information, see
 * [CreateTable](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_CreateTable.html)
 * in the *Amazon DynamoDB API Reference* .
 *
 * You should be aware of the following behaviors when working with DynamoDB tables:
 *
 * * AWS CloudFormation typically creates DynamoDB tables in parallel. However, if your template
 * includes multiple DynamoDB tables with indexes, you must declare dependencies so that the tables are
 * created sequentially. Amazon DynamoDB limits the number of tables with secondary indexes that are in
 * the creating state. If you create multiple tables with indexes at the same time, DynamoDB returns an
 * error and the stack operation fails. For an example, see [DynamoDB Table with a DependsOn
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#aws-resource-dynamodb-table--examples--DynamoDB_Table_with_a_DependsOn_Attribute)
 * .
 *
 *
 * Our guidance is to use the latest schema documented here for your AWS CloudFormation templates.
 * This schema supports the provisioning of all table settings below. When using this schema in your
 * AWS CloudFormation templates, please ensure that your Identity and Access Management ( IAM )
 * policies are updated with appropriate permissions to allow for the authorization of these setting
 * changes.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
public open class CfnTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps,
  ) :
      this(software.amazon.awscdk.services.dynamodb.CfnTable(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTableProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the DynamoDB table, such as
   * `arn:aws:dynamodb:us-east-2:123456789012:table/myDynamoDBTable` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of the DynamoDB stream, such as
   * `arn:aws:dynamodb:us-east-1:123456789012:table/testddbstack-myDynamoDBTable-012A1SL7SMP5Q/stream/2015-11-30T20:10:00.000`
   * .
   *
   *
   * You must specify the `StreamSpecification` property to use this attribute.
   */
  public open fun attrStreamArn(): String = unwrap(this).getAttrStreamArn()

  /**
   * A list of attributes that describe the key schema for the table and indexes.
   */
  public open fun attributeDefinitions(): Any? = unwrap(this).getAttributeDefinitions()

  /**
   * A list of attributes that describe the key schema for the table and indexes.
   */
  public open fun attributeDefinitions(`value`: IResolvable) {
    unwrap(this).setAttributeDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of attributes that describe the key schema for the table and indexes.
   */
  public open fun attributeDefinitions(`value`: List<Any>) {
    unwrap(this).setAttributeDefinitions(`value`)
  }

  /**
   * A list of attributes that describe the key schema for the table and indexes.
   */
  public open fun attributeDefinitions(vararg `value`: Any): Unit =
      attributeDefinitions(`value`.toList())

  /**
   * Specify how you are charged for read and write throughput and how you manage capacity.
   */
  public open fun billingMode(): String? = unwrap(this).getBillingMode()

  /**
   * Specify how you are charged for read and write throughput and how you manage capacity.
   */
  public open fun billingMode(`value`: String) {
    unwrap(this).setBillingMode(`value`)
  }

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
   */
  public open fun contributorInsightsSpecification(): Any? =
      unwrap(this).getContributorInsightsSpecification()

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
   */
  public open fun contributorInsightsSpecification(`value`: IResolvable) {
    unwrap(this).setContributorInsightsSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
   */
  public open
      fun contributorInsightsSpecification(`value`: ContributorInsightsSpecificationProperty) {
    unwrap(this).setContributorInsightsSpecification(`value`.let(ContributorInsightsSpecificationProperty::unwrap))
  }

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77beaec09fac479cad9e8894bb89ec8c1db94a8821b6c6f2af2a2345d6ddfb24")
  public open
      fun contributorInsightsSpecification(`value`: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
      Unit = contributorInsightsSpecification(ContributorInsightsSpecificationProperty(`value`))

  /**
   * Determines if a table is protected from deletion.
   */
  public open fun deletionProtectionEnabled(): Any? = unwrap(this).getDeletionProtectionEnabled()

  /**
   * Determines if a table is protected from deletion.
   */
  public open fun deletionProtectionEnabled(`value`: Boolean) {
    unwrap(this).setDeletionProtectionEnabled(`value`)
  }

  /**
   * Determines if a table is protected from deletion.
   */
  public open fun deletionProtectionEnabled(`value`: IResolvable) {
    unwrap(this).setDeletionProtectionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Global secondary indexes to be created on the table.
   *
   * You can create up to 20 global secondary indexes.
   */
  public open fun globalSecondaryIndexes(): Any? = unwrap(this).getGlobalSecondaryIndexes()

  /**
   * Global secondary indexes to be created on the table.
   *
   * You can create up to 20 global secondary indexes.
   */
  public open fun globalSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setGlobalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Global secondary indexes to be created on the table.
   *
   * You can create up to 20 global secondary indexes.
   */
  public open fun globalSecondaryIndexes(`value`: List<Any>) {
    unwrap(this).setGlobalSecondaryIndexes(`value`)
  }

  /**
   * Global secondary indexes to be created on the table.
   *
   * You can create up to 20 global secondary indexes.
   */
  public open fun globalSecondaryIndexes(vararg `value`: Any): Unit =
      globalSecondaryIndexes(`value`.toList())

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   */
  public open fun importSourceSpecification(): Any? = unwrap(this).getImportSourceSpecification()

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   */
  public open fun importSourceSpecification(`value`: IResolvable) {
    unwrap(this).setImportSourceSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   */
  public open fun importSourceSpecification(`value`: ImportSourceSpecificationProperty) {
    unwrap(this).setImportSourceSpecification(`value`.let(ImportSourceSpecificationProperty::unwrap))
  }

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("884ed0605874e87b65400a7af7d40744c9719400be4c548fcd07b2bd0d39cfa5")
  public open
      fun importSourceSpecification(`value`: ImportSourceSpecificationProperty.Builder.() -> Unit):
      Unit = importSourceSpecification(ImportSourceSpecificationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(): Any = unwrap(this).getKeySchema()

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(`value`: IResolvable) {
    unwrap(this).setKeySchema(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(`value`: List<Any>) {
    unwrap(this).setKeySchema(`value`)
  }

  /**
   * Specifies the attributes that make up the primary key for the table.
   */
  public open fun keySchema(vararg `value`: Any): Unit = keySchema(`value`.toList())

  /**
   * The Kinesis Data Streams configuration for the specified table.
   */
  public open fun kinesisStreamSpecification(): Any? = unwrap(this).getKinesisStreamSpecification()

  /**
   * The Kinesis Data Streams configuration for the specified table.
   */
  public open fun kinesisStreamSpecification(`value`: IResolvable) {
    unwrap(this).setKinesisStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Kinesis Data Streams configuration for the specified table.
   */
  public open fun kinesisStreamSpecification(`value`: KinesisStreamSpecificationProperty) {
    unwrap(this).setKinesisStreamSpecification(`value`.let(KinesisStreamSpecificationProperty::unwrap))
  }

  /**
   * The Kinesis Data Streams configuration for the specified table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67f3055a35d99211eb661364b036467d89570de32d09668f4c1518a0be43b4d2")
  public open
      fun kinesisStreamSpecification(`value`: KinesisStreamSpecificationProperty.Builder.() -> Unit):
      Unit = kinesisStreamSpecification(KinesisStreamSpecificationProperty(`value`))

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(): Any? = unwrap(this).getLocalSecondaryIndexes()

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(`value`: IResolvable) {
    unwrap(this).setLocalSecondaryIndexes(`value`.let(IResolvable::unwrap))
  }

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(`value`: List<Any>) {
    unwrap(this).setLocalSecondaryIndexes(`value`)
  }

  /**
   * Local secondary indexes to be created on the table.
   */
  public open fun localSecondaryIndexes(vararg `value`: Any): Unit =
      localSecondaryIndexes(`value`.toList())

  /**
   * The settings used to enable point in time recovery.
   */
  public open fun pointInTimeRecoverySpecification(): Any? =
      unwrap(this).getPointInTimeRecoverySpecification()

  /**
   * The settings used to enable point in time recovery.
   */
  public open fun pointInTimeRecoverySpecification(`value`: IResolvable) {
    unwrap(this).setPointInTimeRecoverySpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings used to enable point in time recovery.
   */
  public open
      fun pointInTimeRecoverySpecification(`value`: PointInTimeRecoverySpecificationProperty) {
    unwrap(this).setPointInTimeRecoverySpecification(`value`.let(PointInTimeRecoverySpecificationProperty::unwrap))
  }

  /**
   * The settings used to enable point in time recovery.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51a9e0b9428e8e61e7f17743e285631f199b57aac952134c394864c81b4491ca")
  public open
      fun pointInTimeRecoverySpecification(`value`: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
      Unit = pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(`value`))

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   */
  public open fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   */
  public open fun provisionedThroughput(`value`: IResolvable) {
    unwrap(this).setProvisionedThroughput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   */
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty) {
    unwrap(this).setProvisionedThroughput(`value`.let(ProvisionedThroughputProperty::unwrap))
  }

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f76359fdd2cc9391562c12c627346dd5b270f1716c442655ba4259cf6377dcd5")
  public open fun provisionedThroughput(`value`: ProvisionedThroughputProperty.Builder.() -> Unit):
      Unit = provisionedThroughput(ProvisionedThroughputProperty(`value`))

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the settings to enable server-side encryption.
   */
  public open fun sseSpecification(`value`: SSESpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SSESpecificationProperty::unwrap))
  }

  /**
   * Specifies the settings to enable server-side encryption.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0736ca2fbc2ff4f8c1593cda995d79147be04c9842f05b699b140baf61e13e1")
  public open fun sseSpecification(`value`: SSESpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SSESpecificationProperty(`value`))

  /**
   * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
   */
  public open fun streamSpecification(): Any? = unwrap(this).getStreamSpecification()

  /**
   * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
   */
  public open fun streamSpecification(`value`: IResolvable) {
    unwrap(this).setStreamSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
   */
  public open fun streamSpecification(`value`: StreamSpecificationProperty) {
    unwrap(this).setStreamSpecification(`value`.let(StreamSpecificationProperty::unwrap))
  }

  /**
   * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3351e6c1ff22506ab5a6bd06873964f946aaf4c06d21308861bb80a550df3c8c")
  public open fun streamSpecification(`value`: StreamSpecificationProperty.Builder.() -> Unit): Unit
      = streamSpecification(StreamSpecificationProperty(`value`))

  /**
   * The table class of the new table.
   */
  public open fun tableClass(): String? = unwrap(this).getTableClass()

  /**
   * The table class of the new table.
   */
  public open fun tableClass(`value`: String) {
    unwrap(this).setTableClass(`value`)
  }

  /**
   * A name for the table.
   */
  public open fun tableName(): String? = unwrap(this).getTableName()

  /**
   * A name for the table.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies the Time to Live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(): Any? = unwrap(this).getTimeToLiveSpecification()

  /**
   * Specifies the Time to Live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(`value`: IResolvable) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the Time to Live (TTL) settings for the table.
   */
  public open fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty) {
    unwrap(this).setTimeToLiveSpecification(`value`.let(TimeToLiveSpecificationProperty::unwrap))
  }

  /**
   * Specifies the Time to Live (TTL) settings for the table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("943fa5e7184ee285ced77265fc818927acac317769e30c18837b25103d18ae79")
  public open
      fun timeToLiveSpecification(`value`: TimeToLiveSpecificationProperty.Builder.() -> Unit): Unit
      = timeToLiveSpecification(TimeToLiveSpecificationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dynamodb.CfnTable].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: IResolvable)

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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    public fun attributeDefinitions(attributeDefinitions: List<Any>)

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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    public fun attributeDefinitions(vararg attributeDefinitions: Any)

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
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity. 
     */
    public fun billingMode(billingMode: String)

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6b0005fd6dda990da56422cb152b0eb236be848bd7d4e3c82aee5268f97b8b")
    public
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     * @param deletionProtectionEnabled Determines if a table is protected from deletion. 
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean)

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     * @param deletionProtectionEnabled Determines if a table is protected from deletion. 
     */
    public fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable)

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable)

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    public fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>)

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    public fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any)

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    public fun importSourceSpecification(importSourceSpecification: IResolvable)

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    public
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty)

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7642cd516d9ff1a9255c21eb0837bc31f5a39045d847d7ce3d17a9c10a93b988")
    public
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty.Builder.() -> Unit)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(keySchema: IResolvable)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(keySchema: List<Any>)

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    public fun keySchema(vararg keySchema: Any)

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    public fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable)

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty)

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e3070174596433409b29ee0d4f850f9f23013a50963b7ae8954db93c5709c")
    public
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: IResolvable)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(localSecondaryIndexes: List<Any>)

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    public fun localSecondaryIndexes(vararg localSecondaryIndexes: Any)

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    public fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable)

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty)

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9d3b3f1cfdd30b35983e8595334380b221841bf19737c9b2c6743908651417")
    public
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit)

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable)

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2af10868690ca846d0ef0b377adf5d30a2d1e276444f5ccc298395c8896292d8")
    public
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    public fun sseSpecification(sseSpecification: SSESpecificationProperty)

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f25f660b107112377a3e4d81825a2bdd36c3cc8c272a6ee97340560ec4a5e61a")
    public fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit)

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    public fun streamSpecification(streamSpecification: IResolvable)

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    public fun streamSpecification(streamSpecification: StreamSpecificationProperty)

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c7f3227b4f41970244541632a7379086be8371e45664633a3b433c81badf83")
    public
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit)

    /**
     * The table class of the new table.
     *
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tableclass)
     * @param tableClass The table class of the new table. 
     */
    public fun tableClass(tableClass: String)

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
     * @param tableName A name for the table. 
     */
    public fun tableName(tableName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: IResolvable)

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    public fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty)

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40800600d9946bf6a3b0916179f54c5a80b8ebcfda7b6263fda607a3883cb87")
    public
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTable.Builder =
        software.amazon.awscdk.services.dynamodb.CfnTable.Builder.create(scope, id)

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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: IResolvable) {
      cdkBuilder.attributeDefinitions(attributeDefinitions.let(IResolvable::unwrap))
    }

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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    override fun attributeDefinitions(attributeDefinitions: List<Any>) {
      cdkBuilder.attributeDefinitions(attributeDefinitions)
    }

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
     * @param attributeDefinitions A list of attributes that describe the key schema for the table
     * and indexes. 
     */
    override fun attributeDefinitions(vararg attributeDefinitions: Any): Unit =
        attributeDefinitions(attributeDefinitions.toList())

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
     * @param billingMode Specify how you are charged for read and write throughput and how you
     * manage capacity. 
     */
    override fun billingMode(billingMode: String) {
      cdkBuilder.billingMode(billingMode)
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
      cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
    }

    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-contributorinsightsspecification)
     * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
     * Contributor Insights for the specified table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db6b0005fd6dda990da56422cb152b0eb236be848bd7d4e3c82aee5268f97b8b")
    override
        fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
        Unit =
        contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     * @param deletionProtectionEnabled Determines if a table is protected from deletion. 
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: Boolean) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled)
    }

    /**
     * Determines if a table is protected from deletion.
     *
     * When enabled, the table cannot be deleted by any user or process. This setting is disabled by
     * default. For more information, see [Using deletion
     * protection](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.Basics.html#WorkingWithTables.Basics.DeletionProtection)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-deletionprotectionenabled)
     * @param deletionProtectionEnabled Determines if a table is protected from deletion. 
     */
    override fun deletionProtectionEnabled(deletionProtectionEnabled: IResolvable) {
      cdkBuilder.deletionProtectionEnabled(deletionProtectionEnabled.let(IResolvable::unwrap))
    }

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: IResolvable) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes.let(IResolvable::unwrap))
    }

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    override fun globalSecondaryIndexes(globalSecondaryIndexes: List<Any>) {
      cdkBuilder.globalSecondaryIndexes(globalSecondaryIndexes)
    }

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
     * @param globalSecondaryIndexes Global secondary indexes to be created on the table. You can
     * create up to 20 global secondary indexes. 
     */
    override fun globalSecondaryIndexes(vararg globalSecondaryIndexes: Any): Unit =
        globalSecondaryIndexes(globalSecondaryIndexes.toList())

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    override fun importSourceSpecification(importSourceSpecification: IResolvable) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(IResolvable::unwrap))
    }

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    override
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty) {
      cdkBuilder.importSourceSpecification(importSourceSpecification.let(ImportSourceSpecificationProperty::unwrap))
    }

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
     * @param importSourceSpecification Specifies the properties of data being imported from the S3
     * bucket source to the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7642cd516d9ff1a9255c21eb0837bc31f5a39045d847d7ce3d17a9c10a93b988")
    override
        fun importSourceSpecification(importSourceSpecification: ImportSourceSpecificationProperty.Builder.() -> Unit):
        Unit =
        importSourceSpecification(ImportSourceSpecificationProperty(importSourceSpecification))

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(keySchema: IResolvable) {
      cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(keySchema: List<Any>) {
      cdkBuilder.keySchema(keySchema)
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     *
     * The attributes in the `KeySchema` property must also be defined in the `AttributeDefinitions`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-keyschema)
     * @param keySchema Specifies the attributes that make up the primary key for the table. 
     */
    override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    override fun kinesisStreamSpecification(kinesisStreamSpecification: IResolvable) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(IResolvable::unwrap))
    }

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty) {
      cdkBuilder.kinesisStreamSpecification(kinesisStreamSpecification.let(KinesisStreamSpecificationProperty::unwrap))
    }

    /**
     * The Kinesis Data Streams configuration for the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-kinesisstreamspecification)
     * @param kinesisStreamSpecification The Kinesis Data Streams configuration for the specified
     * table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e3070174596433409b29ee0d4f850f9f23013a50963b7ae8954db93c5709c")
    override
        fun kinesisStreamSpecification(kinesisStreamSpecification: KinesisStreamSpecificationProperty.Builder.() -> Unit):
        Unit =
        kinesisStreamSpecification(KinesisStreamSpecificationProperty(kinesisStreamSpecification))

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: IResolvable) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes.let(IResolvable::unwrap))
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(localSecondaryIndexes: List<Any>) {
      cdkBuilder.localSecondaryIndexes(localSecondaryIndexes)
    }

    /**
     * Local secondary indexes to be created on the table.
     *
     * You can create up to 5 local secondary indexes. Each index is scoped to a given hash key
     * value. The size of each hash key can be up to 10 gigabytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-localsecondaryindexes)
     * @param localSecondaryIndexes Local secondary indexes to be created on the table. 
     */
    override fun localSecondaryIndexes(vararg localSecondaryIndexes: Any): Unit =
        localSecondaryIndexes(localSecondaryIndexes.toList())

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    override fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: IResolvable) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(IResolvable::unwrap))
    }

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty) {
      cdkBuilder.pointInTimeRecoverySpecification(pointInTimeRecoverySpecification.let(PointInTimeRecoverySpecificationProperty::unwrap))
    }

    /**
     * The settings used to enable point in time recovery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-pointintimerecoveryspecification)
     * @param pointInTimeRecoverySpecification The settings used to enable point in time recovery. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9d3b3f1cfdd30b35983e8595334380b221841bf19737c9b2c6743908651417")
    override
        fun pointInTimeRecoverySpecification(pointInTimeRecoverySpecification: PointInTimeRecoverySpecificationProperty.Builder.() -> Unit):
        Unit =
        pointInTimeRecoverySpecification(PointInTimeRecoverySpecificationProperty(pointInTimeRecoverySpecification))

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    override fun provisionedThroughput(provisionedThroughput: IResolvable) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
    }

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
      cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
    }

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
     * @param provisionedThroughput Throughput for the specified table, which consists of values for
     * `ReadCapacityUnits` and `WriteCapacityUnits` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2af10868690ca846d0ef0b377adf5d30a2d1e276444f5ccc298395c8896292d8")
    override
        fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
        Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    override fun sseSpecification(sseSpecification: SSESpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SSESpecificationProperty::unwrap))
    }

    /**
     * Specifies the settings to enable server-side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-ssespecification)
     * @param sseSpecification Specifies the settings to enable server-side encryption. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f25f660b107112377a3e4d81825a2bdd36c3cc8c272a6ee97340560ec4a5e61a")
    override fun sseSpecification(sseSpecification: SSESpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SSESpecificationProperty(sseSpecification))

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    override fun streamSpecification(streamSpecification: IResolvable) {
      cdkBuilder.streamSpecification(streamSpecification.let(IResolvable::unwrap))
    }

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    override fun streamSpecification(streamSpecification: StreamSpecificationProperty) {
      cdkBuilder.streamSpecification(streamSpecification.let(StreamSpecificationProperty::unwrap))
    }

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-streamspecification)
     * @param streamSpecification The settings for the DynamoDB table stream, which capture changes
     * to items stored in the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c7f3227b4f41970244541632a7379086be8371e45664633a3b433c81badf83")
    override
        fun streamSpecification(streamSpecification: StreamSpecificationProperty.Builder.() -> Unit):
        Unit = streamSpecification(StreamSpecificationProperty(streamSpecification))

    /**
     * The table class of the new table.
     *
     * Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tableclass)
     * @param tableClass The table class of the new table. 
     */
    override fun tableClass(tableClass: String) {
      cdkBuilder.tableClass(tableClass)
    }

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
     * @param tableName A name for the table. 
     */
    override fun tableName(tableName: String) {
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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dynamodb-table.html#cfn-dynamodb-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: IResolvable) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(IResolvable::unwrap))
    }

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    override fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty) {
      cdkBuilder.timeToLiveSpecification(timeToLiveSpecification.let(TimeToLiveSpecificationProperty::unwrap))
    }

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
     * @param timeToLiveSpecification Specifies the Time to Live (TTL) settings for the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40800600d9946bf6a3b0916179f54c5a80b8ebcfda7b6263fda607a3883cb87")
    override
        fun timeToLiveSpecification(timeToLiveSpecification: TimeToLiveSpecificationProperty.Builder.() -> Unit):
        Unit = timeToLiveSpecification(TimeToLiveSpecificationProperty(timeToLiveSpecification))

    public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dynamodb.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.dynamodb.CfnTable =
        wrapped.cdkObject
  }

  /**
   * Represents an attribute for describing the schema for the table and indexes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * AttributeDefinitionProperty attributeDefinitionProperty = AttributeDefinitionProperty.builder()
   * .attributeName("attributeName")
   * .attributeType("attributeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html)
   */
  public interface AttributeDefinitionProperty {
    /**
     * A name for the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html#cfn-dynamodb-table-attributedefinition-attributename)
     */
    public fun attributeName(): String

    /**
     * The data type for the attribute, where:.
     *
     * * `S` - the attribute is of type String
     * * `N` - the attribute is of type Number
     * * `B` - the attribute is of type Binary
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html#cfn-dynamodb-table-attributedefinition-attributetype)
     */
    public fun attributeType(): String

    /**
     * A builder for [AttributeDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName A name for the attribute. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param attributeType The data type for the attribute, where:. 
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       */
      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty.builder()

      /**
       * @param attributeName A name for the attribute. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param attributeType The data type for the attribute, where:. 
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       */
      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty,
    ) : CdkObject(cdkObject), AttributeDefinitionProperty {
      /**
       * A name for the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html#cfn-dynamodb-table-attributedefinition-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The data type for the attribute, where:.
       *
       * * `S` - the attribute is of type String
       * * `N` - the attribute is of type Number
       * * `B` - the attribute is of type Binary
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-attributedefinition.html#cfn-dynamodb-table-attributedefinition-attributetype)
       */
      override fun attributeType(): String = unwrap(this).getAttributeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty):
          AttributeDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttributeDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDefinitionProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.AttributeDefinitionProperty
    }
  }

  /**
   * The settings used to enable or disable CloudWatch Contributor Insights.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * ContributorInsightsSpecificationProperty contributorInsightsSpecificationProperty =
   * ContributorInsightsSpecificationProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-contributorinsightsspecification.html)
   */
  public interface ContributorInsightsSpecificationProperty {
    /**
     * Indicates whether CloudWatch Contributor Insights are to be enabled (true) or disabled
     * (false).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-contributorinsightsspecification.html#cfn-dynamodb-table-contributorinsightsspecification-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ContributorInsightsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty.builder()

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true)
       * or disabled (false). 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty,
    ) : CdkObject(cdkObject), ContributorInsightsSpecificationProperty {
      /**
       * Indicates whether CloudWatch Contributor Insights are to be enabled (true) or disabled
       * (false).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-contributorinsightsspecification.html#cfn-dynamodb-table-contributorinsightsspecification-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContributorInsightsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty):
          ContributorInsightsSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContributorInsightsSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContributorInsightsSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.ContributorInsightsSpecificationProperty
    }
  }

  /**
   * The options for imported source files in CSV format.
   *
   * The values are Delimiter and HeaderList.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * CsvProperty csvProperty = CsvProperty.builder()
   * .delimiter("delimiter")
   * .headerList(List.of("headerList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html)
   */
  public interface CsvProperty {
    /**
     * The delimiter used for separating items in the CSV file being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html#cfn-dynamodb-table-csv-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * List of the headers used to specify a common header for all source CSV files being imported.
     *
     * If this field is specified then the first line of each CSV file is treated as data instead of
     * the header. If this field is not specified the the first line of each CSV file is treated as the
     * header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html#cfn-dynamodb-table-csv-headerlist)
     */
    public fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()

    /**
     * A builder for [CsvProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delimiter The delimiter used for separating items in the CSV file being imported.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param headerList List of the headers used to specify a common header for all source CSV
       * files being imported.
       * If this field is specified then the first line of each CSV file is treated as data instead
       * of the header. If this field is not specified the the first line of each CSV file is treated
       * as the header.
       */
      public fun headerList(headerList: List<String>)

      /**
       * @param headerList List of the headers used to specify a common header for all source CSV
       * files being imported.
       * If this field is specified then the first line of each CSV file is treated as data instead
       * of the header. If this field is not specified the the first line of each CSV file is treated
       * as the header.
       */
      public fun headerList(vararg headerList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty.Builder
          = software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty.builder()

      /**
       * @param delimiter The delimiter used for separating items in the CSV file being imported.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param headerList List of the headers used to specify a common header for all source CSV
       * files being imported.
       * If this field is specified then the first line of each CSV file is treated as data instead
       * of the header. If this field is not specified the the first line of each CSV file is treated
       * as the header.
       */
      override fun headerList(headerList: List<String>) {
        cdkBuilder.headerList(headerList)
      }

      /**
       * @param headerList List of the headers used to specify a common header for all source CSV
       * files being imported.
       * If this field is specified then the first line of each CSV file is treated as data instead
       * of the header. If this field is not specified the the first line of each CSV file is treated
       * as the header.
       */
      override fun headerList(vararg headerList: String): Unit = headerList(headerList.toList())

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty,
    ) : CdkObject(cdkObject), CsvProperty {
      /**
       * The delimiter used for separating items in the CSV file being imported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html#cfn-dynamodb-table-csv-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * List of the headers used to specify a common header for all source CSV files being
       * imported.
       *
       * If this field is specified then the first line of each CSV file is treated as data instead
       * of the header. If this field is not specified the the first line of each CSV file is treated
       * as the header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-csv.html#cfn-dynamodb-table-csv-headerlist)
       */
      override fun headerList(): List<String> = unwrap(this).getHeaderList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty):
          CsvProperty = CdkObjectWrappers.wrap(cdkObject) as? CsvProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.CfnTable.CsvProperty
    }
  }

  /**
   * Represents the properties of a global secondary index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface GlobalSecondaryIndexProperty {
    /**
     * The settings used to enable or disable CloudWatch Contributor Insights for the specified
     * global secondary index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-contributorinsightsspecification)
     */
    public fun contributorInsightsSpecification(): Any? =
        unwrap(this).getContributorInsightsSpecification()

    /**
     * The name of the global secondary index.
     *
     * The name must be unique among all other indexes on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-indexname)
     */
    public fun indexName(): String

    /**
     * The complete key schema for a global secondary index, which consists of one or more pairs of
     * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
     * partition key of an item is also known as its *hash attribute* .
     *
     * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
     * evenly distribute data items across partitions, based on their partition key values.
     *
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-keyschema)
     */
    public fun keySchema(): Any

    /**
     * Represents attributes that are copied (projected) from the table into the global secondary
     * index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-projection)
     */
    public fun projection(): Any

    /**
     * Represents the provisioned throughput settings for the specified global secondary index.
     *
     * For current minimum and maximum provisioned throughput values, see [Service, Account, and
     * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
     * the *Amazon DynamoDB Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-provisionedthroughput)
     */
    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * A builder for [GlobalSecondaryIndexProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      public fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable)

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty)

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96aaf0e53afdf2008e3bab5ed0472ff865f8718a9f091086a3c7d06569c838e5")
      public
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit)

      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      public fun indexName(indexName: String)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: IResolvable)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: List<Any>)

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(vararg keySchema: Any)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: IResolvable)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: ProjectionProperty)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a320a0d74803ebff018f88b81b33b1d49b807f9a0d83ae90e432deb42f1221d")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c7b56ca1f0d8c0ead31155d94c0a7ac4c420ab8569c28acb313b53298c9d4a4")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty.builder()

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      override fun contributorInsightsSpecification(contributorInsightsSpecification: IResolvable) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty) {
        cdkBuilder.contributorInsightsSpecification(contributorInsightsSpecification.let(ContributorInsightsSpecificationProperty::unwrap))
      }

      /**
       * @param contributorInsightsSpecification The settings used to enable or disable CloudWatch
       * Contributor Insights for the specified global secondary index.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96aaf0e53afdf2008e3bab5ed0472ff865f8718a9f091086a3c7d06569c838e5")
      override
          fun contributorInsightsSpecification(contributorInsightsSpecification: ContributorInsightsSpecificationProperty.Builder.() -> Unit):
          Unit =
          contributorInsightsSpecification(ContributorInsightsSpecificationProperty(contributorInsightsSpecification))

      /**
       * @param indexName The name of the global secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      /**
       * @param keySchema The complete key schema for a global secondary index, which consists of
       * one or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort
       * key  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * global secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a320a0d74803ebff018f88b81b33b1d49b807f9a0d83ae90e432deb42f1221d")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable::unwrap))
      }

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty::unwrap))
      }

      /**
       * @param provisionedThroughput Represents the provisioned throughput settings for the
       * specified global secondary index.
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c7b56ca1f0d8c0ead31155d94c0a7ac4c420ab8569c28acb313b53298c9d4a4")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty,
    ) : CdkObject(cdkObject), GlobalSecondaryIndexProperty {
      /**
       * The settings used to enable or disable CloudWatch Contributor Insights for the specified
       * global secondary index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-contributorinsightsspecification)
       */
      override fun contributorInsightsSpecification(): Any? =
          unwrap(this).getContributorInsightsSpecification()

      /**
       * The name of the global secondary index.
       *
       * The name must be unique among all other indexes on this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The complete key schema for a global secondary index, which consists of one or more pairs
       * of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
       * partition key of an item is also known as its *hash attribute* .
       *
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-keyschema)
       */
      override fun keySchema(): Any = unwrap(this).getKeySchema()

      /**
       * Represents attributes that are copied (projected) from the table into the global secondary
       * index.
       *
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-projection)
       */
      override fun projection(): Any = unwrap(this).getProjection()

      /**
       * Represents the provisioned throughput settings for the specified global secondary index.
       *
       * For current minimum and maximum provisioned throughput values, see [Service, Account, and
       * Table Quotas](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html) in
       * the *Amazon DynamoDB Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-globalsecondaryindex.html#cfn-dynamodb-table-globalsecondaryindex-provisionedthroughput)
       */
      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlobalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty):
          GlobalSecondaryIndexProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GlobalSecondaryIndexProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.GlobalSecondaryIndexProperty
    }
  }

  /**
   * Specifies the properties of data being imported from the S3 bucket source to the table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface ImportSourceSpecificationProperty {
    /**
     * Type of compression to be used on the input coming from the imported table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputcompressiontype)
     */
    public fun inputCompressionType(): String? = unwrap(this).getInputCompressionType()

    /**
     * The format of the source data.
     *
     * Valid values for `ImportFormat` are `CSV` , `DYNAMODB_JSON` or `ION` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputformat)
     */
    public fun inputFormat(): String

    /**
     * Additional properties that specify how the input is formatted,.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputformatoptions)
     */
    public fun inputFormatOptions(): Any? = unwrap(this).getInputFormatOptions()

    /**
     * The S3 bucket that provides the source for the import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-s3bucketsource)
     */
    public fun s3BucketSource(): Any

    /**
     * A builder for [ImportSourceSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputCompressionType Type of compression to be used on the input coming from the
       * imported table.
       */
      public fun inputCompressionType(inputCompressionType: String)

      /**
       * @param inputFormat The format of the source data. 
       * Valid values for `ImportFormat` are `CSV` , `DYNAMODB_JSON` or `ION` .
       */
      public fun inputFormat(inputFormat: String)

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      public fun inputFormatOptions(inputFormatOptions: IResolvable)

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      public fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty)

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecc38bd30337caf76434b9f40f26e805f90d4539959d977a544930de7283d782")
      public
          fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty.Builder.() -> Unit)

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      public fun s3BucketSource(s3BucketSource: IResolvable)

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      public fun s3BucketSource(s3BucketSource: S3BucketSourceProperty)

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94d435bd52f7706069f0d2179a5912e53195e97d44c42e855d5b7cd8f690bc1")
      public fun s3BucketSource(s3BucketSource: S3BucketSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty.builder()

      /**
       * @param inputCompressionType Type of compression to be used on the input coming from the
       * imported table.
       */
      override fun inputCompressionType(inputCompressionType: String) {
        cdkBuilder.inputCompressionType(inputCompressionType)
      }

      /**
       * @param inputFormat The format of the source data. 
       * Valid values for `ImportFormat` are `CSV` , `DYNAMODB_JSON` or `ION` .
       */
      override fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
      }

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      override fun inputFormatOptions(inputFormatOptions: IResolvable) {
        cdkBuilder.inputFormatOptions(inputFormatOptions.let(IResolvable::unwrap))
      }

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      override fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty) {
        cdkBuilder.inputFormatOptions(inputFormatOptions.let(InputFormatOptionsProperty::unwrap))
      }

      /**
       * @param inputFormatOptions Additional properties that specify how the input is formatted,.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecc38bd30337caf76434b9f40f26e805f90d4539959d977a544930de7283d782")
      override
          fun inputFormatOptions(inputFormatOptions: InputFormatOptionsProperty.Builder.() -> Unit):
          Unit = inputFormatOptions(InputFormatOptionsProperty(inputFormatOptions))

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      override fun s3BucketSource(s3BucketSource: IResolvable) {
        cdkBuilder.s3BucketSource(s3BucketSource.let(IResolvable::unwrap))
      }

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      override fun s3BucketSource(s3BucketSource: S3BucketSourceProperty) {
        cdkBuilder.s3BucketSource(s3BucketSource.let(S3BucketSourceProperty::unwrap))
      }

      /**
       * @param s3BucketSource The S3 bucket that provides the source for the import. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d94d435bd52f7706069f0d2179a5912e53195e97d44c42e855d5b7cd8f690bc1")
      override fun s3BucketSource(s3BucketSource: S3BucketSourceProperty.Builder.() -> Unit): Unit =
          s3BucketSource(S3BucketSourceProperty(s3BucketSource))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty,
    ) : CdkObject(cdkObject), ImportSourceSpecificationProperty {
      /**
       * Type of compression to be used on the input coming from the imported table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputcompressiontype)
       */
      override fun inputCompressionType(): String? = unwrap(this).getInputCompressionType()

      /**
       * The format of the source data.
       *
       * Valid values for `ImportFormat` are `CSV` , `DYNAMODB_JSON` or `ION` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputformat)
       */
      override fun inputFormat(): String = unwrap(this).getInputFormat()

      /**
       * Additional properties that specify how the input is formatted,.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-inputformatoptions)
       */
      override fun inputFormatOptions(): Any? = unwrap(this).getInputFormatOptions()

      /**
       * The S3 bucket that provides the source for the import.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-importsourcespecification.html#cfn-dynamodb-table-importsourcespecification-s3bucketsource)
       */
      override fun s3BucketSource(): Any = unwrap(this).getS3BucketSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImportSourceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty):
          ImportSourceSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImportSourceSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImportSourceSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.ImportSourceSpecificationProperty
    }
  }

  /**
   * The format options for the data that was imported into the target table.
   *
   * There is one value, CsvOption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface InputFormatOptionsProperty {
    /**
     * The options for imported source files in CSV format.
     *
     * The values are Delimiter and HeaderList.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-inputformatoptions.html#cfn-dynamodb-table-inputformatoptions-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * A builder for [InputFormatOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      public fun csv(csv: CsvProperty)

      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4c5457956849bb4ae15c4c0406bea8f935360000062eb45e0c1cbcb96dd98f5")
      public fun csv(csv: CsvProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty.builder()

      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      override fun csv(csv: CsvProperty) {
        cdkBuilder.csv(csv.let(CsvProperty::unwrap))
      }

      /**
       * @param csv The options for imported source files in CSV format.
       * The values are Delimiter and HeaderList.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4c5457956849bb4ae15c4c0406bea8f935360000062eb45e0c1cbcb96dd98f5")
      override fun csv(csv: CsvProperty.Builder.() -> Unit): Unit = csv(CsvProperty(csv))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty,
    ) : CdkObject(cdkObject), InputFormatOptionsProperty {
      /**
       * The options for imported source files in CSV format.
       *
       * The values are Delimiter and HeaderList.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-inputformatoptions.html#cfn-dynamodb-table-inputformatoptions-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty):
          InputFormatOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputFormatOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFormatOptionsProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.InputFormatOptionsProperty
    }
  }

  /**
   * Represents *a single element* of a key schema.
   *
   * A key schema specifies the attributes that make up the primary key of a table, or the key
   * attributes of an index.
   *
   * A `KeySchemaElement` represents exactly one attribute of the primary key. For example, a simple
   * primary key would be represented by one `KeySchemaElement` (for the partition key). A composite
   * primary key would require one `KeySchemaElement` for the partition key, and another
   * `KeySchemaElement` for the sort key.
   *
   * A `KeySchemaElement` must be a scalar, top-level attribute (not a nested attribute). The data
   * type must be one of String, Number, or Binary. The attribute cannot be nested within a List or a
   * Map.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * KeySchemaProperty keySchemaProperty = KeySchemaProperty.builder()
   * .attributeName("attributeName")
   * .keyType("keyType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html)
   */
  public interface KeySchemaProperty {
    /**
     * The name of a key attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html#cfn-dynamodb-table-keyschema-attributename)
     */
    public fun attributeName(): String

    /**
     * The role that this key attribute will assume:.
     *
     * * `HASH` - partition key
     * * `RANGE` - sort key
     *
     *
     * The partition key of an item is also known as its *hash attribute* . The term "hash
     * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data
     * items across partitions, based on their partition key values.
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html#cfn-dynamodb-table-keyschema-keytype)
     */
    public fun keyType(): String

    /**
     * A builder for [KeySchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of a key attribute. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param keyType The role that this key attribute will assume:. 
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty.builder()

      /**
       * @param attributeName The name of a key attribute. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param keyType The role that this key attribute will assume:. 
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty,
    ) : CdkObject(cdkObject), KeySchemaProperty {
      /**
       * The name of a key attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html#cfn-dynamodb-table-keyschema-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The role that this key attribute will assume:.
       *
       * * `HASH` - partition key
       * * `RANGE` - sort key
       *
       *
       * The partition key of an item is also known as its *hash attribute* . The term "hash
       * attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute
       * data items across partitions, based on their partition key values.
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-keyschema.html#cfn-dynamodb-table-keyschema-keytype)
       */
      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeySchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty):
          KeySchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? KeySchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySchemaProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.KeySchemaProperty
    }
  }

  /**
   * The Kinesis Data Streams configuration for the specified table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * KinesisStreamSpecificationProperty kinesisStreamSpecificationProperty =
   * KinesisStreamSpecificationProperty.builder()
   * .streamArn("streamArn")
   * // the properties below are optional
   * .approximateCreationDateTimePrecision("approximateCreationDateTimePrecision")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html)
   */
  public interface KinesisStreamSpecificationProperty {
    /**
     * The precision for the time and date that the stream was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html#cfn-dynamodb-table-kinesisstreamspecification-approximatecreationdatetimeprecision)
     */
    public fun approximateCreationDateTimePrecision(): String? =
        unwrap(this).getApproximateCreationDateTimePrecision()

    /**
     * The ARN for a specific Kinesis data stream.
     *
     * Length Constraints: Minimum length of 37. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html#cfn-dynamodb-table-kinesisstreamspecification-streamarn)
     */
    public fun streamArn(): String

    /**
     * A builder for [KinesisStreamSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param approximateCreationDateTimePrecision The precision for the time and date that the
       * stream was created.
       */
      public fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String)

      /**
       * @param streamArn The ARN for a specific Kinesis data stream. 
       * Length Constraints: Minimum length of 37. Maximum length of 1024.
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty.builder()

      /**
       * @param approximateCreationDateTimePrecision The precision for the time and date that the
       * stream was created.
       */
      override
          fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String) {
        cdkBuilder.approximateCreationDateTimePrecision(approximateCreationDateTimePrecision)
      }

      /**
       * @param streamArn The ARN for a specific Kinesis data stream. 
       * Length Constraints: Minimum length of 37. Maximum length of 1024.
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty,
    ) : CdkObject(cdkObject), KinesisStreamSpecificationProperty {
      /**
       * The precision for the time and date that the stream was created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html#cfn-dynamodb-table-kinesisstreamspecification-approximatecreationdatetimeprecision)
       */
      override fun approximateCreationDateTimePrecision(): String? =
          unwrap(this).getApproximateCreationDateTimePrecision()

      /**
       * The ARN for a specific Kinesis data stream.
       *
       * Length Constraints: Minimum length of 37. Maximum length of 1024.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-kinesisstreamspecification.html#cfn-dynamodb-table-kinesisstreamspecification-streamarn)
       */
      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisStreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty):
          KinesisStreamSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.KinesisStreamSpecificationProperty
    }
  }

  /**
   * Represents the properties of a local secondary index.
   *
   * A local secondary index can only be created when its parent table is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface LocalSecondaryIndexProperty {
    /**
     * The name of the local secondary index.
     *
     * The name must be unique among all other indexes on this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-indexname)
     */
    public fun indexName(): String

    /**
     * The complete key schema for the local secondary index, consisting of one or more pairs of
     * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
     * partition key of an item is also known as its *hash attribute* .
     *
     * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
     * evenly distribute data items across partitions, based on their partition key values.
     *
     *
     * The sort key of an item is also known as its *range attribute* . The term "range attribute"
     * derives from the way DynamoDB stores items with the same partition key physically close
     * together, in sorted order by the sort key value.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-keyschema)
     */
    public fun keySchema(): Any

    /**
     * Represents attributes that are copied (projected) from the table into the local secondary
     * index.
     *
     * These are in addition to the primary key attributes and index key attributes, which are
     * automatically projected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-projection)
     */
    public fun projection(): Any

    /**
     * A builder for [LocalSecondaryIndexProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexName The name of the local secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      public fun indexName(indexName: String)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: IResolvable)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(keySchema: List<Any>)

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      public fun keySchema(vararg keySchema: Any)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: IResolvable)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      public fun projection(projection: ProjectionProperty)

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b85a812f7623bfeeb38995e51a834bd28e7c73b3a1102f3a8e803dd165a2872")
      public fun projection(projection: ProjectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty.builder()

      /**
       * @param indexName The name of the local secondary index. 
       * The name must be unique among all other indexes on this table.
       */
      override fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: IResolvable) {
        cdkBuilder.keySchema(keySchema.let(IResolvable::unwrap))
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(keySchema: List<Any>) {
        cdkBuilder.keySchema(keySchema)
      }

      /**
       * @param keySchema The complete key schema for the local secondary index, consisting of one
       * or more pairs of attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key
       *  &gt; The partition key of an item is also known as its *hash attribute* . 
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       */
      override fun keySchema(vararg keySchema: Any): Unit = keySchema(keySchema.toList())

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: IResolvable) {
        cdkBuilder.projection(projection.let(IResolvable::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      override fun projection(projection: ProjectionProperty) {
        cdkBuilder.projection(projection.let(ProjectionProperty::unwrap))
      }

      /**
       * @param projection Represents attributes that are copied (projected) from the table into the
       * local secondary index. 
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b85a812f7623bfeeb38995e51a834bd28e7c73b3a1102f3a8e803dd165a2872")
      override fun projection(projection: ProjectionProperty.Builder.() -> Unit): Unit =
          projection(ProjectionProperty(projection))

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty,
    ) : CdkObject(cdkObject), LocalSecondaryIndexProperty {
      /**
       * The name of the local secondary index.
       *
       * The name must be unique among all other indexes on this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-indexname)
       */
      override fun indexName(): String = unwrap(this).getIndexName()

      /**
       * The complete key schema for the local secondary index, consisting of one or more pairs of
       * attribute names and key types:  - `HASH` - partition key - `RANGE` - sort key  &gt; The
       * partition key of an item is also known as its *hash attribute* .
       *
       * The term "hash attribute" derives from DynamoDB's usage of an internal hash function to
       * evenly distribute data items across partitions, based on their partition key values.
       *
       *
       * The sort key of an item is also known as its *range attribute* . The term "range attribute"
       * derives from the way DynamoDB stores items with the same partition key physically close
       * together, in sorted order by the sort key value.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-keyschema)
       */
      override fun keySchema(): Any = unwrap(this).getKeySchema()

      /**
       * Represents attributes that are copied (projected) from the table into the local secondary
       * index.
       *
       * These are in addition to the primary key attributes and index key attributes, which are
       * automatically projected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-localsecondaryindex.html#cfn-dynamodb-table-localsecondaryindex-projection)
       */
      override fun projection(): Any = unwrap(this).getProjection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalSecondaryIndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty):
          LocalSecondaryIndexProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocalSecondaryIndexProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalSecondaryIndexProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.LocalSecondaryIndexProperty
    }
  }

  /**
   * The settings used to enable point in time recovery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * PointInTimeRecoverySpecificationProperty pointInTimeRecoverySpecificationProperty =
   * PointInTimeRecoverySpecificationProperty.builder()
   * .pointInTimeRecoveryEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html)
   */
  public interface PointInTimeRecoverySpecificationProperty {
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled)
     */
    public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    /**
     * A builder for [PointInTimeRecoverySpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty.builder()

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
      }

      /**
       * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled
       * (true) or disabled (false) on the table.
       */
      override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty,
    ) : CdkObject(cdkObject), PointInTimeRecoverySpecificationProperty {
      /**
       * Indicates whether point in time recovery is enabled (true) or disabled (false) on the
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-pointintimerecoveryspecification.html#cfn-dynamodb-table-pointintimerecoveryspecification-pointintimerecoveryenabled)
       */
      override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PointInTimeRecoverySpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty):
          PointInTimeRecoverySpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PointInTimeRecoverySpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PointInTimeRecoverySpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.PointInTimeRecoverySpecificationProperty
    }
  }

  /**
   * Represents attributes that are copied (projected) from the table into an index.
   *
   * These are in addition to the primary key attributes and index key attributes, which are
   * automatically projected.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * ProjectionProperty projectionProperty = ProjectionProperty.builder()
   * .nonKeyAttributes(List.of("nonKeyAttributes"))
   * .projectionType("projectionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html)
   */
  public interface ProjectionProperty {
    /**
     * Represents the non-key attribute names which will be projected into the index.
     *
     * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
     * local secondary indexes, must not exceed 100. If you project the same attribute into two
     * different indexes, this counts as two distinct attributes when determining the total.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html#cfn-dynamodb-table-projection-nonkeyattributes)
     */
    public fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?: emptyList()

    /**
     * The set of attributes that are projected into the index:.
     *
     * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
     * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
     * will include other non-key attributes that you specify.
     * * `ALL` - All of the table attributes are projected into the index.
     *
     * When using the DynamoDB console, `ALL` is selected by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html#cfn-dynamodb-table-projection-projectiontype)
     */
    public fun projectionType(): String? = unwrap(this).getProjectionType()

    /**
     * A builder for [ProjectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      public fun nonKeyAttributes(nonKeyAttributes: List<String>)

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      public fun nonKeyAttributes(vararg nonKeyAttributes: String)

      /**
       * @param projectionType The set of attributes that are projected into the index:.
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       */
      public fun projectionType(projectionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.builder()

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      override fun nonKeyAttributes(nonKeyAttributes: List<String>) {
        cdkBuilder.nonKeyAttributes(nonKeyAttributes)
      }

      /**
       * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
       * the index.
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       */
      override fun nonKeyAttributes(vararg nonKeyAttributes: String): Unit =
          nonKeyAttributes(nonKeyAttributes.toList())

      /**
       * @param projectionType The set of attributes that are projected into the index:.
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       */
      override fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty,
    ) : CdkObject(cdkObject), ProjectionProperty {
      /**
       * Represents the non-key attribute names which will be projected into the index.
       *
       * For local secondary indexes, the total count of `NonKeyAttributes` summed across all of the
       * local secondary indexes, must not exceed 100. If you project the same attribute into two
       * different indexes, this counts as two distinct attributes when determining the total.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html#cfn-dynamodb-table-projection-nonkeyattributes)
       */
      override fun nonKeyAttributes(): List<String> = unwrap(this).getNonKeyAttributes() ?:
          emptyList()

      /**
       * The set of attributes that are projected into the index:.
       *
       * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
       * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
       * will include other non-key attributes that you specify.
       * * `ALL` - All of the table attributes are projected into the index.
       *
       * When using the DynamoDB console, `ALL` is selected by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html#cfn-dynamodb-table-projection-projectiontype)
       */
      override fun projectionType(): String? = unwrap(this).getProjectionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty):
          ProjectionProperty = CdkObjectWrappers.wrap(cdkObject) as? ProjectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectionProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty
    }
  }

  /**
   * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   *
   * For more information about the contents of a provisioned throughput structure, see [Amazon
   * DynamoDB Table
   * ProvisionedThroughput](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_ProvisionedThroughput.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * ProvisionedThroughputProperty provisionedThroughputProperty =
   * ProvisionedThroughputProperty.builder()
   * .readCapacityUnits(123)
   * .writeCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html)
   */
  public interface ProvisionedThroughputProperty {
    /**
     * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
     * `ThrottlingException` .
     *
     * For more information, see [Specifying Read and Write
     * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html#cfn-dynamodb-table-provisionedthroughput-readcapacityunits)
     */
    public fun readCapacityUnits(): Number

    /**
     * The maximum number of writes consumed per second before DynamoDB returns a
     * `ThrottlingException` .
     *
     * For more information, see [Specifying Read and Write
     * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
     * in the *Amazon DynamoDB Developer Guide* .
     *
     * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html#cfn-dynamodb-table-provisionedthroughput-writecapacityunits)
     */
    public fun writeCapacityUnits(): Number

    /**
     * A builder for [ProvisionedThroughputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityUnits The maximum number of strongly consistent reads consumed per
       * second before DynamoDB returns a `ThrottlingException` . 
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       */
      public fun readCapacityUnits(readCapacityUnits: Number)

      /**
       * @param writeCapacityUnits The maximum number of writes consumed per second before DynamoDB
       * returns a `ThrottlingException` . 
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       */
      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty.builder()

      /**
       * @param readCapacityUnits The maximum number of strongly consistent reads consumed per
       * second before DynamoDB returns a `ThrottlingException` . 
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       */
      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      /**
       * @param writeCapacityUnits The maximum number of writes consumed per second before DynamoDB
       * returns a `ThrottlingException` . 
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       */
      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject), ProvisionedThroughputProperty {
      /**
       * The maximum number of strongly consistent reads consumed per second before DynamoDB returns
       * a `ThrottlingException` .
       *
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html#cfn-dynamodb-table-provisionedthroughput-readcapacityunits)
       */
      override fun readCapacityUnits(): Number = unwrap(this).getReadCapacityUnits()

      /**
       * The maximum number of writes consumed per second before DynamoDB returns a
       * `ThrottlingException` .
       *
       * For more information, see [Specifying Read and Write
       * Requirements](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)
       * in the *Amazon DynamoDB Developer Guide* .
       *
       * If read/write capacity mode is `PAY_PER_REQUEST` the value is set to 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-provisionedthroughput.html#cfn-dynamodb-table-provisionedthroughput-writecapacityunits)
       */
      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedThroughputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.ProvisionedThroughputProperty
    }
  }

  /**
   * The S3 bucket that is being imported from.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface S3BucketSourceProperty {
    /**
     * The S3 bucket that is being imported from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The account number of the S3 bucket that is being imported from.
     *
     * If the bucket is owned by the requester this is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3bucketowner)
     */
    public fun s3BucketOwner(): String? = unwrap(this).getS3BucketOwner()

    /**
     * The key prefix shared by all S3 Objects that are being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3keyprefix)
     */
    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * A builder for [S3BucketSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket that is being imported from. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3BucketOwner The account number of the S3 bucket that is being imported from.
       * If the bucket is owned by the requester this is optional.
       */
      public fun s3BucketOwner(s3BucketOwner: String)

      /**
       * @param s3KeyPrefix The key prefix shared by all S3 Objects that are being imported.
       */
      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty.builder()

      /**
       * @param s3Bucket The S3 bucket that is being imported from. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3BucketOwner The account number of the S3 bucket that is being imported from.
       * If the bucket is owned by the requester this is optional.
       */
      override fun s3BucketOwner(s3BucketOwner: String) {
        cdkBuilder.s3BucketOwner(s3BucketOwner)
      }

      /**
       * @param s3KeyPrefix The key prefix shared by all S3 Objects that are being imported.
       */
      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty,
    ) : CdkObject(cdkObject), S3BucketSourceProperty {
      /**
       * The S3 bucket that is being imported from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The account number of the S3 bucket that is being imported from.
       *
       * If the bucket is owned by the requester this is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3bucketowner)
       */
      override fun s3BucketOwner(): String? = unwrap(this).getS3BucketOwner()

      /**
       * The key prefix shared by all S3 Objects that are being imported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-s3bucketsource.html#cfn-dynamodb-table-s3bucketsource-s3keyprefix)
       */
      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty):
          S3BucketSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? S3BucketSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketSourceProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.S3BucketSourceProperty
    }
  }

  /**
   * Represents the settings used to enable server-side encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface SSESpecificationProperty {
    /**
     * The AWS KMS key that should be used for the AWS KMS encryption.
     *
     * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     * that you should only provide this parameter if the key is different from the default DynamoDB
     * key `alias/aws/dynamodb` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid)
     */
    public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    /**
     * Indicates whether server-side encryption is done using an AWS managed key or an AWS owned
     * key.
     *
     * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is used
     * ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to
     * AWS owned key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled)
     */
    public fun sseEnabled(): Any

    /**
     * Server-side encryption type. The only supported value is:.
     *
     * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored in
     * your account and is managed by AWS KMS ( AWS KMS charges apply).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype)
     */
    public fun sseType(): String? = unwrap(this).getSseType()

    /**
     * A builder for [SSESpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption.
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       */
      public fun kmsMasterKeyId(kmsMasterKeyId: String)

      /**
       * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
       * or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is
       * used ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is
       * set to AWS owned key.
       */
      public fun sseEnabled(sseEnabled: Boolean)

      /**
       * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
       * or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is
       * used ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is
       * set to AWS owned key.
       */
      public fun sseEnabled(sseEnabled: IResolvable)

      /**
       * @param sseType Server-side encryption type. The only supported value is:.
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       */
      public fun sseType(sseType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty.builder()

      /**
       * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption.
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       */
      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      /**
       * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
       * or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is
       * used ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is
       * set to AWS owned key.
       */
      override fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
      }

      /**
       * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
       * or an AWS owned key. 
       * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is
       * used ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is
       * set to AWS owned key.
       */
      override fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param sseType Server-side encryption type. The only supported value is:.
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       */
      override fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
      }

      public fun build(): software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty,
    ) : CdkObject(cdkObject), SSESpecificationProperty {
      /**
       * The AWS KMS key that should be used for the AWS KMS encryption.
       *
       * To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN.
       * Note that you should only provide this parameter if the key is different from the default
       * DynamoDB key `alias/aws/dynamodb` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-kmsmasterkeyid)
       */
      override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

      /**
       * Indicates whether server-side encryption is done using an AWS managed key or an AWS owned
       * key.
       *
       * If enabled (true), server-side encryption type is set to `KMS` and an AWS managed key is
       * used ( AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is
       * set to AWS owned key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-sseenabled)
       */
      override fun sseEnabled(): Any = unwrap(this).getSseEnabled()

      /**
       * Server-side encryption type. The only supported value is:.
       *
       * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored
       * in your account and is managed by AWS KMS ( AWS KMS charges apply).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html#cfn-dynamodb-table-ssespecification-ssetype)
       */
      override fun sseType(): String? = unwrap(this).getSseType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SSESpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty):
          SSESpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? SSESpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SSESpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.SSESpecificationProperty
    }
  }

  /**
   * Represents the DynamoDB Streams configuration for a table in DynamoDB.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
   * StreamSpecificationProperty streamSpecificationProperty = StreamSpecificationProperty.builder()
   * .streamViewType("streamViewType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-streamspecification.html)
   */
  public interface StreamSpecificationProperty {
    /**
     * When an item in the table is modified, `StreamViewType` determines what information is
     * written to the stream for this table.
     *
     * Valid values for `StreamViewType` are:
     *
     * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
     * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
     * stream.
     * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
     * stream.
     * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to the
     * stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-streamspecification.html#cfn-dynamodb-table-streamspecification-streamviewtype)
     */
    public fun streamViewType(): String

    /**
     * A builder for [StreamSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamViewType When an item in the table is modified, `StreamViewType` determines
       * what information is written to the stream for this table. 
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       */
      public fun streamViewType(streamViewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.Builder =
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty.builder()

      /**
       * @param streamViewType When an item in the table is modified, `StreamViewType` determines
       * what information is written to the stream for this table. 
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       */
      override fun streamViewType(streamViewType: String) {
        cdkBuilder.streamViewType(streamViewType)
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty,
    ) : CdkObject(cdkObject), StreamSpecificationProperty {
      /**
       * When an item in the table is modified, `StreamViewType` determines what information is
       * written to the stream for this table.
       *
       * Valid values for `StreamViewType` are:
       *
       * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
       * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the
       * stream.
       * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
       * stream.
       * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to
       * the stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-streamspecification.html#cfn-dynamodb-table-streamspecification-streamviewtype)
       */
      override fun streamViewType(): String = unwrap(this).getStreamViewType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty):
          StreamSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.StreamSpecificationProperty
    }
  }

  /**
   * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.dynamodb.*;
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
  public interface TimeToLiveSpecificationProperty {
    /**
     * The name of the TTL attribute used to store the expiration time for items in the table.
     *
     *
     * * The `AttributeName` property is required when enabling the TTL, or when TTL is already
     * enabled.
     * * To update this property, you must first disable TTL and then enable TTL with the new
     * attribute name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-timetolivespecification.html#cfn-dynamodb-table-timetolivespecification-attributename)
     */
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    /**
     * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-timetolivespecification.html#cfn-dynamodb-table-timetolivespecification-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [TimeToLiveSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of the TTL attribute used to store the expiration time for
       * items in the table.
       *
       * * The `AttributeName` property is required when enabling the TTL, or when TTL is already
       * enabled.
       * * To update this property, you must first disable TTL and then enable TTL with the new
       * attribute name.
       */
      public fun attributeName(attributeName: String)

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty.builder()

      /**
       * @param attributeName The name of the TTL attribute used to store the expiration time for
       * items in the table.
       *
       * * The `AttributeName` property is required when enabling the TTL, or when TTL is already
       * enabled.
       * * To update this property, you must first disable TTL and then enable TTL with the new
       * attribute name.
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the
       * table. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty,
    ) : CdkObject(cdkObject), TimeToLiveSpecificationProperty {
      /**
       * The name of the TTL attribute used to store the expiration time for items in the table.
       *
       *
       * * The `AttributeName` property is required when enabling the TTL, or when TTL is already
       * enabled.
       * * To update this property, you must first disable TTL and then enable TTL with the new
       * attribute name.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-timetolivespecification.html#cfn-dynamodb-table-timetolivespecification-attributename)
       */
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      /**
       * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-timetolivespecification.html#cfn-dynamodb-table-timetolivespecification-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeToLiveSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty):
          TimeToLiveSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimeToLiveSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeToLiveSpecificationProperty):
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dynamodb.CfnTable.TimeToLiveSpecificationProperty
    }
  }
}
