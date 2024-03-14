package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCProps {
  /**
   * The IPv4 network range for the VPC, in CIDR notation.
   *
   * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form; for
   * example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
   *
   * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-cidrblock)
   */
  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  /**
   * Indicates whether the instances launched in the VPC get DNS hostnames.
   *
   * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default
   * for nondefault VPCs. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * You can only enable DNS hostnames if you've enabled DNS support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
   */
  public fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

  /**
   * Indicates whether the DNS resolution is supported for the VPC.
   *
   * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the
   * reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the
   * Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not
   * enabled. Enabled by default. For more information, see [DNS attributes in your
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
   */
  public fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

  /**
   * The allowed tenancy of instances launched into the VPC.
   *
   * * `default` : An instance launched into the VPC runs on shared hardware by default, unless you
   * explicitly specify a different tenancy during instance launch.
   * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default, unless
   * you explicitly specify a tenancy of `host` during instance launch. You cannot specify a tenancy of
   * `default` during instance launch.
   *
   * Updating `InstanceTenancy` requires no replacement only if you are updating its value from
   * `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated` requires
   * replacement.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-instancetenancy)
   */
  public fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

  /**
   * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR.
   *
   * For more information, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4ipampoolid)
   */
  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  /**
   * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC IP
   * Address Manager (IPAM) pool.
   *
   * For more information about IPAM, see [What is
   * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC IPAM
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4netmasklength)
   */
  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  /**
   * The tags for the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnVPCProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrBlock The IPv4 network range for the VPC, in CIDR notation.
     * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form; for
     * example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     */
    public fun cidrBlock(cidrBlock: String)

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
     * hostnames.
     * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
     * default for nondefault VPCs. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * You can only enable DNS hostnames if you've enabled DNS support.
     */
    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
     * hostnames.
     * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
     * default for nondefault VPCs. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * You can only enable DNS hostnames if you've enabled DNS support.
     */
    public fun enableDnsHostnames(enableDnsHostnames: IResolvable)

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or
     * the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled,
     * the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is
     * not enabled. Enabled by default. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     */
    public fun enableDnsSupport(enableDnsSupport: Boolean)

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or
     * the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled,
     * the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is
     * not enabled. Enabled by default. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     */
    public fun enableDnsSupport(enableDnsSupport: IResolvable)

    /**
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     * * `default` : An instance launched into the VPC runs on shared hardware by default, unless
     * you explicitly specify a different tenancy during instance launch.
     * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default,
     * unless you explicitly specify a tenancy of `host` during instance launch. You cannot specify a
     * tenancy of `default` during instance launch.
     *
     * Updating `InstanceTenancy` requires no replacement only if you are updating its value from
     * `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated` requires
     * replacement.
     */
    public fun instanceTenancy(instanceTenancy: String)

    /**
     * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this VPC's
     * CIDR.
     * For more information, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    /**
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this VPC
     * from an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    /**
     * @param tags The tags for the VPC.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the VPC.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCProps.builder()

    /**
     * @param cidrBlock The IPv4 network range for the VPC, in CIDR notation.
     * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form; for
     * example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     */
    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
     * hostnames.
     * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
     * default for nondefault VPCs. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * You can only enable DNS hostnames if you've enabled DNS support.
     */
    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    /**
     * @param enableDnsHostnames Indicates whether the instances launched in the VPC get DNS
     * hostnames.
     * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
     * default for nondefault VPCs. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * You can only enable DNS hostnames if you've enabled DNS support.
     */
    override fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames.let(IResolvable::unwrap))
    }

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or
     * the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled,
     * the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is
     * not enabled. Enabled by default. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     */
    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    /**
     * @param enableDnsSupport Indicates whether the DNS resolution is supported for the VPC.
     * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or
     * the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled,
     * the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is
     * not enabled. Enabled by default. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     */
    override fun enableDnsSupport(enableDnsSupport: IResolvable) {
      cdkBuilder.enableDnsSupport(enableDnsSupport.let(IResolvable::unwrap))
    }

    /**
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     * * `default` : An instance launched into the VPC runs on shared hardware by default, unless
     * you explicitly specify a different tenancy during instance launch.
     * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default,
     * unless you explicitly specify a tenancy of `host` during instance launch. You cannot specify a
     * tenancy of `default` during instance launch.
     *
     * Updating `InstanceTenancy` requires no replacement only if you are updating its value from
     * `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated` requires
     * replacement.
     */
    override fun instanceTenancy(instanceTenancy: String) {
      cdkBuilder.instanceTenancy(instanceTenancy)
    }

    /**
     * @param ipv4IpamPoolId The ID of an IPv4 IPAM pool you want to use for allocating this VPC's
     * CIDR.
     * For more information, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     */
    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /**
     * @param ipv4NetmaskLength The netmask length of the IPv4 CIDR you want to allocate to this VPC
     * from an Amazon VPC IP Address Manager (IPAM) pool.
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     */
    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * @param tags The tags for the VPC.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the VPC.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCProps,
  ) : CdkObject(cdkObject), CfnVPCProps {
    /**
     * The IPv4 network range for the VPC, in CIDR notation.
     *
     * For example, `10.0.0.0/16` . We modify the specified CIDR block to its canonical form; for
     * example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18` .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-cidrblock)
     */
    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames.
     *
     * If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by
     * default for nondefault VPCs. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * You can only enable DNS hostnames if you've enabled DNS support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednshostnames)
     */
    override fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

    /**
     * Indicates whether the DNS resolution is supported for the VPC.
     *
     * If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or
     * the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled,
     * the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is
     * not enabled. Enabled by default. For more information, see [DNS attributes in your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-dns.html#vpc-dns-support) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-enablednssupport)
     */
    override fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

    /**
     * The allowed tenancy of instances launched into the VPC.
     *
     * * `default` : An instance launched into the VPC runs on shared hardware by default, unless
     * you explicitly specify a different tenancy during instance launch.
     * * `dedicated` : An instance launched into the VPC runs on dedicated hardware by default,
     * unless you explicitly specify a tenancy of `host` during instance launch. You cannot specify a
     * tenancy of `default` during instance launch.
     *
     * Updating `InstanceTenancy` requires no replacement only if you are updating its value from
     * `dedicated` to `default` . Updating `InstanceTenancy` from `default` to `dedicated` requires
     * replacement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-instancetenancy)
     */
    override fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR.
     *
     * For more information, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * You must specify either `CidrBlock` or `Ipv4IpamPoolId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4ipampoolid)
     */
    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC from an Amazon VPC IP
     * Address Manager (IPAM) pool.
     *
     * For more information about IPAM, see [What is
     * IPAM?](https://docs.aws.amazon.com//vpc/latest/ipam/what-is-it-ipam.html) in the *Amazon VPC
     * IPAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-ipv4netmasklength)
     */
    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    /**
     * The tags for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc.html#cfn-ec2-vpc-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCProps): CfnVPCProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCProps): software.amazon.awscdk.services.ec2.CfnVPCProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCProps
  }
}
