@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
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
 * A container definition is used in a task definition to describe the containers that are launched
 * as part of a task.
 *
 * Example:
 *
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
public open class ContainerDefinition(
  cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ContainerDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.ecs.ContainerDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ContainerDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ContainerDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, ContainerDefinitionProps(props)
  )

  /**
   * This method adds one or more container dependencies to the container.
   *
   * @param containerDependencies 
   */
  public open fun addContainerDependencies(vararg containerDependencies: ContainerDependency) {
    unwrap(this).addContainerDependencies(*containerDependencies.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.ecs.ContainerDependency}.toTypedArray())
  }

  /**
   * This method adds one or more container dependencies to the container.
   *
   * @param containerDependencies 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88806b46064561a05cee758bbc018174d73d3488ac652242faf6a5e6f9d0d0b4")
  public open
      fun addContainerDependencies(containerDependencies: ContainerDependency.Builder.() -> Unit):
      Unit = addContainerDependencies(ContainerDependency(containerDependencies))

  /**
   * This method adds an environment variable to the container.
   *
   * @param name 
   * @param value 
   */
  public open fun addEnvironment(name: String, `value`: String) {
    unwrap(this).addEnvironment(name, `value`)
  }

  /**
   * This method adds one or more resources to the container.
   *
   * @param inferenceAcceleratorResources 
   */
  public open fun addInferenceAcceleratorResource(vararg inferenceAcceleratorResources: String) {
    unwrap(this).addInferenceAcceleratorResource(*inferenceAcceleratorResources.map{CdkObjectWrappers.unwrap(it)
        as String}.toTypedArray())
  }

  /**
   * This method adds a link which allows containers to communicate with each other without the need
   * for port mappings.
   *
   * This parameter is only supported if the task definition is using the bridge network mode.
   * Warning: The --link flag is a legacy feature of Docker. It may eventually be removed.
   *
   * @param container 
   * @param alias
   */
  public open fun addLink(container: ContainerDefinition) {
    unwrap(this).addLink(container.let(ContainerDefinition::unwrap))
  }

  /**
   * This method adds a link which allows containers to communicate with each other without the need
   * for port mappings.
   *
   * This parameter is only supported if the task definition is using the bridge network mode.
   * Warning: The --link flag is a legacy feature of Docker. It may eventually be removed.
   *
   * @param container 
   * @param alias
   */
  public open fun addLink(container: ContainerDefinition, alias: String) {
    unwrap(this).addLink(container.let(ContainerDefinition::unwrap), alias)
  }

  /**
   * This method adds one or more mount points for data volumes to the container.
   *
   * @param mountPoints 
   */
  public open fun addMountPoints(vararg mountPoints: MountPoint) {
    unwrap(this).addMountPoints(*mountPoints.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.ecs.MountPoint}.toTypedArray())
  }

  /**
   * This method adds one or more mount points for data volumes to the container.
   *
   * @param mountPoints 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e14b36bfa3981e2bfe79e474ad186b93d0db3606bf9e701e9efe18115f473eb1")
  public open fun addMountPoints(mountPoints: MountPoint.Builder.() -> Unit): Unit =
      addMountPoints(MountPoint(mountPoints))

  /**
   * This method adds one or more port mappings to the container.
   *
   * @param portMappings 
   */
  public open fun addPortMappings(vararg portMappings: PortMapping) {
    unwrap(this).addPortMappings(*portMappings.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.ecs.PortMapping}.toTypedArray())
  }

  /**
   * This method adds one or more port mappings to the container.
   *
   * @param portMappings 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbd7e9d940149ead69e277851262f04b176580ab2abd1e849027bf1b0dbf4ca5")
  public open fun addPortMappings(portMappings: PortMapping.Builder.() -> Unit): Unit =
      addPortMappings(PortMapping(portMappings))

  /**
   * This method mounts temporary disk space to the container.
   *
   * This adds the correct container mountPoint and task definition volume.
   *
   * @param scratch 
   */
  public open fun addScratch(scratch: ScratchSpace) {
    unwrap(this).addScratch(scratch.let(ScratchSpace::unwrap))
  }

  /**
   * This method mounts temporary disk space to the container.
   *
   * This adds the correct container mountPoint and task definition volume.
   *
   * @param scratch 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff9c0c8fd5fea6c56869107ca1ed417cebf096c9cb8f88c14f25f3f4f9d98c37")
  public open fun addScratch(scratch: ScratchSpace.Builder.() -> Unit): Unit =
      addScratch(ScratchSpace(scratch))

  /**
   * This method adds a secret as environment variable to the container.
   *
   * @param name 
   * @param secret 
   */
  public open fun addSecret(name: String, secret: Secret) {
    unwrap(this).addSecret(name, secret.let(Secret::unwrap))
  }

  /**
   * This method adds the specified statement to the IAM task execution policy in the task
   * definition.
   *
   * @param statement 
   */
  public open fun addToExecutionPolicy(statement: PolicyStatement) {
    unwrap(this).addToExecutionPolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * This method adds the specified statement to the IAM task execution policy in the task
   * definition.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("039a93f76689b8a320db575cd26546b187f84c8bfb6b107d1e314cc8f3f67537")
  public open fun addToExecutionPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToExecutionPolicy(PolicyStatement(statement))

  /**
   * This method adds one or more ulimits to the container.
   *
   * @param ulimits 
   */
  public open fun addUlimits(vararg ulimits: Ulimit) {
    unwrap(this).addUlimits(*ulimits.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.ecs.Ulimit}.toTypedArray())
  }

  /**
   * This method adds one or more ulimits to the container.
   *
   * @param ulimits 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d7fc6aed419eb143848f2368ac5d27d23987101d3eab2d6425dcefdd725824f")
  public open fun addUlimits(ulimits: Ulimit.Builder.() -> Unit): Unit = addUlimits(Ulimit(ulimits))

  /**
   * This method adds one or more volumes to the container.
   *
   * @param volumesFrom 
   */
  public open fun addVolumesFrom(vararg volumesFrom: VolumeFrom) {
    unwrap(this).addVolumesFrom(*volumesFrom.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.services.ecs.VolumeFrom}.toTypedArray())
  }

  /**
   * This method adds one or more volumes to the container.
   *
   * @param volumesFrom 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5ab90466bf3e8ae1ece29b6168441a4c551332eb319e332c19e82f267866b48")
  public open fun addVolumesFrom(volumesFrom: VolumeFrom.Builder.() -> Unit): Unit =
      addVolumesFrom(VolumeFrom(volumesFrom))

  /**
   * An array dependencies defined for container startup and shutdown.
   */
  public open fun containerDependencies(): List<ContainerDependency> =
      unwrap(this).getContainerDependencies().map(ContainerDependency::wrap)

  /**
   * The name of this container.
   */
  public open fun containerName(): String = unwrap(this).getContainerName()

  /**
   * The port the container will listen on.
   */
  public open fun containerPort(): Number = unwrap(this).getContainerPort()

  /**
   * The number of cpu units reserved for the container.
   */
  public open fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * The crdential specifications for this container.
   */
  public open fun credentialSpecs(): List<CredentialSpecConfig> =
      unwrap(this).getCredentialSpecs()?.map(CredentialSpecConfig::wrap) ?: emptyList()

  /**
   * The environment files for this container.
   */
  public open fun environmentFiles(): List<EnvironmentFileConfig> =
      unwrap(this).getEnvironmentFiles()?.map(EnvironmentFileConfig::wrap) ?: emptyList()

  /**
   * Specifies whether the container will be marked essential.
   *
   * If the essential parameter of a container is marked as true, and that container
   * fails or stops for any reason, all other containers that are part of the task are
   * stopped. If the essential parameter of a container is marked as false, then its
   * failure does not affect the rest of the containers in a task.
   *
   * If this parameter is omitted, a container is assumed to be essential.
   */
  public open fun essential(): Boolean = unwrap(this).getEssential()

  /**
   * Returns the host port for the requested container port if it exists.
   *
   * @param containerPort 
   * @param protocol 
   */
  public open fun findPortMapping(containerPort: Number, protocol: Protocol): PortMapping? =
      unwrap(this).findPortMapping(containerPort,
      protocol.let(Protocol::unwrap))?.let(PortMapping::wrap)

  /**
   * Returns the port mapping with the given name, if it exists.
   *
   * @param name 
   */
  public open fun findPortMappingByName(name: String): PortMapping? =
      unwrap(this).findPortMappingByName(name)?.let(PortMapping::wrap)

  /**
   * The name of the image referenced by this container.
   */
  public open fun imageName(): String = unwrap(this).getImageName()

  /**
   * The inbound rules associated with the security group the task or service will use.
   *
   * This property is only used for tasks that use the awsvpc network mode.
   */
  public open fun ingressPort(): Number = unwrap(this).getIngressPort()

  /**
   * The Linux-specific modifications that are applied to the container, such as Linux kernel
   * capabilities.
   */
  public open fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  /**
   * The log configuration specification for the container.
   */
  public open fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  /**
   * Whether there was at least one memory limit specified in this definition.
   */
  public open fun memoryLimitSpecified(): Boolean = unwrap(this).getMemoryLimitSpecified()

  /**
   * The mount points for data volumes in your container.
   */
  public open fun mountPoints(): List<MountPoint> =
      unwrap(this).getMountPoints().map(MountPoint::wrap)

  /**
   * The list of port mappings for the container.
   *
   * Port mappings allow containers to access ports
   * on the host container instance to send or receive traffic.
   */
  public open fun portMappings(): List<PortMapping> =
      unwrap(this).getPortMappings().map(PortMapping::wrap)

  /**
   * Specifies whether a TTY must be allocated for this container.
   */
  public open fun pseudoTerminal(): Boolean? = unwrap(this).getPseudoTerminal()

  /**
   * Whether this container definition references a specific JSON field of a secret stored in
   * Secrets Manager.
   */
  public open fun referencesSecretJsonField(): Boolean? =
      unwrap(this).getReferencesSecretJsonField()

  /**
   * Render this container definition to a CloudFormation object.
   *
   * @param _taskDefinition [disable-awslint:ref-via-interface] (unused but kept to avoid breaking
   * change).
   */
  public open fun renderContainerDefinition(): CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition().let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  /**
   * Render this container definition to a CloudFormation object.
   *
   * @param _taskDefinition [disable-awslint:ref-via-interface] (unused but kept to avoid breaking
   * change).
   */
  public open fun renderContainerDefinition(taskDefinition: TaskDefinition):
      CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition(taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  /**
   * The name of the task definition that includes this container definition.
   */
  public open fun taskDefinition(): TaskDefinition =
      unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

  /**
   * An array of ulimits to set in the container.
   */
  public open fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

  /**
   * The data volumes to mount from another container in the same task definition.
   */
  public open fun volumesFrom(): List<VolumeFrom> =
      unwrap(this).getVolumesFrom().map(VolumeFrom::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.ContainerDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    public fun command(command: List<String>)

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    public fun command(vararg command: String)

    /**
     * The name of the container.
     *
     * Default: - id of node associated with ContainerDefinition.
     *
     * @param containerName The name of the container. 
     */
    public fun containerName(containerName: String)

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Default: - No minimum CPU units reserved.
     *
     * @param cpu The minimum number of CPU units to reserve for the container. 
     */
    public fun cpu(cpu: Number)

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
     * container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     *
     * Default: - No credential specs.
     *
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication. 
     */
    public fun credentialSpecs(credentialSpecs: List<CredentialSpec>)

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
     * container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     *
     * Default: - No credential specs.
     *
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication. 
     */
    public fun credentialSpecs(vararg credentialSpecs: CredentialSpec)

    /**
     * Specifies whether networking is disabled within the container.
     *
     * When this parameter is true, networking is disabled within the container.
     *
     * Default: false
     *
     * @param disableNetworking Specifies whether networking is disabled within the container. 
     */
    public fun disableNetworking(disableNetworking: Boolean)

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. 
     */
    public fun dnsSearchDomains(dnsSearchDomains: List<String>)

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. 
     */
    public fun dnsSearchDomains(vararg dnsSearchDomains: String)

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. 
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. 
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * A key/value map of labels to add to the container.
     *
     * Default: - No labels.
     *
     * @param dockerLabels A key/value map of labels to add to the container. 
     */
    public fun dockerLabels(dockerLabels: Map<String, String>)

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems. 
     */
    public fun dockerSecurityOptions(dockerSecurityOptions: List<String>)

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems. 
     */
    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String)

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entryPoint The ENTRYPOINT value to pass to the container. 
     */
    public fun entryPoint(entryPoint: List<String>)

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entryPoint The ENTRYPOINT value to pass to the container. 
     */
    public fun entryPoint(vararg entryPoint: String)

    /**
     * The environment variables to pass to the container.
     *
     * Default: - No environment variables.
     *
     * @param environment The environment variables to pass to the container. 
     */
    public fun environment(environment: Map<String, String>)

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * @param environmentFiles The environment files to pass to the container. 
     */
    public fun environmentFiles(environmentFiles: List<EnvironmentFile>)

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * @param environmentFiles The environment files to pass to the container. 
     */
    public fun environmentFiles(vararg environmentFiles: EnvironmentFile)

    /**
     * Specifies whether the container is marked essential.
     *
     * If the essential parameter of a container is marked as true, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped.
     * If the essential parameter of a container is marked as false, then its failure does not
     * affect the rest of the containers in a task. All tasks must have at least one essential
     * container.
     *
     * If this parameter is omitted, a container is assumed to be essential.
     *
     * Default: true
     *
     * @param essential Specifies whether the container is marked essential. 
     */
    public fun essential(essential: Boolean)

    /**
     * A list of hostnames and IP address mappings to append to the /etc/hosts file on the
     * container.
     *
     * Default: - No extra hosts.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts
     * file on the container. 
     */
    public fun extraHosts(extraHosts: Map<String, String>)

    /**
     * The number of GPUs assigned to the container.
     *
     * Default: - No GPUs assigned.
     *
     * @param gpuCount The number of GPUs assigned to the container. 
     */
    public fun gpuCount(gpuCount: Number)

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e1e6a2539bf792ecb2959114207c3aed5a48bf132e85318c8c57f72f4e73ed7")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * The hostname to use for your container.
     *
     * Default: - Automatic hostname.
     *
     * @param hostname The hostname to use for your container. 
     */
    public fun hostname(hostname: String)

    /**
     * The image used to start a container.
     *
     * This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default.
     * Other repositories are specified with either repository-url/image:tag or
     * repository-url/image&#64;digest.
     * TODO: Update these to specify using classes of IContainerImage
     *
     * @param image The image used to start a container. 
     */
    public fun image(image: ContainerImage)

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container. 
     */
    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>)

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container. 
     */
    public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String)

    /**
     * When this parameter is true, you can deploy containerized applications that require stdin or
     * a tty to be allocated.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
     * @param interactive When this parameter is true, you can deploy containerized applications
     * that require stdin or a tty to be allocated. 
     */
    public fun interactive(interactive: Boolean)

    /**
     * Linux-specific modifications that are applied to the container, such as Linux kernel
     * capabilities.
     *
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     *
     * Default: - No Linux parameters.
     *
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as Linux kernel capabilities. 
     */
    public fun linuxParameters(linuxParameters: LinuxParameters)

    /**
     * The log configuration specification for the container.
     *
     * Default: - Containers use the same logging driver that the Docker daemon uses.
     *
     * @param logging The log configuration specification for the container. 
     */
    public fun logging(logging: LogDriver)

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container. 
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number)

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition. 
     */
    public fun portMappings(portMappings: List<PortMapping>)

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition. 
     */
    public fun portMappings(vararg portMappings: PortMapping)

    /**
     * Specifies whether the container is marked as privileged.
     *
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     *
     * Default: false
     *
     * @param privileged Specifies whether the container is marked as privileged. 
     */
    public fun privileged(privileged: Boolean)

    /**
     * When this parameter is true, a TTY is allocated.
     *
     * This parameter maps to Tty in the "Create a container section" of the
     * Docker Remote API and the --tty option to `docker run`.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_pseudoterminal)
     * @param pseudoTerminal When this parameter is true, a TTY is allocated. 
     */
    public fun pseudoTerminal(pseudoTerminal: Boolean)

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * Default: false
     *
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     * access to its root file system. 
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    /**
     * The secret environment variables to pass to the container.
     *
     * Default: - No secret environment variables.
     *
     * @param secrets The secret environment variables to pass to the container. 
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * Time duration (in seconds) to wait before giving up on resolving dependencies for a
     * container.
     *
     * Default: - none
     *
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     * dependencies for a container. 
     */
    public fun startTimeout(startTimeout: Duration)

    /**
     * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
     * exit normally on its own.
     *
     * Default: - none
     *
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     * killed if it doesn't exit normally on its own. 
     */
    public fun stopTimeout(stopTimeout: Duration)

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     * @param systemControls A list of namespaced kernel parameters to set in the container. 
     */
    public fun systemControls(systemControls: List<SystemControl>)

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     * @param systemControls A list of namespaced kernel parameters to set in the container. 
     */
    public fun systemControls(vararg systemControls: SystemControl)

    /**
     * The name of the task definition that includes this container definition.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param taskDefinition The name of the task definition that includes this container
     * definition. 
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container. 
     */
    public fun ulimits(ulimits: List<Ulimit>)

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container. 
     */
    public fun ulimits(vararg ulimits: Ulimit)

    /**
     * The user to use inside the container.
     *
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     *
     * Default: root
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-user)
     * @param user The user to use inside the container. 
     */
    public fun user(user: String)

    /**
     * The working directory in which to run commands inside the container.
     *
     * Default: /
     *
     * @param workingDirectory The working directory in which to run commands inside the container. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDefinition.Builder =
        software.amazon.awscdk.services.ecs.ContainerDefinition.Builder.create(scope, id)

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     *
     * @param command The command that is passed to the container. 
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * The name of the container.
     *
     * Default: - id of node associated with ContainerDefinition.
     *
     * @param containerName The name of the container. 
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Default: - No minimum CPU units reserved.
     *
     * @param cpu The minimum number of CPU units to reserve for the container. 
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
     * container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     *
     * Default: - No credential specs.
     *
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication. 
     */
    override fun credentialSpecs(credentialSpecs: List<CredentialSpec>) {
      cdkBuilder.credentialSpecs(credentialSpecs.map(CredentialSpec::unwrap))
    }

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
     * container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     *
     * Default: - No credential specs.
     *
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication. 
     */
    override fun credentialSpecs(vararg credentialSpecs: CredentialSpec): Unit =
        credentialSpecs(credentialSpecs.toList())

    /**
     * Specifies whether networking is disabled within the container.
     *
     * When this parameter is true, networking is disabled within the container.
     *
     * Default: false
     *
     * @param disableNetworking Specifies whether networking is disabled within the container. 
     */
    override fun disableNetworking(disableNetworking: Boolean) {
      cdkBuilder.disableNetworking(disableNetworking)
    }

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. 
     */
    override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
      cdkBuilder.dnsSearchDomains(dnsSearchDomains)
    }

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     *
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container. 
     */
    override fun dnsSearchDomains(vararg dnsSearchDomains: String): Unit =
        dnsSearchDomains(dnsSearchDomains.toList())

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. 
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     *
     * @param dnsServers A list of DNS servers that are presented to the container. 
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * A key/value map of labels to add to the container.
     *
     * Default: - No labels.
     *
     * @param dockerLabels A key/value map of labels to add to the container. 
     */
    override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems. 
     */
    override fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
      cdkBuilder.dockerSecurityOptions(dockerSecurityOptions)
    }

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     *
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems. 
     */
    override fun dockerSecurityOptions(vararg dockerSecurityOptions: String): Unit =
        dockerSecurityOptions(dockerSecurityOptions.toList())

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entryPoint The ENTRYPOINT value to pass to the container. 
     */
    override fun entryPoint(entryPoint: List<String>) {
      cdkBuilder.entryPoint(entryPoint)
    }

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entryPoint The ENTRYPOINT value to pass to the container. 
     */
    override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

    /**
     * The environment variables to pass to the container.
     *
     * Default: - No environment variables.
     *
     * @param environment The environment variables to pass to the container. 
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * @param environmentFiles The environment files to pass to the container. 
     */
    override fun environmentFiles(environmentFiles: List<EnvironmentFile>) {
      cdkBuilder.environmentFiles(environmentFiles.map(EnvironmentFile::unwrap))
    }

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     * @param environmentFiles The environment files to pass to the container. 
     */
    override fun environmentFiles(vararg environmentFiles: EnvironmentFile): Unit =
        environmentFiles(environmentFiles.toList())

    /**
     * Specifies whether the container is marked essential.
     *
     * If the essential parameter of a container is marked as true, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped.
     * If the essential parameter of a container is marked as false, then its failure does not
     * affect the rest of the containers in a task. All tasks must have at least one essential
     * container.
     *
     * If this parameter is omitted, a container is assumed to be essential.
     *
     * Default: true
     *
     * @param essential Specifies whether the container is marked essential. 
     */
    override fun essential(essential: Boolean) {
      cdkBuilder.essential(essential)
    }

    /**
     * A list of hostnames and IP address mappings to append to the /etc/hosts file on the
     * container.
     *
     * Default: - No extra hosts.
     *
     * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts
     * file on the container. 
     */
    override fun extraHosts(extraHosts: Map<String, String>) {
      cdkBuilder.extraHosts(extraHosts)
    }

    /**
     * The number of GPUs assigned to the container.
     *
     * Default: - No GPUs assigned.
     *
     * @param gpuCount The number of GPUs assigned to the container. 
     */
    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     *
     * @param healthCheck The health check command and associated configuration parameters for the
     * container. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e1e6a2539bf792ecb2959114207c3aed5a48bf132e85318c8c57f72f4e73ed7")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * The hostname to use for your container.
     *
     * Default: - Automatic hostname.
     *
     * @param hostname The hostname to use for your container. 
     */
    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    /**
     * The image used to start a container.
     *
     * This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default.
     * Other repositories are specified with either repository-url/image:tag or
     * repository-url/image&#64;digest.
     * TODO: Update these to specify using classes of IContainerImage
     *
     * @param image The image used to start a container. 
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container. 
     */
    override fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>) {
      cdkBuilder.inferenceAcceleratorResources(inferenceAcceleratorResources)
    }

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     *
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container. 
     */
    override fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String): Unit =
        inferenceAcceleratorResources(inferenceAcceleratorResources.toList())

    /**
     * When this parameter is true, you can deploy containerized applications that require stdin or
     * a tty to be allocated.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
     * @param interactive When this parameter is true, you can deploy containerized applications
     * that require stdin or a tty to be allocated. 
     */
    override fun interactive(interactive: Boolean) {
      cdkBuilder.interactive(interactive)
    }

    /**
     * Linux-specific modifications that are applied to the container, such as Linux kernel
     * capabilities.
     *
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     *
     * Default: - No Linux parameters.
     *
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as Linux kernel capabilities. 
     */
    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    /**
     * The log configuration specification for the container.
     *
     * Default: - Containers use the same logging driver that the Docker daemon uses.
     *
     * @param logging The log configuration specification for the container. 
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     *
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container. 
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * The soft limit (in MiB) of memory to reserve for the container.
     *
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory reserved.
     *
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container. 
     */
    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition. 
     */
    override fun portMappings(portMappings: List<PortMapping>) {
      cdkBuilder.portMappings(portMappings.map(PortMapping::unwrap))
    }

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     *
     * @param portMappings The port mappings to add to the container definition. 
     */
    override fun portMappings(vararg portMappings: PortMapping): Unit =
        portMappings(portMappings.toList())

    /**
     * Specifies whether the container is marked as privileged.
     *
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     *
     * Default: false
     *
     * @param privileged Specifies whether the container is marked as privileged. 
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    /**
     * When this parameter is true, a TTY is allocated.
     *
     * This parameter maps to Tty in the "Create a container section" of the
     * Docker Remote API and the --tty option to `docker run`.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_pseudoterminal)
     * @param pseudoTerminal When this parameter is true, a TTY is allocated. 
     */
    override fun pseudoTerminal(pseudoTerminal: Boolean) {
      cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * Default: false
     *
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     * access to its root file system. 
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * The secret environment variables to pass to the container.
     *
     * Default: - No secret environment variables.
     *
     * @param secrets The secret environment variables to pass to the container. 
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * Time duration (in seconds) to wait before giving up on resolving dependencies for a
     * container.
     *
     * Default: - none
     *
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     * dependencies for a container. 
     */
    override fun startTimeout(startTimeout: Duration) {
      cdkBuilder.startTimeout(startTimeout.let(Duration::unwrap))
    }

    /**
     * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
     * exit normally on its own.
     *
     * Default: - none
     *
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     * killed if it doesn't exit normally on its own. 
     */
    override fun stopTimeout(stopTimeout: Duration) {
      cdkBuilder.stopTimeout(stopTimeout.let(Duration::unwrap))
    }

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     * @param systemControls A list of namespaced kernel parameters to set in the container. 
     */
    override fun systemControls(systemControls: List<SystemControl>) {
      cdkBuilder.systemControls(systemControls.map(SystemControl::unwrap))
    }

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     * @param systemControls A list of namespaced kernel parameters to set in the container. 
     */
    override fun systemControls(vararg systemControls: SystemControl): Unit =
        systemControls(systemControls.toList())

    /**
     * The name of the task definition that includes this container definition.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param taskDefinition The name of the task definition that includes this container
     * definition. 
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container. 
     */
    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit::unwrap))
    }

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container. 
     */
    override fun ulimits(vararg ulimits: Ulimit): Unit = ulimits(ulimits.toList())

    /**
     * The user to use inside the container.
     *
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     *
     * Default: root
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-user)
     * @param user The user to use inside the container. 
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * The working directory in which to run commands inside the container.
     *
     * Default: /
     *
     * @param workingDirectory The working directory in which to run commands inside the container. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CONTAINER_PORT_USE_RANGE: Number =
        software.amazon.awscdk.services.ecs.ContainerDefinition.CONTAINER_PORT_USE_RANGE

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ContainerDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ContainerDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinition):
        ContainerDefinition = ContainerDefinition(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinition):
        software.amazon.awscdk.services.ecs.ContainerDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.ContainerDefinition
  }
}
