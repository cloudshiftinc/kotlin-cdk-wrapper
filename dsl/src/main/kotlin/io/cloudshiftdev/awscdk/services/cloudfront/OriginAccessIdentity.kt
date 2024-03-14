package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OriginAccessIdentity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentity,
) : Resource(cdkObject), IOriginAccessIdentity {
  public open fun cloudFrontOriginAccessIdentityS3CanonicalUserId(): String =
      unwrap(this).getCloudFrontOriginAccessIdentityS3CanonicalUserId()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun originAccessIdentityId(): String = unwrap(this).getOriginAccessIdentityId()

  @Deprecated(message = "deprecated in CDK")
  public override fun originAccessIdentityName(): String =
      unwrap(this).getOriginAccessIdentityName()

  public interface Builder {
    public fun comment(comment: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.Builder
        = software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginAccessIdentity =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromOriginAccessIdentityId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      originAccessIdentityId: String,
    ): IOriginAccessIdentity =
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.fromOriginAccessIdentityId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, originAccessIdentityId).let(IOriginAccessIdentity::wrap)

    @Deprecated(message = "deprecated in CDK")
    public open fun fromOriginAccessIdentityName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      originAccessIdentityName: String,
    ): IOriginAccessIdentity =
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.fromOriginAccessIdentityName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, originAccessIdentityName).let(IOriginAccessIdentity::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OriginAccessIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OriginAccessIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentity):
        OriginAccessIdentity = OriginAccessIdentity(cdkObject)

    internal fun unwrap(wrapped: OriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity = wrapped.cdkObject
  }
}
