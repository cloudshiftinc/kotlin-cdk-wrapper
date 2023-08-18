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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.GraphqlApiBase
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.ISchema
import software.amazon.awscdk.services.appsync.ISchemaConfig
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.SchemaFile
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.elasticsearch.IDomain as ElasticsearchIDomain
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.opensearchservice.IDomain as OpensearchserviceIDomain
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * creates a new appsync function for this datasource and API using the given properties.
 *
 * @param id
 * @param props
 */
public inline fun BaseDataSource.createFunction(
    id: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}
): AppsyncFunction {
    val builder = BaseAppsyncFunctionPropsDsl()
    builder.apply(block)
    return createFunction(id, builder.build())
}

/**
 * creates a new resolver for this datasource and API using the given properties.
 *
 * @param id
 * @param props
 */
public inline fun BaseDataSource.createResolver(
    id: String,
    block: BaseResolverPropsDsl.() -> Unit = {}
): Resolver {
    val builder = BaseResolverPropsDsl()
    builder.apply(block)
    return createResolver(id, builder.build())
}

/** AWS Region and TableName for an Amazon DynamoDB table in your account. */
public inline fun CfnDataSource.setDynamoDbConfig(
    block: CfnDataSourceDynamoDBConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDynamoDBConfigPropertyDsl()
    builder.apply(block)
    return setDynamoDbConfig(builder.build())
}

/** AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account. */
public inline fun CfnDataSource.setElasticsearchConfig(
    block: CfnDataSourceElasticsearchConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceElasticsearchConfigPropertyDsl()
    builder.apply(block)
    return setElasticsearchConfig(builder.build())
}

/** An EventBridge configuration that contains a valid ARN of an event bus. */
public inline fun CfnDataSource.setEventBridgeConfig(
    block: CfnDataSourceEventBridgeConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceEventBridgeConfigPropertyDsl()
    builder.apply(block)
    return setEventBridgeConfig(builder.build())
}

/** Endpoints for an HTTP data source. */
public inline fun CfnDataSource.setHttpConfig(
    block: CfnDataSourceHttpConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceHttpConfigPropertyDsl()
    builder.apply(block)
    return setHttpConfig(builder.build())
}

/** An ARN of a Lambda function in valid ARN format. */
public inline fun CfnDataSource.setLambdaConfig(
    block: CfnDataSourceLambdaConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceLambdaConfigPropertyDsl()
    builder.apply(block)
    return setLambdaConfig(builder.build())
}

/** AWS Region and Endpoints for an Amazon OpenSearch Service domain in your account. */
public inline fun CfnDataSource.setOpenSearchServiceConfig(
    block: CfnDataSourceOpenSearchServiceConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceOpenSearchServiceConfigPropertyDsl()
    builder.apply(block)
    return setOpenSearchServiceConfig(builder.build())
}

/** Relational Database configuration of the relational database data source. */
public inline fun CfnDataSource.setRelationalDatabaseConfig(
    block: CfnDataSourceRelationalDatabaseConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceRelationalDatabaseConfigPropertyDsl()
    builder.apply(block)
    return setRelationalDatabaseConfig(builder.build())
}

/** Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. */
public inline fun CfnFunctionConfiguration.setRuntime(
    block: CfnFunctionConfigurationAppSyncRuntimePropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionConfigurationAppSyncRuntimePropertyDsl()
    builder.apply(block)
    return setRuntime(builder.build())
}

/** Describes a Sync configuration for a resolver. */
public inline fun CfnFunctionConfiguration.setSyncConfig(
    block: CfnFunctionConfigurationSyncConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionConfigurationSyncConfigPropertyDsl()
    builder.apply(block)
    return setSyncConfig(builder.build())
}

/**
 * A `LambdaAuthorizerConfig` holds configuration on how to authorize AWS AppSync API access when
 * using the `AWS_LAMBDA` authorizer mode.
 */
public inline fun CfnGraphQLApi.setLambdaAuthorizerConfig(
    block: CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl()
    builder.apply(block)
    return setLambdaAuthorizerConfig(builder.build())
}

/** The Amazon CloudWatch Logs configuration. */
public inline fun CfnGraphQLApi.setLogConfig(
    block: CfnGraphQLApiLogConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGraphQLApiLogConfigPropertyDsl()
    builder.apply(block)
    return setLogConfig(builder.build())
}

/** The OpenID Connect configuration. */
public inline fun CfnGraphQLApi.setOpenIdConnectConfig(
    block: CfnGraphQLApiOpenIDConnectConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGraphQLApiOpenIDConnectConfigPropertyDsl()
    builder.apply(block)
    return setOpenIdConnectConfig(builder.build())
}

/**
 * Optional authorization configuration for using Amazon Cognito user pools with your GraphQL
 * endpoint.
 */
public inline fun CfnGraphQLApi.setUserPoolConfig(
    block: CfnGraphQLApiUserPoolConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGraphQLApiUserPoolConfigPropertyDsl()
    builder.apply(block)
    return setUserPoolConfig(builder.build())
}

/** The caching configuration for the resolver. */
public inline fun CfnResolver.setCachingConfig(
    block: CfnResolverCachingConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResolverCachingConfigPropertyDsl()
    builder.apply(block)
    return setCachingConfig(builder.build())
}

/** Functions linked with the pipeline resolver. */
public inline fun CfnResolver.setPipelineConfig(
    block: CfnResolverPipelineConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResolverPipelineConfigPropertyDsl()
    builder.apply(block)
    return setPipelineConfig(builder.build())
}

/** Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. */
public inline fun CfnResolver.setRuntime(
    block: CfnResolverAppSyncRuntimePropertyDsl.() -> Unit = {}
) {
    val builder = CfnResolverAppSyncRuntimePropertyDsl()
    builder.apply(block)
    return setRuntime(builder.build())
}

/** The `SyncConfig` for a resolver attached to a versioned data source. */
public inline fun CfnResolver.setSyncConfig(
    block: CfnResolverSyncConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResolverSyncConfigPropertyDsl()
    builder.apply(block)
    return setSyncConfig(builder.build())
}

/** The `SourceApiAssociationConfig` object data. */
public inline fun CfnSourceApiAssociation.setSourceApiAssociationConfig(
    block: CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl()
    builder.apply(block)
    return setSourceApiAssociationConfig(builder.build())
}

/**
 * add a new DynamoDB data source to this API.
 *
 * @param id The data source's id.
 * @param table The DynamoDB table backing this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addDynamoDbDataSource(
    id: String,
    table: ITable,
    block: DataSourceOptionsDsl.() -> Unit = {},
): DynamoDbDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addDynamoDbDataSource(id, table, builder.build())
}

/**
 * (deprecated) add a new elasticsearch data source to this API.
 * * use `addOpenSearchDataSource`
 *
 * @param id The data source's id.
 * @param domain The elasticsearch domain for this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addElasticsearchDataSource(
    id: String,
    domain: ElasticsearchIDomain,
    block: DataSourceOptionsDsl.() -> Unit = {},
): ElasticsearchDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addElasticsearchDataSource(id, domain, builder.build())
}

/**
 * Add an EventBridge data source to this api.
 *
 * @param id The data source's id.
 * @param eventBus The EventBridge EventBus on which to put events.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addEventBridgeDataSource(
    id: String,
    eventBus: IEventBus,
    block: DataSourceOptionsDsl.() -> Unit = {},
): EventBridgeDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addEventBridgeDataSource(id, eventBus, builder.build())
}

/**
 * add a new http data source to this API.
 *
 * @param id The data source's id.
 * @param endpoint The http endpoint.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addHttpDataSource(
    id: String,
    endpoint: String,
    block: HttpDataSourceOptionsDsl.() -> Unit = {},
): HttpDataSource {
    val builder = HttpDataSourceOptionsDsl()
    builder.apply(block)
    return addHttpDataSource(id, endpoint, builder.build())
}

/**
 * add a new Lambda data source to this API.
 *
 * @param id The data source's id.
 * @param lambdaFunction The Lambda function to call to interact with this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addLambdaDataSource(
    id: String,
    lambdaFunction: IFunction,
    block: DataSourceOptionsDsl.() -> Unit = {},
): LambdaDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addLambdaDataSource(id, lambdaFunction, builder.build())
}

/**
 * add a new dummy data source to this API.
 *
 * Useful for pipeline resolvers and for backend changes that don't require a data source.
 *
 * @param id The data source's id.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addNoneDataSource(
    id: String,
    block: DataSourceOptionsDsl.() -> Unit = {}
): NoneDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addNoneDataSource(id, builder.build())
}

/**
 * add a new OpenSearch data source to this API.
 *
 * @param id The data source's id.
 * @param domain The OpenSearch domain for this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addOpenSearchDataSource(
    id: String,
    domain: OpensearchserviceIDomain,
    block: DataSourceOptionsDsl.() -> Unit = {},
): OpenSearchDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addOpenSearchDataSource(id, domain, builder.build())
}

/**
 * add a new Rds data source to this API.
 *
 * @param id The data source's id.
 * @param serverlessCluster The serverless cluster to interact with this data source.
 * @param secretStore The secret store that contains the username and password for the serverless
 *   cluster.
 * @param databaseName The optional name of the database to use within the cluster.
 * @param options The optional configuration for this data source.
 */
public inline fun GraphqlApiBase.addRdsDataSource(
    id: String,
    serverlessCluster: IServerlessCluster,
    secretStore: ISecret,
    databaseName: String?,
    block: DataSourceOptionsDsl.() -> Unit = {},
): RdsDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addRdsDataSource(id, serverlessCluster, secretStore, databaseName, builder.build())
}

/**
 * creates a new resolver for this datasource and API using the given properties.
 *
 * @param id
 * @param props
 */
public inline fun GraphqlApiBase.createResolver(
    id: String,
    block: ExtendedResolverPropsDsl.() -> Unit = {}
): Resolver {
    val builder = ExtendedResolverPropsDsl()
    builder.apply(block)
    return createResolver(id, builder.build())
}

/**
 * add a new DynamoDB data source to this API.
 *
 * @param id The data source's id.
 * @param table The DynamoDB table backing this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addDynamoDbDataSource(
    arg0: String,
    arg1: ITable,
    block: DataSourceOptionsDsl.() -> Unit = {},
): DynamoDbDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addDynamoDbDataSource(arg0, arg1, builder.build())
}

/**
 * (deprecated) add a new elasticsearch data source to this API.
 * * use `addOpenSearchDataSource`
 *
 * @param id The data source's id.
 * @param domain The elasticsearch domain for this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addElasticsearchDataSource(
    arg0: String,
    arg1: ElasticsearchIDomain,
    block: DataSourceOptionsDsl.() -> Unit = {},
): ElasticsearchDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addElasticsearchDataSource(arg0, arg1, builder.build())
}

/**
 * Add an EventBridge data source to this api.
 *
 * @param id The data source's id.
 * @param eventBus The EventBridge EventBus on which to put events.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addEventBridgeDataSource(
    arg0: String,
    arg1: IEventBus,
    block: DataSourceOptionsDsl.() -> Unit = {},
): EventBridgeDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addEventBridgeDataSource(arg0, arg1, builder.build())
}

/**
 * add a new http data source to this API.
 *
 * @param id The data source's id.
 * @param endpoint The http endpoint.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addHttpDataSource(
    arg0: String,
    arg1: String,
    block: HttpDataSourceOptionsDsl.() -> Unit = {},
): HttpDataSource {
    val builder = HttpDataSourceOptionsDsl()
    builder.apply(block)
    return addHttpDataSource(arg0, arg1, builder.build())
}

/**
 * add a new Lambda data source to this API.
 *
 * @param id The data source's id.
 * @param lambdaFunction The Lambda function to call to interact with this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addLambdaDataSource(
    arg0: String,
    arg1: IFunction,
    block: DataSourceOptionsDsl.() -> Unit = {},
): LambdaDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addLambdaDataSource(arg0, arg1, builder.build())
}

/**
 * add a new dummy data source to this API.
 *
 * Useful for pipeline resolvers and for backend changes that don't require a data source.
 *
 * @param id The data source's id.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addNoneDataSource(
    arg0: String,
    block: DataSourceOptionsDsl.() -> Unit = {}
): NoneDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addNoneDataSource(arg0, builder.build())
}

/**
 * Add a new OpenSearch data source to this API.
 *
 * @param id The data source's id.
 * @param domain The OpenSearch domain for this data source.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addOpenSearchDataSource(
    arg0: String,
    arg1: OpensearchserviceIDomain,
    block: DataSourceOptionsDsl.() -> Unit = {},
): OpenSearchDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addOpenSearchDataSource(arg0, arg1, builder.build())
}

/**
 * add a new Rds data source to this API.
 *
 * @param id The data source's id.
 * @param serverlessCluster The serverless cluster to interact with this data source.
 * @param secretStore The secret store that contains the username and password for the serverless
 *   cluster.
 * @param databaseName The optional name of the database to use within the cluster.
 * @param options The optional configuration for this data source.
 */
public inline fun IGraphqlApi.addRdsDataSource(
    arg0: String,
    arg1: IServerlessCluster,
    arg2: ISecret,
    arg3: String?,
    block: DataSourceOptionsDsl.() -> Unit = {},
): RdsDataSource {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return addRdsDataSource(arg0, arg1, arg2, arg3, builder.build())
}

/**
 * creates a new resolver for this datasource and API using the given properties.
 *
 * @param id
 * @param props
 */
public inline fun IGraphqlApi.createResolver(
    arg0: String,
    block: ExtendedResolverPropsDsl.() -> Unit = {}
): Resolver {
    val builder = ExtendedResolverPropsDsl()
    builder.apply(block)
    return createResolver(arg0, builder.build())
}

/**
 * Binds a schema string to a GraphQlApi.
 *
 * @param api the api to bind the schema to.
 * @param options configuration for bind behavior.
 * @return ISchemaConfig with apiId and schema definition string
 */
public inline fun ISchema.bind(
    arg0: IGraphqlApi,
    block: SchemaBindOptionsDsl.() -> Unit = {}
): ISchemaConfig {
    val builder = SchemaBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}

/**
 * Called when the GraphQL Api is initialized to allow this object to bind to the stack.
 *
 * @param api The binding GraphQL Api.
 * @param _options
 */
public inline fun SchemaFile.bind(
    api: IGraphqlApi,
    block: SchemaBindOptionsDsl.() -> Unit = {}
): ISchemaConfig {
    val builder = SchemaBindOptionsDsl()
    builder.apply(block)
    return bind(api, builder.build())
}
