@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCloudFrontOriginAccessIdentity`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnCloudFrontOriginAccessIdentityProps cfnCloudFrontOriginAccessIdentityProps =
 * CfnCloudFrontOriginAccessIdentityProps.builder()
 * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
public interface CfnCloudFrontOriginAccessIdentityProps {
  /**
   * The current configuration information for the identity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
   */
  public fun cloudFrontOriginAccessIdentityConfig(): Any

  /**
   * A builder for [CfnCloudFrontOriginAccessIdentityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable)

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty)

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1bed04cce1ace3bf6bd48b4712feab682ca288a74b680c70d70e9f8abc52210")
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.builder()

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Companion::unwrap))
    }

    /**
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1bed04cce1ace3bf6bd48b4712feab682ca288a74b680c70d70e9f8abc52210")
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit):
        Unit =
        cloudFrontOriginAccessIdentityConfig(CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty(cloudFrontOriginAccessIdentityConfig))

    public fun build():
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps,
  ) : CdkObject(cdkObject),
      CfnCloudFrontOriginAccessIdentityProps {
    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     */
    override fun cloudFrontOriginAccessIdentityConfig(): Any =
        unwrap(this).getCloudFrontOriginAccessIdentityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCloudFrontOriginAccessIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps):
        CfnCloudFrontOriginAccessIdentityProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudFrontOriginAccessIdentityProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFrontOriginAccessIdentityProps):
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps
  }
}
