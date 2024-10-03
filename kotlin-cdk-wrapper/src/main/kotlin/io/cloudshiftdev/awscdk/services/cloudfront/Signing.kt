@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Options for how CloudFront signs requests.
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
public open class Signing(
  cdkObject: software.amazon.awscdk.services.cloudfront.Signing,
) : CdkObject(cdkObject) {
  public constructor(protocol: SigningProtocol, behavior: SigningBehavior) :
      this(software.amazon.awscdk.services.cloudfront.Signing(protocol.let(SigningProtocol.Companion::unwrap),
      behavior.let(SigningBehavior.Companion::unwrap))
  )

  /**
   * Which requests CloudFront signs.
   */
  public open fun behavior(): SigningBehavior =
      unwrap(this).getBehavior().let(SigningBehavior::wrap)

  /**
   * The signing protocol.
   */
  public open fun protocol(): SigningProtocol =
      unwrap(this).getProtocol().let(SigningProtocol::wrap)

  public companion object {
    public val NEVER: Signing =
        Signing.wrap(software.amazon.awscdk.services.cloudfront.Signing.NEVER)

    public val SIGV4_ALWAYS: Signing =
        Signing.wrap(software.amazon.awscdk.services.cloudfront.Signing.SIGV4_ALWAYS)

    public val SIGV4_NO_OVERRIDE: Signing =
        Signing.wrap(software.amazon.awscdk.services.cloudfront.Signing.SIGV4_NO_OVERRIDE)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Signing): Signing =
        Signing(cdkObject)

    internal fun unwrap(wrapped: Signing): software.amazon.awscdk.services.cloudfront.Signing =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudfront.Signing
  }
}
