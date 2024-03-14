package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ResponseHeadersContentSecurityPolicy {
  /**
   * The policy directives and their values that CloudFront includes as values for the
   * Content-Security-Policy HTTP response header.
   */
  public fun contentSecurityPolicy(): String

  /**
   * A Boolean that determines whether CloudFront overrides the Content-Security-Policy HTTP
   * response header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A builder for [ResponseHeadersContentSecurityPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header. 
     */
    public fun contentSecurityPolicy(contentSecurityPolicy: String)

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Content-Security-Policy HTTP response header received from the origin with the one specified in
     * this response headers policy. 
     */
    public fun `override`(`override`: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy.builder()

    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header. 
     */
    override fun contentSecurityPolicy(contentSecurityPolicy: String) {
      cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Content-Security-Policy HTTP response header received from the origin with the one specified in
     * this response headers policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy,
  ) : CdkObject(cdkObject), ResponseHeadersContentSecurityPolicy {
    /**
     * The policy directives and their values that CloudFront includes as values for the
     * Content-Security-Policy HTTP response header.
     */
    override fun contentSecurityPolicy(): String = unwrap(this).getContentSecurityPolicy()

    /**
     * A Boolean that determines whether CloudFront overrides the Content-Security-Policy HTTP
     * response header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ResponseHeadersContentSecurityPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy):
        ResponseHeadersContentSecurityPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersContentSecurityPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy
  }
}
