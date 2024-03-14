package io.cloudshiftdev.awscdk.services.ssm

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CommonStringParameterAttributes {
  public fun parameterName(): String

  public fun simpleName(): Boolean? = unwrap(this).getSimpleName()

  public interface Builder {
    public fun parameterName(parameterName: String) {
    }

    public fun simpleName(simpleName: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.builder()

    public override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    public override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CommonStringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes,
  ) : CommonStringParameterAttributes {
    public override fun parameterName(): String = unwrap(this).getParameterName()

    public override fun simpleName(): Boolean? = unwrap(this).getSimpleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonStringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes):
        CommonStringParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonStringParameterAttributes):
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
