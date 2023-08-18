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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.constructs.Construct

/**
 * Registers a new task definition from the supplied `family` and `containerDefinitions` .
 *
 * Optionally, you can add data volumes to your containers with the `volumes` parameter. For more
 * information about task definition parameters and defaults, see
 * [Amazon ECS Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * You can specify a role for your task with the `taskRoleArn` parameter. When you specify a role
 * for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API
 * requests to the AWS services that are specified in the policy that's associated with the role.
 * For more information, see
 * [IAM Roles for Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * You can specify a Docker networking mode for the containers in your task definition with the
 * `networkMode` parameter. The available network modes correspond to those described in
 * [Network settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#/network-settings)
 * in the Docker run reference. If you specify the `awsvpc` network mode, the task is allocated an
 * elastic network interface, and you must specify a `NetworkConfiguration` when you create a
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
@CdkDslMarker
public class CfnTaskDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTaskDefinition.Builder = CfnTaskDefinition.Builder.create(scope, id)

    private val _containerDefinitions: MutableList<Any> = mutableListOf()

    private val _inferenceAccelerators: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _requiresCompatibilities: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumes: MutableList<Any> = mutableListOf()

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see
     * [Amazon ECS Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *   different containers that make up your task.
     */
    public fun containerDefinitions(vararg containerDefinitions: Any) {
        _containerDefinitions.addAll(listOf(*containerDefinitions))
    }

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see
     * [Amazon ECS Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *   different containers that make up your task.
     */
    public fun containerDefinitions(containerDefinitions: Collection<Any>) {
        _containerDefinitions.addAll(containerDefinitions)
    }

    /**
     * A list of container definitions in JSON format that describe the different containers that
     * make up your task.
     *
     * For more information about container definition parameters and defaults, see
     * [Amazon ECS Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-containerdefinitions)
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *   different containers that make up your task.
     */
    public fun containerDefinitions(containerDefinitions: IResolvable) {
        cdkBuilder.containerDefinitions(containerDefinitions)
    }

    /**
     * The number of `cpu` units used by the task.
     *
     * If you use the EC2 launch type, this field is optional. Any value can be used. If you use the
     * Fargate launch type, this field is required. You must use one of the following values. The
     * value that you choose determines your range of valid values for the `memory` parameter.
     *
     * The CPU units cannot be less than 1 vCPU when you use Windows containers on Fargate.
     * * 256 (.25 vCPU) - Available `memory` values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     * * 512 (.5 vCPU) - Available `memory` values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4
     *   GB)
     * * 1024 (1 vCPU) - Available `memory` values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5
     *   GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * * 2048 (2 vCPU) - Available `memory` values: 4096 (4 GB) and 16384 (16 GB) in increments of
     *   1024 (1 GB)
     * * 4096 (4 vCPU) - Available `memory` values: 8192 (8 GB) and 30720 (30 GB) in increments of
     *   1024 (1 GB)
     * * 8192 (8 vCPU) - Available `memory` values: 16 GB and 60 GB in 4 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     * * 16384 (16vCPU) - Available `memory` values: 32GB and 120 GB in 8 GB increments
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-cpu)
     *
     * @param cpu The number of `cpu` units used by the task.
     */
    public fun cpu(cpu: String) {
        cdkBuilder.cpu(cpu)
    }

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     *
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     *   definition.
     */
    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * The ephemeral storage settings to use for tasks run with the task definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ephemeralstorage)
     *
     * @param ephemeralStorage The ephemeral storage settings to use for tasks run with the task
     *   definition.
     */
    public fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    /**
     * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS
     * container agent permission to make AWS API calls on your behalf.
     *
     * The task execution IAM role is required depending on the requirements of your task. For more
     * information, see
     * [Amazon ECS task execution IAM role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-executionrolearn)
     *
     * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
     *   the Amazon ECS container agent permission to make AWS API calls on your behalf.
     */
    public fun executionRoleArn(executionRoleArn: String) {
        cdkBuilder.executionRoleArn(executionRoleArn)
    }

    /**
     * The name of a family that this task definition is registered to.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     *
     * A family groups multiple versions of a task definition. Amazon ECS gives the first task
     * definition that you registered to a family a revision number of 1. Amazon ECS gives
     * sequential revision numbers to each task definition that you add.
     *
     * To use revision numbers when you update a task definition, specify this property. If you
     * don't specify a value, AWS CloudFormation generates a new task definition each time that you
     * update it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-family)
     *
     * @param family The name of a family that this task definition is registered to.
     */
    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     *
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     *   the task.
     */
    public fun inferenceAccelerators(vararg inferenceAccelerators: Any) {
        _inferenceAccelerators.addAll(listOf(*inferenceAccelerators))
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     *
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     *   the task.
     */
    public fun inferenceAccelerators(inferenceAccelerators: Collection<Any>) {
        _inferenceAccelerators.addAll(inferenceAccelerators)
    }

    /**
     * The Elastic Inference accelerators to use for the containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-inferenceaccelerators)
     *
     * @param inferenceAccelerators The Elastic Inference accelerators to use for the containers in
     *   the task.
     */
    public fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
        cdkBuilder.inferenceAccelerators(inferenceAccelerators)
    }

    /**
     * The IPC resource namespace to use for the containers in the task.
     *
     * The valid values are `host` , `task` , or `none` . If `host` is specified, then all
     * containers within the tasks that specified the `host` IPC mode on the same container instance
     * share the same IPC resources with the host Amazon EC2 instance. If `task` is specified, all
     * containers within the specified task share the same IPC resources. If `none` is specified,
     * then IPC resources within the containers of a task are private and not shared with other
     * containers in a task or on the container instance. If no value is specified, then the IPC
     * resource namespace sharing depends on the Docker daemon setting on the container instance.
     * For more information, see
     * [IPC settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#ipc-settings---ipc)
     * in the *Docker run reference* .
     *
     * If the `host` IPC mode is used, be aware that there is a heightened risk of undesired IPC
     * namespace expose. For more information, see
     * [Docker security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/)
     * .
     *
     * If you are setting namespaced kernel parameters using `systemControls` for the containers in
     * the task, the following will apply to your IPC resource namespace. For more information, see
     * [System Controls](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     * * For tasks that use the `host` IPC mode, IPC namespace related `systemControls` are not
     *   supported.
     * * For tasks that use the `task` IPC mode, IPC namespace related `systemControls` will apply
     *   to all containers within a task.
     *
     * This parameter is not supported for Windows containers or tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-ipcmode)
     *
     * @param ipcMode The IPC resource namespace to use for the containers in the task.
     */
    public fun ipcMode(ipcMode: String) {
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
     * * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available `cpu` values: 256 (.25 vCPU)
     * * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available `cpu` values: 512 (.5 vCPU)
     * * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) -
     *   Available `cpu` values: 1024 (1 vCPU)
     * * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available `cpu`
     *   values: 2048 (2 vCPU)
     * * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available `cpu`
     *   values: 4096 (4 vCPU)
     * * Between 16 GB and 60 GB in 4 GB increments - Available `cpu` values: 8192 (8 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     * * Between 32GB and 120 GB in 8 GB increments - Available `cpu` values: 16384 (16 vCPU)
     *
     * This option requires Linux platform `1.4.0` or later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-memory)
     *
     * @param memory The amount (in MiB) of memory used by the task.
     */
    public fun memory(memory: String) {
        cdkBuilder.memory(memory)
    }

    /**
     * The Docker networking mode to use for the containers in the task.
     *
     * The valid values are `none` , `bridge` , `awsvpc` , and `host` . If no network mode is
     * specified, the default is `bridge` .
     *
     * For Amazon ECS tasks on Fargate, the `awsvpc` network mode is required. For Amazon ECS tasks
     * on Amazon EC2 Linux instances, any network mode can be used. For Amazon ECS tasks on Amazon
     * EC2 Windows instances, `&lt;default&gt;` or `awsvpc` can be used. If the network mode is set
     * to `none` , you cannot specify port mappings in your container definitions, and the tasks
     * containers do not have external connectivity. The `host` and `awsvpc` network modes offer the
     * highest networking performance for containers because they use the EC2 network stack instead
     * of the virtualized network stack provided by the `bridge` mode.
     *
     * With the `host` and `awsvpc` network modes, exposed container ports are mapped directly to
     * the corresponding host port (for the `host` network mode) or the attached elastic network
     * interface port (for the `awsvpc` network mode), so you cannot take advantage of dynamic host
     * port mappings.
     *
     * When using the `host` network mode, you should not run containers using the root user (UID
     * 0). It is considered best practice to use a non-root user.
     *
     * If the network mode is `awsvpc` , the task is allocated an elastic network interface, and you
     * must specify a `NetworkConfiguration` value when you create a service or run a task with the
     * task definition. For more information, see
     * [Task Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * If the network mode is `host` , you cannot run multiple instantiations of the same task on a
     * single container instance when port mappings are used.
     *
     * For more information, see
     * [Network settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#network-settings)
     * in the *Docker run reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-networkmode)
     *
     * @param networkMode The Docker networking mode to use for the containers in the task.
     */
    public fun networkMode(networkMode: String) {
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
     * the same container instance share the same process namespace with the host Amazon EC2
     * instance.
     *
     * If `task` is specified, all containers within the specified task share the same process
     * namespace.
     *
     * If no value is specified, the default is a private namespace for each container. For more
     * information, see
     * [PID settings](https://docs.aws.amazon.com/https://docs.docker.com/engine/reference/run/#pid-settings---pid)
     * in the *Docker run reference* .
     *
     * If the `host` PID mode is used, there's a heightened risk of undesired process namespace
     * exposure. For more information, see
     * [Docker security](https://docs.aws.amazon.com/https://docs.docker.com/engine/security/security/)
     * .
     *
     * This parameter is not supported for Windows containers. &gt; This parameter is only supported
     * for tasks that are hosted on AWS Fargate if the tasks are using platform version `1.4.0` or
     * later (Linux). This isn't supported for Windows containers on Fargate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-pidmode)
     *
     * @param pidMode The process namespace to use for the containers in the task.
     */
    public fun pidMode(pidMode: String) {
        cdkBuilder.pidMode(pidMode)
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks.
     */
    public fun placementConstraints(vararg placementConstraints: Any) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks.
     */
    public fun placementConstraints(placementConstraints: Collection<Any>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * An array of placement constraint objects to use for tasks.
     *
     * This parameter isn't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks.
     */
    public fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or
     * later, they contain the required versions of the container agent and `ecs-init` . For more
     * information, see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    public fun proxyConfiguration(proxyConfiguration: IResolvable) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * The configuration details for the App Mesh proxy.
     *
     * Your Amazon ECS container instances require at least version 1.26.0 of the container agent
     * and at least version 1.26.0-1 of the `ecs-init` package to use a proxy configuration. If your
     * container instances are launched from the Amazon ECS optimized AMI version `20190301` or
     * later, they contain the required versions of the container agent and `ecs-init` . For more
     * information, see
     * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-proxyconfiguration)
     *
     * @param proxyConfiguration The configuration details for the App Mesh proxy.
     */
    public fun proxyConfiguration(
        proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty
    ) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see
     * [Amazon ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     *
     * @param requiresCompatibilities The task launch types the task definition was validated
     *   against.
     */
    public fun requiresCompatibilities(vararg requiresCompatibilities: String) {
        _requiresCompatibilities.addAll(listOf(*requiresCompatibilities))
    }

    /**
     * The task launch types the task definition was validated against.
     *
     * The valid values are `EC2` , `FARGATE` , and `EXTERNAL` . For more information, see
     * [Amazon ECS launch types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-requirescompatibilities)
     *
     * @param requiresCompatibilities The task launch types the task definition was validated
     *   against.
     */
    public fun requiresCompatibilities(requiresCompatibilities: Collection<String>) {
        _requiresCompatibilities.addAll(requiresCompatibilities)
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
     *
     * @param runtimePlatform The operating system that your tasks definitions run on.
     */
    public fun runtimePlatform(runtimePlatform: IResolvable) {
        cdkBuilder.runtimePlatform(runtimePlatform)
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
     *
     * @param runtimePlatform The operating system that your tasks definitions run on.
     */
    public fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     *
     * @param tags The metadata that you apply to the task definition to help you categorize and
     *   organize them.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The metadata that you apply to the task definition to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both of them.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-tags)
     *
     * @param tags The metadata that you apply to the task definition to help you categorize and
     *   organize them.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management
     * role that grants containers in the task permission to call AWS APIs on your behalf.
     *
     * For more information, see
     * [Amazon ECS Task Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * IAM roles for tasks on Windows require that the `-EnableTaskIAMRole` option is set when you
     * launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration
     * code to use the feature. For more information, see
     * [Windows IAM roles for tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-taskrolearn)
     *
     * @param taskRoleArn The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     *   Access Management role that grants containers in the task permission to call AWS APIs on
     *   your behalf.
     */
    public fun taskRoleArn(taskRoleArn: String) {
        cdkBuilder.taskRoleArn(taskRoleArn)
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see
     * [Using data volumes in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     *
     * @param volumes The list of data volume definitions for the task.
     */
    public fun volumes(vararg volumes: Any) {
        _volumes.addAll(listOf(*volumes))
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see
     * [Using data volumes in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     *
     * @param volumes The list of data volume definitions for the task.
     */
    public fun volumes(volumes: Collection<Any>) {
        _volumes.addAll(volumes)
    }

    /**
     * The list of data volume definitions for the task.
     *
     * For more information, see
     * [Using data volumes in tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_data_volumes.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * The `host` and `sourcePath` parameters aren't supported for tasks run on AWS Fargate .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskdefinition.html#cfn-ecs-taskdefinition-volumes)
     *
     * @param volumes The list of data volume definitions for the task.
     */
    public fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes)
    }

    public fun build(): CfnTaskDefinition {
        if (_containerDefinitions.isNotEmpty())
            cdkBuilder.containerDefinitions(_containerDefinitions)
        if (_inferenceAccelerators.isNotEmpty())
            cdkBuilder.inferenceAccelerators(_inferenceAccelerators)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_requiresCompatibilities.isNotEmpty())
            cdkBuilder.requiresCompatibilities(_requiresCompatibilities)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
