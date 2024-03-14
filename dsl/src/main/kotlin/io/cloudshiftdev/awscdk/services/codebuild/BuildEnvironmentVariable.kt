package io.cloudshiftdev.awscdk.services.codebuild

import kotlin.Any
import kotlin.Unit

public interface BuildEnvironmentVariable {
  public fun type(): BuildEnvironmentVariableType? =
      unwrap(this).getType()?.let(BuildEnvironmentVariableType::wrap)

  public fun `value`(): Any

  public interface Builder {
    public fun type(type: BuildEnvironmentVariableType)

    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder =
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.builder()

    override fun type(type: BuildEnvironmentVariableType) {
      cdkBuilder.type(type.let(BuildEnvironmentVariableType::unwrap))
    }

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable,
  ) : BuildEnvironmentVariable {
    override fun type(): BuildEnvironmentVariableType? =
        unwrap(this).getType()?.let(BuildEnvironmentVariableType::wrap)

    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BuildEnvironmentVariable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable):
        BuildEnvironmentVariable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironmentVariable):
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable = (wrapped as
        Wrapper).cdkObject
  }
}
