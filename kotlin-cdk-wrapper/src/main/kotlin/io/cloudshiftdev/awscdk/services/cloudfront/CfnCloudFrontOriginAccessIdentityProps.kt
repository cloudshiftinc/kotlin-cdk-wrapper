@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCloudFrontOriginAccessIdentityProps {
  public fun cloudFrontOriginAccessIdentityConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable)

    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1bed04cce1ace3bf6bd48b4712feab682ca288a74b680c70d70e9f8abc52210")
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.builder()

    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(IResolvable::unwrap))
    }

    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty::unwrap))
    }

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
    override val cdkObject:
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps,
  ) : CdkObject(cdkObject), CfnCloudFrontOriginAccessIdentityProps {
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
        CfnCloudFrontOriginAccessIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFrontOriginAccessIdentityProps):
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps
  }
}
