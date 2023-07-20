@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnResolver
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolver.Builder = CfnResolver.Builder.create(scope, id)

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun cachingConfig(cachingConfig: IResolvable) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty) {
    cdkBuilder.cachingConfig(cachingConfig)
  }

  public fun code(code: String) {
    cdkBuilder.code(code)
  }

  public fun codeS3Location(codeS3Location: String) {
    cdkBuilder.codeS3Location(codeS3Location)
  }

  public fun dataSourceName(dataSourceName: String) {
    cdkBuilder.dataSourceName(dataSourceName)
  }

  public fun fieldName(fieldName: String) {
    cdkBuilder.fieldName(fieldName)
  }

  public fun kind(kind: String) {
    cdkBuilder.kind(kind)
  }

  public fun maxBatchSize(maxBatchSize: Number) {
    cdkBuilder.maxBatchSize(maxBatchSize)
  }

  public fun pipelineConfig(pipelineConfig: IResolvable) {
    cdkBuilder.pipelineConfig(pipelineConfig)
  }

  public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty) {
    cdkBuilder.pipelineConfig(pipelineConfig)
  }

  public fun requestMappingTemplate(requestMappingTemplate: String) {
    cdkBuilder.requestMappingTemplate(requestMappingTemplate)
  }

  public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
    cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
  }

  public fun responseMappingTemplate(responseMappingTemplate: String) {
    cdkBuilder.responseMappingTemplate(responseMappingTemplate)
  }

  public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
    cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
  }

  public fun runtime(runtime: IResolvable) {
    cdkBuilder.runtime(runtime)
  }

  public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty) {
    cdkBuilder.runtime(runtime)
  }

  public fun syncConfig(syncConfig: IResolvable) {
    cdkBuilder.syncConfig(syncConfig)
  }

  public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty) {
    cdkBuilder.syncConfig(syncConfig)
  }

  public fun typeName(typeName: String) {
    cdkBuilder.typeName(typeName)
  }

  public fun build(): CfnResolver = cdkBuilder.build()
}
