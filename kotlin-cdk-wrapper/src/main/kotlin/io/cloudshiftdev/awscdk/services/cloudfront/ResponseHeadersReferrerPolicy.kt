@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersReferrerPolicy {
  public fun `override`(): Boolean

  public fun referrerPolicy(): HeadersReferrerPolicy

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy,
  ) : CdkObject(cdkObject), ResponseHeadersReferrerPolicy {
    override fun `override`(): Boolean = unwrap(this).getOverride()

    override fun referrerPolicy(): HeadersReferrerPolicy =
        unwrap(this).getReferrerPolicy().let(HeadersReferrerPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersReferrerPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy):
        ResponseHeadersReferrerPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersReferrerPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy
  }
}
