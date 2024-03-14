package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OriginRequestPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy,
) : Resource(cdkObject), IOriginRequestPolicy {
  /**
   * The ID of the origin request policy.
   */
  public override fun originRequestPolicyId(): String = unwrap(this).getOriginRequestPolicyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.OriginRequestPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment to describe the origin request policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the origin request policy. 
     */
    public fun comment(comment: String)

    /**
     * The cookies from viewer requests to include in origin requests.
     *
     * Default: OriginRequestCookieBehavior.none()
     *
     * @param cookieBehavior The cookies from viewer requests to include in origin requests. 
     */
    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior)

    /**
     * The HTTP headers to include in origin requests.
     *
     * These can include headers from viewer requests and additional headers added by CloudFront.
     *
     * Default: OriginRequestHeaderBehavior.none()
     *
     * @param headerBehavior The HTTP headers to include in origin requests. 
     */
    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior)

    /**
     * A unique name to identify the origin request policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param originRequestPolicyName A unique name to identify the origin request policy. 
     */
    public fun originRequestPolicyName(originRequestPolicyName: String)

    /**
     * The URL query strings from viewer requests to include in origin requests.
     *
     * Default: OriginRequestQueryStringBehavior.none()
     *
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     * requests. 
     */
    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder.create(scope, id)

    /**
     * A comment to describe the origin request policy.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the origin request policy. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The cookies from viewer requests to include in origin requests.
     *
     * Default: OriginRequestCookieBehavior.none()
     *
     * @param cookieBehavior The cookies from viewer requests to include in origin requests. 
     */
    override fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(OriginRequestCookieBehavior::unwrap))
    }

    /**
     * The HTTP headers to include in origin requests.
     *
     * These can include headers from viewer requests and additional headers added by CloudFront.
     *
     * Default: OriginRequestHeaderBehavior.none()
     *
     * @param headerBehavior The HTTP headers to include in origin requests. 
     */
    override fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(OriginRequestHeaderBehavior::unwrap))
    }

    /**
     * A unique name to identify the origin request policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param originRequestPolicyName A unique name to identify the origin request policy. 
     */
    override fun originRequestPolicyName(originRequestPolicyName: String) {
      cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    /**
     * The URL query strings from viewer requests to include in origin requests.
     *
     * Default: OriginRequestQueryStringBehavior.none()
     *
     * @param queryStringBehavior The URL query strings from viewer requests to include in origin
     * requests. 
     */
    override fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(OriginRequestQueryStringBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginRequestPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromOriginRequestPolicyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      originRequestPolicyId: String,
    ): IOriginRequestPolicy =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.fromOriginRequestPolicyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, originRequestPolicyId).let(IOriginRequestPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OriginRequestPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OriginRequestPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy):
        OriginRequestPolicy = OriginRequestPolicy(cdkObject)

    internal fun unwrap(wrapped: OriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicy = wrapped.cdkObject
  }
}
