package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Resolver internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.Resolver,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun arn(): String = unwrap(this).getArn()

  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun cachingConfig(cachingConfig: CachingConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51f4392e584a1d17065b5b3621ce2b3e99c2bea2ef09929722839c455de638c6")
    public fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit)

    public fun code(code: Code)

    public fun dataSource(dataSource: BaseDataSource)

    public fun fieldName(fieldName: String)

    public fun maxBatchSize(maxBatchSize: Number)

    public fun pipelineConfig(pipelineConfig: List<IAppsyncFunction>)

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    public fun runtime(runtime: FunctionRuntime)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.Resolver.Builder =
        software.amazon.awscdk.services.appsync.Resolver.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun cachingConfig(cachingConfig: CachingConfig) {
      cdkBuilder.cachingConfig(cachingConfig.let(CachingConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51f4392e584a1d17065b5b3621ce2b3e99c2bea2ef09929722839c455de638c6")
    override fun cachingConfig(cachingConfig: CachingConfig.Builder.() -> Unit): Unit =
        cachingConfig(CachingConfig(cachingConfig))

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun dataSource(dataSource: BaseDataSource) {
      cdkBuilder.dataSource(dataSource.let(BaseDataSource::unwrap))
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

    public fun build(): software.amazon.awscdk.services.appsync.Resolver = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
