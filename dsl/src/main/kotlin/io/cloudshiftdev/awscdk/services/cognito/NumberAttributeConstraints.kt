package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Number
import kotlin.Unit

public interface NumberAttributeConstraints {
  public fun max(): Number? = unwrap(this).getMax()

  public fun min(): Number? = unwrap(this).getMin()

  public interface Builder {
    public fun max(max: Number) {
    }

    public fun min(min: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.builder()

    public override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    public override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints,
  ) : NumberAttributeConstraints {
    public override fun max(): Number? = unwrap(this).getMax()

    public override fun min(): Number? = unwrap(this).getMin()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints):
        NumberAttributeConstraints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeConstraints):
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints = (wrapped as
        Wrapper).cdkObject
  }
}
