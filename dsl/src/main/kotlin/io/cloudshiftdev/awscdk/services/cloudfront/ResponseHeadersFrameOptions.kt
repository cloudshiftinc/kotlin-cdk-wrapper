package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersFrameOptions {
  public fun frameOption(): HeadersFrameOption

  public fun `override`(): Boolean

  public interface Builder {
    public fun frameOption(frameOption: HeadersFrameOption)

    public fun `override`(`override`: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions.builder()

    override fun frameOption(frameOption: HeadersFrameOption) {
      cdkBuilder.frameOption(frameOption.let(HeadersFrameOption::unwrap))
    }

    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions,
  ) : ResponseHeadersFrameOptions {
    override fun frameOption(): HeadersFrameOption =
        unwrap(this).getFrameOption().let(HeadersFrameOption::wrap)

    override fun `override`(): Boolean = unwrap(this).getOverride()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersFrameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions):
        ResponseHeadersFrameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersFrameOptions):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions = (wrapped as
        Wrapper).cdkObject
  }
}
