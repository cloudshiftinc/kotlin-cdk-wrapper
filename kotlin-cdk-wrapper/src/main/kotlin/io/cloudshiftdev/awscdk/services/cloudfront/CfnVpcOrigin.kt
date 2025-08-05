@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Amazon CloudFront VPC origin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnVpcOrigin cfnVpcOrigin = CfnVpcOrigin.Builder.create(this, "MyCfnVpcOrigin")
 * .vpcOriginEndpointConfig(VpcOriginEndpointConfigProperty.builder()
 * .arn("arn")
 * .name("name")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originProtocolPolicy("originProtocolPolicy")
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html)
 */
public open class CfnVpcOrigin(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOrigin,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcOriginProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnVpcOrigin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVpcOriginProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcOriginProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcOriginProps(props)
  )

  /**
   * The VPC origin ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The VPC origin created time.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The VPC origin ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The VPC origin last modified time.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The VPC origin status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The VPC origin endpoint configuration.
   */
  public open fun vpcOriginEndpointConfig(): Any = unwrap(this).getVpcOriginEndpointConfig()

  /**
   * The VPC origin endpoint configuration.
   */
  public open fun vpcOriginEndpointConfig(`value`: IResolvable) {
    unwrap(this).setVpcOriginEndpointConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC origin endpoint configuration.
   */
  public open fun vpcOriginEndpointConfig(`value`: VpcOriginEndpointConfigProperty) {
    unwrap(this).setVpcOriginEndpointConfig(`value`.let(VpcOriginEndpointConfigProperty.Companion::unwrap))
  }

  /**
   * The VPC origin endpoint configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a582b8efa340e3efdf0af852bdd4000c7511ce425a2b95c045510821ae4f376")
  public open
      fun vpcOriginEndpointConfig(`value`: VpcOriginEndpointConfigProperty.Builder.() -> Unit): Unit
      = vpcOriginEndpointConfig(VpcOriginEndpointConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnVpcOrigin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    public fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: IResolvable)

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    public fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: VpcOriginEndpointConfigProperty)

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ee8f89706e5970fd1b4c149686c81407a48fad7b1eb93446d73d9345b5e153")
    public
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: VpcOriginEndpointConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.Builder =
        software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.Builder.create(scope, id)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    override fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: IResolvable) {
      cdkBuilder.vpcOriginEndpointConfig(vpcOriginEndpointConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    override fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: VpcOriginEndpointConfigProperty) {
      cdkBuilder.vpcOriginEndpointConfig(vpcOriginEndpointConfig.let(VpcOriginEndpointConfigProperty.Companion::unwrap))
    }

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29ee8f89706e5970fd1b4c149686c81407a48fad7b1eb93446d73d9345b5e153")
    override
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: VpcOriginEndpointConfigProperty.Builder.() -> Unit):
        Unit = vpcOriginEndpointConfig(VpcOriginEndpointConfigProperty(vpcOriginEndpointConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnVpcOrigin = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcOrigin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOrigin):
        CfnVpcOrigin = CfnVpcOrigin(cdkObject)

    internal fun unwrap(wrapped: CfnVpcOrigin):
        software.amazon.awscdk.services.cloudfront.CfnVpcOrigin = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnVpcOrigin
  }

  /**
   * An Amazon CloudFront VPC origin endpoint configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * VpcOriginEndpointConfigProperty vpcOriginEndpointConfigProperty =
   * VpcOriginEndpointConfigProperty.builder()
   * .arn("arn")
   * .name("name")
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .originProtocolPolicy("originProtocolPolicy")
   * .originSslProtocols(List.of("originSslProtocols"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html)
   */
  public interface VpcOriginEndpointConfigProperty {
    /**
     * The ARN of the CloudFront VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-arn)
     */
    public fun arn(): String

    /**
     * The HTTP port for the CloudFront VPC origin endpoint configuration.
     *
     * The default value is `80` .
     *
     * Default: - 80
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-httpport)
     */
    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The HTTPS port of the CloudFront VPC origin endpoint configuration.
     *
     * The default value is `443` .
     *
     * Default: - 443
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-httpsport)
     */
    public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * The name of the CloudFront VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-name)
     */
    public fun name(): String

    /**
     * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
     *
     * Default: - "match-viewer"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-originprotocolpolicy)
     */
    public fun originProtocolPolicy(): String? = unwrap(this).getOriginProtocolPolicy()

    /**
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin
     * over HTTPS.
     *
     * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
     *
     * For more information, see [Minimum Origin SSL
     * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-originsslprotocols)
     */
    public fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
        emptyList()

    /**
     * A builder for [VpcOriginEndpointConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the CloudFront VPC origin endpoint configuration. 
       */
      public fun arn(arn: String)

      /**
       * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
       * The default value is `80` .
       */
      public fun httpPort(httpPort: Number)

      /**
       * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
       * The default value is `443` .
       */
      public fun httpsPort(httpsPort: Number)

      /**
       * @param name The name of the CloudFront VPC origin endpoint configuration. 
       */
      public fun name(name: String)

      /**
       * @param originProtocolPolicy The origin protocol policy for the CloudFront VPC origin
       * endpoint configuration.
       */
      public fun originProtocolPolicy(originProtocolPolicy: String)

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originSslProtocols(originSslProtocols: List<String>)

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originSslProtocols(vararg originSslProtocols: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty.builder()

      /**
       * @param arn The ARN of the CloudFront VPC origin endpoint configuration. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
       * The default value is `80` .
       */
      override fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
      }

      /**
       * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
       * The default value is `443` .
       */
      override fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
      }

      /**
       * @param name The name of the CloudFront VPC origin endpoint configuration. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param originProtocolPolicy The origin protocol policy for the CloudFront VPC origin
       * endpoint configuration.
       */
      override fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
      }

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originSslProtocols(originSslProtocols: List<String>) {
        cdkBuilder.originSslProtocols(originSslProtocols)
      }

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originSslProtocols(vararg originSslProtocols: String): Unit =
          originSslProtocols(originSslProtocols.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty,
    ) : CdkObject(cdkObject),
        VpcOriginEndpointConfigProperty {
      /**
       * The ARN of the CloudFront VPC origin endpoint configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The HTTP port for the CloudFront VPC origin endpoint configuration.
       *
       * The default value is `80` .
       *
       * Default: - 80
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-httpport)
       */
      override fun httpPort(): Number? = unwrap(this).getHttpPort()

      /**
       * The HTTPS port of the CloudFront VPC origin endpoint configuration.
       *
       * The default value is `443` .
       *
       * Default: - 443
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-httpsport)
       */
      override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

      /**
       * The name of the CloudFront VPC origin endpoint configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
       *
       * Default: - "match-viewer"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-originprotocolpolicy)
       */
      override fun originProtocolPolicy(): String? = unwrap(this).getOriginProtocolPolicy()

      /**
       * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin
       * over HTTPS.
       *
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DownloadDistValuesOrigin.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-vpcorigin-vpcoriginendpointconfig.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig-originsslprotocols)
       */
      override fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOriginEndpointConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty):
          VpcOriginEndpointConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcOriginEndpointConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOriginEndpointConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnVpcOrigin.VpcOriginEndpointConfigProperty
    }
  }
}
