@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Additional property for an AppSync resolver for data source reference.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.appsync.*;
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
public interface ExtendedResolverProps : BaseResolverProps {
  /**
   * The data source this resolver is using.
   *
   * Default: - No datasource
   */
  public fun dataSource(): BaseDataSource? = unwrap(this).getDataSource()?.let(BaseDataSource::wrap)

  /**
   * A builder for [ExtendedResolverProps]
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
    @JvmName("ab459960804e29b35785831599b56d0abdb3f86ec13a36d07bdbf077cee73674")
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ExtendedResolverProps.Builder =
        software.amazon.awscdk.services.appsync.ExtendedResolverProps.builder()

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig.Companion::unwrap))
    }

    /**
     * @param cachingConfig The caching configuration for this resolver.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab459960804e29b35785831599b56d0abdb3f86ec13a36d07bdbf077cee73674")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    /**
     * @param code The function code.
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code.Companion::unwrap))
    }

    /**
     * @param dataSource The data source this resolver is using.
     */
    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource.Companion::unwrap))
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
      cdkBuilder.pipelineConfig(pipelineConfig.map(IAppsyncFunction.Companion::unwrap))
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
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate.Companion::unwrap))
    }

    /**
     * @param responseMappingTemplate The response mapping template for this resolver.
     */
    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate.Companion::unwrap))
    }

    /**
     * @param runtime The functions runtime.
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime.Companion::unwrap))
    }

    /**
     * @param typeName name of the GraphQL type this resolver is attached to. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.ExtendedResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.ExtendedResolverProps,
  ) : CdkObject(cdkObject),
      ExtendedResolverProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ExtendedResolverProps):
        ExtendedResolverProps = CdkObjectWrappers.wrap(cdkObject) as? ExtendedResolverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtendedResolverProps):
        software.amazon.awscdk.services.appsync.ExtendedResolverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ExtendedResolverProps
  }
}
