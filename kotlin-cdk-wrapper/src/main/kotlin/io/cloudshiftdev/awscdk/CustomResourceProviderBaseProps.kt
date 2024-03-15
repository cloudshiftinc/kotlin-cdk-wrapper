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

public interface CustomResourceProviderBaseProps : CustomResourceProviderOptions {
  public fun codeDirectory(): String

  public fun runtimeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun codeDirectory(codeDirectory: String)

    public fun description(description: String)

    public fun environment(environment: Map<String, String>)

    public fun memorySize(memorySize: Size)

    public fun policyStatements(policyStatements: List<Any>)

    public fun policyStatements(vararg policyStatements: Any)

    public fun runtimeName(runtimeName: String)

    public fun timeout(timeout: Duration)

    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProviderBaseProps.Builder =
        software.amazon.awscdk.CustomResourceProviderBaseProps.builder()

    override fun codeDirectory(codeDirectory: String) {
      cdkBuilder.codeDirectory(codeDirectory)
    }

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

    override fun runtimeName(runtimeName: String) {
      cdkBuilder.runtimeName(runtimeName)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
      cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProviderBaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CustomResourceProviderBaseProps,
  ) : CdkObject(cdkObject), CustomResourceProviderBaseProps {
    override fun codeDirectory(): String = unwrap(this).getCodeDirectory()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun memorySize(): Size? = unwrap(this).getMemorySize()?.let(Size::wrap)

    override fun policyStatements(): List<Any> = unwrap(this).getPolicyStatements() ?: emptyList()

    override fun runtimeName(): String = unwrap(this).getRuntimeName()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun useCfnResponseWrapper(): Boolean? = unwrap(this).getUseCfnResponseWrapper()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProviderBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProviderBaseProps):
        CustomResourceProviderBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProviderBaseProps):
        software.amazon.awscdk.CustomResourceProviderBaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CustomResourceProviderBaseProps
  }
}
