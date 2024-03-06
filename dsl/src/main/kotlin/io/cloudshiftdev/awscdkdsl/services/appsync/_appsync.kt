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
import software.amazon.awscdk.services.appsync.SourceApi
import software.amazon.awscdk.services.appsync.SourceApiAssociation
import software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes
import software.amazon.awscdk.services.appsync.SourceApiAssociationProps
import software.amazon.awscdk.services.appsync.SourceApiOptions
import software.amazon.awscdk.services.appsync.UserPoolConfig
import software.constructs.Construct

public object appsync {
    /**
     * Configuration for API Key authorization in AppSync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.appsync.*;
     * Expiration expiration;
     * ApiKeyConfig apiKeyConfig = ApiKeyConfig.builder()
     * .description("description")
     * .expires(expiration)
     * .name("name")
     * .build();
     * ```
     */
    public inline fun apiKeyConfig(block: ApiKeyConfigDsl.() -> Unit = {}): ApiKeyConfig {
        val builder = ApiKeyConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AppSync Functions are local functions that perform certain operations onto a backend data
     * source.
     *
     * Developers can compose operations (Functions) and execute them in sequence with Pipeline
     * Resolvers.
     *
     * Example:
     * ```
     * GraphqlApi api;
     * AppsyncFunction appsyncFunction = AppsyncFunction.Builder.create(this, "function")
     * .name("appsync_function")
     * .api(api)
     * .dataSource(api.addNoneDataSource("none"))
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build();
     * ```
     */
    public inline fun appsyncFunction(
        scope: Construct,
        id: String,
        block: AppsyncFunctionDsl.() -> Unit = {},
    ): AppsyncFunction {
        val builder = AppsyncFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for imported AppSync Functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * AppsyncFunctionAttributes appsyncFunctionAttributes = AppsyncFunctionAttributes.builder()
     * .functionArn("functionArn")
     * .build();
     * ```
     */
    public inline fun appsyncFunctionAttributes(
        block: AppsyncFunctionAttributesDsl.() -> Unit = {}
    ): AppsyncFunctionAttributes {
        val builder = AppsyncFunctionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * the CDK properties for AppSync Functions.
     *
     * Example:
     * ```
     * GraphqlApi api;
     * AppsyncFunction appsyncFunction = AppsyncFunction.Builder.create(this, "function")
     * .name("appsync_function")
     * .api(api)
     * .dataSource(api.addNoneDataSource("none"))
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build();
     * ```
     */
    public inline fun appsyncFunctionProps(
        block: AppsyncFunctionPropsDsl.() -> Unit = {}
    ): AppsyncFunctionProps {
        val builder = AppsyncFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a local file with source code used for an AppSync Function or Resolver.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * DockerImage dockerImage;
     * IGrantable grantable;
     * ILocalBundling localBundling;
     * AssetCode assetCode = AssetCode.Builder.create("path")
     * .assetHash("assetHash")
     * .assetHashType(AssetHashType.SOURCE)
     * .bundling(BundlingOptions.builder()
     * .image(dockerImage)
     * // the properties below are optional
     * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
     * .command(List.of("command"))
     * .entrypoint(List.of("entrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .local(localBundling)
     * .network("network")
     * .outputType(BundlingOutput.ARCHIVED)
     * .platform("platform")
     * .securityOpt("securityOpt")
     * .user("user")
     * .volumes(List.of(DockerVolume.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * // the properties below are optional
     * .consistency(DockerVolumeConsistency.CONSISTENT)
     * .build()))
     * .volumesFrom(List.of("volumesFrom"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .deployTime(false)
     * .exclude(List.of("exclude"))
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .readers(List.of(grantable))
     * .build();
     * ```
     */
    public inline fun assetCode(path: String, block: AssetCodeDsl.() -> Unit = {}): AssetCode {
        val builder = AssetCodeDsl(path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of the API authorization modes.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function authFunction;
     * GraphqlApi.Builder.create(this, "api")
     * .name("api")
     * .definition(Definition.fromFile(join(__dirname, "appsync.test.graphql")))
     * .authorizationConfig(AuthorizationConfig.builder()
     * .defaultAuthorization(AuthorizationMode.builder()
     * .authorizationType(AuthorizationType.LAMBDA)
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfig.builder()
     * .handler(authFunction)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun authorizationConfig(
        block: AuthorizationConfigDsl.() -> Unit = {}
    ): AuthorizationConfig {
        val builder = AuthorizationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface to specify default or additional authorization(s).
     *
     * Example:
     * ```
     * GraphqlApi api = GraphqlApi.Builder.create(this, "Api")
     * .name("demo")
     * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
     * .authorizationConfig(AuthorizationConfig.builder()
     * .defaultAuthorization(AuthorizationMode.builder()
     * .authorizationType(AuthorizationType.IAM)
     * .build())
     * .build())
     * .xrayEnabled(true)
     * .build();
     * Table demoTable = Table.Builder.create(this, "DemoTable")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .build();
     * DynamoDbDataSource demoDS = api.addDynamoDbDataSource("demoDataSource", demoTable);
     * // Resolver for the Query "getDemos" that scans the DynamoDb table and returns the entire list.
     * // Resolver Mapping Template Reference:
     * //
     * https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference-dynamodb.html
     * demoDS.createResolver("QueryGetDemosResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemos")
     * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable())
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
     * .build());
     * // Resolver for the Mutation "addDemo" that puts the item into the DynamoDb table.
     * demoDS.createResolver("MutationAddDemoResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemo")
     * .requestMappingTemplate(MappingTemplate.dynamoDbPutItem(PrimaryKey.partition("id").auto(),
     * Values.projecting("input")))
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultItem())
     * .build());
     * //To enable DynamoDB read consistency with the `MappingTemplate`:
     * demoDS.createResolver("QueryGetDemosConsistentResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosConsistent")
     * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable(true))
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
     * .build());
     * ```
     */
    public inline fun authorizationMode(
        block: AuthorizationModeDsl.() -> Unit = {}
    ): AuthorizationMode {
        val builder = AuthorizationModeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authorization config in case the HTTP endpoint requires authorization.
     *
     * Example:
     * ```
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("api")
     * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
     * .build();
     * HttpDataSource httpDs = api.addHttpDataSource("ds", "https://states.amazonaws.com",
     * HttpDataSourceOptions.builder()
     * .name("httpDsWithStepF")
     * .description("from appsync to StepFunctions Workflow")
     * .authorizationConfig(AwsIamConfig.builder()
     * .signingRegion("us-east-1")
     * .signingServiceName("states")
     * .build())
     * .build());
     * httpDs.createResolver("MutationCallStepFunctionResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("callStepFunction")
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build());
     * ```
     */
    public inline fun awsIamConfig(block: AwsIamConfigDsl.() -> Unit = {}): AwsIamConfig {
        val builder = AwsIamConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * properties for an AppSync datasource backed by a resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * GraphqlApi graphqlApi;
     * Role role;
     * BackedDataSourceProps backedDataSourceProps = BackedDataSourceProps.builder()
     * .api(graphqlApi)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun backedDataSourceProps(
        block: BackedDataSourcePropsDsl.() -> Unit = {}
    ): BackedDataSourceProps {
        val builder = BackedDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * the base properties for AppSync Functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * Code code;
     * FunctionRuntime functionRuntime;
     * MappingTemplate mappingTemplate;
     * BaseAppsyncFunctionProps baseAppsyncFunctionProps = BaseAppsyncFunctionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .code(code)
     * .description("description")
     * .requestMappingTemplate(mappingTemplate)
     * .responseMappingTemplate(mappingTemplate)
     * .runtime(functionRuntime)
     * .build();
     * ```
     */
    public inline fun baseAppsyncFunctionProps(
        block: BaseAppsyncFunctionPropsDsl.() -> Unit = {}
    ): BaseAppsyncFunctionProps {
        val builder = BaseAppsyncFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base properties for an AppSync datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * BaseDataSourceProps baseDataSourceProps = BaseDataSourceProps.builder()
     * .api(graphqlApi)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun baseDataSourceProps(
        block: BaseDataSourcePropsDsl.() -> Unit = {}
    ): BaseDataSourceProps {
        val builder = BaseDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for an AppSync resolver.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun baseResolverProps(
        block: BaseResolverPropsDsl.() -> Unit = {}
    ): BaseResolverProps {
        val builder = BaseResolverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CachingConfig for AppSync resolvers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.appsync.*;
     * CachingConfig cachingConfig = CachingConfig.builder()
     * .ttl(Duration.minutes(30))
     * // the properties below are optional
     * .cachingKeys(List.of("cachingKeys"))
     * .build();
     * ```
     */
    public inline fun cachingConfig(block: CachingConfigDsl.() -> Unit = {}): CachingConfig {
        val builder = CachingConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::ApiCache` resource represents the input of a `CreateApiCache` operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnApiCache cfnApiCache = CfnApiCache.Builder.create(this, "MyCfnApiCache")
     * .apiCachingBehavior("apiCachingBehavior")
     * .apiId("apiId")
     * .ttl(123)
     * .type("type")
     * // the properties below are optional
     * .atRestEncryptionEnabled(false)
     * .healthMetricsConfig("healthMetricsConfig")
     * .transitEncryptionEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html)
     */
    public inline fun cfnApiCache(
        scope: Construct,
        id: String,
        block: CfnApiCacheDsl.() -> Unit = {},
    ): CfnApiCache {
        val builder = CfnApiCacheDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiCache`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnApiCacheProps cfnApiCacheProps = CfnApiCacheProps.builder()
     * .apiCachingBehavior("apiCachingBehavior")
     * .apiId("apiId")
     * .ttl(123)
     * .type("type")
     * // the properties below are optional
     * .atRestEncryptionEnabled(false)
     * .healthMetricsConfig("healthMetricsConfig")
     * .transitEncryptionEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apicache.html)
     */
    public inline fun cfnApiCacheProps(
        block: CfnApiCachePropsDsl.() -> Unit = {}
    ): CfnApiCacheProps {
        val builder = CfnApiCachePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::ApiKey` resource creates a unique key that you can distribute to clients
     * who are executing GraphQL operations with AWS AppSync that require an API key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnApiKey cfnApiKey = CfnApiKey.Builder.create(this, "MyCfnApiKey")
     * .apiId("apiId")
     * // the properties below are optional
     * .description("description")
     * .expires(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
     */
    public inline fun cfnApiKey(
        scope: Construct,
        id: String,
        block: CfnApiKeyDsl.() -> Unit = {},
    ): CfnApiKey {
        val builder = CfnApiKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnApiKeyProps cfnApiKeyProps = CfnApiKeyProps.builder()
     * .apiId("apiId")
     * // the properties below are optional
     * .description("description")
     * .expires(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html)
     */
    public inline fun cfnApiKeyProps(block: CfnApiKeyPropsDsl.() -> Unit = {}): CfnApiKeyProps {
        val builder = CfnApiKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDataSource(
        scope: Construct,
        id: String,
        block: CfnDataSourceDsl.() -> Unit = {},
    ): CfnDataSource {
        val builder = CfnDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AuthorizationConfig` property type specifies the authorization type and configuration
     * for an AWS AppSync http data source.
     *
     * `AuthorizationConfig` is a property of the
     * [AWS AppSync DataSource HttpConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceAuthorizationConfigProperty(
        block: CfnDataSourceAuthorizationConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.AuthorizationConfigProperty {
        val builder = CfnDataSourceAuthorizationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `AwsIamConfig` property type to specify `AwsIamConfig` for a AWS AppSync
     * authorizaton.
     *
     * `AwsIamConfig` is a property of the
     * [AWS AppSync DataSource AuthorizationConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig-authorizationconfig.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * AwsIamConfigProperty awsIamConfigProperty = AwsIamConfigProperty.builder()
     * .signingRegion("signingRegion")
     * .signingServiceName("signingServiceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html)
     */
    public inline fun cfnDataSourceAwsIamConfigProperty(
        block: CfnDataSourceAwsIamConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.AwsIamConfigProperty {
        val builder = CfnDataSourceAwsIamConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Delta Sync configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * DeltaSyncConfigProperty deltaSyncConfigProperty = DeltaSyncConfigProperty.builder()
     * .baseTableTtl("baseTableTtl")
     * .deltaSyncTableName("deltaSyncTableName")
     * .deltaSyncTableTtl("deltaSyncTableTtl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-deltasyncconfig.html)
     */
    public inline fun cfnDataSourceDeltaSyncConfigProperty(
        block: CfnDataSourceDeltaSyncConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DeltaSyncConfigProperty {
        val builder = CfnDataSourceDeltaSyncConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceDynamoDBConfigProperty(
        block: CfnDataSourceDynamoDBConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.DynamoDBConfigProperty {
        val builder = CfnDataSourceDynamoDBConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ElasticsearchConfig` property type specifies the `AwsRegion` and `Endpoints` for an
     * Amazon OpenSearch Service domain in your account for an AWS AppSync data source.
     *
     * ElasticsearchConfig is a property of the
     * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
     * property type.
     *
     * As of September 2021, Amazon Elasticsearch Service is Amazon OpenSearch Service . This
     * property is deprecated. For new data sources, use *OpenSearchServiceConfig* to specify an
     * OpenSearch Service data source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * ElasticsearchConfigProperty elasticsearchConfigProperty = ElasticsearchConfigProperty.builder()
     * .awsRegion("awsRegion")
     * .endpoint("endpoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-elasticsearchconfig.html)
     */
    public inline fun cfnDataSourceElasticsearchConfigProperty(
        block: CfnDataSourceElasticsearchConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.ElasticsearchConfigProperty {
        val builder = CfnDataSourceElasticsearchConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The data source.
     *
     * This can be an API destination, resource, or AWS service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * EventBridgeConfigProperty eventBridgeConfigProperty = EventBridgeConfigProperty.builder()
     * .eventBusArn("eventBusArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-eventbridgeconfig.html)
     */
    public inline fun cfnDataSourceEventBridgeConfigProperty(
        block: CfnDataSourceEventBridgeConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.EventBridgeConfigProperty {
        val builder = CfnDataSourceEventBridgeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `HttpConfig` property type to specify `HttpConfig` for an AWS AppSync data source.
     *
     * `HttpConfig` is a property of the
     * [AWS::AppSync::DataSource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-datasource.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceHttpConfigProperty(
        block: CfnDataSourceHttpConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.HttpConfigProperty {
        val builder = CfnDataSourceHttpConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-lambdaconfig.html)
     */
    public inline fun cfnDataSourceLambdaConfigProperty(
        block: CfnDataSourceLambdaConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.LambdaConfigProperty {
        val builder = CfnDataSourceLambdaConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * OpenSearchServiceConfigProperty openSearchServiceConfigProperty =
     * OpenSearchServiceConfigProperty.builder()
     * .awsRegion("awsRegion")
     * .endpoint("endpoint")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-opensearchserviceconfig.html)
     */
    public inline fun cfnDataSourceOpenSearchServiceConfigProperty(
        block: CfnDataSourceOpenSearchServiceConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.OpenSearchServiceConfigProperty {
        val builder = CfnDataSourceOpenSearchServiceConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDataSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceProps(
        block: CfnDataSourcePropsDsl.() -> Unit = {}
    ): CfnDataSourceProps {
        val builder = CfnDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `RdsHttpEndpointConfig` property type to specify the `RdsHttpEndpoint` for an AWS
     * AppSync relational database.
     *
     * `RdsHttpEndpointConfig` is a property of the
     * [AWS AppSync DataSource RelationalDatabaseConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-relationaldatabaseconfig.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceRdsHttpEndpointConfigProperty(
        block: CfnDataSourceRdsHttpEndpointConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RdsHttpEndpointConfigProperty {
        val builder = CfnDataSourceRdsHttpEndpointConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
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
    public inline fun cfnDataSourceRelationalDatabaseConfigProperty(
        block: CfnDataSourceRelationalDatabaseConfigPropertyDsl.() -> Unit = {}
    ): CfnDataSource.RelationalDatabaseConfigProperty {
        val builder = CfnDataSourceRelationalDatabaseConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::DomainName` resource creates a `DomainNameConfig` object to configure a
     * custom domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html)
     */
    public inline fun cfnDomainName(
        scope: Construct,
        id: String,
        block: CfnDomainNameDsl.() -> Unit = {},
    ): CfnDomainName {
        val builder = CfnDomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::DomainNameApiAssociation` resource represents the mapping of your custom
     * domain name to the assigned API URL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnDomainNameApiAssociation cfnDomainNameApiAssociation =
     * CfnDomainNameApiAssociation.Builder.create(this, "MyCfnDomainNameApiAssociation")
     * .apiId("apiId")
     * .domainName("domainName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
     */
    public inline fun cfnDomainNameApiAssociation(
        scope: Construct,
        id: String,
        block: CfnDomainNameApiAssociationDsl.() -> Unit = {},
    ): CfnDomainNameApiAssociation {
        val builder = CfnDomainNameApiAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomainNameApiAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnDomainNameApiAssociationProps cfnDomainNameApiAssociationProps =
     * CfnDomainNameApiAssociationProps.builder()
     * .apiId("apiId")
     * .domainName("domainName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
     */
    public inline fun cfnDomainNameApiAssociationProps(
        block: CfnDomainNameApiAssociationPropsDsl.() -> Unit = {}
    ): CfnDomainNameApiAssociationProps {
        val builder = CfnDomainNameApiAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomainName`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
     * .certificateArn("certificateArn")
     * .domainName("domainName")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainname.html)
     */
    public inline fun cfnDomainNameProps(
        block: CfnDomainNamePropsDsl.() -> Unit = {}
    ): CfnDomainNameProps {
        val builder = CfnDomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::FunctionConfiguration` resource defines the functions in GraphQL APIs to
     * perform certain operations.
     *
     * You can use pipeline resolvers to attach functions. For more information, see
     * [Pipeline Resolvers](https://docs.aws.amazon.com/appsync/latest/devguide/pipeline-resolvers.html)
     * in the *AWS AppSync Developer Guide* .
     *
     * When you submit an update, AWS CloudFormation updates resources based on differences between
     * what you submit and the stack's current template. To cause this resource to be updated you
     * must change a property value for this resource in the AWS CloudFormation template. Changing
     * the Amazon S3 file content without changing a property value will not result in an update
     * operation.
     *
     * See
     * [Update Behaviors of Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnFunctionConfiguration cfnFunctionConfiguration =
     * CfnFunctionConfiguration.Builder.create(this, "MyCfnFunctionConfiguration")
     * .apiId("apiId")
     * .dataSourceName("dataSourceName")
     * .name("name")
     * // the properties below are optional
     * .code("code")
     * .codeS3Location("codeS3Location")
     * .description("description")
     * .functionVersion("functionVersion")
     * .maxBatchSize(123)
     * .requestMappingTemplate("requestMappingTemplate")
     * .requestMappingTemplateS3Location("requestMappingTemplateS3Location")
     * .responseMappingTemplate("responseMappingTemplate")
     * .responseMappingTemplateS3Location("responseMappingTemplateS3Location")
     * .runtime(AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build())
     * .syncConfig(SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html)
     */
    public inline fun cfnFunctionConfiguration(
        scope: Construct,
        id: String,
        block: CfnFunctionConfigurationDsl.() -> Unit = {},
    ): CfnFunctionConfiguration {
        val builder = CfnFunctionConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * AppSyncRuntimeProperty appSyncRuntimeProperty = AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-appsyncruntime.html)
     */
    public inline fun cfnFunctionConfigurationAppSyncRuntimeProperty(
        block: CfnFunctionConfigurationAppSyncRuntimePropertyDsl.() -> Unit = {}
    ): CfnFunctionConfiguration.AppSyncRuntimeProperty {
        val builder = CfnFunctionConfigurationAppSyncRuntimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LambdaConflictHandlerConfig` object when configuring `LAMBDA` as the Conflict Handler.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * LambdaConflictHandlerConfigProperty lambdaConflictHandlerConfigProperty =
     * LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-lambdaconflicthandlerconfig.html)
     */
    public inline fun cfnFunctionConfigurationLambdaConflictHandlerConfigProperty(
        block: CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl.() -> Unit = {}
    ): CfnFunctionConfiguration.LambdaConflictHandlerConfigProperty {
        val builder = CfnFunctionConfigurationLambdaConflictHandlerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFunctionConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnFunctionConfigurationProps cfnFunctionConfigurationProps =
     * CfnFunctionConfigurationProps.builder()
     * .apiId("apiId")
     * .dataSourceName("dataSourceName")
     * .name("name")
     * // the properties below are optional
     * .code("code")
     * .codeS3Location("codeS3Location")
     * .description("description")
     * .functionVersion("functionVersion")
     * .maxBatchSize(123)
     * .requestMappingTemplate("requestMappingTemplate")
     * .requestMappingTemplateS3Location("requestMappingTemplateS3Location")
     * .responseMappingTemplate("responseMappingTemplate")
     * .responseMappingTemplateS3Location("responseMappingTemplateS3Location")
     * .runtime(AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build())
     * .syncConfig(SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-functionconfiguration.html)
     */
    public inline fun cfnFunctionConfigurationProps(
        block: CfnFunctionConfigurationPropsDsl.() -> Unit = {}
    ): CfnFunctionConfigurationProps {
        val builder = CfnFunctionConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * SyncConfigProperty syncConfigProperty = SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-functionconfiguration-syncconfig.html)
     */
    public inline fun cfnFunctionConfigurationSyncConfigProperty(
        block: CfnFunctionConfigurationSyncConfigPropertyDsl.() -> Unit = {}
    ): CfnFunctionConfiguration.SyncConfigProperty {
        val builder = CfnFunctionConfigurationSyncConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::GraphQLApi` resource creates a new AWS AppSync GraphQL API.
     *
     * This is the top-level construct for your application. For more information, see
     * [Quick Start](https://docs.aws.amazon.com/appsync/latest/devguide/quickstart.html) in the
     * *AWS AppSync Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * Object environmentVariables;
     * CfnGraphQLApi cfnGraphQLApi = CfnGraphQLApi.Builder.create(this, "MyCfnGraphQLApi")
     * .authenticationType("authenticationType")
     * .name("name")
     * // the properties below are optional
     * .additionalAuthenticationProviders(List.of(AdditionalAuthenticationProviderProperty.builder()
     * .authenticationType("authenticationType")
     * // the properties below are optional
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build())
     * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build())
     * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .userPoolId("userPoolId")
     * .build())
     * .build()))
     * .apiType("apiType")
     * .enhancedMetricsConfig(EnhancedMetricsConfigProperty.builder()
     * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
     * .operationLevelMetricsConfig("operationLevelMetricsConfig")
     * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
     * .build())
     * .environmentVariables(environmentVariables)
     * .introspectionConfig("introspectionConfig")
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build())
     * .logConfig(LogConfigProperty.builder()
     * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
     * .excludeVerboseContent(false)
     * .fieldLogLevel("fieldLogLevel")
     * .build())
     * .mergedApiExecutionRoleArn("mergedApiExecutionRoleArn")
     * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build())
     * .ownerContact("ownerContact")
     * .queryDepthLimit(123)
     * .resolverCountLimit(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userPoolConfig(UserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .defaultAction("defaultAction")
     * .userPoolId("userPoolId")
     * .build())
     * .visibility("visibility")
     * .xrayEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
     */
    public inline fun cfnGraphQLApi(
        scope: Construct,
        id: String,
        block: CfnGraphQLApiDsl.() -> Unit = {},
    ): CfnGraphQLApi {
        val builder = CfnGraphQLApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an additional authentication provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * AdditionalAuthenticationProviderProperty additionalAuthenticationProviderProperty =
     * AdditionalAuthenticationProviderProperty.builder()
     * .authenticationType("authenticationType")
     * // the properties below are optional
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build())
     * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build())
     * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .userPoolId("userPoolId")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html)
     */
    public inline fun cfnGraphQLApiAdditionalAuthenticationProviderProperty(
        block: CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.AdditionalAuthenticationProviderProperty {
        val builder = CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an Amazon Cognito user pool configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CognitoUserPoolConfigProperty cognitoUserPoolConfigProperty =
     * CognitoUserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html)
     */
    public inline fun cfnGraphQLApiCognitoUserPoolConfigProperty(
        block: CfnGraphQLApiCognitoUserPoolConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.CognitoUserPoolConfigProperty {
        val builder = CfnGraphQLApiCognitoUserPoolConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes an enhanced metrics configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * EnhancedMetricsConfigProperty enhancedMetricsConfigProperty =
     * EnhancedMetricsConfigProperty.builder()
     * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
     * .operationLevelMetricsConfig("operationLevelMetricsConfig")
     * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-enhancedmetricsconfig.html)
     */
    public inline fun cfnGraphQLApiEnhancedMetricsConfigProperty(
        block: CfnGraphQLApiEnhancedMetricsConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.EnhancedMetricsConfigProperty {
        val builder = CfnGraphQLApiEnhancedMetricsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for AWS Lambda function authorization.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * LambdaAuthorizerConfigProperty lambdaAuthorizerConfigProperty =
     * LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html)
     */
    public inline fun cfnGraphQLApiLambdaAuthorizerConfigProperty(
        block: CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.LambdaAuthorizerConfigProperty {
        val builder = CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LogConfig` property type specifies the logging configuration when writing GraphQL
     * operations and tracing to Amazon CloudWatch for an AWS AppSync GraphQL API.
     *
     * `LogConfig` is a property of the
     * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * LogConfigProperty logConfigProperty = LogConfigProperty.builder()
     * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
     * .excludeVerboseContent(false)
     * .fieldLogLevel("fieldLogLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html)
     */
    public inline fun cfnGraphQLApiLogConfigProperty(
        block: CfnGraphQLApiLogConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.LogConfigProperty {
        val builder = CfnGraphQLApiLogConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `OpenIDConnectConfig` property type specifies the optional authorization configuration
     * for using an OpenID Connect compliant service with your GraphQL endpoint for an AWS AppSync
     * GraphQL API.
     *
     * `OpenIDConnectConfig` is a property of the
     * [AWS::AppSync::GraphQLApi](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * OpenIDConnectConfigProperty openIDConnectConfigProperty = OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html)
     */
    public inline fun cfnGraphQLApiOpenIDConnectConfigProperty(
        block: CfnGraphQLApiOpenIDConnectConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.OpenIDConnectConfigProperty {
        val builder = CfnGraphQLApiOpenIDConnectConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGraphQLApi`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * Object environmentVariables;
     * CfnGraphQLApiProps cfnGraphQLApiProps = CfnGraphQLApiProps.builder()
     * .authenticationType("authenticationType")
     * .name("name")
     * // the properties below are optional
     * .additionalAuthenticationProviders(List.of(AdditionalAuthenticationProviderProperty.builder()
     * .authenticationType("authenticationType")
     * // the properties below are optional
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build())
     * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build())
     * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .userPoolId("userPoolId")
     * .build())
     * .build()))
     * .apiType("apiType")
     * .enhancedMetricsConfig(EnhancedMetricsConfigProperty.builder()
     * .dataSourceLevelMetricsBehavior("dataSourceLevelMetricsBehavior")
     * .operationLevelMetricsConfig("operationLevelMetricsConfig")
     * .resolverLevelMetricsBehavior("resolverLevelMetricsBehavior")
     * .build())
     * .environmentVariables(environmentVariables)
     * .introspectionConfig("introspectionConfig")
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .identityValidationExpression("identityValidationExpression")
     * .build())
     * .logConfig(LogConfigProperty.builder()
     * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
     * .excludeVerboseContent(false)
     * .fieldLogLevel("fieldLogLevel")
     * .build())
     * .mergedApiExecutionRoleArn("mergedApiExecutionRoleArn")
     * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
     * .authTtl(123)
     * .clientId("clientId")
     * .iatTtl(123)
     * .issuer("issuer")
     * .build())
     * .ownerContact("ownerContact")
     * .queryDepthLimit(123)
     * .resolverCountLimit(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userPoolConfig(UserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .defaultAction("defaultAction")
     * .userPoolId("userPoolId")
     * .build())
     * .visibility("visibility")
     * .xrayEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html)
     */
    public inline fun cfnGraphQLApiProps(
        block: CfnGraphQLApiPropsDsl.() -> Unit = {}
    ): CfnGraphQLApiProps {
        val builder = CfnGraphQLApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `UserPoolConfig` property type specifies the optional authorization configuration for
     * using Amazon Cognito user pools with your GraphQL endpoint for an AWS AppSync GraphQL API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * UserPoolConfigProperty userPoolConfigProperty = UserPoolConfigProperty.builder()
     * .appIdClientRegex("appIdClientRegex")
     * .awsRegion("awsRegion")
     * .defaultAction("defaultAction")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html)
     */
    public inline fun cfnGraphQLApiUserPoolConfigProperty(
        block: CfnGraphQLApiUserPoolConfigPropertyDsl.() -> Unit = {}
    ): CfnGraphQLApi.UserPoolConfigProperty {
        val builder = CfnGraphQLApiUserPoolConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::GraphQLSchema` resource is used for your AWS AppSync GraphQL schema that
     * controls the data model for your API.
     *
     * Schema files are text written in Schema Definition Language (SDL) format. For more
     * information about schema authoring, see
     * [Designing a GraphQL API](https://docs.aws.amazon.com/appsync/latest/devguide/designing-a-graphql-api.html)
     * in the *AWS AppSync Developer Guide* .
     *
     * When you submit an update, AWS CloudFormation updates resources based on differences between
     * what you submit and the stack's current template. To cause this resource to be updated you
     * must change a property value for this resource in the CloudFormation template. Changing the
     * Amazon S3 file content without changing a property value will not result in an update
     * operation.
     *
     * See
     * [Update Behaviors of Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnGraphQLSchema cfnGraphQLSchema = CfnGraphQLSchema.Builder.create(this, "MyCfnGraphQLSchema")
     * .apiId("apiId")
     * // the properties below are optional
     * .definition("definition")
     * .definitionS3Location("definitionS3Location")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html)
     */
    public inline fun cfnGraphQLSchema(
        scope: Construct,
        id: String,
        block: CfnGraphQLSchemaDsl.() -> Unit = {},
    ): CfnGraphQLSchema {
        val builder = CfnGraphQLSchemaDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGraphQLSchema`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnGraphQLSchemaProps cfnGraphQLSchemaProps = CfnGraphQLSchemaProps.builder()
     * .apiId("apiId")
     * // the properties below are optional
     * .definition("definition")
     * .definitionS3Location("definitionS3Location")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html)
     */
    public inline fun cfnGraphQLSchemaProps(
        block: CfnGraphQLSchemaPropsDsl.() -> Unit = {}
    ): CfnGraphQLSchemaProps {
        val builder = CfnGraphQLSchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::AppSync::Resolver` resource defines the logical GraphQL resolver that you attach to
     * fields in a schema.
     *
     * Request and response templates for resolvers are written in Apache Velocity Template Language
     * (VTL) format. For more information about resolvers, see
     * [Resolver Mapping Template Reference](https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference.html)
     * .
     *
     * When you submit an update, AWS CloudFormation updates resources based on differences between
     * what you submit and the stack's current template. To cause this resource to be updated you
     * must change a property value for this resource in the CloudFormation template. Changing the
     * Amazon S3 file content without changing a property value will not result in an update
     * operation.
     *
     * See
     * [Update Behaviors of Stack Resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnResolver cfnResolver = CfnResolver.Builder.create(this, "MyCfnResolver")
     * .apiId("apiId")
     * .fieldName("fieldName")
     * .typeName("typeName")
     * // the properties below are optional
     * .cachingConfig(CachingConfigProperty.builder()
     * .ttl(123)
     * // the properties below are optional
     * .cachingKeys(List.of("cachingKeys"))
     * .build())
     * .code("code")
     * .codeS3Location("codeS3Location")
     * .dataSourceName("dataSourceName")
     * .kind("kind")
     * .maxBatchSize(123)
     * .metricsConfig("metricsConfig")
     * .pipelineConfig(PipelineConfigProperty.builder()
     * .functions(List.of("functions"))
     * .build())
     * .requestMappingTemplate("requestMappingTemplate")
     * .requestMappingTemplateS3Location("requestMappingTemplateS3Location")
     * .responseMappingTemplate("responseMappingTemplate")
     * .responseMappingTemplateS3Location("responseMappingTemplateS3Location")
     * .runtime(AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build())
     * .syncConfig(SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
     */
    public inline fun cfnResolver(
        scope: Construct,
        id: String,
        block: CfnResolverDsl.() -> Unit = {},
    ): CfnResolver {
        val builder = CfnResolverDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a runtime used by an AWS AppSync resolver or AWS AppSync function.
     *
     * Specifies the name and version of the runtime to use. Note that if a runtime is specified,
     * code must also be specified.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * AppSyncRuntimeProperty appSyncRuntimeProperty = AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html)
     */
    public inline fun cfnResolverAppSyncRuntimeProperty(
        block: CfnResolverAppSyncRuntimePropertyDsl.() -> Unit = {}
    ): CfnResolver.AppSyncRuntimeProperty {
        val builder = CfnResolverAppSyncRuntimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The caching configuration for a resolver that has caching activated.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CachingConfigProperty cachingConfigProperty = CachingConfigProperty.builder()
     * .ttl(123)
     * // the properties below are optional
     * .cachingKeys(List.of("cachingKeys"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-cachingconfig.html)
     */
    public inline fun cfnResolverCachingConfigProperty(
        block: CfnResolverCachingConfigPropertyDsl.() -> Unit = {}
    ): CfnResolver.CachingConfigProperty {
        val builder = CfnResolverCachingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LambdaConflictHandlerConfig` when configuring LAMBDA as the Conflict Handler.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * LambdaConflictHandlerConfigProperty lambdaConflictHandlerConfigProperty =
     * LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-lambdaconflicthandlerconfig.html)
     */
    public inline fun cfnResolverLambdaConflictHandlerConfigProperty(
        block: CfnResolverLambdaConflictHandlerConfigPropertyDsl.() -> Unit = {}
    ): CfnResolver.LambdaConflictHandlerConfigProperty {
        val builder = CfnResolverLambdaConflictHandlerConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `PipelineConfig` property type to specify `PipelineConfig` for an AWS AppSync
     * resolver.
     *
     * `PipelineConfig` is a property of the
     * [AWS::AppSync::Resolver](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * PipelineConfigProperty pipelineConfigProperty = PipelineConfigProperty.builder()
     * .functions(List.of("functions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-pipelineconfig.html)
     */
    public inline fun cfnResolverPipelineConfigProperty(
        block: CfnResolverPipelineConfigPropertyDsl.() -> Unit = {}
    ): CfnResolver.PipelineConfigProperty {
        val builder = CfnResolverPipelineConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResolver`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnResolverProps cfnResolverProps = CfnResolverProps.builder()
     * .apiId("apiId")
     * .fieldName("fieldName")
     * .typeName("typeName")
     * // the properties below are optional
     * .cachingConfig(CachingConfigProperty.builder()
     * .ttl(123)
     * // the properties below are optional
     * .cachingKeys(List.of("cachingKeys"))
     * .build())
     * .code("code")
     * .codeS3Location("codeS3Location")
     * .dataSourceName("dataSourceName")
     * .kind("kind")
     * .maxBatchSize(123)
     * .metricsConfig("metricsConfig")
     * .pipelineConfig(PipelineConfigProperty.builder()
     * .functions(List.of("functions"))
     * .build())
     * .requestMappingTemplate("requestMappingTemplate")
     * .requestMappingTemplateS3Location("requestMappingTemplateS3Location")
     * .responseMappingTemplate("responseMappingTemplate")
     * .responseMappingTemplateS3Location("responseMappingTemplateS3Location")
     * .runtime(AppSyncRuntimeProperty.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build())
     * .syncConfig(SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-resolver.html)
     */
    public inline fun cfnResolverProps(
        block: CfnResolverPropsDsl.() -> Unit = {}
    ): CfnResolverProps {
        val builder = CfnResolverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a Sync configuration for a resolver.
     *
     * Specifies which Conflict Detection strategy and Resolution strategy to use when the resolver
     * is invoked.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * SyncConfigProperty syncConfigProperty = SyncConfigProperty.builder()
     * .conflictDetection("conflictDetection")
     * // the properties below are optional
     * .conflictHandler("conflictHandler")
     * .lambdaConflictHandlerConfig(LambdaConflictHandlerConfigProperty.builder()
     * .lambdaConflictHandlerArn("lambdaConflictHandlerArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-syncconfig.html)
     */
    public inline fun cfnResolverSyncConfigProperty(
        block: CfnResolverSyncConfigPropertyDsl.() -> Unit = {}
    ): CfnResolver.SyncConfigProperty {
        val builder = CfnResolverSyncConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the configuration of a source API.
     *
     * A source API is a GraphQL API that is linked to a merged API. There can be multiple source
     * APIs attached to each merged API. When linked to a merged API, the source API's schema, data
     * sources, and resolvers will be combined with other linked source API data to form a new,
     * singular API. Source APIs can originate from your account or from other accounts via Resource
     * Access Manager.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnSourceApiAssociation cfnSourceApiAssociation = CfnSourceApiAssociation.Builder.create(this,
     * "MyCfnSourceApiAssociation")
     * .description("description")
     * .mergedApiIdentifier("mergedApiIdentifier")
     * .sourceApiAssociationConfig(SourceApiAssociationConfigProperty.builder()
     * .mergeType("mergeType")
     * .build())
     * .sourceApiIdentifier("sourceApiIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-sourceapiassociation.html)
     */
    public inline fun cfnSourceApiAssociation(
        scope: Construct,
        id: String,
        block: CfnSourceApiAssociationDsl.() -> Unit = {},
    ): CfnSourceApiAssociation {
        val builder = CfnSourceApiAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSourceApiAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CfnSourceApiAssociationProps cfnSourceApiAssociationProps =
     * CfnSourceApiAssociationProps.builder()
     * .description("description")
     * .mergedApiIdentifier("mergedApiIdentifier")
     * .sourceApiAssociationConfig(SourceApiAssociationConfigProperty.builder()
     * .mergeType("mergeType")
     * .build())
     * .sourceApiIdentifier("sourceApiIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-sourceapiassociation.html)
     */
    public inline fun cfnSourceApiAssociationProps(
        block: CfnSourceApiAssociationPropsDsl.() -> Unit = {}
    ): CfnSourceApiAssociationProps {
        val builder = CfnSourceApiAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes properties used to specify configurations related to a source API.
     *
     * This is a property of the `AWS:AppSync:SourceApiAssociation` type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * SourceApiAssociationConfigProperty sourceApiAssociationConfigProperty =
     * SourceApiAssociationConfigProperty.builder()
     * .mergeType("mergeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-sourceapiassociation-sourceapiassociationconfig.html)
     */
    public inline fun cfnSourceApiAssociationSourceApiAssociationConfigProperty(
        block: CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl.() -> Unit = {}
    ): CfnSourceApiAssociation.SourceApiAssociationConfigProperty {
        val builder = CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of binding `Code` into a `Function`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * CodeConfig codeConfig = CodeConfig.builder()
     * .inlineCode("inlineCode")
     * .s3Location("s3Location")
     * .build();
     * ```
     */
    public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
        val builder = CodeConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional configuration for data sources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * DataSourceOptions dataSourceOptions = DataSourceOptions.builder()
     * .description("description")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun dataSourceOptions(
        block: DataSourceOptionsDsl.() -> Unit = {}
    ): DataSourceOptions {
        val builder = DataSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Domain name configuration for AppSync.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.route53.*;
     * // hosted zone and route53 features
     * String hostedZoneId;
     * String zoneName = "example.com";
     * String myDomainName = "api.example.com";
     * Certificate certificate = Certificate.Builder.create(this,
     * "cert").domainName(myDomainName).build();
     * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("myApi")
     * .definition(Definition.fromSchema(schema))
     * .domainName(DomainOptions.builder()
     * .certificate(certificate)
     * .domainName(myDomainName)
     * .build())
     * .build();
     * // hosted zone for adding appsync domain
     * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
     * HostedZoneAttributes.builder()
     * .hostedZoneId(hostedZoneId)
     * .zoneName(zoneName)
     * .build());
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * CnameRecord.Builder.create(this, "CnameApiRecord")
     * .recordName("api")
     * .zone(zone)
     * .domainName(api.getAppSyncDomainName())
     * .build();
     * ```
     */
    public inline fun domainOptions(block: DomainOptionsDsl.() -> Unit = {}): DomainOptions {
        val builder = DomainOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync datasource backed by a DynamoDB table.
     *
     * Example:
     * ```
     * GraphqlApi api = GraphqlApi.Builder.create(this, "Api")
     * .name("demo")
     * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
     * .authorizationConfig(AuthorizationConfig.builder()
     * .defaultAuthorization(AuthorizationMode.builder()
     * .authorizationType(AuthorizationType.IAM)
     * .build())
     * .build())
     * .xrayEnabled(true)
     * .build();
     * Table demoTable = Table.Builder.create(this, "DemoTable")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .build();
     * DynamoDbDataSource demoDS = api.addDynamoDbDataSource("demoDataSource", demoTable);
     * // Resolver for the Query "getDemos" that scans the DynamoDb table and returns the entire list.
     * // Resolver Mapping Template Reference:
     * //
     * https://docs.aws.amazon.com/appsync/latest/devguide/resolver-mapping-template-reference-dynamodb.html
     * demoDS.createResolver("QueryGetDemosResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemos")
     * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable())
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
     * .build());
     * // Resolver for the Mutation "addDemo" that puts the item into the DynamoDb table.
     * demoDS.createResolver("MutationAddDemoResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemo")
     * .requestMappingTemplate(MappingTemplate.dynamoDbPutItem(PrimaryKey.partition("id").auto(),
     * Values.projecting("input")))
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultItem())
     * .build());
     * //To enable DynamoDB read consistency with the `MappingTemplate`:
     * demoDS.createResolver("QueryGetDemosConsistentResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosConsistent")
     * .requestMappingTemplate(MappingTemplate.dynamoDbScanTable(true))
     * .responseMappingTemplate(MappingTemplate.dynamoDbResultList())
     * .build());
     * ```
     */
    public inline fun dynamoDbDataSource(
        scope: Construct,
        id: String,
        block: DynamoDbDataSourceDsl.() -> Unit = {},
    ): DynamoDbDataSource {
        val builder = DynamoDbDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync DynamoDB datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.dynamodb.*;
     * import software.amazon.awscdk.services.iam.*;
     * GraphqlApi graphqlApi;
     * Role role;
     * Table table;
     * DynamoDbDataSourceProps dynamoDbDataSourceProps = DynamoDbDataSourceProps.builder()
     * .api(graphqlApi)
     * .table(table)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .readOnlyAccess(false)
     * .serviceRole(role)
     * .useCallerCredentials(false)
     * .build();
     * ```
     */
    public inline fun dynamoDbDataSourceProps(
        block: DynamoDbDataSourcePropsDsl.() -> Unit = {}
    ): DynamoDbDataSourceProps {
        val builder = DynamoDbDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) An Appsync datasource backed by Elasticsearch.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.elasticsearch.*;
     * import software.amazon.awscdk.services.iam.*;
     * Domain domain;
     * GraphqlApi graphqlApi;
     * Role role;
     * ElasticsearchDataSource elasticsearchDataSource = ElasticsearchDataSource.Builder.create(this,
     * "MyElasticsearchDataSource")
     * .api(graphqlApi)
     * .domain(domain)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     * * use `OpenSearchDataSource`
     */
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

    /**
     * (deprecated) Properties for the Elasticsearch Data Source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.elasticsearch.*;
     * import software.amazon.awscdk.services.iam.*;
     * Domain domain;
     * GraphqlApi graphqlApi;
     * Role role;
     * ElasticsearchDataSourceProps elasticsearchDataSourceProps =
     * ElasticsearchDataSourceProps.builder()
     * .api(graphqlApi)
     * .domain(domain)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     * * use `OpenSearchDataSourceProps` with `OpenSearchDataSource`
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun elasticsearchDataSourceProps(
        block: ElasticsearchDataSourcePropsDsl.() -> Unit = {}
    ): ElasticsearchDataSourceProps {
        val builder = ElasticsearchDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync datasource backed by EventBridge.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * GraphqlApi api = GraphqlApi.Builder.create(this, "EventBridgeApi")
     * .name("EventBridgeApi")
     * .definition(Definition.fromFile(join(__dirname, "appsync.eventbridge.graphql")))
     * .build();
     * EventBus bus = EventBus.Builder.create(this, "DestinationEventBus").build();
     * EventBridgeDataSource dataSource = api.addEventBridgeDataSource("NoneDS", bus);
     * dataSource.createResolver("EventResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("emitEvent")
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build());
     * ```
     */
    public inline fun eventBridgeDataSource(
        scope: Construct,
        id: String,
        block: EventBridgeDataSourceDsl.() -> Unit = {},
    ): EventBridgeDataSource {
        val builder = EventBridgeDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync EventBridge datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.events.*;
     * import software.amazon.awscdk.services.iam.*;
     * EventBus eventBus;
     * GraphqlApi graphqlApi;
     * Role role;
     * EventBridgeDataSourceProps eventBridgeDataSourceProps = EventBridgeDataSourceProps.builder()
     * .api(graphqlApi)
     * .eventBus(eventBus)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun eventBridgeDataSourceProps(
        block: EventBridgeDataSourcePropsDsl.() -> Unit = {}
    ): EventBridgeDataSourceProps {
        val builder = EventBridgeDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * props used by implementations of BaseDataSource to provide configuration.
     *
     * Should not be used directly.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * ExtendedDataSourceProps extendedDataSourceProps = ExtendedDataSourceProps.builder()
     * .type("type")
     * // the properties below are optional
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
     * .build();
     * ```
     */
    public inline fun extendedDataSourceProps(
        block: ExtendedDataSourcePropsDsl.() -> Unit = {}
    ): ExtendedDataSourceProps {
        val builder = ExtendedDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional property for an AppSync resolver for data source reference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.appsync.*;
     * AppsyncFunction appsyncFunction;
     * BaseDataSource baseDataSource;
     * Code code;
     * FunctionRuntime functionRuntime;
     * MappingTemplate mappingTemplate;
     * ExtendedResolverProps extendedResolverProps = ExtendedResolverProps.builder()
     * .fieldName("fieldName")
     * .typeName("typeName")
     * // the properties below are optional
     * .cachingConfig(CachingConfig.builder()
     * .ttl(Duration.minutes(30))
     * // the properties below are optional
     * .cachingKeys(List.of("cachingKeys"))
     * .build())
     * .code(code)
     * .dataSource(baseDataSource)
     * .maxBatchSize(123)
     * .pipelineConfig(List.of(appsyncFunction))
     * .requestMappingTemplate(mappingTemplate)
     * .responseMappingTemplate(mappingTemplate)
     * .runtime(functionRuntime)
     * .build();
     * ```
     */
    public inline fun extendedResolverProps(
        block: ExtendedResolverPropsDsl.() -> Unit = {}
    ): ExtendedResolverProps {
        val builder = ExtendedResolverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync GraphQL API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.events.*;
     * GraphqlApi api = GraphqlApi.Builder.create(this, "EventBridgeApi")
     * .name("EventBridgeApi")
     * .definition(Definition.fromFile(join(__dirname, "appsync.eventbridge.graphql")))
     * .build();
     * EventBus bus = EventBus.Builder.create(this, "DestinationEventBus").build();
     * EventBridgeDataSource dataSource = api.addEventBridgeDataSource("NoneDS", bus);
     * dataSource.createResolver("EventResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("emitEvent")
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build());
     * ```
     */
    public inline fun graphqlApi(
        scope: Construct,
        id: String,
        block: GraphqlApiDsl.() -> Unit = {},
    ): GraphqlApi {
        val builder = GraphqlApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for GraphQL imports.
     *
     * Example:
     * ```
     * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
     * .name("FirstSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
     * .build();
     * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
     * GraphqlApiAttributes.builder()
     * .graphqlApiId("MyApiId")
     * .graphqlApiArn("MyApiArn")
     * .build());
     * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
     * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
     * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
     * .sourceApi(sourceApi)
     * .mergedApi(importedMergedApi)
     * .mergeType(MergeType.MANUAL_MERGE)
     * .mergedApiExecutionRole(importedExecutionRole)
     * .build();
     * ```
     */
    public inline fun graphqlApiAttributes(
        block: GraphqlApiAttributesDsl.() -> Unit = {}
    ): GraphqlApiAttributes {
        val builder = GraphqlApiAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync GraphQL API.
     *
     * Example:
     * ```
     * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
     * .name("FirstSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
     * .build();
     * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
     * GraphqlApiAttributes.builder()
     * .graphqlApiId("MyApiId")
     * .graphqlApiArn("MyApiArn")
     * .build());
     * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
     * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
     * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
     * .sourceApi(sourceApi)
     * .mergedApi(importedMergedApi)
     * .mergeType(MergeType.MANUAL_MERGE)
     * .mergedApiExecutionRole(importedExecutionRole)
     * .build();
     * ```
     */
    public inline fun graphqlApiProps(block: GraphqlApiPropsDsl.() -> Unit = {}): GraphqlApiProps {
        val builder = GraphqlApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync datasource backed by a http endpoint.
     *
     * Example:
     * ```
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("api")
     * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
     * .build();
     * HttpDataSource httpDs = api.addHttpDataSource("ds", "https://states.amazonaws.com",
     * HttpDataSourceOptions.builder()
     * .name("httpDsWithStepF")
     * .description("from appsync to StepFunctions Workflow")
     * .authorizationConfig(AwsIamConfig.builder()
     * .signingRegion("us-east-1")
     * .signingServiceName("states")
     * .build())
     * .build());
     * httpDs.createResolver("MutationCallStepFunctionResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("callStepFunction")
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build());
     * ```
     */
    public inline fun httpDataSource(
        scope: Construct,
        id: String,
        block: HttpDataSourceDsl.() -> Unit = {},
    ): HttpDataSource {
        val builder = HttpDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Optional configuration for Http data sources.
     *
     * Example:
     * ```
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("api")
     * .definition(Definition.fromFile(join(__dirname, "schema.graphql")))
     * .build();
     * HttpDataSource httpDs = api.addHttpDataSource("ds", "https://states.amazonaws.com",
     * HttpDataSourceOptions.builder()
     * .name("httpDsWithStepF")
     * .description("from appsync to StepFunctions Workflow")
     * .authorizationConfig(AwsIamConfig.builder()
     * .signingRegion("us-east-1")
     * .signingServiceName("states")
     * .build())
     * .build());
     * httpDs.createResolver("MutationCallStepFunctionResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("callStepFunction")
     * .requestMappingTemplate(MappingTemplate.fromFile("request.vtl"))
     * .responseMappingTemplate(MappingTemplate.fromFile("response.vtl"))
     * .build());
     * ```
     */
    public inline fun httpDataSourceOptions(
        block: HttpDataSourceOptionsDsl.() -> Unit = {}
    ): HttpDataSourceOptions {
        val builder = HttpDataSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync http datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * HttpDataSourceProps httpDataSourceProps = HttpDataSourceProps.builder()
     * .api(graphqlApi)
     * .endpoint("endpoint")
     * // the properties below are optional
     * .authorizationConfig(AwsIamConfig.builder()
     * .signingRegion("signingRegion")
     * .signingServiceName("signingServiceName")
     * .build())
     * .description("description")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun httpDataSourceProps(
        block: HttpDataSourcePropsDsl.() -> Unit = {}
    ): HttpDataSourceProps {
        val builder = HttpDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Lambda authorization in AppSync.
     *
     * Note that you can only have a single AWS Lambda function configured to authorize your API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * Function authFunction;
     * GraphqlApi.Builder.create(this, "api")
     * .name("api")
     * .definition(Definition.fromFile(join(__dirname, "appsync.test.graphql")))
     * .authorizationConfig(AuthorizationConfig.builder()
     * .defaultAuthorization(AuthorizationMode.builder()
     * .authorizationType(AuthorizationType.LAMBDA)
     * .lambdaAuthorizerConfig(LambdaAuthorizerConfig.builder()
     * .handler(authFunction)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun lambdaAuthorizerConfig(
        block: LambdaAuthorizerConfigDsl.() -> Unit = {}
    ): LambdaAuthorizerConfig {
        val builder = LambdaAuthorizerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync datasource backed by a Lambda function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * GraphqlApi graphqlApi;
     * Role role;
     * LambdaDataSource lambdaDataSource = LambdaDataSource.Builder.create(this, "MyLambdaDataSource")
     * .api(graphqlApi)
     * .lambdaFunction(function_)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun lambdaDataSource(
        scope: Construct,
        id: String,
        block: LambdaDataSourceDsl.() -> Unit = {},
    ): LambdaDataSource {
        val builder = LambdaDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync Lambda datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * GraphqlApi graphqlApi;
     * Role role;
     * LambdaDataSourceProps lambdaDataSourceProps = LambdaDataSourceProps.builder()
     * .api(graphqlApi)
     * .lambdaFunction(function_)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun lambdaDataSourceProps(
        block: LambdaDataSourcePropsDsl.() -> Unit = {}
    ): LambdaDataSourceProps {
        val builder = LambdaDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Logging configuration for AppSync.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.logs.*;
     * LogConfig logConfig = LogConfig.builder()
     * .retention(RetentionDays.ONE_WEEK)
     * .build();
     * GraphqlApi.Builder.create(this, "api")
     * .authorizationConfig(AuthorizationConfig.builder().build())
     * .name("myApi")
     * .definition(Definition.fromFile(join(__dirname, "myApi.graphql")))
     * .logConfig(logConfig)
     * .build();
     * ```
     */
    public inline fun logConfig(block: LogConfigDsl.() -> Unit = {}): LogConfig {
        val builder = LogConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync dummy datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * NoneDataSource noneDataSource = NoneDataSource.Builder.create(this, "MyNoneDataSource")
     * .api(graphqlApi)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun noneDataSource(
        scope: Construct,
        id: String,
        block: NoneDataSourceDsl.() -> Unit = {},
    ): NoneDataSource {
        val builder = NoneDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync dummy datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * NoneDataSourceProps noneDataSourceProps = NoneDataSourceProps.builder()
     * .api(graphqlApi)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .build();
     * ```
     */
    public inline fun noneDataSourceProps(
        block: NoneDataSourcePropsDsl.() -> Unit = {}
    ): NoneDataSourceProps {
        val builder = NoneDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for OpenID Connect authorization in AppSync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * OpenIdConnectConfig openIdConnectConfig = OpenIdConnectConfig.builder()
     * .oidcProvider("oidcProvider")
     * // the properties below are optional
     * .clientId("clientId")
     * .tokenExpiryFromAuth(123)
     * .tokenExpiryFromIssue(123)
     * .build();
     * ```
     */
    public inline fun openIdConnectConfig(
        block: OpenIdConnectConfigDsl.() -> Unit = {}
    ): OpenIdConnectConfig {
        val builder = OpenIdConnectConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Appsync datasource backed by OpenSearch.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.opensearchservice.*;
     * GraphqlApi api;
     * User user = new User(this, "User");
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_2_3)
     * .removalPolicy(RemovalPolicy.DESTROY)
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder().masterUserArn(user.getUserArn()).build())
     * .encryptionAtRest(EncryptionAtRestOptions.builder().enabled(true).build())
     * .nodeToNodeEncryption(true)
     * .enforceHttps(true)
     * .build();
     * OpenSearchDataSource ds = api.addOpenSearchDataSource("ds", domain);
     * ds.createResolver("QueryGetTestsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getTests")
     * .requestMappingTemplate(MappingTemplate.fromString(JSON.stringify(Map.of(
     * "version", "2017-02-28",
     * "operation", "GET",
     * "path", "/id/post/_search",
     * "params", Map.of(
     * "headers", Map.of(),
     * "queryString", Map.of(),
     * "body", Map.of("from", 0, "size", 50))))))
     * .responseMappingTemplate(MappingTemplate.fromString("[\n    #foreach($entry in
     * $context.result.hits.hits)\n    #if( $velocityCount &gt; 1 ) , #end\n
     * $utils.toJson($entry.get(\"_source\"))\n    #end\n  ]"))
     * .build());
     * ```
     */
    public inline fun openSearchDataSource(
        scope: Construct,
        id: String,
        block: OpenSearchDataSourceDsl.() -> Unit = {},
    ): OpenSearchDataSource {
        val builder = OpenSearchDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the OpenSearch Data Source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.opensearchservice.*;
     * Domain domain;
     * GraphqlApi graphqlApi;
     * Role role;
     * OpenSearchDataSourceProps openSearchDataSourceProps = OpenSearchDataSourceProps.builder()
     * .api(graphqlApi)
     * .domain(domain)
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun openSearchDataSourceProps(
        block: OpenSearchDataSourcePropsDsl.() -> Unit = {}
    ): OpenSearchDataSourceProps {
        val builder = OpenSearchDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync datasource backed by RDS.
     *
     * Example:
     * ```
     * // Build a data source for AppSync to access the database.
     * GraphqlApi api;
     * // Create username and password secret for DB Cluster
     * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
     * .username("clusteradmin")
     * .build();
     * // The VPC to place the cluster in
     * Vpc vpc = new Vpc(this, "AuroraVpc");
     * // Create the serverless cluster, provide all values needed to customise the database.
     * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
     * .engine(DatabaseClusterEngine.AURORA_MYSQL)
     * .vpc(vpc)
     * .credentials(Map.of("username", "clusteradmin"))
     * .clusterIdentifier("db-endpoint-test")
     * .defaultDatabaseName("demos")
     * .build();
     * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
     * // Set up a resolver for an RDS query.
     * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
     * .typeName("Query")
     * .fieldName("getDemosRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
     * .build());
     * // Set up a resolver for an RDS mutation.
     * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
     * .typeName("Mutation")
     * .fieldName("addDemoRds")
     * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
     *  \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id
     * = :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
     * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
     * .responseMappingTemplate(MappingTemplate.fromString("\n
     * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
     * .build());
     * ```
     */
    public inline fun rdsDataSource(
        scope: Construct,
        id: String,
        block: RdsDataSourceDsl.() -> Unit = {},
    ): RdsDataSource {
        val builder = RdsDataSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AppSync RDS datasource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.rds.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * GraphqlApi graphqlApi;
     * Role role;
     * Secret secret;
     * ServerlessCluster serverlessCluster;
     * RdsDataSourceProps rdsDataSourceProps = RdsDataSourceProps.builder()
     * .api(graphqlApi)
     * .secretStore(secret)
     * .serverlessCluster(serverlessCluster)
     * // the properties below are optional
     * .databaseName("databaseName")
     * .description("description")
     * .name("name")
     * .serviceRole(role)
     * .build();
     * ```
     */
    public inline fun rdsDataSourceProps(
        block: RdsDataSourcePropsDsl.() -> Unit = {}
    ): RdsDataSourceProps {
        val builder = RdsDataSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An AppSync resolver.
     *
     * Example:
     * ```
     * GraphqlApi api;
     * AppsyncFunction appsyncFunction;
     * Resolver pipelineResolver = Resolver.Builder.create(this, "pipeline")
     * .api(api)
     * .dataSource(api.addNoneDataSource("none"))
     * .typeName("typeName")
     * .fieldName("fieldName")
     * .requestMappingTemplate(MappingTemplate.fromFile("beforeRequest.vtl"))
     * .pipelineConfig(List.of(appsyncFunction))
     * .responseMappingTemplate(MappingTemplate.fromFile("afterResponse.vtl"))
     * .build();
     * ```
     */
    public inline fun resolver(
        scope: Construct,
        id: String,
        block: ResolverDsl.() -> Unit = {},
    ): Resolver {
        val builder = ResolverDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional property for an AppSync resolver for GraphQL API reference.
     *
     * Example:
     * ```
     * GraphqlApi api;
     * AppsyncFunction appsyncFunction;
     * Resolver pipelineResolver = Resolver.Builder.create(this, "pipeline")
     * .api(api)
     * .dataSource(api.addNoneDataSource("none"))
     * .typeName("typeName")
     * .fieldName("fieldName")
     * .requestMappingTemplate(MappingTemplate.fromFile("beforeRequest.vtl"))
     * .pipelineConfig(List.of(appsyncFunction))
     * .responseMappingTemplate(MappingTemplate.fromFile("afterResponse.vtl"))
     * .build();
     * ```
     */
    public inline fun resolverProps(block: ResolverPropsDsl.() -> Unit = {}): ResolverProps {
        val builder = ResolverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Config for binding runtime to a function or resolver.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * RuntimeConfig runtimeConfig = RuntimeConfig.builder()
     * .name("name")
     * .runtimeVersion("runtimeVersion")
     * .build();
     * ```
     */
    public inline fun runtimeConfig(block: RuntimeConfigDsl.() -> Unit = {}): RuntimeConfig {
        val builder = RuntimeConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used for configuring schema bind behavior.
     *
     * This is intended to prevent breaking changes to implementors of ISchema if needing to add new
     * behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * SchemaBindOptions schemaBindOptions = SchemaBindOptions.builder().build();
     * ```
     */
    public inline fun schemaBindOptions(
        block: SchemaBindOptionsDsl.() -> Unit = {}
    ): SchemaBindOptions {
        val builder = SchemaBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Schema for a GraphQL Api.
     *
     * If no options are configured, schema will be generated code-first.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.route53.*;
     * // hosted zone and route53 features
     * String hostedZoneId;
     * String zoneName = "example.com";
     * String myDomainName = "api.example.com";
     * Certificate certificate = Certificate.Builder.create(this,
     * "cert").domainName(myDomainName).build();
     * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("myApi")
     * .definition(Definition.fromSchema(schema))
     * .domainName(DomainOptions.builder()
     * .certificate(certificate)
     * .domainName(myDomainName)
     * .build())
     * .build();
     * // hosted zone for adding appsync domain
     * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
     * HostedZoneAttributes.builder()
     * .hostedZoneId(hostedZoneId)
     * .zoneName(zoneName)
     * .build());
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * CnameRecord.Builder.create(this, "CnameApiRecord")
     * .recordName("api")
     * .zone(zone)
     * .domainName(api.getAppSyncDomainName())
     * .build();
     * ```
     */
    public inline fun schemaFile(block: SchemaFileDsl.() -> Unit = {}): SchemaFile {
        val builder = SchemaFileDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for configuring a schema from an existing file.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.services.route53.*;
     * // hosted zone and route53 features
     * String hostedZoneId;
     * String zoneName = "example.com";
     * String myDomainName = "api.example.com";
     * Certificate certificate = Certificate.Builder.create(this,
     * "cert").domainName(myDomainName).build();
     * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
     * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
     * .name("myApi")
     * .definition(Definition.fromSchema(schema))
     * .domainName(DomainOptions.builder()
     * .certificate(certificate)
     * .domainName(myDomainName)
     * .build())
     * .build();
     * // hosted zone for adding appsync domain
     * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
     * HostedZoneAttributes.builder()
     * .hostedZoneId(hostedZoneId)
     * .zoneName(zoneName)
     * .build());
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
     * CnameRecord.Builder.create(this, "CnameApiRecord")
     * .recordName("api")
     * .zone(zone)
     * .domainName(api.getAppSyncDomainName())
     * .build();
     * ```
     */
    public inline fun schemaProps(block: SchemaPropsDsl.() -> Unit = {}): SchemaProps {
        val builder = SchemaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration of source API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * SourceApi sourceApi = SourceApi.builder()
     * .sourceApi(graphqlApi)
     * // the properties below are optional
     * .description("description")
     * .mergeType(MergeType.MANUAL_MERGE)
     * .build();
     * ```
     */
    public inline fun sourceApi(block: SourceApiDsl.() -> Unit = {}): SourceApi {
        val builder = SourceApiDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AppSync SourceApiAssociation which associates an AppSync source API to an AppSync Merged API.
     *
     * The initial creation of the SourceApiAssociation merges the source API into the Merged API
     * schema.
     *
     * Example:
     * ```
     * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
     * .name("FirstSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
     * .build();
     * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
     * GraphqlApiAttributes.builder()
     * .graphqlApiId("MyApiId")
     * .graphqlApiArn("MyApiArn")
     * .build());
     * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
     * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
     * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
     * .sourceApi(sourceApi)
     * .mergedApi(importedMergedApi)
     * .mergeType(MergeType.MANUAL_MERGE)
     * .mergedApiExecutionRole(importedExecutionRole)
     * .build();
     * ```
     */
    public inline fun sourceApiAssociation(
        scope: Construct,
        id: String,
        block: SourceApiAssociationDsl.() -> Unit = {},
    ): SourceApiAssociation {
        val builder = SourceApiAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes for imported AppSync Source Api Association.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * GraphqlApi graphqlApi;
     * SourceApiAssociationAttributes sourceApiAssociationAttributes =
     * SourceApiAssociationAttributes.builder()
     * .associationArn("associationArn")
     * .mergedApi(graphqlApi)
     * .sourceApi(graphqlApi)
     * .build();
     * ```
     */
    public inline fun sourceApiAssociationAttributes(
        block: SourceApiAssociationAttributesDsl.() -> Unit = {}
    ): SourceApiAssociationAttributes {
        val builder = SourceApiAssociationAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for SourceApiAssociation which associates an AppSync Source API with an AppSync
     * Merged API.
     *
     * Example:
     * ```
     * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
     * .name("FirstSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
     * .build();
     * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
     * GraphqlApiAttributes.builder()
     * .graphqlApiId("MyApiId")
     * .graphqlApiArn("MyApiArn")
     * .build());
     * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
     * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
     * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
     * .sourceApi(sourceApi)
     * .mergedApi(importedMergedApi)
     * .mergeType(MergeType.MANUAL_MERGE)
     * .mergedApiExecutionRole(importedExecutionRole)
     * .build();
     * ```
     */
    public inline fun sourceApiAssociationProps(
        block: SourceApiAssociationPropsDsl.() -> Unit = {}
    ): SourceApiAssociationProps {
        val builder = SourceApiAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional API configuration for creating a AppSync Merged API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * // first source API
     * GraphqlApi firstApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
     * .name("FirstSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
     * .build();
     * // second source API
     * GraphqlApi secondApi = GraphqlApi.Builder.create(this, "SecondSourceAPI")
     * .name("SecondSourceAPI")
     * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-2.graphql")))
     * .build();
     * // Merged API
     * GraphqlApi mergedApi = GraphqlApi.Builder.create(this, "MergedAPI")
     * .name("MergedAPI")
     * .definition(Definition.fromSourceApis(SourceApiOptions.builder()
     * .sourceApis(List.of(SourceApi.builder()
     * .sourceApi(firstApi)
     * .mergeType(MergeType.MANUAL_MERGE)
     * .build(), SourceApi.builder()
     * .sourceApi(secondApi)
     * .mergeType(MergeType.AUTO_MERGE)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun sourceApiOptions(
        block: SourceApiOptionsDsl.() -> Unit = {}
    ): SourceApiOptions {
        val builder = SourceApiOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Cognito user-pools in AppSync.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.appsync.*;
     * import software.amazon.awscdk.services.cognito.*;
     * UserPool userPool;
     * UserPoolConfig userPoolConfig = UserPoolConfig.builder()
     * .userPool(userPool)
     * // the properties below are optional
     * .appIdClientRegex("appIdClientRegex")
     * .defaultAction(UserPoolDefaultAction.ALLOW)
     * .build();
     * ```
     */
    public inline fun userPoolConfig(block: UserPoolConfigDsl.() -> Unit = {}): UserPoolConfig {
        val builder = UserPoolConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
