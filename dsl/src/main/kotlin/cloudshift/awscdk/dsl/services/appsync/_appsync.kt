@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ApiKeyConfig
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.AppsyncFunctionAttributes
import software.amazon.awscdk.services.appsync.AppsyncFunctionProps
import software.amazon.awscdk.services.appsync.AssetCode
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.AuthorizationMode
import software.amazon.awscdk.services.appsync.AwsIamConfig
import software.amazon.awscdk.services.appsync.BackedDataSourceProps
import software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps
import software.amazon.awscdk.services.appsync.BaseDataSourceProps
import software.amazon.awscdk.services.appsync.BaseResolverProps
import software.amazon.awscdk.services.appsync.CachingConfig
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.amazon.awscdk.services.appsync.CfnApiCacheProps
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.amazon.awscdk.services.appsync.CfnApiKeyProps
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnDataSourceProps
import software.amazon.awscdk.services.appsync.CfnDomainName
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps
import software.amazon.awscdk.services.appsync.CfnDomainNameProps
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration
import software.amazon.awscdk.services.appsync.CfnFunctionConfigurationProps
import software.amazon.awscdk.services.appsync.CfnGraphQLApi
import software.amazon.awscdk.services.appsync.CfnGraphQLApiProps
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnResolverProps
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociationProps
import software.amazon.awscdk.services.appsync.CodeConfig
import software.amazon.awscdk.services.appsync.DataSourceOptions
import software.amazon.awscdk.services.appsync.DomainOptions
import software.amazon.awscdk.services.appsync.DynamoDbDataSource
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps
import software.amazon.awscdk.services.appsync.ElasticsearchDataSource
import software.amazon.awscdk.services.appsync.ElasticsearchDataSourceProps
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.amazon.awscdk.services.appsync.ExtendedDataSourceProps
import software.amazon.awscdk.services.appsync.ExtendedResolverProps
import software.amazon.awscdk.services.appsync.GraphqlApi
import software.amazon.awscdk.services.appsync.GraphqlApiAttributes
import software.amazon.awscdk.services.appsync.GraphqlApiProps
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.HttpDataSourceOptions
import software.amazon.awscdk.services.appsync.HttpDataSourceProps
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
import software.amazon.awscdk.services.appsync.LambdaDataSource
import software.amazon.awscdk.services.appsync.LambdaDataSourceProps
import software.amazon.awscdk.services.appsync.LogConfig
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.amazon.awscdk.services.appsync.NoneDataSourceProps
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
import software.amazon.awscdk.services.appsync.RdsDataSource
import software.amazon.awscdk.services.appsync.RdsDataSourceProps
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.ResolverProps
import software.amazon.awscdk.services.appsync.RuntimeConfig
import software.amazon.awscdk.services.appsync.SchemaBindOptions
import software.amazon.awscdk.services.appsync.SchemaFile
import software.amazon.awscdk.services.appsync.SchemaProps
import software.amazon.awscdk.services.appsync.UserPoolConfig
import software.constructs.Construct

public object appsync {
  public inline fun apiKeyConfig(block: ApiKeyConfigDsl.() -> Unit = {}): ApiKeyConfig {
    val builder = ApiKeyConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun appsyncFunction(
    scope: Construct,
    id: String,
    block: AppsyncFunctionDsl.() -> Unit = {},
  ): AppsyncFunction {
    val builder = AppsyncFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun appsyncFunctionAttributes(block: AppsyncFunctionAttributesDsl.() -> Unit = {}):
      AppsyncFunctionAttributes {
    val builder = AppsyncFunctionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun appsyncFunctionProps(block: AppsyncFunctionPropsDsl.() -> Unit = {}):
      AppsyncFunctionProps {
    val builder = AppsyncFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetCode(path: String, block: AssetCodeDsl.() -> Unit = {}): AssetCode {
    val builder = AssetCodeDsl(path)
    builder.apply(block)
    return builder.build()
  }

  public inline fun authorizationConfig(block: AuthorizationConfigDsl.() -> Unit = {}):
      AuthorizationConfig {
    val builder = AuthorizationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun authorizationMode(block: AuthorizationModeDsl.() -> Unit = {}):
      AuthorizationMode {
    val builder = AuthorizationModeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsIamConfig(block: AwsIamConfigDsl.() -> Unit = {}): AwsIamConfig {
    val builder = AwsIamConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun backedDataSourceProps(block: BackedDataSourcePropsDsl.() -> Unit = {}):
      BackedDataSourceProps {
    val builder = BackedDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseAppsyncFunctionProps(block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}):
      BaseAppsyncFunctionProps {
    val builder = BaseAppsyncFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseDataSourceProps(block: BaseDataSourcePropsDsl.() -> Unit = {}):
      BaseDataSourceProps {
    val builder = BaseDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseResolverProps(block: BaseResolverPropsDsl.() -> Unit = {}):
      BaseResolverProps {
    val builder = BaseResolverPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cachingConfig(block: CachingConfigDsl.() -> Unit = {}): CachingConfig {
    val builder = CachingConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiCache(
    scope: Construct,
    id: String,
    block: CfnApiCacheDsl.() -> Unit = {},
  ): CfnApiCache {
    val builder = CfnApiCacheDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiCacheProps(block: CfnApiCachePropsDsl.() -> Unit = {}): CfnApiCacheProps {
    val builder = CfnApiCachePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiKey(
    scope: Construct,
    id: String,
    block: CfnApiKeyDsl.() -> Unit = {},
  ): CfnApiKey {
    val builder = CfnApiKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiKeyProps(block: CfnApiKeyPropsDsl.() -> Unit = {}): CfnApiKeyProps {
    val builder = CfnApiKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSource(
    scope: Construct,
    id: String,
    block: CfnDataSourceDsl.() -> Unit = {},
  ): CfnDataSource {
    val builder = CfnDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAuthorizationConfigProperty(block: CfnDataSourceAuthorizationConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.AuthorizationConfigProperty {
    val builder = CfnDataSourceAuthorizationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceAwsIamConfigProperty(block: CfnDataSourceAwsIamConfigPropertyDsl.() -> Unit =
      {}): CfnDataSource.AwsIamConfigProperty {
    val builder = CfnDataSourceAwsIamConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDeltaSyncConfigProperty(block: CfnDataSourceDeltaSyncConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.DeltaSyncConfigProperty {
    val builder = CfnDataSourceDeltaSyncConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceDynamoDBConfigProperty(block: CfnDataSourceDynamoDBConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.DynamoDBConfigProperty {
    val builder = CfnDataSourceDynamoDBConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceElasticsearchConfigProperty(block: CfnDataSourceElasticsearchConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.ElasticsearchConfigProperty {
    val builder = CfnDataSourceElasticsearchConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceEventBridgeConfigProperty(block: CfnDataSourceEventBridgeConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.EventBridgeConfigProperty {
    val builder = CfnDataSourceEventBridgeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceHttpConfigProperty(block: CfnDataSourceHttpConfigPropertyDsl.() -> Unit =
      {}): CfnDataSource.HttpConfigProperty {
    val builder = CfnDataSourceHttpConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceLambdaConfigProperty(block: CfnDataSourceLambdaConfigPropertyDsl.() -> Unit =
      {}): CfnDataSource.LambdaConfigProperty {
    val builder = CfnDataSourceLambdaConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceOpenSearchServiceConfigProperty(block: CfnDataSourceOpenSearchServiceConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.OpenSearchServiceConfigProperty {
    val builder = CfnDataSourceOpenSearchServiceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDataSourceProps(block: CfnDataSourcePropsDsl.() -> Unit = {}):
      CfnDataSourceProps {
    val builder = CfnDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceRdsHttpEndpointConfigProperty(block: CfnDataSourceRdsHttpEndpointConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.RdsHttpEndpointConfigProperty {
    val builder = CfnDataSourceRdsHttpEndpointConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDataSourceRelationalDatabaseConfigProperty(block: CfnDataSourceRelationalDatabaseConfigPropertyDsl.() -> Unit
      = {}): CfnDataSource.RelationalDatabaseConfigProperty {
    val builder = CfnDataSourceRelationalDatabaseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainName(
    scope: Construct,
    id: String,
    block: CfnDomainNameDsl.() -> Unit = {},
  ): CfnDomainName {
    val builder = CfnDomainNameDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainNameApiAssociation(
    scope: Construct,
    id: String,
    block: CfnDomainNameApiAssociationDsl.() -> Unit = {},
  ): CfnDomainNameApiAssociation {
    val builder = CfnDomainNameApiAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDomainNameApiAssociationProps(block: CfnDomainNameApiAssociationPropsDsl.() -> Unit =
      {}): CfnDomainNameApiAssociationProps {
    val builder = CfnDomainNameApiAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDomainNameProps(block: CfnDomainNamePropsDsl.() -> Unit = {}):
      CfnDomainNameProps {
    val builder = CfnDomainNamePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionConfiguration(
    scope: Construct,
    id: String,
    block: CfnFunctionConfigurationDsl.() -> Unit = {},
  ): CfnFunctionConfiguration {
    val builder = CfnFunctionConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionConfigurationAppSyncRuntimeProperty(block: CfnFunctionConfigurationAppSyncRuntimePropertyDsl.() -> Unit
      = {}): CfnFunctionConfiguration.AppSyncRuntimeProperty {
    val builder = CfnFunctionConfigurationAppSyncRuntimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionConfigurationLambdaConflictHandlerConfigProperty(block: CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl.() -> Unit
      = {}): CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty {
    val builder = CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionConfigurationProps(block: CfnFunctionConfigurationPropsDsl.() -> Unit
      = {}): CfnFunctionConfigurationProps {
    val builder = CfnFunctionConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionConfigurationSyncConfigProperty(block: CfnFunctionConfigurationSyncConfigPropertyDsl.() -> Unit
      = {}): CfnFunctionConfiguration.SyncConfigProperty {
    val builder = CfnFunctionConfigurationSyncConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGraphQLApi(
    scope: Construct,
    id: String,
    block: CfnGraphQLApiDsl.() -> Unit = {},
  ): CfnGraphQLApi {
    val builder = CfnGraphQLApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiAdditionalAuthenticationProviderProperty(block: CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl.() -> Unit
      = {}): CfnGraphQLApi.AdditionalAuthenticationProviderProperty {
    val builder = CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiCognitoUserPoolConfigProperty(block: CfnGraphQLApiCognitoUserPoolConfigPropertyDsl.() -> Unit
      = {}): CfnGraphQLApi.CognitoUserPoolConfigProperty {
    val builder = CfnGraphQLApiCognitoUserPoolConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiLambdaAuthorizerConfigProperty(block: CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl.() -> Unit
      = {}): CfnGraphQLApi.LambdaAuthorizerConfigProperty {
    val builder = CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiLogConfigProperty(block: CfnGraphQLApiLogConfigPropertyDsl.() -> Unit = {}):
      CfnGraphQLApi.LogConfigProperty {
    val builder = CfnGraphQLApiLogConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiOpenIDConnectConfigProperty(block: CfnGraphQLApiOpenIDConnectConfigPropertyDsl.() -> Unit
      = {}): CfnGraphQLApi.OpenIDConnectConfigProperty {
    val builder = CfnGraphQLApiOpenIDConnectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGraphQLApiProps(block: CfnGraphQLApiPropsDsl.() -> Unit = {}):
      CfnGraphQLApiProps {
    val builder = CfnGraphQLApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGraphQLApiUserPoolConfigProperty(block: CfnGraphQLApiUserPoolConfigPropertyDsl.() -> Unit
      = {}): CfnGraphQLApi.UserPoolConfigProperty {
    val builder = CfnGraphQLApiUserPoolConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGraphQLSchema(
    scope: Construct,
    id: String,
    block: CfnGraphQLSchemaDsl.() -> Unit = {},
  ): CfnGraphQLSchema {
    val builder = CfnGraphQLSchemaDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGraphQLSchemaProps(block: CfnGraphQLSchemaPropsDsl.() -> Unit = {}):
      CfnGraphQLSchemaProps {
    val builder = CfnGraphQLSchemaPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResolver(
    scope: Construct,
    id: String,
    block: CfnResolverDsl.() -> Unit = {},
  ): CfnResolver {
    val builder = CfnResolverDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResolverAppSyncRuntimeProperty(block: CfnResolverAppSyncRuntimePropertyDsl.() -> Unit =
      {}): CfnResolver.AppSyncRuntimeProperty {
    val builder = CfnResolverAppSyncRuntimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResolverCachingConfigProperty(block: CfnResolverCachingConfigPropertyDsl.() -> Unit =
      {}): CfnResolver.CachingConfigProperty {
    val builder = CfnResolverCachingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResolverLambdaConflictHandlerConfigProperty(block: CfnResolverLambdaConflictHandlerConfigPropertyDsl.() -> Unit
      = {}): CfnResolver.LambdaConflictHandlerConfigProperty {
    val builder = CfnResolverLambdaConflictHandlerConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResolverPipelineConfigProperty(block: CfnResolverPipelineConfigPropertyDsl.() -> Unit =
      {}): CfnResolver.PipelineConfigProperty {
    val builder = CfnResolverPipelineConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResolverProps(block: CfnResolverPropsDsl.() -> Unit = {}): CfnResolverProps {
    val builder = CfnResolverPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResolverSyncConfigProperty(block: CfnResolverSyncConfigPropertyDsl.() -> Unit
      = {}): CfnResolver.SyncConfigProperty {
    val builder = CfnResolverSyncConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSourceApiAssociation(
    scope: Construct,
    id: String,
    block: CfnSourceApiAssociationDsl.() -> Unit = {},
  ): CfnSourceApiAssociation {
    val builder = CfnSourceApiAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSourceApiAssociationProps(block: CfnSourceApiAssociationPropsDsl.() -> Unit =
      {}): CfnSourceApiAssociationProps {
    val builder = CfnSourceApiAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSourceApiAssociationSourceApiAssociationConfigProperty(block: CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl.() -> Unit
      = {}): CfnSourceApiAssociation.SourceApiAssociationConfigProperty {
    val builder = CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
    val builder = CodeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dataSourceOptions(block: DataSourceOptionsDsl.() -> Unit = {}):
      DataSourceOptions {
    val builder = DataSourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun domainOptions(block: DomainOptionsDsl.() -> Unit = {}): DomainOptions {
    val builder = DomainOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dynamoDbDataSource(
    scope: Construct,
    id: String,
    block: DynamoDbDataSourceDsl.() -> Unit = {},
  ): DynamoDbDataSource {
    val builder = DynamoDbDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dynamoDbDataSourceProps(block: DynamoDbDataSourcePropsDsl.() -> Unit = {}):
      DynamoDbDataSourceProps {
    val builder = DynamoDbDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  @Deprecated(message = "deprecated in CDK")
  public inline fun elasticsearchDataSource(
    scope: Construct,
    id: String,
    block: ElasticsearchDataSourceDsl.() -> Unit = {},
  ): ElasticsearchDataSource {
    val builder = ElasticsearchDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  @Deprecated(message = "deprecated in CDK")
  public inline fun elasticsearchDataSourceProps(block: ElasticsearchDataSourcePropsDsl.() -> Unit =
      {}): ElasticsearchDataSourceProps {
    val builder = ElasticsearchDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBridgeDataSource(
    scope: Construct,
    id: String,
    block: EventBridgeDataSourceDsl.() -> Unit = {},
  ): EventBridgeDataSource {
    val builder = EventBridgeDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBridgeDataSourceProps(block: EventBridgeDataSourcePropsDsl.() -> Unit =
      {}): EventBridgeDataSourceProps {
    val builder = EventBridgeDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun extendedDataSourceProps(block: ExtendedDataSourcePropsDsl.() -> Unit = {}):
      ExtendedDataSourceProps {
    val builder = ExtendedDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun extendedResolverProps(block: ExtendedResolverPropsDsl.() -> Unit = {}):
      ExtendedResolverProps {
    val builder = ExtendedResolverPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun graphqlApi(
    scope: Construct,
    id: String,
    block: GraphqlApiDsl.() -> Unit = {},
  ): GraphqlApi {
    val builder = GraphqlApiDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun graphqlApiAttributes(block: GraphqlApiAttributesDsl.() -> Unit = {}):
      GraphqlApiAttributes {
    val builder = GraphqlApiAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun graphqlApiProps(block: GraphqlApiPropsDsl.() -> Unit = {}): GraphqlApiProps {
    val builder = GraphqlApiPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpDataSource(
    scope: Construct,
    id: String,
    block: HttpDataSourceDsl.() -> Unit = {},
  ): HttpDataSource {
    val builder = HttpDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpDataSourceOptions(block: HttpDataSourceOptionsDsl.() -> Unit = {}):
      HttpDataSourceOptions {
    val builder = HttpDataSourceOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun httpDataSourceProps(block: HttpDataSourcePropsDsl.() -> Unit = {}):
      HttpDataSourceProps {
    val builder = HttpDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaAuthorizerConfig(block: LambdaAuthorizerConfigDsl.() -> Unit = {}):
      LambdaAuthorizerConfig {
    val builder = LambdaAuthorizerConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaDataSource(
    scope: Construct,
    id: String,
    block: LambdaDataSourceDsl.() -> Unit = {},
  ): LambdaDataSource {
    val builder = LambdaDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaDataSourceProps(block: LambdaDataSourcePropsDsl.() -> Unit = {}):
      LambdaDataSourceProps {
    val builder = LambdaDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logConfig(block: LogConfigDsl.() -> Unit = {}): LogConfig {
    val builder = LogConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun noneDataSource(
    scope: Construct,
    id: String,
    block: NoneDataSourceDsl.() -> Unit = {},
  ): NoneDataSource {
    val builder = NoneDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun noneDataSourceProps(block: NoneDataSourcePropsDsl.() -> Unit = {}):
      NoneDataSourceProps {
    val builder = NoneDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun openIdConnectConfig(block: OpenIdConnectConfigDsl.() -> Unit = {}):
      OpenIdConnectConfig {
    val builder = OpenIdConnectConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun openSearchDataSource(
    scope: Construct,
    id: String,
    block: OpenSearchDataSourceDsl.() -> Unit = {},
  ): OpenSearchDataSource {
    val builder = OpenSearchDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun openSearchDataSourceProps(block: OpenSearchDataSourcePropsDsl.() -> Unit = {}):
      OpenSearchDataSourceProps {
    val builder = OpenSearchDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun rdsDataSource(
    scope: Construct,
    id: String,
    block: RdsDataSourceDsl.() -> Unit = {},
  ): RdsDataSource {
    val builder = RdsDataSourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun rdsDataSourceProps(block: RdsDataSourcePropsDsl.() -> Unit = {}):
      RdsDataSourceProps {
    val builder = RdsDataSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resolver(
    scope: Construct,
    id: String,
    block: ResolverDsl.() -> Unit = {},
  ): Resolver {
    val builder = ResolverDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun resolverProps(block: ResolverPropsDsl.() -> Unit = {}): ResolverProps {
    val builder = ResolverPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun runtimeConfig(block: RuntimeConfigDsl.() -> Unit = {}): RuntimeConfig {
    val builder = RuntimeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun schemaBindOptions(block: SchemaBindOptionsDsl.() -> Unit = {}):
      SchemaBindOptions {
    val builder = SchemaBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun schemaFile(block: SchemaFileDsl.() -> Unit = {}): SchemaFile {
    val builder = SchemaFileDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun schemaProps(block: SchemaPropsDsl.() -> Unit = {}): SchemaProps {
    val builder = SchemaPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun userPoolConfig(block: UserPoolConfigDsl.() -> Unit = {}): UserPoolConfig {
    val builder = UserPoolConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
