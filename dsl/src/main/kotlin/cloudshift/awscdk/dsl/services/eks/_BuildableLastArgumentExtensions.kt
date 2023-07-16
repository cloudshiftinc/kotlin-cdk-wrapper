@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.dsl.ArnComponentsDsl
import cloudshift.awscdk.dsl.ExportValueOptionsDsl
import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.autoscaling.AutoScalingGroup
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.CfnAddon
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.KubectlProvider
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.IUser
import software.constructs.Construct

public inline fun AwsAuth.addRoleMapping(arg0: IRole, block: AwsAuthMappingDsl.() -> Unit = {}) {
  val builder = AwsAuthMappingDsl()
  builder.apply(block)
  return addRoleMapping(arg0,builder.build())
}

public inline fun AwsAuth.addUserMapping(arg0: IUser, block: AwsAuthMappingDsl.() -> Unit = {}) {
  val builder = AwsAuthMappingDsl()
  builder.apply(block)
  return addUserMapping(arg0,builder.build())
}

public inline fun CfnAddon.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCluster.setKubernetesNetworkConfig(block: CfnClusterKubernetesNetworkConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterKubernetesNetworkConfigPropertyDsl()
  builder.apply(block)
  return setKubernetesNetworkConfig(builder.build())
}

public inline fun CfnCluster.setLogging(block: CfnClusterLoggingPropertyDsl.() -> Unit = {}) {
  val builder = CfnClusterLoggingPropertyDsl()
  builder.apply(block)
  return setLogging(builder.build())
}

public inline fun CfnCluster.setOutpostConfig(block: CfnClusterOutpostConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterOutpostConfigPropertyDsl()
  builder.apply(block)
  return setOutpostConfig(builder.build())
}

public inline
    fun CfnCluster.setResourcesVpcConfig(block: CfnClusterResourcesVpcConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterResourcesVpcConfigPropertyDsl()
  builder.apply(block)
  return setResourcesVpcConfig(builder.build())
}

public inline fun CfnFargateProfile.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnIdentityProviderConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnIdentityProviderConfig.setOidc(block: CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl()
  builder.apply(block)
  return setOidc(builder.build())
}

public inline fun CfnNodegroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnNodegroup.setLaunchTemplate(block: CfnNodegroupLaunchTemplateSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupLaunchTemplateSpecificationPropertyDsl()
  builder.apply(block)
  return setLaunchTemplate(builder.build())
}

public inline fun CfnNodegroup.setRemoteAccess(block: CfnNodegroupRemoteAccessPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupRemoteAccessPropertyDsl()
  builder.apply(block)
  return setRemoteAccess(builder.build())
}

public inline
    fun CfnNodegroup.setScalingConfig(block: CfnNodegroupScalingConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnNodegroupScalingConfigPropertyDsl()
  builder.apply(block)
  return setScalingConfig(builder.build())
}

public inline fun CfnNodegroup.setUpdateConfig(block: CfnNodegroupUpdateConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodegroupUpdateConfigPropertyDsl()
  builder.apply(block)
  return setUpdateConfig(builder.build())
}

public inline fun Cluster.addAutoScalingGroupCapacity(arg0: String,
    block: AutoScalingGroupCapacityOptionsDsl.() -> Unit = {}): AutoScalingGroup {
  val builder = AutoScalingGroupCapacityOptionsDsl()
  builder.apply(block)
  return addAutoScalingGroupCapacity(arg0,builder.build())
}

public inline fun Cluster.addCdk8sChart(
  arg0: String,
  arg1: Construct,
  block: KubernetesManifestOptionsDsl.() -> Unit = {},
): KubernetesManifest {
  val builder = KubernetesManifestOptionsDsl()
  builder.apply(block)
  return addCdk8sChart(arg0,arg1,builder.build())
}

public inline fun Cluster.addFargateProfile(arg0: String, block: FargateProfileOptionsDsl.() -> Unit
    = {}): FargateProfile {
  val builder = FargateProfileOptionsDsl()
  builder.apply(block)
  return addFargateProfile(arg0,builder.build())
}

public inline fun Cluster.addHelmChart(arg0: String, block: HelmChartOptionsDsl.() -> Unit = {}):
    HelmChart {
  val builder = HelmChartOptionsDsl()
  builder.apply(block)
  return addHelmChart(arg0,builder.build())
}

public inline fun Cluster.addNodegroupCapacity(arg0: String, block: NodegroupOptionsDsl.() -> Unit =
    {}): Nodegroup {
  val builder = NodegroupOptionsDsl()
  builder.apply(block)
  return addNodegroupCapacity(arg0,builder.build())
}

public inline fun Cluster.addServiceAccount(arg0: String, block: ServiceAccountOptionsDsl.() -> Unit
    = {}): ServiceAccount {
  val builder = ServiceAccountOptionsDsl()
  builder.apply(block)
  return addServiceAccount(arg0,builder.build())
}

public inline fun Cluster.connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {}) {
  val builder = AutoScalingGroupOptionsDsl()
  builder.apply(block)
  return connectAutoScalingGroupCapacity(arg0,builder.build())
}

public inline fun Cluster.getIngressLoadBalancerAddress(arg0: String,
    block: IngressLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = IngressLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getIngressLoadBalancerAddress(arg0,builder.build())
}

public inline fun Cluster.getServiceLoadBalancerAddress(arg0: String,
    block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = ServiceLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getServiceLoadBalancerAddress(arg0,builder.build())
}

public inline fun FargateCluster.addAutoScalingGroupCapacity(arg0: String,
    block: AutoScalingGroupCapacityOptionsDsl.() -> Unit = {}): AutoScalingGroup {
  val builder = AutoScalingGroupCapacityOptionsDsl()
  builder.apply(block)
  return addAutoScalingGroupCapacity(arg0,builder.build())
}

public inline fun FargateCluster.addCdk8sChart(
  arg0: String,
  arg1: Construct,
  block: KubernetesManifestOptionsDsl.() -> Unit = {},
): KubernetesManifest {
  val builder = KubernetesManifestOptionsDsl()
  builder.apply(block)
  return addCdk8sChart(arg0,arg1,builder.build())
}

public inline fun FargateCluster.addFargateProfile(arg0: String,
    block: FargateProfileOptionsDsl.() -> Unit = {}): FargateProfile {
  val builder = FargateProfileOptionsDsl()
  builder.apply(block)
  return addFargateProfile(arg0,builder.build())
}

public inline fun FargateCluster.addHelmChart(arg0: String, block: HelmChartOptionsDsl.() -> Unit =
    {}): HelmChart {
  val builder = HelmChartOptionsDsl()
  builder.apply(block)
  return addHelmChart(arg0,builder.build())
}

public inline fun FargateCluster.addNodegroupCapacity(arg0: String,
    block: NodegroupOptionsDsl.() -> Unit = {}): Nodegroup {
  val builder = NodegroupOptionsDsl()
  builder.apply(block)
  return addNodegroupCapacity(arg0,builder.build())
}

public inline fun FargateCluster.addServiceAccount(arg0: String,
    block: ServiceAccountOptionsDsl.() -> Unit = {}): ServiceAccount {
  val builder = ServiceAccountOptionsDsl()
  builder.apply(block)
  return addServiceAccount(arg0,builder.build())
}

public inline fun FargateCluster.connectAutoScalingGroupCapacity(arg0: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {}) {
  val builder = AutoScalingGroupOptionsDsl()
  builder.apply(block)
  return connectAutoScalingGroupCapacity(arg0,builder.build())
}

public inline fun FargateCluster.getIngressLoadBalancerAddress(arg0: String,
    block: IngressLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = IngressLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getIngressLoadBalancerAddress(arg0,builder.build())
}

public inline fun FargateCluster.getServiceLoadBalancerAddress(arg0: String,
    block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit = {}): String {
  val builder = ServiceLoadBalancerAddressOptionsDsl()
  builder.apply(block)
  return getServiceLoadBalancerAddress(arg0,builder.build())
}

public inline fun KubectlProvider.exportStringListValue(arg0: Any,
    block: ExportValueOptionsDsl.() -> Unit = {}): List<String> {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportStringListValue(arg0,builder.build())
}

public inline fun KubectlProvider.exportValue(arg0: Any, block: ExportValueOptionsDsl.() -> Unit =
    {}): String {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportValue(arg0,builder.build())
}

public inline fun KubectlProvider.formatArn(block: ArnComponentsDsl.() -> Unit = {}): String {
  val builder = ArnComponentsDsl()
  builder.apply(block)
  return formatArn(builder.build())
}

public inline fun KubectlProvider.reportMissingContextKey(block: MissingContextDsl.() -> Unit =
    {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return reportMissingContextKey(builder.build())
}

public inline fun ServiceAccount.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToPrincipalPolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToPrincipalPolicy(builder.build())
}
