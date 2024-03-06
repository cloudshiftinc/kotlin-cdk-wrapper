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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.constructs.Construct

/**
 * The `AWS::AppSync::DataSource` resource creates data sources for resolvers in AWS AppSync to
 * connect to, such as Amazon DynamoDB , AWS Lambda , and Amazon OpenSearch Service .
 *
 * Resolvers use these data sources to fetch data when clients make GraphQL calls.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
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
@CdkDslMarker
public class CfnDataSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

    /**
     * Unique AWS AppSync GraphQL API identifier where this data source will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-apiid)
     *
     * @param apiId Unique AWS AppSync GraphQL API identifier where this data source will be
     *   created.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-description)
     *
     * @param description The description of the data source.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     *
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    public fun dynamoDbConfig(dynamoDbConfig: IResolvable) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    /**
     * AWS Region and TableName for an Amazon DynamoDB table in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-dynamodbconfig)
     *
     * @param dynamoDbConfig AWS Region and TableName for an Amazon DynamoDB table in your account.
     */
    public fun dynamoDbConfig(dynamoDbConfig: CfnDataSource.DynamoDBConfigProperty) {
        cdkBuilder.dynamoDbConfig(dynamoDbConfig)
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     *
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     *   in your account.
     */
    public fun elasticsearchConfig(elasticsearchConfig: IResolvable) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-elasticsearchconfig)
     *
     * @param elasticsearchConfig AWS Region and Endpoints for an Amazon OpenSearch Service domain
     *   in your account.
     */
    public fun elasticsearchConfig(elasticsearchConfig: CfnDataSource.ElasticsearchConfigProperty) {
        cdkBuilder.elasticsearchConfig(elasticsearchConfig)
    }

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     *
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     *   bus.
     */
    public fun eventBridgeConfig(eventBridgeConfig: IResolvable) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    /**
     * An EventBridge configuration that contains a valid ARN of an event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-eventbridgeconfig)
     *
     * @param eventBridgeConfig An EventBridge configuration that contains a valid ARN of an event
     *   bus.
     */
    public fun eventBridgeConfig(eventBridgeConfig: CfnDataSource.EventBridgeConfigProperty) {
        cdkBuilder.eventBridgeConfig(eventBridgeConfig)
    }

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     *
     * @param httpConfig Endpoints for an HTTP data source.
     */
    public fun httpConfig(httpConfig: IResolvable) {
        cdkBuilder.httpConfig(httpConfig)
    }

    /**
     * Endpoints for an HTTP data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-httpconfig)
     *
     * @param httpConfig Endpoints for an HTTP data source.
     */
    public fun httpConfig(httpConfig: CfnDataSource.HttpConfigProperty) {
        cdkBuilder.httpConfig(httpConfig)
    }

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     *
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     */
    public fun lambdaConfig(lambdaConfig: IResolvable) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

    /**
     * An ARN of a Lambda function in valid ARN format.
     *
     * This can be the ARN of a Lambda function that exists in the current account or in another
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-lambdaconfig)
     *
     * @param lambdaConfig An ARN of a Lambda function in valid ARN format.
     */
    public fun lambdaConfig(lambdaConfig: CfnDataSource.LambdaConfigProperty) {
        cdkBuilder.lambdaConfig(lambdaConfig)
    }

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
     *
     * @param metricsConfig Enables or disables enhanced data source metrics for specified data
     *   sources.
     */
    public fun metricsConfig(metricsConfig: String) {
        cdkBuilder.metricsConfig(metricsConfig)
    }

    /**
     * Friendly name for you to identify your AppSync data source after creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-name)
     *
     * @param name Friendly name for you to identify your AppSync data source after creation.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     *
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     *   domain in your account.
     */
    public fun openSearchServiceConfig(openSearchServiceConfig: IResolvable) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    /**
     * AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-opensearchserviceconfig)
     *
     * @param openSearchServiceConfig AWS Region and Endpoints for an Amazon OpenSearch Service
     *   domain in your account.
     */
    public fun openSearchServiceConfig(
        openSearchServiceConfig: CfnDataSource.OpenSearchServiceConfigProperty
    ) {
        cdkBuilder.openSearchServiceConfig(openSearchServiceConfig)
    }

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     *
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     *   data source.
     */
    public fun relationalDatabaseConfig(relationalDatabaseConfig: IResolvable) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    /**
     * Relational Database configuration of the relational database data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-relationaldatabaseconfig)
     *
     * @param relationalDatabaseConfig Relational Database configuration of the relational database
     *   data source.
     */
    public fun relationalDatabaseConfig(
        relationalDatabaseConfig: CfnDataSource.RelationalDatabaseConfigProperty
    ) {
        cdkBuilder.relationalDatabaseConfig(relationalDatabaseConfig)
    }

    /**
     * The AWS Identity and Access Management service role ARN for the data source.
     *
     * The system assumes this role when accessing the data source.
     *
     * Required if `Type` is specified as `AWS_LAMBDA` , `AMAZON_DYNAMODB` , `AMAZON_ELASTICSEARCH`
     * , `AMAZON_EVENTBRIDGE` , or `AMAZON_OPENSEARCH_SERVICE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-servicerolearn)
     *
     * @param serviceRoleArn The AWS Identity and Access Management service role ARN for the data
     *   source.
     */
    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * The type of the data source.
     * * *AWS_LAMBDA* : The data source is an AWS Lambda function.
     * * *AMAZON_DYNAMODB* : The data source is an Amazon DynamoDB table.
     * * *AMAZON_ELASTICSEARCH* : The data source is an Amazon OpenSearch Service domain.
     * * *AMAZON_EVENTBRIDGE* : The data source is an Amazon EventBridge event bus.
     * * *AMAZON_OPENSEARCH_SERVICE* : The data source is an Amazon OpenSearch Service domain.
     * * *NONE* : There is no data source. This type is used when you wish to invoke a GraphQL
     *   operation without connecting to a data source, such as performing data transformation with
     *   resolvers or triggering a subscription to be invoked from a mutation.
     * * *HTTP* : The data source is an HTTP endpoint.
     * * *RELATIONAL_DATABASE* : The data source is a relational database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html#cfn-appsync-datasource-type)
     *
     * @param type The type of the data source.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSource = cdkBuilder.build()
}
