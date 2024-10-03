@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCustomerGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnCustomerGatewayProps cfnCustomerGatewayProps = CfnCustomerGatewayProps.builder()
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
public interface CfnCustomerGatewayProps {
  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   *
   * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If the
   * ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
   *
   * Default: 65000
   *
   * Valid values: `1` to `2,147,483,647`
   *
   * Default: - 65000
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
   */
  public fun bgpAsn(): Number? = unwrap(this).getBgpAsn()

  /**
   * For customer gateway devices that support BGP, specify the device's ASN.
   *
   * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If the
   * ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
   *
   * Valid values: `2,147,483,648` to `4,294,967,295`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasnextended)
   */
  public fun bgpAsnExtended(): Number? = unwrap(this).getBgpAsnExtended()

  /**
   * The Amazon Resource Name (ARN) for the customer gateway certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-certificatearn)
   */
  public fun certificateArn(): String? = unwrap(this).getCertificateArn()

  /**
   * The name of customer gateway device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
   */
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * IPv4 address for the customer gateway device's outside interface.
   *
   * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set to
   * `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If `OutsideIpAddressType`
   * is set to `PublicIpv4` , you can use a public IPv4 address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
   */
  public fun ipAddress(): String

  /**
   * One or more tags for the customer gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnCustomerGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bgpAsn For customer gateway devices that support BGP, specify the device's ASN.
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Default: 65000
     *
     * Valid values: `1` to `2,147,483,647`
     */
    public fun bgpAsn(bgpAsn: Number)

    /**
     * @param bgpAsnExtended For customer gateway devices that support BGP, specify the device's
     * ASN.
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Valid values: `2,147,483,648` to `4,294,967,295`
     */
    public fun bgpAsnExtended(bgpAsnExtended: Number)

    /**
     * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param deviceName The name of customer gateway device.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param ipAddress IPv4 address for the customer gateway device's outside interface. 
     * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set
     * to `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If
     * `OutsideIpAddressType` is set to `PublicIpv4` , you can use a public IPv4 address.
     */
    public fun ipAddress(ipAddress: String)

    /**
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.builder()

    /**
     * @param bgpAsn For customer gateway devices that support BGP, specify the device's ASN.
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Default: 65000
     *
     * Valid values: `1` to `2,147,483,647`
     */
    override fun bgpAsn(bgpAsn: Number) {
      cdkBuilder.bgpAsn(bgpAsn)
    }

    /**
     * @param bgpAsnExtended For customer gateway devices that support BGP, specify the device's
     * ASN.
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Valid values: `2,147,483,648` to `4,294,967,295`
     */
    override fun bgpAsnExtended(bgpAsnExtended: Number) {
      cdkBuilder.bgpAsnExtended(bgpAsnExtended)
    }

    /**
     * @param certificateArn The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param deviceName The name of customer gateway device.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param ipAddress IPv4 address for the customer gateway device's outside interface. 
     * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set
     * to `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If
     * `OutsideIpAddressType` is set to `PublicIpv4` , you can use a public IPv4 address.
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param tags One or more tags for the customer gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags One or more tags for the customer gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps,
  ) : CdkObject(cdkObject),
      CfnCustomerGatewayProps {
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
     */
    override fun bgpAsn(): Number? = unwrap(this).getBgpAsn()

    /**
     * For customer gateway devices that support BGP, specify the device's ASN.
     *
     * You must specify either `BgpAsn` or `BgpAsnExtended` when creating the customer gateway. If
     * the ASN is larger than `2,147,483,647` , you must use `BgpAsnExtended` .
     *
     * Valid values: `2,147,483,648` to `4,294,967,295`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasnextended)
     */
    override fun bgpAsnExtended(): Number? = unwrap(this).getBgpAsnExtended()

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-certificatearn)
     */
    override fun certificateArn(): String? = unwrap(this).getCertificateArn()

    /**
     * The name of customer gateway device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
     */
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * IPv4 address for the customer gateway device's outside interface.
     *
     * The address must be static. If `OutsideIpAddressType` in your VPN connection options is set
     * to `PrivateIpv4` , you can use an RFC6598 or RFC1918 private IPv4 address. If
     * `OutsideIpAddressType` is set to `PublicIpv4` , you can use a public IPv4 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
     */
    override fun ipAddress(): String = unwrap(this).getIpAddress()

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomerGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps):
        CfnCustomerGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomerGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGatewayProps):
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
  }
}
