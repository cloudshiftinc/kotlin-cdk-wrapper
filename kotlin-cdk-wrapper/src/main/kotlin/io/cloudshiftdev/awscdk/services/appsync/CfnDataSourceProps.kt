@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
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
public interface CfnDataSourceProps {
  /**
   * Unique AWS AppSync GraphQL API identifier where this data source will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
   */
  public fun apiId(): String

  /**
   * The description of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * AWS Region and TableName for an Amazon DynamoDB table in your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
   */
  public fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   *
   * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This property
   * is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an OpenSearch
   * Service data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
   */
  public fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

  /**
   * An EventBridge configuration that contains a valid ARN of an event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
   */
  public fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

  /**
   * Endpoints for an HTTP data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
   */
  public fun httpConfig(): Any? = unwrap(this).getHttpConfig()

  /**
   * An ARN of a Lambda function in valid ARN format.
   *
   * This can be the ARN of a Lambda function that exists in the current account or in another
   * account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
   */
  public fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

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
   */
  public fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  /**
   * Friendly name for you to identify your AppSync data source after creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
   */
  public fun name(): String

  /**
   * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
   */
  public fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

  /**
   * Relational Database configuration of the relational database data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
   */
  public fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

  /**
   * The AWS Identity and Access Management service role ARN for the data source.
   *
   * The system assumes this role when accessing the data source.
   *
   * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH` ,
   * `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
   */
  public fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

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
   */
  public fun type(): String

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId Unique AWS AppSync GraphQL API identifier where this data source will be
     * created. 
     */
    public fun apiId(apiId: String)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable)

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty)

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f5899905406c9cb2957b06ed9341002fc8e03a7566227b4bebbbfe9502a6b1b")
    public
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit)

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable)

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty)

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97e3723e80a155fb931c4d1b50be94b9f029cd43eb14d0305ced2ff662e0e92")
    public
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit)

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable)

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty)

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23945a82aa0ecb7796322ce072b4910c48c4ece3825f8c99e9dc062e2c043ff5")
    public
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit)

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    public fun httpConfig(httpConfig: IResolvable)

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty)

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bffa8002d26ae78a6b3702e292a71eee63716c5861e5c6c34cfedbbaeceebfc2")
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit)

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    public fun lambdaConfig(lambdaConfig: IResolvable)

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty)

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("239cc3c4cf652dc6110c569148705b48bb8fcef2142582fec9535456a9085144")
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit)

    /**
     * @param metricsConfig Enables or disables enhanced data source metrics for specified data
     * sources.
     * Note that `MetricsConfig` won't be used unless the `dataSourceLevelMetricsBehavior` value is
     * set to `PER_DATA_SOURCE_METRICS` . If the `dataSourceLevelMetricsBehavior` is set to
     * `FULL_REQUEST_DATA_SOURCE_METRICS` instead, `MetricsConfig` will be ignored. However, you can
     * still set its value.
     *
     * `MetricsConfig` can be `ENABLED` or `DISABLED` .
     */
    public fun metricsConfig(metricsConfig: String)

    /**
     * @param name Friendly name for you to identify your AppSync data source after creation. 
     */
    public fun name(name: String)

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable)

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty)

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0ff795e8b192096acd30d955d3cde975c4d54bffeb7d4d2c2609c11355ffe2")
    public
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit)

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable)

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty)

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1f9990817fa15280ff49915f76523cce55f290b546b355551fd4f45fa7c8fb")
    public
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit)

    /**
     * @param serviceRoleArn The AWS Identity and Access Management service role ARN for the data
     * source.
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * @param type The type of the data source. 
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
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDataSourceProps.builder()

    /**
     * @param apiId Unique AWS AppSync GraphQL API identifier where this data source will be
     * created. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    override fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(IResolvable::unwrap))
    }

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    override fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
      cdkBuilder.dynamoDbConfig(dynamoDbConfig.let(CfnDataSource.DynamoDBConfigProperty::unwrap))
    }

    /**
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f5899905406c9cb2957b06ed9341002fc8e03a7566227b4bebbbfe9502a6b1b")
    override
        fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit):
        Unit = dynamoDbConfig(CfnDataSource.DynamoDBConfigProperty(dynamoDbConfig))

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    override fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(IResolvable::unwrap))
    }

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
      cdkBuilder.elasticsearchConfig(elasticsearchConfig.let(CfnDataSource.ElasticsearchConfigProperty::unwrap))
    }

    /**
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     * in your account.
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97e3723e80a155fb931c4d1b50be94b9f029cd43eb14d0305ced2ff662e0e92")
    override
        fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty.Builder.() -> Unit):
        Unit = elasticsearchConfig(CfnDataSource.ElasticsearchConfigProperty(elasticsearchConfig))

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    override fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(IResolvable::unwrap))
    }

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    override fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
      cdkBuilder.eventBridgeConfig(eventBridgeConfig.let(CfnDataSource.EventBridgeConfigProperty::unwrap))
    }

    /**
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     * bus.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23945a82aa0ecb7796322ce072b4910c48c4ece3825f8c99e9dc062e2c043ff5")
    override
        fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty.Builder.() -> Unit):
        Unit = eventBridgeConfig(CfnDataSource.EventBridgeConfigProperty(eventBridgeConfig))

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    override fun httpConfig(httpConfig: IResolvable) {
      cdkBuilder.httpConfig(httpConfig.let(IResolvable::unwrap))
    }

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
      cdkBuilder.httpConfig(httpConfig.let(CfnDataSource.HttpConfigProperty::unwrap))
    }

    /**
     * @param httpConfig Endpoints for an HTTP data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bffa8002d26ae78a6b3702e292a71eee63716c5861e5c6c34cfedbbaeceebfc2")
    override fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty.Builder.() -> Unit): Unit =
        httpConfig(CfnDataSource.HttpConfigProperty(httpConfig))

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    override fun lambdaConfig(lambdaConfig: IResolvable) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(IResolvable::unwrap))
    }

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
      cdkBuilder.lambdaConfig(lambdaConfig.let(CfnDataSource.LambdaConfigProperty::unwrap))
    }

    /**
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("239cc3c4cf652dc6110c569148705b48bb8fcef2142582fec9535456a9085144")
    override fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty.Builder.() -> Unit):
        Unit = lambdaConfig(CfnDataSource.LambdaConfigProperty(lambdaConfig))

    /**
     * @param metricsConfig Enables or disables enhanced data source metrics for specified data
     * sources.
     * Note that `MetricsConfig` won't be used unless the `dataSourceLevelMetricsBehavior` value is
     * set to `PER_DATA_SOURCE_METRICS` . If the `dataSourceLevelMetricsBehavior` is set to
     * `FULL_REQUEST_DATA_SOURCE_METRICS` instead, `MetricsConfig` will be ignored. However, you can
     * still set its value.
     *
     * `MetricsConfig` can be `ENABLED` or `DISABLED` .
     */
    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    /**
     * @param name Friendly name for you to identify your AppSync data source after creation. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    override fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty) {
      cdkBuilder.openSearchServiceConfig(openSearchServiceConfig.let(CfnDataSource.OpenSearchServiceConfigProperty::unwrap))
    }

    /**
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     * domain in your account.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0ff795e8b192096acd30d955d3cde975c4d54bffeb7d4d2c2609c11355ffe2")
    override
        fun openSearchServiceConfig(openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty.Builder.() -> Unit):
        Unit =
        openSearchServiceConfig(CfnDataSource.OpenSearchServiceConfigProperty(openSearchServiceConfig))

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    override fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(IResolvable::unwrap))
    }

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty) {
      cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig.let(CfnDataSource.RelationalDatabaseConfigProperty::unwrap))
    }

    /**
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     * data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d1f9990817fa15280ff49915f76523cce55f290b546b355551fd4f45fa7c8fb")
    override
        fun relationalDatabaseConfig(relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty.Builder.() -> Unit):
        Unit =
        relationalDatabaseConfig(CfnDataSource.RelationalDatabaseConfigProperty(relationalDatabaseConfig))

    /**
     * @param serviceRoleArn The AWS Identity and Access Management service role ARN for the data
     * source.
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param type The type of the data source. 
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
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    /**
     * Unique AWS AppSync GraphQL API identifier where this data source will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     */
    override fun dynamoDbConfig(): Any? = unwrap(this).getDynamoDbConfig()

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     */
    override fun elasticsearchConfig(): Any? = unwrap(this).getElasticsearchConfig()

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     */
    override fun eventBridgeConfig(): Any? = unwrap(this).getEventBridgeConfig()

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     */
    override fun httpConfig(): Any? = unwrap(this).getHttpConfig()

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     */
    override fun lambdaConfig(): Any? = unwrap(this).getLambdaConfig()

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
     */
    override fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

    /**
     * Friendly name for you to identify your AppSync data source after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     */
    override fun openSearchServiceConfig(): Any? = unwrap(this).getOpenSearchServiceConfig()

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     */
    override fun relationalDatabaseConfig(): Any? = unwrap(this).getRelationalDatabaseConfig()

    /**
     * The AWS Identity and Access Management service role ARN for the data source.
     *
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
     */
    override fun serviceRoleArn(): String? = unwrap(this).getServiceRoleArn()

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
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as CfnDataSourceProps

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.appsync.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnDataSourceProps
  }
}
