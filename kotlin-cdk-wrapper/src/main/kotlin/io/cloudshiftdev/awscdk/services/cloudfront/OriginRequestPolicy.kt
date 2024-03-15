@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OriginRequestPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy,
) : Resource(cdkObject), IOriginRequestPolicy {
  public override fun originRequestPolicyId(): String = unwrap(this).getOriginRequestPolicyId()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior)

    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior)

    public fun originRequestPolicyName(originRequestPolicyName: String)

    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginRequestPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val ALL_VIEWER: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.ALL_VIEWER)

    public val ALL_VIEWER_AND_CLOUDFRONT_2022: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.ALL_VIEWER_AND_CLOUDFRONT_2022)

    public val ALL_VIEWER_EXCEPT_HOST_HEADER: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.ALL_VIEWER_EXCEPT_HOST_HEADER)

    public val CORS_CUSTOM_ORIGIN: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.CORS_CUSTOM_ORIGIN)

    public val CORS_S3_ORIGIN: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.CORS_S3_ORIGIN)

    public val ELEMENTAL_MEDIA_TAILOR: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.ELEMENTAL_MEDIA_TAILOR)

    public val USER_AGENT_REFERER_HEADERS: IOriginRequestPolicy =
        IOriginRequestPolicy.wrap(software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.USER_AGENT_REFERER_HEADERS)

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
