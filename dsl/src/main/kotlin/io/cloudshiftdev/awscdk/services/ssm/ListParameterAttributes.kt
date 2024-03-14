package io.cloudshiftdev.awscdk.services.ssm

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ListParameterAttributes : CommonStringParameterAttributes {
  public fun elementType(): ParameterValueType? =
      unwrap(this).getElementType()?.let(ParameterValueType::wrap)

  public fun version(): Number? = unwrap(this).getVersion()

  public interface Builder {
    public fun elementType(elementType: ParameterValueType) {
    }

    public fun parameterName(parameterName: String) {
    }

    public fun simpleName(simpleName: Boolean) {
    }

    public fun version(version: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.ListParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.ListParameterAttributes.builder()

    public override fun elementType(elementType: ParameterValueType) {
      cdkBuilder.elementType(elementType.let(ParameterValueType::unwrap))
    }

    public override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    public override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    public override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.ListParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.ListParameterAttributes,
  ) : ListParameterAttributes {
    public override fun elementType(): ParameterValueType? =
        unwrap(this).getElementType()?.let(ParameterValueType::wrap)

    public override fun parameterName(): String = unwrap(this).getParameterName()

    public override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    public override fun version(): Number? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ListParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ListParameterAttributes):
        ListParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ListParameterAttributes):
        software.amazon.awscdk.services.ssm.ListParameterAttributes = (wrapped as Wrapper).cdkObject
  }
}
