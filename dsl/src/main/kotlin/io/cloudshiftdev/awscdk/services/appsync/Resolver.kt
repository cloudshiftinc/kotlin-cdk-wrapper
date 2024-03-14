package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Resolver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.Resolver,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * the ARN of the resolver.
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.Resolver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API this resolver is attached to.
     *
     * @param api The API this resolver is attached to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * The caching configuration for this resolver.
     *
     * Default: - No caching configuration
     *
     * @param cachingConfig The caching configuration for this resolver. 
     */
    public fun cachingConfig(cachingConfig: CachingConfig)

    /**
     * The caching configuration for this resolver.
     *
     * Default: - No caching configuration
     *
     * @param cachingConfig The caching configuration for this resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51f4392e584a1d17065b5b3621ce2b3e99c2bea2ef09929722839c455de638c6")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit)

    /**
     * The function code.
     *
     * Default: - no code is used
     *
     * @param code The function code. 
     */
    public fun code(code: Code)

    /**
     * The data source this resolver is using.
     *
     * Default: - No datasource
     *
     * @param dataSource The data source this resolver is using. 
     */
    public fun dataSource(dataSource: BaseDataSource)

    /**
     * name of the GraphQL field in the given type this resolver is attached to.
     *
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
     */
    public fun fieldName(fieldName: String)

    /**
     * The maximum number of elements per batch, when using batch invoke.
     *
     * Default: - No max batch size
     *
     * @param maxBatchSize The maximum number of elements per batch, when using batch invoke. 
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * configuration of the pipeline resolver.
     *
     * Default: - no pipeline resolver configuration
     * An empty array | undefined sets resolver to be of kind, unit
     *
     * @param pipelineConfig configuration of the pipeline resolver. 
     */
    public fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>)

    /**
     * configuration of the pipeline resolver.
     *
     * Default: - no pipeline resolver configuration
     * An empty array | undefined sets resolver to be of kind, unit
     *
     * @param pipelineConfig configuration of the pipeline resolver. 
     */
    public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction)

    /**
     * The request mapping template for this resolver.
     *
     * Default: - No mapping template
     *
     * @param requestMappingTemplate The request mapping template for this resolver. 
     */
    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    /**
     * The response mapping template for this resolver.
     *
     * Default: - No mapping template
     *
     * @param responseMappingTemplate The response mapping template for this resolver. 
     */
    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     *
     * @param runtime The functions runtime. 
     */
    public fun runtime(runtime: FunctionRuntime)

    /**
     * name of the GraphQL type this resolver is attached to.
     *
     * @param typeName name of the GraphQL type this resolver is attached to. 
     */
    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.Resolver.Builder =
        software.amazon.awscdk.services.appsync.Resolver.Builder.create(scope, id)

    /**
     * The API this resolver is attached to.
     *
     * @param api The API this resolver is attached to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * The caching configuration for this resolver.
     *
     * Default: - No caching configuration
     *
     * @param cachingConfig The caching configuration for this resolver. 
     */
    override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig::unwrap))
    }

    /**
     * The caching configuration for this resolver.
     *
     * Default: - No caching configuration
     *
     * @param cachingConfig The caching configuration for this resolver. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51f4392e584a1d17065b5b3621ce2b3e99c2bea2ef09929722839c455de638c6")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    /**
     * The function code.
     *
     * Default: - no code is used
     *
     * @param code The function code. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * The data source this resolver is using.
     *
     * Default: - No datasource
     *
     * @param dataSource The data source this resolver is using. 
     */
    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
    }

    /**
     * name of the GraphQL field in the given type this resolver is attached to.
     *
     * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
     */
    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    /**
     * The maximum number of elements per batch, when using batch invoke.
     *
     * Default: - No max batch size
     *
     * @param maxBatchSize The maximum number of elements per batch, when using batch invoke. 
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * configuration of the pipeline resolver.
     *
     * Default: - no pipeline resolver configuration
     * An empty array | undefined sets resolver to be of kind, unit
     *
     * @param pipelineConfig configuration of the pipeline resolver. 
     */
    override fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>) {
      cdkBuilder.pipelineConfig(pipelineConfig.map(IAppsyncFunction::unwrap))
    }

    /**
     * configuration of the pipeline resolver.
     *
     * Default: - no pipeline resolver configuration
     * An empty array | undefined sets resolver to be of kind, unit
     *
     * @param pipelineConfig configuration of the pipeline resolver. 
     */
    override fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction): Unit =
        pipelineConfig(pipelineConfig.toList())

    /**
     * The request mapping template for this resolver.
     *
     * Default: - No mapping template
     *
     * @param requestMappingTemplate The request mapping template for this resolver. 
     */
    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * The response mapping template for this resolver.
     *
     * Default: - No mapping template
     *
     * @param responseMappingTemplate The response mapping template for this resolver. 
     */
    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    /**
     * The functions runtime.
     *
     * Default: - no function runtime, VTL mapping templates used
     *
     * @param runtime The functions runtime. 
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    /**
     * name of the GraphQL type this resolver is attached to.
     *
     * @param typeName name of the GraphQL type this resolver is attached to. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.Resolver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Resolver {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Resolver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.Resolver): Resolver =
        Resolver(cdkObject)

    internal fun unwrap(wrapped: Resolver): software.amazon.awscdk.services.appsync.Resolver =
        wrapped.cdkObject
  }
}
