@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnResolverProps {
  public fun apiId(): String

  public fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

  public fun code(): String? = unwrap(this).getCode()

  public fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

  public fun dataSourceName(): String? = unwrap(this).getDataSourceName()

  public fun fieldName(): String

  public fun kind(): String? = unwrap(this).getKind()

  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

  public fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

  public fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

  public fun requestMappingTemplateS3Location(): String? =
      unwrap(this).getRequestMappingTemplateS3Location()

  public fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

  public fun responseMappingTemplateS3Location(): String? =
      unwrap(this).getResponseMappingTemplateS3Location()

  public fun runtime(): Any? = unwrap(this).getRuntime()

  public fun syncConfig(): Any? = unwrap(this).getSyncConfig()

  public fun typeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun cachingConfig(cachingConfig: IResolvable)

    public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0676a7dc9fa8f823d88395e2ff860c8ef071e1855b4488382627a75a5407e7e")
    public fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty.Builder.() -> Unit)

    public fun code(code: String)

    public fun codeS3Location(codeS3Location: String)

    public fun dataSourceName(dataSourceName: String)

    public fun fieldName(fieldName: String)

    public fun kind(kind: String)

    public fun maxBatchSize(maxBatchSize: Number)

    public fun metricsConfig(metricsConfig: String)

    public fun pipelineConfig(pipelineConfig: IResolvable)

    public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80649d996e1c238fedf75538fab2e9f4753896a0cbce1d17dc0a722714024a59")
    public fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty.Builder.() -> Unit)

    public fun requestMappingTemplate(requestMappingTemplate: String)

    public fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String)

    public fun responseMappingTemplate(responseMappingTemplate: String)

    public fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String)

    public fun runtime(runtime: IResolvable)

    public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703be5706db583e1e4afb3749a830762a76afe65264badde72f624f80502aa69")
    public fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty.Builder.() -> Unit)

    public fun syncConfig(syncConfig: IResolvable)

    public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7631604228cbcf30cb0959811b602076db233928c5f40ac3ce38c2e282f5dcda")
    public fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty.Builder.() -> Unit)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnResolverProps.Builder =
        software.amazon.awscdk.services.appsync.CfnResolverProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun cachingConfig(cachingConfig: IResolvable) {
      cdkBuilder.cachingConfig(cachingConfig.let(IResolvable::unwrap))
    }

    override fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty) {
      cdkBuilder.cachingConfig(cachingConfig.let(CfnResolver.CachingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0676a7dc9fa8f823d88395e2ff860c8ef071e1855b4488382627a75a5407e7e")
    override fun cachingConfig(cachingConfig: CfnResolver.CachingConfigProperty.Builder.() -> Unit):
        Unit = cachingConfig(CfnResolver.CachingConfigProperty(cachingConfig))

    override fun code(code: String) {
      cdkBuilder.code(code)
    }

    override fun codeS3Location(codeS3Location: String) {
      cdkBuilder.codeS3Location(codeS3Location)
    }

    override fun dataSourceName(dataSourceName: String) {
      cdkBuilder.dataSourceName(dataSourceName)
    }

    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    override fun kind(kind: String) {
      cdkBuilder.kind(kind)
    }

    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    override fun metricsConfig(metricsConfig: String) {
      cdkBuilder.metricsConfig(metricsConfig)
    }

    override fun pipelineConfig(pipelineConfig: IResolvable) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(IResolvable::unwrap))
    }

    override fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty) {
      cdkBuilder.pipelineConfig(pipelineConfig.let(CfnResolver.PipelineConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80649d996e1c238fedf75538fab2e9f4753896a0cbce1d17dc0a722714024a59")
    override
        fun pipelineConfig(pipelineConfig: CfnResolver.PipelineConfigProperty.Builder.() -> Unit):
        Unit = pipelineConfig(CfnResolver.PipelineConfigProperty(pipelineConfig))

    override fun requestMappingTemplate(requestMappingTemplate: String) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate)
    }

    override fun requestMappingTemplateS3Location(requestMappingTemplateS3Location: String) {
      cdkBuilder.requestMappingTemplateS3Location(requestMappingTemplateS3Location)
    }

    override fun responseMappingTemplate(responseMappingTemplate: String) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate)
    }

    override fun responseMappingTemplateS3Location(responseMappingTemplateS3Location: String) {
      cdkBuilder.responseMappingTemplateS3Location(responseMappingTemplateS3Location)
    }

    override fun runtime(runtime: IResolvable) {
      cdkBuilder.runtime(runtime.let(IResolvable::unwrap))
    }

    override fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty) {
      cdkBuilder.runtime(runtime.let(CfnResolver.AppSyncRuntimeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703be5706db583e1e4afb3749a830762a76afe65264badde72f624f80502aa69")
    override fun runtime(runtime: CfnResolver.AppSyncRuntimeProperty.Builder.() -> Unit): Unit =
        runtime(CfnResolver.AppSyncRuntimeProperty(runtime))

    override fun syncConfig(syncConfig: IResolvable) {
      cdkBuilder.syncConfig(syncConfig.let(IResolvable::unwrap))
    }

    override fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty) {
      cdkBuilder.syncConfig(syncConfig.let(CfnResolver.SyncConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7631604228cbcf30cb0959811b602076db233928c5f40ac3ce38c2e282f5dcda")
    override fun syncConfig(syncConfig: CfnResolver.SyncConfigProperty.Builder.() -> Unit): Unit =
        syncConfig(CfnResolver.SyncConfigProperty(syncConfig))

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnResolverProps,
  ) : CdkObject(cdkObject), CfnResolverProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun cachingConfig(): Any? = unwrap(this).getCachingConfig()

    override fun code(): String? = unwrap(this).getCode()

    override fun codeS3Location(): String? = unwrap(this).getCodeS3Location()

    override fun dataSourceName(): String? = unwrap(this).getDataSourceName()

    override fun fieldName(): String = unwrap(this).getFieldName()

    override fun kind(): String? = unwrap(this).getKind()

    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    override fun metricsConfig(): String? = unwrap(this).getMetricsConfig()

    override fun pipelineConfig(): Any? = unwrap(this).getPipelineConfig()

    override fun requestMappingTemplate(): String? = unwrap(this).getRequestMappingTemplate()

    override fun requestMappingTemplateS3Location(): String? =
        unwrap(this).getRequestMappingTemplateS3Location()

    override fun responseMappingTemplate(): String? = unwrap(this).getResponseMappingTemplate()

    override fun responseMappingTemplateS3Location(): String? =
        unwrap(this).getResponseMappingTemplateS3Location()

    override fun runtime(): Any? = unwrap(this).getRuntime()

    override fun syncConfig(): Any? = unwrap(this).getSyncConfig()

    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnResolverProps):
        CfnResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverProps):
        software.amazon.awscdk.services.appsync.CfnResolverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.CfnResolverProps
  }
}
