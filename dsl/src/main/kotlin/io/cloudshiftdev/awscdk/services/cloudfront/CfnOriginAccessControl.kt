package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginAccessControl internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier of the origin access control.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The origin access control.
   */
  public open fun originAccessControlConfig(): Any = unwrap(this).getOriginAccessControlConfig()

  /**
   * The origin access control.
   */
  public open fun originAccessControlConfig(`value`: IResolvable) {
    unwrap(this).setOriginAccessControlConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The origin access control.
   */
  public open fun originAccessControlConfig(`value`: OriginAccessControlConfigProperty) {
    unwrap(this).setOriginAccessControlConfig(`value`.let(OriginAccessControlConfigProperty::unwrap))
  }

  /**
   * The origin access control.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eb7ae7106b477a120b6b4eb2959987a5ab0137855fe4c359219cc0c89a09279")
  public open
      fun originAccessControlConfig(`value`: OriginAccessControlConfigProperty.Builder.() -> Unit):
      Unit = originAccessControlConfig(OriginAccessControlConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnOriginAccessControl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    public fun originAccessControlConfig(originAccessControlConfig: IResolvable)

    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    public
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty)

    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361ff33cabc99e16410906f2dac29bca4d560587ad47173768c86bb19a7ec07c")
    public
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.Builder.create(scope, id)

    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    override fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(IResolvable::unwrap))
    }

    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    override
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(OriginAccessControlConfigProperty::unwrap))
    }

    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     * @param originAccessControlConfig The origin access control. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("361ff33cabc99e16410906f2dac29bca4d560587ad47173768c86bb19a7ec07c")
    override
        fun originAccessControlConfig(originAccessControlConfig: OriginAccessControlConfigProperty.Builder.() -> Unit):
        Unit =
        originAccessControlConfig(OriginAccessControlConfigProperty(originAccessControlConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginAccessControl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginAccessControl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl):
        CfnOriginAccessControl = CfnOriginAccessControl(cdkObject)

    internal fun unwrap(wrapped: CfnOriginAccessControl):
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl = wrapped.cdkObject
  }

  public interface OriginAccessControlConfigProperty {
    /**
     * A description of the origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A name to identify the origin access control.
     *
     * You can specify up to 64 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-name)
     */
    public fun name(): String

    /**
     * The type of origin that this origin access control is for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-originaccesscontrolorigintype)
     */
    public fun originAccessControlOriginType(): String

    /**
     * Specifies which requests CloudFront signs (adds authentication information to).
     *
     * Specify `always` for the most common use case. For more information, see [origin access
     * control advanced
     * settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * This field can have one of the following values:
     *
     * * `always` – CloudFront signs all origin requests, overwriting the `Authorization` header
     * from the viewer request if one exists.
     * * `never` – CloudFront doesn't sign any origin requests. This value turns off origin access
     * control for all origins in all distributions that use this origin access control.
     * * `no-override` – If the viewer request doesn't contain the `Authorization` header, then
     * CloudFront signs the origin request. If the viewer request contains the `Authorization` header,
     * then CloudFront doesn't sign the origin request and instead passes along the `Authorization`
     * header from the viewer request. *WARNING: To pass along the `Authorization` header from the
     * viewer request, you *must* add the `Authorization` header to a [cache
     * policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html)
     * for all cache behaviors that use origins associated with this origin access control.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
     */
    public fun signingBehavior(): String

    /**
     * The signing protocol of the origin access control, which determines how CloudFront signs
     * (authenticates) requests.
     *
     * The only valid value is `sigv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingprotocol)
     */
    public fun signingProtocol(): String

    /**
     * A builder for [OriginAccessControlConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the origin access control.
       */
      public fun description(description: String)

      /**
       * @param name A name to identify the origin access control. 
       * You can specify up to 64 characters.
       */
      public fun name(name: String)

      /**
       * @param originAccessControlOriginType The type of origin that this origin access control is
       * for. 
       */
      public fun originAccessControlOriginType(originAccessControlOriginType: String)

      /**
       * @param signingBehavior Specifies which requests CloudFront signs (adds authentication
       * information to). 
       * Specify `always` for the most common use case. For more information, see [origin access
       * control advanced
       * settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * This field can have one of the following values:
       *
       * * `always` – CloudFront signs all origin requests, overwriting the `Authorization` header
       * from the viewer request if one exists.
       * * `never` – CloudFront doesn't sign any origin requests. This value turns off origin access
       * control for all origins in all distributions that use this origin access control.
       * * `no-override` – If the viewer request doesn't contain the `Authorization` header, then
       * CloudFront signs the origin request. If the viewer request contains the `Authorization`
       * header, then CloudFront doesn't sign the origin request and instead passes along the
       * `Authorization` header from the viewer request. *WARNING: To pass along the `Authorization`
       * header from the viewer request, you *must* add the `Authorization` header to a [cache
       * policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html)
       * for all cache behaviors that use origins associated with this origin access control.*
       */
      public fun signingBehavior(signingBehavior: String)

      /**
       * @param signingProtocol The signing protocol of the origin access control, which determines
       * how CloudFront signs (authenticates) requests. 
       * The only valid value is `sigv4` .
       */
      public fun signingProtocol(signingProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty.builder()

      /**
       * @param description A description of the origin access control.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name A name to identify the origin access control. 
       * You can specify up to 64 characters.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param originAccessControlOriginType The type of origin that this origin access control is
       * for. 
       */
      override fun originAccessControlOriginType(originAccessControlOriginType: String) {
        cdkBuilder.originAccessControlOriginType(originAccessControlOriginType)
      }

      /**
       * @param signingBehavior Specifies which requests CloudFront signs (adds authentication
       * information to). 
       * Specify `always` for the most common use case. For more information, see [origin access
       * control advanced
       * settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * This field can have one of the following values:
       *
       * * `always` – CloudFront signs all origin requests, overwriting the `Authorization` header
       * from the viewer request if one exists.
       * * `never` – CloudFront doesn't sign any origin requests. This value turns off origin access
       * control for all origins in all distributions that use this origin access control.
       * * `no-override` – If the viewer request doesn't contain the `Authorization` header, then
       * CloudFront signs the origin request. If the viewer request contains the `Authorization`
       * header, then CloudFront doesn't sign the origin request and instead passes along the
       * `Authorization` header from the viewer request. *WARNING: To pass along the `Authorization`
       * header from the viewer request, you *must* add the `Authorization` header to a [cache
       * policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html)
       * for all cache behaviors that use origins associated with this origin access control.*
       */
      override fun signingBehavior(signingBehavior: String) {
        cdkBuilder.signingBehavior(signingBehavior)
      }

      /**
       * @param signingProtocol The signing protocol of the origin access control, which determines
       * how CloudFront signs (authenticates) requests. 
       * The only valid value is `sigv4` .
       */
      override fun signingProtocol(signingProtocol: String) {
        cdkBuilder.signingProtocol(signingProtocol)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty,
    ) : CdkObject(cdkObject), OriginAccessControlConfigProperty {
      /**
       * A description of the origin access control.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A name to identify the origin access control.
       *
       * You can specify up to 64 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of origin that this origin access control is for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-originaccesscontrolorigintype)
       */
      override fun originAccessControlOriginType(): String =
          unwrap(this).getOriginAccessControlOriginType()

      /**
       * Specifies which requests CloudFront signs (adds authentication information to).
       *
       * Specify `always` for the most common use case. For more information, see [origin access
       * control advanced
       * settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * This field can have one of the following values:
       *
       * * `always` – CloudFront signs all origin requests, overwriting the `Authorization` header
       * from the viewer request if one exists.
       * * `never` – CloudFront doesn't sign any origin requests. This value turns off origin access
       * control for all origins in all distributions that use this origin access control.
       * * `no-override` – If the viewer request doesn't contain the `Authorization` header, then
       * CloudFront signs the origin request. If the viewer request contains the `Authorization`
       * header, then CloudFront doesn't sign the origin request and instead passes along the
       * `Authorization` header from the viewer request. *WARNING: To pass along the `Authorization`
       * header from the viewer request, you *must* add the `Authorization` header to a [cache
       * policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html)
       * for all cache behaviors that use origins associated with this origin access control.*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingbehavior)
       */
      override fun signingBehavior(): String = unwrap(this).getSigningBehavior()

      /**
       * The signing protocol of the origin access control, which determines how CloudFront signs
       * (authenticates) requests.
       *
       * The only valid value is `sigv4` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig-signingprotocol)
       */
      override fun signingProtocol(): String = unwrap(this).getSigningProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginAccessControlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty):
          OriginAccessControlConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginAccessControlConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl.OriginAccessControlConfigProperty
    }
  }
}
