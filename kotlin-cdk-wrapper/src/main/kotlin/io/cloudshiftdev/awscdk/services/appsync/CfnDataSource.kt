@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppSync::DataSource` resource creates data sources for resolvers in AWS AppSync to
 * connect to, such as Amazon DynamoDB , AWS Lambda , and Amazon OpenSearch Service .
 *
 * Resolvers use these data sources to fetch data when clients make GraphQL calls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
 * .apiId("apiId")
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .dynamoDbConfig(DynamoDBConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .tableName("tableName")
 * // the properties below are optional
 * .deltaSyncConfig(DeltaSyncConfigProperty.builder()
 * .baseTableTtl("baseTableTtl")
 * .deltaSyncTableName("deltaSyncTableName")
 * .deltaSyncTableTtl("deltaSyncTableTtl")
 * .build())
 * .useCallerCredentials(false)
 * .versioned(false)
 * .build())
 * .elasticsearchConfig(ElasticsearchConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build())
 * .eventBridgeConfig(EventBridgeConfigProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build())
 * .httpConfig(HttpConfigProperty.builder()
 * .endpoint("endpoint")
 * // the properties below are optional
 * .authorizationConfig(AuthorizationConfigProperty.builder()
 * .authorizationType("authorizationType")
 * // the properties below are optional
 * .awsIamConfig(AwsIamConfigProperty.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build())
 * .build())
 * .build())
 * .lambdaConfig(LambdaConfigProperty.builder()
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build())
 * .metricsConfig("metricsConfig")
 * .openSearchServiceConfig(OpenSearchServiceConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .endpoint("endpoint")
 * .build())
 * .relationalDatabaseConfig(RelationalDatabaseConfigProperty.builder()
 * .relationalDatabaseSourceType("relationalDatabaseSourceType")
 * // the properties below are optional
 * .rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .awsSecretStoreArn("awsSecretStoreArn")
 * .dbClusterIdentifier("dbClusterIdentifier")
 * // the properties below are optional
 * .databaseName("databaseName")
 * .schema("schema")
 * .build())
 * .build())
 * .serviceRoleArn("serviceRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
 */
public open class CfnDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.CfnDataSource(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataSourceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataSourceProps(props)
  )

  /**
   * Unique AWS AppSync GraphQL API identifier where this data source will be created.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * Unique AWS AppSync GraphQL API identifier where this data source will be created.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the API key, such as
   * `arn:aws:appsync:us-east-1:123456789012:apis/graphqlapiid/datasources/datasourcename` .
   */
  public open fun attrDataSourceArn(): String = unwrap(this).getAttrDataSourceArn()

  /**
   * The ID value.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Friendly name for you to identify your AWS AppSync data source after creation.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The description of the data source.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the data source.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * AWS Region and TableName for an Amazon DynamoDB table in your account.
   */
  public open fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  /**
   * AWS Region and TableName for an Amazon DynamoDB table in your account.
   */
  public open fun dynamoDbConfig(`value`: IResolvable) {
    unwrap(this).setDynamoDbConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * AWS Region and TableName for an Amazon DynamoDB table in your account.
   */
  public open fun dynamoDbConfig(`value`: DynamoDBConfigProperty) {
    unwrap(this).setDynamoDbConfig(`value`.let(DynamoDBConfigProperty::unwrap))
  }

  /**
   * AWS Region and TableName for an Amazon DynamoDB table in your account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9847d1b716708382d21f1d3bec380aa20ac82890a60a3003c6fe37d043191340")
  public open fun dynamoDbConfig(`value`: DynamoDBConfigProperty.Builder.() -> Unit): Unit =
      dynamoDbConfig(DynamoDBConfigProperty(`value`))

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun elasticsearchConfig(`value`: IResolvable) {
    unwrap(this).setElasticsearchConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun elasticsearchConfig(`value`: ElasticsearchConfigProperty) {
    unwrap(this).setElasticsearchConfig(`value`.let(ElasticsearchConfigProperty::unwrap))
  }

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83c2e7247c82d5e138346877167749a065612612e748405dbb788f06dd341875")
  public open fun elasticsearchConfig(`value`: ElasticsearchConfigProperty.Builder.() -> Unit): Unit
      = elasticsearchConfig(ElasticsearchConfigProperty(`value`))

  /**
   * An EventBridge configuration that contains a valid ARN of an event bus.
   */
  public open fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  /**
   * An EventBridge configuration that contains a valid ARN of an event bus.
   */
  public open fun eventBridgeConfig(`value`: IResolvable) {
    unwrap(this).setEventBridgeConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * An EventBridge configuration that contains a valid ARN of an event bus.
   */
  public open fun eventBridgeConfig(`value`: EventBridgeConfigProperty) {
    unwrap(this).setEventBridgeConfig(`value`.let(EventBridgeConfigProperty::unwrap))
  }

  /**
   * An EventBridge configuration that contains a valid ARN of an event bus.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("592a41e7ab9b043ee495c87318478f51c9a3d0e0a147572f4c99f32c4f975ce7")
  public open fun eventBridgeConfig(`value`: EventBridgeConfigProperty.Builder.() -> Unit): Unit =
      eventBridgeConfig(EventBridgeConfigProperty(`value`))

  /**
   * Endpoints for an HTTP data source.
   */
  public open fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  /**
   * Endpoints for an HTTP data source.
   */
  public open fun httpConfig(`value`: IResolvable) {
    unwrap(this).setHttpConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Endpoints for an HTTP data source.
   */
  public open fun httpConfig(`value`: HttpConfigProperty) {
    unwrap(this).setHttpConfig(`value`.let(HttpConfigProperty::unwrap))
  }

  /**
   * Endpoints for an HTTP data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dfdc489685bfc14040bb386cea5a7333ffcb75aed942eebc662664adb0e0427")
  public open fun httpConfig(`value`: HttpConfigProperty.Builder.() -> Unit): Unit =
      httpConfig(HttpConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An ARN of a Lambda function in valid ARN format.
   */
  public open fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

  /**
   * An ARN of a Lambda function in valid ARN format.
   */
  public open fun lambdaConfig(`value`: IResolvable) {
    unwrap(this).setLambdaConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * An ARN of a Lambda function in valid ARN format.
   */
  public open fun lambdaConfig(`value`: LambdaConfigProperty) {
    unwrap(this).setLambdaConfig(`value`.let(LambdaConfigProperty::unwrap))
  }

  /**
   * An ARN of a Lambda function in valid ARN format.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea92d93167aea122afe95976f0b49a87c63ae5f263f26d2bb0834e154274274")
  public open fun lambdaConfig(`value`: LambdaConfigProperty.Builder.() -> Unit): Unit =
      lambdaConfig(LambdaConfigProperty(`value`))

  /**
   * Enables or disables enhanced data source metrics for specified data sources.
   */
  public open fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  /**
   * Enables or disables enhanced data source metrics for specified data sources.
   */
  public open fun metricsConfig(`value`: String) {
    unwrap(this).setMetricsConfig(`value`)
  }

  /**
   * Friendly name for you to identify your AppSync data source after creation.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Friendly name for you to identify your AppSync data source after creation.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun openSearchServiceConfig(`value`: IResolvable) {
    unwrap(this).setOpenSearchServiceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  public open fun openSearchServiceConfig(`value`: OpenSearchServiceConfigProperty) {
    unwrap(this).setOpenSearchServiceConfig(`value`.let(OpenSearchServiceConfigProperty::unwrap))
  }

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("91b6688c97e2b6484edfbfcf4fd03c030800e3fad8600f188de4d1ac9717d780")
  public open
      fun openSearchServiceConfig(`value`: OpenSearchServiceConfigProperty.Builder.() -> Unit): Unit
      = openSearchServiceConfig(OpenSearchServiceConfigProperty(`value`))

  /**
   * Relational Database configuration of the relational database data source.
   */
  public open fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  /**
   * Relational Database configuration of the relational database data source.
   */
  public open fun relationalDatabaseConfig(`value`: IResolvable) {
    unwrap(this).setRelationalDatabaseConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Relational Database configuration of the relational database data source.
   */
  public open fun relationalDatabaseConfig(`value`: RelationalDatabaseConfigProperty) {
    unwrap(this).setRelationalDatabaseConfig(`value`.let(RelationalDatabaseConfigProperty::unwrap))
  }

  /**
   * Relational Database configuration of the relational database data source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("deddcd787d4e34169de7fdff78aa257416249c83b6cd9a650996203375316d9f")
  public open
      fun relationalDatabaseConfig(`value`: RelationalDatabaseConfigProperty.Builder.() -> Unit):
      Unit = relationalDatabaseConfig(RelationalDatabaseConfigProperty(`value`))

  /**
   * The AWS Identity and Access Management service role ARN for the data source.
   */
  public open fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

  /**
   * The AWS Identity and Access Management service role ARN for the data source.
   */
  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  /**
   * The type of the data source.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the data source.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Unique AWS AppSync GraphQL API identifier where this data source will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
     * @param apiId Unique AWS AppSync GraphQL API identifier where this data source will be
     * created. 
     */
    public fun apiId(apiId: String)

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    public fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty)

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf043b8a0324e8cba83c896eb3b8de672374ba174fe1c1840e63db4787ab86d")
    public fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty.Builder.() -> Unit)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    public fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af23ba3c1884605cbefd293bf604520c0a4999decc3132972519ce6c8f566eec")
    public
        fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty.Builder.() -> Unit)

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    public fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty)

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4c74ddc3490714ef3189129995dee44bb1ca9c7bfba1a9a6bdb7d2451070dd2")
    public fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty.Builder.() -> Unit)

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    public fun httpConfig(httpConfig: IResolvable)

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    public fun httpConfig(httpConfig: HttpConfigProperty)

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08d6ea4ca692be29a521d63c170735c9a43cec6600bce9728f00b25dfbf0908")
    public fun httpConfig(httpConfig: HttpConfigProperty.Builder.() -> Unit)

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty)

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b061edee103eb893f92d9a14bc5d5ef3ed457c5565af3b903d8cf4377662d99b")
    public fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit)

    /**
     * Enables or disables enhanced data source metrics for specified data sources.
     *
     * Note that `MetricsConfig` won't be used unless the `dataSourceLevelMetricsBehavior` value is
     * set to `PER_DATA_SOURCE_METRICS` . If the `dataSourceLevelMetricsBehavior` is set to
     * `FULL_REQUEST_DATA_SOURCE_METRICS` instead, `MetricsConfig` will be ignored. However, you can
     * still set its value.
     *
     * `MetricsConfig` can be `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-metricsconfig)
     * @param metricsConfig Enables or disables enhanced data source metrics for specified data
     * sources. 
     */
    public fun metricsConfig(metricsConfig: String)

    /**
     * Friendly name for you to identify your AppSync data source after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
     * @param name Friendly name for you to identify your AppSync data source after creation. 
     */
    public fun name(name: String)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty)

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db0304fb68d98d60026fc85293012ba30cd0ea0ae55a233747776aa47fc0734")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty.Builder.() -> Unit)

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty)

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1744480542680fc4bd2c859423c6a216f70f90bec2eb184b72ad0c1660b5243")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty.Builder.() -> Unit)

    /**
     * The AWS Identity and Access Management service role ARN for the data source.
     *
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
     * @param serviceRoleArn The AWS Identity and Access Management service role ARN for the data
     * source. 
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * The type of the data source.
     *
     * * *AWS_LAMBDA* : The data source is an AWS Lambda function.
     * * *AMAZON_DYNAMODB* : The data source is an Amazon DynamoDB table.
     * * *AMAZON_ELASTICSEARCH* : The data source is an Amazon OpenSearch Service domain.
     * * *AMAZON_EVENTBRIDGE* : The data source is an Amazon EventBridge event bus.
     * * *AMAZON_OPENSEARCH_SERVICE* : The data source is an Amazon OpenSearch Service domain.
     * * *NONE* : There is no data source. This type is used when you wish to invoke a GraphQL
     * operation without connecting to a data source, such as performing data transformation with
     * resolvers or triggering a subscription to be invoked from a mutation.
     * * *HTTP* : The data source is an HTTP endpoint.
     * * *RELATIONAL_DATABASE* : The data source is a relational database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDataSource.Builder =
        software.amazon.awscdk.services.appsync.CfnDataSource.Builder.create(scope, id)

    /**
     * Unique AWS AppSync GraphQL API identifier where this data source will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
     * @param apiId Unique AWS AppSync GraphQL API identifier where this data source will be
     * created. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable::unwrap))
    }

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    override fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(DynamoDBConfigProperty::unwrap))
    }

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0bf043b8a0324e8cba83c896eb3b8de672374ba174fe1c1840e63db4787ab86d")
    override fun dynamoDbConfig(dynamoDbConfig: DynamoDBConfigProperty.Builder.() -> Unit): Unit =
        dynamoDbConfig(DynamoDBConfigProperty(dynamoDbConfig))

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable::unwrap))
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    override fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(ElasticsearchConfigProperty::unwrap))
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af23ba3c1884605cbefd293bf604520c0a4999decc3132972519ce6c8f566eec")
    override
        fun elasticsearchConfig(elasticsearchConfig: ElasticsearchConfigProperty.Builder.() -> Unit):
        Unit = elasticsearchConfig(ElasticsearchConfigProperty(elasticsearchConfig))

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable::unwrap))
    }

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    override fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(EventBridgeConfigProperty::unwrap))
    }

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4c74ddc3490714ef3189129995dee44bb1ca9c7bfba1a9a6bdb7d2451070dd2")
    override fun eventBridgeConfig(eventBridgeConfig: EventBridgeConfigProperty.Builder.() -> Unit):
        Unit = eventBridgeConfig(EventBridgeConfigProperty(eventBridgeConfig))

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable::unwrap))
    }

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    override fun httpConfig(httpConfig: HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(HttpConfigProperty::unwrap))
    }

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     * @param httpConfig Endpoints for an HTTP data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08d6ea4ca692be29a521d63c170735c9a43cec6600bce9728f00b25dfbf0908")
    override fun httpConfig(httpConfig: HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(HttpConfigProperty(httpConfig))

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    override fun lambdaConfig(lambdaConfig: LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(LambdaConfigProperty::unwrap))
    }

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b061edee103eb893f92d9a14bc5d5ef3ed457c5565af3b903d8cf4377662d99b")
    override fun lambdaConfig(lambdaConfig: LambdaConfigProperty.Builder.() -> Unit): Unit =
        lambdaConfig(LambdaConfigProperty(lambdaConfig))

    /**
     * Enables or disables enhanced data source metrics for specified data sources.
     *
     * Note that `MetricsConfig` won't be used unless the `dataSourceLevelMetricsBehavior` value is
     * set to `PER_DATA_SOURCE_METRICS` . If the `dataSourceLevelMetricsBehavior` is set to
     * `FULL_REQUEST_DATA_SOURCE_METRICS` instead, `MetricsConfig` will be ignored. However, you can
     * still set its value.
     *
     * `MetricsConfig` can be `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-metricsconfig)
     * @param metricsConfig Enables or disables enhanced data source metrics for specified data
     * sources. 
     */
    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    /**
     * Friendly name for you to identify your AppSync data source after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
     * @param name Friendly name for you to identify your AppSync data source after creation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable::unwrap))
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    override fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(OpenSearchServiceConfigProperty::unwrap))
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7db0304fb68d98d60026fc85293012ba30cd0ea0ae55a233747776aa47fc0734")
    override
        fun openSearchServiceConfig(openSearchServiceConfig: OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit = openSearchServiceConfig(OpenSearchServiceConfigProperty(openSearchServiceConfig))

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable::unwrap))
    }

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(RelationalDatabaseConfigProperty::unwrap))
    }

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1744480542680fc4bd2c859423c6a216f70f90bec2eb184b72ad0c1660b5243")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit = relationalDatabaseConfig(RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    /**
     * The AWS Identity and Access Management service role ARN for the data source.
     *
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
     * @param serviceRoleArn The AWS Identity and Access Management service role ARN for the data
     * source. 
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * The type of the data source.
     *
     * * *AWS_LAMBDA* : The data source is an AWS Lambda function.
     * * *AMAZON_DYNAMODB* : The data source is an Amazon DynamoDB table.
     * * *AMAZON_ELASTICSEARCH* : The data source is an Amazon OpenSearch Service domain.
     * * *AMAZON_EVENTBRIDGE* : The data source is an Amazon EventBridge event bus.
     * * *AMAZON_OPENSEARCH_SERVICE* : The data source is an Amazon OpenSearch Service domain.
     * * *NONE* : There is no data source. This type is used when you wish to invoke a GraphQL
     * operation without connecting to a data source, such as performing data transformation with
     * resolvers or triggering a subscription to be invoked from a mutation.
     * * *HTTP* : The data source is an HTTP endpoint.
     * * *RELATIONAL_DATABASE* : The data source is a relational database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.appsync.CfnDataSource = wrapped.cdkObject
  }

  /**
   * The `AuthorizationConfig` property type specifies the authorization type and configuration for
   * an AWS AppSync http data source.
   *
   * `AuthorizationConfig` is a property of the [AWS AppSync DataSource
   * HttpConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
   * .authorizationType("authorizationType")
   * // the properties below are optional
   * .awsIamConfig(AwsIamConfigProperty.builder()
   * .signingRegion("signingRegion")
   * .signingServiceName("signingServiceName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html)
   */
  public interface AuthorizationConfigProperty {
    /**
     * The authorization type that the HTTP endpoint requires.
     *
     * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype)
     */
    public fun authorizationType(): String

    /**
     * The AWS Identity and Access Management settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-awsiamconfig)
     */
    public fun awsIamConfig(): Any? = unwrap(this).getAwsIamConfig()

    /**
     * A builder for [AuthorizationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationType The authorization type that the HTTP endpoint requires. 
       * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
       */
      public fun authorizationType(authorizationType: String)

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      public fun awsIamConfig(awsIamConfig: IResolvable)

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      public fun awsIamConfig(awsIamConfig: AwsIamConfigProperty)

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e361c77d7cd39b00648a85be5e24e1d444972385f26641485f260026656be75")
      public fun awsIamConfig(awsIamConfig: AwsIamConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty.builder()

      /**
       * @param authorizationType The authorization type that the HTTP endpoint requires. 
       * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
       */
      override fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
      }

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      override fun awsIamConfig(awsIamConfig: IResolvable) {
        cdkBuilder.awsIamConfig(awsIamConfig.let(IResolvable::unwrap))
      }

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      override fun awsIamConfig(awsIamConfig: AwsIamConfigProperty) {
        cdkBuilder.awsIamConfig(awsIamConfig.let(AwsIamConfigProperty::unwrap))
      }

      /**
       * @param awsIamConfig The AWS Identity and Access Management settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e361c77d7cd39b00648a85be5e24e1d444972385f26641485f260026656be75")
      override fun awsIamConfig(awsIamConfig: AwsIamConfigProperty.Builder.() -> Unit): Unit =
          awsIamConfig(AwsIamConfigProperty(awsIamConfig))

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty,
    ) : CdkObject(cdkObject), AuthorizationConfigProperty {
      /**
       * The authorization type that the HTTP endpoint requires.
       *
       * * *AWS_IAM* : The authorization type is Signature Version 4 (SigV4).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype)
       */
      override fun authorizationType(): String = unwrap(this).getAuthorizationType()

      /**
       * The AWS Identity and Access Management settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-awsiamconfig)
       */
      override fun awsIamConfig(): Any? = unwrap(this).getAwsIamConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty):
          AuthorizationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthorizationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.AuthorizationConfigProperty
    }
  }

  /**
   * Use the `AwsIamConfig` property type to specify `AwsIamConfig` for a AWS AppSync authorizaton.
   *
   * `AwsIamConfig` is a property of the [AWS AppSync DataSource
   * AuthorizationConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig-authorizationconfig.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * AwsIamConfigProperty awsIamConfigProperty = AwsIamConfigProperty.builder()
   * .signingRegion("signingRegion")
   * .signingServiceName("signingServiceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html)
   */
  public interface AwsIamConfigProperty {
    /**
     * The signing Region for AWS Identity and Access Management authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion)
     */
    public fun signingRegion(): String? = unwrap(this).getSigningRegion()

    /**
     * The signing service name for AWS Identity and Access Management authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename)
     */
    public fun signingServiceName(): String? = unwrap(this).getSigningServiceName()

    /**
     * A builder for [AwsIamConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param signingRegion The signing Region for AWS Identity and Access Management
       * authorization.
       */
      public fun signingRegion(signingRegion: String)

      /**
       * @param signingServiceName The signing service name for AWS Identity and Access Management
       * authorization.
       */
      public fun signingServiceName(signingServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty.builder()

      /**
       * @param signingRegion The signing Region for AWS Identity and Access Management
       * authorization.
       */
      override fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
      }

      /**
       * @param signingServiceName The signing service name for AWS Identity and Access Management
       * authorization.
       */
      override fun signingServiceName(signingServiceName: String) {
        cdkBuilder.signingServiceName(signingServiceName)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty,
    ) : CdkObject(cdkObject), AwsIamConfigProperty {
      /**
       * The signing Region for AWS Identity and Access Management authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingregion)
       */
      override fun signingRegion(): String? = unwrap(this).getSigningRegion()

      /**
       * The signing service name for AWS Identity and Access Management authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html#cfn-appsync-datasource-awsiamconfig-signingservicename)
       */
      override fun signingServiceName(): String? = unwrap(this).getSigningServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty):
          AwsIamConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? AwsIamConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsIamConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.AwsIamConfigProperty
    }
  }

  /**
   * Describes a Delta Sync configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * DeltaSyncConfigProperty deltaSyncConfigProperty = DeltaSyncConfigProperty.builder()
   * .baseTableTtl("baseTableTtl")
   * .deltaSyncTableName("deltaSyncTableName")
   * .deltaSyncTableTtl("deltaSyncTableTtl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html)
   */
  public interface DeltaSyncConfigProperty {
    /**
     * The number of minutes that an Item is stored in the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl)
     */
    public fun baseTableTtl(): String

    /**
     * The Delta Sync table name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename)
     */
    public fun deltaSyncTableName(): String

    /**
     * The number of minutes that a Delta Sync log entry is stored in the Delta Sync table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl)
     */
    public fun deltaSyncTableTtl(): String

    /**
     * A builder for [DeltaSyncConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseTableTtl The number of minutes that an Item is stored in the data source. 
       */
      public fun baseTableTtl(baseTableTtl: String)

      /**
       * @param deltaSyncTableName The Delta Sync table name. 
       */
      public fun deltaSyncTableName(deltaSyncTableName: String)

      /**
       * @param deltaSyncTableTtl The number of minutes that a Delta Sync log entry is stored in the
       * Delta Sync table. 
       */
      public fun deltaSyncTableTtl(deltaSyncTableTtl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty.builder()

      /**
       * @param baseTableTtl The number of minutes that an Item is stored in the data source. 
       */
      override fun baseTableTtl(baseTableTtl: String) {
        cdkBuilder.baseTableTtl(baseTableTtl)
      }

      /**
       * @param deltaSyncTableName The Delta Sync table name. 
       */
      override fun deltaSyncTableName(deltaSyncTableName: String) {
        cdkBuilder.deltaSyncTableName(deltaSyncTableName)
      }

      /**
       * @param deltaSyncTableTtl The number of minutes that a Delta Sync log entry is stored in the
       * Delta Sync table. 
       */
      override fun deltaSyncTableTtl(deltaSyncTableTtl: String) {
        cdkBuilder.deltaSyncTableTtl(deltaSyncTableTtl)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty,
    ) : CdkObject(cdkObject), DeltaSyncConfigProperty {
      /**
       * The number of minutes that an Item is stored in the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-basetablettl)
       */
      override fun baseTableTtl(): String = unwrap(this).getBaseTableTtl()

      /**
       * The Delta Sync table name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablename)
       */
      override fun deltaSyncTableName(): String = unwrap(this).getDeltaSyncTableName()

      /**
       * The number of minutes that a Delta Sync log entry is stored in the Delta Sync table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html#cfn-appsync-datasource-deltasyncconfig-deltasynctablettl)
       */
      override fun deltaSyncTableTtl(): String = unwrap(this).getDeltaSyncTableTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaSyncConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty):
          DeltaSyncConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DeltaSyncConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaSyncConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.DeltaSyncConfigProperty
    }
  }

  /**
   * The `DynamoDBConfig` property type specifies the `AwsRegion` and `TableName` for an Amazon
   * DynamoDB table in your account for an AWS AppSync data source.
   *
   * `DynamoDBConfig` is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * DynamoDBConfigProperty dynamoDBConfigProperty = DynamoDBConfigProperty.builder()
   * .awsRegion("awsRegion")
   * .tableName("tableName")
   * // the properties below are optional
   * .deltaSyncConfig(DeltaSyncConfigProperty.builder()
   * .baseTableTtl("baseTableTtl")
   * .deltaSyncTableName("deltaSyncTableName")
   * .deltaSyncTableTtl("deltaSyncTableTtl")
   * .build())
   * .useCallerCredentials(false)
   * .versioned(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html)
   */
  public interface DynamoDBConfigProperty {
    /**
     * The AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion)
     */
    public fun awsRegion(): String

    /**
     * The `DeltaSyncConfig` for a versioned datasource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-deltasyncconfig)
     */
    public fun deltaSyncConfig(): Any? = unwrap(this).getDeltaSyncConfig()

    /**
     * The table name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename)
     */
    public fun tableName(): String

    /**
     * Set to `TRUE` to use AWS Identity and Access Management with this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials)
     */
    public fun useCallerCredentials(): Any? = unwrap(this).getUseCallerCredentials()

    /**
     * Set to TRUE to use Conflict Detection and Resolution with this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned)
     */
    public fun versioned(): Any? = unwrap(this).getVersioned()

    /**
     * A builder for [DynamoDBConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsRegion The AWS Region. 
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      public fun deltaSyncConfig(deltaSyncConfig: IResolvable)

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      public fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty)

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1002deaccd15ebe98dae193da399c9a598c2958f044db78528bbe004ff78089")
      public fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty.Builder.() -> Unit)

      /**
       * @param tableName The table name. 
       */
      public fun tableName(tableName: String)

      /**
       * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with
       * this data source.
       */
      public fun useCallerCredentials(useCallerCredentials: Boolean)

      /**
       * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with
       * this data source.
       */
      public fun useCallerCredentials(useCallerCredentials: IResolvable)

      /**
       * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data
       * source.
       */
      public fun versioned(versioned: Boolean)

      /**
       * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data
       * source.
       */
      public fun versioned(versioned: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty.builder()

      /**
       * @param awsRegion The AWS Region. 
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      override fun deltaSyncConfig(deltaSyncConfig: IResolvable) {
        cdkBuilder.deltaSyncConfig(deltaSyncConfig.let(IResolvable::unwrap))
      }

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      override fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty) {
        cdkBuilder.deltaSyncConfig(deltaSyncConfig.let(DeltaSyncConfigProperty::unwrap))
      }

      /**
       * @param deltaSyncConfig The `DeltaSyncConfig` for a versioned datasource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1002deaccd15ebe98dae193da399c9a598c2958f044db78528bbe004ff78089")
      override fun deltaSyncConfig(deltaSyncConfig: DeltaSyncConfigProperty.Builder.() -> Unit):
          Unit = deltaSyncConfig(DeltaSyncConfigProperty(deltaSyncConfig))

      /**
       * @param tableName The table name. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with
       * this data source.
       */
      override fun useCallerCredentials(useCallerCredentials: Boolean) {
        cdkBuilder.useCallerCredentials(useCallerCredentials)
      }

      /**
       * @param useCallerCredentials Set to `TRUE` to use AWS Identity and Access Management with
       * this data source.
       */
      override fun useCallerCredentials(useCallerCredentials: IResolvable) {
        cdkBuilder.useCallerCredentials(useCallerCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data
       * source.
       */
      override fun versioned(versioned: Boolean) {
        cdkBuilder.versioned(versioned)
      }

      /**
       * @param versioned Set to TRUE to use Conflict Detection and Resolution with this data
       * source.
       */
      override fun versioned(versioned: IResolvable) {
        cdkBuilder.versioned(versioned.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty,
    ) : CdkObject(cdkObject), DynamoDBConfigProperty {
      /**
       * The AWS Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-awsregion)
       */
      override fun awsRegion(): String = unwrap(this).getAwsRegion()

      /**
       * The `DeltaSyncConfig` for a versioned datasource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-deltasyncconfig)
       */
      override fun deltaSyncConfig(): Any? = unwrap(this).getDeltaSyncConfig()

      /**
       * The table name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()

      /**
       * Set to `TRUE` to use AWS Identity and Access Management with this data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-usecallercredentials)
       */
      override fun useCallerCredentials(): Any? = unwrap(this).getUseCallerCredentials()

      /**
       * Set to TRUE to use Conflict Detection and Resolution with this data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-dynamodbconfig.html#cfn-appsync-datasource-dynamodbconfig-versioned)
       */
      override fun versioned(): Any? = unwrap(this).getVersioned()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty):
          DynamoDBConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DynamoDBConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.DynamoDBConfigProperty
    }
  }

  /**
   * The `ElasticsearchConfig` property type specifies the `AwsRegion` and `Endpoints` for an Amazon
   * OpenSearch Service domain in your account for an AWS AppSync data source.
   *
   * ElasticsearchConfig is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * property type.
   *
   * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This property
   * is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an OpenSearch
   * Service data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * ElasticsearchConfigProperty elasticsearchConfigProperty = ElasticsearchConfigProperty.builder()
   * .awsRegion("awsRegion")
   * .endpoint("endpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html)
   */
  public interface ElasticsearchConfigProperty {
    /**
     * The AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion)
     */
    public fun awsRegion(): String

    /**
     * The endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint)
     */
    public fun endpoint(): String

    /**
     * A builder for [ElasticsearchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsRegion The AWS Region. 
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param endpoint The endpoint. 
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty.builder()

      /**
       * @param awsRegion The AWS Region. 
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param endpoint The endpoint. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty,
    ) : CdkObject(cdkObject), ElasticsearchConfigProperty {
      /**
       * The AWS Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-awsregion)
       */
      override fun awsRegion(): String = unwrap(this).getAwsRegion()

      /**
       * The endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html#cfn-appsync-datasource-elasticsearchconfig-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticsearchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty):
          ElasticsearchConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticsearchConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticsearchConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.ElasticsearchConfigProperty
    }
  }

  /**
   * The data source.
   *
   * This can be an API destination, resource, or AWS service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * EventBridgeConfigProperty eventBridgeConfigProperty = EventBridgeConfigProperty.builder()
   * .eventBusArn("eventBusArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-eventbridgeconfig.html)
   */
  public interface EventBridgeConfigProperty {
    /**
     * The event bus pipeline's ARN.
     *
     * For more information about event buses, see [EventBridge event
     * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-eventbridgeconfig.html#cfn-appsync-datasource-eventbridgeconfig-eventbusarn)
     */
    public fun eventBusArn(): String

    /**
     * A builder for [EventBridgeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBusArn The event bus pipeline's ARN. 
       * For more information about event buses, see [EventBridge event
       * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) .
       */
      public fun eventBusArn(eventBusArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty.builder()

      /**
       * @param eventBusArn The event bus pipeline's ARN. 
       * For more information about event buses, see [EventBridge event
       * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) .
       */
      override fun eventBusArn(eventBusArn: String) {
        cdkBuilder.eventBusArn(eventBusArn)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty,
    ) : CdkObject(cdkObject), EventBridgeConfigProperty {
      /**
       * The event bus pipeline's ARN.
       *
       * For more information about event buses, see [EventBridge event
       * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-eventbridgeconfig.html#cfn-appsync-datasource-eventbridgeconfig-eventbusarn)
       */
      override fun eventBusArn(): String = unwrap(this).getEventBusArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty):
          EventBridgeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EventBridgeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.EventBridgeConfigProperty
    }
  }

  /**
   * Use the `HttpConfig` property type to specify `HttpConfig` for an AWS AppSync data source.
   *
   * `HttpConfig` is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * HttpConfigProperty httpConfigProperty = HttpConfigProperty.builder()
   * .endpoint("endpoint")
   * // the properties below are optional
   * .authorizationConfig(AuthorizationConfigProperty.builder()
   * .authorizationType("authorizationType")
   * // the properties below are optional
   * .awsIamConfig(AwsIamConfigProperty.builder()
   * .signingRegion("signingRegion")
   * .signingServiceName("signingServiceName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
   */
  public interface HttpConfigProperty {
    /**
     * The authorization configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-authorizationconfig)
     */
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    /**
     * The endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint)
     */
    public fun endpoint(): String

    /**
     * A builder for [HttpConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationConfig The authorization configuration.
       */
      public fun authorizationConfig(authorizationConfig: IResolvable)

      /**
       * @param authorizationConfig The authorization configuration.
       */
      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty)

      /**
       * @param authorizationConfig The authorization configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9900f5245e9541abfe09c6a72be99e3d73b35739de732b27e104b26649a924fd")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit)

      /**
       * @param endpoint The endpoint. 
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty.builder()

      /**
       * @param authorizationConfig The authorization configuration.
       */
      override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration.
       */
      override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9900f5245e9541abfe09c6a72be99e3d73b35739de732b27e104b26649a924fd")
      override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      /**
       * @param endpoint The endpoint. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty,
    ) : CdkObject(cdkObject), HttpConfigProperty {
      /**
       * The authorization configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-authorizationconfig)
       */
      override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      /**
       * The endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty):
          HttpConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.HttpConfigProperty
    }
  }

  /**
   * The `LambdaConfig` property type specifies the Lambda function ARN for an AWS AppSync data
   * source.
   *
   * `LambdaConfig` is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html)
   */
  public interface LambdaConfigProperty {
    /**
     * The ARN for the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn)
     */
    public fun lambdaFunctionArn(): String

    /**
     * A builder for [LambdaConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaFunctionArn The ARN for the Lambda function. 
       */
      public fun lambdaFunctionArn(lambdaFunctionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.Builder =
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty.builder()

      /**
       * @param lambdaFunctionArn The ARN for the Lambda function. 
       */
      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build(): software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty,
    ) : CdkObject(cdkObject), LambdaConfigProperty {
      /**
       * The ARN for the Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html#cfn-appsync-datasource-lambdaconfig-lambdafunctionarn)
       */
      override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty):
          LambdaConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.LambdaConfigProperty
    }
  }

  /**
   * The `OpenSearchServiceConfig` property type specifies the `AwsRegion` and `Endpoints` for an
   * Amazon OpenSearch Service domain in your account for an AWS AppSync data source.
   *
   * `OpenSearchServiceConfig` is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * OpenSearchServiceConfigProperty openSearchServiceConfigProperty =
   * OpenSearchServiceConfigProperty.builder()
   * .awsRegion("awsRegion")
   * .endpoint("endpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html)
   */
  public interface OpenSearchServiceConfigProperty {
    /**
     * The AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html#cfn-appsync-datasource-opensearchserviceconfig-awsregion)
     */
    public fun awsRegion(): String

    /**
     * The endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html#cfn-appsync-datasource-opensearchserviceconfig-endpoint)
     */
    public fun endpoint(): String

    /**
     * A builder for [OpenSearchServiceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsRegion The AWS Region. 
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param endpoint The endpoint. 
       */
      public fun endpoint(endpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty.builder()

      /**
       * @param awsRegion The AWS Region. 
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param endpoint The endpoint. 
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty,
    ) : CdkObject(cdkObject), OpenSearchServiceConfigProperty {
      /**
       * The AWS Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html#cfn-appsync-datasource-opensearchserviceconfig-awsregion)
       */
      override fun awsRegion(): String = unwrap(this).getAwsRegion()

      /**
       * The endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html#cfn-appsync-datasource-opensearchserviceconfig-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenSearchServiceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty):
          OpenSearchServiceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenSearchServiceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenSearchServiceConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.OpenSearchServiceConfigProperty
    }
  }

  /**
   * Use the `RdsHttpEndpointConfig` property type to specify the `RdsHttpEndpoint` for an AWS
   * AppSync relational database.
   *
   * `RdsHttpEndpointConfig` is a property of the [AWS AppSync DataSource
   * RelationalDatabaseConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * RdsHttpEndpointConfigProperty rdsHttpEndpointConfigProperty =
   * RdsHttpEndpointConfigProperty.builder()
   * .awsRegion("awsRegion")
   * .awsSecretStoreArn("awsSecretStoreArn")
   * .dbClusterIdentifier("dbClusterIdentifier")
   * // the properties below are optional
   * .databaseName("databaseName")
   * .schema("schema")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html)
   */
  public interface RdsHttpEndpointConfigProperty {
    /**
     * AWS Region for RDS HTTP endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-awsregion)
     */
    public fun awsRegion(): String

    /**
     * The ARN for database credentials stored in AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-awssecretstorearn)
     */
    public fun awsSecretStoreArn(): String

    /**
     * Logical database name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Amazon RDS cluster Amazon Resource Name (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-dbclusteridentifier)
     */
    public fun dbClusterIdentifier(): String

    /**
     * Logical schema name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-schema)
     */
    public fun schema(): String? = unwrap(this).getSchema()

    /**
     * A builder for [RdsHttpEndpointConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsRegion AWS Region for RDS HTTP endpoint. 
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param awsSecretStoreArn The ARN for database credentials stored in AWS Secrets Manager . 
       */
      public fun awsSecretStoreArn(awsSecretStoreArn: String)

      /**
       * @param databaseName Logical database name.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param dbClusterIdentifier Amazon RDS cluster Amazon Resource Name (ARN). 
       */
      public fun dbClusterIdentifier(dbClusterIdentifier: String)

      /**
       * @param schema Logical schema name.
       */
      public fun schema(schema: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty.builder()

      /**
       * @param awsRegion AWS Region for RDS HTTP endpoint. 
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param awsSecretStoreArn The ARN for database credentials stored in AWS Secrets Manager . 
       */
      override fun awsSecretStoreArn(awsSecretStoreArn: String) {
        cdkBuilder.awsSecretStoreArn(awsSecretStoreArn)
      }

      /**
       * @param databaseName Logical database name.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param dbClusterIdentifier Amazon RDS cluster Amazon Resource Name (ARN). 
       */
      override fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
      }

      /**
       * @param schema Logical schema name.
       */
      override fun schema(schema: String) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty,
    ) : CdkObject(cdkObject), RdsHttpEndpointConfigProperty {
      /**
       * AWS Region for RDS HTTP endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-awsregion)
       */
      override fun awsRegion(): String = unwrap(this).getAwsRegion()

      /**
       * The ARN for database credentials stored in AWS Secrets Manager .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-awssecretstorearn)
       */
      override fun awsSecretStoreArn(): String = unwrap(this).getAwsSecretStoreArn()

      /**
       * Logical database name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Amazon RDS cluster Amazon Resource Name (ARN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-dbclusteridentifier)
       */
      override fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

      /**
       * Logical schema name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-rdshttpendpointconfig.html#cfn-appsync-datasource-rdshttpendpointconfig-schema)
       */
      override fun schema(): String? = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsHttpEndpointConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty):
          RdsHttpEndpointConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RdsHttpEndpointConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsHttpEndpointConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.RdsHttpEndpointConfigProperty
    }
  }

  /**
   * Use the `RelationalDatabaseConfig` property type to specify `RelationalDatabaseConfig` for an
   * AWS AppSync data source.
   *
   * `RelationalDatabaseConfig` is a property of the
   * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appsync.*;
   * RelationalDatabaseConfigProperty relationalDatabaseConfigProperty =
   * RelationalDatabaseConfigProperty.builder()
   * .relationalDatabaseSourceType("relationalDatabaseSourceType")
   * // the properties below are optional
   * .rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty.builder()
   * .awsRegion("awsRegion")
   * .awsSecretStoreArn("awsSecretStoreArn")
   * .dbClusterIdentifier("dbClusterIdentifier")
   * // the properties below are optional
   * .databaseName("databaseName")
   * .schema("schema")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html)
   */
  public interface RelationalDatabaseConfigProperty {
    /**
     * Information about the Amazon RDS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-rdshttpendpointconfig)
     */
    public fun rdsHttpEndpointConfig(): Any? = unwrap(this).getRdsHttpEndpointConfig()

    /**
     * The type of relational data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype)
     */
    public fun relationalDatabaseSourceType(): String

    /**
     * A builder for [RelationalDatabaseConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable)

      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      public fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty)

      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0c0e1a030f7709ef41b4271ecea3609f7962dfd162d9b4ff87849ef4d907eab")
      public
          fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty.Builder.() -> Unit)

      /**
       * @param relationalDatabaseSourceType The type of relational data source. 
       */
      public fun relationalDatabaseSourceType(relationalDatabaseSourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.Builder
          =
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty.builder()

      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      override fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: IResolvable) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig.let(IResolvable::unwrap))
      }

      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      override fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty) {
        cdkBuilder.rdsHttpEndpointConfig(rdsHttpEndpointConfig.let(RdsHttpEndpointConfigProperty::unwrap))
      }

      /**
       * @param rdsHttpEndpointConfig Information about the Amazon RDS resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0c0e1a030f7709ef41b4271ecea3609f7962dfd162d9b4ff87849ef4d907eab")
      override
          fun rdsHttpEndpointConfig(rdsHttpEndpointConfig: RdsHttpEndpointConfigProperty.Builder.() -> Unit):
          Unit = rdsHttpEndpointConfig(RdsHttpEndpointConfigProperty(rdsHttpEndpointConfig))

      /**
       * @param relationalDatabaseSourceType The type of relational data source. 
       */
      override fun relationalDatabaseSourceType(relationalDatabaseSourceType: String) {
        cdkBuilder.relationalDatabaseSourceType(relationalDatabaseSourceType)
      }

      public fun build():
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty,
    ) : CdkObject(cdkObject), RelationalDatabaseConfigProperty {
      /**
       * Information about the Amazon RDS resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-rdshttpendpointconfig)
       */
      override fun rdsHttpEndpointConfig(): Any? = unwrap(this).getRdsHttpEndpointConfig()

      /**
       * The type of relational data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html#cfn-appsync-datasource-relationaldatabaseconfig-relationaldatabasesourcetype)
       */
      override fun relationalDatabaseSourceType(): String =
          unwrap(this).getRelationalDatabaseSourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelationalDatabaseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty):
          RelationalDatabaseConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RelationalDatabaseConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalDatabaseConfigProperty):
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appsync.CfnDataSource.RelationalDatabaseConfigProperty
    }
  }
}
