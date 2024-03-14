package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMPoolCidr internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The IPAM pool CIDR ID.
   */
  public open fun attrIpamPoolCidrId(): String = unwrap(this).getAttrIpamPoolCidrId()

  /**
   * The state of the CIDR.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The CIDR provisioned to the IPAM pool.
   */
  public open fun cidr(): String? = unwrap(this).getCidr()

  /**
   * The CIDR provisioned to the IPAM pool.
   */
  public open fun cidr(`value`: String) {
    unwrap(this).setCidr(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the IPAM pool.
   */
  public open fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

  /**
   * The ID of the IPAM pool.
   */
  public open fun ipamPoolId(`value`: String) {
    unwrap(this).setIpamPoolId(`value`)
  }

  /**
   * The netmask length of the CIDR you'd like to provision to a pool.
   */
  public open fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  /**
   * The netmask length of the CIDR you'd like to provision to a pool.
   */
  public open fun netmaskLength(`value`: Number) {
    unwrap(this).setNetmaskLength(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnIPAMPoolCidr].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-cidr)
     * @param cidr The CIDR provisioned to the IPAM pool. 
     */
    public fun cidr(cidr: String)

    /**
     * The ID of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-ipampoolid)
     * @param ipamPoolId The ID of the IPAM pool. 
     */
    public fun ipamPoolId(ipamPoolId: String)

    /**
     * The netmask length of the CIDR you'd like to provision to a pool.
     *
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-netmasklength)
     * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool. 
     */
    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr.Builder.create(scope, id)

    /**
     * The CIDR provisioned to the IPAM pool.
     *
     * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
     * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR
     * example is `2001:DB8::/32` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-cidr)
     * @param cidr The CIDR provisioned to the IPAM pool. 
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * The ID of the IPAM pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-ipampoolid)
     * @param ipamPoolId The ID of the IPAM pool. 
     */
    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    /**
     * The netmask length of the CIDR you'd like to provision to a pool.
     *
     * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for
     * provisioning CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to
     * top-level pools. "NetmaskLength" or "Cidr" is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html#cfn-ec2-ipampoolcidr-netmasklength)
     * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool. 
     */
    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMPoolCidr {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMPoolCidr(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr):
        CfnIPAMPoolCidr = CfnIPAMPoolCidr(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMPoolCidr):
        software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr = wrapped.cdkObject
  }
}
