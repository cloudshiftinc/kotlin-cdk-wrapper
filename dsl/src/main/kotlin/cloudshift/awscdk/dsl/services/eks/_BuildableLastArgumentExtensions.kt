@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
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
import kotlin.String
import kotlin.Unit

public inline fun ServiceAccount.addToPrincipalPolicy(block: PolicyStatementDsl.() -> Unit = {}): AddToPrincipalPolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToPrincipalPolicy(builder.build())
}

public inline fun AwsAuth.addRoleMapping(role: IRole, block: AwsAuthMappingDsl.() -> Unit = {}) {
    val builder = AwsAuthMappingDsl()
    builder.apply(block)
    return addRoleMapping(role, builder.build())
}

public inline fun AwsAuth.addUserMapping(user: IUser, block: AwsAuthMappingDsl.() -> Unit = {}) {
    val builder = AwsAuthMappingDsl()
    builder.apply(block)
    return addUserMapping(user, builder.build())
}

public inline fun CfnNodegroup.setLaunchTemplate(
    block: CfnNodegroupLaunchTemplateSpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNodegroupLaunchTemplateSpecificationPropertyDsl()
    builder.apply(block)
    return setLaunchTemplate(builder.build())
}

public inline fun CfnNodegroup.setRemoteAccess(
    block: CfnNodegroupRemoteAccessPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNodegroupRemoteAccessPropertyDsl()
    builder.apply(block)
    return setRemoteAccess(builder.build())
}

public inline fun CfnNodegroup.setScalingConfig(block: CfnNodegroupScalingConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnNodegroupScalingConfigPropertyDsl()
    builder.apply(block)
    return setScalingConfig(builder.build())
}

public inline fun CfnNodegroup.setUpdateConfig(
    block: CfnNodegroupUpdateConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnNodegroupUpdateConfigPropertyDsl()
    builder.apply(block)
    return setUpdateConfig(builder.build())
}

public inline fun CfnCluster.setResourcesVpcConfig(
    block: CfnClusterResourcesVpcConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterResourcesVpcConfigPropertyDsl()
    builder.apply(block)
    return setResourcesVpcConfig(builder.build())
}

public inline fun CfnCluster.setKubernetesNetworkConfig(
    block: CfnClusterKubernetesNetworkConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterKubernetesNetworkConfigPropertyDsl()
    builder.apply(block)
    return setKubernetesNetworkConfig(builder.build())
}

public inline fun CfnCluster.setLogging(block: CfnClusterLoggingPropertyDsl.() -> Unit = {}) {
    val builder = CfnClusterLoggingPropertyDsl()
    builder.apply(block)
    return setLogging(builder.build())
}

public inline fun CfnCluster.setOutpostConfig(
    block: CfnClusterOutpostConfigPropertyDsl.() -> Unit =
        {},
) {
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

public inline fun ICluster.addHelmChart(arg0: String, block: HelmChartOptionsDsl.() -> Unit = {}): HelmChart {
    val builder = HelmChartOptionsDsl()
    builder.apply(block)
    return addHelmChart(arg0, builder.build())
}

public inline fun ICluster.addServiceAccount(
    arg0: String,
    block: ServiceAccountOptionsDsl.() -> Unit = {},
): ServiceAccount {
    val builder = ServiceAccountOptionsDsl()
    builder.apply(block)
    return addServiceAccount(arg0, builder.build())
}

public inline fun ICluster.connectAutoScalingGroupCapacity(
    arg0: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {},
) {
    val builder = AutoScalingGroupOptionsDsl()
    builder.apply(block)
    return connectAutoScalingGroupCapacity(arg0, builder.build())
}

public inline fun Cluster.addAutoScalingGroupCapacity(
    id: String,
    block: AutoScalingGroupCapacityOptionsDsl.() -> Unit = {},
): AutoScalingGroup {
    val builder = AutoScalingGroupCapacityOptionsDsl()
    builder.apply(block)
    return addAutoScalingGroupCapacity(id, builder.build())
}

public inline fun Cluster.addCdk8sChart(
    id: String,
    chart: Construct,
    block: KubernetesManifestOptionsDsl.() -> Unit = {},
): KubernetesManifest {
    val builder = KubernetesManifestOptionsDsl()
    builder.apply(block)
    return addCdk8sChart(id, chart, builder.build())
}

public inline fun Cluster.addFargateProfile(
    id: String,
    block: FargateProfileOptionsDsl.() -> Unit =
        {},
): FargateProfile {
    val builder = FargateProfileOptionsDsl()
    builder.apply(block)
    return addFargateProfile(id, builder.build())
}

public inline fun Cluster.addHelmChart(id: String, block: HelmChartOptionsDsl.() -> Unit = {}): HelmChart {
    val builder = HelmChartOptionsDsl()
    builder.apply(block)
    return addHelmChart(id, builder.build())
}

public inline fun Cluster.addNodegroupCapacity(
    id: String,
    block: NodegroupOptionsDsl.() -> Unit =
        {},
): Nodegroup {
    val builder = NodegroupOptionsDsl()
    builder.apply(block)
    return addNodegroupCapacity(id, builder.build())
}

public inline fun Cluster.addServiceAccount(
    id: String,
    block: ServiceAccountOptionsDsl.() -> Unit =
        {},
): ServiceAccount {
    val builder = ServiceAccountOptionsDsl()
    builder.apply(block)
    return addServiceAccount(id, builder.build())
}

public inline fun Cluster.connectAutoScalingGroupCapacity(
    autoScalingGroup: AutoScalingGroup,
    block: AutoScalingGroupOptionsDsl.() -> Unit = {},
) {
    val builder = AutoScalingGroupOptionsDsl()
    builder.apply(block)
    return connectAutoScalingGroupCapacity(autoScalingGroup, builder.build())
}

public inline fun Cluster.getIngressLoadBalancerAddress(
    ingressName: String,
    block: IngressLoadBalancerAddressOptionsDsl.() -> Unit = {},
): String {
    val builder = IngressLoadBalancerAddressOptionsDsl()
    builder.apply(block)
    return getIngressLoadBalancerAddress(ingressName, builder.build())
}

public inline fun Cluster.getServiceLoadBalancerAddress(
    serviceName: String,
    block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit = {},
): String {
    val builder = ServiceLoadBalancerAddressOptionsDsl()
    builder.apply(block)
    return getServiceLoadBalancerAddress(serviceName, builder.build())
}

public inline fun CfnIdentityProviderConfig.setOidc(
    block: CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl()
    builder.apply(block)
    return setOidc(builder.build())
}
