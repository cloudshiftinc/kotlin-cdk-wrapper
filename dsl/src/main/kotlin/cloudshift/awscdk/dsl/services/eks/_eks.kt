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

import software.amazon.awscdk.services.eks.AlbController
import software.amazon.awscdk.services.eks.AlbControllerOptions
import software.amazon.awscdk.services.eks.AlbControllerProps
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.eks.AutoScalingGroupOptions
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthMapping
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.CfnAddon
import software.amazon.awscdk.services.eks.CfnAddonProps
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.amazon.awscdk.services.eks.CfnFargateProfileProps
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.CfnNodegroupProps
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.ClusterAttributes
import software.amazon.awscdk.services.eks.ClusterOptions
import software.amazon.awscdk.services.eks.ClusterProps
import software.amazon.awscdk.services.eks.CommonClusterOptions
import software.amazon.awscdk.services.eks.EksOptimizedImage
import software.amazon.awscdk.services.eks.EksOptimizedImageProps
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileOptions
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.HelmChartOptions
import software.amazon.awscdk.services.eks.HelmChartProps
import software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions
import software.amazon.awscdk.services.eks.KubectlProvider
import software.amazon.awscdk.services.eks.KubectlProviderAttributes
import software.amazon.awscdk.services.eks.KubectlProviderProps
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.amazon.awscdk.services.eks.KubernetesManifestOptions
import software.amazon.awscdk.services.eks.KubernetesManifestProps
import software.amazon.awscdk.services.eks.KubernetesObjectValue
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.amazon.awscdk.services.eks.LaunchTemplateSpec
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.NodegroupOptions
import software.amazon.awscdk.services.eks.NodegroupProps
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
import software.amazon.awscdk.services.eks.Selector
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.eks.ServiceAccountOptions
import software.amazon.awscdk.services.eks.ServiceAccountProps
import software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions
import software.amazon.awscdk.services.eks.TaintSpec
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object eks {
    public inline fun albController(
        scope: Construct,
        id: String,
        block: AlbControllerDsl.() -> Unit = {},
    ): AlbController {
        val builder = AlbControllerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun albControllerOptions(block: AlbControllerOptionsDsl.() -> Unit = {}): AlbControllerOptions {
        val builder = AlbControllerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun albControllerProps(block: AlbControllerPropsDsl.() -> Unit = {}): AlbControllerProps {
        val builder = AlbControllerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun autoScalingGroupCapacityOptions(
        block: AutoScalingGroupCapacityOptionsDsl.() -> Unit =
            {},
    ): AutoScalingGroupCapacityOptions {
        val builder = AutoScalingGroupCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun autoScalingGroupOptions(block: AutoScalingGroupOptionsDsl.() -> Unit = {}): AutoScalingGroupOptions {
        val builder = AutoScalingGroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsAuth(
        scope: Construct,
        id: String,
        block: AwsAuthDsl.() -> Unit = {},
    ): AwsAuth {
        val builder = AwsAuthDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsAuthMapping(block: AwsAuthMappingDsl.() -> Unit = {}): AwsAuthMapping {
        val builder = AwsAuthMappingDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsAuthProps(block: AwsAuthPropsDsl.() -> Unit = {}): AwsAuthProps {
        val builder = AwsAuthPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bootstrapOptions(block: BootstrapOptionsDsl.() -> Unit = {}): BootstrapOptions {
        val builder = BootstrapOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAddon(
        scope: Construct,
        id: String,
        block: CfnAddonDsl.() -> Unit = {},
    ): CfnAddon {
        val builder = CfnAddonDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAddonProps(block: CfnAddonPropsDsl.() -> Unit = {}): CfnAddonProps {
        val builder = CfnAddonPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterClusterLoggingProperty(
        block: CfnClusterClusterLoggingPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ClusterLoggingProperty {
        val builder = CfnClusterClusterLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterControlPlanePlacementProperty(
        block: CfnClusterControlPlanePlacementPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ControlPlanePlacementProperty {
        val builder = CfnClusterControlPlanePlacementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterEncryptionConfigProperty(
        block: CfnClusterEncryptionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.EncryptionConfigProperty {
        val builder = CfnClusterEncryptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterKubernetesNetworkConfigProperty(
        block: CfnClusterKubernetesNetworkConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.KubernetesNetworkConfigProperty {
        val builder = CfnClusterKubernetesNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterLoggingProperty(block: CfnClusterLoggingPropertyDsl.() -> Unit = {}): CfnCluster.LoggingProperty {
        val builder = CfnClusterLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterLoggingTypeConfigProperty(
        block: CfnClusterLoggingTypeConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.LoggingTypeConfigProperty {
        val builder = CfnClusterLoggingTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterOutpostConfigProperty(
        block: CfnClusterOutpostConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.OutpostConfigProperty {
        val builder = CfnClusterOutpostConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProviderProperty(
        block: CfnClusterProviderPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ProviderProperty {
        val builder = CfnClusterProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterResourcesVpcConfigProperty(
        block: CfnClusterResourcesVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ResourcesVpcConfigProperty {
        val builder = CfnClusterResourcesVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFargateProfile(
        scope: Construct,
        id: String,
        block: CfnFargateProfileDsl.() -> Unit = {},
    ): CfnFargateProfile {
        val builder = CfnFargateProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFargateProfileLabelProperty(
        block: CfnFargateProfileLabelPropertyDsl.() -> Unit = {
        },
    ): CfnFargateProfile.LabelProperty {
        val builder = CfnFargateProfileLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFargateProfileProps(block: CfnFargateProfilePropsDsl.() -> Unit = {}): CfnFargateProfileProps {
        val builder = CfnFargateProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFargateProfileSelectorProperty(
        block: CfnFargateProfileSelectorPropertyDsl.() -> Unit =
            {},
    ): CfnFargateProfile.SelectorProperty {
        val builder = CfnFargateProfileSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityProviderConfig(
        scope: Construct,
        id: String,
        block: CfnIdentityProviderConfigDsl.() -> Unit = {},
    ): CfnIdentityProviderConfig {
        val builder = CfnIdentityProviderConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityProviderConfigOidcIdentityProviderConfigProperty(
        block: CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl.() -> Unit =
            {},
    ): CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty {
        val builder = CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityProviderConfigProps(block: CfnIdentityProviderConfigPropsDsl.() -> Unit = {}): CfnIdentityProviderConfigProps {
        val builder = CfnIdentityProviderConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnIdentityProviderConfigRequiredClaimProperty(
        block: CfnIdentityProviderConfigRequiredClaimPropertyDsl.() -> Unit =
            {},
    ): CfnIdentityProviderConfig.RequiredClaimProperty {
        val builder = CfnIdentityProviderConfigRequiredClaimPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroup(
        scope: Construct,
        id: String,
        block: CfnNodegroupDsl.() -> Unit = {},
    ): CfnNodegroup {
        val builder = CfnNodegroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupLaunchTemplateSpecificationProperty(
        block: CfnNodegroupLaunchTemplateSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnNodegroup.LaunchTemplateSpecificationProperty {
        val builder = CfnNodegroupLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupProps(block: CfnNodegroupPropsDsl.() -> Unit = {}): CfnNodegroupProps {
        val builder = CfnNodegroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupRemoteAccessProperty(
        block: CfnNodegroupRemoteAccessPropertyDsl.() -> Unit =
            {},
    ): CfnNodegroup.RemoteAccessProperty {
        val builder = CfnNodegroupRemoteAccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupScalingConfigProperty(
        block: CfnNodegroupScalingConfigPropertyDsl.() -> Unit =
            {},
    ): CfnNodegroup.ScalingConfigProperty {
        val builder = CfnNodegroupScalingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupTaintProperty(block: CfnNodegroupTaintPropertyDsl.() -> Unit = {}): CfnNodegroup.TaintProperty {
        val builder = CfnNodegroupTaintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnNodegroupUpdateConfigProperty(
        block: CfnNodegroupUpdateConfigPropertyDsl.() -> Unit =
            {},
    ): CfnNodegroup.UpdateConfigProperty {
        val builder = CfnNodegroupUpdateConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cluster(
        scope: Construct,
        id: String,
        block: ClusterDsl.() -> Unit = {},
    ): Cluster {
        val builder = ClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterAttributes(block: ClusterAttributesDsl.() -> Unit = {}): ClusterAttributes {
        val builder = ClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterOptions(block: ClusterOptionsDsl.() -> Unit = {}): ClusterOptions {
        val builder = ClusterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun clusterProps(block: ClusterPropsDsl.() -> Unit = {}): ClusterProps {
        val builder = ClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonClusterOptions(block: CommonClusterOptionsDsl.() -> Unit = {}): CommonClusterOptions {
        val builder = CommonClusterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eksOptimizedImage(block: EksOptimizedImageDsl.() -> Unit = {}): EksOptimizedImage {
        val builder = EksOptimizedImageDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun eksOptimizedImageProps(block: EksOptimizedImagePropsDsl.() -> Unit = {}): EksOptimizedImageProps {
        val builder = EksOptimizedImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateCluster(
        scope: Construct,
        id: String,
        block: FargateClusterDsl.() -> Unit = {},
    ): FargateCluster {
        val builder = FargateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateClusterProps(block: FargateClusterPropsDsl.() -> Unit = {}): FargateClusterProps {
        val builder = FargateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateProfile(
        scope: Construct,
        id: String,
        block: FargateProfileDsl.() -> Unit = {},
    ): FargateProfile {
        val builder = FargateProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateProfileOptions(block: FargateProfileOptionsDsl.() -> Unit = {}): FargateProfileOptions {
        val builder = FargateProfileOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateProfileProps(block: FargateProfilePropsDsl.() -> Unit = {}): FargateProfileProps {
        val builder = FargateProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun helmChart(
        scope: Construct,
        id: String,
        block: HelmChartDsl.() -> Unit = {},
    ): HelmChart {
        val builder = HelmChartDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun helmChartOptions(block: HelmChartOptionsDsl.() -> Unit = {}): HelmChartOptions {
        val builder = HelmChartOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun helmChartProps(block: HelmChartPropsDsl.() -> Unit = {}): HelmChartProps {
        val builder = HelmChartPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ingressLoadBalancerAddressOptions(
        block: IngressLoadBalancerAddressOptionsDsl.() -> Unit =
            {},
    ): IngressLoadBalancerAddressOptions {
        val builder = IngressLoadBalancerAddressOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubectlProvider(
        scope: Construct,
        id: String,
        block: KubectlProviderDsl.() -> Unit = {},
    ): KubectlProvider {
        val builder = KubectlProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubectlProviderAttributes(block: KubectlProviderAttributesDsl.() -> Unit = {}): KubectlProviderAttributes {
        val builder = KubectlProviderAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubectlProviderProps(block: KubectlProviderPropsDsl.() -> Unit = {}): KubectlProviderProps {
        val builder = KubectlProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesManifest(
        scope: Construct,
        id: String,
        block: KubernetesManifestDsl.() -> Unit = {},
    ): KubernetesManifest {
        val builder = KubernetesManifestDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesManifestOptions(block: KubernetesManifestOptionsDsl.() -> Unit = {}): KubernetesManifestOptions {
        val builder = KubernetesManifestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesManifestProps(block: KubernetesManifestPropsDsl.() -> Unit = {}): KubernetesManifestProps {
        val builder = KubernetesManifestPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesObjectValue(
        scope: Construct,
        id: String,
        block: KubernetesObjectValueDsl.() -> Unit = {},
    ): KubernetesObjectValue {
        val builder = KubernetesObjectValueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesObjectValueProps(
        block: KubernetesObjectValuePropsDsl.() -> Unit =
            {},
    ): KubernetesObjectValueProps {
        val builder = KubernetesObjectValuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesPatch(
        scope: Construct,
        id: String,
        block: KubernetesPatchDsl.() -> Unit = {},
    ): KubernetesPatch {
        val builder = KubernetesPatchDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun kubernetesPatchProps(block: KubernetesPatchPropsDsl.() -> Unit = {}): KubernetesPatchProps {
        val builder = KubernetesPatchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun launchTemplateSpec(block: LaunchTemplateSpecDsl.() -> Unit = {}): LaunchTemplateSpec {
        val builder = LaunchTemplateSpecDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodegroup(
        scope: Construct,
        id: String,
        block: NodegroupDsl.() -> Unit = {},
    ): Nodegroup {
        val builder = NodegroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodegroupOptions(block: NodegroupOptionsDsl.() -> Unit = {}): NodegroupOptions {
        val builder = NodegroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodegroupProps(block: NodegroupPropsDsl.() -> Unit = {}): NodegroupProps {
        val builder = NodegroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodegroupRemoteAccess(block: NodegroupRemoteAccessDsl.() -> Unit = {}): NodegroupRemoteAccess {
        val builder = NodegroupRemoteAccessDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun openIdConnectProvider(
        scope: Construct,
        id: String,
        block: OpenIdConnectProviderDsl.() -> Unit = {},
    ): OpenIdConnectProvider {
        val builder = OpenIdConnectProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun openIdConnectProviderProps(
        block: OpenIdConnectProviderPropsDsl.() -> Unit =
            {},
    ): OpenIdConnectProviderProps {
        val builder = OpenIdConnectProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun selector(block: SelectorDsl.() -> Unit = {}): Selector {
        val builder = SelectorDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceAccount(
        scope: Construct,
        id: String,
        block: ServiceAccountDsl.() -> Unit = {},
    ): ServiceAccount {
        val builder = ServiceAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceAccountOptions(block: ServiceAccountOptionsDsl.() -> Unit = {}): ServiceAccountOptions {
        val builder = ServiceAccountOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceAccountProps(block: ServiceAccountPropsDsl.() -> Unit = {}): ServiceAccountProps {
        val builder = ServiceAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceLoadBalancerAddressOptions(
        block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit =
            {},
    ): ServiceLoadBalancerAddressOptions {
        val builder = ServiceLoadBalancerAddressOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun taintSpec(block: TaintSpecDsl.() -> Unit = {}): TaintSpec {
        val builder = TaintSpecDsl()
        builder.apply(block)
        return builder.build()
    }
}
