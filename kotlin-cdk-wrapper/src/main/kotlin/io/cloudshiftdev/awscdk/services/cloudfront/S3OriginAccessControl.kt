@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Origin Access Control for Amazon S3 origins.
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
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
 */
public open class S3OriginAccessControl(
  cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginAccessControl,
) : Resource(cdkObject),
    IOriginAccessControl {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudfront.S3OriginAccessControl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: S3OriginAccessControlProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.S3OriginAccessControl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(S3OriginAccessControlProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: S3OriginAccessControlProps.Builder.() -> Unit,
  ) : this(scope, id, S3OriginAccessControlProps(props)
  )

  /**
   * The unique identifier of this Origin Access Control.
   */
  public override fun originAccessControlId(): String = unwrap(this).getOriginAccessControlId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.S3OriginAccessControl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the origin access control.
     *
     * Default: - no description
     *
     * @param description A description of the origin access control. 
     */
    public fun description(description: String)

    /**
     * A name to identify the origin access control, with a maximum length of 64 characters.
     *
     * Default: - a generated name
     *
     * @param originAccessControlName A name to identify the origin access control, with a maximum
     * length of 64 characters. 
     */
    public fun originAccessControlName(originAccessControlName: String)

    /**
     * Specifies which requests CloudFront signs and the signing protocol.
     *
     * Default: SIGV4_ALWAYS
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
     * @param signing Specifies which requests CloudFront signs and the signing protocol. 
     */
    public fun signing(signing: Signing)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.S3OriginAccessControl.Builder
        = software.amazon.awscdk.services.cloudfront.S3OriginAccessControl.Builder.create(scope, id)

    /**
     * A description of the origin access control.
     *
     * Default: - no description
     *
     * @param description A description of the origin access control. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name to identify the origin access control, with a maximum length of 64 characters.
     *
     * Default: - a generated name
     *
     * @param originAccessControlName A name to identify the origin access control, with a maximum
     * length of 64 characters. 
     */
    override fun originAccessControlName(originAccessControlName: String) {
      cdkBuilder.originAccessControlName(originAccessControlName)
    }

    /**
     * Specifies which requests CloudFront signs and the signing protocol.
     *
     * Default: SIGV4_ALWAYS
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
     * @param signing Specifies which requests CloudFront signs and the signing protocol. 
     */
    override fun signing(signing: Signing) {
      cdkBuilder.signing(signing.let(Signing.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.S3OriginAccessControl =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControl.PROPERTY_INJECTION_ID

    public fun fromOriginAccessControlId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      originAccessControlId: String,
    ): IOriginAccessControl =
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControl.fromOriginAccessControlId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, originAccessControlId).let(IOriginAccessControl::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): S3OriginAccessControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return S3OriginAccessControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.S3OriginAccessControl):
        S3OriginAccessControl = S3OriginAccessControl(cdkObject)

    internal fun unwrap(wrapped: S3OriginAccessControl):
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControl = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.S3OriginAccessControl
  }
}
