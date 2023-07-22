@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.IUser
import software.constructs.Construct

/**
 * Add to the policy of this principal.
 *
 * @param statement 
 */
public inline fun ServiceAccount.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}

/**
 * Adds a mapping between an IAM role to a Kubernetes user and groups.
 *
 * @param role The IAM role to map. 
 * @param mapping Mapping to k8s user name and groups. 
 */
public inline fun AwsAuth.addRoleMapping(role: IRole, block: AwsAuthMappingDsl.() -> Unit = {}) {
  val builder = AwsAuthMappingDsl()
  builder.apply(block)
  return addRoleMapping(role, builder.build())
}

/**
 * Adds a mapping between an IAM user to a Kubernetes user and groups.
 *
 * @param user The IAM user to map. 
 * @param mapping Mapping to k8s user name and groups. 
 */
public inline fun AwsAuth.addUserMapping(user: IUser, block: AwsAuthMappingDsl.() -> Unit = {}) {
  val builder = AwsAuthMappingDsl()
  builder.apply(block)
  return addUserMapping(user, builder.build())
}

/**
 * An object representing a node group's launch template specification.
 */
public inline
    fun CfnNodegroup.setLaunchTemplate(block: CfnNodegroupLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

/**
 * The remote access configuration to use with your node group.
 */
public inline fun CfnNodegroup.setRemoteAccess(block: CfnNodegroupRemoteAccessPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupRemoteAccessPropertyDsl()
  builder.apply(block)
  return setRemoteAccess(builder.build())
}

/**
 * The scaling configuration details for the Auto Scaling group that is created for your node group.
 */
public inline
    fun CfnNodegroup.setScalingConfig(block: CfnNodegroupScalingConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnNodegroupScalingConfigPropertyDsl()
  builder.apply(block)
  return setScalingConfig(builder.build())
}

/**
 * The node group update configuration.
 */
public inline fun CfnNodegroup.setUpdateConfig(block: CfnNodegroupUpdateConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupUpdateConfigPropertyDsl()
  builder.apply(block)
  return setUpdateConfig(builder.build())
}

/**
 * The VPC configuration that's used by the cluster control plane.
 */
public inline
    fun CfnCluster.setResourcesVpcConfig(block: CfnClusterResourcesVpcConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterResourcesVpcConfigPropertyDsl()
  builder.apply(block)
  return setResourcesVpcConfig(builder.build())
}

/**
 * The Kubernetes network configuration for the cluster.
 */
public inline
    fun CfnCluster.setKubernetesNetworkConfig(block: CfnClusterKubernetesNetworkConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterKubernetesNetworkConfigPropertyDsl()
  builder.apply(block)
  return setKubernetesNetworkConfig(builder.build())
}

/**
 * The logging configuration for your cluster.
 */
public inline fun CfnCluster.setLogging(block: CfnClusterLoggingPropertyDsl.() -> Unit = {}) {
  val builder = CfnClusterLoggingPropertyDsl()
  builder.apply(block)
  return setLogging(builder.build())
}

/**
 * An object representing the configuration of your local Amazon EKS cluster on an AWS Outpost.
 */
public inline fun CfnCluster.setOutpostConfig(block: CfnClusterOutpostConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterOutpostConfigPropertyDsl()
  builder.apply(block)
  return setOutpostConfig(builder.build())
}

public inline fun ICluster.addCdk8sChart(
  arg0: String,
  arg1: Construct,
  block: KubernetesManifestOptionsDsl.() -> Unit = {},
): KubernetesManifest {
  val builder = KubernetesManifestOptionsDsl()
  builder.apply(block)
  return addCdk8sChart(arg0, arg1, builder.build())
}

public inline fun ICluster.addHelmChart(arg0: String, block: HelmChartOptionsDsl.() -> Unit = {}):
    HelmChart {
  val builder = HelmChartOptionsDsl()
  builder.apply(block)
  return addHelmChart(arg0, builder.build())
}

public inline fun ICluster.addServiceAccount(arg0: String,
    block: ServiceAccountOptionsDsl.() -> Unit = {}): ServiceAccount {
  val builder = ServiceAccountOptionsDsl()
  builder.apply(block)
  return addServiceAccount(arg0, builder.build())
}

public inline fun ICluster.connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {}) {
  val builder = AutoScalingGroupOptionsDsl()
  builder.apply(block)
  return connectAutoScalingGroupCapacity(arg0, builder.build())
}

/**
 * Add nodes to this EKS cluster.
 *
 * The nodes will automatically be configured with the right VPC and AMI
 * for the instance type and Kubernetes version.
 *
 * Note that if you specify `updateType: RollingUpdate` or `updateType: ReplacingUpdate`, your nodes
 * might be replaced at deploy
 * time without notice in case the recommended AMI for your machine image type has been updated by
 * AWS.
 * The default behavior for `updateType` is `None`, which means only new instances will be launched
 * using the new AMI.
 *
 * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
 * In addition, the [spot interrupt
 * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
 * daemon will be installed on all spot instances to handle
 * [EC2 Spot Instance Termination
 * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
 *
 * @param id 
 * @param options 
 */
public inline fun Cluster.addAutoScalingGroupCapacity(id: String,
    block: AutoScalingGroupCapacityOptionsDsl.() -> Unit = {}): AutoScalingGroup {
  val builder = AutoScalingGroupCapacityOptionsDsl()
  builder.apply(block)
  return addAutoScalingGroupCapacity(id, builder.build())
}

/**
 * Defines a CDK8s chart in this cluster.
 *
 * @return a `KubernetesManifest` construct representing the chart.
 * @param id logical id of this chart. 
 * @param chart the cdk8s chart. 
 * @param options
 */
public inline fun Cluster.addCdk8sChart(
  id: String,
  chart: Construct,
  block: KubernetesManifestOptionsDsl.() -> Unit = {},
): KubernetesManifest {
  val builder = KubernetesManifestOptionsDsl()
  builder.apply(block)
  return addCdk8sChart(id, chart, builder.build())
}

/**
 * Adds a Fargate profile to this cluster.
 *
 * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html)
 * @param id the id of this profile. 
 * @param options profile options. 
 */
public inline fun Cluster.addFargateProfile(id: String, block: FargateProfileOptionsDsl.() -> Unit =
    {}): FargateProfile {
  val builder = FargateProfileOptionsDsl()
  builder.apply(block)
  return addFargateProfile(id, builder.build())
}

/**
 * Defines a Helm chart in this cluster.
 *
 * @return a `HelmChart` construct
 * @param id logical id of this chart. 
 * @param options options of this chart. 
 */
public inline fun Cluster.addHelmChart(id: String, block: HelmChartOptionsDsl.() -> Unit = {}):
    HelmChart {
  val builder = HelmChartOptionsDsl()
  builder.apply(block)
  return addHelmChart(id, builder.build())
}

/**
 * Add managed nodegroup to this Amazon EKS cluster.
 *
 * This method will create a new managed nodegroup and add into the capacity.
 *
 * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
 * @param id The ID of the nodegroup. 
 * @param options options for creating a new nodegroup.
 */
public inline fun Cluster.addNodegroupCapacity(id: String, block: NodegroupOptionsDsl.() -> Unit =
    {}): Nodegroup {
  val builder = NodegroupOptionsDsl()
  builder.apply(block)
  return addNodegroupCapacity(id, builder.build())
}

/**
 * Creates a new service account with corresponding IAM Role (IRSA).
 *
 * @param id 
 * @param options
 */
public inline fun Cluster.addServiceAccount(id: String, block: ServiceAccountOptionsDsl.() -> Unit =
    {}): ServiceAccount {
  val builder = ServiceAccountOptionsDsl()
  builder.apply(block)
  return addServiceAccount(id, builder.build())
}

/**
 * Connect capacity in the form of an existing AutoScalingGroup to the EKS cluster.
 *
 * The AutoScalingGroup must be running an EKS-optimized AMI containing the
 * /etc/eks/bootstrap.sh script. This method will configure Security Groups,
 * add the right policies to the instance role, apply the right tags, and add
 * the required user data to the instance's launch configuration.
 *
 * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
 * If kubectl is enabled, the
 * [spot interrupt
 * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
 * daemon will be installed on all spot instances to handle
 * [EC2 Spot Instance Termination
 * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
 *
 * Prefer to use `addAutoScalingGroupCapacity` if possible.
 *
 * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)
 * @param autoScalingGroup [disable-awslint:ref-via-interface]. 
 * @param options options for adding auto scaling groups, like customizing the bootstrap script. 
 */
public inline fun Cluster.connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {}) {
  val builder = AutoScalingGroupOptionsDsl()
  builder.apply(block)
  return connectAutoScalingGroupCapacity(autoScalingGroup, builder.build())
}

/**
 * Fetch the load balancer address of an ingress backed by a load balancer.
 *
 * @param ingressName The name of the ingress. 
 * @param options Additional operation options.
 */
public inline fun Cluster.getIngressLoadBalancerAddress(ingressName: String,
    block: IngressLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = IngressLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getIngressLoadBalancerAddress(ingressName, builder.build())
}

/**
 * Fetch the load balancer address of a service of type 'LoadBalancer'.
 *
 * @param serviceName The name of the service. 
 * @param options Additional operation options.
 */
public inline fun Cluster.getServiceLoadBalancerAddress(serviceName: String,
    block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = ServiceLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getServiceLoadBalancerAddress(serviceName, builder.build())
}

/**
 * An object representing an OpenID Connect (OIDC) identity provider configuration.
 */
public inline
    fun CfnIdentityProviderConfig.setOidc(block: CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl()
  builder.apply(block)
  return setOidc(builder.build())
}
