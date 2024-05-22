@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for a set of security-related HTTP response headers.
 *
 * CloudFront adds these headers to HTTP responses that it sends for requests that match a cache
 * behavior
 * associated with this response headers policy.
 *
 * Example:
 *
 * ```
 * // Using an existing managed response headers policy
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
 * .build())
 * .build();
 * // Creating a custom response headers policy -- all parameters optional
 * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
 * "ResponseHeadersPolicy")
 * .responseHeadersPolicyName("MyPolicy")
 * .comment("A default policy")
 * .corsBehavior(ResponseHeadersCorsBehavior.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlAllowMethods(List.of("GET", "POST"))
 * .accessControlAllowOrigins(List.of("*"))
 * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlMaxAge(Duration.seconds(600))
 * .originOverride(true)
 * .build())
 * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
 * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
 * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
 * .build())
 * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
 * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
 * https:;").override(true).build())
 * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
 * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
 * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
 * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
 * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
 * .build())
 * .removeHeaders(List.of("Server"))
 * .serverTimingSamplingRate(50)
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(myResponseHeadersPolicy)
 * .build())
 * .build();
 * ```
 */
public interface ResponseSecurityHeadersBehavior {
  /**
   * The policy directives and their values that CloudFront includes as values for the
   * Content-Security-Policy HTTP response header.
   *
   * Default: - no content security policy
   */
  public fun contentSecurityPolicy(): ResponseHeadersContentSecurityPolicy? =
      unwrap(this).getContentSecurityPolicy()?.let(ResponseHeadersContentSecurityPolicy::wrap)

  /**
   * Determines whether CloudFront includes the X-Content-Type-Options HTTP response header with its
   * value set to nosniff.
   *
   * Default: - no content type options
   */
  public fun contentTypeOptions(): ResponseHeadersContentTypeOptions? =
      unwrap(this).getContentTypeOptions()?.let(ResponseHeadersContentTypeOptions::wrap)

  /**
   * Determines whether CloudFront includes the X-Frame-Options HTTP response header and the
   * header’s value.
   *
   * Default: - no frame options
   */
  public fun frameOptions(): ResponseHeadersFrameOptions? =
      unwrap(this).getFrameOptions()?.let(ResponseHeadersFrameOptions::wrap)

  /**
   * Determines whether CloudFront includes the Referrer-Policy HTTP response header and the
   * header’s value.
   *
   * Default: - no referrer policy
   */
  public fun referrerPolicy(): ResponseHeadersReferrerPolicy? =
      unwrap(this).getReferrerPolicy()?.let(ResponseHeadersReferrerPolicy::wrap)

  /**
   * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and
   * the header’s value.
   *
   * Default: - no strict transport security
   */
  public fun strictTransportSecurity(): ResponseHeadersStrictTransportSecurity? =
      unwrap(this).getStrictTransportSecurity()?.let(ResponseHeadersStrictTransportSecurity::wrap)

  /**
   * Determines whether CloudFront includes the X-XSS-Protection HTTP response header and the
   * header’s value.
   *
   * Default: - no xss protection
   */
  public fun xssProtection(): ResponseHeadersXSSProtection? =
      unwrap(this).getXssProtection()?.let(ResponseHeadersXSSProtection::wrap)

  /**
   * A builder for [ResponseSecurityHeadersBehavior]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header.
     */
    public fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy)

    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4691b7e17deed9234f88e371d2fd4f2cdc1e3008734107215e3638b828781253")
    public
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy.Builder.() -> Unit)

    /**
     * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
     * HTTP response header with its value set to nosniff.
     */
    public fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions)

    /**
     * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
     * HTTP response header with its value set to nosniff.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7723249f91a1b8d76ea3f11769add9c12d828245f4085fb3dda121a29a599d")
    public
        fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions.Builder.() -> Unit)

    /**
     * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
     * header and the header’s value.
     */
    public fun frameOptions(frameOptions: ResponseHeadersFrameOptions)

    /**
     * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
     * header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e0ee8bff853133fe451dd43f5202e78923c3f577dba61a0f4a60a279ca504e")
    public fun frameOptions(frameOptions: ResponseHeadersFrameOptions.Builder.() -> Unit)

    /**
     * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP
     * response header and the header’s value.
     */
    public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy)

    /**
     * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP
     * response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b14e34c5214b5a308999a1860760626edd1b7526e04b89ac2275e7d8fe09e3b")
    public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy.Builder.() -> Unit)

    /**
     * @param strictTransportSecurity Determines whether CloudFront includes the
     * Strict-Transport-Security HTTP response header and the header’s value.
     */
    public
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity)

    /**
     * @param strictTransportSecurity Determines whether CloudFront includes the
     * Strict-Transport-Security HTTP response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61958670128d24fd79540494d747b3f30fcd951f3b47cc3cecbd6525d7f6cb2c")
    public
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit)

    /**
     * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP
     * response header and the header’s value.
     */
    public fun xssProtection(xssProtection: ResponseHeadersXSSProtection)

    /**
     * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP
     * response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7f0b03c4e7bdbd6b79eb5caf3e6a79547ee2ca95299ee4ac9f768025e39684f")
    public fun xssProtection(xssProtection: ResponseHeadersXSSProtection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior.Builder =
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior.builder()

    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header.
     */
    override
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy) {
      cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(ResponseHeadersContentSecurityPolicy.Companion::unwrap))
    }

    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes
     * as values for the Content-Security-Policy HTTP response header.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4691b7e17deed9234f88e371d2fd4f2cdc1e3008734107215e3638b828781253")
    override
        fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy.Builder.() -> Unit):
        Unit = contentSecurityPolicy(ResponseHeadersContentSecurityPolicy(contentSecurityPolicy))

    /**
     * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
     * HTTP response header with its value set to nosniff.
     */
    override fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions) {
      cdkBuilder.contentTypeOptions(contentTypeOptions.let(ResponseHeadersContentTypeOptions.Companion::unwrap))
    }

    /**
     * @param contentTypeOptions Determines whether CloudFront includes the X-Content-Type-Options
     * HTTP response header with its value set to nosniff.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c7723249f91a1b8d76ea3f11769add9c12d828245f4085fb3dda121a29a599d")
    override
        fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions.Builder.() -> Unit):
        Unit = contentTypeOptions(ResponseHeadersContentTypeOptions(contentTypeOptions))

    /**
     * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
     * header and the header’s value.
     */
    override fun frameOptions(frameOptions: ResponseHeadersFrameOptions) {
      cdkBuilder.frameOptions(frameOptions.let(ResponseHeadersFrameOptions.Companion::unwrap))
    }

    /**
     * @param frameOptions Determines whether CloudFront includes the X-Frame-Options HTTP response
     * header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4e0ee8bff853133fe451dd43f5202e78923c3f577dba61a0f4a60a279ca504e")
    override fun frameOptions(frameOptions: ResponseHeadersFrameOptions.Builder.() -> Unit): Unit =
        frameOptions(ResponseHeadersFrameOptions(frameOptions))

    /**
     * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP
     * response header and the header’s value.
     */
    override fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy) {
      cdkBuilder.referrerPolicy(referrerPolicy.let(ResponseHeadersReferrerPolicy.Companion::unwrap))
    }

    /**
     * @param referrerPolicy Determines whether CloudFront includes the Referrer-Policy HTTP
     * response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b14e34c5214b5a308999a1860760626edd1b7526e04b89ac2275e7d8fe09e3b")
    override fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy.Builder.() -> Unit):
        Unit = referrerPolicy(ResponseHeadersReferrerPolicy(referrerPolicy))

    /**
     * @param strictTransportSecurity Determines whether CloudFront includes the
     * Strict-Transport-Security HTTP response header and the header’s value.
     */
    override
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity) {
      cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(ResponseHeadersStrictTransportSecurity.Companion::unwrap))
    }

    /**
     * @param strictTransportSecurity Determines whether CloudFront includes the
     * Strict-Transport-Security HTTP response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("61958670128d24fd79540494d747b3f30fcd951f3b47cc3cecbd6525d7f6cb2c")
    override
        fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity.Builder.() -> Unit):
        Unit =
        strictTransportSecurity(ResponseHeadersStrictTransportSecurity(strictTransportSecurity))

    /**
     * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP
     * response header and the header’s value.
     */
    override fun xssProtection(xssProtection: ResponseHeadersXSSProtection) {
      cdkBuilder.xssProtection(xssProtection.let(ResponseHeadersXSSProtection.Companion::unwrap))
    }

    /**
     * @param xssProtection Determines whether CloudFront includes the X-XSS-Protection HTTP
     * response header and the header’s value.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7f0b03c4e7bdbd6b79eb5caf3e6a79547ee2ca95299ee4ac9f768025e39684f")
    override fun xssProtection(xssProtection: ResponseHeadersXSSProtection.Builder.() -> Unit): Unit
        = xssProtection(ResponseHeadersXSSProtection(xssProtection))

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior,
  ) : CdkObject(cdkObject), ResponseSecurityHeadersBehavior {
    /**
     * The policy directives and their values that CloudFront includes as values for the
     * Content-Security-Policy HTTP response header.
     *
     * Default: - no content security policy
     */
    override fun contentSecurityPolicy(): ResponseHeadersContentSecurityPolicy? =
        unwrap(this).getContentSecurityPolicy()?.let(ResponseHeadersContentSecurityPolicy::wrap)

    /**
     * Determines whether CloudFront includes the X-Content-Type-Options HTTP response header with
     * its value set to nosniff.
     *
     * Default: - no content type options
     */
    override fun contentTypeOptions(): ResponseHeadersContentTypeOptions? =
        unwrap(this).getContentTypeOptions()?.let(ResponseHeadersContentTypeOptions::wrap)

    /**
     * Determines whether CloudFront includes the X-Frame-Options HTTP response header and the
     * header’s value.
     *
     * Default: - no frame options
     */
    override fun frameOptions(): ResponseHeadersFrameOptions? =
        unwrap(this).getFrameOptions()?.let(ResponseHeadersFrameOptions::wrap)

    /**
     * Determines whether CloudFront includes the Referrer-Policy HTTP response header and the
     * header’s value.
     *
     * Default: - no referrer policy
     */
    override fun referrerPolicy(): ResponseHeadersReferrerPolicy? =
        unwrap(this).getReferrerPolicy()?.let(ResponseHeadersReferrerPolicy::wrap)

    /**
     * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and
     * the header’s value.
     *
     * Default: - no strict transport security
     */
    override fun strictTransportSecurity(): ResponseHeadersStrictTransportSecurity? =
        unwrap(this).getStrictTransportSecurity()?.let(ResponseHeadersStrictTransportSecurity::wrap)

    /**
     * Determines whether CloudFront includes the X-XSS-Protection HTTP response header and the
     * header’s value.
     *
     * Default: - no xss protection
     */
    override fun xssProtection(): ResponseHeadersXSSProtection? =
        unwrap(this).getXssProtection()?.let(ResponseHeadersXSSProtection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResponseSecurityHeadersBehavior {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior):
        ResponseSecurityHeadersBehavior = CdkObjectWrappers.wrap(cdkObject) as?
        ResponseSecurityHeadersBehavior ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResponseSecurityHeadersBehavior):
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior
  }
}
