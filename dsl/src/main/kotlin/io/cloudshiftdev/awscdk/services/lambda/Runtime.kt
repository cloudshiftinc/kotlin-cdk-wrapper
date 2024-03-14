package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.DockerImage
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class Runtime internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.Runtime,
) {
  public open fun bundlingImage(): DockerImage =
      unwrap(this).getBundlingImage().let(DockerImage::wrap)

  public open fun family(): RuntimeFamily? = unwrap(this).getFamily()?.let(RuntimeFamily::wrap)

  public open fun isVariable(): Boolean = unwrap(this).getIsVariable()

  public open fun name(): String = unwrap(this).getName()

  public open fun runtimeEquals(other: Runtime): Boolean =
      unwrap(this).runtimeEquals(other.let(Runtime::unwrap))

  public open fun supportsCodeGuruProfiling(): Boolean = unwrap(this).getSupportsCodeGuruProfiling()

  public open fun supportsInlineCode(): Boolean = unwrap(this).getSupportsInlineCode()

  public open fun supportsSnapStart(): Boolean = unwrap(this).getSupportsSnapStart()

  public interface Builder {
    public fun bundlingDockerImage(bundlingDockerImage: String) {
    }

    public fun isVariable(isVariable: Boolean) {
    }

    public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
    }

    public fun supportsInlineCode(supportsInlineCode: Boolean) {
    }

    public fun supportsSnapStart(supportsSnapStart: Boolean) {
    }
  }

  private class BuilderImpl(
    name: String,
    family: software.amazon.awscdk.services.lambda.RuntimeFamily,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.Runtime.Builder =
        software.amazon.awscdk.services.lambda.Runtime.Builder.create(name, family)

    public override fun bundlingDockerImage(bundlingDockerImage: String) {
      cdkBuilder.bundlingDockerImage(bundlingDockerImage)
    }

    public override fun isVariable(isVariable: Boolean) {
      cdkBuilder.isVariable(isVariable)
    }

    public override fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
      cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
    }

    public override fun supportsInlineCode(supportsInlineCode: Boolean) {
      cdkBuilder.supportsInlineCode(supportsInlineCode)
    }

    public override fun supportsSnapStart(supportsSnapStart: Boolean) {
      cdkBuilder.supportsSnapStart(supportsSnapStart)
    }

    public fun build(): software.amazon.awscdk.services.lambda.Runtime = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      name: String,
      family: RuntimeFamily,
      block: Builder.() -> Unit = {},
    ): Runtime {
      val builderImpl = BuilderImpl(name, RuntimeFamily.unwrap(family))
      return Runtime(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.Runtime): Runtime =
        Runtime(cdkObject)

    internal fun unwrap(wrapped: Runtime): software.amazon.awscdk.services.lambda.Runtime =
        wrapped.cdkObject
  }
}
