@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface OriginRequestPolicyProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun cookieBehavior(): OriginRequestCookieBehavior? =
      unwrap(this).getCookieBehavior()?.let(OriginRequestCookieBehavior::wrap)

  public fun headerBehavior(): OriginRequestHeaderBehavior? =
      unwrap(this).getHeaderBehavior()?.let(OriginRequestHeaderBehavior::wrap)

  public fun originRequestPolicyName(): String? = unwrap(this).getOriginRequestPolicyName()

  public fun queryStringBehavior(): OriginRequestQueryStringBehavior? =
      unwrap(this).getQueryStringBehavior()?.let(OriginRequestQueryStringBehavior::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior)

    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior)

    public fun originRequestPolicyName(originRequestPolicyName: String)

    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(OriginRequestCookieBehavior::unwrap))
    }

    override fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(OriginRequestHeaderBehavior::unwrap))
    }

    override fun originRequestPolicyName(originRequestPolicyName: String) {
      cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    override fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(OriginRequestQueryStringBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps,
  ) : CdkObject(cdkObject), OriginRequestPolicyProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun cookieBehavior(): OriginRequestCookieBehavior? =
        unwrap(this).getCookieBehavior()?.let(OriginRequestCookieBehavior::wrap)

    override fun headerBehavior(): OriginRequestHeaderBehavior? =
        unwrap(this).getHeaderBehavior()?.let(OriginRequestHeaderBehavior::wrap)

    override fun originRequestPolicyName(): String? = unwrap(this).getOriginRequestPolicyName()

    override fun queryStringBehavior(): OriginRequestQueryStringBehavior? =
        unwrap(this).getQueryStringBehavior()?.let(OriginRequestQueryStringBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginRequestPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps):
        OriginRequestPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginRequestPolicyProps):
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
  }
}
