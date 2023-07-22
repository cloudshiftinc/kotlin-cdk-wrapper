@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.CommonClusterOptions
import software.amazon.awscdk.services.eks.KubernetesVersion
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for configuring an EKS cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.eks.*;
 * import software.amazon.awscdk.services.iam.*;
 * KubernetesVersion kubernetesVersion;
 * Role role;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * CommonClusterOptions commonClusterOptions = CommonClusterOptions.builder()
 * .version(kubernetesVersion)
 * // the properties below are optional
 * .clusterName("clusterName")
 * .outputClusterName(false)
 * .outputConfigCommand(false)
 * .role(role)
 * .securityGroup(securityGroup)
 * .vpc(vpc)
 * .vpcSubnets(List.of(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonClusterOptionsDsl {
  private val cdkBuilder: CommonClusterOptions.Builder = CommonClusterOptions.builder()

  private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

  /**
   * @param clusterName Name for the cluster.
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param outputClusterName Determines whether a CloudFormation output with the name of the
   * cluster will be synthesized.
   */
  public fun outputClusterName(outputClusterName: Boolean) {
    cdkBuilder.outputClusterName(outputClusterName)
  }

  /**
   * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
   * update-kubeconfig` command will be synthesized.
   * This command will include
   * the cluster name and, if applicable, the ARN of the masters IAM role.
   */
  public fun outputConfigCommand(outputConfigCommand: Boolean) {
    cdkBuilder.outputConfigCommand(outputConfigCommand)
  }

  /**
   * @param role Role that provides permissions for the Kubernetes control plane to make calls to
   * AWS API operations on your behalf.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param securityGroup Security Group to use for Control Plane ENIs.
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * @param version The Kubernetes version to run in the cluster. 
   */
  public fun version(version: KubernetesVersion) {
    cdkBuilder.version(version)
  }

  /**
   * @param vpc The VPC in which to create the Cluster.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Where to place EKS Control Plane ENIs.
   * If you want to create public load balancers, this must include public subnets.
   *
   * For example, to only select private subnets, supply the following:
   *
   * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
    _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
  }

  /**
   * @param vpcSubnets Where to place EKS Control Plane ENIs.
   * If you want to create public load balancers, this must include public subnets.
   *
   * For example, to only select private subnets, supply the following:
   *
   * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
   */
  public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
    _vpcSubnets.addAll(vpcSubnets)
  }

  public fun build(): CommonClusterOptions {
    if(_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
    return cdkBuilder.build()
  }
}
