@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The request to create a new origin access identity (OAI).
 *
 * An origin access identity is a special CloudFront user that you can associate with Amazon S3
 * origins, so that you can secure all or just some of your Amazon S3 content. For more information,
 * see [Restricting Access to Amazon S3 Content by Using an Origin Access
 * Identity](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnCloudFrontOriginAccessIdentity cfnCloudFrontOriginAccessIdentity =
 * CfnCloudFrontOriginAccessIdentity.Builder.create(this, "MyCfnCloudFrontOriginAccessIdentity")
 * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
 */
public open class CfnCloudFrontOriginAccessIdentity(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFrontOriginAccessIdentityProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCloudFrontOriginAccessIdentityProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCloudFrontOriginAccessIdentityProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCloudFrontOriginAccessIdentityProps(props)
  )

  /**
   * The ID for the origin access identity, for example, `E74FTE3AJFJ256A` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin
   * access identity read permission to an object in Amazon S3.
   *
   * For example:
   * `b970b42360b81c8ddbd79d2f5df0069ba9033c8a79655752abe380cd6d63ba8bcf23384d568fcf89fc49700b5e11a0fd`
   * .
   */
  public open fun attrS3CanonicalUserId(): String = unwrap(this).getAttrS3CanonicalUserId()

  /**
   * The current configuration information for the identity.
   */
  public open fun cloudFrontOriginAccessIdentityConfig(): Any =
      unwrap(this).getCloudFrontOriginAccessIdentityConfig()

  /**
   * The current configuration information for the identity.
   */
  public open fun cloudFrontOriginAccessIdentityConfig(`value`: IResolvable) {
    unwrap(this).setCloudFrontOriginAccessIdentityConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The current configuration information for the identity.
   */
  public open
      fun cloudFrontOriginAccessIdentityConfig(`value`: CloudFrontOriginAccessIdentityConfigProperty) {
    unwrap(this).setCloudFrontOriginAccessIdentityConfig(`value`.let(CloudFrontOriginAccessIdentityConfigProperty.Companion::unwrap))
  }

  /**
   * The current configuration information for the identity.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("271130b3953fc71d946a7866526f2109b18bc24471c1928dcac76b9c94678e3d")
  public open
      fun cloudFrontOriginAccessIdentityConfig(`value`: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit):
      Unit =
      cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable)

    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty)

    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28c90048f16f52b40cd40d4ddcecb0c5d4d6f1d87f42079013bc849831f96be6")
    public
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.Builder.create(scope,
        id)

    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: IResolvable) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty) {
      cdkBuilder.cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.let(CloudFrontOriginAccessIdentityConfigProperty.Companion::unwrap))
    }

    /**
     * The current configuration information for the identity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig)
     * @param cloudFrontOriginAccessIdentityConfig The current configuration information for the
     * identity. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28c90048f16f52b40cd40d4ddcecb0c5d4d6f1d87f42079013bc849831f96be6")
    override
        fun cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfigProperty.Builder.() -> Unit):
        Unit =
        cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty(cloudFrontOriginAccessIdentityConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
  }

  /**
   * Origin access identity configuration.
   *
   * Send a `GET` request to the `/ *CloudFront API version* /CloudFront/identity ID/config`
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CloudFrontOriginAccessIdentityConfigProperty cloudFrontOriginAccessIdentityConfigProperty =
   * CloudFrontOriginAccessIdentityConfigProperty.builder()
   * .comment("comment")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html)
   */
  public interface CloudFrontOriginAccessIdentityConfigProperty {
    /**
     * A comment to describe the origin access identity.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment)
     */
    public fun comment(): String

    /**
     * A builder for [CloudFrontOriginAccessIdentityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the origin access identity. 
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.builder()

      /**
       * @param comment A comment to describe the origin access identity. 
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty,
    ) : CdkObject(cdkObject),
        CloudFrontOriginAccessIdentityConfigProperty {
      /**
       * A comment to describe the origin access identity.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html#cfn-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig-comment)
       */
      override fun comment(): String = unwrap(this).getComment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudFrontOriginAccessIdentityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty):
          CloudFrontOriginAccessIdentityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudFrontOriginAccessIdentityConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudFrontOriginAccessIdentityConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
    }
  }
}
