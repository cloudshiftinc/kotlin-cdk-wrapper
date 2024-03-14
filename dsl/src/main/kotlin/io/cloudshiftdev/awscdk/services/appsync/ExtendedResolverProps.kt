package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ExtendedResolverProps : BaseResolverProps {
  public fun dataSource(): BaseDataSource? = unwrap(this).getDataSource()?.let(BaseDataSource::wrap)

  public interface Builder {
    public fun cachingConfig(cachingConfig: CachingConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab459960804e29b35785831599b56d0abdb3f86ec13a36d07bdbf077cee73674")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit) {
    }

    public fun code(code: Code) {
    }

    public fun dataSource(dataSource: BaseDataSource) {
    }

    public fun fieldName(fieldName: String) {
    }

    public fun maxBatchSize(maxBatchSize: Number) {
    }

    public fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>) {
    }

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
    }

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
    }

    public fun runtime(runtime: FunctionRuntime) {
    }

    public fun typeName(typeName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ExtendedResolverProps.Builder =
        software.amazon.awscdk.services.appsync.ExtendedResolverProps.builder()

    public override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab459960804e29b35785831599b56d0abdb3f86ec13a36d07bdbf077cee73674")
    public override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    public override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    public override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
    }

    public override fun fieldName(fieldName: String) {
      cdkBuilder.fieldName(fieldName)
    }

    public override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public override fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>) {
      cdkBuilder.pipelineConfig(pipelineConfig.map(IAppsyncFunction::unwrap))
    }

    public override fun requestMappingTemplate(requestMappingTemplate: MappingTemplate) {
      cdkBuilder.requestMappingTemplate(requestMappingTemplate.let(MappingTemplate::unwrap))
    }

    public override fun responseMappingTemplate(responseMappingTemplate: MappingTemplate) {
      cdkBuilder.responseMappingTemplate(responseMappingTemplate.let(MappingTemplate::unwrap))
    }

    public override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.ExtendedResolverProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.ExtendedResolverProps,
  ) : ExtendedResolverProps {
    public override fun cachingConfig(): CachingConfig? =
        unwrap(this).getCachingConfig()?.let(CachingConfig::wrap)

    public override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    public override fun dataSource(): BaseDataSource? =
        unwrap(this).getDataSource()?.let(BaseDataSource::wrap)

    public override fun fieldName(): String = unwrap(this).getFieldName()

    public override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    public override fun pipelineConfig(): List<IAppsyncFunction> =
        unwrap(this).getPipelineConfig()?.map(IAppsyncFunction::wrap) ?: emptyList()

    public override fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    public override fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    public override fun runtime(): FunctionRuntime? =
        unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

    public override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedResolverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ExtendedResolverProps):
        ExtendedResolverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExtendedResolverProps):
        software.amazon.awscdk.services.appsync.ExtendedResolverProps = (wrapped as
        Wrapper).cdkObject
  }
}
