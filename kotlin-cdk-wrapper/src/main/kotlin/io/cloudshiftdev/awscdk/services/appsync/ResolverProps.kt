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
 * Additional property for an AppSync resolver for GraphQL API reference.
 *
 * Example:
 *
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
public interface ResolverProps : ExtendedResolverProps {
  /**
   * The API this resolver is attached to.
   */
  public fun api(): IGraphqlApi

  /**
   * A builder for [ResolverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API this resolver is attached to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    public fun cachingConfig(cachingConfig: CachingConfig)

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bae2273d54d9b9c31bc2395aa316dbade663aa689f09fe994842636aacb2ba0a")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit)

    /**
     * @param code The function code.
     */
    public fun code(code: Code)

    /**
     * @param dataSource The data source this resolver is using.
     */
    public fun dataSource(dataSource: BaseDataSource)

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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ResolverProps.Builder =
        software.amazon.awscdk.services.appsync.ResolverProps.builder()

    /**
     * @param api The API this resolver is attached to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

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
    @JvmName("bae2273d54d9b9c31bc2395aa316dbade663aa689f09fe994842636aacb2ba0a")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    /**
     * @param code The function code.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    /**
     * @param dataSource The data source this resolver is using.
     */
    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
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

    public fun build(): software.amazon.awscdk.services.appsync.ResolverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ResolverProps,
  ) : CdkObject(cdkObject), ResolverProps {
    /**
     * The API this resolver is attached to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

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
     * The data source this resolver is using.
     *
     * Default: - No datasource
     */
    override fun dataSource(): BaseDataSource? =
        unwrap(this).getDataSource()?.let(BaseDataSource::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ResolverProps):
        ResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResolverProps):
        software.amazon.awscdk.services.appsync.ResolverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.ResolverProps
  }
}
