package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseCustomHeader {
  public fun `header`(): String

  public fun `override`(): Boolean

  public fun `value`(): String

  public interface Builder {
    public fun `header`(`header`: String) {
    }

    public fun `override`(`override`: Boolean) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader.Builder
        = software.amazon.awscdk.services.cloudfront.ResponseCustomHeader.builder()

    public override fun `header`(`header`: String) {
      cdkBuilder.`header`(`header`)
    }

    public override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseCustomHeader =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader,
  ) : ResponseCustomHeader {
    public override fun `header`(): String = unwrap(this).getHeader()

    public override fun `override`(): Boolean = unwrap(this).getOverride()

    public override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeader {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader):
        ResponseCustomHeader = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseCustomHeader):
        software.amazon.awscdk.services.cloudfront.ResponseCustomHeader = (wrapped as
        Wrapper).cdkObject
  }
}
