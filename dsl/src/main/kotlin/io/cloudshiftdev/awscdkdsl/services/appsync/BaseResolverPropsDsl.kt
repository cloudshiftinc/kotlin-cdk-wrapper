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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.BaseResolverProps
import software.amazon.awscdk.services.appsync.CachingConfig
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IAppsyncFunction
import software.amazon.awscdk.services.appsync.MappingTemplate

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
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
@CdkDslMarker
public class BaseResolverPropsDsl {
    private val cdkBuilder: BaseResolverProps.Builder = BaseResolverProps.builder()

    private val _pipelineConfig: MutableList<IAppsyncFunction> = mutableListOf()

    /** @param cachingConfig The caching configuration for this resolver. */
    public fun cachingConfig(cachingConfig: CachingConfigDsl.() -> Unit = {}) {
        val builder = CachingConfigDsl()
        builder.apply(cachingConfig)
        cdkBuilder.cachingConfig(builder.build())
    }

    /** @param cachingConfig The caching configuration for this resolver. */
    public fun cachingConfig(cachingConfig: CachingConfig) {
        cdkBuilder.cachingConfig(cachingConfig)
    }

    /** @param code The function code. */
    public fun code(code: Code) {
        cdkBuilder.code(code)
    }

    /**
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to.
     */
    public fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
    }

    /** @param maxBatchSize The maximum number of elements per batch, when using batch invoke. */
    public fun maxBatchSize(maxBatchSize: Number) {
        cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /** @param pipelineConfig configuration of the pipeline resolver. */
    public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction) {
        _pipelineConfig.addAll(listOf(*pipelineConfig))
    }

    /** @param pipelineConfig configuration of the pipeline resolver. */
    public fun pipelineConfig(pipelineConfig: Collection<IAppsyncFunction>) {
        _pipelineConfig.addAll(pipelineConfig)
    }

    /** @param requestMappingTemplate The request mapping template for this resolver. */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
        cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    /** @param responseMappingTemplate The response mapping template for this resolver. */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
        cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    /** @param runtime The functions runtime. */
    public fun runtime(runtime: FunctionRuntime) {
        cdkBuilder.runtime(runtime)
    }

    /** @param typeName name of the GraphQL type this resolver is attached to. */
    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): BaseResolverProps {
        if (_pipelineConfig.isNotEmpty()) cdkBuilder.pipelineConfig(_pipelineConfig)
        return cdkBuilder.build()
    }
}
