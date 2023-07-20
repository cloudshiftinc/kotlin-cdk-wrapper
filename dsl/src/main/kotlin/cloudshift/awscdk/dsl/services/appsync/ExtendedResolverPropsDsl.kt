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

@CdkDslMarker
public class ExtendedResolverPropsDsl {
  private val cdkBuilder: ExtendedResolverProps.Builder = ExtendedResolverProps.builder()

  private val _pipelineConfig: MutableList<IAppsyncFunction> = mutableListOf()

  public fun cachingConfig(block: CachingConfigDsl.() -> Unit = {}) {
    val builder = CachingConfigDsl()
    builder.apply(block)
    cdkBuilder.cachingConfig(builder.build())
  }

  public fun cachingConfig(cachingConfig: CachingConfig) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  public fun code(code: Code) {
    cdkBuilder.code(code)
  }

  public fun dataSource(dataSource: BaseDataSource) {
    cdkBuilder.dataSource(dataSource)
  }

  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction) {
    _pipelineConfig.addAll(listOf(*pipelineConfig))
  }

  public fun pipelineConfig(pipelineConfig: Collection<IAppsyncFunction>) {
    _pipelineConfig.addAll(pipelineConfig)
  }

  public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  public fun runtime(runtime: FunctionRuntime) {
    cdkBuilder.runtime(runtime)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): ExtendedResolverProps {
    if(_pipelineConfig.isNotEmpty()) cdkBuilder.pipelineConfig(_pipelineConfig)
    return cdkBuilder.build()
  }
}
