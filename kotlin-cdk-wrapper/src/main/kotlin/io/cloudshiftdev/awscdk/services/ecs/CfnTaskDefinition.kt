@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Registers a new task definition from the supplied `family` and `containerDefinitions` .
 *
 * Optionally, you can add data volumes to your containers with the `volumes` parameter. For more
 * information about task definition parameters and defaults, see [Amazon ECS Task
 * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html) in
 * the *Amazon Elastic Container Service Developer Guide* .
 *
 * You can specify a role for your task with the `taskRoleArn` parameter. When you specify a role
 * for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API
 * requests to the AWS services that are specified in the policy that's associated with the role. For
 * more information, see [IAM Roles for
 * Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * You can specify a Docker networking mode for the containers in your task definition with the
 * `networkMode` parameter. The available network modes correspond to those described in [Network
 * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#/network-settings)
 * in the Docker run reference. If you specify the `awsvpc` network mode, the task is allocated an
 * elastic network interface, and you must specify a `NetworkConfiguration` when you create a service
 * or run a task with the task definition. For more information, see [Task
 * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnTaskDefinition cfnTaskDefinition = CfnTaskDefinition.Builder.create(this,
 * "MyCfnTaskDefinition")
 * .containerDefinitions(List.of(ContainerDefinitionProperty.builder()
 * .image("image")
 * .name("name")
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .credentialSpecs(List.of("credentialSpecs"))
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
 * .configuredAtLaunch(false)
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
public open class CfnTaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecs.CfnTaskDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTaskDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.ecs.CfnTaskDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTaskDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTaskDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTaskDefinitionProps(props)
  )

  /**
   * The ARN of the task definition.
   */
  public open fun attrTaskDefinitionArn(): String = unwrap(this).getAttrTaskDefinitionArn()

  /**
   * A list of container definitions in JSON format that describe the different containers that make
   * up your task.
   */
  public open fun containerDefinitions(): Any? = unwrap(this).getContainerDefinitions()

  /**
   * A list of container definitions in JSON format that describe the different containers that make
   * up your task.
   */
  public open fun containerDefinitions(`value`: IResolvable) {
    unwrap(this).setContainerDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of container definitions in JSON format that describe the different containers that make
   * up your task.
   */
  public open fun containerDefinitions(`value`: List<Any>) {
    unwrap(this).setContainerDefinitions(`value`)
  }

  /**
   * A list of container definitions in JSON format that describe the different containers that make
   * up your task.
   */
  public open fun containerDefinitions(vararg `value`: Any): Unit =
      containerDefinitions(`value`.toList())

  /**
   * The number of `cpu` units used by the task.
   */
  public open fun cpu(): String? = unwrap(this).getCpu()

  /**
   * The number of `cpu` units used by the task.
   */
  public open fun cpu(`value`: String) {
    unwrap(this).setCpu(`value`)
  }

  /**
   * The ephemeral storage settings to use for tasks run with the task definition.
   */
  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  /**
   * The ephemeral storage settings to use for tasks run with the task definition.
   */
  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ephemeral storage settings to use for tasks run with the task definition.
   */
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
  }

  /**
   * The ephemeral storage settings to use for tasks run with the task definition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbc89d75553d59902919905573ea08c8940af31c51cd9de060318472828178a8")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container
   * agent permission to make AWS API calls on your behalf.
   */
  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container
   * agent permission to make AWS API calls on your behalf.
   */
  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  /**
   * The name of a family that this task definition is registered to.
   */
  public open fun family(): String? = unwrap(this).getFamily()

  /**
   * The name of a family that this task definition is registered to.
   */
  public open fun family(`value`: String) {
    unwrap(this).setFamily(`value`)
  }

  /**
   * The Elastic Inference accelerators to use for the containers in the task.
   */
  public open fun inferenceAccelerators(): Any? = unwrap(this).getInferenceAccelerators()

  /**
   * The Elastic Inference accelerators to use for the containers in the task.
   */
  public open fun inferenceAccelerators(`value`: IResolvable) {
    unwrap(this).setInferenceAccelerators(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Elastic Inference accelerators to use for the containers in the task.
   */
  public open fun inferenceAccelerators(`value`: List<Any>) {
    unwrap(this).setInferenceAccelerators(`value`)
  }

  /**
   * The Elastic Inference accelerators to use for the containers in the task.
   */
  public open fun inferenceAccelerators(vararg `value`: Any): Unit =
      inferenceAccelerators(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IPC resource namespace to use for the containers in the task.
   */
  public open fun ipcMode(): String? = unwrap(this).getIpcMode()

  /**
   * The IPC resource namespace to use for the containers in the task.
   */
  public open fun ipcMode(`value`: String) {
    unwrap(this).setIpcMode(`value`)
  }

  /**
   * The amount (in MiB) of memory used by the task.
   */
  public open fun memory(): String? = unwrap(this).getMemory()

  /**
   * The amount (in MiB) of memory used by the task.
   */
  public open fun memory(`value`: String) {
    unwrap(this).setMemory(`value`)
  }

  /**
   * The Docker networking mode to use for the containers in the task.
   */
  public open fun networkMode(): String? = unwrap(this).getNetworkMode()

  /**
   * The Docker networking mode to use for the containers in the task.
   */
  public open fun networkMode(`value`: String) {
    unwrap(this).setNetworkMode(`value`)
  }

  /**
   * The process namespace to use for the containers in the task.
   */
  public open fun pidMode(): String? = unwrap(this).getPidMode()

  /**
   * The process namespace to use for the containers in the task.
   */
  public open fun pidMode(`value`: String) {
    unwrap(this).setPidMode(`value`)
  }

  /**
   * An array of placement constraint objects to use for tasks.
   */
  public open fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  /**
   * An array of placement constraint objects to use for tasks.
   */
  public open fun placementConstraints(`value`: IResolvable) {
    unwrap(this).setPlacementConstraints(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of placement constraint objects to use for tasks.
   */
  public open fun placementConstraints(`value`: List<Any>) {
    unwrap(this).setPlacementConstraints(`value`)
  }

  /**
   * An array of placement constraint objects to use for tasks.
   */
  public open fun placementConstraints(vararg `value`: Any): Unit =
      placementConstraints(`value`.toList())

  /**
   * The configuration details for the App Mesh proxy.
   */
  public open fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

  /**
   * The configuration details for the App Mesh proxy.
   */
  public open fun proxyConfiguration(`value`: IResolvable) {
    unwrap(this).setProxyConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration details for the App Mesh proxy.
   */
  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty) {
    unwrap(this).setProxyConfiguration(`value`.let(ProxyConfigurationProperty::unwrap))
  }

  /**
   * The configuration details for the App Mesh proxy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38ba444d8dd1fee3ccca4656939eb6ded97f61af7318d18ba80a91bd293ef875")
  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty.Builder.() -> Unit): Unit =
      proxyConfiguration(ProxyConfigurationProperty(`value`))

  /**
   * The task launch types the task definition was validated against.
   */
  public open fun requiresCompatibilities(): List<String> =
      unwrap(this).getRequiresCompatibilities() ?: emptyList()

  /**
   * The task launch types the task definition was validated against.
   */
  public open fun requiresCompatibilities(`value`: List<String>) {
    unwrap(this).setRequiresCompatibilities(`value`)
  }

  /**
   * The task launch types the task definition was validated against.
   */
  public open fun requiresCompatibilities(vararg `value`: String): Unit =
      requiresCompatibilities(`value`.toList())

  /**
   * The operating system that your tasks definitions run on.
   */
  public open fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

  /**
   * The operating system that your tasks definitions run on.
   */
  public open fun runtimePlatform(`value`: IResolvable) {
    unwrap(this).setRuntimePlatform(`value`.let(IResolvable::unwrap))
  }

  /**
   * The operating system that your tasks definitions run on.
   */
  public open fun runtimePlatform(`value`: RuntimePlatformProperty) {
    unwrap(this).setRuntimePlatform(`value`.let(RuntimePlatformProperty::unwrap))
  }

  /**
   * The operating system that your tasks definitions run on.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("167815019ae1b2a8cf0011c6ad292f21fef20d314b1ddefbf756ea37c979ba39")
  public open fun runtimePlatform(`value`: RuntimePlatformProperty.Builder.() -> Unit): Unit =
      runtimePlatform(RuntimePlatformProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the task definition to help you categorize and organize them.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the task definition to help you categorize and organize them.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to the task definition to help you categorize and organize them.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management
   * role that grants containers in the task permission to call AWS APIs on your behalf.
   */
  public open fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

  /**
   * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management
   * role that grants containers in the task permission to call AWS APIs on your behalf.
   */
  public open fun taskRoleArn(`value`: String) {
    unwrap(this).setTaskRoleArn(`value`)
  }

  /**
   * The list of data volume definitions for the task.
   */
  public open fun volumes(): Any? = unwrap(this).getVolumes()

  /**
   * The list of data volume definitions for the task.
   */
  public open fun volumes(`value`: IResolvable) {
    unwrap(this).setVolumes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of data volume definitions for the task.
   */
  public open fun volumes(`value`: List<Any>) {
    unwrap(this).setVolumes(`value`)
  }

  /**
   * The list of data volume definitions for the task.
   */
  public open fun volumes(vararg `value`: Any): Unit = volumes(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnTaskDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    public fun containerDefinitions(containerDefinitions: IResolvable)

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    public fun containerDefinitions(containerDefinitions: List<Any>)

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    public fun containerDefinitions(vararg containerDefinitions: Any)

    /**
     * The number of `cpu` units used by the task.
     *
     * If you use the EC2 launch type, this field is optional. Any value can be used. If you use the
     * Fargate launch type, this field is required. You must use one of the following values. The value
     * that you choose determines your range of valid values for the `memory` parameter.
     *
     * The CPU units cannot be less than 1 vCPU when you use Windows containers on Fargate.
     *
     * * 256 (.25 vCPU) - Available `memory` values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * * 512 (.5 vCPU) - Available `memory` values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4
     * GB)
     * * 1024 (1 vCPU) - Available `memory` values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5
     * GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * * 2048 (2 vCPU) - Available `memory` values: 4096 (4 GB) and 16384 (16 GB) in increments of
     * 1024 (1 GB)
     * * 4096 (4 vCPU) - Available `memory` values: 8192 (8 GB) and 30720 (30 GB) in increments of
     * 1024 (1 GB)
     * * 8192 (8 vCPU) - Available `memory` values: 16 GB and 60 GB in 4 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * * 16384 (16vCPU) - Available `memory` values: 32GB and 120 GB in 8 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
     * @param cpu The number of `cpu` units used by the task. 
     */
    public fun cpu(cpu: String)

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS
     * container agent permission to make AWS API calls on your behalf.
     *
     * The task execution IAM role is required depending on the requirements of your task. For more
     * information, see [Amazon ECS task execution IAM
     * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the Amazon ECS container agent permission to make AWS API calls on your behalf. 
     */
    public fun executionRoleArn(executionRoleArn: String)

    /**
     * The name of a family that this task definition is registered to.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     *
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task
     * definition that you registered to a family a revision number of 1. Amazon ECS gives sequential
     * revision numbers to each task definition that you add.
     *
     *
     * To use revision numbers when you update a task definition, specify this property. If you
     * don't specify a value, AWS CloudFormation generates a new task definition each time that you
     * update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
     * @param family The name of a family that this task definition is registered to. 
     */
    public fun family(family: String)

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    public fun inferenceAccelerators(inferenceAccelerators: IResolvable)

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    public fun inferenceAccelerators(inferenceAccelerators: List<Any>)

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    public fun inferenceAccelerators(vararg inferenceAccelerators: Any)

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * The valid values are `host` , `task` , or `none` . If `host` is specified, then all
     * containers within the tasks that specified the `host` IPC mode on the same container instance
     * share the same IPC resources with the host Amazon EC2 instance. If `task` is specified, all
     * containers within the specified task share the same IPC resources. If `none` is specified, then
     * IPC resources within the containers of a task are private and not shared with other containers
     * in a task or on the container instance. If no value is specified, then the IPC resource
     * namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see [IPC
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#ipc-settings---ipc)
     * in the *Docker run reference* .
     *
     * If the `host` IPC mode is used, be aware that there is a heightened risk of undesired IPC
     * namespace expose. For more information, see [Docker
     * security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/) .
     *
     * If you are setting namespaced kernel parameters using `systemControls` for the containers in
     * the task, the following will apply to your IPC resource namespace. For more information, see
     * [System
     * Controls](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * * For tasks that use the `host` IPC mode, IPC namespace related `systemControls` are not
     * supported.
     * * For tasks that use the `task` IPC mode, IPC namespace related `systemControls` will apply
     * to all containers within a task.
     *
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode)
     * @param ipcMode The IPC resource namespace to use for the containers in the task. 
     */
    public fun ipcMode(ipcMode: String)

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * If your tasks runs on Amazon EC2 instances, you must specify either a task-level memory value
     * or a container-level memory value. This field is optional and any value can be used. If a
     * task-level memory value is specified, the container-level memory value is optional. For more
     * information regarding container-level memory and memory reservation, see
     * [ContainerDefinition](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
     * .
     *
     * If your tasks runs on AWS Fargate , this field is required. You must use one of the following
     * values. The value you choose determines your range of valid values for the `cpu` parameter.
     *
     * * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available `cpu` values: 256 (.25 vCPU)
     * * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available `cpu` values: 512 (.5 vCPU)
     * * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     * Available `cpu` values: 1024 (1 vCPU)
     * * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available `cpu`
     * values: 2048 (2 vCPU)
     * * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available `cpu`
     * values: 4096 (4 vCPU)
     * * Between 16 GB and 60 GB in 4 GB increments - Available `cpu` values: 8192 (8 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * * Between 32GB and 120 GB in 8 GB increments - Available `cpu` values: 16384 (16 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
     * @param memory The amount (in MiB) of memory used by the task. 
     */
    public fun memory(memory: String)

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are `none` , `bridge` , `awsvpc` , and `host` . If no network mode is
     * specified, the default is `bridge` .
     *
     * For Amazon ECS tasks on Fargate, the `awsvpc` network mode is required. For Amazon ECS tasks
     * on Amazon EC2 Linux instances, any network mode can be used. For Amazon ECS tasks on Amazon EC2
     * Windows instances, `&lt;default&gt;` or `awsvpc` can be used. If the network mode is set to
     * `none` , you cannot specify port mappings in your container definitions, and the tasks
     * containers do not have external connectivity. The `host` and `awsvpc` network modes offer the
     * highest networking performance for containers because they use the EC2 network stack instead of
     * the virtualized network stack provided by the `bridge` mode.
     *
     * With the `host` and `awsvpc` network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the `host` network mode) or the attached elastic network
     * interface port (for the `awsvpc` network mode), so you cannot take advantage of dynamic host
     * port mappings.
     *
     *
     * When using the `host` network mode, you should not run containers using the root user (UID
     * 0). It is considered best practice to use a non-root user.
     *
     *
     * If the network mode is `awsvpc` , the task is allocated an elastic network interface, and you
     * must specify a `NetworkConfiguration` value when you create a service or run a task with the
     * task definition. For more information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * If the network mode is `host` , you cannot run multiple instantiations of the same task on a
     * single container instance when port mappings are used.
     *
     * For more information, see [Network
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#network-settings)
     * in the *Docker run reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
     * @param networkMode The Docker networking mode to use for the containers in the task. 
     */
    public fun networkMode(networkMode: String)

    /**
     * The process namespace to use for the containers in the task.
     *
     * The valid values are `host` or `task` . On Fargate for Linux containers, the only valid value
     * is `task` . For example, monitoring sidecars might need `pidMode` to access information about
     * other containers running in the same task.
     *
     * If `host` is specified, all containers within the tasks that specified the `host` PID mode on
     * the same container instance share the same process namespace with the host Amazon EC2 instance.
     *
     * If `task` is specified, all containers within the specified task share the same process
     * namespace.
     *
     * If no value is specified, the default is a private namespace for each container. For more
     * information, see [PID
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#pid-settings---pid)
     * in the *Docker run reference* .
     *
     * If the `host` PID mode is used, there's a heightened risk of undesired process namespace
     * exposure. For more information, see [Docker
     * security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/) .
     *
     *
     * This parameter is not supported for Windows containers. &gt; This parameter is only supported
     * for tasks that are hosted on AWS Fargate if the tasks are using platform version `1.4.0` or
     * later (Linux). This isn't supported for Windows containers on Fargate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode)
     * @param pidMode The process namespace to use for the containers in the task. 
     */
    public fun pidMode(pidMode: String)

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    public fun placementConstraints(placementConstraints: IResolvable)

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    public fun placementConstraints(placementConstraints: List<Any>)

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    public fun placementConstraints(vararg placementConstraints: Any)

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    public fun proxyConfiguration(proxyConfiguration: IResolvable)

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty)

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit)

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see [Amazon
     * ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     * @param requiresCompatibilities The task launch types the task definition was validated
     * against. 
     */
    public fun requiresCompatibilities(requiresCompatibilities: List<String>)

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see [Amazon
     * ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     * @param requiresCompatibilities The task launch types the task definition was validated
     * against. 
     */
    public fun requiresCompatibilities(vararg requiresCompatibilities: String)

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    public fun runtimePlatform(runtimePlatform: IResolvable)

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty)

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit)

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     * @param tags The metadata that you apply to the task definition to help you categorize and
     * organize them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     * @param tags The metadata that you apply to the task definition to help you categorize and
     * organize them. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * role that grants containers in the task permission to call AWS APIs on your behalf.
     *
     * For more information, see [Amazon ECS Task
     * Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * IAM roles for tasks on Windows require that the `-EnableTaskIAMRole` option is set when you
     * launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration
     * code to use the feature. For more information, see [Windows IAM roles for
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
     * @param taskRoleArn The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management role that grants containers in the task permission to call AWS APIs on your
     * behalf. 
     */
    public fun taskRoleArn(taskRoleArn: String)

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    public fun volumes(volumes: IResolvable)

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    public fun volumes(volumes: List<Any>)

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder.create(scope, id)

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    override fun containerDefinitions(containerDefinitions: IResolvable) {
      cdkBuilder.containerDefinitions(containerDefinitions.let(IResolvable::unwrap))
    }

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    override fun containerDefinitions(containerDefinitions: List<Any>) {
      cdkBuilder.containerDefinitions(containerDefinitions)
    }

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see [Amazon ECS Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     * different containers that make up your task. 
     */
    override fun containerDefinitions(vararg containerDefinitions: Any): Unit =
        containerDefinitions(containerDefinitions.toList())

    /**
     * The number of `cpu` units used by the task.
     *
     * If you use the EC2 launch type, this field is optional. Any value can be used. If you use the
     * Fargate launch type, this field is required. You must use one of the following values. The value
     * that you choose determines your range of valid values for the `memory` parameter.
     *
     * The CPU units cannot be less than 1 vCPU when you use Windows containers on Fargate.
     *
     * * 256 (.25 vCPU) - Available `memory` values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * * 512 (.5 vCPU) - Available `memory` values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4
     * GB)
     * * 1024 (1 vCPU) - Available `memory` values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5
     * GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * * 2048 (2 vCPU) - Available `memory` values: 4096 (4 GB) and 16384 (16 GB) in increments of
     * 1024 (1 GB)
     * * 4096 (4 vCPU) - Available `memory` values: 8192 (8 GB) and 30720 (30 GB) in increments of
     * 1024 (1 GB)
     * * 8192 (8 vCPU) - Available `memory` values: 16 GB and 60 GB in 4 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * * 16384 (16vCPU) - Available `memory` values: 32GB and 120 GB in 8 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
     * @param cpu The number of `cpu` units used by the task. 
     */
    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     * definition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS
     * container agent permission to make AWS API calls on your behalf.
     *
     * The task execution IAM role is required depending on the requirements of your task. For more
     * information, see [Amazon ECS task execution IAM
     * role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     * the Amazon ECS container agent permission to make AWS API calls on your behalf. 
     */
    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The name of a family that this task definition is registered to.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     *
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task
     * definition that you registered to a family a revision number of 1. Amazon ECS gives sequential
     * revision numbers to each task definition that you add.
     *
     *
     * To use revision numbers when you update a task definition, specify this property. If you
     * don't specify a value, AWS CloudFormation generates a new task definition each time that you
     * update it.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
     * @param family The name of a family that this task definition is registered to. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    override fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.let(IResolvable::unwrap))
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    override fun inferenceAccelerators(inferenceAccelerators: List<Any>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators)
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     * the task. 
     */
    override fun inferenceAccelerators(vararg inferenceAccelerators: Any): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * The valid values are `host` , `task` , or `none` . If `host` is specified, then all
     * containers within the tasks that specified the `host` IPC mode on the same container instance
     * share the same IPC resources with the host Amazon EC2 instance. If `task` is specified, all
     * containers within the specified task share the same IPC resources. If `none` is specified, then
     * IPC resources within the containers of a task are private and not shared with other containers
     * in a task or on the container instance. If no value is specified, then the IPC resource
     * namespace sharing depends on the Docker daemon setting on the container instance. For more
     * information, see [IPC
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#ipc-settings---ipc)
     * in the *Docker run reference* .
     *
     * If the `host` IPC mode is used, be aware that there is a heightened risk of undesired IPC
     * namespace expose. For more information, see [Docker
     * security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/) .
     *
     * If you are setting namespaced kernel parameters using `systemControls` for the containers in
     * the task, the following will apply to your IPC resource namespace. For more information, see
     * [System
     * Controls](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * * For tasks that use the `host` IPC mode, IPC namespace related `systemControls` are not
     * supported.
     * * For tasks that use the `task` IPC mode, IPC namespace related `systemControls` will apply
     * to all containers within a task.
     *
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode)
     * @param ipcMode The IPC resource namespace to use for the containers in the task. 
     */
    override fun ipcMode(ipcMode: String) {
      cdkBuilder.ipcMode(ipcMode)
    }

    /**
     * The amount (in MiB) of memory used by the task.
     *
     * If your tasks runs on Amazon EC2 instances, you must specify either a task-level memory value
     * or a container-level memory value. This field is optional and any value can be used. If a
     * task-level memory value is specified, the container-level memory value is optional. For more
     * information regarding container-level memory and memory reservation, see
     * [ContainerDefinition](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)
     * .
     *
     * If your tasks runs on AWS Fargate , this field is required. You must use one of the following
     * values. The value you choose determines your range of valid values for the `cpu` parameter.
     *
     * * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available `cpu` values: 256 (.25 vCPU)
     * * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available `cpu` values: 512 (.5 vCPU)
     * * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     * Available `cpu` values: 1024 (1 vCPU)
     * * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available `cpu`
     * values: 2048 (2 vCPU)
     * * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available `cpu`
     * values: 4096 (4 vCPU)
     * * Between 16 GB and 60 GB in 4 GB increments - Available `cpu` values: 8192 (8 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * * Between 32GB and 120 GB in 8 GB increments - Available `cpu` values: 16384 (16 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
     * @param memory The amount (in MiB) of memory used by the task. 
     */
    override fun memory(memory: String) {
      cdkBuilder.memory(memory)
    }

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are `none` , `bridge` , `awsvpc` , and `host` . If no network mode is
     * specified, the default is `bridge` .
     *
     * For Amazon ECS tasks on Fargate, the `awsvpc` network mode is required. For Amazon ECS tasks
     * on Amazon EC2 Linux instances, any network mode can be used. For Amazon ECS tasks on Amazon EC2
     * Windows instances, `&lt;default&gt;` or `awsvpc` can be used. If the network mode is set to
     * `none` , you cannot specify port mappings in your container definitions, and the tasks
     * containers do not have external connectivity. The `host` and `awsvpc` network modes offer the
     * highest networking performance for containers because they use the EC2 network stack instead of
     * the virtualized network stack provided by the `bridge` mode.
     *
     * With the `host` and `awsvpc` network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the `host` network mode) or the attached elastic network
     * interface port (for the `awsvpc` network mode), so you cannot take advantage of dynamic host
     * port mappings.
     *
     *
     * When using the `host` network mode, you should not run containers using the root user (UID
     * 0). It is considered best practice to use a non-root user.
     *
     *
     * If the network mode is `awsvpc` , the task is allocated an elastic network interface, and you
     * must specify a `NetworkConfiguration` value when you create a service or run a task with the
     * task definition. For more information, see [Task
     * Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * If the network mode is `host` , you cannot run multiple instantiations of the same task on a
     * single container instance when port mappings are used.
     *
     * For more information, see [Network
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#network-settings)
     * in the *Docker run reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
     * @param networkMode The Docker networking mode to use for the containers in the task. 
     */
    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    /**
     * The process namespace to use for the containers in the task.
     *
     * The valid values are `host` or `task` . On Fargate for Linux containers, the only valid value
     * is `task` . For example, monitoring sidecars might need `pidMode` to access information about
     * other containers running in the same task.
     *
     * If `host` is specified, all containers within the tasks that specified the `host` PID mode on
     * the same container instance share the same process namespace with the host Amazon EC2 instance.
     *
     * If `task` is specified, all containers within the specified task share the same process
     * namespace.
     *
     * If no value is specified, the default is a private namespace for each container. For more
     * information, see [PID
     * settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#pid-settings---pid)
     * in the *Docker run reference* .
     *
     * If the `host` PID mode is used, there's a heightened risk of undesired process namespace
     * exposure. For more information, see [Docker
     * security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/) .
     *
     *
     * This parameter is not supported for Windows containers. &gt; This parameter is only supported
     * for tasks that are hosted on AWS Fargate if the tasks are using platform version `1.4.0` or
     * later (Linux). This isn't supported for Windows containers on Fargate.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode)
     * @param pidMode The process namespace to use for the containers in the task. 
     */
    override fun pidMode(pidMode: String) {
      cdkBuilder.pidMode(pidMode)
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     * @param placementConstraints An array of placement constraint objects to use for tasks. 
     */
    override fun placementConstraints(vararg placementConstraints: Any): Unit =
        placementConstraints(placementConstraints.toList())

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    override fun proxyConfiguration(proxyConfiguration: IResolvable) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    override fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfigurationProperty::unwrap))
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or later,
     * they contain the required versions of the container agent and `ecs-init` . For more information,
     * see [Amazon ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     * @param proxyConfiguration The configuration details for the App Mesh proxy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    override
        fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = proxyConfiguration(ProxyConfigurationProperty(proxyConfiguration))

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see [Amazon
     * ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     * @param requiresCompatibilities The task launch types the task definition was validated
     * against. 
     */
    override fun requiresCompatibilities(requiresCompatibilities: List<String>) {
      cdkBuilder.requiresCompatibilities(requiresCompatibilities)
    }

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see [Amazon
     * ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     * @param requiresCompatibilities The task launch types the task definition was validated
     * against. 
     */
    override fun requiresCompatibilities(vararg requiresCompatibilities: String): Unit =
        requiresCompatibilities(requiresCompatibilities.toList())

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    override fun runtimePlatform(runtimePlatform: IResolvable) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
    }

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
    }

    /**
     * The operating system that your tasks definitions run on.
     *
     * A platform family is specified only for tasks using the Fargate launch type.
     *
     * When you specify a task definition in a service, this value must match the `runtimePlatform`
     * value of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-runtimeplatform)
     * @param runtimePlatform The operating system that your tasks definitions run on. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit): Unit
        = runtimePlatform(RuntimePlatformProperty(runtimePlatform))

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     * @param tags The metadata that you apply to the task definition to help you categorize and
     * organize them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     * @param tags The metadata that you apply to the task definition to help you categorize and
     * organize them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * role that grants containers in the task permission to call AWS APIs on your behalf.
     *
     * For more information, see [Amazon ECS Task
     * Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * IAM roles for tasks on Windows require that the `-EnableTaskIAMRole` option is set when you
     * launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration
     * code to use the feature. For more information, see [Windows IAM roles for
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
     * @param taskRoleArn The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management role that grants containers in the task permission to call AWS APIs on your
     * behalf. 
     */
    override fun taskRoleArn(taskRoleArn: String) {
      cdkBuilder.taskRoleArn(taskRoleArn)
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes)
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see [Using data volumes in
     * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     * @param volumes The list of data volume definitions for the task. 
     */
    override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnTaskDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition):
        CfnTaskDefinition = CfnTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinition):
        software.amazon.awscdk.services.ecs.CfnTaskDefinition = wrapped.cdkObject
  }

  /**
   * The authorization configuration details for the Amazon EFS file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * AuthorizationConfigProperty authorizationConfigProperty = AuthorizationConfigProperty.builder()
   * .accessPointId("accessPointId")
   * .iam("iam")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html)
   */
  public interface AuthorizationConfigProperty {
    /**
     * The Amazon EFS access point ID to use.
     *
     * If an access point is specified, the root directory value specified in the
     * `EFSVolumeConfiguration` must either be omitted or set to `/` which will enforce the path set on
     * the EFS access point. If an access point is used, transit encryption must be on in the
     * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
     * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon Elastic
     * File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html#cfn-ecs-taskdefinition-authorizationconfig-accesspointid)
     */
    public fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * Determines whether to use the Amazon ECS task role defined in a task definition when mounting
     * the Amazon EFS file system.
     *
     * If it is turned on, transit encryption must be turned on in the `EFSVolumeConfiguration` . If
     * this parameter is omitted, the default value of `DISABLED` is used. For more information, see
     * [Using Amazon EFS access
     * points](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html#cfn-ecs-taskdefinition-authorizationconfig-iam)
     */
    public fun iam(): String? = unwrap(this).getIam()

    /**
     * A builder for [AuthorizationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessPointId The Amazon EFS access point ID to use.
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which will enforce the path set
       * on the EFS access point. If an access point is used, transit encryption must be on in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun accessPointId(accessPointId: String)

      /**
       * @param iam Determines whether to use the Amazon ECS task role defined in a task definition
       * when mounting the Amazon EFS file system.
       * If it is turned on, transit encryption must be turned on in the `EFSVolumeConfiguration` .
       * If this parameter is omitted, the default value of `DISABLED` is used. For more information,
       * see [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun iam(iam: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.builder()

      /**
       * @param accessPointId The Amazon EFS access point ID to use.
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which will enforce the path set
       * on the EFS access point. If an access point is used, transit encryption must be on in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
      }

      /**
       * @param iam Determines whether to use the Amazon ECS task role defined in a task definition
       * when mounting the Amazon EFS file system.
       * If it is turned on, transit encryption must be turned on in the `EFSVolumeConfiguration` .
       * If this parameter is omitted, the default value of `DISABLED` is used. For more information,
       * see [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun iam(iam: String) {
        cdkBuilder.iam(iam)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty,
    ) : CdkObject(cdkObject), AuthorizationConfigProperty {
      /**
       * The Amazon EFS access point ID to use.
       *
       * If an access point is specified, the root directory value specified in the
       * `EFSVolumeConfiguration` must either be omitted or set to `/` which will enforce the path set
       * on the EFS access point. If an access point is used, transit encryption must be on in the
       * `EFSVolumeConfiguration` . For more information, see [Working with Amazon EFS access
       * points](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html#cfn-ecs-taskdefinition-authorizationconfig-accesspointid)
       */
      override fun accessPointId(): String? = unwrap(this).getAccessPointId()

      /**
       * Determines whether to use the Amazon ECS task role defined in a task definition when
       * mounting the Amazon EFS file system.
       *
       * If it is turned on, transit encryption must be turned on in the `EFSVolumeConfiguration` .
       * If this parameter is omitted, the default value of `DISABLED` is used. For more information,
       * see [Using Amazon EFS access
       * points](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html#efs-volume-accesspoints)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-authorizationconfig.html#cfn-ecs-taskdefinition-authorizationconfig-iam)
       */
      override fun iam(): String? = unwrap(this).getIam()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty):
          AuthorizationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthorizationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty
    }
  }

  /**
   * The `ContainerDefinition` property specifies a container definition.
   *
   * Container definitions are used in task definitions to describe the different containers that
   * are launched as part of a task.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
   * .image("image")
   * .name("name")
   * // the properties below are optional
   * .command(List.of("command"))
   * .cpu(123)
   * .credentialSpecs(List.of("credentialSpecs"))
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
  public interface ContainerDefinitionProperty {
    /**
     * The command that's passed to the container.
     *
     * This parameter maps to `Cmd` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
     * parameter to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . For more information, see
     * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
     * . If there are multiple arguments, each argument is a separated string in the array.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The number of `cpu` units reserved for the container.
     *
     * This parameter maps to `CpuShares` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--cpu-shares` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * This field is optional for tasks using the Fargate launch type, and the only requirement is
     * that the total amount of CPU reserved for all containers within a task be lower than the
     * task-level `cpu` value.
     *
     *
     * You can determine the number of CPU units that are available per EC2 instance type by
     * multiplying the vCPUs listed for that instance type on the [Amazon EC2
     * Instances](https://docs.aws.amazon.com/ec2/instance-types/) detail page by 1,024.
     *
     *
     * Linux containers share unallocated CPU units with other containers on the container instance
     * with the same ratio as their allocated amount. For example, if you run a single-container task
     * on a single-core instance type with 512 CPU units specified for that container, and that's the
     * only task running on the container instance, that container could use the full 1,024 CPU unit
     * share at any given time. However, if you launched another copy of the same task on that
     * container instance, each task is guaranteed a minimum of 512 CPU units when needed. Moreover,
     * each container could float to higher CPU usage if the other container was not using it. If both
     * tasks were 100% active all of the time, they would be limited to 512 CPU units.
     *
     * On Linux container instances, the Docker daemon on the container instance uses the CPU value
     * to calculate the relative CPU share ratios for running containers. For more information, see
     * [CPU share
     * constraint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#cpu-share-constraint)
     * in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows is
     * 2. However, the CPU parameter isn't required, and you can use CPU values below 2 in your
     * container definitions. For CPU values below 2 (including null), the behavior varies based on
     * your Amazon ECS container agent version:
     *
     * * *Agent versions less than or equal to 1.1.0:* Null and zero CPU values are passed to Docker
     * as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to Docker as 1,
     * which the Linux kernel converts to two CPU shares.
     * * *Agent versions greater than or equal to 1.2.0:* Null, zero, and CPU values of 1 are passed
     * to Docker as 2.
     *
     * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota.
     * Windows containers only have access to the specified amount of CPU that's described in the task
     * definition. A null or zero CPU value is passed to Docker as `0` , which Windows interprets as 1%
     * of one CPU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
     */
    public fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec` ) file that configures
     * the container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The maximum
     * number of ARNs is 1.
     *
     * There are two formats for each ARN.
     *
     * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide a
     * `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
     * login credentials to the domain in the secret.
     *
     * Each task that runs on any container instance can join different domains.
     *
     * You can use this format without joining the container instance to a domain.
     *
     * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
     * single domain.
     *
     * You must join the container instance to the domain before you start any tasks that use this
     * task definition.
     *
     * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
     *
     * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in AWS
     * Secrets Manager for a secret containing the username, password, and the domain to connect to.
     * For better security, the instance isn't joined to the domain for domainless authentication.
     * Other applications on the instance can't use the domainless credentials. You can use this
     * parameter to run tasks on the same instance, even it the tasks need to join different domains.
     * For more information, see [Using gMSAs for Windows
     * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
     * [Using gMSAs for Linux
     * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-credentialspecs)
     */
    public fun credentialSpecs(): List<String> = unwrap(this).getCredentialSpecs() ?: emptyList()

    /**
     * The dependencies defined for container startup and shutdown.
     *
     * A container can contain multiple dependencies. When a dependency is defined for container
     * startup, for container shutdown it is reversed.
     *
     * For tasks using the EC2 launch type, the container instances require at least version 1.26.0
     * of the container agent to turn on container dependencies. However, we recommend using the latest
     * container agent version. For information about checking your agent version and updating to the
     * latest version, see [Updating the Amazon ECS Container
     * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in the
     * *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon ECS-optimized
     * Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init` package. If your
     * container instances are launched from version `20190301` or later, then they contain the
     * required versions of the container agent and `ecs-init` . For more information, see [Amazon
     * ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     *
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * If the task definition is used in a blue/green deployment that uses
     * [AWS::CodeDeploy::DeploymentGroup
     * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
     * , the `dependsOn` parameter is not supported. For more information see [Issue
     * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
     * on the on the GitHub website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dependson)
     */
    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    /**
     * When this parameter is true, networking is off within the container.
     *
     * This parameter maps to `NetworkDisabled` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
     */
    public fun disableNetworking(): Any? = unwrap(this).getDisableNetworking()

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * This parameter maps to `DnsSearch` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--dns-search` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
     */
    public fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?: emptyList()

    /**
     * A list of DNS servers that are presented to the container.
     *
     * This parameter maps to `Dns` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
     */
    public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    /**
     * A key/value map of labels to add to the container.
     *
     * This parameter maps to `Labels` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels)
     */
    public fun dockerLabels(): Any? = unwrap(this).getDockerLabels()

    /**
     * A list of strings to provide custom configuration for multiple security systems.
     *
     * For more information about valid values, see [Docker Run Security
     * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . This field isn't valid for containers in tasks using the Fargate launch type.
     *
     * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux and
     * AppArmor multi-level security systems.
     *
     * For any tasks on EC2, this parameter can be used to reference a credential spec file that
     * configures a container for Active Directory authentication. For more information, see [Using
     * gMSAs for Windows
     * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
     * [Using gMSAs for Linux
     * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * This parameter maps to `SecurityOpt` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--security-opt` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * The Amazon ECS container agent running on a container instance must register with the
     * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
     * containers placed on that instance can use these security options. For more information, see
     * [Amazon ECS Container Agent
     * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * For more information about valid values, see [Docker Run Security
     * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
     * "credentialspec:CredentialSpecFilePath"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
     */
    public fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions() ?:
        emptyList()

    /**
     * Early versions of the Amazon ECS container agent don't properly handle `entryPoint`
     * parameters.
     *
     * If you have problems using `entryPoint` , update your container agent or enter your commands
     * and arguments as `command` array items instead.
     *
     * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
     * [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--entrypoint` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . For more information, see
     * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
     */
    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    /**
     * The environment variables to pass to a container.
     *
     * This parameter maps to `Env` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * We don't recommend that you use plaintext environment variables for sensitive information,
     * such as credential data.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-environment)
     */
    public fun environment(): Any? = unwrap(this).getEnvironment()

    /**
     * A list of files containing the environment variables to pass to a container.
     *
     * This parameter maps to the `--env-file` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * You can specify up to ten environment files. The file must have a `.env` file extension. Each
     * line in an environment file contains an environment variable in `VARIABLE=VALUE` format. Lines
     * beginning with `#` are treated as comments and are ignored. For more information about the
     * environment variable file syntax, see [Declare default environment variables in
     * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
     *
     * If there are environment variables specified using the `environment` parameter in a container
     * definition, they take precedence over the variables contained within an environment file. If
     * multiple environment files are specified that contain the same variable, they're processed from
     * the top down. We recommend that you use unique variable names. For more information, see
     * [Specifying Environment
     * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-environmentfiles)
     */
    public fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

    /**
     * If the `essential` parameter of a container is marked as `true` , and that container fails or
     * stops for any reason, all other containers that are part of the task are stopped.
     *
     * If the `essential` parameter of a container is marked as `false` , its failure doesn't affect
     * the rest of the containers in a task. If this parameter is omitted, a container is assumed to be
     * essential.
     *
     * All tasks must have at least one essential container. If you have an application that's
     * composed of multiple containers, group containers that are used for a common purpose into
     * components, and separate the different components into multiple task definitions. For more
     * information, see [Application
     * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-essential)
     */
    public fun essential(): Any? = unwrap(this).getEssential()

    /**
     * A list of hostnames and IP address mappings to append to the `/etc/hosts` file on the
     * container.
     *
     * This parameter maps to `ExtraHosts` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--add-host`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter isn't supported for Windows containers or tasks that use the `awsvpc` network
     * mode.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
     */
    public fun extraHosts(): Any? = unwrap(this).getExtraHosts()

    /**
     * The FireLens configuration for the container.
     *
     * This is used to specify and configure a log router for container logs. For more information,
     * see [Custom Log
     * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-firelensconfiguration)
     */
    public fun firelensConfiguration(): Any? = unwrap(this).getFirelensConfiguration()

    /**
     * The container health check command and associated configuration parameters for the container.
     *
     * This parameter maps to `HealthCheck` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `HEALTHCHECK` parameter of [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-healthcheck)
     */
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The hostname to use for your container.
     *
     * This parameter maps to `Hostname` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--hostname`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * The `hostname` parameter is not supported if you're using the `awsvpc` network mode.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
     */
    public fun hostname(): String? = unwrap(this).getHostname()

    /**
     * The image used to start a container.
     *
     * This string is passed directly to the Docker daemon. By default, images in the Docker Hub
     * registry are available. Other repositories are specified with either `*repository-url* / *image*
     * : *tag*` or `*repository-url* / *image* &#64; *digest*` . Up to 255 letters (uppercase and
     * lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number signs
     * are allowed. This parameter maps to `Image` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `IMAGE`
     * parameter of [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * * When a new task starts, the Amazon ECS container agent pulls the latest version of the
     * specified image and tag for the container to use. However, subsequent updates to a repository
     * image aren't propagated to already running tasks.
     * * Images in Amazon ECR repositories can be specified by either using the full
     * `registry/repository:tag` or `registry/repository&#64;digest` . For example,
     * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest` or
     * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE`
     * .
     * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
     * `mongo` ).
     * * Images in other repositories on Docker Hub are qualified with an organization name (for
     * example, `amazon/amazon-ecs-agent` ).
     * * Images in other online repositories are qualified further by a domain name (for example,
     * `quay.io/assemblyline/ubuntu` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-image)
     */
    public fun image(): String

    /**
     * When this parameter is `true` , you can deploy containerized applications that require
     * `stdin` or a `tty` to be allocated.
     *
     * This parameter maps to `OpenStdin` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--interactive` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
     */
    public fun interactive(): Any? = unwrap(this).getInteractive()

    /**
     * The `links` parameter allows containers to communicate with each other without the need for
     * port mappings.
     *
     * This parameter is only supported if the network mode of a task definition is `bridge` . The
     * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
     * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
     * about linking Docker containers, go to [Legacy container
     * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
     * documentation. This parameter maps to `Links` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter is not supported for Windows containers. &gt; Containers that are collocated
     * on a single container instance may be able to communicate with each other without requiring
     * links or host port mappings. Network isolation is achieved on the container instance using
     * security groups and VPC settings.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-links)
     */
    public fun links(): List<String> = unwrap(this).getLinks() ?: emptyList()

    /**
     * Linux-specific modifications that are applied to the container, such as Linux kernel
     * capabilities. For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
     * .
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
     */
    public fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

    /**
     * The log configuration specification for the container.
     *
     * This parameter maps to `LogConfig` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--log-driver` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
     * containers use the same logging driver that the Docker daemon uses. However, the container may
     * use a different logging driver than the Docker daemon by specifying a log driver with this
     * parameter in the container definition. To use a different logging driver for a container, the
     * log system must be configured properly on the container instance (or on a different log server
     * for remote logging options). For more information on the options for different supported log
     * drivers, see [Configure logging
     * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/) in
     * the Docker documentation.
     *
     *
     * Amazon ECS currently supports a subset of the logging drivers available to the Docker daemon
     * (shown in the
     * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
     * data type). Additional log drivers may be available in future releases of the Amazon ECS
     * container agent.
     *
     *
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     *
     * The Amazon ECS container agent running on a container instance must register the logging
     * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment variable
     * before containers placed on that instance can use these log configuration options. For more
     * information, see [Amazon ECS Container Agent
     * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
     */
    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the memory specified here, the container is killed. The
     * total amount of memory reserved for all containers within a task must be lower than the task
     * `memory` value, if one is specified. This parameter maps to `Memory` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--memory`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * If using the Fargate launch type, this parameter is optional.
     *
     * If using the EC2 launch type, you must specify either a task-level memory value or a
     * container-level memory value. If you specify both a container-level `memory` and
     * `memoryReservation` value, `memory` must be greater than `memoryReservation` . If you specify
     * `memoryReservation` , then that value is subtracted from the available memory resources for the
     * container instance where the container is placed. Otherwise, the value of `memory` is used.
     *
     * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container, so
     * you should not specify fewer than 6 MiB of memory for your containers.
     *
     * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
     * container, so you should not specify fewer than 4 MiB of memory for your containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-memory)
     */
    public fun memory(): Number? = unwrap(this).getMemory()

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under heavy contention, Docker attempts to keep the container memory to
     * this soft limit. However, your container can consume more memory when it needs to, up to either
     * the hard limit specified with the `memory` parameter (if applicable), or all of the available
     * memory on the container instance, whichever comes first. This parameter maps to
     * `MemoryReservation` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--memory-reservation` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * If a task-level memory value is not specified, you must specify a non-zero integer for one or
     * both of `memory` or `memoryReservation` in a container definition. If you specify both, `memory`
     * must be greater than `memoryReservation` . If you specify `memoryReservation` , then that value
     * is subtracted from the available memory resources for the container instance where the container
     * is placed. Otherwise, the value of `memory` is used.
     *
     * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to
     * 256 MiB of memory for short periods of time, you can set a `memoryReservation` of 128 MiB, and a
     * `memory` hard limit of 300 MiB. This configuration would allow the container to only reserve 128
     * MiB of memory from the remaining resources on the container instance, but also allow the
     * container to consume more memory resources when needed.
     *
     * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container. So,
     * don't specify less than 6 MiB of memory for your containers.
     *
     * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
     * container. So, don't specify less than 4 MiB of memory for your containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
     */
    public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

    /**
     * The mount points for data volumes in your container.
     *
     * This parameter maps to `Volumes` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be across
     * drives.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
     */
    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    /**
     * The name of a container.
     *
     * If you're linking multiple containers together in a task definition, the `name` of one
     * container can be entered in the `links` of another container to connect the containers. Up to
     * 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. This
     * parameter maps to `name` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--name`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-name)
     */
    public fun name(): String

    /**
     * The list of port mappings for the container.
     *
     * Port mappings allow containers to access ports on the host container instance to send or
     * receive traffic.
     *
     * For task definitions that use the `awsvpc` network mode, you should only specify the
     * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
     * `containerPort` .
     *
     * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There is
     * no loopback for port mappings on Windows, so you cannot access a container's mapped port from
     * the host itself.
     *
     * This parameter maps to `PortBindings` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--publish`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the network
     * mode of a task definition is set to `none` , then you can't specify port mappings. If the
     * network mode of a task definition is set to `host` , then host ports must either be undefined or
     * they must match the container port in the port mapping.
     *
     *
     * After a task reaches the `RUNNING` status, manual and automatic host and container port
     * assignments are visible in the *Network Bindings* section of a container description for a
     * selected task in the Amazon ECS console. The assignments are also visible in the
     * `networkBindings` section
     * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * responses.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
     */
    public fun portMappings(): Any? = unwrap(this).getPortMappings()

    /**
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the `root` user).
     *
     * This parameter maps to `Privileged` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--privileged` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
     */
    public fun privileged(): Any? = unwrap(this).getPrivileged()

    /**
     * When this parameter is `true` , a TTY is allocated.
     *
     * This parameter maps to `Tty` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-pseudoterminal)
     */
    public fun pseudoTerminal(): Any? = unwrap(this).getPseudoTerminal()

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * This parameter maps to `ReadonlyRootfs` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--read-only` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
     */
    public fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * The private repository authentication credentials to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-repositorycredentials)
     */
    public fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

    /**
     * The type and amount of a resource to assign to a container.
     *
     * The only supported resource is a GPU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-resourcerequirements)
     */
    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    /**
     * The secrets to pass to the container.
     *
     * For more information, see [Specifying Sensitive
     * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-secrets)
     */
    public fun secrets(): Any? = unwrap(this).getSecrets()

    /**
     * Time duration (in seconds) to wait before giving up on resolving dependencies for a
     * container.
     *
     * For example, you specify two containers in a task definition with containerA having a
     * dependency on containerB reaching a `COMPLETE` , `SUCCESS` , or `HEALTHY` status. If a
     * `startTimeout` value is specified for containerB and it doesn't reach the desired status within
     * that time then containerA gives up and not start. This results in the task transitioning to a
     * `STOPPED` state.
     *
     *
     * When the `ECS_CONTAINER_START_TIMEOUT` container agent configuration variable is used, it's
     * enforced independently from this start timeout value.
     *
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     *
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * For tasks using the EC2 launch type, your container instances require at least version
     * `1.26.0` of the container agent to use a container start timeout value. However, we recommend
     * using the latest container agent version. For information about checking your agent version and
     * updating to the latest version, see [Updating the Amazon ECS Container
     * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in the
     * *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon ECS-optimized
     * Linux AMI, your instance needs at least version `1.26.0-1` of the `ecs-init` package. If your
     * container instances are launched from version `20190301` or later, then they contain the
     * required versions of the container agent and `ecs-init` . For more information, see [Amazon
     * ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * The valid values are 2-120 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-starttimeout)
     */
    public fun startTimeout(): Number? = unwrap(this).getStartTimeout()

    /**
     * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
     * exit normally on its own.
     *
     * For tasks using the Fargate launch type, the task or service requires the following
     * platforms:
     *
     * * Linux platform version `1.3.0` or later.
     * * Windows platform version `1.0.0` or later.
     *
     * The max stop timeout value is 120 seconds and if the parameter is not specified, the default
     * value of 30 seconds is used.
     *
     * For tasks that use the EC2 launch type, if the `stopTimeout` parameter isn't specified, the
     * value set for the Amazon ECS container agent configuration variable `ECS_CONTAINER_STOP_TIMEOUT`
     * is used. If neither the `stopTimeout` parameter or the `ECS_CONTAINER_STOP_TIMEOUT` agent
     * configuration variable are set, then the default values of 30 seconds for Linux containers and
     * 30 seconds on Windows containers are used. Your container instances require at least version
     * 1.26.0 of the container agent to use a container stop timeout value. However, we recommend using
     * the latest container agent version. For information about checking your agent version and
     * updating to the latest version, see [Updating the Amazon ECS Container
     * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in the
     * *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon ECS-optimized
     * Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init` package. If your
     * container instances are launched from version `20190301` or later, then they contain the
     * required versions of the container agent and `ecs-init` . For more information, see [Amazon
     * ECS-optimized Linux
     * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * The valid values are 2-120 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-stoptimeout)
     */
    public fun stopTimeout(): Number? = unwrap(this).getStopTimeout()

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * This parameter maps to `Sysctls` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer lived
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-systemcontrols)
     */
    public fun systemControls(): Any? = unwrap(this).getSystemControls()

    /**
     * A list of `ulimits` to set in the container.
     *
     * This parameter maps to `Ulimits` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
     * values are displayed in the
     * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
     * This parameter requires version 1.18 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
     */
    public fun ulimits(): Any? = unwrap(this).getUlimits()

    /**
     * The user to use inside the container.
     *
     * This parameter maps to `User` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--user`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * When running tasks using the `host` network mode, don't run containers using the root user
     * (UID 0). We recommend using a non-root user for better security.
     *
     *
     * You can specify the `user` using the following formats. If specifying a UID or GID, you must
     * specify it as a positive integer.
     *
     * * `user`
     * * `user:group`
     * * `uid`
     * * `uid:gid`
     * * `user:gid`
     * * `uid:group`
     *
     *
     * This parameter is not supported for Windows containers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-user)
     */
    public fun user(): String? = unwrap(this).getUser()

    /**
     * Data volumes to mount from another container.
     *
     * This parameter maps to `VolumesFrom` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
     * `--volumes-from` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
     */
    public fun volumesFrom(): Any? = unwrap(this).getVolumesFrom()

    /**
     * The working directory to run commands inside the container in.
     *
     * This parameter maps to `WorkingDir` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--workdir`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
     */
    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    /**
     * A builder for [ContainerDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * . If there are multiple arguments, each argument is a separated string in the array.
       */
      public fun command(command: List<String>)

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * . If there are multiple arguments, each argument is a separated string in the array.
       */
      public fun command(vararg command: String)

      /**
       * @param cpu The number of `cpu` units reserved for the container.
       * This parameter maps to `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * This field is optional for tasks using the Fargate launch type, and the only requirement is
       * that the total amount of CPU reserved for all containers within a task be lower than the
       * task-level `cpu` value.
       *
       *
       * You can determine the number of CPU units that are available per EC2 instance type by
       * multiplying the vCPUs listed for that instance type on the [Amazon EC2
       * Instances](https://docs.aws.amazon.com/ec2/instance-types/) detail page by 1,024.
       *
       *
       * Linux containers share unallocated CPU units with other containers on the container
       * instance with the same ratio as their allocated amount. For example, if you run a
       * single-container task on a single-core instance type with 512 CPU units specified for that
       * container, and that's the only task running on the container instance, that container could
       * use the full 1,024 CPU unit share at any given time. However, if you launched another copy of
       * the same task on that container instance, each task is guaranteed a minimum of 512 CPU units
       * when needed. Moreover, each container could float to higher CPU usage if the other container
       * was not using it. If both tasks were 100% active all of the time, they would be limited to 512
       * CPU units.
       *
       * On Linux container instances, the Docker daemon on the container instance uses the CPU
       * value to calculate the relative CPU share ratios for running containers. For more information,
       * see [CPU share
       * constraint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#cpu-share-constraint)
       * in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows is
       * 2. However, the CPU parameter isn't required, and you can use CPU values below 2 in your
       * container definitions. For CPU values below 2 (including null), the behavior varies based on
       * your Amazon ECS container agent version:
       *
       * * *Agent versions less than or equal to 1.1.0:* Null and zero CPU values are passed to
       * Docker as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to
       * Docker as 1, which the Linux kernel converts to two CPU shares.
       * * *Agent versions greater than or equal to 1.2.0:* Null, zero, and CPU values of 1 are
       * passed to Docker as 2.
       *
       * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota.
       * Windows containers only have access to the specified amount of CPU that's described in the
       * task definition. A null or zero CPU value is passed to Docker as `0` , which Windows
       * interprets as 1% of one CPU.
       */
      public fun cpu(cpu: Number)

      /**
       * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec`
       * ) file that configures the container for Active Directory authentication.
       * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The
       * maximum number of ARNs is 1.
       *
       * There are two formats for each ARN.
       *
       * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide
       * a `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
       * login credentials to the domain in the secret.
       *
       * Each task that runs on any container instance can join different domains.
       *
       * You can use this format without joining the container instance to a domain.
       *
       * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
       * single domain.
       *
       * You must join the container instance to the domain before you start any tasks that use this
       * task definition.
       *
       * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
       *
       * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in
       * AWS Secrets Manager for a secret containing the username, password, and the domain to connect
       * to. For better security, the instance isn't joined to the domain for domainless
       * authentication. Other applications on the instance can't use the domainless credentials. You
       * can use this parameter to run tasks on the same instance, even it the tasks need to join
       * different domains. For more information, see [Using gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
       */
      public fun credentialSpecs(credentialSpecs: List<String>)

      /**
       * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec`
       * ) file that configures the container for Active Directory authentication.
       * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The
       * maximum number of ARNs is 1.
       *
       * There are two formats for each ARN.
       *
       * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide
       * a `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
       * login credentials to the domain in the secret.
       *
       * Each task that runs on any container instance can join different domains.
       *
       * You can use this format without joining the container instance to a domain.
       *
       * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
       * single domain.
       *
       * You must join the container instance to the domain before you start any tasks that use this
       * task definition.
       *
       * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
       *
       * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in
       * AWS Secrets Manager for a secret containing the username, password, and the domain to connect
       * to. For better security, the instance isn't joined to the domain for domainless
       * authentication. Other applications on the instance can't use the domainless credentials. You
       * can use this parameter to run tasks on the same instance, even it the tasks need to join
       * different domains. For more information, see [Using gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
       */
      public fun credentialSpecs(vararg credentialSpecs: String)

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      public fun dependsOn(dependsOn: IResolvable)

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      public fun dependsOn(dependsOn: List<Any>)

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      public fun dependsOn(vararg dependsOn: Any)

      /**
       * @param disableNetworking When this parameter is true, networking is off within the
       * container.
       * This parameter maps to `NetworkDisabled` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun disableNetworking(disableNetworking: Boolean)

      /**
       * @param disableNetworking When this parameter is true, networking is off within the
       * container.
       * This parameter maps to `NetworkDisabled` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun disableNetworking(disableNetworking: IResolvable)

      /**
       * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
       * This parameter maps to `DnsSearch` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--dns-search` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun dnsSearchDomains(dnsSearchDomains: List<String>)

      /**
       * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
       * This parameter maps to `DnsSearch` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--dns-search` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun dnsSearchDomains(vararg dnsSearchDomains: String)

      /**
       * @param dnsServers A list of DNS servers that are presented to the container.
       * This parameter maps to `Dns` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun dnsServers(dnsServers: List<String>)

      /**
       * @param dnsServers A list of DNS servers that are presented to the container.
       * This parameter maps to `Dns` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun dnsServers(vararg dnsServers: String)

      /**
       * @param dockerLabels A key/value map of labels to add to the container.
       * This parameter maps to `Labels` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun dockerLabels(dockerLabels: IResolvable)

      /**
       * @param dockerLabels A key/value map of labels to add to the container.
       * This parameter maps to `Labels` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun dockerLabels(dockerLabels: Map<String, String>)

      /**
       * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
       * security systems.
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This field isn't valid for containers in tasks using the Fargate launch type.
       *
       * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux
       * and AppArmor multi-level security systems.
       *
       * For any tasks on EC2, this parameter can be used to reference a credential spec file that
       * configures a container for Active Directory authentication. For more information, see [Using
       * gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * This parameter maps to `SecurityOpt` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--security-opt` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The Amazon ECS container agent running on a container instance must register with the
       * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
       * containers placed on that instance can use these security options. For more information, see
       * [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
       * "credentialspec:CredentialSpecFilePath"
       */
      public fun dockerSecurityOptions(dockerSecurityOptions: List<String>)

      /**
       * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
       * security systems.
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This field isn't valid for containers in tasks using the Fargate launch type.
       *
       * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux
       * and AppArmor multi-level security systems.
       *
       * For any tasks on EC2, this parameter can be used to reference a credential spec file that
       * configures a container for Active Directory authentication. For more information, see [Using
       * gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * This parameter maps to `SecurityOpt` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--security-opt` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The Amazon ECS container agent running on a container instance must register with the
       * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
       * containers placed on that instance can use these security options. For more information, see
       * [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
       * "credentialspec:CredentialSpecFilePath"
       */
      public fun dockerSecurityOptions(vararg dockerSecurityOptions: String)

      /**
       * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
       * `entryPoint` parameters.
       * If you have problems using `entryPoint` , update your container agent or enter your
       * commands and arguments as `command` array items instead.
       *
       * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--entrypoint` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * .
       */
      public fun entryPoint(entryPoint: List<String>)

      /**
       * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
       * `entryPoint` parameters.
       * If you have problems using `entryPoint` , update your container agent or enter your
       * commands and arguments as `command` array items instead.
       *
       * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--entrypoint` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * .
       */
      public fun entryPoint(vararg entryPoint: String)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      public fun environment(environment: IResolvable)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      public fun environment(environment: List<Any>)

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      public fun environment(vararg environment: Any)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun environmentFiles(environmentFiles: IResolvable)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun environmentFiles(environmentFiles: List<Any>)

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun environmentFiles(vararg environmentFiles: Any)

      /**
       * @param essential If the `essential` parameter of a container is marked as `true` , and that
       * container fails or stops for any reason, all other containers that are part of the task are
       * stopped.
       * If the `essential` parameter of a container is marked as `false` , its failure doesn't
       * affect the rest of the containers in a task. If this parameter is omitted, a container is
       * assumed to be essential.
       *
       * All tasks must have at least one essential container. If you have an application that's
       * composed of multiple containers, group containers that are used for a common purpose into
       * components, and separate the different components into multiple task definitions. For more
       * information, see [Application
       * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun essential(essential: Boolean)

      /**
       * @param essential If the `essential` parameter of a container is marked as `true` , and that
       * container fails or stops for any reason, all other containers that are part of the task are
       * stopped.
       * If the `essential` parameter of a container is marked as `false` , its failure doesn't
       * affect the rest of the containers in a task. If this parameter is omitted, a container is
       * assumed to be essential.
       *
       * All tasks must have at least one essential container. If you have an application that's
       * composed of multiple containers, group containers that are used for a common purpose into
       * components, and separate the different components into multiple task definitions. For more
       * information, see [Application
       * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun essential(essential: IResolvable)

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      public fun extraHosts(extraHosts: IResolvable)

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      public fun extraHosts(extraHosts: List<Any>)

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      public fun extraHosts(vararg extraHosts: Any)

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun firelensConfiguration(firelensConfiguration: IResolvable)

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty)

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      public
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit)

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun healthCheck(healthCheck: IResolvable)

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun healthCheck(healthCheck: HealthCheckProperty)

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

      /**
       * @param hostname The hostname to use for your container.
       * This parameter maps to `Hostname` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--hostname` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The `hostname` parameter is not supported if you're using the `awsvpc` network mode.
       */
      public fun hostname(hostname: String)

      /**
       * @param image The image used to start a container. 
       * This string is passed directly to the Docker daemon. By default, images in the Docker Hub
       * registry are available. Other repositories are specified with either `*repository-url* /
       * *image* : *tag*` or `*repository-url* / *image* &#64; *digest*` . Up to 255 letters (uppercase
       * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
       * signs are allowed. This parameter maps to `Image` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * * When a new task starts, the Amazon ECS container agent pulls the latest version of the
       * specified image and tag for the container to use. However, subsequent updates to a repository
       * image aren't propagated to already running tasks.
       * * Images in Amazon ECR repositories can be specified by either using the full
       * `registry/repository:tag` or `registry/repository&#64;digest` . For example,
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest` or
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE`
       * .
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       */
      public fun image(image: String)

      /**
       * @param interactive When this parameter is `true` , you can deploy containerized
       * applications that require `stdin` or a `tty` to be allocated.
       * This parameter maps to `OpenStdin` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--interactive` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun interactive(interactive: Boolean)

      /**
       * @param interactive When this parameter is `true` , you can deploy containerized
       * applications that require `stdin` or a `tty` to be allocated.
       * This parameter maps to `OpenStdin` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--interactive` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun interactive(interactive: IResolvable)

      /**
       * @param links The `links` parameter allows containers to communicate with each other without
       * the need for port mappings.
       * This parameter is only supported if the network mode of a task definition is `bridge` . The
       * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
       * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
       * about linking Docker containers, go to [Legacy container
       * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
       * documentation. This parameter maps to `Links` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers. &gt; Containers that are collocated
       * on a single container instance may be able to communicate with each other without requiring
       * links or host port mappings. Network isolation is achieved on the container instance using
       * security groups and VPC settings.
       */
      public fun links(links: List<String>)

      /**
       * @param links The `links` parameter allows containers to communicate with each other without
       * the need for port mappings.
       * This parameter is only supported if the network mode of a task definition is `bridge` . The
       * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
       * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
       * about linking Docker containers, go to [Legacy container
       * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
       * documentation. This parameter maps to `Links` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers. &gt; Containers that are collocated
       * on a single container instance may be able to communicate with each other without requiring
       * links or host port mappings. Network isolation is achieved on the container instance using
       * security groups and VPC settings.
       */
      public fun links(vararg links: String)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      public fun linuxParameters(linuxParameters: IResolvable)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      public fun linuxParameters(linuxParameters: LinuxParametersProperty)

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun logConfiguration(logConfiguration: IResolvable)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param memory The amount (in MiB) of memory to present to the container.
       * If your container attempts to exceed the memory specified here, the container is killed.
       * The total amount of memory reserved for all containers within a task must be lower than the
       * task `memory` value, if one is specified. This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If using the Fargate launch type, this parameter is optional.
       *
       * If using the EC2 launch type, you must specify either a task-level memory value or a
       * container-level memory value. If you specify both a container-level `memory` and
       * `memoryReservation` value, `memory` must be greater than `memoryReservation` . If you specify
       * `memoryReservation` , then that value is subtracted from the available memory resources for
       * the container instance where the container is placed. Otherwise, the value of `memory` is
       * used.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container,
       * so you should not specify fewer than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container, so you should not specify fewer than 4 MiB of memory for your containers.
       */
      public fun memory(memory: Number)

      /**
       * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
       * When system memory is under heavy contention, Docker attempts to keep the container memory
       * to this soft limit. However, your container can consume more memory when it needs to, up to
       * either the hard limit specified with the `memory` parameter (if applicable), or all of the
       * available memory on the container instance, whichever comes first. This parameter maps to
       * `MemoryReservation` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--memory-reservation` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If a task-level memory value is not specified, you must specify a non-zero integer for one
       * or both of `memory` or `memoryReservation` in a container definition. If you specify both,
       * `memory` must be greater than `memoryReservation` . If you specify `memoryReservation` , then
       * that value is subtracted from the available memory resources for the container instance where
       * the container is placed. Otherwise, the value of `memory` is used.
       *
       * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to
       * 256 MiB of memory for short periods of time, you can set a `memoryReservation` of 128 MiB, and
       * a `memory` hard limit of 300 MiB. This configuration would allow the container to only reserve
       * 128 MiB of memory from the remaining resources on the container instance, but also allow the
       * container to consume more memory resources when needed.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container.
       * So, don't specify less than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container. So, don't specify less than 4 MiB of memory for your containers.
       */
      public fun memoryReservation(memoryReservation: Number)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      public fun mountPoints(mountPoints: IResolvable)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      public fun mountPoints(mountPoints: List<Any>)

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      public fun mountPoints(vararg mountPoints: Any)

      /**
       * @param name The name of a container. 
       * If you're linking multiple containers together in a task definition, the `name` of one
       * container can be entered in the `links` of another container to connect the containers. Up to
       * 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. This
       * parameter maps to `name` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--name`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun name(name: String)

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      public fun portMappings(portMappings: IResolvable)

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      public fun portMappings(portMappings: List<Any>)

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      public fun portMappings(vararg portMappings: Any)

      /**
       * @param privileged When this parameter is true, the container is given elevated privileges
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
       */
      public fun privileged(privileged: Boolean)

      /**
       * @param privileged When this parameter is true, the container is given elevated privileges
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
       */
      public fun privileged(privileged: IResolvable)

      /**
       * @param pseudoTerminal When this parameter is `true` , a TTY is allocated.
       * This parameter maps to `Tty` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun pseudoTerminal(pseudoTerminal: Boolean)

      /**
       * @param pseudoTerminal When this parameter is `true` , a TTY is allocated.
       * This parameter maps to `Tty` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun pseudoTerminal(pseudoTerminal: IResolvable)

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--read-only` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--read-only` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      public fun repositoryCredentials(repositoryCredentials: IResolvable)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty)

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(resourceRequirements: IResolvable)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(resourceRequirements: List<Any>)

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      public fun resourceRequirements(vararg resourceRequirements: Any)

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secrets(secrets: IResolvable)

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secrets(secrets: List<Any>)

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secrets(vararg secrets: Any)

      /**
       * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
       * dependencies for a container.
       * For example, you specify two containers in a task definition with containerA having a
       * dependency on containerB reaching a `COMPLETE` , `SUCCESS` , or `HEALTHY` status. If a
       * `startTimeout` value is specified for containerB and it doesn't reach the desired status
       * within that time then containerA gives up and not start. This results in the task
       * transitioning to a `STOPPED` state.
       *
       *
       * When the `ECS_CONTAINER_START_TIMEOUT` container agent configuration variable is used, it's
       * enforced independently from this start timeout value.
       *
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * For tasks using the EC2 launch type, your container instances require at least version
       * `1.26.0` of the container agent to use a container start timeout value. However, we recommend
       * using the latest container agent version. For information about checking your agent version
       * and updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version `1.26.0-1` of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       */
      public fun startTimeout(startTimeout: Number)

      /**
       * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
       * killed if it doesn't exit normally on its own.
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * The max stop timeout value is 120 seconds and if the parameter is not specified, the
       * default value of 30 seconds is used.
       *
       * For tasks that use the EC2 launch type, if the `stopTimeout` parameter isn't specified, the
       * value set for the Amazon ECS container agent configuration variable
       * `ECS_CONTAINER_STOP_TIMEOUT` is used. If neither the `stopTimeout` parameter or the
       * `ECS_CONTAINER_STOP_TIMEOUT` agent configuration variable are set, then the default values of
       * 30 seconds for Linux containers and 30 seconds on Windows containers are used. Your container
       * instances require at least version 1.26.0 of the container agent to use a container stop
       * timeout value. However, we recommend using the latest container agent version. For information
       * about checking your agent version and updating to the latest version, see [Updating the Amazon
       * ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       */
      public fun stopTimeout(stopTimeout: Number)

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      public fun systemControls(systemControls: IResolvable)

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      public fun systemControls(systemControls: List<Any>)

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      public fun systemControls(vararg systemControls: Any)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun ulimits(ulimits: IResolvable)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun ulimits(ulimits: List<Any>)

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun ulimits(vararg ulimits: Any)

      /**
       * @param user The user to use inside the container.
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * When running tasks using the `host` network mode, don't run containers using the root user
       * (UID 0). We recommend using a non-root user for better security.
       *
       *
       * You can specify the `user` using the following formats. If specifying a UID or GID, you
       * must specify it as a positive integer.
       *
       * * `user`
       * * `user:group`
       * * `uid`
       * * `uid:gid`
       * * `user:gid`
       * * `uid:group`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      public fun user(user: String)

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun volumesFrom(volumesFrom: IResolvable)

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun volumesFrom(volumesFrom: List<Any>)

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun volumesFrom(vararg volumesFrom: Any)

      /**
       * @param workingDirectory The working directory to run commands inside the container in.
       * This parameter maps to `WorkingDir` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--workdir` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.builder()

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * . If there are multiple arguments, each argument is a separated string in the array.
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command The command that's passed to the container.
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * . If there are multiple arguments, each argument is a separated string in the array.
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param cpu The number of `cpu` units reserved for the container.
       * This parameter maps to `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * This field is optional for tasks using the Fargate launch type, and the only requirement is
       * that the total amount of CPU reserved for all containers within a task be lower than the
       * task-level `cpu` value.
       *
       *
       * You can determine the number of CPU units that are available per EC2 instance type by
       * multiplying the vCPUs listed for that instance type on the [Amazon EC2
       * Instances](https://docs.aws.amazon.com/ec2/instance-types/) detail page by 1,024.
       *
       *
       * Linux containers share unallocated CPU units with other containers on the container
       * instance with the same ratio as their allocated amount. For example, if you run a
       * single-container task on a single-core instance type with 512 CPU units specified for that
       * container, and that's the only task running on the container instance, that container could
       * use the full 1,024 CPU unit share at any given time. However, if you launched another copy of
       * the same task on that container instance, each task is guaranteed a minimum of 512 CPU units
       * when needed. Moreover, each container could float to higher CPU usage if the other container
       * was not using it. If both tasks were 100% active all of the time, they would be limited to 512
       * CPU units.
       *
       * On Linux container instances, the Docker daemon on the container instance uses the CPU
       * value to calculate the relative CPU share ratios for running containers. For more information,
       * see [CPU share
       * constraint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#cpu-share-constraint)
       * in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows is
       * 2. However, the CPU parameter isn't required, and you can use CPU values below 2 in your
       * container definitions. For CPU values below 2 (including null), the behavior varies based on
       * your Amazon ECS container agent version:
       *
       * * *Agent versions less than or equal to 1.1.0:* Null and zero CPU values are passed to
       * Docker as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to
       * Docker as 1, which the Linux kernel converts to two CPU shares.
       * * *Agent versions greater than or equal to 1.2.0:* Null, zero, and CPU values of 1 are
       * passed to Docker as 2.
       *
       * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota.
       * Windows containers only have access to the specified amount of CPU that's described in the
       * task definition. A null or zero CPU value is passed to Docker as `0` , which Windows
       * interprets as 1% of one CPU.
       */
      override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      /**
       * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec`
       * ) file that configures the container for Active Directory authentication.
       * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The
       * maximum number of ARNs is 1.
       *
       * There are two formats for each ARN.
       *
       * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide
       * a `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
       * login credentials to the domain in the secret.
       *
       * Each task that runs on any container instance can join different domains.
       *
       * You can use this format without joining the container instance to a domain.
       *
       * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
       * single domain.
       *
       * You must join the container instance to the domain before you start any tasks that use this
       * task definition.
       *
       * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
       *
       * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in
       * AWS Secrets Manager for a secret containing the username, password, and the domain to connect
       * to. For better security, the instance isn't joined to the domain for domainless
       * authentication. Other applications on the instance can't use the domainless credentials. You
       * can use this parameter to run tasks on the same instance, even it the tasks need to join
       * different domains. For more information, see [Using gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
       */
      override fun credentialSpecs(credentialSpecs: List<String>) {
        cdkBuilder.credentialSpecs(credentialSpecs)
      }

      /**
       * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec`
       * ) file that configures the container for Active Directory authentication.
       * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The
       * maximum number of ARNs is 1.
       *
       * There are two formats for each ARN.
       *
       * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide
       * a `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
       * login credentials to the domain in the secret.
       *
       * Each task that runs on any container instance can join different domains.
       *
       * You can use this format without joining the container instance to a domain.
       *
       * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
       * single domain.
       *
       * You must join the container instance to the domain before you start any tasks that use this
       * task definition.
       *
       * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
       *
       * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in
       * AWS Secrets Manager for a secret containing the username, password, and the domain to connect
       * to. For better security, the instance isn't joined to the domain for domainless
       * authentication. Other applications on the instance can't use the domainless credentials. You
       * can use this parameter to run tasks on the same instance, even it the tasks need to join
       * different domains. For more information, see [Using gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
       */
      override fun credentialSpecs(vararg credentialSpecs: String): Unit =
          credentialSpecs(credentialSpecs.toList())

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      /**
       * @param dependsOn The dependencies defined for container startup and shutdown.
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       */
      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      /**
       * @param disableNetworking When this parameter is true, networking is off within the
       * container.
       * This parameter maps to `NetworkDisabled` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
      }

      /**
       * @param disableNetworking When this parameter is true, networking is off within the
       * container.
       * This parameter maps to `NetworkDisabled` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun disableNetworking(disableNetworking: IResolvable) {
        cdkBuilder.disableNetworking(disableNetworking.let(IResolvable::unwrap))
      }

      /**
       * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
       * This parameter maps to `DnsSearch` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--dns-search` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
        cdkBuilder.dnsSearchDomains(dnsSearchDomains)
      }

      /**
       * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
       * This parameter maps to `DnsSearch` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--dns-search` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun dnsSearchDomains(vararg dnsSearchDomains: String): Unit =
          dnsSearchDomains(dnsSearchDomains.toList())

      /**
       * @param dnsServers A list of DNS servers that are presented to the container.
       * This parameter maps to `Dns` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun dnsServers(dnsServers: List<String>) {
        cdkBuilder.dnsServers(dnsServers)
      }

      /**
       * @param dnsServers A list of DNS servers that are presented to the container.
       * This parameter maps to `Dns` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

      /**
       * @param dockerLabels A key/value map of labels to add to the container.
       * This parameter maps to `Labels` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun dockerLabels(dockerLabels: IResolvable) {
        cdkBuilder.dockerLabels(dockerLabels.let(IResolvable::unwrap))
      }

      /**
       * @param dockerLabels A key/value map of labels to add to the container.
       * This parameter maps to `Labels` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
      }

      /**
       * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
       * security systems.
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This field isn't valid for containers in tasks using the Fargate launch type.
       *
       * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux
       * and AppArmor multi-level security systems.
       *
       * For any tasks on EC2, this parameter can be used to reference a credential spec file that
       * configures a container for Active Directory authentication. For more information, see [Using
       * gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * This parameter maps to `SecurityOpt` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--security-opt` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The Amazon ECS container agent running on a container instance must register with the
       * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
       * containers placed on that instance can use these security options. For more information, see
       * [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
       * "credentialspec:CredentialSpecFilePath"
       */
      override fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
        cdkBuilder.dockerSecurityOptions(dockerSecurityOptions)
      }

      /**
       * @param dockerSecurityOptions A list of strings to provide custom configuration for multiple
       * security systems.
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This field isn't valid for containers in tasks using the Fargate launch type.
       *
       * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux
       * and AppArmor multi-level security systems.
       *
       * For any tasks on EC2, this parameter can be used to reference a credential spec file that
       * configures a container for Active Directory authentication. For more information, see [Using
       * gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * This parameter maps to `SecurityOpt` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--security-opt` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The Amazon ECS container agent running on a container instance must register with the
       * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
       * containers placed on that instance can use these security options. For more information, see
       * [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
       * "credentialspec:CredentialSpecFilePath"
       */
      override fun dockerSecurityOptions(vararg dockerSecurityOptions: String): Unit =
          dockerSecurityOptions(dockerSecurityOptions.toList())

      /**
       * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
       * `entryPoint` parameters.
       * If you have problems using `entryPoint` , update your container agent or enter your
       * commands and arguments as `command` array items instead.
       *
       * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--entrypoint` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * .
       */
      override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      /**
       * @param entryPoint Early versions of the Amazon ECS container agent don't properly handle
       * `entryPoint` parameters.
       * If you have problems using `entryPoint` , update your container agent or enter your
       * commands and arguments as `command` array items instead.
       *
       * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--entrypoint` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * .
       */
      override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      /**
       * @param environment The environment variables to pass to a container.
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       */
      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      /**
       * @param environmentFiles A list of files containing the environment variables to pass to a
       * container.
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun environmentFiles(vararg environmentFiles: Any): Unit =
          environmentFiles(environmentFiles.toList())

      /**
       * @param essential If the `essential` parameter of a container is marked as `true` , and that
       * container fails or stops for any reason, all other containers that are part of the task are
       * stopped.
       * If the `essential` parameter of a container is marked as `false` , its failure doesn't
       * affect the rest of the containers in a task. If this parameter is omitted, a container is
       * assumed to be essential.
       *
       * All tasks must have at least one essential container. If you have an application that's
       * composed of multiple containers, group containers that are used for a common purpose into
       * components, and separate the different components into multiple task definitions. For more
       * information, see [Application
       * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      /**
       * @param essential If the `essential` parameter of a container is marked as `true` , and that
       * container fails or stops for any reason, all other containers that are part of the task are
       * stopped.
       * If the `essential` parameter of a container is marked as `false` , its failure doesn't
       * affect the rest of the containers in a task. If this parameter is omitted, a container is
       * assumed to be essential.
       *
       * All tasks must have at least one essential container. If you have an application that's
       * composed of multiple containers, group containers that are used for a common purpose into
       * components, and separate the different components into multiple task definitions. For more
       * information, see [Application
       * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable::unwrap))
      }

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      override fun extraHosts(extraHosts: IResolvable) {
        cdkBuilder.extraHosts(extraHosts.let(IResolvable::unwrap))
      }

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      override fun extraHosts(extraHosts: List<Any>) {
        cdkBuilder.extraHosts(extraHosts)
      }

      /**
       * @param extraHosts A list of hostnames and IP address mappings to append to the `/etc/hosts`
       * file on the container.
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       */
      override fun extraHosts(vararg extraHosts: Any): Unit = extraHosts(extraHosts.toList())

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun firelensConfiguration(firelensConfiguration: IResolvable) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(FirelensConfigurationProperty::unwrap))
      }

      /**
       * @param firelensConfiguration The FireLens configuration for the container.
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      override
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit):
          Unit = firelensConfiguration(FirelensConfigurationProperty(firelensConfiguration))

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun healthCheck(healthCheck: HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
      }

      /**
       * @param healthCheck The container health check command and associated configuration
       * parameters for the container.
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckProperty(healthCheck))

      /**
       * @param hostname The hostname to use for your container.
       * This parameter maps to `Hostname` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--hostname` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The `hostname` parameter is not supported if you're using the `awsvpc` network mode.
       */
      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      /**
       * @param image The image used to start a container. 
       * This string is passed directly to the Docker daemon. By default, images in the Docker Hub
       * registry are available. Other repositories are specified with either `*repository-url* /
       * *image* : *tag*` or `*repository-url* / *image* &#64; *digest*` . Up to 255 letters (uppercase
       * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
       * signs are allowed. This parameter maps to `Image` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * * When a new task starts, the Amazon ECS container agent pulls the latest version of the
       * specified image and tag for the container to use. However, subsequent updates to a repository
       * image aren't propagated to already running tasks.
       * * Images in Amazon ECR repositories can be specified by either using the full
       * `registry/repository:tag` or `registry/repository&#64;digest` . For example,
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest` or
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE`
       * .
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param interactive When this parameter is `true` , you can deploy containerized
       * applications that require `stdin` or a `tty` to be allocated.
       * This parameter maps to `OpenStdin` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--interactive` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun interactive(interactive: Boolean) {
        cdkBuilder.interactive(interactive)
      }

      /**
       * @param interactive When this parameter is `true` , you can deploy containerized
       * applications that require `stdin` or a `tty` to be allocated.
       * This parameter maps to `OpenStdin` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--interactive` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun interactive(interactive: IResolvable) {
        cdkBuilder.interactive(interactive.let(IResolvable::unwrap))
      }

      /**
       * @param links The `links` parameter allows containers to communicate with each other without
       * the need for port mappings.
       * This parameter is only supported if the network mode of a task definition is `bridge` . The
       * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
       * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
       * about linking Docker containers, go to [Legacy container
       * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
       * documentation. This parameter maps to `Links` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers. &gt; Containers that are collocated
       * on a single container instance may be able to communicate with each other without requiring
       * links or host port mappings. Network isolation is achieved on the container instance using
       * security groups and VPC settings.
       */
      override fun links(links: List<String>) {
        cdkBuilder.links(links)
      }

      /**
       * @param links The `links` parameter allows containers to communicate with each other without
       * the need for port mappings.
       * This parameter is only supported if the network mode of a task definition is `bridge` . The
       * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
       * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
       * about linking Docker containers, go to [Legacy container
       * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
       * documentation. This parameter maps to `Links` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers. &gt; Containers that are collocated
       * on a single container instance may be able to communicate with each other without requiring
       * links or host port mappings. Network isolation is achieved on the container instance using
       * security groups and VPC settings.
       */
      override fun links(vararg links: String): Unit = links(links.toList())

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      /**
       * @param linuxParameters Linux-specific modifications that are applied to the container, such
       * as Linux kernel capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       * This parameter is not supported for Windows containers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      override fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit):
          Unit = linuxParameters(LinuxParametersProperty(linuxParameters))

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      /**
       * @param logConfiguration The log configuration specification for the container.
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      /**
       * @param memory The amount (in MiB) of memory to present to the container.
       * If your container attempts to exceed the memory specified here, the container is killed.
       * The total amount of memory reserved for all containers within a task must be lower than the
       * task `memory` value, if one is specified. This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If using the Fargate launch type, this parameter is optional.
       *
       * If using the EC2 launch type, you must specify either a task-level memory value or a
       * container-level memory value. If you specify both a container-level `memory` and
       * `memoryReservation` value, `memory` must be greater than `memoryReservation` . If you specify
       * `memoryReservation` , then that value is subtracted from the available memory resources for
       * the container instance where the container is placed. Otherwise, the value of `memory` is
       * used.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container,
       * so you should not specify fewer than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container, so you should not specify fewer than 4 MiB of memory for your containers.
       */
      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      /**
       * @param memoryReservation The soft limit (in MiB) of memory to reserve for the container.
       * When system memory is under heavy contention, Docker attempts to keep the container memory
       * to this soft limit. However, your container can consume more memory when it needs to, up to
       * either the hard limit specified with the `memory` parameter (if applicable), or all of the
       * available memory on the container instance, whichever comes first. This parameter maps to
       * `MemoryReservation` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--memory-reservation` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If a task-level memory value is not specified, you must specify a non-zero integer for one
       * or both of `memory` or `memoryReservation` in a container definition. If you specify both,
       * `memory` must be greater than `memoryReservation` . If you specify `memoryReservation` , then
       * that value is subtracted from the available memory resources for the container instance where
       * the container is placed. Otherwise, the value of `memory` is used.
       *
       * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to
       * 256 MiB of memory for short periods of time, you can set a `memoryReservation` of 128 MiB, and
       * a `memory` hard limit of 300 MiB. This configuration would allow the container to only reserve
       * 128 MiB of memory from the remaining resources on the container instance, but also allow the
       * container to consume more memory resources when needed.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container.
       * So, don't specify less than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container. So, don't specify less than 4 MiB of memory for your containers.
       */
      override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      /**
       * @param mountPoints The mount points for data volumes in your container.
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       */
      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      /**
       * @param name The name of a container. 
       * If you're linking multiple containers together in a task definition, the `name` of one
       * container can be entered in the `links` of another container to connect the containers. Up to
       * 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. This
       * parameter maps to `name` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--name`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      override fun portMappings(portMappings: IResolvable) {
        cdkBuilder.portMappings(portMappings.let(IResolvable::unwrap))
      }

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      override fun portMappings(portMappings: List<Any>) {
        cdkBuilder.portMappings(portMappings)
      }

      /**
       * @param portMappings The list of port mappings for the container.
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       */
      override fun portMappings(vararg portMappings: Any): Unit =
          portMappings(portMappings.toList())

      /**
       * @param privileged When this parameter is true, the container is given elevated privileges
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
       */
      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      /**
       * @param privileged When this parameter is true, the container is given elevated privileges
       * on the host container instance (similar to the `root` user).
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
       */
      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      /**
       * @param pseudoTerminal When this parameter is `true` , a TTY is allocated.
       * This parameter maps to `Tty` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
      }

      /**
       * @param pseudoTerminal When this parameter is `true` , a TTY is allocated.
       * This parameter maps to `Tty` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun pseudoTerminal(pseudoTerminal: IResolvable) {
        cdkBuilder.pseudoTerminal(pseudoTerminal.let(IResolvable::unwrap))
      }

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--read-only` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      /**
       * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
       * access to its root file system.
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--read-only` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      override fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      /**
       * @param repositoryCredentials The private repository authentication credentials to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      /**
       * @param resourceRequirements The type and amount of a resource to assign to a container.
       * The only supported resource is a GPU.
       */
      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      /**
       * @param secrets The secrets to pass to the container.
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secrets(vararg secrets: Any): Unit = secrets(secrets.toList())

      /**
       * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
       * dependencies for a container.
       * For example, you specify two containers in a task definition with containerA having a
       * dependency on containerB reaching a `COMPLETE` , `SUCCESS` , or `HEALTHY` status. If a
       * `startTimeout` value is specified for containerB and it doesn't reach the desired status
       * within that time then containerA gives up and not start. This results in the task
       * transitioning to a `STOPPED` state.
       *
       *
       * When the `ECS_CONTAINER_START_TIMEOUT` container agent configuration variable is used, it's
       * enforced independently from this start timeout value.
       *
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * For tasks using the EC2 launch type, your container instances require at least version
       * `1.26.0` of the container agent to use a container start timeout value. However, we recommend
       * using the latest container agent version. For information about checking your agent version
       * and updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version `1.26.0-1` of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       */
      override fun startTimeout(startTimeout: Number) {
        cdkBuilder.startTimeout(startTimeout)
      }

      /**
       * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
       * killed if it doesn't exit normally on its own.
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * The max stop timeout value is 120 seconds and if the parameter is not specified, the
       * default value of 30 seconds is used.
       *
       * For tasks that use the EC2 launch type, if the `stopTimeout` parameter isn't specified, the
       * value set for the Amazon ECS container agent configuration variable
       * `ECS_CONTAINER_STOP_TIMEOUT` is used. If neither the `stopTimeout` parameter or the
       * `ECS_CONTAINER_STOP_TIMEOUT` agent configuration variable are set, then the default values of
       * 30 seconds for Linux containers and 30 seconds on Windows containers are used. Your container
       * instances require at least version 1.26.0 of the container agent to use a container stop
       * timeout value. However, we recommend using the latest container agent version. For information
       * about checking your agent version and updating to the latest version, see [Updating the Amazon
       * ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       */
      override fun stopTimeout(stopTimeout: Number) {
        cdkBuilder.stopTimeout(stopTimeout)
      }

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      override fun systemControls(systemControls: IResolvable) {
        cdkBuilder.systemControls(systemControls.let(IResolvable::unwrap))
      }

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      override fun systemControls(systemControls: List<Any>) {
        cdkBuilder.systemControls(systemControls)
      }

      /**
       * @param systemControls A list of namespaced kernel parameters to set in the container.
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       */
      override fun systemControls(vararg systemControls: Any): Unit =
          systemControls(systemControls.toList())

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      /**
       * @param ulimits A list of `ulimits` to set in the container.
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun ulimits(vararg ulimits: Any): Unit = ulimits(ulimits.toList())

      /**
       * @param user The user to use inside the container.
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * When running tasks using the `host` network mode, don't run containers using the root user
       * (UID 0). We recommend using a non-root user for better security.
       *
       *
       * You can specify the `user` using the following formats. If specifying a UID or GID, you
       * must specify it as a positive integer.
       *
       * * `user`
       * * `user:group`
       * * `uid`
       * * `uid:gid`
       * * `user:gid`
       * * `uid:group`
       *
       *
       * This parameter is not supported for Windows containers.
       */
      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun volumesFrom(volumesFrom: IResolvable) {
        cdkBuilder.volumesFrom(volumesFrom.let(IResolvable::unwrap))
      }

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun volumesFrom(volumesFrom: List<Any>) {
        cdkBuilder.volumesFrom(volumesFrom)
      }

      /**
       * @param volumesFrom Data volumes to mount from another container.
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun volumesFrom(vararg volumesFrom: Any): Unit = volumesFrom(volumesFrom.toList())

      /**
       * @param workingDirectory The working directory to run commands inside the container in.
       * This parameter maps to `WorkingDir` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--workdir` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       */
      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty,
    ) : CdkObject(cdkObject), ContainerDefinitionProperty {
      /**
       * The command that's passed to the container.
       *
       * This parameter maps to `Cmd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `COMMAND`
       * parameter to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#cmd](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#cmd)
       * . If there are multiple arguments, each argument is a separated string in the array.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The number of `cpu` units reserved for the container.
       *
       * This parameter maps to `CpuShares` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cpu-shares` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * This field is optional for tasks using the Fargate launch type, and the only requirement is
       * that the total amount of CPU reserved for all containers within a task be lower than the
       * task-level `cpu` value.
       *
       *
       * You can determine the number of CPU units that are available per EC2 instance type by
       * multiplying the vCPUs listed for that instance type on the [Amazon EC2
       * Instances](https://docs.aws.amazon.com/ec2/instance-types/) detail page by 1,024.
       *
       *
       * Linux containers share unallocated CPU units with other containers on the container
       * instance with the same ratio as their allocated amount. For example, if you run a
       * single-container task on a single-core instance type with 512 CPU units specified for that
       * container, and that's the only task running on the container instance, that container could
       * use the full 1,024 CPU unit share at any given time. However, if you launched another copy of
       * the same task on that container instance, each task is guaranteed a minimum of 512 CPU units
       * when needed. Moreover, each container could float to higher CPU usage if the other container
       * was not using it. If both tasks were 100% active all of the time, they would be limited to 512
       * CPU units.
       *
       * On Linux container instances, the Docker daemon on the container instance uses the CPU
       * value to calculate the relative CPU share ratios for running containers. For more information,
       * see [CPU share
       * constraint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#cpu-share-constraint)
       * in the Docker documentation. The minimum valid CPU share value that the Linux kernel allows is
       * 2. However, the CPU parameter isn't required, and you can use CPU values below 2 in your
       * container definitions. For CPU values below 2 (including null), the behavior varies based on
       * your Amazon ECS container agent version:
       *
       * * *Agent versions less than or equal to 1.1.0:* Null and zero CPU values are passed to
       * Docker as 0, which Docker then converts to 1,024 CPU shares. CPU values of 1 are passed to
       * Docker as 1, which the Linux kernel converts to two CPU shares.
       * * *Agent versions greater than or equal to 1.2.0:* Null, zero, and CPU values of 1 are
       * passed to Docker as 2.
       *
       * On Windows container instances, the CPU limit is enforced as an absolute limit, or a quota.
       * Windows containers only have access to the specified amount of CPU that's described in the
       * task definition. A null or zero CPU value is passed to Docker as `0` , which Windows
       * interprets as 1% of one CPU.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-cpu)
       */
      override fun cpu(): Number? = unwrap(this).getCpu()

      /**
       * A list of ARNs in SSM or Amazon S3 to a credential spec ( `CredSpec` ) file that configures
       * the container for Active Directory authentication.
       *
       * We recommend that you use this parameter instead of the `dockerSecurityOptions` . The
       * maximum number of ARNs is 1.
       *
       * There are two formats for each ARN.
       *
       * * **credentialspecdomainless:MyARN** - You use `credentialspecdomainless:MyARN` to provide
       * a `CredSpec` with an additional section for a secret in AWS Secrets Manager . You provide the
       * login credentials to the domain in the secret.
       *
       * Each task that runs on any container instance can join different domains.
       *
       * You can use this format without joining the container instance to a domain.
       *
       * * **credentialspec:MyARN** - You use `credentialspec:MyARN` to provide a `CredSpec` for a
       * single domain.
       *
       * You must join the container instance to the domain before you start any tasks that use this
       * task definition.
       *
       * In both formats, replace `MyARN` with the ARN in SSM or Amazon S3.
       *
       * If you provide a `credentialspecdomainless:MyARN` , the `credspec` must provide a ARN in
       * AWS Secrets Manager for a secret containing the username, password, and the domain to connect
       * to. For better security, the instance isn't joined to the domain for domainless
       * authentication. Other applications on the instance can't use the domainless credentials. You
       * can use this parameter to run tasks on the same instance, even it the tasks need to join
       * different domains. For more information, see [Using gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-credentialspecs)
       */
      override fun credentialSpecs(): List<String> = unwrap(this).getCredentialSpecs() ?:
          emptyList()

      /**
       * The dependencies defined for container startup and shutdown.
       *
       * A container can contain multiple dependencies. When a dependency is defined for container
       * startup, for container shutdown it is reversed.
       *
       * For tasks using the EC2 launch type, the container instances require at least version
       * 1.26.0 of the container agent to turn on container dependencies. However, we recommend using
       * the latest container agent version. For information about checking your agent version and
       * updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * If the task definition is used in a blue/green deployment that uses
       * [AWS::CodeDeploy::DeploymentGroup
       * BlueGreenDeploymentConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
       * , the `dependsOn` parameter is not supported. For more information see [Issue
       * #680](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-coverage-roadmap/issues/680)
       * on the on the GitHub website.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dependson)
       */
      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      /**
       * When this parameter is true, networking is off within the container.
       *
       * This parameter maps to `NetworkDisabled` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking)
       */
      override fun disableNetworking(): Any? = unwrap(this).getDisableNetworking()

      /**
       * A list of DNS search domains that are presented to the container.
       *
       * This parameter maps to `DnsSearch` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--dns-search` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains)
       */
      override fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?:
          emptyList()

      /**
       * A list of DNS servers that are presented to the container.
       *
       * This parameter maps to `Dns` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--dns`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers)
       */
      override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

      /**
       * A key/value map of labels to add to the container.
       *
       * This parameter maps to `Labels` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--label`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels)
       */
      override fun dockerLabels(): Any? = unwrap(this).getDockerLabels()

      /**
       * A list of strings to provide custom configuration for multiple security systems.
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This field isn't valid for containers in tasks using the Fargate launch type.
       *
       * For Linux tasks on EC2, this parameter can be used to reference custom labels for SELinux
       * and AppArmor multi-level security systems.
       *
       * For any tasks on EC2, this parameter can be used to reference a credential spec file that
       * configures a container for Active Directory authentication. For more information, see [Using
       * gMSAs for Windows
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows-gmsa.html) and
       * [Using gMSAs for Linux
       * Containers](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/linux-gmsa.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * This parameter maps to `SecurityOpt` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--security-opt` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The Amazon ECS container agent running on a container instance must register with the
       * `ECS_SELINUX_CAPABLE=true` or `ECS_APPARMOR_CAPABLE=true` environment variables before
       * containers placed on that instance can use these security options. For more information, see
       * [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * For more information about valid values, see [Docker Run Security
       * Configuration](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: "no-new-privileges" | "apparmor:PROFILE" | "label:value" |
       * "credentialspec:CredentialSpecFilePath"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions)
       */
      override fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions()
          ?: emptyList()

      /**
       * Early versions of the Amazon ECS container agent don't properly handle `entryPoint`
       * parameters.
       *
       * If you have problems using `entryPoint` , update your container agent or enter your
       * commands and arguments as `command` array items instead.
       *
       * The entry point that's passed to the container. This parameter maps to `Entrypoint` in the
       * [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--entrypoint` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For more information, see
       * [https://docs.docker.com/engine/reference/builder/#entrypoint](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/builder/#entrypoint)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint)
       */
      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      /**
       * The environment variables to pass to a container.
       *
       * This parameter maps to `Env` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--env`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * We don't recommend that you use plaintext environment variables for sensitive information,
       * such as credential data.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-environment)
       */
      override fun environment(): Any? = unwrap(this).getEnvironment()

      /**
       * A list of files containing the environment variables to pass to a container.
       *
       * This parameter maps to the `--env-file` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * You can specify up to ten environment files. The file must have a `.env` file extension.
       * Each line in an environment file contains an environment variable in `VARIABLE=VALUE` format.
       * Lines beginning with `#` are treated as comments and are ignored. For more information about
       * the environment variable file syntax, see [Declare default environment variables in
       * file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/) .
       *
       * If there are environment variables specified using the `environment` parameter in a
       * container definition, they take precedence over the variables contained within an environment
       * file. If multiple environment files are specified that contain the same variable, they're
       * processed from the top down. We recommend that you use unique variable names. For more
       * information, see [Specifying Environment
       * Variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-environmentfiles)
       */
      override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      /**
       * If the `essential` parameter of a container is marked as `true` , and that container fails
       * or stops for any reason, all other containers that are part of the task are stopped.
       *
       * If the `essential` parameter of a container is marked as `false` , its failure doesn't
       * affect the rest of the containers in a task. If this parameter is omitted, a container is
       * assumed to be essential.
       *
       * All tasks must have at least one essential container. If you have an application that's
       * composed of multiple containers, group containers that are used for a common purpose into
       * components, and separate the different components into multiple task definitions. For more
       * information, see [Application
       * Architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/application_architecture.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-essential)
       */
      override fun essential(): Any? = unwrap(this).getEssential()

      /**
       * A list of hostnames and IP address mappings to append to the `/etc/hosts` file on the
       * container.
       *
       * This parameter maps to `ExtraHosts` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--add-host` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter isn't supported for Windows containers or tasks that use the `awsvpc`
       * network mode.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts)
       */
      override fun extraHosts(): Any? = unwrap(this).getExtraHosts()

      /**
       * The FireLens configuration for the container.
       *
       * This is used to specify and configure a log router for container logs. For more
       * information, see [Custom Log
       * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-firelensconfiguration)
       */
      override fun firelensConfiguration(): Any? = unwrap(this).getFirelensConfiguration()

      /**
       * The container health check command and associated configuration parameters for the
       * container.
       *
       * This parameter maps to `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `HEALTHCHECK` parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-healthcheck)
       */
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      /**
       * The hostname to use for your container.
       *
       * This parameter maps to `Hostname` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--hostname` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * The `hostname` parameter is not supported if you're using the `awsvpc` network mode.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-hostname)
       */
      override fun hostname(): String? = unwrap(this).getHostname()

      /**
       * The image used to start a container.
       *
       * This string is passed directly to the Docker daemon. By default, images in the Docker Hub
       * registry are available. Other repositories are specified with either `*repository-url* /
       * *image* : *tag*` or `*repository-url* / *image* &#64; *digest*` . Up to 255 letters (uppercase
       * and lowercase), numbers, hyphens, underscores, colons, periods, forward slashes, and number
       * signs are allowed. This parameter maps to `Image` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `IMAGE`
       * parameter of [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * * When a new task starts, the Amazon ECS container agent pulls the latest version of the
       * specified image and tag for the container to use. However, subsequent updates to a repository
       * image aren't propagated to already running tasks.
       * * Images in Amazon ECR repositories can be specified by either using the full
       * `registry/repository:tag` or `registry/repository&#64;digest` . For example,
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;:latest` or
       * `012345678910.dkr.ecr.&lt;region-name&gt;.amazonaws.com/&lt;repository-name&gt;&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE`
       * .
       * * Images in official repositories on Docker Hub use a single name (for example, `ubuntu` or
       * `mongo` ).
       * * Images in other repositories on Docker Hub are qualified with an organization name (for
       * example, `amazon/amazon-ecs-agent` ).
       * * Images in other online repositories are qualified further by a domain name (for example,
       * `quay.io/assemblyline/ubuntu` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * When this parameter is `true` , you can deploy containerized applications that require
       * `stdin` or a `tty` to be allocated.
       *
       * This parameter maps to `OpenStdin` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--interactive` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
       */
      override fun interactive(): Any? = unwrap(this).getInteractive()

      /**
       * The `links` parameter allows containers to communicate with each other without the need for
       * port mappings.
       *
       * This parameter is only supported if the network mode of a task definition is `bridge` . The
       * `name:internalName` construct is analogous to `name:alias` in Docker links. Up to 255 letters
       * (uppercase and lowercase), numbers, underscores, and hyphens are allowed. For more information
       * about linking Docker containers, go to [Legacy container
       * links](https://docs.aws.amazon.com/https://docs.docker.com/network/links/) in the Docker
       * documentation. This parameter maps to `Links` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--link`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers. &gt; Containers that are collocated
       * on a single container instance may be able to communicate with each other without requiring
       * links or host port mappings. Network isolation is achieved on the container instance using
       * security groups and VPC settings.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-links)
       */
      override fun links(): List<String> = unwrap(this).getLinks() ?: emptyList()

      /**
       * Linux-specific modifications that are applied to the container, such as Linux kernel
       * capabilities. For more information see
       * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-linuxparameters)
       */
      override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      /**
       * The log configuration specification for the container.
       *
       * This parameter maps to `LogConfig` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--log-driver` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . By default,
       * containers use the same logging driver that the Docker daemon uses. However, the container may
       * use a different logging driver than the Docker daemon by specifying a log driver with this
       * parameter in the container definition. To use a different logging driver for a container, the
       * log system must be configured properly on the container instance (or on a different log server
       * for remote logging options). For more information on the options for different supported log
       * drivers, see [Configure logging
       * drivers](https://docs.aws.amazon.com/https://docs.docker.com/engine/admin/logging/overview/)
       * in the Docker documentation.
       *
       *
       * Amazon ECS currently supports a subset of the logging drivers available to the Docker
       * daemon (shown in the
       * [LogConfiguration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)
       * data type). Additional log drivers may be available in future releases of the Amazon ECS
       * container agent.
       *
       *
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * The Amazon ECS container agent running on a container instance must register the logging
       * drivers available on that instance with the `ECS_AVAILABLE_LOGGING_DRIVERS` environment
       * variable before containers placed on that instance can use these log configuration options.
       * For more information, see [Amazon ECS Container Agent
       * Configuration](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-config.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-logconfiguration)
       */
      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      /**
       * The amount (in MiB) of memory to present to the container.
       *
       * If your container attempts to exceed the memory specified here, the container is killed.
       * The total amount of memory reserved for all containers within a task must be lower than the
       * task `memory` value, if one is specified. This parameter maps to `Memory` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--memory`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If using the Fargate launch type, this parameter is optional.
       *
       * If using the EC2 launch type, you must specify either a task-level memory value or a
       * container-level memory value. If you specify both a container-level `memory` and
       * `memoryReservation` value, `memory` must be greater than `memoryReservation` . If you specify
       * `memoryReservation` , then that value is subtracted from the available memory resources for
       * the container instance where the container is placed. Otherwise, the value of `memory` is
       * used.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container,
       * so you should not specify fewer than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container, so you should not specify fewer than 4 MiB of memory for your containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-memory)
       */
      override fun memory(): Number? = unwrap(this).getMemory()

      /**
       * The soft limit (in MiB) of memory to reserve for the container.
       *
       * When system memory is under heavy contention, Docker attempts to keep the container memory
       * to this soft limit. However, your container can consume more memory when it needs to, up to
       * either the hard limit specified with the `memory` parameter (if applicable), or all of the
       * available memory on the container instance, whichever comes first. This parameter maps to
       * `MemoryReservation` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--memory-reservation` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * If a task-level memory value is not specified, you must specify a non-zero integer for one
       * or both of `memory` or `memoryReservation` in a container definition. If you specify both,
       * `memory` must be greater than `memoryReservation` . If you specify `memoryReservation` , then
       * that value is subtracted from the available memory resources for the container instance where
       * the container is placed. Otherwise, the value of `memory` is used.
       *
       * For example, if your container normally uses 128 MiB of memory, but occasionally bursts to
       * 256 MiB of memory for short periods of time, you can set a `memoryReservation` of 128 MiB, and
       * a `memory` hard limit of 300 MiB. This configuration would allow the container to only reserve
       * 128 MiB of memory from the remaining resources on the container instance, but also allow the
       * container to consume more memory resources when needed.
       *
       * The Docker 20.10.0 or later daemon reserves a minimum of 6 MiB of memory for a container.
       * So, don't specify less than 6 MiB of memory for your containers.
       *
       * The Docker 19.03.13-ce or earlier daemon reserves a minimum of 4 MiB of memory for a
       * container. So, don't specify less than 4 MiB of memory for your containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation)
       */
      override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      /**
       * The mount points for data volumes in your container.
       *
       * This parameter maps to `Volumes` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--volume`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints)
       */
      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      /**
       * The name of a container.
       *
       * If you're linking multiple containers together in a task definition, the `name` of one
       * container can be entered in the `links` of another container to connect the containers. Up to
       * 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. This
       * parameter maps to `name` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--name`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The list of port mappings for the container.
       *
       * Port mappings allow containers to access ports on the host container instance to send or
       * receive traffic.
       *
       * For task definitions that use the `awsvpc` network mode, you should only specify the
       * `containerPort` . The `hostPort` can be left blank or it must be the same value as the
       * `containerPort` .
       *
       * Port mappings on Windows use the `NetNAT` gateway address rather than `localhost` . There
       * is no loopback for port mappings on Windows, so you cannot access a container's mapped port
       * from the host itself.
       *
       * This parameter maps to `PortBindings` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--publish` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . If the
       * network mode of a task definition is set to `none` , then you can't specify port mappings. If
       * the network mode of a task definition is set to `host` , then host ports must either be
       * undefined or they must match the container port in the port mapping.
       *
       *
       * After a task reaches the `RUNNING` status, manual and automatic host and container port
       * assignments are visible in the *Network Bindings* section of a container description for a
       * selected task in the Amazon ECS console. The assignments are also visible in the
       * `networkBindings` section
       * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * responses.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-portmappings)
       */
      override fun portMappings(): Any? = unwrap(this).getPortMappings()

      /**
       * When this parameter is true, the container is given elevated privileges on the host
       * container instance (similar to the `root` user).
       *
       * This parameter maps to `Privileged` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--privileged` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-privileged)
       */
      override fun privileged(): Any? = unwrap(this).getPrivileged()

      /**
       * When this parameter is `true` , a TTY is allocated.
       *
       * This parameter maps to `Tty` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--tty`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-pseudoterminal)
       */
      override fun pseudoTerminal(): Any? = unwrap(this).getPseudoTerminal()

      /**
       * When this parameter is true, the container is given read-only access to its root file
       * system.
       *
       * This parameter maps to `ReadonlyRootfs` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--read-only` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem)
       */
      override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      /**
       * The private repository authentication credentials to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-repositorycredentials)
       */
      override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      /**
       * The type and amount of a resource to assign to a container.
       *
       * The only supported resource is a GPU.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-resourcerequirements)
       */
      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      /**
       * The secrets to pass to the container.
       *
       * For more information, see [Specifying Sensitive
       * Data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-secrets)
       */
      override fun secrets(): Any? = unwrap(this).getSecrets()

      /**
       * Time duration (in seconds) to wait before giving up on resolving dependencies for a
       * container.
       *
       * For example, you specify two containers in a task definition with containerA having a
       * dependency on containerB reaching a `COMPLETE` , `SUCCESS` , or `HEALTHY` status. If a
       * `startTimeout` value is specified for containerB and it doesn't reach the desired status
       * within that time then containerA gives up and not start. This results in the task
       * transitioning to a `STOPPED` state.
       *
       *
       * When the `ECS_CONTAINER_START_TIMEOUT` container agent configuration variable is used, it's
       * enforced independently from this start timeout value.
       *
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * For tasks using the EC2 launch type, your container instances require at least version
       * `1.26.0` of the container agent to use a container start timeout value. However, we recommend
       * using the latest container agent version. For information about checking your agent version
       * and updating to the latest version, see [Updating the Amazon ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version `1.26.0-1` of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-starttimeout)
       */
      override fun startTimeout(): Number? = unwrap(this).getStartTimeout()

      /**
       * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
       * exit normally on its own.
       *
       * For tasks using the Fargate launch type, the task or service requires the following
       * platforms:
       *
       * * Linux platform version `1.3.0` or later.
       * * Windows platform version `1.0.0` or later.
       *
       * The max stop timeout value is 120 seconds and if the parameter is not specified, the
       * default value of 30 seconds is used.
       *
       * For tasks that use the EC2 launch type, if the `stopTimeout` parameter isn't specified, the
       * value set for the Amazon ECS container agent configuration variable
       * `ECS_CONTAINER_STOP_TIMEOUT` is used. If neither the `stopTimeout` parameter or the
       * `ECS_CONTAINER_STOP_TIMEOUT` agent configuration variable are set, then the default values of
       * 30 seconds for Linux containers and 30 seconds on Windows containers are used. Your container
       * instances require at least version 1.26.0 of the container agent to use a container stop
       * timeout value. However, we recommend using the latest container agent version. For information
       * about checking your agent version and updating to the latest version, see [Updating the Amazon
       * ECS Container
       * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in
       * the *Amazon Elastic Container Service Developer Guide* . If you're using an Amazon
       * ECS-optimized Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init`
       * package. If your container instances are launched from version `20190301` or later, then they
       * contain the required versions of the container agent and `ecs-init` . For more information,
       * see [Amazon ECS-optimized Linux
       * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * The valid values are 2-120 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-stoptimeout)
       */
      override fun stopTimeout(): Number? = unwrap(this).getStopTimeout()

      /**
       * A list of namespaced kernel parameters to set in the container.
       *
       * This parameter maps to `Sysctls` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer
       * lived connections.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-systemcontrols)
       */
      override fun systemControls(): Any? = unwrap(this).getSystemControls()

      /**
       * A list of `ulimits` to set in the container.
       *
       * This parameter maps to `Ulimits` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--ulimit`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) . Valid naming
       * values are displayed in the
       * [Ulimit](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_Ulimit.html) data type.
       * This parameter requires version 1.18 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-ulimits)
       */
      override fun ulimits(): Any? = unwrap(this).getUlimits()

      /**
       * The user to use inside the container.
       *
       * This parameter maps to `User` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--user`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * When running tasks using the `host` network mode, don't run containers using the root user
       * (UID 0). We recommend using a non-root user for better security.
       *
       *
       * You can specify the `user` using the following formats. If specifying a UID or GID, you
       * must specify it as a positive integer.
       *
       * * `user`
       * * `user:group`
       * * `uid`
       * * `uid:gid`
       * * `user:gid`
       * * `uid:group`
       *
       *
       * This parameter is not supported for Windows containers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-user)
       */
      override fun user(): String? = unwrap(this).getUser()

      /**
       * Data volumes to mount from another container.
       *
       * This parameter maps to `VolumesFrom` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--volumes-from` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom)
       */
      override fun volumesFrom(): Any? = unwrap(this).getVolumesFrom()

      /**
       * The working directory to run commands inside the container in.
       *
       * This parameter maps to `WorkingDir` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--workdir` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory)
       */
      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty):
          ContainerDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty
    }
  }

  /**
   * The `ContainerDependency` property specifies the dependencies defined for container startup and
   * shutdown.
   *
   * A container can contain multiple dependencies. When a dependency is defined for container
   * startup, for container shutdown it is reversed.
   *
   * Your Amazon ECS container instances require at least version 1.26.0 of the container agent to
   * enable container dependencies. However, we recommend using the latest container agent version. For
   * information about checking your agent version and updating to the latest version, see [Updating
   * the Amazon ECS Container
   * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) in the
   * *Amazon Elastic Container Service Developer Guide* . If you are using an Amazon ECS-optimized
   * Linux AMI, your instance needs at least version 1.26.0-1 of the `ecs-init` package. If your
   * container instances are launched from version `20190301` or later, then they contain the required
   * versions of the container agent and `ecs-init` . For more information, see [Amazon ECS-optimized
   * Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   *
   *
   * For tasks using the Fargate launch type, this parameter requires that the task or service uses
   * platform version 1.3.0 or later.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ContainerDependencyProperty containerDependencyProperty = ContainerDependencyProperty.builder()
   * .condition("condition")
   * .containerName("containerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html)
   */
  public interface ContainerDependencyProperty {
    /**
     * The dependency condition of the container. The following are the available conditions and
     * their behavior:.
     *
     * * `START` - This condition emulates the behavior of links and volumes today. It validates
     * that a dependent container is started before permitting other containers to start.
     * * `COMPLETE` - This condition validates that a dependent container runs to completion (exits)
     * before permitting other containers to start. This can be useful for nonessential containers that
     * run a script and then exit. This condition can't be set on an essential container.
     * * `SUCCESS` - This condition is the same as `COMPLETE` , but it also requires that the
     * container exits with a `zero` status. This condition can't be set on an essential container.
     * * `HEALTHY` - This condition validates that the dependent container passes its Docker health
     * check before permitting other containers to start. This requires that the dependent container
     * has health checks configured. This condition is confirmed only at task startup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition)
     */
    public fun condition(): String? = unwrap(this).getCondition()

    /**
     * The name of a container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * A builder for [ContainerDependencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition The dependency condition of the container. The following are the available
       * conditions and their behavior:.
       * * `START` - This condition emulates the behavior of links and volumes today. It validates
       * that a dependent container is started before permitting other containers to start.
       * * `COMPLETE` - This condition validates that a dependent container runs to completion
       * (exits) before permitting other containers to start. This can be useful for nonessential
       * containers that run a script and then exit. This condition can't be set on an essential
       * container.
       * * `SUCCESS` - This condition is the same as `COMPLETE` , but it also requires that the
       * container exits with a `zero` status. This condition can't be set on an essential container.
       * * `HEALTHY` - This condition validates that the dependent container passes its Docker
       * health check before permitting other containers to start. This requires that the dependent
       * container has health checks configured. This condition is confirmed only at task startup.
       */
      public fun condition(condition: String)

      /**
       * @param containerName The name of a container.
       */
      public fun containerName(containerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.builder()

      /**
       * @param condition The dependency condition of the container. The following are the available
       * conditions and their behavior:.
       * * `START` - This condition emulates the behavior of links and volumes today. It validates
       * that a dependent container is started before permitting other containers to start.
       * * `COMPLETE` - This condition validates that a dependent container runs to completion
       * (exits) before permitting other containers to start. This can be useful for nonessential
       * containers that run a script and then exit. This condition can't be set on an essential
       * container.
       * * `SUCCESS` - This condition is the same as `COMPLETE` , but it also requires that the
       * container exits with a `zero` status. This condition can't be set on an essential container.
       * * `HEALTHY` - This condition validates that the dependent container passes its Docker
       * health check before permitting other containers to start. This requires that the dependent
       * container has health checks configured. This condition is confirmed only at task startup.
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param containerName The name of a container.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty,
    ) : CdkObject(cdkObject), ContainerDependencyProperty {
      /**
       * The dependency condition of the container. The following are the available conditions and
       * their behavior:.
       *
       * * `START` - This condition emulates the behavior of links and volumes today. It validates
       * that a dependent container is started before permitting other containers to start.
       * * `COMPLETE` - This condition validates that a dependent container runs to completion
       * (exits) before permitting other containers to start. This can be useful for nonessential
       * containers that run a script and then exit. This condition can't be set on an essential
       * container.
       * * `SUCCESS` - This condition is the same as `COMPLETE` , but it also requires that the
       * container exits with a `zero` status. This condition can't be set on an essential container.
       * * `HEALTHY` - This condition validates that the dependent container passes its Docker
       * health check before permitting other containers to start. This requires that the dependent
       * container has health checks configured. This condition is confirmed only at task startup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-condition)
       */
      override fun condition(): String? = unwrap(this).getCondition()

      /**
       * The name of a container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdependency.html#cfn-ecs-taskdefinition-containerdependency-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty):
          ContainerDependencyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerDependencyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDependencyProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty
    }
  }

  /**
   * The `Device` property specifies an object representing a container instance host device.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * DeviceProperty deviceProperty = DeviceProperty.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * .permissions(List.of("permissions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html)
   */
  public interface DeviceProperty {
    /**
     * The path inside the container at which to expose the host device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The path for the device on the host container instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
     */
    public fun hostPath(): String? = unwrap(this).getHostPath()

    /**
     * The explicit permissions to provide to the container for the device.
     *
     * By default, the container has permissions for `read` , `write` , and `mknod` for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
     */
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * A builder for [DeviceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The path inside the container at which to expose the host device.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param hostPath The path for the device on the host container instance.
       */
      public fun hostPath(hostPath: String)

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      public fun permissions(permissions: List<String>)

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      public fun permissions(vararg permissions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.builder()

      /**
       * @param containerPath The path inside the container at which to expose the host device.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param hostPath The path for the device on the host container instance.
       */
      override fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
      }

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      /**
       * @param permissions The explicit permissions to provide to the container for the device.
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       */
      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty,
    ) : CdkObject(cdkObject), DeviceProperty {
      /**
       * The path inside the container at which to expose the host device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * The path for the device on the host container instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-hostpath)
       */
      override fun hostPath(): String? = unwrap(this).getHostPath()

      /**
       * The explicit permissions to provide to the container for the device.
       *
       * By default, the container has permissions for `read` , `write` , and `mknod` for the
       * device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html#cfn-ecs-taskdefinition-device-permissions)
       */
      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty):
          DeviceProperty = CdkObjectWrappers.wrap(cdkObject) as? DeviceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty
    }
  }

  /**
   * The `DockerVolumeConfiguration` property specifies a Docker volume configuration and is used
   * when you use Docker volumes.
   *
   * Docker volumes are only supported when you are using the EC2 launch type. Windows containers
   * only support the use of the `local` driver. To use bind mounts, specify a `host` instead.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface DockerVolumeConfigurationProperty {
    /**
     * If this value is `true` , the Docker volume is created if it doesn't already exist.
     *
     *
     * This field is only used if the `scope` is `shared` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision)
     */
    public fun autoprovision(): Any? = unwrap(this).getAutoprovision()

    /**
     * The Docker volume driver to use.
     *
     * The driver value must match the driver name provided by Docker because it is used for task
     * placement. If the driver was installed using the Docker plugin CLI, use `docker plugin ls` to
     * retrieve the driver name from your container instance. If the driver was installed using another
     * method, use Docker plugin discovery to retrieve the driver name. For more information, see
     * [Docker plugin
     * discovery](https://docs.aws.amazon.com/https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery)
     * . This parameter maps to `Driver` in the [Create a
     * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxdriver`
     * option to [docker volume
     * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver)
     */
    public fun driver(): String? = unwrap(this).getDriver()

    /**
     * A map of Docker driver-specific options passed through.
     *
     * This parameter maps to `DriverOpts` in the [Create a
     * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
     * option to [docker volume
     * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts)
     */
    public fun driverOpts(): Any? = unwrap(this).getDriverOpts()

    /**
     * Custom metadata to add to your Docker volume.
     *
     * This parameter maps to `Labels` in the [Create a
     * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
     * option to [docker volume
     * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels)
     */
    public fun labels(): Any? = unwrap(this).getLabels()

    /**
     * The scope for the Docker volume that determines its lifecycle.
     *
     * Docker volumes that are scoped to a `task` are automatically provisioned when the task starts
     * and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the
     * task stops.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * A builder for [DockerVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
       * already exist.
       *
       * This field is only used if the `scope` is `shared` .
       */
      public fun autoprovision(autoprovision: Boolean)

      /**
       * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
       * already exist.
       *
       * This field is only used if the `scope` is `shared` .
       */
      public fun autoprovision(autoprovision: IResolvable)

      /**
       * @param driver The Docker volume driver to use.
       * The driver value must match the driver name provided by Docker because it is used for task
       * placement. If the driver was installed using the Docker plugin CLI, use `docker plugin ls` to
       * retrieve the driver name from your container instance. If the driver was installed using
       * another method, use Docker plugin discovery to retrieve the driver name. For more information,
       * see [Docker plugin
       * discovery](https://docs.aws.amazon.com/https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery)
       * . This parameter maps to `Driver` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxdriver`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      public fun driver(driver: String)

      /**
       * @param driverOpts A map of Docker driver-specific options passed through.
       * This parameter maps to `DriverOpts` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      public fun driverOpts(driverOpts: IResolvable)

      /**
       * @param driverOpts A map of Docker driver-specific options passed through.
       * This parameter maps to `DriverOpts` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      public fun driverOpts(driverOpts: Map<String, String>)

      /**
       * @param labels Custom metadata to add to your Docker volume.
       * This parameter maps to `Labels` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      public fun labels(labels: IResolvable)

      /**
       * @param labels Custom metadata to add to your Docker volume.
       * This parameter maps to `Labels` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      public fun labels(labels: Map<String, String>)

      /**
       * @param scope The scope for the Docker volume that determines its lifecycle.
       * Docker volumes that are scoped to a `task` are automatically provisioned when the task
       * starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist
       * after the task stops.
       */
      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.builder()

      /**
       * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
       * already exist.
       *
       * This field is only used if the `scope` is `shared` .
       */
      override fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
      }

      /**
       * @param autoprovision If this value is `true` , the Docker volume is created if it doesn't
       * already exist.
       *
       * This field is only used if the `scope` is `shared` .
       */
      override fun autoprovision(autoprovision: IResolvable) {
        cdkBuilder.autoprovision(autoprovision.let(IResolvable::unwrap))
      }

      /**
       * @param driver The Docker volume driver to use.
       * The driver value must match the driver name provided by Docker because it is used for task
       * placement. If the driver was installed using the Docker plugin CLI, use `docker plugin ls` to
       * retrieve the driver name from your container instance. If the driver was installed using
       * another method, use Docker plugin discovery to retrieve the driver name. For more information,
       * see [Docker plugin
       * discovery](https://docs.aws.amazon.com/https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery)
       * . This parameter maps to `Driver` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxdriver`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      override fun driver(driver: String) {
        cdkBuilder.driver(driver)
      }

      /**
       * @param driverOpts A map of Docker driver-specific options passed through.
       * This parameter maps to `DriverOpts` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      override fun driverOpts(driverOpts: IResolvable) {
        cdkBuilder.driverOpts(driverOpts.let(IResolvable::unwrap))
      }

      /**
       * @param driverOpts A map of Docker driver-specific options passed through.
       * This parameter maps to `DriverOpts` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      override fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
      }

      /**
       * @param labels Custom metadata to add to your Docker volume.
       * This parameter maps to `Labels` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      /**
       * @param labels Custom metadata to add to your Docker volume.
       * This parameter maps to `Labels` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       */
      override fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
      }

      /**
       * @param scope The scope for the Docker volume that determines its lifecycle.
       * Docker volumes that are scoped to a `task` are automatically provisioned when the task
       * starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist
       * after the task stops.
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), DockerVolumeConfigurationProperty {
      /**
       * If this value is `true` , the Docker volume is created if it doesn't already exist.
       *
       *
       * This field is only used if the `scope` is `shared` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-autoprovision)
       */
      override fun autoprovision(): Any? = unwrap(this).getAutoprovision()

      /**
       * The Docker volume driver to use.
       *
       * The driver value must match the driver name provided by Docker because it is used for task
       * placement. If the driver was installed using the Docker plugin CLI, use `docker plugin ls` to
       * retrieve the driver name from your container instance. If the driver was installed using
       * another method, use Docker plugin discovery to retrieve the driver name. For more information,
       * see [Docker plugin
       * discovery](https://docs.aws.amazon.com/https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery)
       * . This parameter maps to `Driver` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxdriver`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driver)
       */
      override fun driver(): String? = unwrap(this).getDriver()

      /**
       * A map of Docker driver-specific options passed through.
       *
       * This parameter maps to `DriverOpts` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxopt`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-driveropts)
       */
      override fun driverOpts(): Any? = unwrap(this).getDriverOpts()

      /**
       * Custom metadata to add to your Docker volume.
       *
       * This parameter maps to `Labels` in the [Create a
       * volume](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `xxlabel`
       * option to [docker volume
       * create](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/commandline/volume_create/)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-labels)
       */
      override fun labels(): Any? = unwrap(this).getLabels()

      /**
       * The scope for the Docker volume that determines its lifecycle.
       *
       * Docker volumes that are scoped to a `task` are automatically provisioned when the task
       * starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist
       * after the task stops.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-dockervolumeconfiguration.html#cfn-ecs-taskdefinition-dockervolumeconfiguration-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DockerVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty):
          DockerVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DockerVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DockerVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty
    }
  }

  /**
   * This parameter is specified when you're using an Amazon Elastic File System file system for
   * task storage.
   *
   * For more information, see [Amazon EFS
   * volumes](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface EFSVolumeConfigurationProperty {
    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-authorizationconfig)
     */
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    /**
     * The Amazon EFS file system ID to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-filesystemid)
     */
    public fun filesystemId(): String

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying `/`
     * will have the same effect as omitting this parameter.
     *
     *
     * If an EFS access point is specified in the `authorizationConfig` , the root directory
     * parameter must either be omitted or set to `/` which will enforce the path set on the EFS access
     * point.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-rootdirectory)
     */
    public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    /**
     * Determines whether to use encryption for Amazon EFS data in transit between the Amazon ECS
     * host and the Amazon EFS server.
     *
     * Transit encryption must be turned on if Amazon EFS IAM authorization is used. If this
     * parameter is omitted, the default value of `DISABLED` is used. For more information, see
     * [Encrypting data in
     * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
     * Elastic File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-transitencryption)
     */
    public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * If you do not specify a transit encryption port, it will use the port selection strategy that
     * the Amazon EFS mount helper uses. For more information, see [EFS mount
     * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon Elastic
     * File System User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-transitencryptionport)
     */
    public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    /**
     * A builder for [EFSVolumeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      public fun authorizationConfig(authorizationConfig: IResolvable)

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty)

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit)

      /**
       * @param filesystemId The Amazon EFS file system ID to use. 
       */
      public fun filesystemId(filesystemId: String)

      /**
       * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
       * directory inside the host.
       * If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying
       * `/` will have the same effect as omitting this parameter.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` which will enforce the path set on the EFS
       * access point.
       */
      public fun rootDirectory(rootDirectory: String)

      /**
       * @param transitEncryption Determines whether to use encryption for Amazon EFS data in
       * transit between the Amazon ECS host and the Amazon EFS server.
       * Transit encryption must be turned on if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun transitEncryption(transitEncryption: String)

      /**
       * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
       * ECS host and the Amazon EFS server.
       * If you do not specify a transit encryption port, it will use the port selection strategy
       * that the Amazon EFS mount helper uses. For more information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      public fun transitEncryptionPort(transitEncryptionPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.builder()

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      /**
       * @param authorizationConfig The authorization configuration details for the Amazon EFS file
       * system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      /**
       * @param filesystemId The Amazon EFS file system ID to use. 
       */
      override fun filesystemId(filesystemId: String) {
        cdkBuilder.filesystemId(filesystemId)
      }

      /**
       * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
       * directory inside the host.
       * If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying
       * `/` will have the same effect as omitting this parameter.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` which will enforce the path set on the EFS
       * access point.
       */
      override fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
      }

      /**
       * @param transitEncryption Determines whether to use encryption for Amazon EFS data in
       * transit between the Amazon ECS host and the Amazon EFS server.
       * Transit encryption must be turned on if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
      }

      /**
       * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
       * ECS host and the Amazon EFS server.
       * If you do not specify a transit encryption port, it will use the port selection strategy
       * that the Amazon EFS mount helper uses. For more information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       */
      override fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), EFSVolumeConfigurationProperty {
      /**
       * The authorization configuration details for the Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-authorizationconfig)
       */
      override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      /**
       * The Amazon EFS file system ID to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-filesystemid)
       */
      override fun filesystemId(): String = unwrap(this).getFilesystemId()

      /**
       * The directory within the Amazon EFS file system to mount as the root directory inside the
       * host.
       *
       * If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying
       * `/` will have the same effect as omitting this parameter.
       *
       *
       * If an EFS access point is specified in the `authorizationConfig` , the root directory
       * parameter must either be omitted or set to `/` which will enforce the path set on the EFS
       * access point.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-rootdirectory)
       */
      override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

      /**
       * Determines whether to use encryption for Amazon EFS data in transit between the Amazon ECS
       * host and the Amazon EFS server.
       *
       * Transit encryption must be turned on if Amazon EFS IAM authorization is used. If this
       * parameter is omitted, the default value of `DISABLED` is used. For more information, see
       * [Encrypting data in
       * transit](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-transitencryption)
       */
      override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

      /**
       * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
       * server.
       *
       * If you do not specify a transit encryption port, it will use the port selection strategy
       * that the Amazon EFS mount helper uses. For more information, see [EFS mount
       * helper](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html) in the *Amazon
       * Elastic File System User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-efsvolumeconfiguration.html#cfn-ecs-taskdefinition-efsvolumeconfiguration-transitencryptionport)
       */
      override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EFSVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty):
          EFSVolumeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EFSVolumeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty
    }
  }

  /**
   * A list of files containing the environment variables to pass to a container.
   *
   * You can specify up to ten environment files. The file must have a `.env` file extension. Each
   * line in an environment file should contain an environment variable in `VARIABLE=VALUE` format.
   * Lines beginning with `#` are treated as comments and are ignored.
   *
   * If there are environment variables specified using the `environment` parameter in a container
   * definition, they take precedence over the variables contained within an environment file. If
   * multiple environment files are specified that contain the same variable, they're processed from
   * the top down. We recommend that you use unique variable names. For more information, see
   * [Specifying environment
   * variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html) in
   * the *Amazon Elastic Container Service Developer Guide* .
   *
   * You must use the following platforms for the Fargate launch type:
   *
   * * Linux platform version `1.4.0` or later.
   * * Windows platform version `1.0.0` or later.
   *
   * Consider the following when using the Fargate launch type:
   *
   * * The file is handled like a native Docker env-file.
   * * There is no support for shell escape handling.
   * * The container entry point interperts the `VARIABLE` values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * EnvironmentFileProperty environmentFileProperty = EnvironmentFileProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html)
   */
  public interface EnvironmentFileProperty {
    /**
     * The file type to use.
     *
     * The only supported value is `s3` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html#cfn-ecs-taskdefinition-environmentfile-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable
     * file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html#cfn-ecs-taskdefinition-environmentfile-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [EnvironmentFileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The file type to use.
       * The only supported value is `s3` .
       */
      public fun type(type: String)

      /**
       * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the
       * environment variable file.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.builder()

      /**
       * @param type The file type to use.
       * The only supported value is `s3` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the
       * environment variable file.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty,
    ) : CdkObject(cdkObject), EnvironmentFileProperty {
      /**
       * The file type to use.
       *
       * The only supported value is `s3` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html#cfn-ecs-taskdefinition-environmentfile-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable
       * file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html#cfn-ecs-taskdefinition-environmentfile-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty):
          EnvironmentFileProperty = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentFileProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentFileProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty
    }
  }

  /**
   * The amount of ephemeral storage to allocate for the task.
   *
   * This parameter is used to expand the total amount of ephemeral storage available, beyond the
   * default amount, for tasks hosted on AWS Fargate . For more information, see [Using data volumes in
   * tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) in the
   * *Amazon ECS Developer Guide;* .
   *
   *
   * For tasks using the Fargate launch type, the task requires the following platforms:
   *
   * * Linux platform version `1.4.0` or later.
   * * Windows platform version `1.0.0` or later.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * EphemeralStorageProperty ephemeralStorageProperty = EphemeralStorageProperty.builder()
   * .sizeInGiB(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ephemeralstorage.html)
   */
  public interface EphemeralStorageProperty {
    /**
     * The total amount, in GiB, of ephemeral storage to set for the task.
     *
     * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ephemeralstorage.html#cfn-ecs-taskdefinition-ephemeralstorage-sizeingib)
     */
    public fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

    /**
     * A builder for [EphemeralStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task.
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.builder()

      /**
       * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task.
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       */
      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty,
    ) : CdkObject(cdkObject), EphemeralStorageProperty {
      /**
       * The total amount, in GiB, of ephemeral storage to set for the task.
       *
       * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ephemeralstorage.html#cfn-ecs-taskdefinition-ephemeralstorage-sizeingib)
       */
      override fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty):
          EphemeralStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? EphemeralStorageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty
    }
  }

  /**
   * The FireLens configuration for the container.
   *
   * This is used to specify and configure a log router for container logs. For more information,
   * see [Custom log
   * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface FirelensConfigurationProperty {
    /**
     * The options to use when configuring the log router.
     *
     * This field is optional and can be used to add additional metadata, such as the task, task
     * definition, cluster, and container instance details to the log event.
     *
     * If specified, valid option keys are:
     *
     * * `enable-ecs-log-metadata` , which can be `true` or `false`
     * * `config-file-type` , which can be `s3` or `file`
     * * `config-file-value` , which is either an S3 ARN or a file path
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html#cfn-ecs-taskdefinition-firelensconfiguration-options)
     */
    public fun options(): Any? = unwrap(this).getOptions()

    /**
     * The log router to use.
     *
     * The valid values are `fluentd` or `fluentbit` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html#cfn-ecs-taskdefinition-firelensconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [FirelensConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param options The options to use when configuring the log router.
       * This field is optional and can be used to add additional metadata, such as the task, task
       * definition, cluster, and container instance details to the log event.
       *
       * If specified, valid option keys are:
       *
       * * `enable-ecs-log-metadata` , which can be `true` or `false`
       * * `config-file-type` , which can be `s3` or `file`
       * * `config-file-value` , which is either an S3 ARN or a file path
       */
      public fun options(options: IResolvable)

      /**
       * @param options The options to use when configuring the log router.
       * This field is optional and can be used to add additional metadata, such as the task, task
       * definition, cluster, and container instance details to the log event.
       *
       * If specified, valid option keys are:
       *
       * * `enable-ecs-log-metadata` , which can be `true` or `false`
       * * `config-file-type` , which can be `s3` or `file`
       * * `config-file-value` , which is either an S3 ARN or a file path
       */
      public fun options(options: Map<String, String>)

      /**
       * @param type The log router to use.
       * The valid values are `fluentd` or `fluentbit` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.builder()

      /**
       * @param options The options to use when configuring the log router.
       * This field is optional and can be used to add additional metadata, such as the task, task
       * definition, cluster, and container instance details to the log event.
       *
       * If specified, valid option keys are:
       *
       * * `enable-ecs-log-metadata` , which can be `true` or `false`
       * * `config-file-type` , which can be `s3` or `file`
       * * `config-file-value` , which is either an S3 ARN or a file path
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The options to use when configuring the log router.
       * This field is optional and can be used to add additional metadata, such as the task, task
       * definition, cluster, and container instance details to the log event.
       *
       * If specified, valid option keys are:
       *
       * * `enable-ecs-log-metadata` , which can be `true` or `false`
       * * `config-file-type` , which can be `s3` or `file`
       * * `config-file-value` , which is either an S3 ARN or a file path
       */
      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param type The log router to use.
       * The valid values are `fluentd` or `fluentbit` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty,
    ) : CdkObject(cdkObject), FirelensConfigurationProperty {
      /**
       * The options to use when configuring the log router.
       *
       * This field is optional and can be used to add additional metadata, such as the task, task
       * definition, cluster, and container instance details to the log event.
       *
       * If specified, valid option keys are:
       *
       * * `enable-ecs-log-metadata` , which can be `true` or `false`
       * * `config-file-type` , which can be `s3` or `file`
       * * `config-file-value` , which is either an S3 ARN or a file path
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html#cfn-ecs-taskdefinition-firelensconfiguration-options)
       */
      override fun options(): Any? = unwrap(this).getOptions()

      /**
       * The log router to use.
       *
       * The valid values are `fluentd` or `fluentbit` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html#cfn-ecs-taskdefinition-firelensconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty):
          FirelensConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FirelensConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirelensConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty
    }
  }

  /**
   * The `HealthCheck` property specifies an object representing a container health check.
   *
   * Health check parameters that are specified in a container definition override any Docker health
   * checks that exist in the container image (such as those specified in a parent image or from the
   * image's Dockerfile). This configuration maps to the `HEALTHCHECK` parameter of [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/) .
   *
   *
   * The Amazon ECS container agent only monitors and reports on the health checks specified in the
   * task definition. Amazon ECS does not monitor Docker health checks that are embedded in a container
   * image and not specified in the container definition. Health check parameters that are specified in
   * a container definition override any Docker health checks that exist in the container image.
   *
   *
   * If a task is run manually, and not as part of a service, the task will continue its lifecycle
   * regardless of its health status. For tasks that are part of a service, if the task reports as
   * unhealthy then the task will be stopped and the service scheduler will replace it.
   *
   * The following are notes about container health check support:
   *
   * * Container health checks require version 1.17.0 or greater of the Amazon ECS container agent.
   * For more information, see [Updating the Amazon ECS Container
   * Agent](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-agent-update.html) .
   * * Container health checks are supported for Fargate tasks if you are using platform version
   * 1.1.0 or greater. For more information, see [AWS Fargate Platform
   * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) .
   * * Container health checks are not supported for tasks that are part of a service that is
   * configured to use a Classic Load Balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface HealthCheckProperty {
    /**
     * A string array representing the command that the container runs to determine if it is
     * healthy.
     *
     * The string array must start with `CMD` to run the command arguments directly, or `CMD-SHELL`
     * to run the command with the container's default shell.
     *
     * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
     * APIs, enclose the list of commands in double quotes and brackets.
     *
     * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
     *
     * You don't include the double quotes and brackets when you use the AWS Management Console.
     *
     * `CMD-SHELL, curl -f http://localhost/ || exit 1`
     *
     * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
     * information, see `HealthCheck` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command)
     */
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The time period in seconds between each health check execution.
     *
     * You may specify between 5 and 300 seconds. The default value is 30 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval)
     */
    public fun interval(): Number? = unwrap(this).getInterval()

    /**
     * The number of times to retry a failed health check before the container is considered
     * unhealthy.
     *
     * You may specify between 1 and 10 retries. The default value is 3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries)
     */
    public fun retries(): Number? = unwrap(this).getRetries()

    /**
     * The optional grace period to provide containers time to bootstrap before failed health checks
     * count towards the maximum number of retries.
     *
     * You can specify between 0 and 300 seconds. By default, the `startPeriod` is off.
     *
     *
     * If a health check succeeds within the `startPeriod` , then the container is considered
     * healthy and any subsequent failures count toward the maximum number of retries.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod)
     */
    public fun startPeriod(): Number? = unwrap(this).getStartPeriod()

    /**
     * The time period in seconds to wait for a health check to succeed before it is considered a
     * failure.
     *
     * You may specify between 2 and 60 seconds. The default value is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * A builder for [HealthCheckProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param command A string array representing the command that the container runs to determine
       * if it is healthy.
       * The string array must start with `CMD` to run the command arguments directly, or
       * `CMD-SHELL` to run the command with the container's default shell.
       *
       * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
       * APIs, enclose the list of commands in double quotes and brackets.
       *
       * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
       *
       * You don't include the double quotes and brackets when you use the AWS Management Console.
       *
       * `CMD-SHELL, curl -f http://localhost/ || exit 1`
       *
       * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
       * information, see `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       */
      public fun command(command: List<String>)

      /**
       * @param command A string array representing the command that the container runs to determine
       * if it is healthy.
       * The string array must start with `CMD` to run the command arguments directly, or
       * `CMD-SHELL` to run the command with the container's default shell.
       *
       * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
       * APIs, enclose the list of commands in double quotes and brackets.
       *
       * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
       *
       * You don't include the double quotes and brackets when you use the AWS Management Console.
       *
       * `CMD-SHELL, curl -f http://localhost/ || exit 1`
       *
       * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
       * information, see `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       */
      public fun command(vararg command: String)

      /**
       * @param interval The time period in seconds between each health check execution.
       * You may specify between 5 and 300 seconds. The default value is 30 seconds.
       */
      public fun interval(interval: Number)

      /**
       * @param retries The number of times to retry a failed health check before the container is
       * considered unhealthy.
       * You may specify between 1 and 10 retries. The default value is 3.
       */
      public fun retries(retries: Number)

      /**
       * @param startPeriod The optional grace period to provide containers time to bootstrap before
       * failed health checks count towards the maximum number of retries.
       * You can specify between 0 and 300 seconds. By default, the `startPeriod` is off.
       *
       *
       * If a health check succeeds within the `startPeriod` , then the container is considered
       * healthy and any subsequent failures count toward the maximum number of retries.
       */
      public fun startPeriod(startPeriod: Number)

      /**
       * @param timeout The time period in seconds to wait for a health check to succeed before it
       * is considered a failure.
       * You may specify between 2 and 60 seconds. The default value is 5.
       */
      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.builder()

      /**
       * @param command A string array representing the command that the container runs to determine
       * if it is healthy.
       * The string array must start with `CMD` to run the command arguments directly, or
       * `CMD-SHELL` to run the command with the container's default shell.
       *
       * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
       * APIs, enclose the list of commands in double quotes and brackets.
       *
       * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
       *
       * You don't include the double quotes and brackets when you use the AWS Management Console.
       *
       * `CMD-SHELL, curl -f http://localhost/ || exit 1`
       *
       * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
       * information, see `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       */
      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      /**
       * @param command A string array representing the command that the container runs to determine
       * if it is healthy.
       * The string array must start with `CMD` to run the command arguments directly, or
       * `CMD-SHELL` to run the command with the container's default shell.
       *
       * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
       * APIs, enclose the list of commands in double quotes and brackets.
       *
       * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
       *
       * You don't include the double quotes and brackets when you use the AWS Management Console.
       *
       * `CMD-SHELL, curl -f http://localhost/ || exit 1`
       *
       * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
       * information, see `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       */
      override fun command(vararg command: String): Unit = command(command.toList())

      /**
       * @param interval The time period in seconds between each health check execution.
       * You may specify between 5 and 300 seconds. The default value is 30 seconds.
       */
      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param retries The number of times to retry a failed health check before the container is
       * considered unhealthy.
       * You may specify between 1 and 10 retries. The default value is 3.
       */
      override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      /**
       * @param startPeriod The optional grace period to provide containers time to bootstrap before
       * failed health checks count towards the maximum number of retries.
       * You can specify between 0 and 300 seconds. By default, the `startPeriod` is off.
       *
       *
       * If a health check succeeds within the `startPeriod` , then the container is considered
       * healthy and any subsequent failures count toward the maximum number of retries.
       */
      override fun startPeriod(startPeriod: Number) {
        cdkBuilder.startPeriod(startPeriod)
      }

      /**
       * @param timeout The time period in seconds to wait for a health check to succeed before it
       * is considered a failure.
       * You may specify between 2 and 60 seconds. The default value is 5.
       */
      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty,
    ) : CdkObject(cdkObject), HealthCheckProperty {
      /**
       * A string array representing the command that the container runs to determine if it is
       * healthy.
       *
       * The string array must start with `CMD` to run the command arguments directly, or
       * `CMD-SHELL` to run the command with the container's default shell.
       *
       * When you use the AWS Management Console JSON panel, the AWS Command Line Interface , or the
       * APIs, enclose the list of commands in double quotes and brackets.
       *
       * `[ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]`
       *
       * You don't include the double quotes and brackets when you use the AWS Management Console.
       *
       * `CMD-SHELL, curl -f http://localhost/ || exit 1`
       *
       * An exit code of 0 indicates success, and non-zero exit code indicates failure. For more
       * information, see `HealthCheck` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-command)
       */
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      /**
       * The time period in seconds between each health check execution.
       *
       * You may specify between 5 and 300 seconds. The default value is 30 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-interval)
       */
      override fun interval(): Number? = unwrap(this).getInterval()

      /**
       * The number of times to retry a failed health check before the container is considered
       * unhealthy.
       *
       * You may specify between 1 and 10 retries. The default value is 3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-retries)
       */
      override fun retries(): Number? = unwrap(this).getRetries()

      /**
       * The optional grace period to provide containers time to bootstrap before failed health
       * checks count towards the maximum number of retries.
       *
       * You can specify between 0 and 300 seconds. By default, the `startPeriod` is off.
       *
       *
       * If a health check succeeds within the `startPeriod` , then the container is considered
       * healthy and any subsequent failures count toward the maximum number of retries.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-startperiod)
       */
      override fun startPeriod(): Number? = unwrap(this).getStartPeriod()

      /**
       * The time period in seconds to wait for a health check to succeed before it is considered a
       * failure.
       *
       * You may specify between 2 and 60 seconds. The default value is 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html#cfn-ecs-taskdefinition-healthcheck-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty):
          HealthCheckProperty = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty
    }
  }

  /**
   * The `HostEntry` property specifies a hostname and an IP address that are added to the
   * `/etc/hosts` file of a container through the `extraHosts` parameter of its `ContainerDefinition`
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * HostEntryProperty hostEntryProperty = HostEntryProperty.builder()
   * .hostname("hostname")
   * .ipAddress("ipAddress")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html)
   */
  public interface HostEntryProperty {
    /**
     * The hostname to use in the `/etc/hosts` entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html#cfn-ecs-taskdefinition-hostentry-hostname)
     */
    public fun hostname(): String? = unwrap(this).getHostname()

    /**
     * The IP address to use in the `/etc/hosts` entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html#cfn-ecs-taskdefinition-hostentry-ipaddress)
     */
    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    /**
     * A builder for [HostEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostname The hostname to use in the `/etc/hosts` entry.
       */
      public fun hostname(hostname: String)

      /**
       * @param ipAddress The IP address to use in the `/etc/hosts` entry.
       */
      public fun ipAddress(ipAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.builder()

      /**
       * @param hostname The hostname to use in the `/etc/hosts` entry.
       */
      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      /**
       * @param ipAddress The IP address to use in the `/etc/hosts` entry.
       */
      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty,
    ) : CdkObject(cdkObject), HostEntryProperty {
      /**
       * The hostname to use in the `/etc/hosts` entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html#cfn-ecs-taskdefinition-hostentry-hostname)
       */
      override fun hostname(): String? = unwrap(this).getHostname()

      /**
       * The IP address to use in the `/etc/hosts` entry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostentry.html#cfn-ecs-taskdefinition-hostentry-ipaddress)
       */
      override fun ipAddress(): String? = unwrap(this).getIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty):
          HostEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? HostEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostEntryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty
    }
  }

  /**
   * The `HostVolumeProperties` property specifies details on a container instance bind mount host
   * volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * HostVolumePropertiesProperty hostVolumePropertiesProperty =
   * HostVolumePropertiesProperty.builder()
   * .sourcePath("sourcePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostvolumeproperties.html)
   */
  public interface HostVolumePropertiesProperty {
    /**
     * When the `host` parameter is used, specify a `sourcePath` to declare the path on the host
     * container instance that's presented to the container.
     *
     * If this parameter is empty, then the Docker daemon has assigned a host path for you. If the
     * `host` parameter contains a `sourcePath` file location, then the data volume persists at the
     * specified location on the host container instance until you delete it manually. If the
     * `sourcePath` value doesn't exist on the host container instance, the Docker daemon creates it.
     * If the location does exist, the contents of the source path folder are exported.
     *
     * If you're using the Fargate launch type, the `sourcePath` parameter is not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostvolumeproperties.html#cfn-ecs-taskdefinition-hostvolumeproperties-sourcepath)
     */
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    /**
     * A builder for [HostVolumePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourcePath When the `host` parameter is used, specify a `sourcePath` to declare the
       * path on the host container instance that's presented to the container.
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If the
       * `host` parameter contains a `sourcePath` file location, then the data volume persists at the
       * specified location on the host container instance until you delete it manually. If the
       * `sourcePath` value doesn't exist on the host container instance, the Docker daemon creates it.
       * If the location does exist, the contents of the source path folder are exported.
       *
       * If you're using the Fargate launch type, the `sourcePath` parameter is not supported.
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.builder()

      /**
       * @param sourcePath When the `host` parameter is used, specify a `sourcePath` to declare the
       * path on the host container instance that's presented to the container.
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If the
       * `host` parameter contains a `sourcePath` file location, then the data volume persists at the
       * specified location on the host container instance until you delete it manually. If the
       * `sourcePath` value doesn't exist on the host container instance, the Docker daemon creates it.
       * If the location does exist, the contents of the source path folder are exported.
       *
       * If you're using the Fargate launch type, the `sourcePath` parameter is not supported.
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty,
    ) : CdkObject(cdkObject), HostVolumePropertiesProperty {
      /**
       * When the `host` parameter is used, specify a `sourcePath` to declare the path on the host
       * container instance that's presented to the container.
       *
       * If this parameter is empty, then the Docker daemon has assigned a host path for you. If the
       * `host` parameter contains a `sourcePath` file location, then the data volume persists at the
       * specified location on the host container instance until you delete it manually. If the
       * `sourcePath` value doesn't exist on the host container instance, the Docker daemon creates it.
       * If the location does exist, the contents of the source path folder are exported.
       *
       * If you're using the Fargate launch type, the `sourcePath` parameter is not supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-hostvolumeproperties.html#cfn-ecs-taskdefinition-hostvolumeproperties-sourcepath)
       */
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty):
          HostVolumePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HostVolumePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostVolumePropertiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty
    }
  }

  /**
   * Details on an Elastic Inference accelerator.
   *
   * For more information, see [Working with Amazon Elastic Inference on Amazon
   * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * InferenceAcceleratorProperty inferenceAcceleratorProperty =
   * InferenceAcceleratorProperty.builder()
   * .deviceName("deviceName")
   * .deviceType("deviceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html)
   */
  public interface InferenceAcceleratorProperty {
    /**
     * The Elastic Inference accelerator device name.
     *
     * The `deviceName` must also be referenced in a container definition as a
     * [ResourceRequirement](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ResourceRequirement.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html#cfn-ecs-taskdefinition-inferenceaccelerator-devicename)
     */
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * The Elastic Inference accelerator type to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html#cfn-ecs-taskdefinition-inferenceaccelerator-devicetype)
     */
    public fun deviceType(): String? = unwrap(this).getDeviceType()

    /**
     * A builder for [InferenceAcceleratorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deviceName The Elastic Inference accelerator device name.
       * The `deviceName` must also be referenced in a container definition as a
       * [ResourceRequirement](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ResourceRequirement.html)
       * .
       */
      public fun deviceName(deviceName: String)

      /**
       * @param deviceType The Elastic Inference accelerator type to use.
       */
      public fun deviceType(deviceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.builder()

      /**
       * @param deviceName The Elastic Inference accelerator device name.
       * The `deviceName` must also be referenced in a container definition as a
       * [ResourceRequirement](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ResourceRequirement.html)
       * .
       */
      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      /**
       * @param deviceType The Elastic Inference accelerator type to use.
       */
      override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty,
    ) : CdkObject(cdkObject), InferenceAcceleratorProperty {
      /**
       * The Elastic Inference accelerator device name.
       *
       * The `deviceName` must also be referenced in a container definition as a
       * [ResourceRequirement](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ResourceRequirement.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html#cfn-ecs-taskdefinition-inferenceaccelerator-devicename)
       */
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      /**
       * The Elastic Inference accelerator type to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-inferenceaccelerator.html#cfn-ecs-taskdefinition-inferenceaccelerator-devicetype)
       */
      override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty):
          InferenceAcceleratorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InferenceAcceleratorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceAcceleratorProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty
    }
  }

  /**
   * The Linux capabilities to add or remove from the default Docker configuration for a container
   * defined in the task definition.
   *
   * For more information about the default capabilities and the non-default available capabilities,
   * see [Runtime privilege and Linux
   * capabilities](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities)
   * in the *Docker run reference* . For more detailed information about these Linux capabilities, see
   * the
   * [capabilities(7)](https://docs.aws.amazon.com/http://man7.org/linux/man-pages/man7/capabilities.7.html)
   * Linux manual page.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * KernelCapabilitiesProperty kernelCapabilitiesProperty = KernelCapabilitiesProperty.builder()
   * .add(List.of("add"))
   * .drop(List.of("drop"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html)
   */
  public interface KernelCapabilitiesProperty {
    /**
     * The Linux capabilities for the container that have been added to the default configuration
     * provided by Docker.
     *
     * This parameter maps to `CapAdd` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-add`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
     *
     *
     * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
     * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
     * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
     * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
     * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE"
     * | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
     */
    public fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

    /**
     * The Linux capabilities for the container that have been removed from the default
     * configuration provided by Docker.
     *
     * This parameter maps to `CapDrop` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--cap-drop`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
     * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
     * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
     * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" |
     * "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE"
     * | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
     */
    public fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()

    /**
     * A builder for [KernelCapabilitiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param add The Linux capabilities for the container that have been added to the default
       * configuration provided by Docker.
       * This parameter maps to `CapAdd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-add` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
       *
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      public fun add(add: List<String>)

      /**
       * @param add The Linux capabilities for the container that have been added to the default
       * configuration provided by Docker.
       * This parameter maps to `CapAdd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-add` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
       *
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      public fun add(vararg add: String)

      /**
       * @param drop The Linux capabilities for the container that have been removed from the
       * default configuration provided by Docker.
       * This parameter maps to `CapDrop` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-drop` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      public fun drop(drop: List<String>)

      /**
       * @param drop The Linux capabilities for the container that have been removed from the
       * default configuration provided by Docker.
       * This parameter maps to `CapDrop` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-drop` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      public fun drop(vararg drop: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.builder()

      /**
       * @param add The Linux capabilities for the container that have been added to the default
       * configuration provided by Docker.
       * This parameter maps to `CapAdd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-add` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
       *
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      override fun add(add: List<String>) {
        cdkBuilder.add(add)
      }

      /**
       * @param add The Linux capabilities for the container that have been added to the default
       * configuration provided by Docker.
       * This parameter maps to `CapAdd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-add` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
       *
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      override fun add(vararg add: String): Unit = add(add.toList())

      /**
       * @param drop The Linux capabilities for the container that have been removed from the
       * default configuration provided by Docker.
       * This parameter maps to `CapDrop` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-drop` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      override fun drop(drop: List<String>) {
        cdkBuilder.drop(drop)
      }

      /**
       * @param drop The Linux capabilities for the container that have been removed from the
       * default configuration provided by Docker.
       * This parameter maps to `CapDrop` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-drop` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       */
      override fun drop(vararg drop: String): Unit = drop(drop.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty,
    ) : CdkObject(cdkObject), KernelCapabilitiesProperty {
      /**
       * The Linux capabilities for the container that have been added to the default configuration
       * provided by Docker.
       *
       * This parameter maps to `CapAdd` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-add` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * Tasks launched on AWS Fargate only support adding the `SYS_PTRACE` kernel capability.
       *
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-add)
       */
      override fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

      /**
       * The Linux capabilities for the container that have been removed from the default
       * configuration provided by Docker.
       *
       * This parameter maps to `CapDrop` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the
       * `--cap-drop` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       * Valid values: `"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" |
       * "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" |
       * "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" |
       * "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID"
       * | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" |
       * "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" |
       * "WAKE_ALARM"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-kernelcapabilities.html#cfn-ecs-taskdefinition-kernelcapabilities-drop)
       */
      override fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty):
          KernelCapabilitiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KernelCapabilitiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelCapabilitiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty
    }
  }

  /**
   * A key-value pair object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html)
   */
  public interface KeyValuePairProperty {
    /**
     * The name of the key-value pair.
     *
     * For environment variables, this is the name of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html#cfn-ecs-taskdefinition-keyvaluepair-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the key-value pair.
     *
     * For environment variables, this is the value of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html#cfn-ecs-taskdefinition-keyvaluepair-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [KeyValuePairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      public fun name(name: String)

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.builder()

      /**
       * @param name The name of the key-value pair.
       * For environment variables, this is the name of the environment variable.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the key-value pair.
       * For environment variables, this is the value of the environment variable.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty,
    ) : CdkObject(cdkObject), KeyValuePairProperty {
      /**
       * The name of the key-value pair.
       *
       * For environment variables, this is the name of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html#cfn-ecs-taskdefinition-keyvaluepair-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the key-value pair.
       *
       * For environment variables, this is the value of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html#cfn-ecs-taskdefinition-keyvaluepair-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty):
          KeyValuePairProperty = CdkObjectWrappers.wrap(cdkObject) as? KeyValuePairProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValuePairProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty
    }
  }

  /**
   * The Linux-specific options that are applied to the container, such as Linux
   * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface LinuxParametersProperty {
    /**
     * The Linux capabilities for the container that are added to or dropped from the default
     * configuration provided by Docker.
     *
     *
     * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
     * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
     */
    public fun capabilities(): Any? = unwrap(this).getCapabilities()

    /**
     * Any host devices to expose to the container.
     *
     * This parameter maps to `Devices` in the [Create a
     * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
     * section of the [Docker Remote
     * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
     * option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
     * supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
     */
    public fun devices(): Any? = unwrap(this).getDevices()

    /**
     * Run an `init` process inside the container that forwards signals and reaps processes.
     *
     * This parameter maps to the `--init` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
     */
    public fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

    /**
     * The total amount of swap memory (in MiB) a container can use.
     *
     * This parameter will be translated to the `--memory-swap` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * where the value would be the sum of the container memory plus the `maxSwap` value.
     *
     * If a `maxSwap` value of `0` is specified, the container will not use swap. Accepted values
     * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container will use
     * the swap configuration for the container instance it is running on. A `maxSwap` value must be
     * set for the `swappiness` parameter to be used.
     *
     *
     * If you're using tasks that use the Fargate launch type, the `maxSwap` parameter isn't
     * supported.
     *
     * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap)
     */
    public fun maxSwap(): Number? = unwrap(this).getMaxSwap()

    /**
     * The value for the size (in MiB) of the `/dev/shm` volume.
     *
     * This parameter maps to the `--shm-size` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * If you are using tasks that use the Fargate launch type, the `sharedMemorySize` parameter is
     * not supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize)
     */
    public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    /**
     * This allows you to tune a container's memory swappiness behavior.
     *
     * A `swappiness` value of `0` will cause swapping to not happen unless absolutely necessary. A
     * `swappiness` value of `100` will cause pages to be swapped very aggressively. Accepted values
     * are whole numbers between `0` and `100` . If the `swappiness` parameter is not specified, a
     * default value of `60` is used. If a value is not specified for `maxSwap` then this parameter is
     * ignored. This parameter maps to the `--memory-swappiness` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * If you're using tasks that use the Fargate launch type, the `swappiness` parameter isn't
     * supported.
     *
     * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness)
     */
    public fun swappiness(): Number? = unwrap(this).getSwappiness()

    /**
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     *
     * This parameter maps to the `--tmpfs` option to [docker
     * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
     * .
     *
     *
     * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
     * supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs)
     */
    public fun tmpfs(): Any? = unwrap(this).getTmpfs()

    /**
     * A builder for [LinuxParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      public fun capabilities(capabilities: IResolvable)

      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      public fun capabilities(capabilities: KernelCapabilitiesProperty)

      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      public fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit)

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      public fun devices(devices: IResolvable)

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      public fun devices(devices: List<Any>)

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      public fun devices(vararg devices: Any)

      /**
       * @param initProcessEnabled Run an `init` process inside the container that forwards signals
       * and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun initProcessEnabled(initProcessEnabled: Boolean)

      /**
       * @param initProcessEnabled Run an `init` process inside the container that forwards signals
       * and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun initProcessEnabled(initProcessEnabled: IResolvable)

      /**
       * @param maxSwap The total amount of swap memory (in MiB) a container can use.
       * This parameter will be translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * where the value would be the sum of the container memory plus the `maxSwap` value.
       *
       * If a `maxSwap` value of `0` is specified, the container will not use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container will use
       * the swap configuration for the container instance it is running on. A `maxSwap` value must be
       * set for the `swappiness` parameter to be used.
       *
       *
       * If you're using tasks that use the Fargate launch type, the `maxSwap` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       */
      public fun maxSwap(maxSwap: Number)

      /**
       * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume.
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you are using tasks that use the Fargate launch type, the `sharedMemorySize` parameter
       * is not supported.
       */
      public fun sharedMemorySize(sharedMemorySize: Number)

      /**
       * @param swappiness This allows you to tune a container's memory swappiness behavior.
       * A `swappiness` value of `0` will cause swapping to not happen unless absolutely necessary.
       * A `swappiness` value of `100` will cause pages to be swapped very aggressively. Accepted
       * values are whole numbers between `0` and `100` . If the `swappiness` parameter is not
       * specified, a default value of `60` is used. If a value is not specified for `maxSwap` then
       * this parameter is ignored. This parameter maps to the `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `swappiness` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       */
      public fun swappiness(swappiness: Number)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      public fun tmpfs(tmpfs: IResolvable)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      public fun tmpfs(tmpfs: List<Any>)

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      public fun tmpfs(vararg tmpfs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.builder()

      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      override fun capabilities(capabilities: IResolvable) {
        cdkBuilder.capabilities(capabilities.let(IResolvable::unwrap))
      }

      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      override fun capabilities(capabilities: KernelCapabilitiesProperty) {
        cdkBuilder.capabilities(capabilities.let(KernelCapabilitiesProperty::unwrap))
      }

      /**
       * @param capabilities The Linux capabilities for the container that are added to or dropped
       * from the default configuration provided by Docker.
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      override fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit): Unit =
          capabilities(KernelCapabilitiesProperty(capabilities))

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      /**
       * @param devices Any host devices to expose to the container.
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       */
      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      /**
       * @param initProcessEnabled Run an `init` process inside the container that forwards signals
       * and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
      }

      /**
       * @param initProcessEnabled Run an `init` process inside the container that forwards signals
       * and reaps processes.
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param maxSwap The total amount of swap memory (in MiB) a container can use.
       * This parameter will be translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * where the value would be the sum of the container memory plus the `maxSwap` value.
       *
       * If a `maxSwap` value of `0` is specified, the container will not use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container will use
       * the swap configuration for the container instance it is running on. A `maxSwap` value must be
       * set for the `swappiness` parameter to be used.
       *
       *
       * If you're using tasks that use the Fargate launch type, the `maxSwap` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       */
      override fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
      }

      /**
       * @param sharedMemorySize The value for the size (in MiB) of the `/dev/shm` volume.
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you are using tasks that use the Fargate launch type, the `sharedMemorySize` parameter
       * is not supported.
       */
      override fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
      }

      /**
       * @param swappiness This allows you to tune a container's memory swappiness behavior.
       * A `swappiness` value of `0` will cause swapping to not happen unless absolutely necessary.
       * A `swappiness` value of `100` will cause pages to be swapped very aggressively. Accepted
       * values are whole numbers between `0` and `100` . If the `swappiness` parameter is not
       * specified, a default value of `60` is used. If a value is not specified for `maxSwap` then
       * this parameter is ignored. This parameter maps to the `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `swappiness` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       */
      override fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      override fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs.let(IResolvable::unwrap))
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      override fun tmpfs(tmpfs: List<Any>) {
        cdkBuilder.tmpfs(tmpfs)
      }

      /**
       * @param tmpfs The container path, mount options, and size (in MiB) of the tmpfs mount.
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       */
      override fun tmpfs(vararg tmpfs: Any): Unit = tmpfs(tmpfs.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty,
    ) : CdkObject(cdkObject), LinuxParametersProperty {
      /**
       * The Linux capabilities for the container that are added to or dropped from the default
       * configuration provided by Docker.
       *
       *
       * For tasks that use the Fargate launch type, `capabilities` is supported for all platform
       * versions but the `add` parameter is only supported if using platform version 1.4.0 or later.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-capabilities)
       */
      override fun capabilities(): Any? = unwrap(this).getCapabilities()

      /**
       * Any host devices to expose to the container.
       *
       * This parameter maps to `Devices` in the [Create a
       * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
       * section of the [Docker Remote
       * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--device`
       * option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `devices` parameter isn't
       * supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-devices)
       */
      override fun devices(): Any? = unwrap(this).getDevices()

      /**
       * Run an `init` process inside the container that forwards signals and reaps processes.
       *
       * This parameter maps to the `--init` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * . This parameter requires version 1.25 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-initprocessenabled)
       */
      override fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

      /**
       * The total amount of swap memory (in MiB) a container can use.
       *
       * This parameter will be translated to the `--memory-swap` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * where the value would be the sum of the container memory plus the `maxSwap` value.
       *
       * If a `maxSwap` value of `0` is specified, the container will not use swap. Accepted values
       * are `0` or any positive integer. If the `maxSwap` parameter is omitted, the container will use
       * the swap configuration for the container instance it is running on. A `maxSwap` value must be
       * set for the `swappiness` parameter to be used.
       *
       *
       * If you're using tasks that use the Fargate launch type, the `maxSwap` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-maxswap)
       */
      override fun maxSwap(): Number? = unwrap(this).getMaxSwap()

      /**
       * The value for the size (in MiB) of the `/dev/shm` volume.
       *
       * This parameter maps to the `--shm-size` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you are using tasks that use the Fargate launch type, the `sharedMemorySize` parameter
       * is not supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-sharedmemorysize)
       */
      override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

      /**
       * This allows you to tune a container's memory swappiness behavior.
       *
       * A `swappiness` value of `0` will cause swapping to not happen unless absolutely necessary.
       * A `swappiness` value of `100` will cause pages to be swapped very aggressively. Accepted
       * values are whole numbers between `0` and `100` . If the `swappiness` parameter is not
       * specified, a default value of `60` is used. If a value is not specified for `maxSwap` then
       * this parameter is ignored. This parameter maps to the `--memory-swappiness` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `swappiness` parameter isn't
       * supported.
       *
       * If you're using tasks on Amazon Linux 2023 the `swappiness` parameter isn't supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-swappiness)
       */
      override fun swappiness(): Number? = unwrap(this).getSwappiness()

      /**
       * The container path, mount options, and size (in MiB) of the tmpfs mount.
       *
       * This parameter maps to the `--tmpfs` option to [docker
       * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
       * .
       *
       *
       * If you're using tasks that use the Fargate launch type, the `tmpfs` parameter isn't
       * supported.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html#cfn-ecs-taskdefinition-linuxparameters-tmpfs)
       */
      override fun tmpfs(): Any? = unwrap(this).getTmpfs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty):
          LinuxParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? LinuxParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinuxParametersProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty
    }
  }

  /**
   * The `LogConfiguration` property specifies log configuration options to send to a custom log
   * driver for the container.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface LogConfigurationProperty {
    /**
     * The log driver to use for the container.
     *
     * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
     * `awsfirelens` .
     *
     * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd`
     * , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and `awsfirelens` .
     *
     * For more information about using the `awslogs` log driver, see [Using the awslogs log
     * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * For more information about using the `awsfirelens` log driver, see [Custom log
     * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
     * project that's [available on
     * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it to
     * work with that driver. We encourage you to submit pull requests for changes that you would like
     * to have included. However, we don't currently provide support for running modified copies of
     * this software.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-logdriver)
     */
    public fun logDriver(): String

    /**
     * The configuration options to send to the log driver.
     *
     * This parameter requires version 1.19 of the Docker Remote API or greater on your container
     * instance. To check the Docker Remote API version on your container instance, log in to your
     * container instance and run the following command: `sudo docker version --format
     * '{{.Server.APIVersion}}'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-options)
     */
    public fun options(): Any? = unwrap(this).getOptions()

    /**
     * The secrets to pass to the log configuration.
     *
     * For more information, see [Specifying sensitive
     * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions)
     */
    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDriver The log driver to use for the container. 
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       */
      public fun logDriver(logDriver: String)

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: IResolvable)

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      public fun options(options: Map<String, String>)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(secretOptions: IResolvable)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(secretOptions: List<Any>)

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun secretOptions(vararg secretOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.builder()

      /**
       * @param logDriver The log driver to use for the container. 
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       */
      override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The configuration options to send to the log driver.
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       */
      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      /**
       * @param secretOptions The secrets to pass to the log configuration.
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun secretOptions(vararg secretOptions: Any): Unit =
          secretOptions(secretOptions.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty,
    ) : CdkObject(cdkObject), LogConfigurationProperty {
      /**
       * The log driver to use for the container.
       *
       * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
       * `awsfirelens` .
       *
       * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` ,
       * `fluentd` , `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and
       * `awsfirelens` .
       *
       * For more information about using the `awslogs` log driver, see [Using the awslogs log
       * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * For more information about using the `awsfirelens` log driver, see [Custom log
       * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
       * project that's [available on
       * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it
       * to work with that driver. We encourage you to submit pull requests for changes that you would
       * like to have included. However, we don't currently provide support for running modified copies
       * of this software.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-logdriver)
       */
      override fun logDriver(): String = unwrap(this).getLogDriver()

      /**
       * The configuration options to send to the log driver.
       *
       * This parameter requires version 1.19 of the Docker Remote API or greater on your container
       * instance. To check the Docker Remote API version on your container instance, log in to your
       * container instance and run the following command: `sudo docker version --format
       * '{{.Server.APIVersion}}'`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-options)
       */
      override fun options(): Any? = unwrap(this).getOptions()

      /**
       * The secrets to pass to the log configuration.
       *
       * For more information, see [Specifying sensitive
       * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-logconfiguration.html#cfn-ecs-taskdefinition-logconfiguration-secretoptions)
       */
      override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty):
          LogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty
    }
  }

  /**
   * The details for a volume mount point that's used in a container definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * MountPointProperty mountPointProperty = MountPointProperty.builder()
   * .containerPath("containerPath")
   * .readOnly(false)
   * .sourceVolume("sourceVolume")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html)
   */
  public interface MountPointProperty {
    /**
     * The path on the container to mount the host volume at.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * If this value is `true` , the container has read-only access to the volume.
     *
     * If this value is `false` , then the container can write to the volume. The default value is
     * `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * The name of the volume to mount.
     *
     * Must be a volume name referenced in the `name` parameter of task definition `volume` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-sourcevolume)
     */
    public fun sourceVolume(): String? = unwrap(this).getSourceVolume()

    /**
     * A builder for [MountPointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The path on the container to mount the host volume at.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param sourceVolume The name of the volume to mount.
       * Must be a volume name referenced in the `name` parameter of task definition `volume` .
       */
      public fun sourceVolume(sourceVolume: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.builder()

      /**
       * @param containerPath The path on the container to mount the host volume at.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      /**
       * @param sourceVolume The name of the volume to mount.
       * Must be a volume name referenced in the `name` parameter of task definition `volume` .
       */
      override fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty,
    ) : CdkObject(cdkObject), MountPointProperty {
      /**
       * The path on the container to mount the host volume at.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * If this value is `true` , the container has read-only access to the volume.
       *
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * The name of the volume to mount.
       *
       * Must be a volume name referenced in the `name` parameter of task definition `volume` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-mountpoint.html#cfn-ecs-taskdefinition-mountpoint-sourcevolume)
       */
      override fun sourceVolume(): String? = unwrap(this).getSourceVolume()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty):
          MountPointProperty = CdkObjectWrappers.wrap(cdkObject) as? MountPointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountPointProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty
    }
  }

  /**
   * The `PortMapping` property specifies a port mapping.
   *
   * Port mappings allow containers to access ports on the host container instance to send or
   * receive traffic. Port mappings are specified as part of the container definition.
   *
   * If you are using containers in a task with the `awsvpc` or `host` network mode, exposed ports
   * should be specified using `containerPort` . The `hostPort` can be left blank or it must be the
   * same value as the `containerPort` .
   *
   * After a task reaches the `RUNNING` status, manual and automatic host and container port
   * assignments are visible in the `networkBindings` section of
   * [DescribeTasks](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
   * API responses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface PortMappingProperty {
    /**
     * The application protocol that's used for the port mapping.
     *
     * This parameter only applies to Service Connect. We recommend that you set this parameter to
     * be consistent with the protocol that your application uses. If you set this parameter, Amazon
     * ECS adds protocol-specific connection handling to the Service Connect proxy. If you set this
     * parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch.
     *
     * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't
     * add protocol-specific telemetry for TCP.
     *
     * `appProtocol` is immutable in a Service Connect service. Updating this field requires a
     * service deletion and redeployment.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-appprotocol)
     */
    public fun appProtocol(): String? = unwrap(this).getAppProtocol()

    /**
     * The port number on the container that's bound to the user-specified or automatically assigned
     * host port.
     *
     * If you use containers in a task with the `awsvpc` or `host` network mode, specify the exposed
     * ports using `containerPort` .
     *
     * If you use containers in a task with the `bridge` network mode and you specify a container
     * port and not a host port, your container automatically receives a host port in the ephemeral
     * port range. For more information, see `hostPort` . Port mappings that are automatically assigned
     * in this way do not count toward the 100 reserved ports limit of a container instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The port number range on the container that's bound to the dynamically mapped host port
     * range.
     *
     * The following rules apply when you specify a `containerPortRange` :
     *
     * * You must use either the `bridge` network mode or the `awsvpc` network mode.
     * * This parameter is available for both the EC2 and AWS Fargate launch types.
     * * This parameter is available for both the Linux and Windows operating systems.
     * * The container instance must have at least version 1.67.0 of the container agent and at
     * least version 1.67.0-1 of the `ecs-init` package
     * * You can specify a maximum of 100 port ranges per container.
     * * You do not specify a `hostPortRange` . The value of the `hostPortRange` is set as follows:
     * * For containers in a task with the `awsvpc` network mode, the `hostPortRange` is set to the
     * same value as the `containerPortRange` . This is a static mapping strategy.
     * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
     * host ports from the default ephemeral range and passes it to docker to bind them to the
     * container ports.
     * * The `containerPortRange` valid values are between 1 and 65535.
     * * A port can only be included in one port mapping per container.
     * * You cannot specify overlapping port ranges.
     * * The first port in the range must be less than last port in the range.
     * * Docker recommends that you turn off the docker-proxy in the Docker daemon config file when
     * you have a large number of ports.
     *
     * For more information, see [Issue
     * #11185](https://docs.aws.amazon.com/https://github.com/moby/moby/issues/11185) on the Github
     * website.
     *
     * For information about how to turn off the docker-proxy in the Docker daemon config file, see
     * [Docker
     * daemon](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon)
     * in the *Amazon ECS Developer Guide* .
     *
     * You can call
     * [`DescribeTasks`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
     * to view the `hostPortRange` which are the host ports that are bound to the container ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-containerportrange)
     */
    public fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

    /**
     * The port number on the container instance to reserve for your container.
     *
     * If you specify a `containerPortRange` , leave this field empty and the value of the
     * `hostPort` is set as follows:
     *
     * * For containers in a task with the `awsvpc` network mode, the `hostPort` is set to the same
     * value as the `containerPort` . This is a static mapping strategy.
     * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
     * ports on the host and automatically binds them to the container ports. This is a dynamic mapping
     * strategy.
     *
     * If you use containers in a task with the `awsvpc` or `host` network mode, the `hostPort` can
     * either be left blank or set to the same value as the `containerPort` .
     *
     * If you use containers in a task with the `bridge` network mode, you can specify a
     * non-reserved host port for your container port mapping, or you can omit the `hostPort` (or set
     * it to `0` ) while specifying a `containerPort` and your container automatically receives a port
     * in the ephemeral port range for your container instance operating system and Docker version.
     *
     * The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance
     * under `/proc/sys/net/ipv4/ip_local_port_range` . If this kernel parameter is unavailable, the
     * default ephemeral port range from 49153 through 65535 (Linux) or 49152 through 65535 (Windows)
     * is used. Do not attempt to specify a host port in the ephemeral port range as these are reserved
     * for automatic assignment. In general, ports below 32768 are outside of the ephemeral port range.
     *
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS
     * container agent ports 51678-51680. Any host port that was previously specified in a running task
     * is also reserved while the task is running. That is, after a task stops, the host port is
     * released. The current reserved ports are displayed in the `remainingResources` of
     * [DescribeContainerInstances](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeContainerInstances.html)
     * output. A container instance can have up to 100 reserved ports at a time. This number includes
     * the default reserved ports. Automatically assigned ports aren't included in the 100 reserved
     * ports quota.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-hostport)
     */
    public fun hostPort(): Number? = unwrap(this).getHostPort()

    /**
     * The name that's used for the port mapping.
     *
     * This parameter only applies to Service Connect. This parameter is the name that you use in
     * the `serviceConnectConfiguration` of a service. The name can include up to 64 characters. The
     * characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     * can't start with a hyphen.
     *
     * For more information, see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The protocol used for the port mapping.
     *
     * Valid values are `tcp` and `udp` . The default is `tcp` . `protocol` is immutable in a
     * Service Connect service. Updating this field requires a service deletion and redeployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [PortMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appProtocol The application protocol that's used for the port mapping.
       * This parameter only applies to Service Connect. We recommend that you set this parameter to
       * be consistent with the protocol that your application uses. If you set this parameter, Amazon
       * ECS adds protocol-specific connection handling to the Service Connect proxy. If you set this
       * parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and
       * CloudWatch.
       *
       * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't
       * add protocol-specific telemetry for TCP.
       *
       * `appProtocol` is immutable in a Service Connect service. Updating this field requires a
       * service deletion and redeployment.
       *
       * Tasks that run in a namespace can use short names to connect to services in the namespace.
       * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
       * through a managed proxy container that collects logs and metrics for increased visibility.
       * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun appProtocol(appProtocol: String)

      /**
       * @param containerPort The port number on the container that's bound to the user-specified or
       * automatically assigned host port.
       * If you use containers in a task with the `awsvpc` or `host` network mode, specify the
       * exposed ports using `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode and you specify a container
       * port and not a host port, your container automatically receives a host port in the ephemeral
       * port range. For more information, see `hostPort` . Port mappings that are automatically
       * assigned in this way do not count toward the 100 reserved ports limit of a container instance.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param containerPortRange The port number range on the container that's bound to the
       * dynamically mapped host port range.
       * The following rules apply when you specify a `containerPortRange` :
       *
       * * You must use either the `bridge` network mode or the `awsvpc` network mode.
       * * This parameter is available for both the EC2 and AWS Fargate launch types.
       * * This parameter is available for both the Linux and Windows operating systems.
       * * The container instance must have at least version 1.67.0 of the container agent and at
       * least version 1.67.0-1 of the `ecs-init` package
       * * You can specify a maximum of 100 port ranges per container.
       * * You do not specify a `hostPortRange` . The value of the `hostPortRange` is set as
       * follows:
       * * For containers in a task with the `awsvpc` network mode, the `hostPortRange` is set to
       * the same value as the `containerPortRange` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * host ports from the default ephemeral range and passes it to docker to bind them to the
       * container ports.
       * * The `containerPortRange` valid values are between 1 and 65535.
       * * A port can only be included in one port mapping per container.
       * * You cannot specify overlapping port ranges.
       * * The first port in the range must be less than last port in the range.
       * * Docker recommends that you turn off the docker-proxy in the Docker daemon config file
       * when you have a large number of ports.
       *
       * For more information, see [Issue
       * #11185](https://docs.aws.amazon.com/https://github.com/moby/moby/issues/11185) on the Github
       * website.
       *
       * For information about how to turn off the docker-proxy in the Docker daemon config file,
       * see [Docker
       * daemon](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon)
       * in the *Amazon ECS Developer Guide* .
       *
       * You can call
       * [`DescribeTasks`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * to view the `hostPortRange` which are the host ports that are bound to the container ports.
       */
      public fun containerPortRange(containerPortRange: String)

      /**
       * @param hostPort The port number on the container instance to reserve for your container.
       * If you specify a `containerPortRange` , leave this field empty and the value of the
       * `hostPort` is set as follows:
       *
       * * For containers in a task with the `awsvpc` network mode, the `hostPort` is set to the
       * same value as the `containerPort` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * ports on the host and automatically binds them to the container ports. This is a dynamic
       * mapping strategy.
       *
       * If you use containers in a task with the `awsvpc` or `host` network mode, the `hostPort`
       * can either be left blank or set to the same value as the `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode, you can specify a
       * non-reserved host port for your container port mapping, or you can omit the `hostPort` (or set
       * it to `0` ) while specifying a `containerPort` and your container automatically receives a
       * port in the ephemeral port range for your container instance operating system and Docker
       * version.
       *
       * The default ephemeral port range for Docker version 1.6.0 and later is listed on the
       * instance under `/proc/sys/net/ipv4/ip_local_port_range` . If this kernel parameter is
       * unavailable, the default ephemeral port range from 49153 through 65535 (Linux) or 49152
       * through 65535 (Windows) is used. Do not attempt to specify a host port in the ephemeral port
       * range as these are reserved for automatic assignment. In general, ports below 32768 are
       * outside of the ephemeral port range.
       *
       * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon
       * ECS container agent ports 51678-51680. Any host port that was previously specified in a
       * running task is also reserved while the task is running. That is, after a task stops, the host
       * port is released. The current reserved ports are displayed in the `remainingResources` of
       * [DescribeContainerInstances](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeContainerInstances.html)
       * output. A container instance can have up to 100 reserved ports at a time. This number includes
       * the default reserved ports. Automatically assigned ports aren't included in the 100 reserved
       * ports quota.
       */
      public fun hostPort(hostPort: Number)

      /**
       * @param name The name that's used for the port mapping.
       * This parameter only applies to Service Connect. This parameter is the name that you use in
       * the `serviceConnectConfiguration` of a service. The name can include up to 64 characters. The
       * characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
       * can't start with a hyphen.
       *
       * For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun name(name: String)

      /**
       * @param protocol The protocol used for the port mapping.
       * Valid values are `tcp` and `udp` . The default is `tcp` . `protocol` is immutable in a
       * Service Connect service. Updating this field requires a service deletion and redeployment.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.builder()

      /**
       * @param appProtocol The application protocol that's used for the port mapping.
       * This parameter only applies to Service Connect. We recommend that you set this parameter to
       * be consistent with the protocol that your application uses. If you set this parameter, Amazon
       * ECS adds protocol-specific connection handling to the Service Connect proxy. If you set this
       * parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and
       * CloudWatch.
       *
       * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't
       * add protocol-specific telemetry for TCP.
       *
       * `appProtocol` is immutable in a Service Connect service. Updating this field requires a
       * service deletion and redeployment.
       *
       * Tasks that run in a namespace can use short names to connect to services in the namespace.
       * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
       * through a managed proxy container that collects logs and metrics for increased visibility.
       * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun appProtocol(appProtocol: String) {
        cdkBuilder.appProtocol(appProtocol)
      }

      /**
       * @param containerPort The port number on the container that's bound to the user-specified or
       * automatically assigned host port.
       * If you use containers in a task with the `awsvpc` or `host` network mode, specify the
       * exposed ports using `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode and you specify a container
       * port and not a host port, your container automatically receives a host port in the ephemeral
       * port range. For more information, see `hostPort` . Port mappings that are automatically
       * assigned in this way do not count toward the 100 reserved ports limit of a container instance.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param containerPortRange The port number range on the container that's bound to the
       * dynamically mapped host port range.
       * The following rules apply when you specify a `containerPortRange` :
       *
       * * You must use either the `bridge` network mode or the `awsvpc` network mode.
       * * This parameter is available for both the EC2 and AWS Fargate launch types.
       * * This parameter is available for both the Linux and Windows operating systems.
       * * The container instance must have at least version 1.67.0 of the container agent and at
       * least version 1.67.0-1 of the `ecs-init` package
       * * You can specify a maximum of 100 port ranges per container.
       * * You do not specify a `hostPortRange` . The value of the `hostPortRange` is set as
       * follows:
       * * For containers in a task with the `awsvpc` network mode, the `hostPortRange` is set to
       * the same value as the `containerPortRange` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * host ports from the default ephemeral range and passes it to docker to bind them to the
       * container ports.
       * * The `containerPortRange` valid values are between 1 and 65535.
       * * A port can only be included in one port mapping per container.
       * * You cannot specify overlapping port ranges.
       * * The first port in the range must be less than last port in the range.
       * * Docker recommends that you turn off the docker-proxy in the Docker daemon config file
       * when you have a large number of ports.
       *
       * For more information, see [Issue
       * #11185](https://docs.aws.amazon.com/https://github.com/moby/moby/issues/11185) on the Github
       * website.
       *
       * For information about how to turn off the docker-proxy in the Docker daemon config file,
       * see [Docker
       * daemon](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon)
       * in the *Amazon ECS Developer Guide* .
       *
       * You can call
       * [`DescribeTasks`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * to view the `hostPortRange` which are the host ports that are bound to the container ports.
       */
      override fun containerPortRange(containerPortRange: String) {
        cdkBuilder.containerPortRange(containerPortRange)
      }

      /**
       * @param hostPort The port number on the container instance to reserve for your container.
       * If you specify a `containerPortRange` , leave this field empty and the value of the
       * `hostPort` is set as follows:
       *
       * * For containers in a task with the `awsvpc` network mode, the `hostPort` is set to the
       * same value as the `containerPort` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * ports on the host and automatically binds them to the container ports. This is a dynamic
       * mapping strategy.
       *
       * If you use containers in a task with the `awsvpc` or `host` network mode, the `hostPort`
       * can either be left blank or set to the same value as the `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode, you can specify a
       * non-reserved host port for your container port mapping, or you can omit the `hostPort` (or set
       * it to `0` ) while specifying a `containerPort` and your container automatically receives a
       * port in the ephemeral port range for your container instance operating system and Docker
       * version.
       *
       * The default ephemeral port range for Docker version 1.6.0 and later is listed on the
       * instance under `/proc/sys/net/ipv4/ip_local_port_range` . If this kernel parameter is
       * unavailable, the default ephemeral port range from 49153 through 65535 (Linux) or 49152
       * through 65535 (Windows) is used. Do not attempt to specify a host port in the ephemeral port
       * range as these are reserved for automatic assignment. In general, ports below 32768 are
       * outside of the ephemeral port range.
       *
       * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon
       * ECS container agent ports 51678-51680. Any host port that was previously specified in a
       * running task is also reserved while the task is running. That is, after a task stops, the host
       * port is released. The current reserved ports are displayed in the `remainingResources` of
       * [DescribeContainerInstances](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeContainerInstances.html)
       * output. A container instance can have up to 100 reserved ports at a time. This number includes
       * the default reserved ports. Automatically assigned ports aren't included in the 100 reserved
       * ports quota.
       */
      override fun hostPort(hostPort: Number) {
        cdkBuilder.hostPort(hostPort)
      }

      /**
       * @param name The name that's used for the port mapping.
       * This parameter only applies to Service Connect. This parameter is the name that you use in
       * the `serviceConnectConfiguration` of a service. The name can include up to 64 characters. The
       * characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
       * can't start with a hyphen.
       *
       * For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param protocol The protocol used for the port mapping.
       * Valid values are `tcp` and `udp` . The default is `tcp` . `protocol` is immutable in a
       * Service Connect service. Updating this field requires a service deletion and redeployment.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty,
    ) : CdkObject(cdkObject), PortMappingProperty {
      /**
       * The application protocol that's used for the port mapping.
       *
       * This parameter only applies to Service Connect. We recommend that you set this parameter to
       * be consistent with the protocol that your application uses. If you set this parameter, Amazon
       * ECS adds protocol-specific connection handling to the Service Connect proxy. If you set this
       * parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and
       * CloudWatch.
       *
       * If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't
       * add protocol-specific telemetry for TCP.
       *
       * `appProtocol` is immutable in a Service Connect service. Updating this field requires a
       * service deletion and redeployment.
       *
       * Tasks that run in a namespace can use short names to connect to services in the namespace.
       * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
       * through a managed proxy container that collects logs and metrics for increased visibility.
       * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
       * information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-appprotocol)
       */
      override fun appProtocol(): String? = unwrap(this).getAppProtocol()

      /**
       * The port number on the container that's bound to the user-specified or automatically
       * assigned host port.
       *
       * If you use containers in a task with the `awsvpc` or `host` network mode, specify the
       * exposed ports using `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode and you specify a container
       * port and not a host port, your container automatically receives a host port in the ephemeral
       * port range. For more information, see `hostPort` . Port mappings that are automatically
       * assigned in this way do not count toward the 100 reserved ports limit of a container instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * The port number range on the container that's bound to the dynamically mapped host port
       * range.
       *
       * The following rules apply when you specify a `containerPortRange` :
       *
       * * You must use either the `bridge` network mode or the `awsvpc` network mode.
       * * This parameter is available for both the EC2 and AWS Fargate launch types.
       * * This parameter is available for both the Linux and Windows operating systems.
       * * The container instance must have at least version 1.67.0 of the container agent and at
       * least version 1.67.0-1 of the `ecs-init` package
       * * You can specify a maximum of 100 port ranges per container.
       * * You do not specify a `hostPortRange` . The value of the `hostPortRange` is set as
       * follows:
       * * For containers in a task with the `awsvpc` network mode, the `hostPortRange` is set to
       * the same value as the `containerPortRange` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * host ports from the default ephemeral range and passes it to docker to bind them to the
       * container ports.
       * * The `containerPortRange` valid values are between 1 and 65535.
       * * A port can only be included in one port mapping per container.
       * * You cannot specify overlapping port ranges.
       * * The first port in the range must be less than last port in the range.
       * * Docker recommends that you turn off the docker-proxy in the Docker daemon config file
       * when you have a large number of ports.
       *
       * For more information, see [Issue
       * #11185](https://docs.aws.amazon.com/https://github.com/moby/moby/issues/11185) on the Github
       * website.
       *
       * For information about how to turn off the docker-proxy in the Docker daemon config file,
       * see [Docker
       * daemon](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/bootstrap_container_instance.html#bootstrap_docker_daemon)
       * in the *Amazon ECS Developer Guide* .
       *
       * You can call
       * [`DescribeTasks`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeTasks.html)
       * to view the `hostPortRange` which are the host ports that are bound to the container ports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-containerportrange)
       */
      override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

      /**
       * The port number on the container instance to reserve for your container.
       *
       * If you specify a `containerPortRange` , leave this field empty and the value of the
       * `hostPort` is set as follows:
       *
       * * For containers in a task with the `awsvpc` network mode, the `hostPort` is set to the
       * same value as the `containerPort` . This is a static mapping strategy.
       * * For containers in a task with the `bridge` network mode, the Amazon ECS agent finds open
       * ports on the host and automatically binds them to the container ports. This is a dynamic
       * mapping strategy.
       *
       * If you use containers in a task with the `awsvpc` or `host` network mode, the `hostPort`
       * can either be left blank or set to the same value as the `containerPort` .
       *
       * If you use containers in a task with the `bridge` network mode, you can specify a
       * non-reserved host port for your container port mapping, or you can omit the `hostPort` (or set
       * it to `0` ) while specifying a `containerPort` and your container automatically receives a
       * port in the ephemeral port range for your container instance operating system and Docker
       * version.
       *
       * The default ephemeral port range for Docker version 1.6.0 and later is listed on the
       * instance under `/proc/sys/net/ipv4/ip_local_port_range` . If this kernel parameter is
       * unavailable, the default ephemeral port range from 49153 through 65535 (Linux) or 49152
       * through 65535 (Windows) is used. Do not attempt to specify a host port in the ephemeral port
       * range as these are reserved for automatic assignment. In general, ports below 32768 are
       * outside of the ephemeral port range.
       *
       * The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon
       * ECS container agent ports 51678-51680. Any host port that was previously specified in a
       * running task is also reserved while the task is running. That is, after a task stops, the host
       * port is released. The current reserved ports are displayed in the `remainingResources` of
       * [DescribeContainerInstances](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_DescribeContainerInstances.html)
       * output. A container instance can have up to 100 reserved ports at a time. This number includes
       * the default reserved ports. Automatically assigned ports aren't included in the 100 reserved
       * ports quota.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-hostport)
       */
      override fun hostPort(): Number? = unwrap(this).getHostPort()

      /**
       * The name that's used for the port mapping.
       *
       * This parameter only applies to Service Connect. This parameter is the name that you use in
       * the `serviceConnectConfiguration` of a service. The name can include up to 64 characters. The
       * characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
       * can't start with a hyphen.
       *
       * For more information, see [Service
       * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
       * the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The protocol used for the port mapping.
       *
       * Valid values are `tcp` and `udp` . The default is `tcp` . `protocol` is immutable in a
       * Service Connect service. Updating this field requires a service deletion and redeployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-portmapping.html#cfn-ecs-taskdefinition-portmapping-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty):
          PortMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? PortMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty
    }
  }

  /**
   * The configuration details for the App Mesh proxy.
   *
   * For tasks that use the EC2 launch type, the container instances require at least version 1.26.0
   * of the container agent and at least version 1.26.0-1 of the `ecs-init` package to use a proxy
   * configuration. If your container instances are launched from the Amazon ECS optimized AMI version
   * `20190301` or later, then they contain the required versions of the container agent and `ecs-init`
   * . For more information, see [Amazon ECS-optimized Linux
   * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface ProxyConfigurationProperty {
    /**
     * The name of the container that will serve as the App Mesh proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-containername)
     */
    public fun containerName(): String

    /**
     * The set of network configuration parameters to provide the Container Network Interface (CNI)
     * plugin, specified as key-value pairs.
     *
     * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the `user`
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If `IgnoredGID` is specified, this field can be empty.
     * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
     * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
     * traffic. If `IgnoredUID` is specified, this field can be empty.
     * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
     * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
     * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the `AppPorts`
     * is directed to.
     * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the `AppPorts`
     * is directed to.
     * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
     * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
     * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-proxyconfigurationproperties)
     */
    public fun proxyConfigurationProperties(): Any? = unwrap(this).getProxyConfigurationProperties()

    /**
     * The proxy type.
     *
     * The only supported value is `APPMESH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ProxyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The name of the container that will serve as the App Mesh proxy. 
       */
      public fun containerName(containerName: String)

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      public fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable)

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      public fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>)

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      public fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any)

      /**
       * @param type The proxy type.
       * The only supported value is `APPMESH` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.builder()

      /**
       * @param containerName The name of the container that will serve as the App Mesh proxy. 
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      override fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties.let(IResolvable::unwrap))
      }

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      override fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties)
      }

      /**
       * @param proxyConfigurationProperties The set of network configuration parameters to provide
       * the Container Network Interface (CNI) plugin, specified as key-value pairs.
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       */
      override fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any): Unit =
          proxyConfigurationProperties(proxyConfigurationProperties.toList())

      /**
       * @param type The proxy type.
       * The only supported value is `APPMESH` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty,
    ) : CdkObject(cdkObject), ProxyConfigurationProperty {
      /**
       * The name of the container that will serve as the App Mesh proxy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-containername)
       */
      override fun containerName(): String = unwrap(this).getContainerName()

      /**
       * The set of network configuration parameters to provide the Container Network Interface
       * (CNI) plugin, specified as key-value pairs.
       *
       * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredGID` is specified, this field can be empty.
       * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
       * `user` parameter in a container definition. This is used to ensure the proxy ignores its own
       * traffic. If `IgnoredUID` is specified, this field can be empty.
       * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
       * these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
       * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the
       * `AppPorts` is directed to.
       * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the
       * `AppPorts` is directed to.
       * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
       * ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-proxyconfigurationproperties)
       */
      override fun proxyConfigurationProperties(): Any? =
          unwrap(this).getProxyConfigurationProperties()

      /**
       * The proxy type.
       *
       * The only supported value is `APPMESH` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html#cfn-ecs-taskdefinition-proxyconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty):
          ProxyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProxyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty
    }
  }

  /**
   * The repository credentials for private registry authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * RepositoryCredentialsProperty repositoryCredentialsProperty =
   * RepositoryCredentialsProperty.builder()
   * .credentialsParameter("credentialsParameter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html)
   */
  public interface RepositoryCredentialsProperty {
    /**
     * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
     *
     *
     * When you use the Amazon ECS API, AWS CLI , or AWS SDK, if the secret exists in the same
     * Region as the task that you're launching then you can use either the full ARN or the name of the
     * secret. When you use the AWS Management Console, you must specify the full ARN of the secret.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter)
     */
    public fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()

    /**
     * A builder for [RepositoryCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the
       * private repository credentials.
       *
       * When you use the Amazon ECS API, AWS CLI , or AWS SDK, if the secret exists in the same
       * Region as the task that you're launching then you can use either the full ARN or the name of
       * the secret. When you use the AWS Management Console, you must specify the full ARN of the
       * secret.
       */
      public fun credentialsParameter(credentialsParameter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.builder()

      /**
       * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the
       * private repository credentials.
       *
       * When you use the Amazon ECS API, AWS CLI , or AWS SDK, if the secret exists in the same
       * Region as the task that you're launching then you can use either the full ARN or the name of
       * the secret. When you use the AWS Management Console, you must specify the full ARN of the
       * secret.
       */
      override fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty,
    ) : CdkObject(cdkObject), RepositoryCredentialsProperty {
      /**
       * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.
       *
       *
       * When you use the Amazon ECS API, AWS CLI , or AWS SDK, if the secret exists in the same
       * Region as the task that you're launching then you can use either the full ARN or the name of
       * the secret. When you use the AWS Management Console, you must specify the full ARN of the
       * secret.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html#cfn-ecs-taskdefinition-repositorycredentials-credentialsparameter)
       */
      override fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty):
          RepositoryCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RepositoryCredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCredentialsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty
    }
  }

  /**
   * The type and amount of a resource to assign to a container.
   *
   * The supported resource types are GPUs and Elastic Inference accelerators. For more information,
   * see [Working with GPUs on Amazon
   * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html) or [Working with
   * Amazon Elastic Inference on Amazon
   * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-inference.html) in the
   * *Amazon Elastic Container Service Developer Guide*
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ResourceRequirementProperty resourceRequirementProperty = ResourceRequirementProperty.builder()
   * .type("type")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html)
   */
  public interface ResourceRequirementProperty {
    /**
     * The type of resource to assign to a container.
     *
     * The supported values are `GPU` or `InferenceAccelerator` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html#cfn-ecs-taskdefinition-resourcerequirement-type)
     */
    public fun type(): String

    /**
     * The value for the specified resource type.
     *
     * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
     * container agent reserves for the container. The number of GPUs that's reserved for all
     * containers in a task can't exceed the number of available GPUs on the container instance that
     * the task is launched on.
     *
     * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
     * [InferenceAccelerator](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_InferenceAccelerator.html)
     * specified in a task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html#cfn-ecs-taskdefinition-resourcerequirement-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceRequirementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of resource to assign to a container. 
       * The supported values are `GPU` or `InferenceAccelerator` .
       */
      public fun type(type: String)

      /**
       * @param value The value for the specified resource type. 
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * [InferenceAccelerator](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_InferenceAccelerator.html)
       * specified in a task definition.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.builder()

      /**
       * @param type The type of resource to assign to a container. 
       * The supported values are `GPU` or `InferenceAccelerator` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The value for the specified resource type. 
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * [InferenceAccelerator](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_InferenceAccelerator.html)
       * specified in a task definition.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty,
    ) : CdkObject(cdkObject), ResourceRequirementProperty {
      /**
       * The type of resource to assign to a container.
       *
       * The supported values are `GPU` or `InferenceAccelerator` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html#cfn-ecs-taskdefinition-resourcerequirement-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * The value for the specified resource type.
       *
       * If the `GPU` type is used, the value is the number of physical `GPUs` the Amazon ECS
       * container agent reserves for the container. The number of GPUs that's reserved for all
       * containers in a task can't exceed the number of available GPUs on the container instance that
       * the task is launched on.
       *
       * If the `InferenceAccelerator` type is used, the `value` matches the `deviceName` for an
       * [InferenceAccelerator](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_InferenceAccelerator.html)
       * specified in a task definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-resourcerequirement.html#cfn-ecs-taskdefinition-resourcerequirement-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty):
          ResourceRequirementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceRequirementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceRequirementProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty
    }
  }

  /**
   * Information about the platform for the Amazon ECS service or task.
   *
   * For more information about `RuntimePlatform` , see
   * [RuntimePlatform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
   * .cpuArchitecture("cpuArchitecture")
   * .operatingSystemFamily("operatingSystemFamily")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html)
   */
  public interface RuntimePlatformProperty {
    /**
     * The CPU architecture.
     *
     * You can run your Linux tasks on an ARM-based platform by setting the value to `ARM64` . This
     * option is available for tasks that run on Linux Amazon EC2 instance or Linux containers on
     * Fargate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html#cfn-ecs-taskdefinition-runtimeplatform-cpuarchitecture)
     */
    public fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

    /**
     * The operating system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html#cfn-ecs-taskdefinition-runtimeplatform-operatingsystemfamily)
     */
    public fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()

    /**
     * A builder for [RuntimePlatformProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpuArchitecture The CPU architecture.
       * You can run your Linux tasks on an ARM-based platform by setting the value to `ARM64` .
       * This option is available for tasks that run on Linux Amazon EC2 instance or Linux containers
       * on Fargate.
       */
      public fun cpuArchitecture(cpuArchitecture: String)

      /**
       * @param operatingSystemFamily The operating system.
       */
      public fun operatingSystemFamily(operatingSystemFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.builder()

      /**
       * @param cpuArchitecture The CPU architecture.
       * You can run your Linux tasks on an ARM-based platform by setting the value to `ARM64` .
       * This option is available for tasks that run on Linux Amazon EC2 instance or Linux containers
       * on Fargate.
       */
      override fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
      }

      /**
       * @param operatingSystemFamily The operating system.
       */
      override fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty,
    ) : CdkObject(cdkObject), RuntimePlatformProperty {
      /**
       * The CPU architecture.
       *
       * You can run your Linux tasks on an ARM-based platform by setting the value to `ARM64` .
       * This option is available for tasks that run on Linux Amazon EC2 instance or Linux containers
       * on Fargate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html#cfn-ecs-taskdefinition-runtimeplatform-cpuarchitecture)
       */
      override fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

      /**
       * The operating system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-runtimeplatform.html#cfn-ecs-taskdefinition-runtimeplatform-operatingsystemfamily)
       */
      override fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty):
          RuntimePlatformProperty = CdkObjectWrappers.wrap(cdkObject) as? RuntimePlatformProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePlatformProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty
    }
  }

  /**
   * An object representing the secret to expose to your container.
   *
   * Secrets can be exposed to a container in the following ways:
   *
   * * To inject sensitive data into your containers as environment variables, use the `secrets`
   * container definition parameter.
   * * To reference sensitive information in the log configuration of a container, use the
   * `secretOptions` container definition parameter.
   *
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * SecretProperty secretProperty = SecretProperty.builder()
   * .name("name")
   * .valueFrom("valueFrom")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html)
   */
  public interface SecretProperty {
    /**
     * The name of the secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html#cfn-ecs-taskdefinition-secret-name)
     */
    public fun name(): String

    /**
     * The secret to expose to the container.
     *
     * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
     * ARN of the parameter in the SSM Parameter Store.
     *
     * For information about the require AWS Identity and Access Management permissions, see
     * [Required IAM permissions for Amazon ECS
     * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
     * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
     * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
     * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer Guide*
     * .
     *
     *
     * If the SSM Parameter Store parameter exists in the same Region as the task you're launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a
     * different Region, then the full ARN must be specified.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html#cfn-ecs-taskdefinition-secret-valuefrom)
     */
    public fun valueFrom(): String

    /**
     * A builder for [SecretProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the secret. 
       */
      public fun name(name: String)

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       */
      public fun valueFrom(valueFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.builder()

      /**
       * @param name The name of the secret. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param valueFrom The secret to expose to the container. 
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       */
      override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty,
    ) : CdkObject(cdkObject), SecretProperty {
      /**
       * The name of the secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html#cfn-ecs-taskdefinition-secret-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The secret to expose to the container.
       *
       * The supported values are either the full ARN of the AWS Secrets Manager secret or the full
       * ARN of the parameter in the SSM Parameter Store.
       *
       * For information about the require AWS Identity and Access Management permissions, see
       * [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
       * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
       * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
       * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
       * Guide* .
       *
       *
       * If the SSM Parameter Store parameter exists in the same Region as the task you're
       * launching, then you can use either the full ARN or name of the parameter. If the parameter
       * exists in a different Region, then the full ARN must be specified.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-secret.html#cfn-ecs-taskdefinition-secret-valuefrom)
       */
      override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty):
          SecretProperty = CdkObjectWrappers.wrap(cdkObject) as? SecretProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty
    }
  }

  /**
   * A list of namespaced kernel parameters to set in the container.
   *
   * This parameter maps to `Sysctls` in the [Create a
   * container](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate)
   * section of the [Docker Remote
   * API](https://docs.aws.amazon.com/https://docs.docker.com/engine/api/v1.35/) and the `--sysctl`
   * option to [docker
   * run](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#security-configuration)
   * . For example, you can configure `net.ipv4.tcp_keepalive_time` setting to maintain longer lived
   * connections.
   *
   * We don't recommend that you specify network-related `systemControls` parameters for multiple
   * containers in a single task that also uses either the `awsvpc` or `host` network mode. Doing this
   * has the following disadvantages:
   *
   * * For tasks that use the `awsvpc` network mode including Fargate, if you set `systemControls`
   * for any container, it applies to all containers in the task. If you set different `systemControls`
   * for multiple containers in a single task, the container that's started last determines which
   * `systemControls` take effect.
   * * For tasks that use the `host` network mode, the network namespace `systemControls` aren't
   * supported.
   *
   * If you're setting an IPC resource namespace to use for the containers in the task, the
   * following conditions apply to your system controls. For more information, see [IPC
   * mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#task_definition_ipcmode)
   * .
   *
   * * For tasks that use the `host` IPC mode, IPC namespace `systemControls` aren't supported.
   * * For tasks that use the `task` IPC mode, IPC namespace `systemControls` values apply to all
   * containers within a task.
   *
   *
   * This parameter is not supported for Windows containers. &gt; This parameter is only supported
   * for tasks that are hosted on AWS Fargate if the tasks are using platform version `1.4.0` or later
   * (Linux). This isn't supported for Windows containers on Fargate.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * SystemControlProperty systemControlProperty = SystemControlProperty.builder()
   * .namespace("namespace")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html)
   */
  public interface SystemControlProperty {
    /**
     * The namespaced kernel parameter to set a `value` for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html#cfn-ecs-taskdefinition-systemcontrol-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The namespaced kernel parameter to set a `value` for.
     *
     * Valid IPC namespace values: `"kernel.msgmax" | "kernel.msgmnb" | "kernel.msgmni" |
     * "kernel.sem" | "kernel.shmall" | "kernel.shmmax" | "kernel.shmmni" | "kernel.shm_rmid_forced"` ,
     * and `Sysctls` that start with `"fs.mqueue.*"`
     *
     * Valid network namespace values: `Sysctls` that start with `"net.*"`
     *
     * All of these values are supported by Fargate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html#cfn-ecs-taskdefinition-systemcontrol-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [SystemControlProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespace The namespaced kernel parameter to set a `value` for.
       */
      public fun namespace(namespace: String)

      /**
       * @param value The namespaced kernel parameter to set a `value` for.
       * Valid IPC namespace values: `"kernel.msgmax" | "kernel.msgmnb" | "kernel.msgmni" |
       * "kernel.sem" | "kernel.shmall" | "kernel.shmmax" | "kernel.shmmni" | "kernel.shm_rmid_forced"`
       * , and `Sysctls` that start with `"fs.mqueue.*"`
       *
       * Valid network namespace values: `Sysctls` that start with `"net.*"`
       *
       * All of these values are supported by Fargate.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.builder()

      /**
       * @param namespace The namespaced kernel parameter to set a `value` for.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param value The namespaced kernel parameter to set a `value` for.
       * Valid IPC namespace values: `"kernel.msgmax" | "kernel.msgmnb" | "kernel.msgmni" |
       * "kernel.sem" | "kernel.shmall" | "kernel.shmmax" | "kernel.shmmni" | "kernel.shm_rmid_forced"`
       * , and `Sysctls` that start with `"fs.mqueue.*"`
       *
       * Valid network namespace values: `Sysctls` that start with `"net.*"`
       *
       * All of these values are supported by Fargate.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty,
    ) : CdkObject(cdkObject), SystemControlProperty {
      /**
       * The namespaced kernel parameter to set a `value` for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html#cfn-ecs-taskdefinition-systemcontrol-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The namespaced kernel parameter to set a `value` for.
       *
       * Valid IPC namespace values: `"kernel.msgmax" | "kernel.msgmnb" | "kernel.msgmni" |
       * "kernel.sem" | "kernel.shmall" | "kernel.shmmax" | "kernel.shmmni" | "kernel.shm_rmid_forced"`
       * , and `Sysctls` that start with `"fs.mqueue.*"`
       *
       * Valid network namespace values: `Sysctls` that start with `"net.*"`
       *
       * All of these values are supported by Fargate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-systemcontrol.html#cfn-ecs-taskdefinition-systemcontrol-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty):
          SystemControlProperty = CdkObjectWrappers.wrap(cdkObject) as? SystemControlProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemControlProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty
    }
  }

  /**
   * The constraint on task placement in the task definition.
   *
   * For more information, see [Task placement
   * constraints](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-constraints.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   *
   *
   * Task placement constraints aren't supported for tasks run on AWS Fargate .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface TaskDefinitionPlacementConstraintProperty {
    /**
     * A cluster query language expression to apply to the constraint.
     *
     * For more information, see [Cluster query
     * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * The type of constraint.
     *
     * The `MemberOf` constraint restricts selection to be from a group of valid candidates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
     */
    public fun type(): String

    /**
     * A builder for [TaskDefinitionPlacementConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * For more information, see [Cluster query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun expression(expression: String)

      /**
       * @param type The type of constraint. 
       * The `MemberOf` constraint restricts selection to be from a group of valid candidates.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder()

      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * For more information, see [Cluster query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The type of constraint. 
       * The `MemberOf` constraint restricts selection to be from a group of valid candidates.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty,
    ) : CdkObject(cdkObject), TaskDefinitionPlacementConstraintProperty {
      /**
       * A cluster query language expression to apply to the constraint.
       *
       * For more information, see [Cluster query
       * language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * The type of constraint.
       *
       * The `MemberOf` constraint restricts selection to be from a group of valid candidates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-taskdefinitionplacementconstraint.html#cfn-ecs-taskdefinition-taskdefinitionplacementconstraint-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TaskDefinitionPlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty):
          TaskDefinitionPlacementConstraintProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TaskDefinitionPlacementConstraintProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskDefinitionPlacementConstraintProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
    }
  }

  /**
   * The container path, mount options, and size of the tmpfs mount.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
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
  public interface TmpfsProperty {
    /**
     * The absolute file path where the tmpfs volume is to be mounted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath)
     */
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    /**
     * The list of tmpfs volume mount options.
     *
     * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
     * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" |
     * "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
     * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
     * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions)
     */
    public fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

    /**
     * The maximum size (in MiB) of the tmpfs volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size)
     */
    public fun size(): Number

    /**
     * A builder for [TmpfsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerPath The absolute file path where the tmpfs volume is to be mounted.
       */
      public fun containerPath(containerPath: String)

      /**
       * @param mountOptions The list of tmpfs volume mount options.
       * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
       * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime"
       * | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
       * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
       */
      public fun mountOptions(mountOptions: List<String>)

      /**
       * @param mountOptions The list of tmpfs volume mount options.
       * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
       * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime"
       * | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
       * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
       */
      public fun mountOptions(vararg mountOptions: String)

      /**
       * @param size The maximum size (in MiB) of the tmpfs volume. 
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.builder()

      /**
       * @param containerPath The absolute file path where the tmpfs volume is to be mounted.
       */
      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      /**
       * @param mountOptions The list of tmpfs volume mount options.
       * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
       * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime"
       * | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
       * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
       */
      override fun mountOptions(mountOptions: List<String>) {
        cdkBuilder.mountOptions(mountOptions)
      }

      /**
       * @param mountOptions The list of tmpfs volume mount options.
       * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
       * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime"
       * | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
       * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
       */
      override fun mountOptions(vararg mountOptions: String): Unit =
          mountOptions(mountOptions.toList())

      /**
       * @param size The maximum size (in MiB) of the tmpfs volume. 
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty,
    ) : CdkObject(cdkObject), TmpfsProperty {
      /**
       * The absolute file path where the tmpfs volume is to be mounted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-containerpath)
       */
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      /**
       * The list of tmpfs volume mount options.
       *
       * Valid values: `"defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" |
       * "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime"
       * | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" |
       * "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" |
       * "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-mountoptions)
       */
      override fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

      /**
       * The maximum size (in MiB) of the tmpfs volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-tmpfs.html#cfn-ecs-taskdefinition-tmpfs-size)
       */
      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TmpfsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty):
          TmpfsProperty = CdkObjectWrappers.wrap(cdkObject) as? TmpfsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TmpfsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty
    }
  }

  /**
   * The `ulimit` settings to pass to the container.
   *
   * Amazon ECS tasks hosted on AWS Fargate use the default resource limit values set by the
   * operating system with the exception of the `nofile` resource limit parameter which AWS Fargate
   * overrides. The `nofile` resource limit sets a restriction on the number of open files that a
   * container can use. The default `nofile` soft limit is `1024` and the default hard limit is `65535`
   * .
   *
   * You can specify the `ulimit` settings for a container in a task definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * UlimitProperty ulimitProperty = UlimitProperty.builder()
   * .hardLimit(123)
   * .name("name")
   * .softLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html)
   */
  public interface UlimitProperty {
    /**
     * The hard limit for the `ulimit` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-hardlimit)
     */
    public fun hardLimit(): Number

    /**
     * The `type` of the `ulimit` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-name)
     */
    public fun name(): String

    /**
     * The soft limit for the `ulimit` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-softlimit)
     */
    public fun softLimit(): Number

    /**
     * A builder for [UlimitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hardLimit The hard limit for the `ulimit` type. 
       */
      public fun hardLimit(hardLimit: Number)

      /**
       * @param name The `type` of the `ulimit` . 
       */
      public fun name(name: String)

      /**
       * @param softLimit The soft limit for the `ulimit` type. 
       */
      public fun softLimit(softLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.builder()

      /**
       * @param hardLimit The hard limit for the `ulimit` type. 
       */
      override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      /**
       * @param name The `type` of the `ulimit` . 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param softLimit The soft limit for the `ulimit` type. 
       */
      override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty,
    ) : CdkObject(cdkObject), UlimitProperty {
      /**
       * The hard limit for the `ulimit` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-hardlimit)
       */
      override fun hardLimit(): Number = unwrap(this).getHardLimit()

      /**
       * The `type` of the `ulimit` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The soft limit for the `ulimit` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html#cfn-ecs-taskdefinition-ulimit-softlimit)
       */
      override fun softLimit(): Number = unwrap(this).getSoftLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UlimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty):
          UlimitProperty = CdkObjectWrappers.wrap(cdkObject) as? UlimitProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UlimitProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty
    }
  }

  /**
   * Details on a data volume from another container in the same task definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * VolumeFromProperty volumeFromProperty = VolumeFromProperty.builder()
   * .readOnly(false)
   * .sourceContainer("sourceContainer")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html)
   */
  public interface VolumeFromProperty {
    /**
     * If this value is `true` , the container has read-only access to the volume.
     *
     * If this value is `false` , then the container can write to the volume. The default value is
     * `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html#cfn-ecs-taskdefinition-volumefrom-readonly)
     */
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    /**
     * The name of another container within the same task definition to mount volumes from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html#cfn-ecs-taskdefinition-volumefrom-sourcecontainer)
     */
    public fun sourceContainer(): String? = unwrap(this).getSourceContainer()

    /**
     * A builder for [VolumeFromProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      public fun readOnly(readOnly: Boolean)

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      public fun readOnly(readOnly: IResolvable)

      /**
       * @param sourceContainer The name of another container within the same task definition to
       * mount volumes from.
       */
      public fun sourceContainer(sourceContainer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.builder()

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      /**
       * @param readOnly If this value is `true` , the container has read-only access to the volume.
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       */
      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      /**
       * @param sourceContainer The name of another container within the same task definition to
       * mount volumes from.
       */
      override fun sourceContainer(sourceContainer: String) {
        cdkBuilder.sourceContainer(sourceContainer)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty,
    ) : CdkObject(cdkObject), VolumeFromProperty {
      /**
       * If this value is `true` , the container has read-only access to the volume.
       *
       * If this value is `false` , then the container can write to the volume. The default value is
       * `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html#cfn-ecs-taskdefinition-volumefrom-readonly)
       */
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      /**
       * The name of another container within the same task definition to mount volumes from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volumefrom.html#cfn-ecs-taskdefinition-volumefrom-sourcecontainer)
       */
      override fun sourceContainer(): String? = unwrap(this).getSourceContainer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeFromProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty):
          VolumeFromProperty = CdkObjectWrappers.wrap(cdkObject) as? VolumeFromProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeFromProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty
    }
  }

  /**
   * The data volume configuration for tasks launched using this task definition.
   *
   * Specifying a volume configuration in a task definition is optional. The volume configuration
   * may contain multiple volumes but only one volume configured at launch is supported. Each volume
   * defined in the volume configuration may only specify a `name` and one of either
   * `configuredAtLaunch` , `dockerVolumeConfiguration` , `efsVolumeConfiguration` ,
   * `fsxWindowsFileServerVolumeConfiguration` , or `host` . If an empty volume configuration is
   * specified, by default Amazon ECS uses a host volume. For more information, see [Using data volumes
   * in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * VolumeProperty volumeProperty = VolumeProperty.builder()
   * .configuredAtLaunch(false)
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
  public interface VolumeProperty {
    /**
     * Indicates whether the volume should be configured at launch time.
     *
     * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of a
     * service. Each task definition revision may only have one volume configured at launch in the
     * volume configuration.
     *
     * To configure a volume at launch time, use this task definition revision and specify a
     * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask` or
     * `StartTask` APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-configuredatlaunch)
     */
    public fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

    /**
     * This parameter is specified when you use Docker volumes.
     *
     * Windows containers only support the use of the `local` driver. To use bind mounts, specify
     * the `host` parameter instead.
     *
     *
     * Docker volumes aren't supported by tasks run on AWS Fargate .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-dockervolumeconfiguration)
     */
    public fun dockerVolumeConfiguration(): Any? = unwrap(this).getDockerVolumeConfiguration()

    /**
     * This parameter is specified when you use an Amazon Elastic File System file system for task
     * storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-efsvolumeconfiguration)
     */
    public fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

    /**
     * This parameter is specified when you use bind mount host volumes.
     *
     * The contents of the `host` parameter determine whether your bind mount host volume persists
     * on the host container instance and where it's stored. If the `host` parameter is empty, then the
     * Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed to
     * persist after the containers that are associated with it stop running.
     *
     * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
     * Windows containers can't mount directories on a different drive, and mount point can't be across
     * drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
     * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-host)
     */
    public fun host(): Any? = unwrap(this).getHost()

    /**
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores,
     * and hyphens are allowed.
     *
     * When using a volume configured at launch, the `name` is required and must also be specified
     * as the volume name in the `ServiceVolumeConfiguration` or `TaskVolumeConfiguration` parameter
     * when creating your service or standalone task.
     *
     * For all other types of volumes, this name is referenced in the `sourceVolume` parameter of
     * the `mountPoints` object in the container definition.
     *
     * When a volume is using the `efsVolumeConfiguration` , the name is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [VolumeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
       * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
       * a service. Each task definition revision may only have one volume configured at launch in the
       * volume configuration.
       *
       * To configure a volume at launch time, use this task definition revision and specify a
       * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
       * or `StartTask` APIs.
       */
      public fun configuredAtLaunch(configuredAtLaunch: Boolean)

      /**
       * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
       * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
       * a service. Each task definition revision may only have one volume configured at launch in the
       * volume configuration.
       *
       * To configure a volume at launch time, use this task definition revision and specify a
       * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
       * or `StartTask` APIs.
       */
      public fun configuredAtLaunch(configuredAtLaunch: IResolvable)

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable)

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty)

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable)

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      public fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty)

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      public
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      public fun host(host: IResolvable)

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      public fun host(host: HostVolumePropertiesProperty)

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      public fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit)

      /**
       * @param name The name of the volume. Up to 255 letters (uppercase and lowercase), numbers,
       * underscores, and hyphens are allowed.
       * When using a volume configured at launch, the `name` is required and must also be specified
       * as the volume name in the `ServiceVolumeConfiguration` or `TaskVolumeConfiguration` parameter
       * when creating your service or standalone task.
       *
       * For all other types of volumes, this name is referenced in the `sourceVolume` parameter of
       * the `mountPoints` object in the container definition.
       *
       * When a volume is using the `efsVolumeConfiguration` , the name is required.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.builder()

      /**
       * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
       * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
       * a service. Each task definition revision may only have one volume configured at launch in the
       * volume configuration.
       *
       * To configure a volume at launch time, use this task definition revision and specify a
       * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
       * or `StartTask` APIs.
       */
      override fun configuredAtLaunch(configuredAtLaunch: Boolean) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch)
      }

      /**
       * @param configuredAtLaunch Indicates whether the volume should be configured at launch time.
       * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
       * a service. Each task definition revision may only have one volume configured at launch in the
       * volume configuration.
       *
       * To configure a volume at launch time, use this task definition revision and specify a
       * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
       * or `StartTask` APIs.
       */
      override fun configuredAtLaunch(configuredAtLaunch: IResolvable) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch.let(IResolvable::unwrap))
      }

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      override fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(DockerVolumeConfigurationProperty::unwrap))
      }

      /**
       * @param dockerVolumeConfiguration This parameter is specified when you use Docker volumes.
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit):
          Unit =
          dockerVolumeConfiguration(DockerVolumeConfigurationProperty(dockerVolumeConfiguration))

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      override fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      override fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EFSVolumeConfigurationProperty::unwrap))
      }

      /**
       * @param efsVolumeConfiguration This parameter is specified when you use an Amazon Elastic
       * File System file system for task storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = efsVolumeConfiguration(EFSVolumeConfigurationProperty(efsVolumeConfiguration))

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      override fun host(host: IResolvable) {
        cdkBuilder.host(host.let(IResolvable::unwrap))
      }

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      override fun host(host: HostVolumePropertiesProperty) {
        cdkBuilder.host(host.let(HostVolumePropertiesProperty::unwrap))
      }

      /**
       * @param host This parameter is specified when you use bind mount host volumes.
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      override fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit): Unit =
          host(HostVolumePropertiesProperty(host))

      /**
       * @param name The name of the volume. Up to 255 letters (uppercase and lowercase), numbers,
       * underscores, and hyphens are allowed.
       * When using a volume configured at launch, the `name` is required and must also be specified
       * as the volume name in the `ServiceVolumeConfiguration` or `TaskVolumeConfiguration` parameter
       * when creating your service or standalone task.
       *
       * For all other types of volumes, this name is referenced in the `sourceVolume` parameter of
       * the `mountPoints` object in the container definition.
       *
       * When a volume is using the `efsVolumeConfiguration` , the name is required.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty,
    ) : CdkObject(cdkObject), VolumeProperty {
      /**
       * Indicates whether the volume should be configured at launch time.
       *
       * This is used to create Amazon EBS volumes for standalone tasks or tasks created as part of
       * a service. Each task definition revision may only have one volume configured at launch in the
       * volume configuration.
       *
       * To configure a volume at launch time, use this task definition revision and specify a
       * `volumeConfigurations` object when calling the `CreateService` , `UpdateService` , `RunTask`
       * or `StartTask` APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-configuredatlaunch)
       */
      override fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

      /**
       * This parameter is specified when you use Docker volumes.
       *
       * Windows containers only support the use of the `local` driver. To use bind mounts, specify
       * the `host` parameter instead.
       *
       *
       * Docker volumes aren't supported by tasks run on AWS Fargate .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-dockervolumeconfiguration)
       */
      override fun dockerVolumeConfiguration(): Any? = unwrap(this).getDockerVolumeConfiguration()

      /**
       * This parameter is specified when you use an Amazon Elastic File System file system for task
       * storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-efsvolumeconfiguration)
       */
      override fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

      /**
       * This parameter is specified when you use bind mount host volumes.
       *
       * The contents of the `host` parameter determine whether your bind mount host volume persists
       * on the host container instance and where it's stored. If the `host` parameter is empty, then
       * the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed
       * to persist after the containers that are associated with it stop running.
       *
       * Windows containers can mount whole directories on the same drive as `$env:ProgramData` .
       * Windows containers can't mount directories on a different drive, and mount point can't be
       * across drives. For example, you can mount `C:\my\path:C:\my\path` and `D:\:D:\` , but not
       * `D:\my\path:C:\my\path` or `D:\:C:\my\path` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-host)
       */
      override fun host(): Any? = unwrap(this).getHost()

      /**
       * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, underscores,
       * and hyphens are allowed.
       *
       * When using a volume configured at launch, the `name` is required and must also be specified
       * as the volume name in the `ServiceVolumeConfiguration` or `TaskVolumeConfiguration` parameter
       * when creating your service or standalone task.
       *
       * For all other types of volumes, this name is referenced in the `sourceVolume` parameter of
       * the `mountPoints` object in the container definition.
       *
       * When a volume is using the `efsVolumeConfiguration` , the name is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-volume.html#cfn-ecs-taskdefinition-volume-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty):
          VolumeProperty = CdkObjectWrappers.wrap(cdkObject) as? VolumeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty
    }
  }
}
