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
import software.amazon.awscdk.services.appsync.ExtendedResolverProps
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.IAppsyncFunction
import software.amazon.awscdk.services.appsync.MappingTemplate

/**
 * Additional property for an AppSync resolver for data source reference.
 *
 * Example:
 *
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
@CdkDslMarker
public class ExtendedResolverPropsDsl {
  private val cdkBuilder: ExtendedResolverProps.Builder = ExtendedResolverProps.builder()

  private val _pipelineConfig: MutableList<IAppsyncFunction> = mutableListOf()

  /**
   * @param cachingConfig The caching configuration for this resolver.
   */
  public fun cachingConfig(cachingConfig: CachingConfigDsl.() -> Unit = {}) {
    val builder = CachingConfigDsl()
    builder.apply(cachingConfig)
    cdkBuilder.cachingConfig(builder.build())
  }

  /**
   * @param cachingConfig The caching configuration for this resolver.
   */
  public fun cachingConfig(cachingConfig: CachingConfig) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  /**
   * @param code The function code.
   */
  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  /**
   * @param dataSource The data source this resolver is using.
   */
  public fun dataSource(dataSource: BaseDataSource) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * @param fieldName name of the GraphQL field in the given type this resolver is attached to. 
   */
  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  /**
   * @param maxBatchSize The maximum number of elements per batch, when using batch invoke.
   */
  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  /**
   * @param pipelineConfig configuration of the pipeline resolver.
   */
  public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction) {
    _pipelineConfig.addAll(listOf(*pipelineConfig))
  }

  /**
   * @param pipelineConfig configuration of the pipeline resolver.
   */
  public fun pipelineConfig(pipelineConfig: Collection<IAppsyncFunction>) {
    _pipelineConfig.addAll(pipelineConfig)
  }

  /**
   * @param requestMappingTemplate The request mapping template for this resolver.
   */
  public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  /**
   * @param responseMappingTemplate The response mapping template for this resolver.
   */
  public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  /**
   * @param runtime The functions runtime.
   */
  public fun runtime(runtime: FunctionRuntime) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param typeName name of the GraphQL type this resolver is attached to. 
   */
  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): ExtendedResolverProps {
    if(_pipelineConfig.isNotEmpty()) cdkBuilder.pipelineConfig(_pipelineConfig)
    return cdkBuilder.build()
  }
}
