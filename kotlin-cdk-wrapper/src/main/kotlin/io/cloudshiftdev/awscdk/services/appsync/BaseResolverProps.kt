@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface BaseResolverProps {
  public fun cachingConfig(): CachingConfig? =
      unwrap(this).getCachingConfig()?.let(CachingConfig::wrap)

  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  public fun fieldName(): String

  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public fun pipelineConfig(): List<IAppsyncFunction> =
      unwrap(this).getPipelineConfig()?.map(IAppsyncFunction::wrap) ?: emptyList()

  public fun requestMappingTemplate(): MappingTemplate? =
      unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

  public fun responseMappingTemplate(): MappingTemplate? =
      unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

  public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

  public fun typeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun cachingConfig(cachingConfig: CachingConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db954227238c09c9cb651f2002b8d16e0948625d5fdc363e4e9faca88a1364ae")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit)

    public fun code(code: Code)

    public fun fieldName(fieldName: String)

    public fun maxBatchSize(maxBatchSize: Number)

    public fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>)

    public fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction)

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    public fun runtime(runtime: FunctionRuntime)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.BaseResolverProps.Builder =
        software.amazon.awscdk.services.appsync.BaseResolverProps.builder()

    override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db954227238c09c9cb651f2002b8d16e0948625d5fdc363e4e9faca88a1364ae")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    override fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>) {
      cdkBuilder.pipelineConfig(pipelineConfig.map(IAppsyncFunction::unwrap))
    }

    override fun pipelineConfig(vararg pipelineConfig: IAppsyncFunction): Unit =
        pipelineConfig(pipelineConfig.toList())

    override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.BaseResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.BaseResolverProps,
  ) : CdkObject(cdkObject), BaseResolverProps {
    override fun cachingConfig(): CachingConfig? =
        unwrap(this).getCachingConfig()?.let(CachingConfig::wrap)

    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    override fun fieldName(): String = unwrap(this).getFieldName()

    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    override fun pipelineConfig(): List<IAppsyncFunction> =
        unwrap(this).getPipelineConfig()?.map(IAppsyncFunction::wrap) ?: emptyList()

    override fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    override fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

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
