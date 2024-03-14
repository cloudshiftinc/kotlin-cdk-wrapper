package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface BaseAppsyncFunctionProps {
  public fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun requestMappingTemplate(): MappingTemplate? =
      unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

  public fun responseMappingTemplate(): MappingTemplate? =
      unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

  public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

  public interface Builder {
    public fun code(code: Code)

    public fun description(description: String)

    public fun name(name: String)

    public fun requestMappingTemplate(requestMappingTemplate: MappingTemplate)

    public fun responseMappingTemplate(responseMappingTemplate: MappingTemplate)

    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps.Builder
        = software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps.builder()

    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
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

    public fun build(): software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps,
  ) : BaseAppsyncFunctionProps {
    override fun code(): Code? = unwrap(this).getCode()?.let(Code::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun requestMappingTemplate(): MappingTemplate? =
        unwrap(this).getRequestMappingTemplate()?.let(MappingTemplate::wrap)

    override fun responseMappingTemplate(): MappingTemplate? =
        unwrap(this).getResponseMappingTemplate()?.let(MappingTemplate::wrap)

    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseAppsyncFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps):
        BaseAppsyncFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseAppsyncFunctionProps):
        software.amazon.awscdk.services.appsync.BaseAppsyncFunctionProps = (wrapped as
        Wrapper).cdkObject
  }
}
