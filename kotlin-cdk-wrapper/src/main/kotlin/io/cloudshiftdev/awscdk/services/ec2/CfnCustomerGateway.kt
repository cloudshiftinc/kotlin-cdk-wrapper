@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a customer gateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnCustomerGateway cfnCustomerGateway = CfnCustomerGateway.Builder.create(this,
 * "MyCfnCustomerGateway")
 * .ipAddress("ipAddress")
 * .type("type")
 * // the properties below are optional
 * .bgpAsn(123)
 * .bgpAsnExtended(123)
 * .certificateArn("certificateArn")
 * .deviceName("deviceName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html)
 */
public open class CfnCustomerGateway(
  cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGateway,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomerGatewayProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnCustomerGateway(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomerGatewayProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomerGatewayProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomerGatewayProps(props)
  )

  /**
   * The ID of the customer gateway.
   */
  public open fun attrCustomerGatewayId(): String = unwrap(this).getAttrCustomerGatewayId()

  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   */
  public open fun bgpAsn(): Number? = unwrap(this).getBgpAsn()

  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   */
  public open fun bgpAsn(`value`: Number) {
    unwrap(this).setBgpAsn(`value`)
  }

  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   */
  public open fun bgpAsnExtended(): Number? = unwrap(this).getBgpAsnExtended()

  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   */
  public open fun bgpAsnExtended(`value`: Number) {
    unwrap(this).setBgpAsnExtended(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) for the customer gateway certificate.
   */
  public open fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The Amazon Resource Name (ARN) for the customer gateway certificate.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * The name of customer gateway device.
   */
  public open fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * The name of customer gateway device.
   */
  public open fun deviceName(`value`: String) {
    unwrap(this).setDeviceName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The IP address for the customer gateway device's outside interface.
   */
  public open fun ipAddress(): String = unwrap(this).getIpAddress()

  /**
   * The IP address for the customer gateway device's outside interface.
   */
  public open fun ipAddress(`value`: String) {
    unwrap(this).setIpAddress(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * One or more tags for the customer gateway.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * One or more tags for the customer gateway.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * One or more tags for the customer gateway.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnCustomerGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * For customer gateway devices that support BGP, specify the device's ASN.
     *
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Default: 65000
     *
     * Valid values: `1` to `2,147,483,647`
     *
     * Default: - 65000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
     * @param bgpAsn For customer gateway devices that support BGP, specify the device's ASN. 
     */
    public fun bgpAsn(bgpAsn: Number)

    /**
     * For customer gateway devices that support BGP, specify the device's ASN.
     *
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Valid values: `2,147,483,648` to `4,294,967,295`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasnextended)
     * @param bgpAsnExtended For customer gateway devices that support BGP, specify the device's
     * ASN. 
     */
    public fun bgpAsnExtended(bgpAsnExtended: Number)

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * The name of customer gateway device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
     * @param deviceName The name of customer gateway device. 
     */
    public fun deviceName(deviceName: String)

    /**
     * The IP address for the customer gateway device's outside interface.
     *
     * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set
     * to `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If
     * `OutsideIpAddressType` is set to `Ipv6` , you can use an IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
     * @param ipAddress The IP address for the customer gateway device's outside interface. 
     */
    public fun ipAddress(ipAddress: String)

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     * @param tags One or more tags for the customer gateway. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     * @param tags One or more tags for the customer gateway. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder =
        software.amazon.awscdk.services.ec2.CfnCustomerGateway.Builder.create(scope, id)

    /**
     * For customer gateway devices that support BGP, specify the device's ASN.
     *
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Default: 65000
     *
     * Valid values: `1` to `2,147,483,647`
     *
     * Default: - 65000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
     * @param bgpAsn For customer gateway devices that support BGP, specify the device's ASN. 
     */
    override fun bgpAsn(bgpAsn: Number) {
      cdkBuilder.bgpAsn(bgpAsn)
    }

    /**
     * For customer gateway devices that support BGP, specify the device's ASN.
     *
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Valid values: `2,147,483,648` to `4,294,967,295`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasnextended)
     * @param bgpAsnExtended For customer gateway devices that support BGP, specify the device's
     * ASN. 
     */
    override fun bgpAsnExtended(bgpAsnExtended: Number) {
      cdkBuilder.bgpAsnExtended(bgpAsnExtended)
    }

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-certificatearn)
     * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * The name of customer gateway device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
     * @param deviceName The name of customer gateway device. 
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * The IP address for the customer gateway device's outside interface.
     *
     * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set
     * to `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If
     * `OutsideIpAddressType` is set to `Ipv6` , you can use an IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
     * @param ipAddress The IP address for the customer gateway device's outside interface. 
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     * @param tags One or more tags for the customer gateway. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     * @param tags One or more tags for the customer gateway. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCustomerGateway = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnCustomerGateway.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomerGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomerGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGateway):
        CfnCustomerGateway = CfnCustomerGateway(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGateway):
        software.amazon.awscdk.services.ec2.CfnCustomerGateway = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnCustomerGateway
  }
}
