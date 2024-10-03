@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Common properties for creating a Origin Access Control resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * Signing signing;
 * OriginAccessControlBaseProps originAccessControlBaseProps =
 * OriginAccessControlBaseProps.builder()
 * .description("description")
 * .originAccessControlName("originAccessControlName")
 * .signing(signing)
 * .build();
 * ```
 */
public interface OriginAccessControlBaseProps {
  /**
   * A description of the origin access control.
   *
   * Default: - no description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name to identify the origin access control, with a maximum length of 64 characters.
   *
   * Default: - a generated name
   */
  public fun originAccessControlName(): String? = unwrap(this).getOriginAccessControlName()

  /**
   * Specifies which requests CloudFront signs and the signing protocol.
   *
   * Default: SIGV4_ALWAYS
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
   */
  public fun signing(): Signing? = unwrap(this).getSigning()?.let(Signing::wrap)

  /**
   * A builder for [OriginAccessControlBaseProps]
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
        software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps.Builder =
        software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps,
  ) : CdkObject(cdkObject),
      OriginAccessControlBaseProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginAccessControlBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps):
        OriginAccessControlBaseProps = CdkObjectWrappers.wrap(cdkObject) as?
        OriginAccessControlBaseProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginAccessControlBaseProps):
        software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.OriginAccessControlBaseProps
  }
}
