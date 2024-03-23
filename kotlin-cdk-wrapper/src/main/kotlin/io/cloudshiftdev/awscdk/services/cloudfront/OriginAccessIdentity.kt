@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An origin access identity is a special CloudFront user that you can associate with Amazon S3
 * origins, so that you can secure all or just some of your Amazon S3 content.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * OriginAccessIdentity originAccessIdentity = OriginAccessIdentity.Builder.create(this,
 * "MyOriginAccessIdentity")
 * .comment("comment")
 * .build();
 * ```
 */
public open class OriginAccessIdentity(
  cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessIdentity,
) : Resource(cdkObject), IOriginAccessIdentity {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudfront.OriginAccessIdentity(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OriginAccessIdentityProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.OriginAccessIdentity(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(OriginAccessIdentityProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: OriginAccessIdentityProps.Builder.() -> Unit,
  ) : this(scope, id, OriginAccessIdentityProps(props)
  )

  /**
   * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin
   * access identity read permission to an object in Amazon S3.
   */
  public open fun cloudFrontOriginAccessIdentityS3CanonicalUserId(): String =
      unwrap(this).getCloudFrontOriginAccessIdentityS3CanonicalUserId()

  /**
   * Derived principal value for bucket access.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * The Origin Access Identity Id (physical id) This was called originAccessIdentityName before.
   */
  public override fun originAccessIdentityId(): String = unwrap(this).getOriginAccessIdentityId()

  /**
   * (deprecated) The Origin Access Identity Id (physical id) It is misnamed and superseded by the
   * correctly named originAccessIdentityId.
   *
   * @deprecated use originAccessIdentityId instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun originAccessIdentityName(): String =
      unwrap(this).getOriginAccessIdentityName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.OriginAccessIdentity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Any comments you want to include about the origin access identity.
     *
     * Default: "Allows CloudFront to reach the bucket"
     *
     * @param comment Any comments you want to include about the origin access identity. 
     */
    public fun comment(comment: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.Builder
        = software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.Builder.create(scope, id)

    /**
     * Any comments you want to include about the origin access identity.
     *
     * Default: "Allows CloudFront to reach the bucket"
     *
     * @param comment Any comments you want to include about the origin access identity. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginAccessIdentity =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromOriginAccessIdentityId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      originAccessIdentityId: String,
    ): IOriginAccessIdentity =
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity.fromOriginAccessIdentityId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, originAccessIdentityId).let(IOriginAccessIdentity::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun fromOriginAccessIdentityName(
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
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
  }
}
