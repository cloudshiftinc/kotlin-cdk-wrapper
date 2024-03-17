@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEIP`.
 *
 * Example:
 *
 * ```
 * Instance instance;
 * HostedZone myZone;
 * CfnEIP elasticIp = CfnEIP.Builder.create(this, "EIP")
 * .domain("vpc")
 * .instanceId(instance.getInstanceId())
 * .build();
 * ARecord.Builder.create(this, "ARecord")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses(elasticIp.getRef()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html)
 */
public interface CfnEIPProps {
  /**
   * The network ( `vpc` ).
   *
   * If you define an Elastic IP address and associate it with a VPC that is defined in the same
   * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * on this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The ID of the instance.
   *
   *
   * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-instanceid)
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises
   * IP addresses.
   *
   * Use this parameter to limit the IP address to this location. IP addresses cannot move between
   * network border groups.
   *
   * Use
   * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
   * to view the network border groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-networkbordergroup)
   */
  public fun networkBorderGroup(): String? = unwrap(this).getNetworkBorderGroup()

  /**
   * The ID of an address pool that you own.
   *
   * Use this parameter to let Amazon EC2 select an address from the address pool.
   *
   *
   * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-publicipv4pool)
   */
  public fun publicIpv4Pool(): String? = unwrap(this).getPublicIpv4Pool()

  /**
   * Any tags assigned to the Elastic IP address.
   *
   *
   * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
   * reassociates the address on its associated resource.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The Elastic IP address you are accepting for transfer.
   *
   * You can only accept one transferred address. For more information on Elastic IP address
   * transfers, see [Transfer Elastic IP
   * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro) in
   * the *Amazon Virtual Private Cloud User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-transferaddress)
   */
  public fun transferAddress(): String? = unwrap(this).getTransferAddress()

  /**
   * A builder for [CfnEIPProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domain The network ( `vpc` ).
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     */
    public fun domain(domain: String)

    /**
     * @param instanceId The ID of the instance.
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength
     * Zones from which AWS advertises IP addresses.
     * Use this parameter to limit the IP address to this location. IP addresses cannot move between
     * network border groups.
     *
     * Use
     * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
     * to view the network border groups.
     */
    public fun networkBorderGroup(networkBorderGroup: String)

    /**
     * @param publicIpv4Pool The ID of an address pool that you own.
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    public fun publicIpv4Pool(publicIpv4Pool: String)

    /**
     * @param tags Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transferAddress The Elastic IP address you are accepting for transfer.
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see [Transfer Elastic IP
     * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun transferAddress(transferAddress: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPProps.builder()

    /**
     * @param domain The network ( `vpc` ).
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param instanceId The ID of the instance.
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param networkBorderGroup A unique set of Availability Zones, Local Zones, or Wavelength
     * Zones from which AWS advertises IP addresses.
     * Use this parameter to limit the IP address to this location. IP addresses cannot move between
     * network border groups.
     *
     * Use
     * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
     * to view the network border groups.
     */
    override fun networkBorderGroup(networkBorderGroup: String) {
      cdkBuilder.networkBorderGroup(networkBorderGroup)
    }

    /**
     * @param publicIpv4Pool The ID of an address pool that you own.
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    override fun publicIpv4Pool(publicIpv4Pool: String) {
      cdkBuilder.publicIpv4Pool(publicIpv4Pool)
    }

    /**
     * @param tags Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the Elastic IP address.
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transferAddress The Elastic IP address you are accepting for transfer.
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see [Transfer Elastic IP
     * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     */
    override fun transferAddress(transferAddress: String) {
      cdkBuilder.transferAddress(transferAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIPProps,
  ) : CdkObject(cdkObject), CfnEIPProps {
    /**
     * The network ( `vpc` ).
     *
     * If you define an Elastic IP address and associate it with a VPC that is defined in the same
     * template, you must declare a dependency on the VPC-gateway attachment by using the [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * on this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The ID of the instance.
     *
     *
     * Updates to the `InstanceId` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-instanceid)
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS
     * advertises IP addresses.
     *
     * Use this parameter to limit the IP address to this location. IP addresses cannot move between
     * network border groups.
     *
     * Use
     * [DescribeAvailabilityZones](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html)
     * to view the network border groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-networkbordergroup)
     */
    override fun networkBorderGroup(): String? = unwrap(this).getNetworkBorderGroup()

    /**
     * The ID of an address pool that you own.
     *
     * Use this parameter to let Amazon EC2 select an address from the address pool.
     *
     *
     * Updates to the `PublicIpv4Pool` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-publicipv4pool)
     */
    override fun publicIpv4Pool(): String? = unwrap(this).getPublicIpv4Pool()

    /**
     * Any tags assigned to the Elastic IP address.
     *
     *
     * Updates to the `Tags` property may require *some interruptions* . Updates on an EIP
     * reassociates the address on its associated resource.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The Elastic IP address you are accepting for transfer.
     *
     * You can only accept one transferred address. For more information on Elastic IP address
     * transfers, see [Transfer Elastic IP
     * addresses](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#transfer-EIPs-intro)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eip.html#cfn-ec2-eip-transferaddress)
     */
    override fun transferAddress(): String? = unwrap(this).getTransferAddress()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEIPProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPProps): CfnEIPProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnEIPProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEIPProps): software.amazon.awscdk.services.ec2.CfnEIPProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnEIPProps
  }
}
