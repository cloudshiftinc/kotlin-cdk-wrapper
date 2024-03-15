@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun environment(environment: Map<String, String>)

    public fun memorySize(memorySize: Size)

    public fun policyStatements(policyStatements: List<Any>)

    public fun policyStatements(vararg policyStatements: Any)

    public fun timeout(timeout: Duration)

    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderOptions.Builder =
        software.amazon.awscdk.CustomResourceProviderOptions.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun memorySize(memorySize: Size) {
      cdkBuilder.memorySize(memorySize.let(Size::unwrap))
    }

    override fun policyStatements(policyStatements: List<Any>) {
      cdkBuilder.policyStatements(policyStatements)
    }

    override fun policyStatements(vararg policyStatements: Any): Unit =
        policyStatements(policyStatements.toList())

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
      cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProviderOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CustomResourceProviderOptions,
  ) : CdkObject(cdkObject), CustomResourceProviderOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    override fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?: emptyList()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderOptions):
        CustomResourceProviderOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderOptions):
        software.amazon.awscdk.CustomResourceProviderOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CustomResourceProviderOptions
  }
}
