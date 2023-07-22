@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.BaseDataSource
import software.amazon.awscdk.services.appsync.CachingConfig
import software.amazon.awscdk.services.appsync.Code
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IAppsyncFunction
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MappingTemplate
import software.amazon.awscdk.services.appsync.Resolver
import software.constructs.Construct

/**
 * An AppSync resolver.
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
@CdkDslMarker
public class ResolverDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Resolver.Builder = Resolver.Builder.create(scope, id)

  private val _pipelineConfig: MutableList<IAppsyncFunction> = mutableListOf()

  /**
   * The API this resolver is attached to.
   *
   * @param api The API this resolver is attached to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * The caching configuration for this resolver.
   *
   * Default: - No caching configuration
   *
   * @param cachingConfig The caching configuration for this resolver. 
   */
  public fun cachingConfig(cachingConfig: CachingConfigDsl.() -> Unit = {}) {
    val builder = CachingConfigDsl()
    builder.apply(cachingConfig)
    cdkBuilder.cachingConfig(builder.build())
  }

  /**
   * The caching configuration for this resolver.
   *
   * Default: - No caching configuration
   *
   * @param cachingConfig The caching configuration for this resolver. 
   */
  public fun cachingConfig(cachingConfig: CachingConfig) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  /**
   * The function code.
   *
   * Default: - no code is used
   *
   * @param code The function code. 
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * The data source this resolver is using.
   *
   * Default: - No datasource
   *
   * @param dataSource The data source this resolver is using. 
   */
  public fun dataSource(dataSource: BaseDataSource) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * name of the GraphQL field in the given type this resolver is attached to.
   *
   * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
   */
  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  /**
   * The maximum number of elements per batch, when using batch invoke.
   *
   * Default: - No max batch size
   *
   * @param maxBatchSize The maximum number of elements per batch, when using batch invoke. 
   */
  public fun maxBatchSize(maxBatchSize: Number) {
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
  public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction) {
    _pipelineConfig.addAll(listOf(*pipelineConfig))
  }

  /**
   * configuration of the pipeline resolver.
   *
   * Default: - no pipeline resolver configuration
   * An empty array | undefined sets resolver to be of kind, unit
   *
   * @param pipelineConfig configuration of the pipeline resolver. 
   */
  public fun pipelineConfig(pipelineConfig: Collection<IAppsyncFunction>) {
    _pipelineConfig.addAll(pipelineConfig)
  }

  /**
   * The request mapping template for this resolver.
   *
   * Default: - No mapping template
   *
   * @param requestMappingTemplate The request mapping template for this resolver. 
   */
  public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * The response mapping template for this resolver.
   *
   * Default: - No mapping template
   *
   * @param responseMappingTemplate The response mapping template for this resolver. 
   */
  public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  /**
   * The functions runtime.
   *
   * Default: - no function runtime, VTL mapping templates used
   *
   * @param runtime The functions runtime. 
   */
  public fun runtime(runtime: FunctionRuntime) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * name of the GraphQL type this resolver is attached to.
   *
   * @param typeName name of the GraphQL type this resolver is attached to. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): Resolver {
    if(_pipelineConfig.isNotEmpty()) cdkBuilder.pipelineConfig(_pipelineConfig)
    return cdkBuilder.build()
  }
}
