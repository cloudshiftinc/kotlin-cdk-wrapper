@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnDomainName
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.ISchemaConfig
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.SchemaFile
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.rds.IServerlessCluster
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.elasticsearch.IDomain as ElasticsearchIDomain
import software.amazon.awscdk.services.opensearchservice.IDomain as OpensearchserviceIDomain

public inline fun CfnApiCache.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnApiKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDataSource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDataSource.setDynamoDbConfig(block: CfnDataSourceDynamoDBConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDataSourceDynamoDBConfigPropertyDsl()
  builder.apply(block)
  return setDynamoDbConfig(builder.build())
}

public inline
    fun CfnDataSource.setElasticsearchConfig(block: CfnDataSourceElasticsearchConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceElasticsearchConfigPropertyDsl()
  builder.apply(block)
  return setElasticsearchConfig(builder.build())
}

public inline
    fun CfnDataSource.setEventBridgeConfig(block: CfnDataSourceEventBridgeConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceEventBridgeConfigPropertyDsl()
  builder.apply(block)
  return setEventBridgeConfig(builder.build())
}

public inline fun CfnDataSource.setHttpConfig(block: CfnDataSourceHttpConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDataSourceHttpConfigPropertyDsl()
  builder.apply(block)
  return setHttpConfig(builder.build())
}

public inline
    fun CfnDataSource.setLambdaConfig(block: CfnDataSourceLambdaConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnDataSourceLambdaConfigPropertyDsl()
  builder.apply(block)
  return setLambdaConfig(builder.build())
}

public inline
    fun CfnDataSource.setOpenSearchServiceConfig(block: CfnDataSourceOpenSearchServiceConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceOpenSearchServiceConfigPropertyDsl()
  builder.apply(block)
  return setOpenSearchServiceConfig(builder.build())
}

public inline
    fun CfnDataSource.setRelationalDatabaseConfig(block: CfnDataSourceRelationalDatabaseConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDataSourceRelationalDatabaseConfigPropertyDsl()
  builder.apply(block)
  return setRelationalDatabaseConfig(builder.build())
}

public inline fun CfnDomainName.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDomainNameApiAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFunctionConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFunctionConfiguration.setRuntime(block: CfnFunctionConfigurationAppSyncRuntimePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionConfigurationAppSyncRuntimePropertyDsl()
  builder.apply(block)
  return setRuntime(builder.build())
}

public inline
    fun CfnFunctionConfiguration.setSyncConfig(block: CfnFunctionConfigurationSyncConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFunctionConfigurationSyncConfigPropertyDsl()
  builder.apply(block)
  return setSyncConfig(builder.build())
}

public inline fun CfnGraphQLApi.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGraphQLApi.setLambdaAuthorizerConfig(block: CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl()
  builder.apply(block)
  return setLambdaAuthorizerConfig(builder.build())
}

public inline fun CfnGraphQLApi.setLogConfig(block: CfnGraphQLApiLogConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGraphQLApiLogConfigPropertyDsl()
  builder.apply(block)
  return setLogConfig(builder.build())
}

public inline
    fun CfnGraphQLApi.setOpenIdConnectConfig(block: CfnGraphQLApiOpenIDConnectConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGraphQLApiOpenIDConnectConfigPropertyDsl()
  builder.apply(block)
  return setOpenIdConnectConfig(builder.build())
}

public inline
    fun CfnGraphQLApi.setUserPoolConfig(block: CfnGraphQLApiUserPoolConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGraphQLApiUserPoolConfigPropertyDsl()
  builder.apply(block)
  return setUserPoolConfig(builder.build())
}

public inline fun CfnGraphQLSchema.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResolver.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResolver.setCachingConfig(block: CfnResolverCachingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResolverCachingConfigPropertyDsl()
  builder.apply(block)
  return setCachingConfig(builder.build())
}

public inline
    fun CfnResolver.setPipelineConfig(block: CfnResolverPipelineConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnResolverPipelineConfigPropertyDsl()
  builder.apply(block)
  return setPipelineConfig(builder.build())
}

public inline fun CfnResolver.setRuntime(block: CfnResolverAppSyncRuntimePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnResolverAppSyncRuntimePropertyDsl()
  builder.apply(block)
  return setRuntime(builder.build())
}

public inline fun CfnResolver.setSyncConfig(block: CfnResolverSyncConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnResolverSyncConfigPropertyDsl()
  builder.apply(block)
  return setSyncConfig(builder.build())
}

public inline fun CfnSourceApiAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSourceApiAssociation.setSourceApiAssociationConfig(block: CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl()
  builder.apply(block)
  return setSourceApiAssociationConfig(builder.build())
}

public inline fun DynamoDbDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun DynamoDbDataSource.createResolver(arg0: String,
    block: BaseResolverPropsDsl.() -> Unit = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun ElasticsearchDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun ElasticsearchDataSource.createResolver(arg0: String,
    block: BaseResolverPropsDsl.() -> Unit = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun EventBridgeDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun EventBridgeDataSource.createResolver(arg0: String,
    block: BaseResolverPropsDsl.() -> Unit = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun GraphqlApi.addDynamoDbDataSource(
  arg0: String,
  arg1: ITable,
  block: DataSourceOptionsDsl.() -> Unit = {},
): DynamoDbDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addDynamoDbDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addElasticsearchDataSource(
  arg0: String,
  arg1: ElasticsearchIDomain,
  block: DataSourceOptionsDsl.() -> Unit = {},
): ElasticsearchDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addElasticsearchDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addEventBridgeDataSource(
  arg0: String,
  arg1: IEventBus,
  block: DataSourceOptionsDsl.() -> Unit = {},
): EventBridgeDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addEventBridgeDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addHttpDataSource(
  arg0: String,
  arg1: String,
  block: HttpDataSourceOptionsDsl.() -> Unit = {},
): HttpDataSource {
  val builder = HttpDataSourceOptionsDsl()
  builder.apply(block)
  return addHttpDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addLambdaDataSource(
  arg0: String,
  arg1: IFunction,
  block: DataSourceOptionsDsl.() -> Unit = {},
): LambdaDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addLambdaDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addNoneDataSource(arg0: String, block: DataSourceOptionsDsl.() -> Unit
    = {}): NoneDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addNoneDataSource(arg0,builder.build())
}

public inline fun GraphqlApi.addOpenSearchDataSource(
  arg0: String,
  arg1: OpensearchserviceIDomain,
  block: DataSourceOptionsDsl.() -> Unit = {},
): OpenSearchDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addOpenSearchDataSource(arg0,arg1,builder.build())
}

public inline fun GraphqlApi.addRdsDataSource(
  arg0: String,
  arg1: IServerlessCluster,
  arg2: ISecret,
  arg3: String,
  block: DataSourceOptionsDsl.() -> Unit = {},
): RdsDataSource {
  val builder = DataSourceOptionsDsl()
  builder.apply(block)
  return addRdsDataSource(arg0,arg1,arg2,arg3,builder.build())
}

public inline fun GraphqlApi.createResolver(arg0: String, block: ExtendedResolverPropsDsl.() -> Unit
    = {}): Resolver {
  val builder = ExtendedResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun HttpDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun HttpDataSource.createResolver(arg0: String, block: BaseResolverPropsDsl.() -> Unit
    = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun LambdaDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun LambdaDataSource.createResolver(arg0: String,
    block: BaseResolverPropsDsl.() -> Unit = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun NoneDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun NoneDataSource.createResolver(arg0: String, block: BaseResolverPropsDsl.() -> Unit
    = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun OpenSearchDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun OpenSearchDataSource.createResolver(arg0: String,
    block: BaseResolverPropsDsl.() -> Unit = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun RdsDataSource.createFunction(arg0: String,
    block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}): AppsyncFunction {
  val builder = BaseAppsyncFunctionPropsDsl()
  builder.apply(block)
  return createFunction(arg0,builder.build())
}

public inline fun RdsDataSource.createResolver(arg0: String, block: BaseResolverPropsDsl.() -> Unit
    = {}): Resolver {
  val builder = BaseResolverPropsDsl()
  builder.apply(block)
  return createResolver(arg0,builder.build())
}

public inline fun SchemaFile.bind(arg0: IGraphqlApi, block: SchemaBindOptionsDsl.() -> Unit = {}):
    ISchemaConfig {
  val builder = SchemaBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,builder.build())
}
