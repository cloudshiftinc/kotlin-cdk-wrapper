package io.cloudshiftdev.awscdk.services.cloudfront

import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersReferrerPolicy {
  public fun `override`(): Boolean

  public fun referrerPolicy(): HeadersReferrerPolicy

  public interface Builder {
    public fun `override`(`override`: Boolean)

    public fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy.builder()

    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    override fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy) {
      cdkBuilder.referrerPolicy(referrerPolicy.let(HeadersReferrerPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy,
  ) : ResponseHeadersReferrerPolicy {
    override fun `override`(): Boolean = unwrap(this).getOverride()

    override fun referrerPolicy(): HeadersReferrerPolicy =
        unwrap(this).getReferrerPolicy().let(HeadersReferrerPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersReferrerPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy):
        ResponseHeadersReferrerPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersReferrerPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy = (wrapped as
        Wrapper).cdkObject
  }
}
