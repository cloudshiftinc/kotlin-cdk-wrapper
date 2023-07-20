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

package cloudshift.awscdk.dsl.services.ecs

import software.amazon.awscdk.services.ecs.AddAutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.ecs.AddCapacityOptions
import software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps
import software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps
import software.amazon.awscdk.services.ecs.AsgCapacityProvider
import software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
import software.amazon.awscdk.services.ecs.AssetEnvironmentFile
import software.amazon.awscdk.services.ecs.AssetImage
import software.amazon.awscdk.services.ecs.AssetImageProps
import software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions
import software.amazon.awscdk.services.ecs.AuthorizationConfig
import software.amazon.awscdk.services.ecs.AwsLogDriver
import software.amazon.awscdk.services.ecs.AwsLogDriverProps
import software.amazon.awscdk.services.ecs.BaseLogDriverProps
import software.amazon.awscdk.services.ecs.BaseServiceOptions
import software.amazon.awscdk.services.ecs.BaseServiceProps
import software.amazon.awscdk.services.ecs.BottleRocketImage
import software.amazon.awscdk.services.ecs.BottleRocketImageProps
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.amazon.awscdk.services.ecs.CfnCapacityProviderProps
import software.amazon.awscdk.services.ecs.CfnCluster
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps
import software.amazon.awscdk.services.ecs.CfnClusterProps
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
import software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps
import software.amazon.awscdk.services.ecs.CfnService
import software.amazon.awscdk.services.ecs.CfnServiceProps
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps
import software.amazon.awscdk.services.ecs.CfnTaskSet
import software.amazon.awscdk.services.ecs.CfnTaskSetProps
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ClusterAttributes
import software.amazon.awscdk.services.ecs.ClusterProps
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.ecs.ContainerDefinitionOptions
import software.amazon.awscdk.services.ecs.ContainerDefinitionProps
import software.amazon.awscdk.services.ecs.ContainerDependency
import software.amazon.awscdk.services.ecs.ContainerImageConfig
import software.amazon.awscdk.services.ecs.CpuUtilizationScalingProps
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentAlarmOptions
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.Device
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes
import software.amazon.awscdk.services.ecs.Ec2ServiceProps
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps
import software.amazon.awscdk.services.ecs.EcsOptimizedImageOptions
import software.amazon.awscdk.services.ecs.EcsTarget
import software.amazon.awscdk.services.ecs.EfsVolumeConfiguration
import software.amazon.awscdk.services.ecs.EnvironmentFileConfig
import software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration
import software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration
import software.amazon.awscdk.services.ecs.ExternalService
import software.amazon.awscdk.services.ecs.ExternalServiceAttributes
import software.amazon.awscdk.services.ecs.ExternalServiceProps
import software.amazon.awscdk.services.ecs.ExternalTaskDefinition
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps
import software.amazon.awscdk.services.ecs.FargateService
import software.amazon.awscdk.services.ecs.FargateServiceAttributes
import software.amazon.awscdk.services.ecs.FargateServiceProps
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps
import software.amazon.awscdk.services.ecs.FireLensLogDriver
import software.amazon.awscdk.services.ecs.FireLensLogDriverProps
import software.amazon.awscdk.services.ecs.FirelensConfig
import software.amazon.awscdk.services.ecs.FirelensLogRouter
import software.amazon.awscdk.services.ecs.FirelensLogRouterDefinitionOptions
import software.amazon.awscdk.services.ecs.FirelensLogRouterProps
import software.amazon.awscdk.services.ecs.FirelensOptions
import software.amazon.awscdk.services.ecs.FluentdLogDriver
import software.amazon.awscdk.services.ecs.FluentdLogDriverProps
import software.amazon.awscdk.services.ecs.GelfLogDriver
import software.amazon.awscdk.services.ecs.GelfLogDriverProps
import software.amazon.awscdk.services.ecs.GenericLogDriver
import software.amazon.awscdk.services.ecs.GenericLogDriverProps
import software.amazon.awscdk.services.ecs.HealthCheck
import software.amazon.awscdk.services.ecs.Host
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import software.amazon.awscdk.services.ecs.JournaldLogDriver
import software.amazon.awscdk.services.ecs.JournaldLogDriverProps
import software.amazon.awscdk.services.ecs.JsonFileLogDriver
import software.amazon.awscdk.services.ecs.JsonFileLogDriverProps
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LinuxParametersProps
import software.amazon.awscdk.services.ecs.LoadBalancerTargetOptions
import software.amazon.awscdk.services.ecs.LogDriverConfig
import software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps
import software.amazon.awscdk.services.ecs.MountPoint
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.PortMap
import software.amazon.awscdk.services.ecs.PortMapping
import software.amazon.awscdk.services.ecs.RepositoryImage
import software.amazon.awscdk.services.ecs.RepositoryImageProps
import software.amazon.awscdk.services.ecs.RequestCountScalingProps
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.amazon.awscdk.services.ecs.ScratchSpace
import software.amazon.awscdk.services.ecs.SecretVersionInfo
import software.amazon.awscdk.services.ecs.ServiceConnect
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.ServiceConnectService
import software.amazon.awscdk.services.ecs.SplunkLogDriver
import software.amazon.awscdk.services.ecs.SplunkLogDriverProps
import software.amazon.awscdk.services.ecs.SyslogLogDriver
import software.amazon.awscdk.services.ecs.SyslogLogDriverProps
import software.amazon.awscdk.services.ecs.SystemControl
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.ecs.TaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.TaskDefinitionProps
import software.amazon.awscdk.services.ecs.Tmpfs
import software.amazon.awscdk.services.ecs.TrackCustomMetricProps
import software.amazon.awscdk.services.ecs.Ulimit
import software.amazon.awscdk.services.ecs.Volume
import software.amazon.awscdk.services.ecs.VolumeFrom
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object ecs {
    public inline fun addAutoScalingGroupCapacityOptions(
        block: AddAutoScalingGroupCapacityOptionsDsl.() -> Unit =
            {},
    ): AddAutoScalingGroupCapacityOptions {
        val builder = AddAutoScalingGroupCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun addCapacityOptions(block: AddCapacityOptionsDsl.() -> Unit = {}): AddCapacityOptions {
        val builder = AddCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun appMeshProxyConfiguration(block: AppMeshProxyConfigurationDsl.() -> Unit = {}): AppMeshProxyConfiguration {
        val builder = AppMeshProxyConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun appMeshProxyConfigurationConfigProps(
        block: AppMeshProxyConfigurationConfigPropsDsl.() -> Unit =
            {},
    ): AppMeshProxyConfigurationConfigProps {
        val builder = AppMeshProxyConfigurationConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun appMeshProxyConfigurationProps(block: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}): AppMeshProxyConfigurationProps {
        val builder = AppMeshProxyConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun asgCapacityProvider(
        scope: Construct,
        id: String,
        block: AsgCapacityProviderDsl.() -> Unit = {},
    ): AsgCapacityProvider {
        val builder = AsgCapacityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun asgCapacityProviderProps(block: AsgCapacityProviderPropsDsl.() -> Unit = {}): AsgCapacityProviderProps {
        val builder = AsgCapacityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun assetEnvironmentFile(
        path: String,
        block: AssetEnvironmentFileDsl.() -> Unit =
            {},
    ): AssetEnvironmentFile {
        val builder = AssetEnvironmentFileDsl(path)
        builder.apply(block)
        return builder.build()
    }

    public inline fun assetImage(directory: String, block: AssetImageDsl.() -> Unit = {}): AssetImage {
        val builder = AssetImageDsl(directory)
        builder.apply(block)
        return builder.build()
    }

    public inline fun assetImageProps(block: AssetImagePropsDsl.() -> Unit = {}): AssetImageProps {
        val builder = AssetImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun associateCloudMapServiceOptions(
        block: AssociateCloudMapServiceOptionsDsl.() -> Unit =
            {},
    ): AssociateCloudMapServiceOptions {
        val builder = AssociateCloudMapServiceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun authorizationConfig(block: AuthorizationConfigDsl.() -> Unit = {}): AuthorizationConfig {
        val builder = AuthorizationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsLogDriver(block: AwsLogDriverDsl.() -> Unit = {}): AwsLogDriver {
        val builder = AwsLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun awsLogDriverProps(block: AwsLogDriverPropsDsl.() -> Unit = {}): AwsLogDriverProps {
        val builder = AwsLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseLogDriverProps(block: BaseLogDriverPropsDsl.() -> Unit = {}): BaseLogDriverProps {
        val builder = BaseLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseServiceOptions(block: BaseServiceOptionsDsl.() -> Unit = {}): BaseServiceOptions {
        val builder = BaseServiceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseServiceProps(block: BaseServicePropsDsl.() -> Unit = {}): BaseServiceProps {
        val builder = BaseServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bottleRocketImage(block: BottleRocketImageDsl.() -> Unit = {}): BottleRocketImage {
        val builder = BottleRocketImageDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bottleRocketImageProps(block: BottleRocketImagePropsDsl.() -> Unit = {}): BottleRocketImageProps {
        val builder = BottleRocketImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun capacityProviderStrategy(block: CapacityProviderStrategyDsl.() -> Unit = {}): CapacityProviderStrategy {
        val builder = CapacityProviderStrategyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCapacityProvider(
        scope: Construct,
        id: String,
        block: CfnCapacityProviderDsl.() -> Unit = {},
    ): CfnCapacityProvider {
        val builder = CfnCapacityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCapacityProviderAutoScalingGroupProviderProperty(
        block: CfnCapacityProviderAutoScalingGroupProviderPropertyDsl.() -> Unit =
            {},
    ): CfnCapacityProvider.AutoScalingGroupProviderProperty {
        val builder = CfnCapacityProviderAutoScalingGroupProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCapacityProviderManagedScalingProperty(
        block: CfnCapacityProviderManagedScalingPropertyDsl.() -> Unit =
            {},
    ): CfnCapacityProvider.ManagedScalingProperty {
        val builder = CfnCapacityProviderManagedScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCapacityProviderProps(block: CfnCapacityProviderPropsDsl.() -> Unit = {}): CfnCapacityProviderProps {
        val builder = CfnCapacityProviderPropsDsl()
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

    public inline fun cfnClusterCapacityProviderAssociations(
        scope: Construct,
        id: String,
        block: CfnClusterCapacityProviderAssociationsDsl.() -> Unit = {},
    ): CfnClusterCapacityProviderAssociations {
        val builder = CfnClusterCapacityProviderAssociationsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterCapacityProviderAssociationsCapacityProviderStrategyProperty(
        block: CfnClusterCapacityProviderAssociationsCapacityProviderStrategyPropertyDsl.() -> Unit =
            {},
    ): CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty {
        val builder = CfnClusterCapacityProviderAssociationsCapacityProviderStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterCapacityProviderAssociationsProps(
        block: CfnClusterCapacityProviderAssociationsPropsDsl.() -> Unit =
            {},
    ): CfnClusterCapacityProviderAssociationsProps {
        val builder = CfnClusterCapacityProviderAssociationsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterCapacityProviderStrategyItemProperty(
        block: CfnClusterCapacityProviderStrategyItemPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.CapacityProviderStrategyItemProperty {
        val builder = CfnClusterCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterClusterConfigurationProperty(
        block: CfnClusterClusterConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ClusterConfigurationProperty {
        val builder = CfnClusterClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterClusterSettingsProperty(
        block: CfnClusterClusterSettingsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ClusterSettingsProperty {
        val builder = CfnClusterClusterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterExecuteCommandConfigurationProperty(
        block: CfnClusterExecuteCommandConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ExecuteCommandConfigurationProperty {
        val builder = CfnClusterExecuteCommandConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterExecuteCommandLogConfigurationProperty(
        block: CfnClusterExecuteCommandLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ExecuteCommandLogConfigurationProperty {
        val builder = CfnClusterExecuteCommandLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterServiceConnectDefaultsProperty(
        block: CfnClusterServiceConnectDefaultsPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ServiceConnectDefaultsProperty {
        val builder = CfnClusterServiceConnectDefaultsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrimaryTaskSet(
        scope: Construct,
        id: String,
        block: CfnPrimaryTaskSetDsl.() -> Unit = {},
    ): CfnPrimaryTaskSet {
        val builder = CfnPrimaryTaskSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPrimaryTaskSetProps(block: CfnPrimaryTaskSetPropsDsl.() -> Unit = {}): CfnPrimaryTaskSetProps {
        val builder = CfnPrimaryTaskSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceAwsVpcConfigurationProperty(
        block: CfnServiceAwsVpcConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnService.AwsVpcConfigurationProperty {
        val builder = CfnServiceAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceCapacityProviderStrategyItemProperty(
        block: CfnServiceCapacityProviderStrategyItemPropertyDsl.() -> Unit =
            {},
    ): CfnService.CapacityProviderStrategyItemProperty {
        val builder = CfnServiceCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDeploymentAlarmsProperty(
        block: CfnServiceDeploymentAlarmsPropertyDsl.() -> Unit =
            {},
    ): CfnService.DeploymentAlarmsProperty {
        val builder = CfnServiceDeploymentAlarmsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDeploymentCircuitBreakerProperty(
        block: CfnServiceDeploymentCircuitBreakerPropertyDsl.() -> Unit =
            {},
    ): CfnService.DeploymentCircuitBreakerProperty {
        val builder = CfnServiceDeploymentCircuitBreakerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDeploymentConfigurationProperty(
        block: CfnServiceDeploymentConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnService.DeploymentConfigurationProperty {
        val builder = CfnServiceDeploymentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceDeploymentControllerProperty(
        block: CfnServiceDeploymentControllerPropertyDsl.() -> Unit =
            {},
    ): CfnService.DeploymentControllerProperty {
        val builder = CfnServiceDeploymentControllerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceLoadBalancerProperty(
        block: CfnServiceLoadBalancerPropertyDsl.() -> Unit = {
        },
    ): CfnService.LoadBalancerProperty {
        val builder = CfnServiceLoadBalancerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceLogConfigurationProperty(
        block: CfnServiceLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnService.LogConfigurationProperty {
        val builder = CfnServiceLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceNetworkConfigurationProperty(
        block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnService.NetworkConfigurationProperty {
        val builder = CfnServiceNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServicePlacementConstraintProperty(
        block: CfnServicePlacementConstraintPropertyDsl.() -> Unit =
            {},
    ): CfnService.PlacementConstraintProperty {
        val builder = CfnServicePlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServicePlacementStrategyProperty(
        block: CfnServicePlacementStrategyPropertyDsl.() -> Unit =
            {},
    ): CfnService.PlacementStrategyProperty {
        val builder = CfnServicePlacementStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceSecretProperty(block: CfnServiceSecretPropertyDsl.() -> Unit = {}): CfnService.SecretProperty {
        val builder = CfnServiceSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceServiceConnectClientAliasProperty(
        block: CfnServiceServiceConnectClientAliasPropertyDsl.() -> Unit =
            {},
    ): CfnService.ServiceConnectClientAliasProperty {
        val builder = CfnServiceServiceConnectClientAliasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceServiceConnectConfigurationProperty(
        block: CfnServiceServiceConnectConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnService.ServiceConnectConfigurationProperty {
        val builder = CfnServiceServiceConnectConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceServiceConnectServiceProperty(
        block: CfnServiceServiceConnectServicePropertyDsl.() -> Unit =
            {},
    ): CfnService.ServiceConnectServiceProperty {
        val builder = CfnServiceServiceConnectServicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceServiceRegistryProperty(
        block: CfnServiceServiceRegistryPropertyDsl.() -> Unit =
            {},
    ): CfnService.ServiceRegistryProperty {
        val builder = CfnServiceServiceRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinition(
        scope: Construct,
        id: String,
        block: CfnTaskDefinitionDsl.() -> Unit = {},
    ): CfnTaskDefinition {
        val builder = CfnTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionAuthorizationConfigProperty(
        block: CfnTaskDefinitionAuthorizationConfigPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.AuthorizationConfigProperty {
        val builder = CfnTaskDefinitionAuthorizationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionContainerDefinitionProperty(
        block: CfnTaskDefinitionContainerDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.ContainerDefinitionProperty {
        val builder = CfnTaskDefinitionContainerDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionContainerDependencyProperty(
        block: CfnTaskDefinitionContainerDependencyPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.ContainerDependencyProperty {
        val builder = CfnTaskDefinitionContainerDependencyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionDeviceProperty(
        block: CfnTaskDefinitionDevicePropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.DeviceProperty {
        val builder = CfnTaskDefinitionDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionDockerVolumeConfigurationProperty(
        block: CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.DockerVolumeConfigurationProperty {
        val builder = CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionEFSVolumeConfigurationProperty(
        block: CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.EFSVolumeConfigurationProperty {
        val builder = CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionEnvironmentFileProperty(
        block: CfnTaskDefinitionEnvironmentFilePropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.EnvironmentFileProperty {
        val builder = CfnTaskDefinitionEnvironmentFilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionEphemeralStorageProperty(
        block: CfnTaskDefinitionEphemeralStoragePropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.EphemeralStorageProperty {
        val builder = CfnTaskDefinitionEphemeralStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionFirelensConfigurationProperty(
        block: CfnTaskDefinitionFirelensConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.FirelensConfigurationProperty {
        val builder = CfnTaskDefinitionFirelensConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionHealthCheckProperty(
        block: CfnTaskDefinitionHealthCheckPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.HealthCheckProperty {
        val builder = CfnTaskDefinitionHealthCheckPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionHostEntryProperty(
        block: CfnTaskDefinitionHostEntryPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.HostEntryProperty {
        val builder = CfnTaskDefinitionHostEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionHostVolumePropertiesProperty(
        block: CfnTaskDefinitionHostVolumePropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.HostVolumePropertiesProperty {
        val builder = CfnTaskDefinitionHostVolumePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionInferenceAcceleratorProperty(
        block: CfnTaskDefinitionInferenceAcceleratorPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.InferenceAcceleratorProperty {
        val builder = CfnTaskDefinitionInferenceAcceleratorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionKernelCapabilitiesProperty(
        block: CfnTaskDefinitionKernelCapabilitiesPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.KernelCapabilitiesProperty {
        val builder = CfnTaskDefinitionKernelCapabilitiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionKeyValuePairProperty(
        block: CfnTaskDefinitionKeyValuePairPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.KeyValuePairProperty {
        val builder = CfnTaskDefinitionKeyValuePairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionLinuxParametersProperty(
        block: CfnTaskDefinitionLinuxParametersPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.LinuxParametersProperty {
        val builder = CfnTaskDefinitionLinuxParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionLogConfigurationProperty(
        block: CfnTaskDefinitionLogConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.LogConfigurationProperty {
        val builder = CfnTaskDefinitionLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionMountPointProperty(
        block: CfnTaskDefinitionMountPointPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.MountPointProperty {
        val builder = CfnTaskDefinitionMountPointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionPortMappingProperty(
        block: CfnTaskDefinitionPortMappingPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.PortMappingProperty {
        val builder = CfnTaskDefinitionPortMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionProps(block: CfnTaskDefinitionPropsDsl.() -> Unit = {}): CfnTaskDefinitionProps {
        val builder = CfnTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionProxyConfigurationProperty(
        block: CfnTaskDefinitionProxyConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.ProxyConfigurationProperty {
        val builder = CfnTaskDefinitionProxyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionRepositoryCredentialsProperty(
        block: CfnTaskDefinitionRepositoryCredentialsPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.RepositoryCredentialsProperty {
        val builder = CfnTaskDefinitionRepositoryCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionResourceRequirementProperty(
        block: CfnTaskDefinitionResourceRequirementPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.ResourceRequirementProperty {
        val builder = CfnTaskDefinitionResourceRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionRuntimePlatformProperty(
        block: CfnTaskDefinitionRuntimePlatformPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.RuntimePlatformProperty {
        val builder = CfnTaskDefinitionRuntimePlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionSecretProperty(
        block: CfnTaskDefinitionSecretPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.SecretProperty {
        val builder = CfnTaskDefinitionSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionSystemControlProperty(
        block: CfnTaskDefinitionSystemControlPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.SystemControlProperty {
        val builder = CfnTaskDefinitionSystemControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionTaskDefinitionPlacementConstraintProperty(
        block: CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty {
        val builder = CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionTmpfsProperty(
        block: CfnTaskDefinitionTmpfsPropertyDsl.() -> Unit = {
        },
    ): CfnTaskDefinition.TmpfsProperty {
        val builder = CfnTaskDefinitionTmpfsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionUlimitProperty(
        block: CfnTaskDefinitionUlimitPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.UlimitProperty {
        val builder = CfnTaskDefinitionUlimitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionVolumeFromProperty(
        block: CfnTaskDefinitionVolumeFromPropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.VolumeFromProperty {
        val builder = CfnTaskDefinitionVolumeFromPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskDefinitionVolumeProperty(
        block: CfnTaskDefinitionVolumePropertyDsl.() -> Unit =
            {},
    ): CfnTaskDefinition.VolumeProperty {
        val builder = CfnTaskDefinitionVolumePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSet(
        scope: Construct,
        id: String,
        block: CfnTaskSetDsl.() -> Unit = {},
    ): CfnTaskSet {
        val builder = CfnTaskSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetAwsVpcConfigurationProperty(
        block: CfnTaskSetAwsVpcConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskSet.AwsVpcConfigurationProperty {
        val builder = CfnTaskSetAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetLoadBalancerProperty(
        block: CfnTaskSetLoadBalancerPropertyDsl.() -> Unit = {
        },
    ): CfnTaskSet.LoadBalancerProperty {
        val builder = CfnTaskSetLoadBalancerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetNetworkConfigurationProperty(
        block: CfnTaskSetNetworkConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnTaskSet.NetworkConfigurationProperty {
        val builder = CfnTaskSetNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetProps(block: CfnTaskSetPropsDsl.() -> Unit = {}): CfnTaskSetProps {
        val builder = CfnTaskSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetScaleProperty(block: CfnTaskSetScalePropertyDsl.() -> Unit = {}): CfnTaskSet.ScaleProperty {
        val builder = CfnTaskSetScalePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTaskSetServiceRegistryProperty(
        block: CfnTaskSetServiceRegistryPropertyDsl.() -> Unit =
            {},
    ): CfnTaskSet.ServiceRegistryProperty {
        val builder = CfnTaskSetServiceRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudMapNamespaceOptions(block: CloudMapNamespaceOptionsDsl.() -> Unit = {}): CloudMapNamespaceOptions {
        val builder = CloudMapNamespaceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudMapOptions(block: CloudMapOptionsDsl.() -> Unit = {}): CloudMapOptions {
        val builder = CloudMapOptionsDsl()
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

    public inline fun clusterProps(block: ClusterPropsDsl.() -> Unit = {}): ClusterProps {
        val builder = ClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonTaskDefinitionAttributes(block: CommonTaskDefinitionAttributesDsl.() -> Unit = {}): CommonTaskDefinitionAttributes {
        val builder = CommonTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonTaskDefinitionProps(block: CommonTaskDefinitionPropsDsl.() -> Unit = {}): CommonTaskDefinitionProps {
        val builder = CommonTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinition(
        scope: Construct,
        id: String,
        block: ContainerDefinitionDsl.() -> Unit = {},
    ): ContainerDefinition {
        val builder = ContainerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinitionOptions(
        block: ContainerDefinitionOptionsDsl.() -> Unit =
            {},
    ): ContainerDefinitionOptions {
        val builder = ContainerDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDefinitionProps(block: ContainerDefinitionPropsDsl.() -> Unit = {}): ContainerDefinitionProps {
        val builder = ContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerDependency(block: ContainerDependencyDsl.() -> Unit = {}): ContainerDependency {
        val builder = ContainerDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun containerImageConfig(block: ContainerImageConfigDsl.() -> Unit = {}): ContainerImageConfig {
        val builder = ContainerImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cpuUtilizationScalingProps(
        block: CpuUtilizationScalingPropsDsl.() -> Unit =
            {},
    ): CpuUtilizationScalingProps {
        val builder = CpuUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun deploymentAlarmConfig(block: DeploymentAlarmConfigDsl.() -> Unit = {}): DeploymentAlarmConfig {
        val builder = DeploymentAlarmConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun deploymentAlarmOptions(block: DeploymentAlarmOptionsDsl.() -> Unit = {}): DeploymentAlarmOptions {
        val builder = DeploymentAlarmOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun deploymentCircuitBreaker(block: DeploymentCircuitBreakerDsl.() -> Unit = {}): DeploymentCircuitBreaker {
        val builder = DeploymentCircuitBreakerDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun deploymentController(block: DeploymentControllerDsl.() -> Unit = {}): DeploymentController {
        val builder = DeploymentControllerDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun device(block: DeviceDsl.() -> Unit = {}): Device {
        val builder = DeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dockerVolumeConfiguration(block: DockerVolumeConfigurationDsl.() -> Unit = {}): DockerVolumeConfiguration {
        val builder = DockerVolumeConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2Service(
        scope: Construct,
        id: String,
        block: Ec2ServiceDsl.() -> Unit = {},
    ): Ec2Service {
        val builder = Ec2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2ServiceAttributes(block: Ec2ServiceAttributesDsl.() -> Unit = {}): Ec2ServiceAttributes {
        val builder = Ec2ServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2ServiceProps(block: Ec2ServicePropsDsl.() -> Unit = {}): Ec2ServiceProps {
        val builder = Ec2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2TaskDefinition(
        scope: Construct,
        id: String,
        block: Ec2TaskDefinitionDsl.() -> Unit = {},
    ): Ec2TaskDefinition {
        val builder = Ec2TaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2TaskDefinitionAttributes(
        block: Ec2TaskDefinitionAttributesDsl.() -> Unit =
            {},
    ): Ec2TaskDefinitionAttributes {
        val builder = Ec2TaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ec2TaskDefinitionProps(block: Ec2TaskDefinitionPropsDsl.() -> Unit = {}): Ec2TaskDefinitionProps {
        val builder = Ec2TaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsOptimizedImageOptions(block: EcsOptimizedImageOptionsDsl.() -> Unit = {}): EcsOptimizedImageOptions {
        val builder = EcsOptimizedImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ecsTarget(block: EcsTargetDsl.() -> Unit = {}): EcsTarget {
        val builder = EcsTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun efsVolumeConfiguration(block: EfsVolumeConfigurationDsl.() -> Unit = {}): EfsVolumeConfiguration {
        val builder = EfsVolumeConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun environmentFileConfig(block: EnvironmentFileConfigDsl.() -> Unit = {}): EnvironmentFileConfig {
        val builder = EnvironmentFileConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun executeCommandConfiguration(
        block: ExecuteCommandConfigurationDsl.() -> Unit =
            {},
    ): ExecuteCommandConfiguration {
        val builder = ExecuteCommandConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun executeCommandLogConfiguration(block: ExecuteCommandLogConfigurationDsl.() -> Unit = {}): ExecuteCommandLogConfiguration {
        val builder = ExecuteCommandLogConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalService(
        scope: Construct,
        id: String,
        block: ExternalServiceDsl.() -> Unit = {},
    ): ExternalService {
        val builder = ExternalServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalServiceAttributes(block: ExternalServiceAttributesDsl.() -> Unit = {}): ExternalServiceAttributes {
        val builder = ExternalServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalServiceProps(block: ExternalServicePropsDsl.() -> Unit = {}): ExternalServiceProps {
        val builder = ExternalServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalTaskDefinition(
        scope: Construct,
        id: String,
        block: ExternalTaskDefinitionDsl.() -> Unit = {},
    ): ExternalTaskDefinition {
        val builder = ExternalTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalTaskDefinitionAttributes(
        block: ExternalTaskDefinitionAttributesDsl.() -> Unit =
            {},
    ): ExternalTaskDefinitionAttributes {
        val builder = ExternalTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun externalTaskDefinitionProps(
        block: ExternalTaskDefinitionPropsDsl.() -> Unit =
            {},
    ): ExternalTaskDefinitionProps {
        val builder = ExternalTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateService(
        scope: Construct,
        id: String,
        block: FargateServiceDsl.() -> Unit = {},
    ): FargateService {
        val builder = FargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateServiceAttributes(block: FargateServiceAttributesDsl.() -> Unit = {}): FargateServiceAttributes {
        val builder = FargateServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateServiceProps(block: FargateServicePropsDsl.() -> Unit = {}): FargateServiceProps {
        val builder = FargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateTaskDefinition(
        scope: Construct,
        id: String,
        block: FargateTaskDefinitionDsl.() -> Unit = {},
    ): FargateTaskDefinition {
        val builder = FargateTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateTaskDefinitionAttributes(
        block: FargateTaskDefinitionAttributesDsl.() -> Unit =
            {},
    ): FargateTaskDefinitionAttributes {
        val builder = FargateTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fargateTaskDefinitionProps(
        block: FargateTaskDefinitionPropsDsl.() -> Unit =
            {},
    ): FargateTaskDefinitionProps {
        val builder = FargateTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fireLensLogDriver(block: FireLensLogDriverDsl.() -> Unit = {}): FireLensLogDriver {
        val builder = FireLensLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fireLensLogDriverProps(block: FireLensLogDriverPropsDsl.() -> Unit = {}): FireLensLogDriverProps {
        val builder = FireLensLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun firelensConfig(block: FirelensConfigDsl.() -> Unit = {}): FirelensConfig {
        val builder = FirelensConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun firelensLogRouter(
        scope: Construct,
        id: String,
        block: FirelensLogRouterDsl.() -> Unit = {},
    ): FirelensLogRouter {
        val builder = FirelensLogRouterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun firelensLogRouterDefinitionOptions(
        block: FirelensLogRouterDefinitionOptionsDsl.() -> Unit =
            {},
    ): FirelensLogRouterDefinitionOptions {
        val builder = FirelensLogRouterDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun firelensLogRouterProps(block: FirelensLogRouterPropsDsl.() -> Unit = {}): FirelensLogRouterProps {
        val builder = FirelensLogRouterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun firelensOptions(block: FirelensOptionsDsl.() -> Unit = {}): FirelensOptions {
        val builder = FirelensOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fluentdLogDriver(block: FluentdLogDriverDsl.() -> Unit = {}): FluentdLogDriver {
        val builder = FluentdLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun fluentdLogDriverProps(block: FluentdLogDriverPropsDsl.() -> Unit = {}): FluentdLogDriverProps {
        val builder = FluentdLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gelfLogDriver(block: GelfLogDriverDsl.() -> Unit = {}): GelfLogDriver {
        val builder = GelfLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gelfLogDriverProps(block: GelfLogDriverPropsDsl.() -> Unit = {}): GelfLogDriverProps {
        val builder = GelfLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun genericLogDriver(block: GenericLogDriverDsl.() -> Unit = {}): GenericLogDriver {
        val builder = GenericLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun genericLogDriverProps(block: GenericLogDriverPropsDsl.() -> Unit = {}): GenericLogDriverProps {
        val builder = GenericLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
        val builder = HealthCheckDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun host(block: HostDsl.() -> Unit = {}): Host {
        val builder = HostDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun inferenceAccelerator(block: InferenceAcceleratorDsl.() -> Unit = {}): InferenceAccelerator {
        val builder = InferenceAcceleratorDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun journaldLogDriver(block: JournaldLogDriverDsl.() -> Unit = {}): JournaldLogDriver {
        val builder = JournaldLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun journaldLogDriverProps(block: JournaldLogDriverPropsDsl.() -> Unit = {}): JournaldLogDriverProps {
        val builder = JournaldLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jsonFileLogDriver(block: JsonFileLogDriverDsl.() -> Unit = {}): JsonFileLogDriver {
        val builder = JsonFileLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun jsonFileLogDriverProps(block: JsonFileLogDriverPropsDsl.() -> Unit = {}): JsonFileLogDriverProps {
        val builder = JsonFileLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun linuxParameters(
        scope: Construct,
        id: String,
        block: LinuxParametersDsl.() -> Unit = {},
    ): LinuxParameters {
        val builder = LinuxParametersDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun linuxParametersProps(block: LinuxParametersPropsDsl.() -> Unit = {}): LinuxParametersProps {
        val builder = LinuxParametersPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun loadBalancerTargetOptions(block: LoadBalancerTargetOptionsDsl.() -> Unit = {}): LoadBalancerTargetOptions {
        val builder = LoadBalancerTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun logDriverConfig(block: LogDriverConfigDsl.() -> Unit = {}): LogDriverConfig {
        val builder = LogDriverConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun memoryUtilizationScalingProps(
        block: MemoryUtilizationScalingPropsDsl.() -> Unit =
            {},
    ): MemoryUtilizationScalingProps {
        val builder = MemoryUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mountPoint(block: MountPointDsl.() -> Unit = {}): MountPoint {
        val builder = MountPointDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun portMap(networkmode: NetworkMode, block: PortMapDsl.() -> Unit = {}): PortMap {
        val builder = PortMapDsl(networkmode)
        builder.apply(block)
        return builder.build()
    }

    public inline fun portMapping(block: PortMappingDsl.() -> Unit = {}): PortMapping {
        val builder = PortMappingDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun repositoryImage(imageName: String, block: RepositoryImageDsl.() -> Unit = {}): RepositoryImage {
        val builder = RepositoryImageDsl(imageName)
        builder.apply(block)
        return builder.build()
    }

    public inline fun repositoryImageProps(block: RepositoryImagePropsDsl.() -> Unit = {}): RepositoryImageProps {
        val builder = RepositoryImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun requestCountScalingProps(block: RequestCountScalingPropsDsl.() -> Unit = {}): RequestCountScalingProps {
        val builder = RequestCountScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}): RuntimePlatform {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalableTaskCount(
        scope: Construct,
        id: String,
        block: ScalableTaskCountDsl.() -> Unit = {},
    ): ScalableTaskCount {
        val builder = ScalableTaskCountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun scalableTaskCountProps(block: ScalableTaskCountPropsDsl.() -> Unit = {}): ScalableTaskCountProps {
        val builder = ScalableTaskCountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun scratchSpace(block: ScratchSpaceDsl.() -> Unit = {}): ScratchSpace {
        val builder = ScratchSpaceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun secretVersionInfo(block: SecretVersionInfoDsl.() -> Unit = {}): SecretVersionInfo {
        val builder = SecretVersionInfoDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceConnect(
        networkmode: NetworkMode,
        block: ServiceConnectDsl.() -> Unit =
            {},
    ): ServiceConnect {
        val builder = ServiceConnectDsl(networkmode)
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceConnectProps(block: ServiceConnectPropsDsl.() -> Unit = {}): ServiceConnectProps {
        val builder = ServiceConnectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceConnectService(block: ServiceConnectServiceDsl.() -> Unit = {}): ServiceConnectService {
        val builder = ServiceConnectServiceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun splunkLogDriver(block: SplunkLogDriverDsl.() -> Unit = {}): SplunkLogDriver {
        val builder = SplunkLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun splunkLogDriverProps(block: SplunkLogDriverPropsDsl.() -> Unit = {}): SplunkLogDriverProps {
        val builder = SplunkLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun syslogLogDriver(block: SyslogLogDriverDsl.() -> Unit = {}): SyslogLogDriver {
        val builder = SyslogLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun syslogLogDriverProps(block: SyslogLogDriverPropsDsl.() -> Unit = {}): SyslogLogDriverProps {
        val builder = SyslogLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun systemControl(block: SystemControlDsl.() -> Unit = {}): SystemControl {
        val builder = SystemControlDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun taskDefinition(
        scope: Construct,
        id: String,
        block: TaskDefinitionDsl.() -> Unit = {},
    ): TaskDefinition {
        val builder = TaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun taskDefinitionAttributes(block: TaskDefinitionAttributesDsl.() -> Unit = {}): TaskDefinitionAttributes {
        val builder = TaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun taskDefinitionProps(block: TaskDefinitionPropsDsl.() -> Unit = {}): TaskDefinitionProps {
        val builder = TaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tmpfs(block: TmpfsDsl.() -> Unit = {}): Tmpfs {
        val builder = TmpfsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun trackCustomMetricProps(block: TrackCustomMetricPropsDsl.() -> Unit = {}): TrackCustomMetricProps {
        val builder = TrackCustomMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun ulimit(block: UlimitDsl.() -> Unit = {}): Ulimit {
        val builder = UlimitDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun volume(block: VolumeDsl.() -> Unit = {}): Volume {
        val builder = VolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun volumeFrom(block: VolumeFromDsl.() -> Unit = {}): VolumeFrom {
        val builder = VolumeFromDsl()
        builder.apply(block)
        return builder.build()
    }
}
