package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CustomResourceProviderProps : CustomResourceProviderOptions {
  public fun codeDirectory(): String

  public fun runtime(): CustomResourceProviderRuntime

  public interface Builder {
    public fun codeDirectory(codeDirectory: String) {
    }

    public fun description(description: String) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun memorySize(memorySize: Size) {
    }

    public fun policyStatements(policyStatements: List<Any>) {
    }

    public fun runtime(runtime: CustomResourceProviderRuntime) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderProps.Builder =
        software.amazon.awscdk.CustomResourceProviderProps.builder()

    public override fun codeDirectory(codeDirectory: String) {
      cdkBuilder.codeDirectory(codeDirectory)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun memorySize(memorySize: Size) {
      cdkBuilder.memorySize(memorySize.let(Size::unwrap))
    }

    public override fun policyStatements(policyStatements: List<Any>) {
      cdkBuilder.policyStatements(policyStatements)
    }

    public override fun runtime(runtime: CustomResourceProviderRuntime) {
      cdkBuilder.runtime(runtime.let(CustomResourceProviderRuntime::unwrap))
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
      cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProviderProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CustomResourceProviderProps,
  ) : CustomResourceProviderProps {
    public override fun codeDirectory(): String = unwrap(this).getCodeDirectory()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
        emptyMap()

    public override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    public override fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?:
        emptyList()

    public override fun runtime(): CustomResourceProviderRuntime =
        unwrap(this).getRuntime().let(CustomResourceProviderRuntime::wrap)

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderProps):
        CustomResourceProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderProps):
        software.amazon.awscdk.CustomResourceProviderProps = (wrapped as Wrapper).cdkObject
  }
}
