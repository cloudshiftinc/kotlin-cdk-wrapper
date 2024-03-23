@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An abstract Provider of IpAddresses.
 *
 * Note this is specific to the IPv4 CIDR.
 *
 * Example:
 *
 * ```
 * Vpc vpc = Vpc.Builder.create(this, "TheVPC")
 * // 'IpAddresses' configures the IP range and size of the entire VPC.
 * // The IP space will be divided based on configuration for the subnets.
 * .ipAddresses(IpAddresses.cidr("10.0.0.0/21"))
 * // 'maxAzs' configures the maximum number of availability zones to use.
 * // If you want to specify the exact availability zones you want the VPC
 * // to use, use `availabilityZones` instead.
 * .maxAzs(3)
 * // 'subnetConfiguration' specifies the "subnet groups" to create.
 * // Every subnet group will have a subnet for each AZ, so this
 * // configuration will create `3 groups × 3 AZs = 9` subnets.
 * .subnetConfiguration(List.of(SubnetConfiguration.builder()
 * // 'subnetType' controls Internet access, as described above.
 * .subnetType(SubnetType.PUBLIC)
 * // 'name' is used to name this particular subnet group. You will have to
 * // use the name for subnet selection if you have more than one subnet
 * // group of the same type.
 * .name("Ingress")
 * // 'cidrMask' specifies the IP addresses in the range of of individual
 * // subnets in the group. Each of the subnets in this group will contain
 * // `2^(32 address bits - 24 subnet bits) - 2 reserved addresses = 254`
 * // usable IP addresses.
 * //
 * // If 'cidrMask' is left out the available address space is evenly
 * // divided across the remaining subnet groups.
 * .cidrMask(24)
 * .build(), SubnetConfiguration.builder()
 * .cidrMask(24)
 * .name("Application")
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build(), SubnetConfiguration.builder()
 * .cidrMask(28)
 * .name("Database")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // 'reserved' can be used to reserve IP address space. No resources will
 * // be created for this subnet, but the IP range will be kept available for
 * // future creation of this subnet, or even for future subdivision.
 * .reserved(true)
 * .build()))
 * .build();
 * ```
 */
public open class IpAddresses(
  cdkObject: software.amazon.awscdk.services.ec2.IpAddresses,
) : CdkObject(cdkObject) {
  public companion object {
    public fun awsIpamAllocation(props: AwsIpamProps): IIpAddresses =
        software.amazon.awscdk.services.ec2.IpAddresses.awsIpamAllocation(props.let(AwsIpamProps::unwrap)).let(IIpAddresses::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27407714c0d9440af0c80765721b424fa3415f353924aba4901f276414c99cb4")
    public fun awsIpamAllocation(props: AwsIpamProps.Builder.() -> Unit): IIpAddresses =
        awsIpamAllocation(AwsIpamProps(props))

    public fun cidr(cidrBlock: String): IIpAddresses =
        software.amazon.awscdk.services.ec2.IpAddresses.cidr(cidrBlock).let(IIpAddresses::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IpAddresses): IpAddresses =
        IpAddresses(cdkObject)

    internal fun unwrap(wrapped: IpAddresses): software.amazon.awscdk.services.ec2.IpAddresses =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.IpAddresses
  }
}
