@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a S3 Origin Access Control resource.
 *
 * Example:
 *
 * ```
 * Bucket myBucket = new Bucket(this, "myBucket");
 * S3OriginAccessControl oac = S3OriginAccessControl.Builder.create(this, "MyOAC")
 * .signing(Signing.SIGV4_NO_OVERRIDE)
 * .build();
 * IOrigin s3Origin = S3BucketOrigin.withOriginAccessControl(myBucket,
 * S3BucketOriginWithOACProps.builder()
 * .originAccessControl(oac)
 * .build());
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(s3Origin)
 * .build())
 * .build();
 * ```
 */
public interface S3OriginAccessControlProps : OriginAccessControlBaseProps {
  /**
   * A builder for [S3OriginAccessControlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the origin access control.
     */
    public fun description(description: String)

    /**
     * @param originAccessControlName A name to identify the origin access control, with a maximum
     * length of 64 characters.
     */
    public fun originAccessControlName(originAccessControlName: String)

    /**
     * @param signing Specifies which requests CloudFront signs and the signing protocol.
     */
    public fun signing(signing: Signing)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps.Builder =
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps.builder()

    /**
     * @param description A description of the origin access control.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param originAccessControlName A name to identify the origin access control, with a maximum
     * length of 64 characters.
     */
    override fun originAccessControlName(originAccessControlName: String) {
      cdkBuilder.originAccessControlName(originAccessControlName)
    }

    /**
     * @param signing Specifies which requests CloudFront signs and the signing protocol.
     */
    override fun signing(signing: Signing) {
      cdkBuilder.signing(signing.let(Signing.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps,
  ) : CdkObject(cdkObject),
      S3OriginAccessControlProps {
    /**
     * A description of the origin access control.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name to identify the origin access control, with a maximum length of 64 characters.
     *
     * Default: - a generated name
     */
    override fun originAccessControlName(): String? = unwrap(this).getOriginAccessControlName()

    /**
     * Specifies which requests CloudFront signs and the signing protocol.
     *
     * Default: SIGV4_ALWAYS
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
     */
    override fun signing(): Signing? = unwrap(this).getSigning()?.let(Signing::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginAccessControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps):
        S3OriginAccessControlProps = CdkObjectWrappers.wrap(cdkObject) as?
        S3OriginAccessControlProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3OriginAccessControlProps):
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps
  }
}
