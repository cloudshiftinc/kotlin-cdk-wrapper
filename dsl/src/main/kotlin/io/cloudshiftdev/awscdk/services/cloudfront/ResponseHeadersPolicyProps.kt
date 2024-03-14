package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ResponseHeadersPolicyProps {
  /**
   * A comment to describe the response headers policy.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A configuration for a set of HTTP response headers that are used for cross-origin resource
   * sharing (CORS).
   *
   * Default: - no cors behavior
   */
  public fun corsBehavior(): ResponseHeadersCorsBehavior? =
      unwrap(this).getCorsBehavior()?.let(ResponseHeadersCorsBehavior::wrap)

  /**
   * A configuration for a set of custom HTTP response headers.
   *
   * Default: - no custom headers behavior
   */
  public fun customHeadersBehavior(): ResponseCustomHeadersBehavior? =
      unwrap(this).getCustomHeadersBehavior()?.let(ResponseCustomHeadersBehavior::wrap)

  /**
   * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
   * viewers.
   *
   * Default: - no headers are removed
   */
  public fun removeHeaders(): List<String> = unwrap(this).getRemoveHeaders() ?: emptyList()

  /**
   * A unique name to identify the response headers policy.
   *
   * Default: - generated from the `id`
   */
  public fun responseHeadersPolicyName(): String? = unwrap(this).getResponseHeadersPolicyName()

  /**
   * A configuration for a set of security-related HTTP response headers.
   *
   * Default: - no security headers behavior
   */
  public fun securityHeadersBehavior(): ResponseSecurityHeadersBehavior? =
      unwrap(this).getSecurityHeadersBehavior()?.let(ResponseSecurityHeadersBehavior::wrap)

  /**
   * The percentage of responses that you want CloudFront to add the Server-Timing header to.
   *
   * Default: - no Server-Timing header is added to HTTP responses
   */
  public fun serverTimingSamplingRate(): Number? = unwrap(this).getServerTimingSamplingRate()

  /**
   * A builder for [ResponseHeadersPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to describe the response headers policy.
     */
    public fun comment(comment: String)

    /**
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS).
     */
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior)

    /**
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS).
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("774581af4e60931c98a569b870543c20d3cce2aa7f31e2cc453ddd7b6fe0ba9d")
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit)

    /**
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers.
     */
    public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior)

    /**
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c60466ec8a83096db32b8b7d8666a2b739e0c91d5e478332c609f749921b210b")
    public
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit)

    /**
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers.
     */
    public fun removeHeaders(removeHeaders: List<String>)

    /**
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers.
     */
    public fun removeHeaders(vararg removeHeaders: String)

    /**
     * @param responseHeadersPolicyName A unique name to identify the response headers policy.
     */
    public fun responseHeadersPolicyName(responseHeadersPolicyName: String)

    /**
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers.
     */
    public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior)

    /**
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e1271dc5479359bc5e77e66d0cdf0a10d552e07256897a7c6579049c346489")
    public
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit)

    /**
     * @param serverTimingSamplingRate The percentage of responses that you want CloudFront to add
     * the Server-Timing header to.
     */
    public fun serverTimingSamplingRate(serverTimingSamplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps.builder()

    /**
     * @param comment A comment to describe the response headers policy.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS).
     */
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
      cdkBuilder.corsBehavior(corsBehavior.let(ResponseHeadersCorsBehavior::unwrap))
    }

    /**
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS).
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("774581af4e60931c98a569b870543c20d3cce2aa7f31e2cc453ddd7b6fe0ba9d")
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit): Unit =
        corsBehavior(ResponseHeadersCorsBehavior(corsBehavior))

    /**
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers.
     */
    override fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
      cdkBuilder.customHeadersBehavior(customHeadersBehavior.let(ResponseCustomHeadersBehavior::unwrap))
    }

    /**
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c60466ec8a83096db32b8b7d8666a2b739e0c91d5e478332c609f749921b210b")
    override
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit):
        Unit = customHeadersBehavior(ResponseCustomHeadersBehavior(customHeadersBehavior))

    /**
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers.
     */
    override fun removeHeaders(removeHeaders: List<String>) {
      cdkBuilder.removeHeaders(removeHeaders)
    }

    /**
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers.
     */
    override fun removeHeaders(vararg removeHeaders: String): Unit =
        removeHeaders(removeHeaders.toList())

    /**
     * @param responseHeadersPolicyName A unique name to identify the response headers policy.
     */
    override fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
      cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
    }

    /**
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers.
     */
    override fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
      cdkBuilder.securityHeadersBehavior(securityHeadersBehavior.let(ResponseSecurityHeadersBehavior::unwrap))
    }

    /**
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14e1271dc5479359bc5e77e66d0cdf0a10d552e07256897a7c6579049c346489")
    override
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit):
        Unit = securityHeadersBehavior(ResponseSecurityHeadersBehavior(securityHeadersBehavior))

    /**
     * @param serverTimingSamplingRate The percentage of responses that you want CloudFront to add
     * the Server-Timing header to.
     */
    override fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
      cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps,
  ) : CdkObject(cdkObject), ResponseHeadersPolicyProps {
    /**
     * A comment to describe the response headers policy.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * Default: - no cors behavior
     */
    override fun corsBehavior(): ResponseHeadersCorsBehavior? =
        unwrap(this).getCorsBehavior()?.let(ResponseHeadersCorsBehavior::wrap)

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * Default: - no custom headers behavior
     */
    override fun customHeadersBehavior(): ResponseCustomHeadersBehavior? =
        unwrap(this).getCustomHeadersBehavior()?.let(ResponseCustomHeadersBehavior::wrap)

    /**
     * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
     * viewers.
     *
     * Default: - no headers are removed
     */
    override fun removeHeaders(): List<String> = unwrap(this).getRemoveHeaders() ?: emptyList()

    /**
     * A unique name to identify the response headers policy.
     *
     * Default: - generated from the `id`
     */
    override fun responseHeadersPolicyName(): String? = unwrap(this).getResponseHeadersPolicyName()

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * Default: - no security headers behavior
     */
    override fun securityHeadersBehavior(): ResponseSecurityHeadersBehavior? =
        unwrap(this).getSecurityHeadersBehavior()?.let(ResponseSecurityHeadersBehavior::wrap)

    /**
     * The percentage of responses that you want CloudFront to add the Server-Timing header to.
     *
     * Default: - no Server-Timing header is added to HTTP responses
     */
    override fun serverTimingSamplingRate(): Number? = unwrap(this).getServerTimingSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps):
        ResponseHeadersPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersPolicyProps):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
  }
}
