@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterKubernetesNetworkConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.KubernetesNetworkConfigProperty.Builder =
      CfnCluster.KubernetesNetworkConfigProperty.builder()

  /**
   * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
   * addresses.
   * If you don't specify a value, `ipv4` is used by default. You can only specify an IP family when
   * you create a cluster and can't change this value once the cluster is created. If you specify
   * `ipv6` , the VPC and subnets that you specify for cluster creation must have both `IPv4` and
   * `IPv6` CIDR blocks assigned to them. You can't specify `ipv6` for clusters in China Regions.
   *
   * You can only specify `ipv6` for `1.21` and later clusters that use version `1.10.1` or later of
   * the Amazon VPC CNI add-on. If you specify `ipv6` , then ensure that your VPC meets the
   * requirements listed in the considerations listed in [Assigning IPv6 addresses to pods and
   * services](https://docs.aws.amazon.com/eks/latest/userguide/cni-ipv6.html) in the Amazon EKS User
   * Guide. Kubernetes assigns services `IPv6` addresses from the unique local address range
   * `(fc00::/7)` . You can't specify a custom `IPv6` CIDR block. Pod addresses are assigned from the
   * subnet's `IPv6` CIDR.
   */
  public fun ipFamily(ipFamily: String) {
    cdkBuilder.ipFamily(ipFamily)
  }

  /**
   * @param serviceIpv4Cidr Don't specify a value if you select `ipv6` for *ipFamily* .
   * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block,
   * Kubernetes assigns addresses from either the `10.100.0.0/16` or `172.20.0.0/16` CIDR blocks. We
   * recommend that you specify a block that does not overlap with resources in other networks that are
   * peered or connected to your VPC. The block must meet the following requirements:
   *
   * * Within one of the following private IP address blocks: `10.0.0.0/8` , `172.16.0.0/12` , or
   * `192.168.0.0/16` .
   * * Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.
   * * Between /24 and /12.
   *
   *
   * You can only specify a custom CIDR block when you create a cluster and can't change this value
   * once the cluster is created.
   */
  public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
    cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
  }

  /**
   * @param serviceIpv6Cidr The CIDR block that Kubernetes pod and service IP addresses are assigned
   * from if you created a 1.21 or later cluster with version 1.10.1 or later of the Amazon VPC CNI
   * add-on and specified `ipv6` for *ipFamily* when you created the cluster. Kubernetes assigns
   * service addresses from the unique local address range ( `fc00::/7` ) because you can't specify a
   * custom IPv6 CIDR block when you create the cluster.
   */
  public fun serviceIpv6Cidr(serviceIpv6Cidr: String) {
    cdkBuilder.serviceIpv6Cidr(serviceIpv6Cidr)
  }

  public fun build(): CfnCluster.KubernetesNetworkConfigProperty = cdkBuilder.build()
}
