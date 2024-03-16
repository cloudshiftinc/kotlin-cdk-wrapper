@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a Origin Request Policy.
 *
 * Example:
 *
 * ```
 * // Creating a custom origin request policy for a Distribution -- all parameters optional
 * S3Origin bucketOrigin;
 * OriginRequestPolicy myOriginRequestPolicy = OriginRequestPolicy.Builder.create(this,
 * "OriginRequestPolicy")
 * .originRequestPolicyName("MyPolicy")
 * .comment("A default policy")
 * .cookieBehavior(OriginRequestCookieBehavior.none())
 * .headerBehavior(OriginRequestHeaderBehavior.all("CloudFront-Is-Android-Viewer"))
 * .queryStringBehavior(OriginRequestQueryStringBehavior.allowList("username"))
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .originRequestPolicy(myOriginRequestPolicy)
 * .build())
 * .build();
 * ```
 */
public interface OriginRequestPolicyProps {
  /**
   * A comment to describe the origin request policy.
   *
   * Default: - no comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The cookies from viewer requests to include in origin requests.
   *
   * Default: OriginRequestCookieBehavior.none()
   */
  public fun cookieBehavior(): OriginRequestCookieBehavior? =
      unwrap(this).getCookieBehavior()?.let(OriginRequestCookieBehavior::wrap)

  /**
   * The HTTP headers to include in origin requests.
   *
   * These can include headers from viewer requests and additional headers added by CloudFront.
   *
   * Default: OriginRequestHeaderBehavior.none()
   */
  public fun headerBehavior(): OriginRequestHeaderBehavior? =
      unwrap(this).getHeaderBehavior()?.let(OriginRequestHeaderBehavior::wrap)

  /**
   * A unique name to identify the origin request policy.
   *
   * The name must only include '-', '_', or alphanumeric characters.
   *
   * Default: - generated from the `id`
   */
  public fun originRequestPolicyName(): String? = unwrap(this).getOriginRequestPolicyName()

  /**
   * The URL query strings from viewer requests to include in origin requests.
   *
   * Default: OriginRequestQueryStringBehavior.none()
   */
  public fun queryStringBehavior(): OriginRequestQueryStringBehavior? =
      unwrap(this).getQueryStringBehavior()?.let(OriginRequestQueryStringBehavior::wrap)

  /**
   * A builder for [OriginRequestPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to describe the origin request policy.
     */
    public fun comment(comment: String)

    /**
     * @param cookieBehavior The cookies from viewer requests to include in origin requests.
     */
    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior)

    /**
     * @param headerBehavior The HTTP headers to include in origin requests.
     * These can include headers from viewer requests and additional headers added by CloudFront.
     */
    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior)

    /**
     * @param originRequestPolicyName A unique name to identify the origin request policy.
     * The name must only include '-', '_', or alphanumeric characters.
     */
    public fun originRequestPolicyName(originRequestPolicyName: String)

    /**
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     * requests.
     */
    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps.builder()

    /**
     * @param comment A comment to describe the origin request policy.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param cookieBehavior The cookies from viewer requests to include in origin requests.
     */
    override fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(OriginRequestCookieBehavior::unwrap))
    }

    /**
     * @param headerBehavior The HTTP headers to include in origin requests.
     * These can include headers from viewer requests and additional headers added by CloudFront.
     */
    override fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(OriginRequestHeaderBehavior::unwrap))
    }

    /**
     * @param originRequestPolicyName A unique name to identify the origin request policy.
     * The name must only include '-', '_', or alphanumeric characters.
     */
    override fun originRequestPolicyName(originRequestPolicyName: String) {
      cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    /**
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     * requests.
     */
    override fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(OriginRequestQueryStringBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps,
  ) : CdkObject(cdkObject), OriginRequestPolicyProps {
    /**
     * A comment to describe the origin request policy.
     *
     * Default: - no comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The cookies from viewer requests to include in origin requests.
     *
     * Default: OriginRequestCookieBehavior.none()
     */
    override fun cookieBehavior(): OriginRequestCookieBehavior? =
        unwrap(this).getCookieBehavior()?.let(OriginRequestCookieBehavior::wrap)

    /**
     * The HTTP headers to include in origin requests.
     *
     * These can include headers from viewer requests and additional headers added by CloudFront.
     *
     * Default: OriginRequestHeaderBehavior.none()
     */
    override fun headerBehavior(): OriginRequestHeaderBehavior? =
        unwrap(this).getHeaderBehavior()?.let(OriginRequestHeaderBehavior::wrap)

    /**
     * A unique name to identify the origin request policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     */
    override fun originRequestPolicyName(): String? = unwrap(this).getOriginRequestPolicyName()

    /**
     * The URL query strings from viewer requests to include in origin requests.
     *
     * Default: OriginRequestQueryStringBehavior.none()
     */
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
        OriginRequestPolicyProps = CdkObjectWrappers.wrap(cdkObject) as OriginRequestPolicyProps

    internal fun unwrap(wrapped: OriginRequestPolicyProps):
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
  }
}
