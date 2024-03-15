@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Basic properties for an AppSync resolver.
 *
 * Example:
 *
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
public interface BaseResolverProps {
  /**
   * The caching configuration for this resolver.
   *
   * Default: - No caching configuration
   */
  public fun cachingConfig(): CachingConfig? =
      unwrap(this).getCachingConfig()?.let(CachingConfig::wrap)

  /**
   * The function code.
   *
   * Default: - no code is used
   */
  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  /**
   * name of the GraphQL field in the given type this resolver is attached to.
   */
  public fun fieldName(): String

  /**
   * The maximum number of elements per batch, when using batch invoke.
   *
   * Default: - No max batch size
   */
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * configuration of the pipeline resolver.
   *
   * Default: - no pipeline resolver configuration
   * An empty array | undefined sets resolver to be of kind, unit
   */
  public fun pipelineConfig(): List<IAppsyncFunction> =
      unwrap(this).getPipelineConfig()?.map(IAppsyncFunction::wrap) ?: emptyList()

  /**
   * The request mapping template for this resolver.
   *
   * Default: - No mapping template
   */
  public fun requestMappingTemplate(): MappingTemplate? =
      unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

  /**
   * The response mapping template for this resolver.
   *
   * Default: - No mapping template
   */
  public fun responseMappingTemplate(): MappingTemplate? =
      unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

  /**
   * The functions runtime.
   *
   * Default: - no function runtime, VTL mapping templates used
   */
  public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

  /**
   * name of the GraphQL type this resolver is attached to.
   */
  public fun typeName(): String

  /**
   * A builder for [BaseResolverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    public fun cachingConfig(cachingConfig: CachingConfig)

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db954227238c09c9cb651f2002b8d16e0948625d5fdc363e4e9faca88a1364ae")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit)

    /**
     * @param code The function code.
     */
    public fun code(code: Code)

    /**
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
     */
    public fun fieldName(fieldName: String)

    /**
     * @param maxBatchSize The maximum number of elements per batch, when using batch invoke.
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * @param pipelineConfig configuration of the pipeline resolver.
     */
    public fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>)

    /**
     * @param pipelineConfig configuration of the pipeline resolver.
     */
    public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction)

    /**
     * @param requestMappingTemplate The request mapping template for this resolver.
     */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    /**
     * @param responseMappingTemplate The response mapping template for this resolver.
     */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    /**
     * @param runtime The functions runtime.
     */
    public fun runtime(runtime: FunctionRuntime)

    /**
     * @param typeName name of the GraphQL type this resolver is attached to. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.BaseResolverProps.Builder =
        software.amazon.awscdk.services.appsync.BaseResolverProps.builder()

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig::unwrap))
    }

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db954227238c09c9cb651f2002b8d16e0948625d5fdc363e4e9faca88a1364ae")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    /**
     * @param code The function code.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
     */
    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    /**
     * @param maxBatchSize The maximum number of elements per batch, when using batch invoke.
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param pipelineConfig configuration of the pipeline resolver.
     */
    override fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>) {
      cdkBuilder.pipelineConfig(pipelineConfig.map(IAppsyncFunction::unwrap))
    }

    /**
     * @param pipelineConfig configuration of the pipeline resolver.
     */
    override fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction): Unit =
        pipelineConfig(pipelineConfig.toList())

    /**
     * @param requestMappingTemplate The request mapping template for this resolver.
     */
    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * @param responseMappingTemplate The response mapping template for this resolver.
     */
    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * @param runtime The functions runtime.
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    /**
     * @param typeName name of the GraphQL type this resolver is attached to. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.BaseResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.BaseResolverProps,
  ) : CdkObject(cdkObject), BaseResolverProps {
    /**
     * The caching configuration for this resolver.
     *
     * Default: - No caching configuration
     */
    override fun cachingConfig(): CachingConfig? =
        unwrap(this).getCachingConfig()?.let(CachingConfig::wrap)

    /**
     * The function code.
     *
     * Default: - no code is used
     */
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    /**
     * name of the GraphQL field in the given type this resolver is attached to.
     */
    override fun fieldName(): String = unwrap(this).getFieldName()

    /**
     * The maximum number of elements per batch, when using batch invoke.
     *
     * Default: - No max batch size
     */
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    /**
     * configuration of the pipeline resolver.
     *
     * Default: - no pipeline resolver configuration
     * An empty array | undefined sets resolver to be of kind, unit
     */
    override fun pipelineConfig(): List<IAppsyncFunction> =
        unwrap(this).getPipelineConfig()?.map(IAppsyncFunction::wrap) ?: emptyList()

    /**
     * The request mapping template for this resolver.
     *
     * Default: - No mapping template
     */
    override fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * The response mapping template for this resolver.
     *
     * Default: - No mapping template
     */
    override fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     */
    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

    /**
     * name of the GraphQL type this resolver is attached to.
     */
    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseResolverProps):
        BaseResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseResolverProps):
        software.amazon.awscdk.services.appsync.BaseResolverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.BaseResolverProps
  }
}
