package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCloudFrontOriginAccessIdentity internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrS3CanonicalUserId(): String = unwrap(this).getAttrS3CanonicalUserId()

  public open fun cloudFrontOriginAccessIdentityConfig(): Any =
      unwrap(this).getCloudFrontOriginAccessIdentityConfig()

  public open fun cloudFrontOriginAccessIdentityConfig(`value`: IResolvable) {
    unwrap(this).setCloudFrontOriginAccessIdentityConfig(`value`.let(IResolvable::unwrap))
  }

  public open
      fun cloudFrontOriginAccessIdentityConfig(`value`: CloudFrontOriginAccessIdentityConfigProperty) {
    unwrap(this).setCloudFrontOriginAccessIdentityConfig(`value`.let(CloudFrontOriginAccessIdentityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("271130b3953fc71d946a7866526f2109b18bc24471c1928dcac76b9c94678e3d")
  public open
      fun cloudFrontOriginAccessIdentityConfig(`value`: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit):
      Unit =
      cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
    }

    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28c90048f16f52b40cd40d4ddcecb0c5d4d6f1d87f42079013bc849831f96be6")
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.Builder.create(scope,
        id)

    public override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(IResolvable::unwrap))
    }

    public override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(CloudFrontOriginAccessIdentityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28c90048f16f52b40cd40d4ddcecb0c5d4d6f1d87f42079013bc849831f96be6")
    public override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit):
        Unit =
        cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty(cloudFrontOriginAccessIdentityConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCloudFrontOriginAccessIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCloudFrontOriginAccessIdentity(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity):
        CfnCloudFrontOriginAccessIdentity = CfnCloudFrontOriginAccessIdentity(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFrontOriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity =
        wrapped.cdkObject
  }

  public interface CloudFrontOriginAccessIdentityConfigProperty {
    public fun comment(): String

    public interface Builder {
      public fun comment(comment: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.builder()

      public override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty,
    ) : CloudFrontOriginAccessIdentityConfigProperty {
      public override fun comment(): String = unwrap(this).getComment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudFrontOriginAccessIdentityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty):
          CloudFrontOriginAccessIdentityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudFrontOriginAccessIdentityConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
