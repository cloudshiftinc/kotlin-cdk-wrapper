package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersStrictTransportSecurity {
  /**
   * A number that CloudFront uses as the value for the max-age directive in the
   * Strict-Transport-Security HTTP response header.
   */
  public fun accessControlMaxAge(): Duration

  /**
   * A Boolean that determines whether CloudFront includes the includeSubDomains directive in the
   * Strict-Transport-Security HTTP response header.
   *
   * Default: false
   */
  public fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

  /**
   * A Boolean that determines whether CloudFront overrides the Strict-Transport-Security HTTP
   * response header received from the origin with the one specified in this response headers policy.
   */
  public fun `override`(): Boolean

  /**
   * A Boolean that determines whether CloudFront includes the preload directive in the
   * Strict-Transport-Security HTTP response header.
   *
   * Default: false
   */
  public fun preload(): Boolean? = unwrap(this).getPreload()

  /**
   * A builder for [ResponseHeadersStrictTransportSecurity]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age
     * directive in the Strict-Transport-Security HTTP response header. 
     */
    public fun accessControlMaxAge(accessControlMaxAge: Duration)

    /**
     * @param includeSubdomains A Boolean that determines whether CloudFront includes the
     * includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     */
    public fun includeSubdomains(includeSubdomains: Boolean)

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Strict-Transport-Security HTTP response header received from the origin with the one specified
     * in this response headers policy. 
     */
    public fun `override`(`override`: Boolean)

    /**
     * @param preload A Boolean that determines whether CloudFront includes the preload directive in
     * the Strict-Transport-Security HTTP response header.
     */
    public fun preload(preload: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.builder()

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age
     * directive in the Strict-Transport-Security HTTP response header. 
     */
    override fun accessControlMaxAge(accessControlMaxAge: Duration) {
      cdkBuilder.accessControlMaxAge(accessControlMaxAge.let(Duration::unwrap))
    }

    /**
     * @param includeSubdomains A Boolean that determines whether CloudFront includes the
     * includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     */
    override fun includeSubdomains(includeSubdomains: Boolean) {
      cdkBuilder.includeSubdomains(includeSubdomains)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     * Strict-Transport-Security HTTP response header received from the origin with the one specified
     * in this response headers policy. 
     */
    override fun `override`(`override`: Boolean) {
      cdkBuilder.`override`(`override`)
    }

    /**
     * @param preload A Boolean that determines whether CloudFront includes the preload directive in
     * the Strict-Transport-Security HTTP response header.
     */
    override fun preload(preload: Boolean) {
      cdkBuilder.preload(preload)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity,
  ) : CdkObject(cdkObject), ResponseHeadersStrictTransportSecurity {
    /**
     * A number that CloudFront uses as the value for the max-age directive in the
     * Strict-Transport-Security HTTP response header.
     */
    override fun accessControlMaxAge(): Duration =
        unwrap(this).getAccessControlMaxAge().let(Duration::wrap)

    /**
     * A Boolean that determines whether CloudFront includes the includeSubDomains directive in the
     * Strict-Transport-Security HTTP response header.
     *
     * Default: false
     */
    override fun includeSubdomains(): Boolean? = unwrap(this).getIncludeSubdomains()

    /**
     * A Boolean that determines whether CloudFront overrides the Strict-Transport-Security HTTP
     * response header received from the origin with the one specified in this response headers policy.
     */
    override fun `override`(): Boolean = unwrap(this).getOverride()

    /**
     * A Boolean that determines whether CloudFront includes the preload directive in the
     * Strict-Transport-Security HTTP response header.
     *
     * Default: false
     */
    override fun preload(): Boolean? = unwrap(this).getPreload()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ResponseHeadersStrictTransportSecurity {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity):
        ResponseHeadersStrictTransportSecurity = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersStrictTransportSecurity):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
  }
}
