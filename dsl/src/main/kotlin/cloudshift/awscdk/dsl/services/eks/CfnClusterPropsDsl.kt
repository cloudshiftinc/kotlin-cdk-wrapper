@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .resourcesVpcConfig(ResourcesVpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .endpointPrivateAccess(false)
 * .endpointPublicAccess(false)
 * .publicAccessCidrs(List.of("publicAccessCidrs"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .encryptionConfig(List.of(EncryptionConfigProperty.builder()
 * .provider(ProviderProperty.builder()
 * .keyArn("keyArn")
 * .build())
 * .resources(List.of("resources"))
 * .build()))
 * .kubernetesNetworkConfig(KubernetesNetworkConfigProperty.builder()
 * .ipFamily("ipFamily")
 * .serviceIpv4Cidr("serviceIpv4Cidr")
 * .serviceIpv6Cidr("serviceIpv6Cidr")
 * .build())
 * .logging(LoggingProperty.builder()
 * .clusterLogging(ClusterLoggingProperty.builder()
 * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .name("name")
 * .outpostConfig(OutpostConfigProperty.builder()
 * .controlPlaneInstanceType("controlPlaneInstanceType")
 * .outpostArns(List.of("outpostArns"))
 * // the properties below are optional
 * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
 * .groupName("groupName")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
 */
@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  private val _encryptionConfig: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param encryptionConfig The encryption configuration for the cluster.
   */
  public fun encryptionConfig(vararg encryptionConfig: Any) {
    _encryptionConfig.addAll(listOf(*encryptionConfig))
  }

  /**
   * @param encryptionConfig The encryption configuration for the cluster.
   */
  public fun encryptionConfig(encryptionConfig: Collection<Any>) {
    _encryptionConfig.addAll(encryptionConfig)
  }

  /**
   * @param encryptionConfig The encryption configuration for the cluster.
   */
  public fun encryptionConfig(encryptionConfig: IResolvable) {
    cdkBuilder.encryptionConfig(encryptionConfig)
  }

  /**
   * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
   */
  public fun kubernetesNetworkConfig(kubernetesNetworkConfig: IResolvable) {
    cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
  }

  /**
   * @param kubernetesNetworkConfig The Kubernetes network configuration for the cluster.
   */
  public
      fun kubernetesNetworkConfig(kubernetesNetworkConfig: CfnCluster.KubernetesNetworkConfigProperty) {
    cdkBuilder.kubernetesNetworkConfig(kubernetesNetworkConfig)
  }

  /**
   * @param logging The logging configuration for your cluster.
   */
  public fun logging(logging: IResolvable) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param logging The logging configuration for your cluster.
   */
  public fun logging(logging: CfnCluster.LoggingProperty) {
    cdkBuilder.logging(logging)
  }

  /**
   * @param name The unique name to give to your cluster.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param outpostConfig An object representing the configuration of your local Amazon EKS cluster
   * on an AWS Outpost.
   * This object isn't available for clusters on the AWS cloud.
   */
  public fun outpostConfig(outpostConfig: IResolvable) {
    cdkBuilder.outpostConfig(outpostConfig)
  }

  /**
   * @param outpostConfig An object representing the configuration of your local Amazon EKS cluster
   * on an AWS Outpost.
   * This object isn't available for clusters on the AWS cloud.
   */
  public fun outpostConfig(outpostConfig: CfnCluster.OutpostConfigProperty) {
    cdkBuilder.outpostConfig(outpostConfig)
  }

  /**
   * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
   * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more
   * information, see [Cluster VPC
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
   * Security Group
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
   * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
   * security groups, but we recommend that you use a dedicated security group for your cluster control
   * plane.
   *
   *
   * Updates require replacement of the `SecurityGroupIds` and `SubnetIds` sub-properties.
   */
  public fun resourcesVpcConfig(resourcesVpcConfig: IResolvable) {
    cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
  }

  /**
   * @param resourcesVpcConfig The VPC configuration that's used by the cluster control plane. 
   * Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more
   * information, see [Cluster VPC
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster
   * Security Group
   * Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the
   * *Amazon EKS User Guide* . You must specify at least two subnets. You can specify up to five
   * security groups, but we recommend that you use a dedicated security group for your cluster control
   * plane.
   *
   *
   * Updates require replacement of the `SecurityGroupIds` and `SubnetIds` sub-properties.
   */
  public fun resourcesVpcConfig(resourcesVpcConfig: CfnCluster.ResourcesVpcConfigProperty) {
    cdkBuilder.resourcesVpcConfig(resourcesVpcConfig)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role that provides permissions for the
   * Kubernetes control plane to make calls to AWS API operations on your behalf. 
   * For more information, see [Amazon EKS Service IAM
   * Role](https://docs.aws.amazon.com/eks/latest/userguide/service_IAM_role.html) in the **Amazon EKS
   * User Guide** .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tags The metadata that you apply to the cluster to assist with categorization and
   * organization.
   * Each tag consists of a key and an optional value, both of which you define. Cluster tags don't
   * propagate to any other resources associated with the cluster.
   *
   *
   * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
   * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
   * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
   * unexpected behavior with stack-level tags propagating to the resource during resource creation and
   * update.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The metadata that you apply to the cluster to assist with categorization and
   * organization.
   * Each tag consists of a key and an optional value, both of which you define. Cluster tags don't
   * propagate to any other resources associated with the cluster.
   *
   *
   * You must have the `eks:TagResource` and `eks:UntagResource` permissions for your [IAM
   * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
   * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
   * unexpected behavior with stack-level tags propagating to the resource during resource creation and
   * update.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param version The desired Kubernetes version for your cluster.
   * If you don't specify a value here, the default version available in Amazon EKS is used.
   *
   *
   * The default version might not be the latest version available.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnClusterProps {
    if(_encryptionConfig.isNotEmpty()) cdkBuilder.encryptionConfig(_encryptionConfig)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
