package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ResponseHeadersPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy,
) : Resource(cdkObject), IResponseHeadersPolicy {
  /**
   * The ID of the response headers policy.
   */
  public override fun responseHeadersPolicyId(): String = unwrap(this).getResponseHeadersPolicyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.ResponseHeadersPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment to describe the response headers policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the response headers policy. 
     */
    public fun comment(comment: String)

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * Default: - no cors behavior
     *
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS). 
     */
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior)

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * Default: - no cors behavior
     *
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2af5fbd83f040932aa29ddbb986fde55e2d148fa3edb5d4b1eff454b8a8505")
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit)

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * Default: - no custom headers behavior
     *
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
     */
    public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior)

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * Default: - no custom headers behavior
     *
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2f2333b49f38c2836f76f275cc00c10028065625276a721d6053832074377b")
    public
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit)

    /**
     * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
     * viewers.
     *
     * Default: - no headers are removed
     *
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers. 
     */
    public fun removeHeaders(removeHeaders: List<String>)

    /**
     * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
     * viewers.
     *
     * Default: - no headers are removed
     *
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers. 
     */
    public fun removeHeaders(vararg removeHeaders: String)

    /**
     * A unique name to identify the response headers policy.
     *
     * Default: - generated from the `id`
     *
     * @param responseHeadersPolicyName A unique name to identify the response headers policy. 
     */
    public fun responseHeadersPolicyName(responseHeadersPolicyName: String)

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * Default: - no security headers behavior
     *
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers. 
     */
    public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior)

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * Default: - no security headers behavior
     *
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850766b95b6b44bdd5235525c7ce0800dd9a6a339e245395151303df303cefcc")
    public
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit)

    /**
     * The percentage of responses that you want CloudFront to add the Server-Timing header to.
     *
     * Default: - no Server-Timing header is added to HTTP responses
     *
     * @param serverTimingSamplingRate The percentage of responses that you want CloudFront to add
     * the Server-Timing header to. 
     */
    public fun serverTimingSamplingRate(serverTimingSamplingRate: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.Builder
        = software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.Builder.create(scope, id)

    /**
     * A comment to describe the response headers policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the response headers policy. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * Default: - no cors behavior
     *
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS). 
     */
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
      cdkBuilder.corsBehavior(corsBehavior.let(ResponseHeadersCorsBehavior::unwrap))
    }

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * Default: - no cors behavior
     *
     * @param corsBehavior A configuration for a set of HTTP response headers that are used for
     * cross-origin resource sharing (CORS). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2af5fbd83f040932aa29ddbb986fde55e2d148fa3edb5d4b1eff454b8a8505")
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit): Unit =
        corsBehavior(ResponseHeadersCorsBehavior(corsBehavior))

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * Default: - no custom headers behavior
     *
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
     */
    override fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
      cdkBuilder.customHeadersBehavior(customHeadersBehavior.let(ResponseCustomHeadersBehavior::unwrap))
    }

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * Default: - no custom headers behavior
     *
     * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2f2333b49f38c2836f76f275cc00c10028065625276a721d6053832074377b")
    override
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit):
        Unit = customHeadersBehavior(ResponseCustomHeadersBehavior(customHeadersBehavior))

    /**
     * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
     * viewers.
     *
     * Default: - no headers are removed
     *
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers. 
     */
    override fun removeHeaders(removeHeaders: List<String>) {
      cdkBuilder.removeHeaders(removeHeaders)
    }

    /**
     * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
     * viewers.
     *
     * Default: - no headers are removed
     *
     * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
     * responses that it sends to viewers. 
     */
    override fun removeHeaders(vararg removeHeaders: String): Unit =
        removeHeaders(removeHeaders.toList())

    /**
     * A unique name to identify the response headers policy.
     *
     * Default: - generated from the `id`
     *
     * @param responseHeadersPolicyName A unique name to identify the response headers policy. 
     */
    override fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
      cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
    }

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * Default: - no security headers behavior
     *
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers. 
     */
    override fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
      cdkBuilder.securityHeadersBehavior(securityHeadersBehavior.let(ResponseSecurityHeadersBehavior::unwrap))
    }

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * Default: - no security headers behavior
     *
     * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
     * headers. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850766b95b6b44bdd5235525c7ce0800dd9a6a339e245395151303df303cefcc")
    override
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit):
        Unit = securityHeadersBehavior(ResponseSecurityHeadersBehavior(securityHeadersBehavior))

    /**
     * The percentage of responses that you want CloudFront to add the Server-Timing header to.
     *
     * Default: - no Server-Timing header is added to HTTP responses
     *
     * @param serverTimingSamplingRate The percentage of responses that you want CloudFront to add
     * the Server-Timing header to. 
     */
    override fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
      cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromResponseHeadersPolicyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      responseHeadersPolicyId: String,
    ): IResponseHeadersPolicy =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.fromResponseHeadersPolicyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, responseHeadersPolicyId).let(IResponseHeadersPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ResponseHeadersPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ResponseHeadersPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy):
        ResponseHeadersPolicy = ResponseHeadersPolicy(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy = wrapped.cdkObject
  }
}
