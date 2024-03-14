package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OriginRequestPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy,
) : Resource(cdkObject), IOriginRequestPolicy {
  public override fun originRequestPolicyId(): String = unwrap(this).getOriginRequestPolicyId()

  public interface Builder {
    public fun comment(comment: String) {
    }

    public fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
    }

    public fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
    }

    public fun originRequestPolicyName(originRequestPolicyName: String) {
    }

    public fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder.create(scope, id)

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun cookieBehavior(cookieBehavior: OriginRequestCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(OriginRequestCookieBehavior::unwrap))
    }

    public override fun headerBehavior(headerBehavior: OriginRequestHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(OriginRequestHeaderBehavior::unwrap))
    }

    public override fun originRequestPolicyName(originRequestPolicyName: String) {
      cdkBuilder.originRequestPolicyName(originRequestPolicyName)
    }

    public override fun queryStringBehavior(queryStringBehavior: OriginRequestQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(OriginRequestQueryStringBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginRequestPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromOriginRequestPolicyId(
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
