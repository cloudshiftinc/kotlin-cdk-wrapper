@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import kotlin.String
import kotlin.Unit
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

public object ecs {
    /**
     * The properties for adding an AutoScalingGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * AddAutoScalingGroupCapacityOptions addAutoScalingGroupCapacityOptions =
     * AddAutoScalingGroupCapacityOptions.builder()
     * .canContainersAccessInstanceRole(false)
     * .machineImageType(MachineImageType.AMAZON_LINUX_2)
     * .spotInstanceDraining(false)
     * .topicEncryptionKey(key)
     * .build();
     * ```
     */
    public inline fun addAutoScalingGroupCapacityOptions(
        block: AddAutoScalingGroupCapacityOptionsDsl.() -> Unit = {}
    ): AddAutoScalingGroupCapacityOptions {
        val builder = AddAutoScalingGroupCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for adding instance capacity to an AutoScalingGroup.
     *
     * Example:
     * ```
     * Vpc vpc;
     * // Create an ECS cluster
     * Cluster cluster = Cluster.Builder.create(this, "Cluster").vpc(vpc).build();
     * // Add capacity to it
     * cluster.addCapacity("DefaultAutoScalingGroupCapacity", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.xlarge"))
     * .desiredCapacity(3)
     * .build());
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("DefaultContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(512)
     * .build());
     * // Instantiate an Amazon ECS Service
     * Ec2Service ecsService = Ec2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .build();
     * ```
     */
    public inline fun addCapacityOptions(
        block: AddCapacityOptionsDsl.() -> Unit = {}
    ): AddCapacityOptions {
        val builder = AddCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The class for App Mesh proxy configurations.
     *
     * For tasks using the EC2 launch type, the container instances require at least version 1.26.0
     * of the container agent and at least version 1.26.0-1 of the ecs-init package to enable a
     * proxy configuration. If your container instances are launched from the Amazon ECS-optimized
     * AMI version 20190301 or later, then they contain the required versions of the container agent
     * and ecs-init. For more information, see
     * [Amazon ECS-optimized AMIs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html).
     *
     * For tasks using the Fargate launch type, the task or service requires platform version 1.3.0
     * or later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AppMeshProxyConfiguration appMeshProxyConfiguration =
     * AppMeshProxyConfiguration.Builder.create()
     * .containerName("containerName")
     * .properties(AppMeshProxyConfigurationProps.builder()
     * .appPorts(List.of(123))
     * .proxyEgressPort(123)
     * .proxyIngressPort(123)
     * // the properties below are optional
     * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
     * .egressIgnoredPorts(List.of(123))
     * .ignoredGID(123)
     * .ignoredUID(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun appMeshProxyConfiguration(
        block: AppMeshProxyConfigurationDsl.() -> Unit = {}
    ): AppMeshProxyConfiguration {
        val builder = AppMeshProxyConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration to use when setting an App Mesh proxy configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AppMeshProxyConfigurationConfigProps appMeshProxyConfigurationConfigProps =
     * AppMeshProxyConfigurationConfigProps.builder()
     * .containerName("containerName")
     * .properties(AppMeshProxyConfigurationProps.builder()
     * .appPorts(List.of(123))
     * .proxyEgressPort(123)
     * .proxyIngressPort(123)
     * // the properties below are optional
     * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
     * .egressIgnoredPorts(List.of(123))
     * .ignoredGID(123)
     * .ignoredUID(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun appMeshProxyConfigurationConfigProps(
        block: AppMeshProxyConfigurationConfigPropsDsl.() -> Unit = {}
    ): AppMeshProxyConfigurationConfigProps {
        val builder = AppMeshProxyConfigurationConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for setting the properties of proxy configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AppMeshProxyConfigurationProps appMeshProxyConfigurationProps =
     * AppMeshProxyConfigurationProps.builder()
     * .appPorts(List.of(123))
     * .proxyEgressPort(123)
     * .proxyIngressPort(123)
     * // the properties below are optional
     * .egressIgnoredIPs(List.of("egressIgnoredIPs"))
     * .egressIgnoredPorts(List.of(123))
     * .ignoredGID(123)
     * .ignoredUID(123)
     * .build();
     * ```
     */
    public inline fun appMeshProxyConfigurationProps(
        block: AppMeshProxyConfigurationPropsDsl.() -> Unit = {}
    ): AppMeshProxyConfigurationProps {
        val builder = AppMeshProxyConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Auto Scaling Group Capacity Provider.
     *
     * This allows an ECS cluster to target a specific EC2 Auto Scaling Group for the placement of
     * tasks. Optionally (and recommended), ECS can manage the number of instances in the ASG to fit
     * the tasks, and can ensure that instances are not prematurely terminated while there are still
     * tasks running on them.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Cluster cluster = Cluster.Builder.create(this, "Cluster")
     * .vpc(vpc)
     * .build();
     * // Either add default capacity
     * cluster.addCapacity("DefaultAutoScalingGroupCapacity", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.xlarge"))
     * .desiredCapacity(3)
     * .build());
     * // Or add customized capacity. Be sure to start the Amazon ECS-optimized AMI.
     * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(new InstanceType("t2.xlarge"))
     * .machineImage(EcsOptimizedImage.amazonLinux())
     * // Or use Amazon ECS-Optimized Amazon Linux 2 AMI
     * // machineImage: EcsOptimizedImage.amazonLinux2(),
     * .desiredCapacity(3)
     * .build();
     * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
     * "AsgCapacityProvider")
     * .autoScalingGroup(autoScalingGroup)
     * .build();
     * cluster.addAsgCapacityProvider(capacityProvider);
     * ```
     */
    public inline fun asgCapacityProvider(
        scope: Construct,
        id: String,
        block: AsgCapacityProviderDsl.() -> Unit = {},
    ): AsgCapacityProvider {
        val builder = AsgCapacityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for creating an Auto Scaling Group Capacity Provider.
     *
     * Example:
     * ```
     * Vpc vpc;
     * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "ASG-LaunchTemplate")
     * .instanceType(new InstanceType("t3.medium"))
     * .machineImage(EcsOptimizedImage.amazonLinux2())
     * .userData(UserData.forLinux())
     * .build();
     * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
     * .instancesDistribution(InstancesDistribution.builder()
     * .onDemandPercentageAboveBaseCapacity(50)
     * .build())
     * .launchTemplate(launchTemplate)
     * .build())
     * .build();
     * Cluster cluster = Cluster.Builder.create(this, "Cluster").vpc(vpc).build();
     * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
     * "AsgCapacityProvider")
     * .autoScalingGroup(autoScalingGroup)
     * .machineImageType(MachineImageType.AMAZON_LINUX_2)
     * .build();
     * cluster.addAsgCapacityProvider(capacityProvider);
     * ```
     */
    public inline fun asgCapacityProviderProps(
        block: AsgCapacityProviderPropsDsl.() -> Unit = {}
    ): AsgCapacityProviderProps {
        val builder = AsgCapacityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Environment file from a local directory.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * DockerImage dockerImage;
     * IGrantable grantable;
     * ILocalBundling localBundling;
     * AssetEnvironmentFile assetEnvironmentFile = AssetEnvironmentFile.Builder.create("path")
     * .assetHash("assetHash")
     * .assetHashType(AssetHashType.SOURCE)
     * .bundling(BundlingOptions.builder()
     * .image(dockerImage)
     * // the properties below are optional
     * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
     * .command(List.of("command"))
     * .entrypoint(List.of("entrypoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .local(localBundling)
     * .network("network")
     * .outputType(BundlingOutput.ARCHIVED)
     * .platform("platform")
     * .securityOpt("securityOpt")
     * .user("user")
     * .volumes(List.of(DockerVolume.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * // the properties below are optional
     * .consistency(DockerVolumeConsistency.CONSISTENT)
     * .build()))
     * .volumesFrom(List.of("volumesFrom"))
     * .workingDirectory("workingDirectory")
     * .build())
     * .deployTime(false)
     * .exclude(List.of("exclude"))
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .readers(List.of(grantable))
     * .build();
     * ```
     */
    public inline fun assetEnvironmentFile(
        path: String,
        block: AssetEnvironmentFileDsl.() -> Unit = {}
    ): AssetEnvironmentFile {
        val builder = AssetEnvironmentFileDsl(path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An image that will be built from a local directory with a Dockerfile.
     *
     * Example:
     * ```
     * import software.constructs.Construct;
     * import software.amazon.awscdk.App;
     * import software.amazon.awscdk.Stack;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.ecs.patterns.*;
     * import software.amazon.awscdk.cxapi.*;
     * import path.*;
     * public class MyStack extends Stack {
     * public MyStack(Construct scope, String id) {
     * super(scope, id);
     * this.node.setContext(ECS_REMOVE_DEFAULT_DESIRED_COUNT, true);
     * Vpc vpc = Vpc.Builder.create(this, "VPC")
     * .maxAzs(2)
     * .build();
     * QueueProcessingFargateService.Builder.create(this, "QueueProcessingService")
     * .vpc(vpc)
     * .memoryLimitMiB(512)
     * .image(new AssetImage(join(__dirname, "..", "sqs-reader")))
     * .build();
     * }
     * }
     * ```
     */
    public inline fun assetImage(
        directory: String,
        block: AssetImageDsl.() -> Unit = {}
    ): AssetImage {
        val builder = AssetImageDsl(directory)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for building an AssetImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecr.assets.*;
     * import software.amazon.awscdk.services.ecs.*;
     * NetworkMode networkMode;
     * Platform platform;
     * AssetImageProps assetImageProps = AssetImageProps.builder()
     * .assetName("assetName")
     * .buildArgs(Map.of(
     * "buildArgsKey", "buildArgs"))
     * .buildSecrets(Map.of(
     * "buildSecretsKey", "buildSecrets"))
     * .buildSsh("buildSsh")
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .exclude(List.of("exclude"))
     * .extraHash("extraHash")
     * .file("file")
     * .followSymlinks(SymlinkFollowMode.NEVER)
     * .ignoreMode(IgnoreMode.GLOB)
     * .invalidation(DockerImageAssetInvalidationOptions.builder()
     * .buildArgs(false)
     * .buildSecrets(false)
     * .buildSsh(false)
     * .extraHash(false)
     * .file(false)
     * .networkMode(false)
     * .outputs(false)
     * .platform(false)
     * .repositoryName(false)
     * .target(false)
     * .build())
     * .networkMode(networkMode)
     * .outputs(List.of("outputs"))
     * .platform(platform)
     * .target("target")
     * .build();
     * ```
     */
    public inline fun assetImageProps(block: AssetImagePropsDsl.() -> Unit = {}): AssetImageProps {
        val builder = AssetImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for using a cloudmap service.
     *
     * Example:
     * ```
     * Service cloudMapService;
     * FargateService ecsService;
     * ecsService.associateCloudMapService(AssociateCloudMapServiceOptions.builder()
     * .service(cloudMapService)
     * .build());
     * ```
     */
    public inline fun associateCloudMapServiceOptions(
        block: AssociateCloudMapServiceOptionsDsl.() -> Unit = {}
    ): AssociateCloudMapServiceOptions {
        val builder = AssociateCloudMapServiceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AuthorizationConfig authorizationConfig = AuthorizationConfig.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build();
     * ```
     */
    public inline fun authorizationConfig(
        block: AuthorizationConfigDsl.() -> Unit = {}
    ): AuthorizationConfig {
        val builder = AuthorizationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to CloudWatch Logs.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromAsset(resolve(__dirname, "..", "eventhandler-image")))
     * .memoryLimitMiB(256)
     * .logging(AwsLogDriver.Builder.create().streamPrefix("EventDemo").mode(AwsLogDriverMode.NON_BLOCKING).build())
     * .build());
     * // An Rule that describes the event trigger (in this case a scheduled run)
     * Rule rule = Rule.Builder.create(this, "Rule")
     * .schedule(Schedule.expression("rate(1 min)"))
     * .build();
     * // Pass an environment variable to the container 'TheContainer' in the task
     * rule.addTarget(EcsTask.Builder.create()
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .taskCount(1)
     * .containerOverrides(List.of(ContainerOverride.builder()
     * .containerName("TheContainer")
     * .environment(List.of(TaskEnvironmentVariable.builder()
     * .name("I_WAS_TRIGGERED")
     * .value("From CloudWatch Events")
     * .build()))
     * .build()))
     * .build());
     * ```
     */
    public inline fun awsLogDriver(block: AwsLogDriverDsl.() -> Unit = {}): AwsLogDriver {
        val builder = AwsLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the awslogs log driver configuration options.
     *
     * Example:
     * ```
     * // Create a Task Definition for the Windows container to start
     * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
     * .runtimePlatform(RuntimePlatform.builder()
     * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
     * .cpuArchitecture(CpuArchitecture.X86_64)
     * .build())
     * .cpu(1024)
     * .memoryLimitMiB(2048)
     * .build();
     * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
     * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
     * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
     * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
     * .build());
     * ```
     */
    public inline fun awsLogDriverProps(
        block: AwsLogDriverPropsDsl.() -> Unit = {}
    ): AwsLogDriverProps {
        val builder = AwsLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * BaseLogDriverProps baseLogDriverProps = BaseLogDriverProps.builder()
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun baseLogDriverProps(
        block: BaseLogDriverPropsDsl.() -> Unit = {}
    ): BaseLogDriverProps {
        val builder = BaseLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for the base Ec2Service or FargateService service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * LogDriver logDriver;
     * INamespace namespace;
     * BaseServiceOptions baseServiceOptions = BaseServiceOptions.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .circuitBreaker(DeploymentCircuitBreaker.builder()
     * .rollback(false)
     * .build())
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of("alarmNames"))
     * // the properties below are optional
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.ECS)
     * .build())
     * .desiredCount(123)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .maxHealthyPercent(123)
     * .minHealthyPercent(123)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .serviceConnectConfiguration(ServiceConnectProps.builder()
     * .logDriver(logDriver)
     * .namespace("namespace")
     * .services(List.of(ServiceConnectService.builder()
     * .portMappingName("portMappingName")
     * // the properties below are optional
     * .discoveryName("discoveryName")
     * .dnsName("dnsName")
     * .ingressPortOverride(123)
     * .port(123)
     * .build()))
     * .build())
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun baseServiceOptions(
        block: BaseServiceOptionsDsl.() -> Unit = {}
    ): BaseServiceOptions {
        val builder = BaseServiceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Complete base service properties that are required to be supplied by the implementation of
     * the BaseService class.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * Cluster cluster;
     * ContainerDefinition containerDefinition;
     * LogDriver logDriver;
     * INamespace namespace;
     * BaseServiceProps baseServiceProps = BaseServiceProps.builder()
     * .cluster(cluster)
     * .launchType(LaunchType.EC2)
     * // the properties below are optional
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .circuitBreaker(DeploymentCircuitBreaker.builder()
     * .rollback(false)
     * .build())
     * .cloudMapOptions(CloudMapOptions.builder()
     * .cloudMapNamespace(namespace)
     * .container(containerDefinition)
     * .containerPort(123)
     * .dnsRecordType(DnsRecordType.A)
     * .dnsTtl(Duration.minutes(30))
     * .failureThreshold(123)
     * .name("name")
     * .build())
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of("alarmNames"))
     * // the properties below are optional
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.ECS)
     * .build())
     * .desiredCount(123)
     * .enableECSManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriod(Duration.minutes(30))
     * .maxHealthyPercent(123)
     * .minHealthyPercent(123)
     * .propagateTags(PropagatedTagSource.SERVICE)
     * .serviceConnectConfiguration(ServiceConnectProps.builder()
     * .logDriver(logDriver)
     * .namespace("namespace")
     * .services(List.of(ServiceConnectService.builder()
     * .portMappingName("portMappingName")
     * // the properties below are optional
     * .discoveryName("discoveryName")
     * .dnsName("dnsName")
     * .ingressPortOverride(123)
     * .port(123)
     * .build()))
     * .build())
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun baseServiceProps(
        block: BaseServicePropsDsl.() -> Unit = {}
    ): BaseServiceProps {
        val builder = BaseServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct an Bottlerocket image from the latest AMI published in SSM.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.addCapacity("bottlerocket-asg", AddCapacityOptions.builder()
     * .minCapacity(2)
     * .instanceType(new InstanceType("c5.large"))
     * .machineImage(new BottleRocketImage())
     * .build());
     * ```
     */
    public inline fun bottleRocketImage(
        block: BottleRocketImageDsl.() -> Unit = {}
    ): BottleRocketImage {
        val builder = BottleRocketImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for BottleRocketImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * BottleRocketImageProps bottleRocketImageProps = BottleRocketImageProps.builder()
     * .architecture(InstanceArchitecture.ARM_64)
     * .cachedInContext(false)
     * .variant(BottlerocketEcsVariant.AWS_ECS_1)
     * .build();
     * ```
     */
    public inline fun bottleRocketImageProps(
        block: BottleRocketImagePropsDsl.() -> Unit = {}
    ): BottleRocketImageProps {
        val builder = BottleRocketImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Capacity Provider strategy to use for the service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CapacityProviderStrategy capacityProviderStrategy = CapacityProviderStrategy.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build();
     * ```
     */
    public inline fun capacityProviderStrategy(
        block: CapacityProviderStrategyDsl.() -> Unit = {}
    ): CapacityProviderStrategy {
        val builder = CapacityProviderStrategyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new capacity provider.
     *
     * Capacity providers are associated with an Amazon ECS cluster and are used in capacity
     * provider strategies to facilitate cluster auto scaling.
     *
     * Only capacity providers that use an Auto Scaling group can be created. Amazon ECS tasks on
     * AWS Fargate use the `FARGATE` and `FARGATE_SPOT` capacity providers. These providers are
     * available to all accounts in the AWS Regions that AWS Fargate supports.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnCapacityProvider cfnCapacityProvider = CfnCapacityProvider.Builder.create(this,
     * "MyCfnCapacityProvider")
     * .autoScalingGroupProvider(AutoScalingGroupProviderProperty.builder()
     * .autoScalingGroupArn("autoScalingGroupArn")
     * // the properties below are optional
     * .managedScaling(ManagedScalingProperty.builder()
     * .instanceWarmupPeriod(123)
     * .maximumScalingStepSize(123)
     * .minimumScalingStepSize(123)
     * .status("status")
     * .targetCapacity(123)
     * .build())
     * .managedTerminationProtection("managedTerminationProtection")
     * .build())
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html)
     */
    public inline fun cfnCapacityProvider(
        scope: Construct,
        id: String,
        block: CfnCapacityProviderDsl.() -> Unit = {},
    ): CfnCapacityProvider {
        val builder = CfnCapacityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the Auto Scaling group for the capacity provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AutoScalingGroupProviderProperty autoScalingGroupProviderProperty =
     * AutoScalingGroupProviderProperty.builder()
     * .autoScalingGroupArn("autoScalingGroupArn")
     * // the properties below are optional
     * .managedScaling(ManagedScalingProperty.builder()
     * .instanceWarmupPeriod(123)
     * .maximumScalingStepSize(123)
     * .minimumScalingStepSize(123)
     * .status("status")
     * .targetCapacity(123)
     * .build())
     * .managedTerminationProtection("managedTerminationProtection")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-autoscalinggroupprovider.html)
     */
    public inline fun cfnCapacityProviderAutoScalingGroupProviderProperty(
        block: CfnCapacityProviderAutoScalingGroupProviderPropertyDsl.() -> Unit = {}
    ): CfnCapacityProvider.AutoScalingGroupProviderProperty {
        val builder = CfnCapacityProviderAutoScalingGroupProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The managed scaling settings for the Auto Scaling group capacity provider.
     *
     * When managed scaling is turned on, Amazon ECS manages the scale-in and scale-out actions of
     * the Auto Scaling group. Amazon ECS manages a target tracking scaling policy using an Amazon
     * ECS managed CloudWatch metric with the specified `targetCapacity` value as the target value
     * for the metric. For more information, see
     * [Using managed scaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * If managed scaling is off, the user must manage the scaling of the Auto Scaling group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ManagedScalingProperty managedScalingProperty = ManagedScalingProperty.builder()
     * .instanceWarmupPeriod(123)
     * .maximumScalingStepSize(123)
     * .minimumScalingStepSize(123)
     * .status("status")
     * .targetCapacity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-capacityprovider-managedscaling.html)
     */
    public inline fun cfnCapacityProviderManagedScalingProperty(
        block: CfnCapacityProviderManagedScalingPropertyDsl.() -> Unit = {}
    ): CfnCapacityProvider.ManagedScalingProperty {
        val builder = CfnCapacityProviderManagedScalingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCapacityProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnCapacityProviderProps cfnCapacityProviderProps = CfnCapacityProviderProps.builder()
     * .autoScalingGroupProvider(AutoScalingGroupProviderProperty.builder()
     * .autoScalingGroupArn("autoScalingGroupArn")
     * // the properties below are optional
     * .managedScaling(ManagedScalingProperty.builder()
     * .instanceWarmupPeriod(123)
     * .maximumScalingStepSize(123)
     * .minimumScalingStepSize(123)
     * .status("status")
     * .targetCapacity(123)
     * .build())
     * .managedTerminationProtection("managedTerminationProtection")
     * .build())
     * // the properties below are optional
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-capacityprovider.html)
     */
    public inline fun cfnCapacityProviderProps(
        block: CfnCapacityProviderPropsDsl.() -> Unit = {}
    ): CfnCapacityProviderProps {
        val builder = CfnCapacityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ECS::Cluster` resource creates an Amazon Elastic Container Service (Amazon ECS)
     * cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .capacityProviders(List.of("capacityProviders"))
     * .clusterName("clusterName")
     * .clusterSettings(List.of(ClusterSettingsProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .configuration(ClusterConfigurationProperty.builder()
     * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .s3BucketName("s3BucketName")
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .logging("logging")
     * .build())
     * .build())
     * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build()))
     * .serviceConnectDefaults(ServiceConnectDefaultsProperty.builder()
     * .namespace("namespace")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ECS::ClusterCapacityProviderAssociations` resource associates one or more capacity
     * providers and a default capacity provider strategy with a cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnClusterCapacityProviderAssociations cfnClusterCapacityProviderAssociations =
     * CfnClusterCapacityProviderAssociations.Builder.create(this,
     * "MyCfnClusterCapacityProviderAssociations")
     * .capacityProviders(List.of("capacityProviders"))
     * .cluster("cluster")
     * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html)
     */
    public inline fun cfnClusterCapacityProviderAssociations(
        scope: Construct,
        id: String,
        block: CfnClusterCapacityProviderAssociationsDsl.() -> Unit = {},
    ): CfnClusterCapacityProviderAssociations {
        val builder = CfnClusterCapacityProviderAssociationsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `CapacityProviderStrategy` property specifies the details of the default capacity
     * provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CapacityProviderStrategyProperty capacityProviderStrategyProperty =
     * CapacityProviderStrategyProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html)
     */
    public inline fun cfnClusterCapacityProviderAssociationsCapacityProviderStrategyProperty(
        block:
            CfnClusterCapacityProviderAssociationsCapacityProviderStrategyPropertyDsl.() -> Unit =
            {}
    ): CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty {
        val builder = CfnClusterCapacityProviderAssociationsCapacityProviderStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnClusterCapacityProviderAssociations`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnClusterCapacityProviderAssociationsProps cfnClusterCapacityProviderAssociationsProps =
     * CfnClusterCapacityProviderAssociationsProps.builder()
     * .capacityProviders(List.of("capacityProviders"))
     * .cluster("cluster")
     * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyProperty.builder()
     * .capacityProvider("capacityProvider")
     * // the properties below are optional
     * .base(123)
     * .weight(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html)
     */
    public inline fun cfnClusterCapacityProviderAssociationsProps(
        block: CfnClusterCapacityProviderAssociationsPropsDsl.() -> Unit = {}
    ): CfnClusterCapacityProviderAssociationsProps {
        val builder = CfnClusterCapacityProviderAssociationsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `CapacityProviderStrategyItem` property specifies the details of the default capacity
     * provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
     * CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html)
     */
    public inline fun cfnClusterCapacityProviderStrategyItemProperty(
        block: CfnClusterCapacityProviderStrategyItemPropertyDsl.() -> Unit = {}
    ): CfnCluster.CapacityProviderStrategyItemProperty {
        val builder = CfnClusterCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The execute command configuration for the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ClusterConfigurationProperty clusterConfigurationProperty =
     * ClusterConfigurationProperty.builder()
     * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .s3BucketName("s3BucketName")
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .logging("logging")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clusterconfiguration.html)
     */
    public inline fun cfnClusterClusterConfigurationProperty(
        block: CfnClusterClusterConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ClusterConfigurationProperty {
        val builder = CfnClusterClusterConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ClusterSettingsProperty clusterSettingsProperty = ClusterSettingsProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html)
     */
    public inline fun cfnClusterClusterSettingsProperty(
        block: CfnClusterClusterSettingsPropertyDsl.() -> Unit = {}
    ): CfnCluster.ClusterSettingsProperty {
        val builder = CfnClusterClusterSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the execute command configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ExecuteCommandConfigurationProperty executeCommandConfigurationProperty =
     * ExecuteCommandConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .s3BucketName("s3BucketName")
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .logging("logging")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html)
     */
    public inline fun cfnClusterExecuteCommandConfigurationProperty(
        block: CfnClusterExecuteCommandConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ExecuteCommandConfigurationProperty {
        val builder = CfnClusterExecuteCommandConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The log configuration for the results of the execute command actions.
     *
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ExecuteCommandLogConfigurationProperty executeCommandLogConfigurationProperty =
     * ExecuteCommandLogConfigurationProperty.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .s3BucketName("s3BucketName")
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html)
     */
    public inline fun cfnClusterExecuteCommandLogConfigurationProperty(
        block: CfnClusterExecuteCommandLogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnCluster.ExecuteCommandLogConfigurationProperty {
        val builder = CfnClusterExecuteCommandLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .capacityProviders(List.of("capacityProviders"))
     * .clusterName("clusterName")
     * .clusterSettings(List.of(ClusterSettingsProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .configuration(ClusterConfigurationProperty.builder()
     * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
     * .kmsKeyId("kmsKeyId")
     * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroupName("cloudWatchLogGroupName")
     * .s3BucketName("s3BucketName")
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .logging("logging")
     * .build())
     * .build())
     * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build()))
     * .serviceConnectDefaults(ServiceConnectDefaultsProperty.builder()
     * .namespace("namespace")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
     * through a managed proxy container that collects logs and metrics for increased visibility.
     * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
     * information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceConnectDefaultsProperty serviceConnectDefaultsProperty =
     * ServiceConnectDefaultsProperty.builder()
     * .namespace("namespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-serviceconnectdefaults.html)
     */
    public inline fun cfnClusterServiceConnectDefaultsProperty(
        block: CfnClusterServiceConnectDefaultsPropertyDsl.() -> Unit = {}
    ): CfnCluster.ServiceConnectDefaultsProperty {
        val builder = CfnClusterServiceConnectDefaultsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Modifies which task set in a service is the primary task set.
     *
     * Any parameters that are updated on the primary task set in a service will transition to the
     * service. This is used when a service uses the `EXTERNAL` deployment controller type. For more
     * information, see
     * [Amazon ECS Deployment Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnPrimaryTaskSet cfnPrimaryTaskSet = CfnPrimaryTaskSet.Builder.create(this,
     * "MyCfnPrimaryTaskSet")
     * .cluster("cluster")
     * .service("service")
     * .taskSetId("taskSetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html)
     */
    public inline fun cfnPrimaryTaskSet(
        scope: Construct,
        id: String,
        block: CfnPrimaryTaskSetDsl.() -> Unit = {},
    ): CfnPrimaryTaskSet {
        val builder = CfnPrimaryTaskSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPrimaryTaskSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnPrimaryTaskSetProps cfnPrimaryTaskSetProps = CfnPrimaryTaskSetProps.builder()
     * .cluster("cluster")
     * .service("service")
     * .taskSetId("taskSetId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html)
     */
    public inline fun cfnPrimaryTaskSetProps(
        block: CfnPrimaryTaskSetPropsDsl.() -> Unit = {}
    ): CfnPrimaryTaskSetProps {
        val builder = CfnPrimaryTaskSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ECS::Service` resource creates an Amazon Elastic Container Service (Amazon ECS)
     * service that runs and maintains the requested number of tasks and associated load balancers.
     *
     * The stack update fails if you change any properties that require replacement and at least one
     * Amazon ECS Service Connect `ServiceConnectService` is configured. This is because AWS
     * CloudFormation creates the replacement service first, but each `ServiceConnectService` must
     * have a name that is unique in the namespace. &gt; Starting April 15, 2023, AWS ; will not
     * onboard new customers to Amazon Elastic Inference (EI), and will help current customers
     * migrate their workloads to options that offer better price and performance. After April 15,
     * 2023, new customers will not be able to launch instances with Amazon EI accelerators in
     * Amazon SageMaker, Amazon ECS , or Amazon EC2 . However, customers who have used Amazon EI at
     * least once during the past 30-day period are considered current customers and will be able to
     * continue using the service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build()))
     * .cluster("cluster")
     * .deploymentConfiguration(DeploymentConfigurationProperty.builder()
     * .alarms(DeploymentAlarmsProperty.builder()
     * .alarmNames(List.of("alarmNames"))
     * .enable(false)
     * .rollback(false)
     * .build())
     * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
     * .enable(false)
     * .rollback(false)
     * .build())
     * .maximumPercent(123)
     * .minimumHealthyPercent(123)
     * .build())
     * .deploymentController(DeploymentControllerProperty.builder()
     * .type("type")
     * .build())
     * .desiredCount(123)
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriodSeconds(123)
     * .launchType("launchType")
     * .loadBalancers(List.of(LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .loadBalancerName("loadBalancerName")
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .field("field")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .role("role")
     * .schedulingStrategy("schedulingStrategy")
     * .serviceConnectConfiguration(ServiceConnectConfigurationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .namespace("namespace")
     * .services(List.of(ServiceConnectServiceProperty.builder()
     * .portName("portName")
     * // the properties below are optional
     * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
     * .port(123)
     * // the properties below are optional
     * .dnsName("dnsName")
     * .build()))
     * .discoveryName("discoveryName")
     * .ingressPortOverride(123)
     * .build()))
     * .build())
     * .serviceName("serviceName")
     * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskDefinition("taskDefinition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
     */
    public inline fun cfnService(
        scope: Construct,
        id: String,
        block: CfnServiceDsl.() -> Unit = {},
    ): CfnService {
        val builder = CfnServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the networking details for a task or service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-awsvpcconfiguration.html)
     */
    public inline fun cfnServiceAwsVpcConfigurationProperty(
        block: CfnServiceAwsVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.AwsVpcConfigurationProperty {
        val builder = CfnServiceAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a capacity provider strategy.
     *
     * A capacity provider strategy can be set when using the `RunTask` or `CreateService` APIs or
     * as the default capacity provider strategy for a cluster with the `CreateCluster` API.
     *
     * Only capacity providers that are already associated with a cluster and have an `ACTIVE` or
     * `UPDATING` status can be used in a capacity provider strategy. The
     * `PutClusterCapacityProviders` API is used to associate a capacity provider with a cluster.
     *
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
     * already be created. New Auto Scaling group capacity providers can be created with the
     * `CreateCapacityProvider` API operation.
     *
     * To use an AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used in a capacity provider strategy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
     * CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-capacityproviderstrategyitem.html)
     */
    public inline fun cfnServiceCapacityProviderStrategyItemProperty(
        block: CfnServiceCapacityProviderStrategyItemPropertyDsl.() -> Unit = {}
    ): CfnService.CapacityProviderStrategyItemProperty {
        val builder = CfnServiceCapacityProviderStrategyItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * One of the methods which provide a way for you to quickly identify when a deployment has
     * failed, and then to optionally roll back the failure to the last working deployment.
     *
     * When the alarms are generated, Amazon ECS sets the service deployment to failed. Set the
     * rollback parameter to have Amazon ECS to roll back your service to the last completed
     * deployment after a failure.
     *
     * You can only use the `DeploymentAlarms` method to detect failures when the
     * `DeploymentController` is set to `ECS` (rolling update).
     *
     * For more information, see
     * [Rolling update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
     * in the **Amazon Elastic Container Service Developer Guide** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DeploymentAlarmsProperty deploymentAlarmsProperty = DeploymentAlarmsProperty.builder()
     * .alarmNames(List.of("alarmNames"))
     * .enable(false)
     * .rollback(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentalarms.html)
     */
    public inline fun cfnServiceDeploymentAlarmsProperty(
        block: CfnServiceDeploymentAlarmsPropertyDsl.() -> Unit = {}
    ): CfnService.DeploymentAlarmsProperty {
        val builder = CfnServiceDeploymentAlarmsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deployment circuit breaker can only be used for services using the rolling update ( `ECS`
     * ) deployment type.
     *
     * The *deployment circuit breaker* determines whether a service deployment will fail if the
     * service can't reach a steady state. If it is turned on, a service deployment will transition
     * to a failed state and stop launching new tasks. You can also configure Amazon ECS to roll
     * back your service to the last completed deployment after a failure. For more information, see
     * [Rolling update](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about API failure reasons, see
     * [API failure reasons](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/api_failures_messages.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DeploymentCircuitBreakerProperty deploymentCircuitBreakerProperty =
     * DeploymentCircuitBreakerProperty.builder()
     * .enable(false)
     * .rollback(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcircuitbreaker.html)
     */
    public inline fun cfnServiceDeploymentCircuitBreakerProperty(
        block: CfnServiceDeploymentCircuitBreakerPropertyDsl.() -> Unit = {}
    ): CfnService.DeploymentCircuitBreakerProperty {
        val builder = CfnServiceDeploymentCircuitBreakerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `DeploymentConfiguration` property specifies optional deployment parameters that control
     * how many tasks run during the deployment and the ordering of stopping and starting tasks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DeploymentConfigurationProperty deploymentConfigurationProperty =
     * DeploymentConfigurationProperty.builder()
     * .alarms(DeploymentAlarmsProperty.builder()
     * .alarmNames(List.of("alarmNames"))
     * .enable(false)
     * .rollback(false)
     * .build())
     * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
     * .enable(false)
     * .rollback(false)
     * .build())
     * .maximumPercent(123)
     * .minimumHealthyPercent(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html)
     */
    public inline fun cfnServiceDeploymentConfigurationProperty(
        block: CfnServiceDeploymentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.DeploymentConfigurationProperty {
        val builder = CfnServiceDeploymentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deployment controller to use for the service.
     *
     * For more information, see
     * [Amazon ECS deployment types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DeploymentControllerProperty deploymentControllerProperty =
     * DeploymentControllerProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentcontroller.html)
     */
    public inline fun cfnServiceDeploymentControllerProperty(
        block: CfnServiceDeploymentControllerPropertyDsl.() -> Unit = {}
    ): CfnService.DeploymentControllerProperty {
        val builder = CfnServiceDeploymentControllerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LoadBalancer` property specifies details on a load balancer that is used with a service.
     *
     * If the service is using the `CODE_DEPLOY` deployment controller, the service is required to
     * use either an Application Load Balancer or Network Load Balancer. When you are creating an
     * AWS CodeDeploy deployment group, you specify two target groups (referred to as a
     * `targetGroupPair` ). Each target group binds to a separate task set in the deployment. The
     * load balancer can also have up to two listeners, a required listener for production traffic
     * and an optional listener that allows you to test new revisions of the service before routing
     * production traffic to it.
     *
     * Services with tasks that use the `awsvpc` network mode (for example, those with the Fargate
     * launch type) only support Application Load Balancers and Network Load Balancers. Classic Load
     * Balancers are not supported. Also, when you create any target groups for these services, you
     * must choose `ip` as the target type, not `instance` . Tasks that use the `awsvpc` network
     * mode are associated with an elastic network interface, not an Amazon EC2 instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LoadBalancerProperty loadBalancerProperty = LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .loadBalancerName("loadBalancerName")
     * .targetGroupArn("targetGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-loadbalancer.html)
     */
    public inline fun cfnServiceLoadBalancerProperty(
        block: CfnServiceLoadBalancerPropertyDsl.() -> Unit = {}
    ): CfnService.LoadBalancerProperty {
        val builder = CfnServiceLoadBalancerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The log configuration for the container.
     *
     * This parameter maps to `LogConfig` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--log-driver` option to
     * [`docker run`](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/run/)
     * .
     *
     * By default, containers use the same logging driver that the Docker daemon uses. However, the
     * container might use a different logging driver than the Docker daemon by specifying a log
     * driver configuration in the container definition. For more information about the options for
     * different supported log drivers, see
     * [Configure logging drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
     * in the Docker documentation.
     *
     * Understand the following when specifying a log configuration for your containers.
     * * Amazon ECS currently supports a subset of the logging drivers available to the Docker
     *   daemon (shown in the valid values below). Additional log drivers may be available in future
     *   releases of the Amazon ECS container agent.
     * * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     *   instance.
     * * For tasks that are hosted on Amazon EC2 instances, the Amazon ECS container agent must
     *   register the available logging drivers with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
     *   variable before containers placed on that instance can use these log configuration options.
     *   For more information, see
     *   [Amazon ECS container agent configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     *   in the *Amazon Elastic Container Service Developer Guide* .
     * * For tasks that are on AWS Fargate , because you don't have access to the underlying
     *   infrastructure your tasks are hosted on, any additional software needed must be installed
     *   outside of the task. For example, the Fluentd output aggregators or a remote host running
     *   Logstash to send Gelf logs to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-logconfiguration.html)
     */
    public inline fun cfnServiceLogConfigurationProperty(
        block: CfnServiceLogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.LogConfigurationProperty {
        val builder = CfnServiceLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `NetworkConfiguration` property specifies an object representing the network
     * configuration for a task or service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html)
     */
    public inline fun cfnServiceNetworkConfigurationProperty(
        block: CfnServiceNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.NetworkConfigurationProperty {
        val builder = CfnServiceNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `PlacementConstraint` property specifies an object representing a constraint on task
     * placement in the task definition.
     *
     * For more information, see
     * [Task Placement Constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * PlacementConstraintProperty placementConstraintProperty = PlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementconstraint.html)
     */
    public inline fun cfnServicePlacementConstraintProperty(
        block: CfnServicePlacementConstraintPropertyDsl.() -> Unit = {}
    ): CfnService.PlacementConstraintProperty {
        val builder = CfnServicePlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `PlacementStrategy` property specifies the task placement strategy for a task or service.
     *
     * For more information, see
     * [Task Placement Strategies](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * PlacementStrategyProperty placementStrategyProperty = PlacementStrategyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .field("field")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-placementstrategy.html)
     */
    public inline fun cfnServicePlacementStrategyProperty(
        block: CfnServicePlacementStrategyPropertyDsl.() -> Unit = {}
    ): CfnService.PlacementStrategyProperty {
        val builder = CfnServicePlacementStrategyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnService`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
     * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
     * .base(123)
     * .capacityProvider("capacityProvider")
     * .weight(123)
     * .build()))
     * .cluster("cluster")
     * .deploymentConfiguration(DeploymentConfigurationProperty.builder()
     * .alarms(DeploymentAlarmsProperty.builder()
     * .alarmNames(List.of("alarmNames"))
     * .enable(false)
     * .rollback(false)
     * .build())
     * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
     * .enable(false)
     * .rollback(false)
     * .build())
     * .maximumPercent(123)
     * .minimumHealthyPercent(123)
     * .build())
     * .deploymentController(DeploymentControllerProperty.builder()
     * .type("type")
     * .build())
     * .desiredCount(123)
     * .enableEcsManagedTags(false)
     * .enableExecuteCommand(false)
     * .healthCheckGracePeriodSeconds(123)
     * .launchType("launchType")
     * .loadBalancers(List.of(LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .loadBalancerName("loadBalancerName")
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .subnets(List.of("subnets"))
     * .build())
     * .build())
     * .placementConstraints(List.of(PlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build()))
     * .placementStrategies(List.of(PlacementStrategyProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .field("field")
     * .build()))
     * .platformVersion("platformVersion")
     * .propagateTags("propagateTags")
     * .role("role")
     * .schedulingStrategy("schedulingStrategy")
     * .serviceConnectConfiguration(ServiceConnectConfigurationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .namespace("namespace")
     * .services(List.of(ServiceConnectServiceProperty.builder()
     * .portName("portName")
     * // the properties below are optional
     * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
     * .port(123)
     * // the properties below are optional
     * .dnsName("dnsName")
     * .build()))
     * .discoveryName("discoveryName")
     * .ingressPortOverride(123)
     * .build()))
     * .build())
     * .serviceName("serviceName")
     * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskDefinition("taskDefinition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
     */
    public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
        val builder = CfnServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the secret to expose to your container.
     *
     * Secrets can be exposed to a container in the following ways:
     * * To inject sensitive data into your containers as environment variables, use the `secrets`
     *   container definition parameter.
     * * To reference sensitive information in the log configuration of a container, use the
     *   `secretOptions` container definition parameter.
     *
     * For more information, see
     * [Specifying sensitive data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SecretProperty secretProperty = SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html)
     */
    public inline fun cfnServiceSecretProperty(
        block: CfnServiceSecretPropertyDsl.() -> Unit = {}
    ): CfnService.SecretProperty {
        val builder = CfnServiceSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Each alias ("endpoint") is a fully-qualified name and port number that other tasks
     * ("clients") can use to connect to this service.
     *
     * Each name and port mapping must be unique within the namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
     * through a managed proxy container that collects logs and metrics for increased visibility.
     * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
     * information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceConnectClientAliasProperty serviceConnectClientAliasProperty =
     * ServiceConnectClientAliasProperty.builder()
     * .port(123)
     * // the properties below are optional
     * .dnsName("dnsName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectclientalias.html)
     */
    public inline fun cfnServiceServiceConnectClientAliasProperty(
        block: CfnServiceServiceConnectClientAliasPropertyDsl.() -> Unit = {}
    ): CfnService.ServiceConnectClientAliasProperty {
        val builder = CfnServiceServiceConnectClientAliasPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Service Connect configuration of your Amazon ECS service.
     *
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
     * through a managed proxy container that collects logs and metrics for increased visibility.
     * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
     * information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceConnectConfigurationProperty serviceConnectConfigurationProperty =
     * ServiceConnectConfigurationProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .namespace("namespace")
     * .services(List.of(ServiceConnectServiceProperty.builder()
     * .portName("portName")
     * // the properties below are optional
     * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
     * .port(123)
     * // the properties below are optional
     * .dnsName("dnsName")
     * .build()))
     * .discoveryName("discoveryName")
     * .ingressPortOverride(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectconfiguration.html)
     */
    public inline fun cfnServiceServiceConnectConfigurationProperty(
        block: CfnServiceServiceConnectConfigurationPropertyDsl.() -> Unit = {}
    ): CfnService.ServiceConnectConfigurationProperty {
        val builder = CfnServiceServiceConnectConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Service Connect service object configuration.
     *
     * For more information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceConnectServiceProperty serviceConnectServiceProperty =
     * ServiceConnectServiceProperty.builder()
     * .portName("portName")
     * // the properties below are optional
     * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
     * .port(123)
     * // the properties below are optional
     * .dnsName("dnsName")
     * .build()))
     * .discoveryName("discoveryName")
     * .ingressPortOverride(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceconnectservice.html)
     */
    public inline fun cfnServiceServiceConnectServiceProperty(
        block: CfnServiceServiceConnectServicePropertyDsl.() -> Unit = {}
    ): CfnService.ServiceConnectServiceProperty {
        val builder = CfnServiceServiceConnectServicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ServiceRegistry` property specifies details of the service registry.
     *
     * For more information, see
     * [Service Discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceRegistryProperty serviceRegistryProperty = ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-serviceregistry.html)
     */
    public inline fun cfnServiceServiceRegistryProperty(
        block: CfnServiceServiceRegistryPropertyDsl.() -> Unit = {}
    ): CfnService.ServiceRegistryProperty {
        val builder = CfnServiceServiceRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Registers a new task definition from the supplied `family` and `containerDefinitions` .
     *
     * Optionally, you can add data volumes to your containers with the `volumes` parameter. For
     * more information about task definition parameters and defaults, see
     * [Amazon ECS Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * You can specify a role for your task with the `taskRoleArn` parameter. When you specify a
     * role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to
     * make API requests to the AWS services that are specified in the policy that's associated with
     * the role. For more information, see
     * [IAM Roles for Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * You can specify a Docker networking mode for the containers in your task definition with the
     * `networkMode` parameter. The available network modes correspond to those described in
     * [Network settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#/network-settings)
     * in the Docker run reference. If you specify the `awsvpc` network mode, the task is allocated
     * an elastic network interface, and you must specify a `NetworkConfiguration` when you create a
     * service or run a task with the task definition. For more information, see
     * [Task Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnTaskDefinition cfnTaskDefinition = CfnTaskDefinition.Builder.create(this,
     * "MyCfnTaskDefinition")
     * .containerDefinitions(List.of(ContainerDefinitionProperty.builder()
     * .image("image")
     * .name("name")
     * // the properties below are optional
     * .command(List.of("command"))
     * .cpu(123)
     * .dependsOn(List.of(ContainerDependencyProperty.builder()
     * .condition("condition")
     * .containerName("containerName")
     * .build()))
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .essential(false)
     * .extraHosts(List.of(HostEntryProperty.builder()
     * .hostname("hostname")
     * .ipAddress("ipAddress")
     * .build()))
     * .firelensConfiguration(FirelensConfigurationProperty.builder()
     * .options(Map.of(
     * "optionsKey", "options"))
     * .type("type")
     * .build())
     * .healthCheck(HealthCheckProperty.builder()
     * .command(List.of("command"))
     * .interval(123)
     * .retries(123)
     * .startPeriod(123)
     * .timeout(123)
     * .build())
     * .hostname("hostname")
     * .interactive(false)
     * .links(List.of("links"))
     * .linuxParameters(LinuxParametersProperty.builder()
     * .capabilities(KernelCapabilitiesProperty.builder()
     * .add(List.of("add"))
     * .drop(List.of("drop"))
     * .build())
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .size(123)
     * // the properties below are optional
     * .containerPath("containerPath")
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .memoryReservation(123)
     * .mountPoints(List.of(MountPointProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .portMappings(List.of(PortMappingProperty.builder()
     * .appProtocol("appProtocol")
     * .containerPort(123)
     * .containerPortRange("containerPortRange")
     * .hostPort(123)
     * .name("name")
     * .protocol("protocol")
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .startTimeout(123)
     * .stopTimeout(123)
     * .systemControls(List.of(SystemControlProperty.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .volumesFrom(List.of(VolumeFromProperty.builder()
     * .readOnly(false)
     * .sourceContainer("sourceContainer")
     * .build()))
     * .workingDirectory("workingDirectory")
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .family("family")
     * .inferenceAccelerators(List.of(InferenceAcceleratorProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .ipcMode("ipcMode")
     * .memory("memory")
     * .networkMode("networkMode")
     * .pidMode("pidMode")
     * .placementConstraints(List.of(TaskDefinitionPlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build()))
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .containerName("containerName")
     * // the properties below are optional
     * .proxyConfigurationProperties(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .type("type")
     * .build())
     * .requiresCompatibilities(List.of("requiresCompatibilities"))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskRoleArn("taskRoleArn")
     * .volumes(List.of(VolumeProperty.builder()
     * .dockerVolumeConfiguration(DockerVolumeConfigurationProperty.builder()
     * .autoprovision(false)
     * .driver("driver")
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .scope("scope")
     * .build())
     * .efsVolumeConfiguration(EFSVolumeConfigurationProperty.builder()
     * .filesystemId("filesystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(HostVolumePropertiesProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html)
     */
    public inline fun cfnTaskDefinition(
        scope: Construct,
        id: String,
        block: CfnTaskDefinitionDsl.() -> Unit = {},
    ): CfnTaskDefinition {
        val builder = CfnTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html)
     */
    public inline fun cfnTaskDefinitionAuthorizationConfigProperty(
        block: CfnTaskDefinitionAuthorizationConfigPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.AuthorizationConfigProperty {
        val builder = CfnTaskDefinitionAuthorizationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ContainerDefinition` property specifies a container definition.
     *
     * Container definitions are used in task definitions to describe the different containers that
     * are launched as part of a task.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
     * .image("image")
     * .name("name")
     * // the properties below are optional
     * .command(List.of("command"))
     * .cpu(123)
     * .dependsOn(List.of(ContainerDependencyProperty.builder()
     * .condition("condition")
     * .containerName("containerName")
     * .build()))
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .essential(false)
     * .extraHosts(List.of(HostEntryProperty.builder()
     * .hostname("hostname")
     * .ipAddress("ipAddress")
     * .build()))
     * .firelensConfiguration(FirelensConfigurationProperty.builder()
     * .options(Map.of(
     * "optionsKey", "options"))
     * .type("type")
     * .build())
     * .healthCheck(HealthCheckProperty.builder()
     * .command(List.of("command"))
     * .interval(123)
     * .retries(123)
     * .startPeriod(123)
     * .timeout(123)
     * .build())
     * .hostname("hostname")
     * .interactive(false)
     * .links(List.of("links"))
     * .linuxParameters(LinuxParametersProperty.builder()
     * .capabilities(KernelCapabilitiesProperty.builder()
     * .add(List.of("add"))
     * .drop(List.of("drop"))
     * .build())
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .size(123)
     * // the properties below are optional
     * .containerPath("containerPath")
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .memoryReservation(123)
     * .mountPoints(List.of(MountPointProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .portMappings(List.of(PortMappingProperty.builder()
     * .appProtocol("appProtocol")
     * .containerPort(123)
     * .containerPortRange("containerPortRange")
     * .hostPort(123)
     * .name("name")
     * .protocol("protocol")
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .startTimeout(123)
     * .stopTimeout(123)
     * .systemControls(List.of(SystemControlProperty.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .volumesFrom(List.of(VolumeFromProperty.builder()
     * .readOnly(false)
     * .sourceContainer("sourceContainer")
     * .build()))
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html)
     */
    public inline fun cfnTaskDefinitionContainerDefinitionProperty(
        block: CfnTaskDefinitionContainerDefinitionPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.ContainerDefinitionProperty {
        val builder = CfnTaskDefinitionContainerDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ContainerDependency` property specifies the dependencies defined for container startup
     * and shutdown.
     *
     * A container can contain multiple dependencies. When a dependency is defined for container
     * startup, for container shutdown it is reversed.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to
     * enable container dependencies. However, we recommend using the latest container agent
     * version. For information about checking your agent version and updating to the latest
     * version, see
     * [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     * in the *Amazon Elastic Container Service Developer Guide* . If you are using an Amazon
     * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
     * package. If your container instances are launched from version `20190301` or later, then they
     * contain the required versions of the container agent and `ecs-init` . For more information,
     * see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For tasks using the Fargate launch type, this parameter requires that the task or service
     * uses platform version 1.3.0 or later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ContainerDependencyProperty containerDependencyProperty = ContainerDependencyProperty.builder()
     * .condition("condition")
     * .containerName("containerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html)
     */
    public inline fun cfnTaskDefinitionContainerDependencyProperty(
        block: CfnTaskDefinitionContainerDependencyPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.ContainerDependencyProperty {
        val builder = CfnTaskDefinitionContainerDependencyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Device` property specifies an object representing a container instance host device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DeviceProperty deviceProperty = DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html)
     */
    public inline fun cfnTaskDefinitionDeviceProperty(
        block: CfnTaskDefinitionDevicePropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.DeviceProperty {
        val builder = CfnTaskDefinitionDevicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `DockerVolumeConfiguration` property specifies a Docker volume configuration and is used
     * when you use Docker volumes.
     *
     * Docker volumes are only supported when you are using the EC2 launch type. Windows containers
     * only support the use of the `local` driver. To use bind mounts, specify a `host` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DockerVolumeConfigurationProperty dockerVolumeConfigurationProperty =
     * DockerVolumeConfigurationProperty.builder()
     * .autoprovision(false)
     * .driver("driver")
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .scope("scope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html)
     */
    public inline fun cfnTaskDefinitionDockerVolumeConfigurationProperty(
        block: CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.DockerVolumeConfigurationProperty {
        val builder = CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This parameter is specified when you're using an Amazon Elastic File System file system for
     * task storage.
     *
     * For more information, see
     * [Amazon EFS volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * EFSVolumeConfigurationProperty eFSVolumeConfigurationProperty =
     * EFSVolumeConfigurationProperty.builder()
     * .filesystemId("filesystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html)
     */
    public inline fun cfnTaskDefinitionEFSVolumeConfigurationProperty(
        block: CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.EFSVolumeConfigurationProperty {
        val builder = CfnTaskDefinitionEFSVolumeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of files containing the environment variables to pass to a container.
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file should contain an environment variable in `VARIABLE=VALUE`
     * format. Lines beginning with `#` are treated as comments and are ignored. For more
     * information about the environment variable file syntax, see
     * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
     * .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed
     * from the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying environment variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * This parameter is only supported for tasks hosted on Fargate using the following platform
     * versions:
     * * Linux platform version `1.4.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * EnvironmentFileProperty environmentFileProperty = EnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html)
     */
    public inline fun cfnTaskDefinitionEnvironmentFileProperty(
        block: CfnTaskDefinitionEnvironmentFilePropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.EnvironmentFileProperty {
        val builder = CfnTaskDefinitionEnvironmentFilePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The amount of ephemeral storage to allocate for the task.
     *
     * This parameter is used to expand the total amount of ephemeral storage available, beyond the
     * default amount, for tasks hosted on AWS Fargate . For more information, see
     * [Fargate task storage](https://docs.aws.amazon.com/AmazonECS/latest/userguide/using_data_volumes.html)
     * in the *Amazon ECS User Guide for AWS Fargate* .
     *
     * For tasks using the Fargate launch type, the task requires the following platforms:
     * * Linux platform version `1.4.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ephemeralstorage.html)
     */
    public inline fun cfnTaskDefinitionEphemeralStorageProperty(
        block: CfnTaskDefinitionEphemeralStoragePropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.EphemeralStorageProperty {
        val builder = CfnTaskDefinitionEphemeralStoragePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The FireLens configuration for the container.
     *
     * This is used to specify and configure a log router for container logs. For more information,
     * see
     * [Custom log routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * FirelensConfigurationProperty firelensConfigurationProperty =
     * FirelensConfigurationProperty.builder()
     * .options(Map.of(
     * "optionsKey", "options"))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html)
     */
    public inline fun cfnTaskDefinitionFirelensConfigurationProperty(
        block: CfnTaskDefinitionFirelensConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.FirelensConfigurationProperty {
        val builder = CfnTaskDefinitionFirelensConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HealthCheck` property specifies an object representing a container health check.
     *
     * Health check parameters that are specified in a container definition override any Docker
     * health checks that exist in the container image (such as those specified in a parent image or
     * from the image's Dockerfile). This configuration maps to the `HEALTHCHECK` parameter of
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
     *
     * The Amazon ECS container agent only monitors and reports on the health checks specified in
     * the task definition. Amazon ECS does not monitor Docker health checks that are embedded in a
     * container image and not specified in the container definition. Health check parameters that
     * are specified in a container definition override any Docker health checks that exist in the
     * container image.
     *
     * If a task is run manually, and not as part of a service, the task will continue its lifecycle
     * regardless of its health status. For tasks that are part of a service, if the task reports as
     * unhealthy then the task will be stopped and the service scheduler will replace it.
     *
     * The following are notes about container health check support:
     * * Container health checks require version 1.17.0 or greater of the Amazon ECS container
     *   agent. For more information, see
     *   [Updating the Amazon ECS Container Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html)
     *   .
     * * Container health checks are supported for Fargate tasks if you are using platform version
     *   1.1.0 or greater. For more information, see
     *   [AWS Fargate Platform Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     *   .
     * * Container health checks are not supported for tasks that are part of a service that is
     *   configured to use a Classic Load Balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
     * .command(List.of("command"))
     * .interval(123)
     * .retries(123)
     * .startPeriod(123)
     * .timeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html)
     */
    public inline fun cfnTaskDefinitionHealthCheckProperty(
        block: CfnTaskDefinitionHealthCheckPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.HealthCheckProperty {
        val builder = CfnTaskDefinitionHealthCheckPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HostEntry` property specifies a hostname and an IP address that are added to the
     * `/etc/hosts` file of a container through the `extraHosts` parameter of its
     * `ContainerDefinition` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * HostEntryProperty hostEntryProperty = HostEntryProperty.builder()
     * .hostname("hostname")
     * .ipAddress("ipAddress")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html)
     */
    public inline fun cfnTaskDefinitionHostEntryProperty(
        block: CfnTaskDefinitionHostEntryPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.HostEntryProperty {
        val builder = CfnTaskDefinitionHostEntryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `HostVolumeProperties` property specifies details on a container instance bind mount host
     * volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * HostVolumePropertiesProperty hostVolumePropertiesProperty =
     * HostVolumePropertiesProperty.builder()
     * .sourcePath("sourcePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostvolumeproperties.html)
     */
    public inline fun cfnTaskDefinitionHostVolumePropertiesProperty(
        block: CfnTaskDefinitionHostVolumePropertiesPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.HostVolumePropertiesProperty {
        val builder = CfnTaskDefinitionHostVolumePropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details on an Elastic Inference accelerator.
     *
     * For more information, see
     * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * InferenceAcceleratorProperty inferenceAcceleratorProperty =
     * InferenceAcceleratorProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html)
     */
    public inline fun cfnTaskDefinitionInferenceAcceleratorProperty(
        block: CfnTaskDefinitionInferenceAcceleratorPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.InferenceAcceleratorProperty {
        val builder = CfnTaskDefinitionInferenceAcceleratorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `KernelCapabilities` property specifies the Linux capabilities for the container that are
     * added to or dropped from the default configuration that is provided by Docker.
     *
     * For more information on the default capabilities and the non-default available capabilities,
     * see
     * [Runtime privilege and Linux capabilities](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities)
     * in the *Docker run reference* . For more detailed information on these Linux capabilities,
     * see the
     * [capabilities(7)](https://docs.aws.amazon.com/http://man7.org/linux/man-pages/man7/capabilities.7.html)
     * Linux manual page.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * KernelCapabilitiesProperty kernelCapabilitiesProperty = KernelCapabilitiesProperty.builder()
     * .add(List.of("add"))
     * .drop(List.of("drop"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html)
     */
    public inline fun cfnTaskDefinitionKernelCapabilitiesProperty(
        block: CfnTaskDefinitionKernelCapabilitiesPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.KernelCapabilitiesProperty {
        val builder = CfnTaskDefinitionKernelCapabilitiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair object.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html)
     */
    public inline fun cfnTaskDefinitionKeyValuePairProperty(
        block: CfnTaskDefinitionKeyValuePairPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.KeyValuePairProperty {
        val builder = CfnTaskDefinitionKeyValuePairPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Linux-specific options that are applied to the container, such as Linux
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LinuxParametersProperty linuxParametersProperty = LinuxParametersProperty.builder()
     * .capabilities(KernelCapabilitiesProperty.builder()
     * .add(List.of("add"))
     * .drop(List.of("drop"))
     * .build())
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .size(123)
     * // the properties below are optional
     * .containerPath("containerPath")
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html)
     */
    public inline fun cfnTaskDefinitionLinuxParametersProperty(
        block: CfnTaskDefinitionLinuxParametersPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.LinuxParametersProperty {
        val builder = CfnTaskDefinitionLinuxParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `LogConfiguration` property specifies log configuration options to send to a custom log
     * driver for the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html)
     */
    public inline fun cfnTaskDefinitionLogConfigurationProperty(
        block: CfnTaskDefinitionLogConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.LogConfigurationProperty {
        val builder = CfnTaskDefinitionLogConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details for a volume mount point that's used in a container definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * MountPointProperty mountPointProperty = MountPointProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html)
     */
    public inline fun cfnTaskDefinitionMountPointProperty(
        block: CfnTaskDefinitionMountPointPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.MountPointProperty {
        val builder = CfnTaskDefinitionMountPointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `PortMapping` property specifies a port mapping.
     *
     * Port mappings allow containers to access ports on the host container instance to send or
     * receive traffic. Port mappings are specified as part of the container definition.
     *
     * If you are using containers in a task with the `awsvpc` or `host` network mode, exposed ports
     * should be specified using `containerPort` . The `hostPort` can be left blank or it must be
     * the same value as the `containerPort` .
     *
     * After a task reaches the `RUNNING` status, manual and automatic host and container port
     * assignments are visible in the `networkBindings` section of
     * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * API responses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
     * .appProtocol("appProtocol")
     * .containerPort(123)
     * .containerPortRange("containerPortRange")
     * .hostPort(123)
     * .name("name")
     * .protocol("protocol")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html)
     */
    public inline fun cfnTaskDefinitionPortMappingProperty(
        block: CfnTaskDefinitionPortMappingPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.PortMappingProperty {
        val builder = CfnTaskDefinitionPortMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTaskDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnTaskDefinitionProps cfnTaskDefinitionProps = CfnTaskDefinitionProps.builder()
     * .containerDefinitions(List.of(ContainerDefinitionProperty.builder()
     * .image("image")
     * .name("name")
     * // the properties below are optional
     * .command(List.of("command"))
     * .cpu(123)
     * .dependsOn(List.of(ContainerDependencyProperty.builder()
     * .condition("condition")
     * .containerName("containerName")
     * .build()))
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .environmentFiles(List.of(EnvironmentFileProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .essential(false)
     * .extraHosts(List.of(HostEntryProperty.builder()
     * .hostname("hostname")
     * .ipAddress("ipAddress")
     * .build()))
     * .firelensConfiguration(FirelensConfigurationProperty.builder()
     * .options(Map.of(
     * "optionsKey", "options"))
     * .type("type")
     * .build())
     * .healthCheck(HealthCheckProperty.builder()
     * .command(List.of("command"))
     * .interval(123)
     * .retries(123)
     * .startPeriod(123)
     * .timeout(123)
     * .build())
     * .hostname("hostname")
     * .interactive(false)
     * .links(List.of("links"))
     * .linuxParameters(LinuxParametersProperty.builder()
     * .capabilities(KernelCapabilitiesProperty.builder()
     * .add(List.of("add"))
     * .drop(List.of("drop"))
     * .build())
     * .devices(List.of(DeviceProperty.builder()
     * .containerPath("containerPath")
     * .hostPath("hostPath")
     * .permissions(List.of("permissions"))
     * .build()))
     * .initProcessEnabled(false)
     * .maxSwap(123)
     * .sharedMemorySize(123)
     * .swappiness(123)
     * .tmpfs(List.of(TmpfsProperty.builder()
     * .size(123)
     * // the properties below are optional
     * .containerPath("containerPath")
     * .mountOptions(List.of("mountOptions"))
     * .build()))
     * .build())
     * .logConfiguration(LogConfigurationProperty.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build())
     * .memory(123)
     * .memoryReservation(123)
     * .mountPoints(List.of(MountPointProperty.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build()))
     * .portMappings(List.of(PortMappingProperty.builder()
     * .appProtocol("appProtocol")
     * .containerPort(123)
     * .containerPortRange("containerPortRange")
     * .hostPort(123)
     * .name("name")
     * .protocol("protocol")
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .resourceRequirements(List.of(ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build()))
     * .secrets(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .startTimeout(123)
     * .stopTimeout(123)
     * .systemControls(List.of(SystemControlProperty.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .volumesFrom(List.of(VolumeFromProperty.builder()
     * .readOnly(false)
     * .sourceContainer("sourceContainer")
     * .build()))
     * .workingDirectory("workingDirectory")
     * .build()))
     * .cpu("cpu")
     * .ephemeralStorage(EphemeralStorageProperty.builder()
     * .sizeInGiB(123)
     * .build())
     * .executionRoleArn("executionRoleArn")
     * .family("family")
     * .inferenceAccelerators(List.of(InferenceAcceleratorProperty.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build()))
     * .ipcMode("ipcMode")
     * .memory("memory")
     * .networkMode("networkMode")
     * .pidMode("pidMode")
     * .placementConstraints(List.of(TaskDefinitionPlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build()))
     * .proxyConfiguration(ProxyConfigurationProperty.builder()
     * .containerName("containerName")
     * // the properties below are optional
     * .proxyConfigurationProperties(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .type("type")
     * .build())
     * .requiresCompatibilities(List.of("requiresCompatibilities"))
     * .runtimePlatform(RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .taskRoleArn("taskRoleArn")
     * .volumes(List.of(VolumeProperty.builder()
     * .dockerVolumeConfiguration(DockerVolumeConfigurationProperty.builder()
     * .autoprovision(false)
     * .driver("driver")
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .scope("scope")
     * .build())
     * .efsVolumeConfiguration(EFSVolumeConfigurationProperty.builder()
     * .filesystemId("filesystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(HostVolumePropertiesProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html)
     */
    public inline fun cfnTaskDefinitionProps(
        block: CfnTaskDefinitionPropsDsl.() -> Unit = {}
    ): CfnTaskDefinitionProps {
        val builder = CfnTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * For tasks that use the EC2 launch type, the container instances require at least version
     * 1.26.0 of the container agent and at least version 1.26.0-1 of the `ecs-init` package to use
     * a proxy configuration. If your container instances are launched from the Amazon ECS optimized
     * AMI version `20190301` or later, then they contain the required versions of the container
     * agent and `ecs-init` . For more information, see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ProxyConfigurationProperty proxyConfigurationProperty = ProxyConfigurationProperty.builder()
     * .containerName("containerName")
     * // the properties below are optional
     * .proxyConfigurationProperties(List.of(KeyValuePairProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html)
     */
    public inline fun cfnTaskDefinitionProxyConfigurationProperty(
        block: CfnTaskDefinitionProxyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.ProxyConfigurationProperty {
        val builder = CfnTaskDefinitionProxyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The repository credentials for private registry authentication.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * RepositoryCredentialsProperty repositoryCredentialsProperty =
     * RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html)
     */
    public inline fun cfnTaskDefinitionRepositoryCredentialsProperty(
        block: CfnTaskDefinitionRepositoryCredentialsPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.RepositoryCredentialsProperty {
        val builder = CfnTaskDefinitionRepositoryCredentialsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type and amount of a resource to assign to a container.
     *
     * The supported resource types are GPUs and Elastic Inference accelerators. For more
     * information, see
     * [Working with GPUs on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html)
     * or
     * [Working with Amazon Elastic Inference on Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html)
     * in the *Amazon Elastic Container Service Developer Guide*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ResourceRequirementProperty resourceRequirementProperty = ResourceRequirementProperty.builder()
     * .type("type")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html)
     */
    public inline fun cfnTaskDefinitionResourceRequirementProperty(
        block: CfnTaskDefinitionResourceRequirementPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.ResourceRequirementProperty {
        val builder = CfnTaskDefinitionResourceRequirementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the platform for the Amazon ECS service or task.
     *
     * For more information about `RuntimePlatform` , see
     * [RuntimePlatform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
     * .cpuArchitecture("cpuArchitecture")
     * .operatingSystemFamily("operatingSystemFamily")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html)
     */
    public inline fun cfnTaskDefinitionRuntimePlatformProperty(
        block: CfnTaskDefinitionRuntimePlatformPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.RuntimePlatformProperty {
        val builder = CfnTaskDefinitionRuntimePlatformPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the secret to expose to your container.
     *
     * Secrets can be exposed to a container in the following ways:
     * * To inject sensitive data into your containers as environment variables, use the `secrets`
     *   container definition parameter.
     * * To reference sensitive information in the log configuration of a container, use the
     *   `secretOptions` container definition parameter.
     *
     * For more information, see
     * [Specifying sensitive data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SecretProperty secretProperty = SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html)
     */
    public inline fun cfnTaskDefinitionSecretProperty(
        block: CfnTaskDefinitionSecretPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.SecretProperty {
        val builder = CfnTaskDefinitionSecretPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * This parameter maps to `Sysctls` in the
     * [Create a container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the
     * [Docker Remote API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/)
     * and the `--sysctl` option to
     * [docker run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * We don't recommend that you specify network-related `systemControls` parameters for multiple
     * containers in a single task. This task also uses either the `awsvpc` or `host` network mode.
     * It does it for the following reasons.
     * * For tasks that use the `awsvpc` network mode, if you set `systemControls` for any
     *   container, it applies to all containers in the task. If you set different `systemControls`
     *   for multiple containers in a single task, the container that's started last determines
     *   which `systemControls` take effect.
     * * For tasks that use the `host` network mode, the `systemControls` parameter applies to the
     *   container instance's kernel parameter and that of all containers of any tasks running on
     *   that container instance.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SystemControlProperty systemControlProperty = SystemControlProperty.builder()
     * .namespace("namespace")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html)
     */
    public inline fun cfnTaskDefinitionSystemControlProperty(
        block: CfnTaskDefinitionSystemControlPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.SystemControlProperty {
        val builder = CfnTaskDefinitionSystemControlPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The constraint on task placement in the task definition.
     *
     * For more information, see
     * [Task placement constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Task placement constraints aren't supported for tasks run on AWS Fargate .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * TaskDefinitionPlacementConstraintProperty taskDefinitionPlacementConstraintProperty =
     * TaskDefinitionPlacementConstraintProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .expression("expression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html)
     */
    public inline fun cfnTaskDefinitionTaskDefinitionPlacementConstraintProperty(
        block: CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty {
        val builder = CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The container path, mount options, and size of the tmpfs mount.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * TmpfsProperty tmpfsProperty = TmpfsProperty.builder()
     * .size(123)
     * // the properties below are optional
     * .containerPath("containerPath")
     * .mountOptions(List.of("mountOptions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html)
     */
    public inline fun cfnTaskDefinitionTmpfsProperty(
        block: CfnTaskDefinitionTmpfsPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.TmpfsProperty {
        val builder = CfnTaskDefinitionTmpfsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `ulimit` settings to pass to the container.
     *
     * Amazon ECS tasks hosted on AWS Fargate use the default resource limit values set by the
     * operating system with the exception of the `nofile` resource limit parameter which AWS
     * Fargate overrides. The `nofile` resource limit sets a restriction on the number of open files
     * that a container can use. The default `nofile` soft limit is `1024` and the default hard
     * limit is `4096` .
     *
     * You can specify the `ulimit` settings for a container in a task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * UlimitProperty ulimitProperty = UlimitProperty.builder()
     * .hardLimit(123)
     * .name("name")
     * .softLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html)
     */
    public inline fun cfnTaskDefinitionUlimitProperty(
        block: CfnTaskDefinitionUlimitPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.UlimitProperty {
        val builder = CfnTaskDefinitionUlimitPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details on a data volume from another container in the same task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * VolumeFromProperty volumeFromProperty = VolumeFromProperty.builder()
     * .readOnly(false)
     * .sourceContainer("sourceContainer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html)
     */
    public inline fun cfnTaskDefinitionVolumeFromProperty(
        block: CfnTaskDefinitionVolumeFromPropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.VolumeFromProperty {
        val builder = CfnTaskDefinitionVolumeFromPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Volume` property specifies a data volume used in a task definition.
     *
     * For tasks that use a Docker volume, specify a `DockerVolumeConfiguration` . For tasks that
     * use a bind mount host volume, specify a `host` and optional `sourcePath` . For more
     * information about `host` and optional `sourcePath` , see
     * [Volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#volumes)
     * and
     * [Using Data Volumes in Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * VolumeProperty volumeProperty = VolumeProperty.builder()
     * .dockerVolumeConfiguration(DockerVolumeConfigurationProperty.builder()
     * .autoprovision(false)
     * .driver("driver")
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .scope("scope")
     * .build())
     * .efsVolumeConfiguration(EFSVolumeConfigurationProperty.builder()
     * .filesystemId("filesystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfigProperty.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(HostVolumePropertiesProperty.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html)
     */
    public inline fun cfnTaskDefinitionVolumeProperty(
        block: CfnTaskDefinitionVolumePropertyDsl.() -> Unit = {}
    ): CfnTaskDefinition.VolumeProperty {
        val builder = CfnTaskDefinitionVolumePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a task set in the specified cluster and service.
     *
     * This is used when a service uses the `EXTERNAL` deployment controller type. For more
     * information, see
     * [Amazon ECS deployment types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnTaskSet cfnTaskSet = CfnTaskSet.Builder.create(this, "MyCfnTaskSet")
     * .cluster("cluster")
     * .service("service")
     * .taskDefinition("taskDefinition")
     * // the properties below are optional
     * .externalId("externalId")
     * .launchType("launchType")
     * .loadBalancers(List.of(LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .platformVersion("platformVersion")
     * .scale(ScaleProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html)
     */
    public inline fun cfnTaskSet(
        scope: Construct,
        id: String,
        block: CfnTaskSetDsl.() -> Unit = {},
    ): CfnTaskSet {
        val builder = CfnTaskSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the networking details for a task or service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html)
     */
    public inline fun cfnTaskSetAwsVpcConfigurationProperty(
        block: CfnTaskSetAwsVpcConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskSet.AwsVpcConfigurationProperty {
        val builder = CfnTaskSetAwsVpcConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The load balancer configuration to use with a service or task set.
     *
     * When you add, update, or remove a load balancer configuration, Amazon ECS starts a new
     * deployment with the updated Elastic Load Balancing configuration. This causes tasks to
     * register to and deregister from load balancers.
     *
     * We recommend that you verify this on a test environment before you update the Elastic Load
     * Balancing configuration.
     *
     * A service-linked role is required for services that use multiple target groups. For more
     * information, see
     * [Using service-linked roles](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LoadBalancerProperty loadBalancerProperty = LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .targetGroupArn("targetGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html)
     */
    public inline fun cfnTaskSetLoadBalancerProperty(
        block: CfnTaskSetLoadBalancerPropertyDsl.() -> Unit = {}
    ): CfnTaskSet.LoadBalancerProperty {
        val builder = CfnTaskSetLoadBalancerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The network configuration for a task or service.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html)
     */
    public inline fun cfnTaskSetNetworkConfigurationProperty(
        block: CfnTaskSetNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTaskSet.NetworkConfigurationProperty {
        val builder = CfnTaskSetNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTaskSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * CfnTaskSetProps cfnTaskSetProps = CfnTaskSetProps.builder()
     * .cluster("cluster")
     * .service("service")
     * .taskDefinition("taskDefinition")
     * // the properties below are optional
     * .externalId("externalId")
     * .launchType("launchType")
     * .loadBalancers(List.of(LoadBalancerProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .targetGroupArn("targetGroupArn")
     * .build()))
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .assignPublicIp("assignPublicIp")
     * .securityGroups(List.of("securityGroups"))
     * .build())
     * .build())
     * .platformVersion("platformVersion")
     * .scale(ScaleProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build())
     * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html)
     */
    public inline fun cfnTaskSetProps(block: CfnTaskSetPropsDsl.() -> Unit = {}): CfnTaskSetProps {
        val builder = CfnTaskSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the
     * task set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ScaleProperty scaleProperty = ScaleProperty.builder()
     * .unit("unit")
     * .value(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html)
     */
    public inline fun cfnTaskSetScaleProperty(
        block: CfnTaskSetScalePropertyDsl.() -> Unit = {}
    ): CfnTaskSet.ScaleProperty {
        val builder = CfnTaskSetScalePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details for the service registry.
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service are not supported.
     *
     * When you add, update, or remove the service registries configuration, Amazon ECS starts a new
     * deployment. New tasks are registered and deregistered to the updated service registry
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceRegistryProperty serviceRegistryProperty = ServiceRegistryProperty.builder()
     * .containerName("containerName")
     * .containerPort(123)
     * .port(123)
     * .registryArn("registryArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html)
     */
    public inline fun cfnTaskSetServiceRegistryProperty(
        block: CfnTaskSetServiceRegistryPropertyDsl.() -> Unit = {}
    ): CfnTaskSet.ServiceRegistryProperty {
        val builder = CfnTaskSetServiceRegistryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for creating an AWS Cloud Map namespace.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * ContainerDefinitionOptions containerOptions;
     * ContainerDefinition container = taskDefinition.addContainer("MyContainer", containerOptions);
     * container.addPortMappings(PortMapping.builder()
     * .name("api")
     * .containerPort(8080)
     * .build());
     * cluster.addDefaultCloudMapNamespace(CloudMapNamespaceOptions.builder()
     * .name("local")
     * .build());
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .serviceConnectConfiguration(ServiceConnectProps.builder()
     * .services(List.of(ServiceConnectService.builder()
     * .portMappingName("api")
     * .dnsName("http-api")
     * .port(80)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun cloudMapNamespaceOptions(
        block: CloudMapNamespaceOptionsDsl.() -> Unit = {}
    ): CloudMapNamespaceOptions {
        val builder = CloudMapNamespaceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options to enabling AWS Cloud Map for an Amazon ECS service.
     *
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * Cluster cluster;
     * Ec2Service service = Ec2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .cloudMapOptions(CloudMapOptions.builder()
     * // Create A records - useful for AWSVPC network mode.
     * .dnsRecordType(DnsRecordType.A)
     * .build())
     * .build();
     * ```
     */
    public inline fun cloudMapOptions(block: CloudMapOptionsDsl.() -> Unit = {}): CloudMapOptions {
        val builder = CloudMapOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A regional grouping of one or more container instances on which you can run tasks and
     * services.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Cluster cluster = Cluster.Builder.create(this, "Cluster")
     * .vpc(vpc)
     * .build();
     * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
     * .vpc(vpc)
     * .instanceType(new InstanceType("t2.micro"))
     * .machineImage(EcsOptimizedImage.amazonLinux2())
     * .minCapacity(0)
     * .maxCapacity(100)
     * .build();
     * AsgCapacityProvider capacityProvider = AsgCapacityProvider.Builder.create(this,
     * "AsgCapacityProvider")
     * .autoScalingGroup(autoScalingGroup)
     * .build();
     * cluster.addAsgCapacityProvider(capacityProvider);
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("web", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryReservationMiB(256)
     * .build());
     * Ec2Service.Builder.create(this, "EC2Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider(capacityProvider.getCapacityProviderName())
     * .weight(1)
     * .build()))
     * .build();
     * ```
     */
    public inline fun cluster(
        scope: Construct,
        id: String,
        block: ClusterDsl.() -> Unit = {},
    ): Cluster {
        val builder = ClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties to import from the ECS cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.autoscaling.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.servicediscovery.*;
     * AutoScalingGroup autoScalingGroup;
     * Bucket bucket;
     * Key key;
     * LogGroup logGroup;
     * INamespace namespace;
     * SecurityGroup securityGroup;
     * Vpc vpc;
     * ClusterAttributes clusterAttributes = ClusterAttributes.builder()
     * .clusterName("clusterName")
     * .vpc(vpc)
     * // the properties below are optional
     * .autoscalingGroup(autoScalingGroup)
     * .clusterArn("clusterArn")
     * .defaultCloudMapNamespace(namespace)
     * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
     * .kmsKey(key)
     * .logConfiguration(ExecuteCommandLogConfiguration.builder()
     * .cloudWatchEncryptionEnabled(false)
     * .cloudWatchLogGroup(logGroup)
     * .s3Bucket(bucket)
     * .s3EncryptionEnabled(false)
     * .s3KeyPrefix("s3KeyPrefix")
     * .build())
     * .logging(ExecuteCommandLogging.NONE)
     * .build())
     * .hasEc2Capacity(false)
     * .securityGroups(List.of(securityGroup))
     * .build();
     * ```
     */
    public inline fun clusterAttributes(
        block: ClusterAttributesDsl.() -> Unit = {}
    ): ClusterAttributes {
        val builder = ClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties used to define an ECS cluster.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "FargateCluster").vpc(vpc).build();
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .memoryMiB("512")
     * .cpu("256")
     * .compatibility(Compatibility.FARGATE)
     * .build();
     * ContainerDefinition containerDefinition = taskDefinition.addContainer("TheContainer",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "RunFargate")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .assignPublicIp(true)
     * .containerOverrides(List.of(ContainerOverride.builder()
     * .containerDefinition(containerDefinition)
     * .environment(List.of(TaskEnvironmentVariable.builder().name("SOME_KEY").value(JsonPath.stringAt("$.SomeKey")).build()))
     * .build()))
     * .launchTarget(new EcsFargateLaunchTarget())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     */
    public inline fun clusterProps(block: ClusterPropsDsl.() -> Unit = {}): ClusterProps {
        val builder = ClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The common task definition attributes used across all types of task definitions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * CommonTaskDefinitionAttributes commonTaskDefinitionAttributes =
     * CommonTaskDefinitionAttributes.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .executionRole(role)
     * .networkMode(NetworkMode.NONE)
     * .taskRole(role)
     * .build();
     * ```
     */
    public inline fun commonTaskDefinitionAttributes(
        block: CommonTaskDefinitionAttributesDsl.() -> Unit = {}
    ): CommonTaskDefinitionAttributes {
        val builder = CommonTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The common properties for all task definitions.
     *
     * For more information, see
     * [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * ProxyConfiguration proxyConfiguration;
     * Role role;
     * CommonTaskDefinitionProps commonTaskDefinitionProps = CommonTaskDefinitionProps.builder()
     * .executionRole(role)
     * .family("family")
     * .proxyConfiguration(proxyConfiguration)
     * .taskRole(role)
     * .volumes(List.of(Volume.builder()
     * .name("name")
     * // the properties below are optional
     * .dockerVolumeConfiguration(DockerVolumeConfiguration.builder()
     * .driver("driver")
     * .scope(Scope.TASK)
     * // the properties below are optional
     * .autoprovision(false)
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .build())
     * .efsVolumeConfiguration(EfsVolumeConfiguration.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfig.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(Host.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .build()))
     * .build();
     * ```
     */
    public inline fun commonTaskDefinitionProps(
        block: CommonTaskDefinitionPropsDsl.() -> Unit = {}
    ): CommonTaskDefinitionProps {
        val builder = CommonTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container definition is used in a task definition to describe the containers that are
     * launched as part of a task.
     *
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * Cluster cluster;
     * // Add a container to the task definition
     * ContainerDefinition specificContainer = taskDefinition.addContainer("Container",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("/aws/aws-example-app"))
     * .memoryLimitMiB(2048)
     * .build());
     * // Add a port mapping
     * specificContainer.addPortMappings(PortMapping.builder()
     * .containerPort(7600)
     * .protocol(Protocol.TCP)
     * .build());
     * Ec2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .cloudMapOptions(CloudMapOptions.builder()
     * // Create SRV records - useful for bridge networking
     * .dnsRecordType(DnsRecordType.SRV)
     * // Targets port TCP port 7600 `specificContainer`
     * .container(specificContainer)
     * .containerPort(7600)
     * .build())
     * .build();
     * ```
     */
    public inline fun containerDefinition(
        scope: Construct,
        id: String,
        block: ContainerDefinitionDsl.() -> Unit = {},
    ): ContainerDefinition {
        val builder = ContainerDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * Cluster cluster;
     * // Add a container to the task definition
     * ContainerDefinition specificContainer = taskDefinition.addContainer("Container",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("/aws/aws-example-app"))
     * .memoryLimitMiB(2048)
     * .build());
     * // Add a port mapping
     * specificContainer.addPortMappings(PortMapping.builder()
     * .containerPort(7600)
     * .protocol(Protocol.TCP)
     * .build());
     * Ec2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .cloudMapOptions(CloudMapOptions.builder()
     * // Create SRV records - useful for bridge networking
     * .dnsRecordType(DnsRecordType.SRV)
     * // Targets port TCP port 7600 `specificContainer`
     * .container(specificContainer)
     * .containerPort(7600)
     * .build())
     * .build();
     * ```
     */
    public inline fun containerDefinitionOptions(
        block: ContainerDefinitionOptionsDsl.() -> Unit = {}
    ): ContainerDefinitionOptions {
        val builder = ContainerDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties in a container definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * ContainerImage containerImage;
     * EnvironmentFile environmentFile;
     * LinuxParameters linuxParameters;
     * LogDriver logDriver;
     * Secret secret;
     * TaskDefinition taskDefinition;
     * ContainerDefinitionProps containerDefinitionProps = ContainerDefinitionProps.builder()
     * .image(containerImage)
     * .taskDefinition(taskDefinition)
     * // the properties below are optional
     * .command(List.of("command"))
     * .containerName("containerName")
     * .cpu(123)
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentFiles(List.of(environmentFile))
     * .essential(false)
     * .extraHosts(Map.of(
     * "extraHostsKey", "extraHosts"))
     * .gpuCount(123)
     * .healthCheck(HealthCheck.builder()
     * .command(List.of("command"))
     * // the properties below are optional
     * .interval(Duration.minutes(30))
     * .retries(123)
     * .startPeriod(Duration.minutes(30))
     * .timeout(Duration.minutes(30))
     * .build())
     * .hostname("hostname")
     * .inferenceAcceleratorResources(List.of("inferenceAcceleratorResources"))
     * .linuxParameters(linuxParameters)
     * .logging(logDriver)
     * .memoryLimitMiB(123)
     * .memoryReservationMiB(123)
     * .portMappings(List.of(PortMapping.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .startTimeout(Duration.minutes(30))
     * .stopTimeout(Duration.minutes(30))
     * .systemControls(List.of(SystemControl.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun containerDefinitionProps(
        block: ContainerDefinitionPropsDsl.() -> Unit = {}
    ): ContainerDefinitionProps {
        val builder = ContainerDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a dependency on another container in the task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ContainerDefinition containerDefinition;
     * ContainerDependency containerDependency = ContainerDependency.builder()
     * .container(containerDefinition)
     * // the properties below are optional
     * .condition(ContainerDependencyCondition.START)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDependency.html)
     */
    public inline fun containerDependency(
        block: ContainerDependencyDsl.() -> Unit = {}
    ): ContainerDependency {
        val builder = ContainerDependencyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for creating a container image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ContainerImageConfig containerImageConfig = ContainerImageConfig.builder()
     * .imageName("imageName")
     * // the properties below are optional
     * .repositoryCredentials(RepositoryCredentialsProperty.builder()
     * .credentialsParameter("credentialsParameter")
     * .build())
     * .build();
     * ```
     */
    public inline fun containerImageConfig(
        block: ContainerImageConfigDsl.() -> Unit = {}
    ): ContainerImageConfig {
        val builder = ContainerImageConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for enabling scaling based on CPU utilization.
     *
     * Example:
     * ```
     * ApplicationTargetGroup target;
     * BaseService service;
     * ScalableTaskCount scaling =
     * service.autoScaleTaskCount(EnableScalingProps.builder().maxCapacity(10).build());
     * scaling.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * scaling.scaleOnRequestCount("RequestScaling", RequestCountScalingProps.builder()
     * .requestsPerTarget(10000)
     * .targetGroup(target)
     * .build());
     * ```
     */
    public inline fun cpuUtilizationScalingProps(
        block: CpuUtilizationScalingPropsDsl.() -> Unit = {}
    ): CpuUtilizationScalingProps {
        val builder = CpuUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for deployment alarms.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Alarm elbAlarm;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of(elbAlarm.getAlarmName()))
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .build();
     * // Defining a deployment alarm after the service has been created
     * String cpuAlarmName = "MyCpuMetricAlarm";
     * Alarm.Builder.create(this, "CPUAlarm")
     * .alarmName(cpuAlarmName)
     * .metric(service.metricCpuUtilization())
     * .evaluationPeriods(2)
     * .threshold(80)
     * .build();
     * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
     * .behavior(AlarmBehavior.FAIL_ON_ALARM)
     * .build());
     * ```
     */
    public inline fun deploymentAlarmConfig(
        block: DeploymentAlarmConfigDsl.() -> Unit = {}
    ): DeploymentAlarmConfig {
        val builder = DeploymentAlarmConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for deployment alarms.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Alarm elbAlarm;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of(elbAlarm.getAlarmName()))
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .build();
     * // Defining a deployment alarm after the service has been created
     * String cpuAlarmName = "MyCpuMetricAlarm";
     * Alarm.Builder.create(this, "CPUAlarm")
     * .alarmName(cpuAlarmName)
     * .metric(service.metricCpuUtilization())
     * .evaluationPeriods(2)
     * .threshold(80)
     * .build();
     * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
     * .behavior(AlarmBehavior.FAIL_ON_ALARM)
     * .build());
     * ```
     */
    public inline fun deploymentAlarmOptions(
        block: DeploymentAlarmOptionsDsl.() -> Unit = {}
    ): DeploymentAlarmOptions {
        val builder = DeploymentAlarmOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deployment circuit breaker to use for the service.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .circuitBreaker(DeploymentCircuitBreaker.builder().rollback(true).build())
     * .build();
     * ```
     */
    public inline fun deploymentCircuitBreaker(
        block: DeploymentCircuitBreakerDsl.() -> Unit = {}
    ): DeploymentCircuitBreaker {
        val builder = DeploymentCircuitBreakerDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The deployment controller to use for the service.
     *
     * Example:
     * ```
     * EcsApplication myApplication;
     * Cluster cluster;
     * FargateTaskDefinition taskDefinition;
     * ITargetGroup blueTargetGroup;
     * ITargetGroup greenTargetGroup;
     * IApplicationListener listener;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .deploymentController(DeploymentController.builder()
     * .type(DeploymentControllerType.CODE_DEPLOY)
     * .build())
     * .build();
     * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
     * .service(service)
     * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
     * .blueTargetGroup(blueTargetGroup)
     * .greenTargetGroup(greenTargetGroup)
     * .listener(listener)
     * .build())
     * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
     * .build();
     * ```
     */
    public inline fun deploymentController(
        block: DeploymentControllerDsl.() -> Unit = {}
    ): DeploymentController {
        val builder = DeploymentControllerDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A container instance host device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Device device = Device.builder()
     * .hostPath("hostPath")
     * // the properties below are optional
     * .containerPath("containerPath")
     * .permissions(List.of(DevicePermission.READ))
     * .build();
     * ```
     */
    public inline fun device(block: DeviceDsl.() -> Unit = {}): Device {
        val builder = DeviceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a Docker volume.
     *
     * Docker volumes are only supported when you are using the EC2 launch type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * DockerVolumeConfiguration dockerVolumeConfiguration = DockerVolumeConfiguration.builder()
     * .driver("driver")
     * .scope(Scope.TASK)
     * // the properties below are optional
     * .autoprovision(false)
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .build();
     * ```
     */
    public inline fun dockerVolumeConfiguration(
        block: DockerVolumeConfigurationDsl.() -> Unit = {}
    ): DockerVolumeConfiguration {
        val builder = DockerVolumeConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This creates a service using the EC2 launch type on an ECS cluster.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * Ec2Service service = Ec2Service.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
     * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
     * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
     * .containerName("MyContainer")
     * .containerPort(80)
     * .build()));
     * ```
     */
    public inline fun ec2Service(
        scope: Construct,
        id: String,
        block: Ec2ServiceDsl.() -> Unit = {},
    ): Ec2Service {
        val builder = Ec2ServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties to import from the service using the EC2 launch type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Cluster cluster;
     * Ec2ServiceAttributes ec2ServiceAttributes = Ec2ServiceAttributes.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .serviceArn("serviceArn")
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun ec2ServiceAttributes(
        block: Ec2ServiceAttributesDsl.() -> Unit = {}
    ): Ec2ServiceAttributes {
        val builder = Ec2ServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for defining a service using the EC2 launch type.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * Ec2Service service = Ec2Service.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
     * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
     * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
     * .containerName("MyContainer")
     * .containerPort(80)
     * .build()));
     * ```
     */
    public inline fun ec2ServiceProps(block: Ec2ServicePropsDsl.() -> Unit = {}): Ec2ServiceProps {
        val builder = Ec2ServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a task definition run on an EC2 cluster.
     *
     * Example:
     * ```
     * Secret secret;
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(LogDrivers.splunk(SplunkLogDriverProps.builder()
     * .secretToken(secret)
     * .url("my-splunk-url")
     * .build()))
     * .build());
     * ```
     */
    public inline fun ec2TaskDefinition(
        scope: Construct,
        id: String,
        block: Ec2TaskDefinitionDsl.() -> Unit = {},
    ): Ec2TaskDefinition {
        val builder = Ec2TaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes used to import an existing EC2 task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * Ec2TaskDefinitionAttributes ec2TaskDefinitionAttributes = Ec2TaskDefinitionAttributes.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .executionRole(role)
     * .networkMode(NetworkMode.NONE)
     * .taskRole(role)
     * .build();
     * ```
     */
    public inline fun ec2TaskDefinitionAttributes(
        block: Ec2TaskDefinitionAttributesDsl.() -> Unit = {}
    ): Ec2TaskDefinitionAttributes {
        val builder = Ec2TaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for a task definition run on an EC2 cluster.
     *
     * Example:
     * ```
     * Ec2TaskDefinition ec2TaskDefinition = Ec2TaskDefinition.Builder.create(this, "TaskDef")
     * .networkMode(NetworkMode.BRIDGE)
     * .build();
     * ContainerDefinition container = ec2TaskDefinition.addContainer("WebContainer",
     * ContainerDefinitionOptions.builder()
     * // Use an image from DockerHub
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(1024)
     * .build());
     * ```
     */
    public inline fun ec2TaskDefinitionProps(
        block: Ec2TaskDefinitionPropsDsl.() -> Unit = {}
    ): Ec2TaskDefinitionProps {
        val builder = Ec2TaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional configuration properties for EcsOptimizedImage factory functions.
     *
     * Example:
     * ```
     * Vpc vpc;
     * AutoScalingGroup autoScalingGroup = AutoScalingGroup.Builder.create(this, "ASG")
     * .machineImage(EcsOptimizedImage.amazonLinux(EcsOptimizedImageOptions.builder().cachedInContext(true).build()))
     * .vpc(vpc)
     * .instanceType(new InstanceType("t2.micro"))
     * .build();
     * ```
     */
    public inline fun ecsOptimizedImageOptions(
        block: EcsOptimizedImageOptionsDsl.() -> Unit = {}
    ): EcsOptimizedImageOptions {
        val builder = EcsOptimizedImageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * FargateService service = FargateService.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
     * "LB").vpc(vpc).internetFacing(true).build();
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * service.registerLoadBalancerTargets(EcsTarget.builder()
     * .containerName("web")
     * .containerPort(80)
     * .newTargetGroupId("ECS")
     * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
     * .protocol(ApplicationProtocol.HTTPS)
     * .build()))
     * .build());
     * ```
     */
    public inline fun ecsTarget(block: EcsTargetDsl.() -> Unit = {}): EcsTarget {
        val builder = EcsTargetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for an Elastic FileSystem volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * EfsVolumeConfiguration efsVolumeConfiguration = EfsVolumeConfiguration.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfig.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build();
     * ```
     */
    public inline fun efsVolumeConfiguration(
        block: EfsVolumeConfigurationDsl.() -> Unit = {}
    ): EfsVolumeConfiguration {
        val builder = EfsVolumeConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for the environment file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * EnvironmentFileConfig environmentFileConfig = EnvironmentFileConfig.builder()
     * .fileType(EnvironmentFileType.S3)
     * .s3Location(Location.builder()
     * .bucketName("bucketName")
     * .objectKey("objectKey")
     * // the properties below are optional
     * .objectVersion("objectVersion")
     * .build())
     * .build();
     * ```
     */
    public inline fun environmentFileConfig(
        block: EnvironmentFileConfigDsl.() -> Unit = {}
    ): EnvironmentFileConfig {
        val builder = EnvironmentFileConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of the execute command configuration.
     *
     * For more information, see [ExecuteCommandConfiguration]
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html
     *
     * Example:
     * ```
     * Vpc vpc;
     * Key kmsKey = new Key(this, "KmsKey");
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
     * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
     * .encryptionKey(kmsKey)
     * .build();
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
     * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
     * .encryptionKey(kmsKey)
     * .build();
     * Cluster cluster = Cluster.Builder.create(this, "Cluster")
     * .vpc(vpc)
     * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
     * .kmsKey(kmsKey)
     * .logConfiguration(ExecuteCommandLogConfiguration.builder()
     * .cloudWatchLogGroup(logGroup)
     * .cloudWatchEncryptionEnabled(true)
     * .s3Bucket(execBucket)
     * .s3EncryptionEnabled(true)
     * .s3KeyPrefix("exec-command-output")
     * .build())
     * .logging(ExecuteCommandLogging.OVERRIDE)
     * .build())
     * .build();
     * ```
     */
    public inline fun executeCommandConfiguration(
        block: ExecuteCommandConfigurationDsl.() -> Unit = {}
    ): ExecuteCommandConfiguration {
        val builder = ExecuteCommandConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The log configuration for the results of the execute command actions.
     *
     * The logs can be sent to CloudWatch Logs and/ or an Amazon S3 bucket. For more information,
     * see [ExecuteCommandLogConfiguration]
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html
     *
     * Example:
     * ```
     * Vpc vpc;
     * Key kmsKey = new Key(this, "KmsKey");
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the log group
     * LogGroup logGroup = LogGroup.Builder.create(this, "LogGroup")
     * .encryptionKey(kmsKey)
     * .build();
     * // Pass the KMS key in the `encryptionKey` field to associate the key to the S3 bucket
     * Bucket execBucket = Bucket.Builder.create(this, "EcsExecBucket")
     * .encryptionKey(kmsKey)
     * .build();
     * Cluster cluster = Cluster.Builder.create(this, "Cluster")
     * .vpc(vpc)
     * .executeCommandConfiguration(ExecuteCommandConfiguration.builder()
     * .kmsKey(kmsKey)
     * .logConfiguration(ExecuteCommandLogConfiguration.builder()
     * .cloudWatchLogGroup(logGroup)
     * .cloudWatchEncryptionEnabled(true)
     * .s3Bucket(execBucket)
     * .s3EncryptionEnabled(true)
     * .s3KeyPrefix("exec-command-output")
     * .build())
     * .logging(ExecuteCommandLogging.OVERRIDE)
     * .build())
     * .build();
     * ```
     */
    public inline fun executeCommandLogConfiguration(
        block: ExecuteCommandLogConfigurationDsl.() -> Unit = {}
    ): ExecuteCommandLogConfiguration {
        val builder = ExecuteCommandLogConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This creates a service using the External launch type on an ECS cluster.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * ExternalService service = ExternalService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .desiredCount(5)
     * .build();
     * ```
     */
    public inline fun externalService(
        scope: Construct,
        id: String,
        block: ExternalServiceDsl.() -> Unit = {},
    ): ExternalService {
        val builder = ExternalServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties to import from the service using the External launch type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Cluster cluster;
     * ExternalServiceAttributes externalServiceAttributes = ExternalServiceAttributes.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .serviceArn("serviceArn")
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun externalServiceAttributes(
        block: ExternalServiceAttributesDsl.() -> Unit = {}
    ): ExternalServiceAttributes {
        val builder = ExternalServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for defining a service using the External launch type.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * ExternalService service = ExternalService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .desiredCount(5)
     * .build();
     * ```
     */
    public inline fun externalServiceProps(
        block: ExternalServicePropsDsl.() -> Unit = {}
    ): ExternalServiceProps {
        val builder = ExternalServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a task definition run on an External cluster.
     *
     * Example:
     * ```
     * ExternalTaskDefinition externalTaskDefinition = new ExternalTaskDefinition(this, "TaskDef");
     * ContainerDefinition container = externalTaskDefinition.addContainer("WebContainer",
     * ContainerDefinitionOptions.builder()
     * // Use an image from DockerHub
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(1024)
     * .build());
     * ```
     */
    public inline fun externalTaskDefinition(
        scope: Construct,
        id: String,
        block: ExternalTaskDefinitionDsl.() -> Unit = {},
    ): ExternalTaskDefinition {
        val builder = ExternalTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes used to import an existing External task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * ExternalTaskDefinitionAttributes externalTaskDefinitionAttributes =
     * ExternalTaskDefinitionAttributes.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .executionRole(role)
     * .networkMode(NetworkMode.NONE)
     * .taskRole(role)
     * .build();
     * ```
     */
    public inline fun externalTaskDefinitionAttributes(
        block: ExternalTaskDefinitionAttributesDsl.() -> Unit = {}
    ): ExternalTaskDefinitionAttributes {
        val builder = ExternalTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for a task definition run on an External cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * ProxyConfiguration proxyConfiguration;
     * Role role;
     * ExternalTaskDefinitionProps externalTaskDefinitionProps = ExternalTaskDefinitionProps.builder()
     * .executionRole(role)
     * .family("family")
     * .networkMode(NetworkMode.NONE)
     * .proxyConfiguration(proxyConfiguration)
     * .taskRole(role)
     * .volumes(List.of(Volume.builder()
     * .name("name")
     * // the properties below are optional
     * .dockerVolumeConfiguration(DockerVolumeConfiguration.builder()
     * .driver("driver")
     * .scope(Scope.TASK)
     * // the properties below are optional
     * .autoprovision(false)
     * .driverOpts(Map.of(
     * "driverOptsKey", "driverOpts"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .build())
     * .efsVolumeConfiguration(EfsVolumeConfiguration.builder()
     * .fileSystemId("fileSystemId")
     * // the properties below are optional
     * .authorizationConfig(AuthorizationConfig.builder()
     * .accessPointId("accessPointId")
     * .iam("iam")
     * .build())
     * .rootDirectory("rootDirectory")
     * .transitEncryption("transitEncryption")
     * .transitEncryptionPort(123)
     * .build())
     * .host(Host.builder()
     * .sourcePath("sourcePath")
     * .build())
     * .build()))
     * .build();
     * ```
     */
    public inline fun externalTaskDefinitionProps(
        block: ExternalTaskDefinitionPropsDsl.() -> Unit = {}
    ): ExternalTaskDefinitionProps {
        val builder = ExternalTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This creates a service using the Fargate launch type on an ECS cluster.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Alarm elbAlarm;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of(elbAlarm.getAlarmName()))
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .build();
     * // Defining a deployment alarm after the service has been created
     * String cpuAlarmName = "MyCpuMetricAlarm";
     * Alarm.Builder.create(this, "CPUAlarm")
     * .alarmName(cpuAlarmName)
     * .metric(service.metricCpuUtilization())
     * .evaluationPeriods(2)
     * .threshold(80)
     * .build();
     * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
     * .behavior(AlarmBehavior.FAIL_ON_ALARM)
     * .build());
     * ```
     */
    public inline fun fargateService(
        scope: Construct,
        id: String,
        block: FargateServiceDsl.() -> Unit = {},
    ): FargateService {
        val builder = FargateServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties to import from the service using the Fargate launch type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Cluster cluster;
     * FargateServiceAttributes fargateServiceAttributes = FargateServiceAttributes.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .serviceArn("serviceArn")
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun fargateServiceAttributes(
        block: FargateServiceAttributesDsl.() -> Unit = {}
    ): FargateServiceAttributes {
        val builder = FargateServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for defining a service using the Fargate launch type.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Alarm elbAlarm;
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .deploymentAlarms(DeploymentAlarmConfig.builder()
     * .alarmNames(List.of(elbAlarm.getAlarmName()))
     * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
     * .build())
     * .build();
     * // Defining a deployment alarm after the service has been created
     * String cpuAlarmName = "MyCpuMetricAlarm";
     * Alarm.Builder.create(this, "CPUAlarm")
     * .alarmName(cpuAlarmName)
     * .metric(service.metricCpuUtilization())
     * .evaluationPeriods(2)
     * .threshold(80)
     * .build();
     * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
     * .behavior(AlarmBehavior.FAIL_ON_ALARM)
     * .build());
     * ```
     */
    public inline fun fargateServiceProps(
        block: FargateServicePropsDsl.() -> Unit = {}
    ): FargateServiceProps {
        val builder = FargateServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a task definition run on a Fargate cluster.
     *
     * Example:
     * ```
     * Vpc vpc;
     * Cluster cluster = Cluster.Builder.create(this, "FargateCPCluster")
     * .vpc(vpc)
     * .enableFargateCapacityProviders(true)
     * .build();
     * FargateTaskDefinition taskDefinition = new FargateTaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("web", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build());
     * FargateService.Builder.create(this, "FargateService")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE_SPOT")
     * .weight(2)
     * .build(), CapacityProviderStrategy.builder()
     * .capacityProvider("FARGATE")
     * .weight(1)
     * .build()))
     * .build();
     * ```
     */
    public inline fun fargateTaskDefinition(
        scope: Construct,
        id: String,
        block: FargateTaskDefinitionDsl.() -> Unit = {},
    ): FargateTaskDefinition {
        val builder = FargateTaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes used to import an existing Fargate task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * FargateTaskDefinitionAttributes fargateTaskDefinitionAttributes =
     * FargateTaskDefinitionAttributes.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .executionRole(role)
     * .networkMode(NetworkMode.NONE)
     * .taskRole(role)
     * .build();
     * ```
     */
    public inline fun fargateTaskDefinitionAttributes(
        block: FargateTaskDefinitionAttributesDsl.() -> Unit = {}
    ): FargateTaskDefinitionAttributes {
        val builder = FargateTaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for a task definition.
     *
     * Example:
     * ```
     * // Create a Task Definition for the Windows container to start
     * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
     * .runtimePlatform(RuntimePlatform.builder()
     * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
     * .cpuArchitecture(CpuArchitecture.X86_64)
     * .build())
     * .cpu(1024)
     * .memoryLimitMiB(2048)
     * .build();
     * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
     * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
     * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
     * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
     * .build());
     * ```
     */
    public inline fun fargateTaskDefinitionProps(
        block: FargateTaskDefinitionPropsDsl.() -> Unit = {}
    ): FargateTaskDefinitionProps {
        val builder = FargateTaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * FireLens enables you to use task definition parameters to route logs to an AWS service or AWS
     * Partner Network (APN) destination for log storage and analytics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Secret secret;
     * FireLensLogDriver fireLensLogDriver = FireLensLogDriver.Builder.create()
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(Map.of(
     * "secretOptionsKey", secret))
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun fireLensLogDriver(
        block: FireLensLogDriverDsl.() -> Unit = {}
    ): FireLensLogDriver {
        val builder = FireLensLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the firelens log driver configuration options.
     *
     * Example:
     * ```
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(LogDrivers.firelens(FireLensLogDriverProps.builder()
     * .options(Map.of(
     * "Name", "firehose",
     * "region", "us-west-2",
     * "delivery_stream", "my-stream"))
     * .build()))
     * .build());
     * ```
     */
    public inline fun fireLensLogDriverProps(
        block: FireLensLogDriverPropsDsl.() -> Unit = {}
    ): FireLensLogDriverProps {
        val builder = FireLensLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Firelens Configuration
     * https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * FirelensConfig firelensConfig = FirelensConfig.builder()
     * .type(FirelensLogRouterType.FLUENTBIT)
     * // the properties below are optional
     * .options(FirelensOptions.builder()
     * .configFileType(FirelensConfigFileType.S3)
     * .configFileValue("configFileValue")
     * .enableECSLogMetadata(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun firelensConfig(block: FirelensConfigDsl.() -> Unit = {}): FirelensConfig {
        val builder = FirelensConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Firelens log router.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * ContainerImage containerImage;
     * EnvironmentFile environmentFile;
     * LinuxParameters linuxParameters;
     * LogDriver logDriver;
     * Secret secret;
     * TaskDefinition taskDefinition;
     * FirelensLogRouter firelensLogRouter = FirelensLogRouter.Builder.create(this,
     * "MyFirelensLogRouter")
     * .firelensConfig(FirelensConfig.builder()
     * .type(FirelensLogRouterType.FLUENTBIT)
     * // the properties below are optional
     * .options(FirelensOptions.builder()
     * .configFileType(FirelensConfigFileType.S3)
     * .configFileValue("configFileValue")
     * .enableECSLogMetadata(false)
     * .build())
     * .build())
     * .image(containerImage)
     * .taskDefinition(taskDefinition)
     * // the properties below are optional
     * .command(List.of("command"))
     * .containerName("containerName")
     * .cpu(123)
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentFiles(List.of(environmentFile))
     * .essential(false)
     * .extraHosts(Map.of(
     * "extraHostsKey", "extraHosts"))
     * .gpuCount(123)
     * .healthCheck(HealthCheck.builder()
     * .command(List.of("command"))
     * // the properties below are optional
     * .interval(Duration.minutes(30))
     * .retries(123)
     * .startPeriod(Duration.minutes(30))
     * .timeout(Duration.minutes(30))
     * .build())
     * .hostname("hostname")
     * .inferenceAcceleratorResources(List.of("inferenceAcceleratorResources"))
     * .linuxParameters(linuxParameters)
     * .logging(logDriver)
     * .memoryLimitMiB(123)
     * .memoryReservationMiB(123)
     * .portMappings(List.of(PortMapping.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .startTimeout(Duration.minutes(30))
     * .stopTimeout(Duration.minutes(30))
     * .systemControls(List.of(SystemControl.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun firelensLogRouter(
        scope: Construct,
        id: String,
        block: FirelensLogRouterDsl.() -> Unit = {},
    ): FirelensLogRouter {
        val builder = FirelensLogRouterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for creating a firelens log router.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * ContainerImage containerImage;
     * EnvironmentFile environmentFile;
     * LinuxParameters linuxParameters;
     * LogDriver logDriver;
     * Secret secret;
     * FirelensLogRouterDefinitionOptions firelensLogRouterDefinitionOptions =
     * FirelensLogRouterDefinitionOptions.builder()
     * .firelensConfig(FirelensConfig.builder()
     * .type(FirelensLogRouterType.FLUENTBIT)
     * // the properties below are optional
     * .options(FirelensOptions.builder()
     * .configFileType(FirelensConfigFileType.S3)
     * .configFileValue("configFileValue")
     * .enableECSLogMetadata(false)
     * .build())
     * .build())
     * .image(containerImage)
     * // the properties below are optional
     * .command(List.of("command"))
     * .containerName("containerName")
     * .cpu(123)
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentFiles(List.of(environmentFile))
     * .essential(false)
     * .extraHosts(Map.of(
     * "extraHostsKey", "extraHosts"))
     * .gpuCount(123)
     * .healthCheck(HealthCheck.builder()
     * .command(List.of("command"))
     * // the properties below are optional
     * .interval(Duration.minutes(30))
     * .retries(123)
     * .startPeriod(Duration.minutes(30))
     * .timeout(Duration.minutes(30))
     * .build())
     * .hostname("hostname")
     * .inferenceAcceleratorResources(List.of("inferenceAcceleratorResources"))
     * .linuxParameters(linuxParameters)
     * .logging(logDriver)
     * .memoryLimitMiB(123)
     * .memoryReservationMiB(123)
     * .portMappings(List.of(PortMapping.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .startTimeout(Duration.minutes(30))
     * .stopTimeout(Duration.minutes(30))
     * .systemControls(List.of(SystemControl.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun firelensLogRouterDefinitionOptions(
        block: FirelensLogRouterDefinitionOptionsDsl.() -> Unit = {}
    ): FirelensLogRouterDefinitionOptions {
        val builder = FirelensLogRouterDefinitionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties in a firelens log router.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * ContainerImage containerImage;
     * EnvironmentFile environmentFile;
     * LinuxParameters linuxParameters;
     * LogDriver logDriver;
     * Secret secret;
     * TaskDefinition taskDefinition;
     * FirelensLogRouterProps firelensLogRouterProps = FirelensLogRouterProps.builder()
     * .firelensConfig(FirelensConfig.builder()
     * .type(FirelensLogRouterType.FLUENTBIT)
     * // the properties below are optional
     * .options(FirelensOptions.builder()
     * .configFileType(FirelensConfigFileType.S3)
     * .configFileValue("configFileValue")
     * .enableECSLogMetadata(false)
     * .build())
     * .build())
     * .image(containerImage)
     * .taskDefinition(taskDefinition)
     * // the properties below are optional
     * .command(List.of("command"))
     * .containerName("containerName")
     * .cpu(123)
     * .disableNetworking(false)
     * .dnsSearchDomains(List.of("dnsSearchDomains"))
     * .dnsServers(List.of("dnsServers"))
     * .dockerLabels(Map.of(
     * "dockerLabelsKey", "dockerLabels"))
     * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
     * .entryPoint(List.of("entryPoint"))
     * .environment(Map.of(
     * "environmentKey", "environment"))
     * .environmentFiles(List.of(environmentFile))
     * .essential(false)
     * .extraHosts(Map.of(
     * "extraHostsKey", "extraHosts"))
     * .gpuCount(123)
     * .healthCheck(HealthCheck.builder()
     * .command(List.of("command"))
     * // the properties below are optional
     * .interval(Duration.minutes(30))
     * .retries(123)
     * .startPeriod(Duration.minutes(30))
     * .timeout(Duration.minutes(30))
     * .build())
     * .hostname("hostname")
     * .inferenceAcceleratorResources(List.of("inferenceAcceleratorResources"))
     * .linuxParameters(linuxParameters)
     * .logging(logDriver)
     * .memoryLimitMiB(123)
     * .memoryReservationMiB(123)
     * .portMappings(List.of(PortMapping.builder()
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build()))
     * .privileged(false)
     * .pseudoTerminal(false)
     * .readonlyRootFilesystem(false)
     * .secrets(Map.of(
     * "secretsKey", secret))
     * .startTimeout(Duration.minutes(30))
     * .stopTimeout(Duration.minutes(30))
     * .systemControls(List.of(SystemControl.builder()
     * .namespace("namespace")
     * .value("value")
     * .build()))
     * .ulimits(List.of(Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build()))
     * .user("user")
     * .workingDirectory("workingDirectory")
     * .build();
     * ```
     */
    public inline fun firelensLogRouterProps(
        block: FirelensLogRouterPropsDsl.() -> Unit = {}
    ): FirelensLogRouterProps {
        val builder = FirelensLogRouterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options for firelens log router
     * https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html#firelens-taskdef-customconfig.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * FirelensOptions firelensOptions = FirelensOptions.builder()
     * .configFileType(FirelensConfigFileType.S3)
     * .configFileValue("configFileValue")
     * .enableECSLogMetadata(false)
     * .build();
     * ```
     */
    public inline fun firelensOptions(block: FirelensOptionsDsl.() -> Unit = {}): FirelensOptions {
        val builder = FirelensOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to journald Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * FluentdLogDriver fluentdLogDriver = FluentdLogDriver.Builder.create()
     * .address("address")
     * .asyncConnect(false)
     * .bufferLimit(123)
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .maxRetries(123)
     * .retryWait(Duration.minutes(30))
     * .subSecondPrecision(false)
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun fluentdLogDriver(
        block: FluentdLogDriverDsl.() -> Unit = {}
    ): FluentdLogDriver {
        val builder = FluentdLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the fluentd log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/fluentd/)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * FluentdLogDriverProps fluentdLogDriverProps = FluentdLogDriverProps.builder()
     * .address("address")
     * .asyncConnect(false)
     * .bufferLimit(123)
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .maxRetries(123)
     * .retryWait(Duration.minutes(30))
     * .subSecondPrecision(false)
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun fluentdLogDriverProps(
        block: FluentdLogDriverPropsDsl.() -> Unit = {}
    ): FluentdLogDriverProps {
        val builder = FluentdLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to journald Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ecs.*;
     * GelfLogDriver gelfLogDriver = GelfLogDriver.Builder.create()
     * .address("address")
     * // the properties below are optional
     * .compressionLevel(123)
     * .compressionType(GelfCompressionType.GZIP)
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .tcpMaxReconnect(123)
     * .tcpReconnectDelay(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun gelfLogDriver(block: GelfLogDriverDsl.() -> Unit = {}): GelfLogDriver {
        val builder = GelfLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the journald log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/gelf/)
     *
     * Example:
     * ```
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(LogDrivers.gelf(GelfLogDriverProps.builder().address("my-gelf-address").build()))
     * .build());
     * ```
     */
    public inline fun gelfLogDriverProps(
        block: GelfLogDriverPropsDsl.() -> Unit = {}
    ): GelfLogDriverProps {
        val builder = GelfLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends logs to the specified driver.
     *
     * Example:
     * ```
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(GenericLogDriver.Builder.create()
     * .logDriver("fluentd")
     * .options(Map.of(
     * "tag", "example-tag"))
     * .build())
     * .build());
     * ```
     */
    public inline fun genericLogDriver(
        block: GenericLogDriverDsl.() -> Unit = {}
    ): GenericLogDriver {
        val builder = GenericLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration to use when creating a log driver.
     *
     * Example:
     * ```
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(GenericLogDriver.Builder.create()
     * .logDriver("fluentd")
     * .options(Map.of(
     * "tag", "example-tag"))
     * .build())
     * .build());
     * ```
     */
    public inline fun genericLogDriverProps(
        block: GenericLogDriverPropsDsl.() -> Unit = {}
    ): GenericLogDriverProps {
        val builder = GenericLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Example:
     * ```
     * Vpc vpc;
     * SecurityGroup securityGroup;
     * QueueProcessingFargateService queueProcessingFargateService =
     * QueueProcessingFargateService.Builder.create(this, "Service")
     * .vpc(vpc)
     * .memoryLimitMiB(512)
     * .image(ContainerImage.fromRegistry("test"))
     * .healthCheck(HealthCheck.builder()
     * .command(List.of("CMD-SHELL", "curl -f http://localhost/ || exit 1"))
     * // the properties below are optional
     * .interval(Duration.minutes(30))
     * .retries(123)
     * .startPeriod(Duration.minutes(30))
     * .timeout(Duration.minutes(30))
     * .build())
     * .build();
     * ```
     */
    public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
        val builder = HealthCheckDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details on a container instance bind mount host volume.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Host host = Host.builder()
     * .sourcePath("sourcePath")
     * .build();
     * ```
     */
    public inline fun host(block: HostDsl.() -> Unit = {}): Host {
        val builder = HostDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Elastic Inference Accelerator.
     *
     * For more information, see
     * [Elastic Inference Basics](https://docs.aws.amazon.com/elastic-inference/latest/developerguide/basics.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * InferenceAccelerator inferenceAccelerator = InferenceAccelerator.builder()
     * .deviceName("deviceName")
     * .deviceType("deviceType")
     * .build();
     * ```
     */
    public inline fun inferenceAccelerator(
        block: InferenceAcceleratorDsl.() -> Unit = {}
    ): InferenceAccelerator {
        val builder = InferenceAcceleratorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to journald Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * JournaldLogDriver journaldLogDriver = JournaldLogDriver.Builder.create()
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun journaldLogDriver(
        block: JournaldLogDriverDsl.() -> Unit = {}
    ): JournaldLogDriver {
        val builder = JournaldLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the journald log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/journald/)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * JournaldLogDriverProps journaldLogDriverProps = JournaldLogDriverProps.builder()
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun journaldLogDriverProps(
        block: JournaldLogDriverPropsDsl.() -> Unit = {}
    ): JournaldLogDriverProps {
        val builder = JournaldLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to json-file Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * JsonFileLogDriver jsonFileLogDriver = JsonFileLogDriver.Builder.create()
     * .compress(false)
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .maxFile(123)
     * .maxSize("maxSize")
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun jsonFileLogDriver(
        block: JsonFileLogDriverDsl.() -> Unit = {}
    ): JsonFileLogDriver {
        val builder = JsonFileLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the json-file log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/json-file/)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * JsonFileLogDriverProps jsonFileLogDriverProps = JsonFileLogDriverProps.builder()
     * .compress(false)
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .labels(List.of("labels"))
     * .maxFile(123)
     * .maxSize("maxSize")
     * .tag("tag")
     * .build();
     * ```
     */
    public inline fun jsonFileLogDriverProps(
        block: JsonFileLogDriverPropsDsl.() -> Unit = {}
    ): JsonFileLogDriverProps {
        val builder = JsonFileLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Linux-specific options that are applied to the container.
     *
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * taskDefinition.addContainer("container", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(1024)
     * .linuxParameters(LinuxParameters.Builder.create(this, "LinuxParameters")
     * .initProcessEnabled(true)
     * .sharedMemorySize(1024)
     * .maxSwap(Size.mebibytes(5000))
     * .swappiness(90)
     * .build())
     * .build());
     * ```
     */
    public inline fun linuxParameters(
        scope: Construct,
        id: String,
        block: LinuxParametersDsl.() -> Unit = {},
    ): LinuxParameters {
        val builder = LinuxParametersDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for defining Linux-specific options that are applied to the container.
     *
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * taskDefinition.addContainer("container", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(1024)
     * .linuxParameters(LinuxParameters.Builder.create(this, "LinuxParameters")
     * .initProcessEnabled(true)
     * .sharedMemorySize(1024)
     * .maxSwap(Size.mebibytes(5000))
     * .swappiness(90)
     * .build())
     * .build());
     * ```
     */
    public inline fun linuxParametersProps(
        block: LinuxParametersPropsDsl.() -> Unit = {}
    ): LinuxParametersProps {
        val builder = LinuxParametersPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining an ECS target.
     *
     * The port mapping for it must already have been created through addPortMapping().
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * Ec2Service service = Ec2Service.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
     * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
     * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
     * .containerName("MyContainer")
     * .containerPort(80)
     * .build()));
     * ```
     */
    public inline fun loadBalancerTargetOptions(
        block: LoadBalancerTargetOptionsDsl.() -> Unit = {}
    ): LoadBalancerTargetOptions {
        val builder = LoadBalancerTargetOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration to use when creating a log driver.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * LogDriverConfig logDriverConfig = LogDriverConfig.builder()
     * .logDriver("logDriver")
     * // the properties below are optional
     * .options(Map.of(
     * "optionsKey", "options"))
     * .secretOptions(List.of(SecretProperty.builder()
     * .name("name")
     * .valueFrom("valueFrom")
     * .build()))
     * .build();
     * ```
     */
    public inline fun logDriverConfig(block: LogDriverConfigDsl.() -> Unit = {}): LogDriverConfig {
        val builder = LogDriverConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for enabling scaling based on memory utilization.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ScalableTaskCount scalableTarget =
     * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
     * .minCapacity(1)
     * .maxCapacity(20)
     * .build());
     * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * scalableTarget.scaleOnMemoryUtilization("MemoryScaling",
     * MemoryUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * ```
     */
    public inline fun memoryUtilizationScalingProps(
        block: MemoryUtilizationScalingPropsDsl.() -> Unit = {}
    ): MemoryUtilizationScalingProps {
        val builder = MemoryUtilizationScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of data volume mount points for a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * MountPoint mountPoint = MountPoint.builder()
     * .containerPath("containerPath")
     * .readOnly(false)
     * .sourceVolume("sourceVolume")
     * .build();
     * ```
     */
    public inline fun mountPoint(block: MountPointDsl.() -> Unit = {}): MountPoint {
        val builder = MountPointDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * PortMap ValueObjectClass having by ContainerDefinition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * PortMap portMap = PortMap.Builder.create(NetworkMode.NONE)
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build();
     * ```
     */
    public inline fun portMap(
        networkmode: NetworkMode,
        block: PortMapDsl.() -> Unit = {}
    ): PortMap {
        val builder = PortMapDsl(networkmode)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Port mappings allow containers to access ports on the host container instance to send or
     * receive traffic.
     *
     * Example:
     * ```
     * TaskDefinition taskDefinition;
     * Cluster cluster;
     * // Add a container to the task definition
     * ContainerDefinition specificContainer = taskDefinition.addContainer("Container",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("/aws/aws-example-app"))
     * .memoryLimitMiB(2048)
     * .build());
     * // Add a port mapping
     * specificContainer.addPortMappings(PortMapping.builder()
     * .containerPort(7600)
     * .protocol(Protocol.TCP)
     * .build());
     * Ec2Service.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .cloudMapOptions(CloudMapOptions.builder()
     * // Create SRV records - useful for bridge networking
     * .dnsRecordType(DnsRecordType.SRV)
     * // Targets port TCP port 7600 `specificContainer`
     * .container(specificContainer)
     * .containerPort(7600)
     * .build())
     * .build();
     * ```
     */
    public inline fun portMapping(block: PortMappingDsl.() -> Unit = {}): PortMapping {
        val builder = PortMappingDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An image hosted in a public or private repository.
     *
     * For images hosted in Amazon ECR, see
     * [EcrImage](https://docs.aws.amazon.com/AmazonECR/latest/userguide/images.html).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecr.assets.*;
     * import software.amazon.awscdk.services.ecs.*;
     * DockerImageAsset dockerImageAsset;
     * ContainerImage repositoryImage = RepositoryImage.fromDockerImageAsset(dockerImageAsset);
     * ```
     */
    public inline fun repositoryImage(
        imageName: String,
        block: RepositoryImageDsl.() -> Unit = {}
    ): RepositoryImage {
        val builder = RepositoryImageDsl(imageName)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for an image hosted in a public or private repository.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Secret secret;
     * RepositoryImageProps repositoryImageProps = RepositoryImageProps.builder()
     * .credentials(secret)
     * .build();
     * ```
     */
    public inline fun repositoryImageProps(
        block: RepositoryImagePropsDsl.() -> Unit = {}
    ): RepositoryImageProps {
        val builder = RepositoryImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for enabling scaling based on Application Load Balancer (ALB) request counts.
     *
     * Example:
     * ```
     * ApplicationTargetGroup target;
     * BaseService service;
     * ScalableTaskCount scaling =
     * service.autoScaleTaskCount(EnableScalingProps.builder().maxCapacity(10).build());
     * scaling.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * scaling.scaleOnRequestCount("RequestScaling", RequestCountScalingProps.builder()
     * .requestsPerTarget(10000)
     * .targetGroup(target)
     * .build());
     * ```
     */
    public inline fun requestCountScalingProps(
        block: RequestCountScalingPropsDsl.() -> Unit = {}
    ): RequestCountScalingProps {
        val builder = RequestCountScalingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The interface for Runtime Platform.
     *
     * Example:
     * ```
     * // Create a Task Definition for the Windows container to start
     * FargateTaskDefinition taskDefinition = FargateTaskDefinition.Builder.create(this, "TaskDef")
     * .runtimePlatform(RuntimePlatform.builder()
     * .operatingSystemFamily(OperatingSystemFamily.WINDOWS_SERVER_2019_CORE)
     * .cpuArchitecture(CpuArchitecture.X86_64)
     * .build())
     * .cpu(1024)
     * .memoryLimitMiB(2048)
     * .build();
     * taskDefinition.addContainer("windowsservercore", ContainerDefinitionOptions.builder()
     * .logging(LogDriver.awsLogs(AwsLogDriverProps.builder().streamPrefix("win-iis-on-fargate").build()))
     * .portMappings(List.of(PortMapping.builder().containerPort(80).build()))
     * .image(ContainerImage.fromRegistry("mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019"))
     * .build());
     * ```
     */
    public inline fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}): RuntimePlatform {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The scalable attribute representing task count.
     *
     * Example:
     * ```
     * Cluster cluster;
     * ApplicationLoadBalancedFargateService loadBalancedFargateService =
     * ApplicationLoadBalancedFargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .memoryLimitMiB(1024)
     * .desiredCount(1)
     * .cpu(512)
     * .taskImageOptions(ApplicationLoadBalancedTaskImageOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .build())
     * .build();
     * ScalableTaskCount scalableTarget =
     * loadBalancedFargateService.service.autoScaleTaskCount(EnableScalingProps.builder()
     * .minCapacity(1)
     * .maxCapacity(20)
     * .build());
     * scalableTarget.scaleOnCpuUtilization("CpuScaling", CpuUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * scalableTarget.scaleOnMemoryUtilization("MemoryScaling",
     * MemoryUtilizationScalingProps.builder()
     * .targetUtilizationPercent(50)
     * .build());
     * ```
     */
    public inline fun scalableTaskCount(
        scope: Construct,
        id: String,
        block: ScalableTaskCountDsl.() -> Unit = {},
    ): ScalableTaskCount {
        val builder = ScalableTaskCountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties of a scalable attribute representing task count.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationautoscaling.*;
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * ScalableTaskCountProps scalableTaskCountProps = ScalableTaskCountProps.builder()
     * .dimension("dimension")
     * .maxCapacity(123)
     * .resourceId("resourceId")
     * .role(role)
     * .serviceNamespace(ServiceNamespace.ECS)
     * // the properties below are optional
     * .minCapacity(123)
     * .build();
     * ```
     */
    public inline fun scalableTaskCountProps(
        block: ScalableTaskCountPropsDsl.() -> Unit = {}
    ): ScalableTaskCountProps {
        val builder = ScalableTaskCountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The temporary disk space mounted to the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ScratchSpace scratchSpace = ScratchSpace.builder()
     * .containerPath("containerPath")
     * .name("name")
     * .readOnly(false)
     * .sourcePath("sourcePath")
     * .build();
     * ```
     */
    public inline fun scratchSpace(block: ScratchSpaceDsl.() -> Unit = {}): ScratchSpace {
        val builder = ScratchSpaceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specify the secret's version id or version stage.
     *
     * Example:
     * ```
     * Secret secret;
     * Secret dbSecret;
     * StringParameter parameter;
     * TaskDefinition taskDefinition;
     * Bucket s3Bucket;
     * ContainerDefinition newContainer = taskDefinition.addContainer("container",
     * ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
     * .memoryLimitMiB(1024)
     * .environment(Map.of( // clear text, not for sensitive data
     * "STAGE", "prod"))
     * .environmentFiles(List.of(EnvironmentFile.fromAsset("./demo-env-file.env"),
     * EnvironmentFile.fromBucket(s3Bucket, "assets/demo-env-file.env")))
     * .secrets(Map.of( // Retrieved from AWS Secrets Manager or AWS Systems Manager Parameter Store
     * at container start-up.
     * "SECRET", Secret.fromSecretsManager(secret),
     * "DB_PASSWORD", Secret.fromSecretsManager(dbSecret, "password"),  // Reference a specific JSON
     * field, (requires platform version 1.4.0 or later for Fargate tasks)
     * "API_KEY", Secret.fromSecretsManagerVersion(secret,
     * SecretVersionInfo.builder().versionId("12345").build(), "apiKey"),  // Reference a specific
     * version of the secret by its version id or version stage (requires platform version 1.4.0 or later
     * for Fargate tasks)
     * "PARAMETER", Secret.fromSsmParameter(parameter)))
     * .build());
     * newContainer.addEnvironment("QUEUE_NAME", "MyQueue");
     * newContainer.addSecret("API_KEY", Secret.fromSecretsManager(secret));
     * newContainer.addSecret("DB_PASSWORD", Secret.fromSecretsManager(secret, "password"));
     * ```
     */
    public inline fun secretVersionInfo(
        block: SecretVersionInfoDsl.() -> Unit = {}
    ): SecretVersionInfo {
        val builder = SecretVersionInfoDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * ServiceConnect ValueObjectClass having by ContainerDefinition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * AppProtocol appProtocol;
     * ServiceConnect serviceConnect = ServiceConnect.Builder.create(NetworkMode.NONE)
     * .containerPort(123)
     * // the properties below are optional
     * .appProtocol(appProtocol)
     * .hostPort(123)
     * .name("name")
     * .protocol(Protocol.TCP)
     * .build();
     * ```
     */
    public inline fun serviceConnect(
        networkmode: NetworkMode,
        block: ServiceConnectDsl.() -> Unit = {}
    ): ServiceConnect {
        val builder = ServiceConnectDsl(networkmode)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for Service Connect configuration.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * ContainerDefinitionOptions containerOptions;
     * ContainerDefinition container = taskDefinition.addContainer("MyContainer", containerOptions);
     * container.addPortMappings(PortMapping.builder()
     * .name("api")
     * .containerPort(8080)
     * .build());
     * cluster.addDefaultCloudMapNamespace(CloudMapNamespaceOptions.builder()
     * .name("local")
     * .build());
     * FargateService service = FargateService.Builder.create(this, "Service")
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .serviceConnectConfiguration(ServiceConnectProps.builder()
     * .services(List.of(ServiceConnectService.builder()
     * .portMappingName("api")
     * .dnsName("http-api")
     * .port(80)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun serviceConnectProps(
        block: ServiceConnectPropsDsl.() -> Unit = {}
    ): ServiceConnectProps {
        val builder = ServiceConnectPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Interface for service connect Service props.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * ServiceConnectService serviceConnectService = ServiceConnectService.builder()
     * .portMappingName("portMappingName")
     * // the properties below are optional
     * .discoveryName("discoveryName")
     * .dnsName("dnsName")
     * .ingressPortOverride(123)
     * .port(123)
     * .build();
     * ```
     */
    public inline fun serviceConnectService(
        block: ServiceConnectServiceDsl.() -> Unit = {}
    ): ServiceConnectService {
        val builder = ServiceConnectServiceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to splunk Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Secret secret;
     * SplunkLogDriver splunkLogDriver = SplunkLogDriver.Builder.create()
     * .secretToken(secret)
     * .url("url")
     * // the properties below are optional
     * .caName("caName")
     * .caPath("caPath")
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .format(SplunkLogFormat.INLINE)
     * .gzip(false)
     * .gzipLevel(123)
     * .index("index")
     * .insecureSkipVerify("insecureSkipVerify")
     * .labels(List.of("labels"))
     * .source("source")
     * .sourceType("sourceType")
     * .tag("tag")
     * .verifyConnection(false)
     * .build();
     * ```
     */
    public inline fun splunkLogDriver(block: SplunkLogDriverDsl.() -> Unit = {}): SplunkLogDriver {
        val builder = SplunkLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the splunk log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/splunk/)
     *
     * Example:
     * ```
     * Secret secret;
     * // Create a Task Definition for the container to start
     * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("example-image"))
     * .memoryLimitMiB(256)
     * .logging(LogDrivers.splunk(SplunkLogDriverProps.builder()
     * .secretToken(secret)
     * .url("my-splunk-url")
     * .build()))
     * .build());
     * ```
     */
    public inline fun splunkLogDriverProps(
        block: SplunkLogDriverPropsDsl.() -> Unit = {}
    ): SplunkLogDriverProps {
        val builder = SplunkLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A log driver that sends log information to syslog Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SyslogLogDriver syslogLogDriver = SyslogLogDriver.Builder.create()
     * .address("address")
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .facility("facility")
     * .format("format")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .tlsCaCert("tlsCaCert")
     * .tlsCert("tlsCert")
     * .tlsKey("tlsKey")
     * .tlsSkipVerify(false)
     * .build();
     * ```
     */
    public inline fun syslogLogDriver(block: SyslogLogDriverDsl.() -> Unit = {}): SyslogLogDriver {
        val builder = SyslogLogDriverDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the syslog log driver configuration options.
     *
     * [Source](https://docs.docker.com/config/containers/logging/syslog/)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SyslogLogDriverProps syslogLogDriverProps = SyslogLogDriverProps.builder()
     * .address("address")
     * .env(List.of("env"))
     * .envRegex("envRegex")
     * .facility("facility")
     * .format("format")
     * .labels(List.of("labels"))
     * .tag("tag")
     * .tlsCaCert("tlsCaCert")
     * .tlsCert("tlsCert")
     * .tlsKey("tlsKey")
     * .tlsSkipVerify(false)
     * .build();
     * ```
     */
    public inline fun syslogLogDriverProps(
        block: SyslogLogDriverPropsDsl.() -> Unit = {}
    ): SyslogLogDriverProps {
        val builder = SyslogLogDriverPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Kernel parameters to set in the container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * SystemControl systemControl = SystemControl.builder()
     * .namespace("namespace")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun systemControl(block: SystemControlDsl.() -> Unit = {}): SystemControl {
        val builder = SystemControlDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The base class for all task definitions.
     *
     * Example:
     * ```
     * Cluster cluster;
     * TaskDefinition taskDefinition;
     * Vpc vpc;
     * FargateService service = FargateService.Builder.create(this,
     * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
     * "LB").vpc(vpc).internetFacing(true).build();
     * ApplicationListener listener = lb.addListener("Listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * service.registerLoadBalancerTargets(EcsTarget.builder()
     * .containerName("web")
     * .containerPort(80)
     * .newTargetGroupId("ECS")
     * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
     * .protocol(ApplicationProtocol.HTTPS)
     * .build()))
     * .build());
     * ```
     */
    public inline fun taskDefinition(
        scope: Construct,
        id: String,
        block: TaskDefinitionDsl.() -> Unit = {},
    ): TaskDefinition {
        val builder = TaskDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to an existing task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * TaskDefinitionAttributes taskDefinitionAttributes = TaskDefinitionAttributes.builder()
     * .taskDefinitionArn("taskDefinitionArn")
     * // the properties below are optional
     * .compatibility(Compatibility.EC2)
     * .executionRole(role)
     * .networkMode(NetworkMode.NONE)
     * .taskRole(role)
     * .build();
     * ```
     */
    public inline fun taskDefinitionAttributes(
        block: TaskDefinitionAttributesDsl.() -> Unit = {}
    ): TaskDefinitionAttributes {
        val builder = TaskDefinitionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for task definitions.
     *
     * Example:
     * ```
     * IVpc vpc = Vpc.fromLookup(this, "Vpc", VpcLookupOptions.builder()
     * .isDefault(true)
     * .build());
     * Cluster cluster = Cluster.Builder.create(this, "Ec2Cluster").vpc(vpc).build();
     * cluster.addCapacity("DefaultAutoScalingGroup", AddCapacityOptions.builder()
     * .instanceType(new InstanceType("t2.micro"))
     * .vpcSubnets(SubnetSelection.builder().subnetType(SubnetType.PUBLIC).build())
     * .build());
     * TaskDefinition taskDefinition = TaskDefinition.Builder.create(this, "TD")
     * .compatibility(Compatibility.EC2)
     * .build();
     * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
     * .image(ContainerImage.fromRegistry("foo/bar"))
     * .memoryLimitMiB(256)
     * .build());
     * EcsRunTask runTask = EcsRunTask.Builder.create(this, "Run")
     * .integrationPattern(IntegrationPattern.RUN_JOB)
     * .cluster(cluster)
     * .taskDefinition(taskDefinition)
     * .launchTarget(EcsEc2LaunchTarget.Builder.create()
     * .placementStrategies(List.of(PlacementStrategy.spreadAcrossInstances(),
     * PlacementStrategy.packedByCpu(), PlacementStrategy.randomly()))
     * .placementConstraints(List.of(PlacementConstraint.memberOf("blieptuut")))
     * .build())
     * .propagatedTagSource(PropagatedTagSource.TASK_DEFINITION)
     * .build();
     * ```
     */
    public inline fun taskDefinitionProps(
        block: TaskDefinitionPropsDsl.() -> Unit = {}
    ): TaskDefinitionProps {
        val builder = TaskDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details of a tmpfs mount for a container.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Tmpfs tmpfs = Tmpfs.builder()
     * .containerPath("containerPath")
     * .size(123)
     * // the properties below are optional
     * .mountOptions(List.of(TmpfsMountOption.DEFAULTS))
     * .build();
     * ```
     */
    public inline fun tmpfs(block: TmpfsDsl.() -> Unit = {}): Tmpfs {
        val builder = TmpfsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for enabling target tracking scaling based on a custom CloudWatch metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * import software.amazon.awscdk.services.ecs.*;
     * Metric metric;
     * TrackCustomMetricProps trackCustomMetricProps = TrackCustomMetricProps.builder()
     * .metric(metric)
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .policyName("policyName")
     * .scaleInCooldown(Duration.minutes(30))
     * .scaleOutCooldown(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun trackCustomMetricProps(
        block: TrackCustomMetricPropsDsl.() -> Unit = {}
    ): TrackCustomMetricProps {
        val builder = TrackCustomMetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ulimit settings to pass to the container.
     *
     * NOTE: Does not work for Windows containers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * Ulimit ulimit = Ulimit.builder()
     * .hardLimit(123)
     * .name(UlimitName.CORE)
     * .softLimit(123)
     * .build();
     * ```
     */
    public inline fun ulimit(block: UlimitDsl.() -> Unit = {}): Ulimit {
        val builder = UlimitDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A data volume used in a task definition.
     *
     * For tasks that use a Docker volume, specify a DockerVolumeConfiguration. For tasks that use a
     * bind mount host volume, specify a host and optional sourcePath.
     *
     * For more information, see
     * [Using Data Volumes in Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html).
     *
     * Example:
     * ```
     * FargateTaskDefinition fargateTaskDefinition = FargateTaskDefinition.Builder.create(this,
     * "TaskDef")
     * .memoryLimitMiB(512)
     * .cpu(256)
     * .build();
     * Map&lt;String, Object&gt; volume = Map.of(
     * // Use an Elastic FileSystem
     * "name", "mydatavolume",
     * "efsVolumeConfiguration", Map.of(
     * "fileSystemId", "EFS"));
     * void container = fargateTaskDefinition.addVolume(volume);
     * ```
     */
    public inline fun volume(block: VolumeDsl.() -> Unit = {}): Volume {
        val builder = VolumeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The details on a data volume from another container in the same task definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ecs.*;
     * VolumeFrom volumeFrom = VolumeFrom.builder()
     * .readOnly(false)
     * .sourceContainer("sourceContainer")
     * .build();
     * ```
     */
    public inline fun volumeFrom(block: VolumeFromDsl.() -> Unit = {}): VolumeFrom {
        val builder = VolumeFromDsl()
        builder.apply(block)
        return builder.build()
    }
}
