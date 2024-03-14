package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface KeepOriginalAttrs {
  public fun email(): Boolean? = unwrap(this).getEmail()

  public fun phone(): Boolean? = unwrap(this).getPhone()

  public interface Builder {
    public fun email(email: Boolean)

    public fun phone(phone: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.KeepOriginalAttrs.Builder =
        software.amazon.awscdk.services.cognito.KeepOriginalAttrs.builder()

    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    public fun build(): software.amazon.awscdk.services.cognito.KeepOriginalAttrs =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs,
  ) : KeepOriginalAttrs {
    override fun email(): Boolean? = unwrap(this).getEmail()

    override fun phone(): Boolean? = unwrap(this).getPhone()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KeepOriginalAttrs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.KeepOriginalAttrs):
        KeepOriginalAttrs = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeepOriginalAttrs):
        software.amazon.awscdk.services.cognito.KeepOriginalAttrs = (wrapped as Wrapper).cdkObject
  }
}
