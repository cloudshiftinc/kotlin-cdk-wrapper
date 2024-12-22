@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a Lambda Function URL Origin Access Control resource.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * FunctionUrl fnUrl = fn.addFunctionUrl(FunctionUrlOptions.builder()
 * .authType(FunctionUrlAuthType.AWS_IAM)
 * .build());
 * // Define a custom OAC
 * FunctionUrlOriginAccessControl oac = FunctionUrlOriginAccessControl.Builder.create(this, "MyOAC")
 * .originAccessControlName("CustomLambdaOAC")
 * .signing(Signing.SIGV4_ALWAYS)
 * .build();
 * // Set up Lambda Function URL with OAC in CloudFront Distribution
 * // Set up Lambda Function URL with OAC in CloudFront Distribution
 * Distribution.Builder.create(this, "MyDistribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(FunctionUrlOrigin.withOriginAccessControl(fnUrl, FunctionUrlOriginWithOACProps.builder()
 * .originAccessControl(oac)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface FunctionUrlOriginAccessControlProps : OriginAccessControlBaseProps {
  /**
   * A builder for [FunctionUrlOriginAccessControlProps]
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
        software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps,
  ) : CdkObject(cdkObject),
      FunctionUrlOriginAccessControlProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}):
        FunctionUrlOriginAccessControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps):
        FunctionUrlOriginAccessControlProps = CdkObjectWrappers.wrap(cdkObject) as?
        FunctionUrlOriginAccessControlProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlOriginAccessControlProps):
        software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps
  }
}
