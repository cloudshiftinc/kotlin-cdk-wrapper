package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Number
import kotlin.Unit

public interface StringAttributeConstraints {
  public fun maxLen(): Number? = unwrap(this).getMaxLen()

  public fun minLen(): Number? = unwrap(this).getMinLen()

  public interface Builder {
    public fun maxLen(maxLen: Number)

    public fun minLen(minLen: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.StringAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.StringAttributeConstraints.builder()

    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StringAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints,
  ) : StringAttributeConstraints {
    override fun maxLen(): Number? = unwrap(this).getMaxLen()

    override fun minLen(): Number? = unwrap(this).getMinLen()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints):
        StringAttributeConstraints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringAttributeConstraints):
        software.amazon.awscdk.services.cognito.StringAttributeConstraints = (wrapped as
        Wrapper).cdkObject
  }
}
