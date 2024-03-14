package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CustomResourceProviderOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  public fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

  public fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?: emptyList()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun memorySize(memorySize: Size) {
    }

    public fun policyStatements(policyStatements: List<Any>) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderOptions.Builder =
        software.amazon.awscdk.CustomResourceProviderOptions.builder()

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

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
      cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProviderOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CustomResourceProviderOptions,
  ) : CustomResourceProviderOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?:
        emptyMap()

    public override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    public override fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?:
        emptyList()

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderOptions):
        CustomResourceProviderOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderOptions):
        software.amazon.awscdk.CustomResourceProviderOptions = (wrapped as Wrapper).cdkObject
  }
}
