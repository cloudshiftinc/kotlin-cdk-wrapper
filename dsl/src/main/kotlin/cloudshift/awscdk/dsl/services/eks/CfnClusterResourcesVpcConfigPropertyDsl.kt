@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterResourcesVpcConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.ResourcesVpcConfigProperty.Builder =
      CfnCluster.ResourcesVpcConfigProperty.builder()

  private val _publicAccessCidrs: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param endpointPrivateAccess Set this value to `true` to enable private access for your
   * cluster's Kubernetes API server endpoint.
   * If you enable private access, Kubernetes API requests from within your cluster's VPC use the
   * private VPC endpoint. The default value for this parameter is `false` , which disables private
   * access for your Kubernetes API server. If you disable private access and you have nodes or AWS
   * Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the necessary CIDR
   * blocks for communication with the nodes or Fargate pods. For more information, see [Amazon EKS
   * cluster endpoint access
   * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
   * EKS User Guide** .
   */
  public fun endpointPrivateAccess(endpointPrivateAccess: Boolean) {
    cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
  }

  /**
   * @param endpointPrivateAccess Set this value to `true` to enable private access for your
   * cluster's Kubernetes API server endpoint.
   * If you enable private access, Kubernetes API requests from within your cluster's VPC use the
   * private VPC endpoint. The default value for this parameter is `false` , which disables private
   * access for your Kubernetes API server. If you disable private access and you have nodes or AWS
   * Fargate pods in the cluster, then ensure that `publicAccessCidrs` includes the necessary CIDR
   * blocks for communication with the nodes or Fargate pods. For more information, see [Amazon EKS
   * cluster endpoint access
   * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
   * EKS User Guide** .
   */
  public fun endpointPrivateAccess(endpointPrivateAccess: IResolvable) {
    cdkBuilder.endpointPrivateAccess(endpointPrivateAccess)
  }

  /**
   * @param endpointPublicAccess Set this value to `false` to disable public access to your
   * cluster's Kubernetes API server endpoint.
   * If you disable public access, your cluster's Kubernetes API server can only receive requests
   * from within the cluster VPC. The default value for this parameter is `true` , which enables public
   * access for your Kubernetes API server. For more information, see [Amazon EKS cluster endpoint
   * access control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
   * **Amazon EKS User Guide** .
   */
  public fun endpointPublicAccess(endpointPublicAccess: Boolean) {
    cdkBuilder.endpointPublicAccess(endpointPublicAccess)
  }

  /**
   * @param endpointPublicAccess Set this value to `false` to disable public access to your
   * cluster's Kubernetes API server endpoint.
   * If you disable public access, your cluster's Kubernetes API server can only receive requests
   * from within the cluster VPC. The default value for this parameter is `true` , which enables public
   * access for your Kubernetes API server. For more information, see [Amazon EKS cluster endpoint
   * access control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the
   * **Amazon EKS User Guide** .
   */
  public fun endpointPublicAccess(endpointPublicAccess: IResolvable) {
    cdkBuilder.endpointPublicAccess(endpointPublicAccess)
  }

  /**
   * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
   * Kubernetes API server endpoint.
   * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
   * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access and you have
   * nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
   * For more information, see [Amazon EKS cluster endpoint access
   * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
   * EKS User Guide** .
   */
  public fun publicAccessCidrs(vararg publicAccessCidrs: String) {
    _publicAccessCidrs.addAll(listOf(*publicAccessCidrs))
  }

  /**
   * @param publicAccessCidrs The CIDR blocks that are allowed access to your cluster's public
   * Kubernetes API server endpoint.
   * Communication to the endpoint from addresses outside of the CIDR blocks that you specify is
   * denied. The default value is `0.0.0.0/0` . If you've disabled private endpoint access and you have
   * nodes or AWS Fargate pods in the cluster, then ensure that you specify the necessary CIDR blocks.
   * For more information, see [Amazon EKS cluster endpoint access
   * control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html) in the **Amazon
   * EKS User Guide** .
   */
  public fun publicAccessCidrs(publicAccessCidrs: Collection<String>) {
    _publicAccessCidrs.addAll(publicAccessCidrs)
  }

  /**
   * @param securityGroupIds Specify one or more security groups for the cross-account elastic
   * network interfaces that Amazon EKS creates to use that allow communication between your nodes and
   * the Kubernetes control plane.
   * If you don't specify any security groups, then familiarize yourself with the difference between
   * Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see [Amazon EKS
   * security group
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
   * **Amazon EKS User Guide** .
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds Specify one or more security groups for the cross-account elastic
   * network interfaces that Amazon EKS creates to use that allow communication between your nodes and
   * the Kubernetes control plane.
   * If you don't specify any security groups, then familiarize yourself with the difference between
   * Amazon EKS defaults for clusters deployed with Kubernetes. For more information, see [Amazon EKS
   * security group
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
   * **Amazon EKS User Guide** .
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param subnetIds Specify subnets for your Amazon EKS nodes. 
   * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
   * communication between your nodes and the Kubernetes control plane.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds Specify subnets for your Amazon EKS nodes. 
   * Amazon EKS creates cross-account elastic network interfaces in these subnets to allow
   * communication between your nodes and the Kubernetes control plane.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnCluster.ResourcesVpcConfigProperty {
    if(_publicAccessCidrs.isNotEmpty()) cdkBuilder.publicAccessCidrs(_publicAccessCidrs)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
