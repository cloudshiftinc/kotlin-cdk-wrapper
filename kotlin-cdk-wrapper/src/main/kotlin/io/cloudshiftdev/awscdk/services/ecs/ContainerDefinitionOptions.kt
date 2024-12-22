@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
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
public interface ContainerDefinitionOptions {
  /**
   * The command that is passed to the container.
   *
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   *
   * Default: - CMD value built into container image.
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The name of the container.
   *
   * Default: - id of node associated with ContainerDefinition.
   */
  public fun containerName(): String? = unwrap(this).getContainerName()

  /**
   * The minimum number of CPU units to reserve for the container.
   *
   * Default: - No minimum CPU units reserved.
   */
  public fun cpu(): Number? = unwrap(this).getCpu()

  /**
   * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
   * container for Active Directory authentication.
   *
   * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
   *
   * Currently, only one credential spec is allowed per container definition.
   *
   * Default: - No credential specs.
   */
  public fun credentialSpecs(): List<CredentialSpec> =
      unwrap(this).getCredentialSpecs()?.map(CredentialSpec::wrap) ?: emptyList()

  /**
   * Specifies whether networking is disabled within the container.
   *
   * When this parameter is true, networking is disabled within the container.
   *
   * Default: false
   */
  public fun disableNetworking(): Boolean? = unwrap(this).getDisableNetworking()

  /**
   * A list of DNS search domains that are presented to the container.
   *
   * Default: - No search domains.
   */
  public fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?: emptyList()

  /**
   * A list of DNS servers that are presented to the container.
   *
   * Default: - Default DNS servers.
   */
  public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  /**
   * A key/value map of labels to add to the container.
   *
   * Default: - No labels.
   */
  public fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

  /**
   * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
   * systems.
   *
   * Default: - No security labels.
   */
  public fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions() ?:
      emptyList()

  /**
   * Enable a restart policy for a container.
   *
   * When you set up a restart policy, Amazon ECS can restart the container without needing to
   * replace the task.
   *
   * Default: - false unless `restartIgnoredExitCodes` or `restartAttemptPeriod` is set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-restart-policy.html)
   */
  public fun enableRestartPolicy(): Boolean? = unwrap(this).getEnableRestartPolicy()

  /**
   * The ENTRYPOINT value to pass to the container.
   *
   * Default: - Entry point configured in container.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
   */
  public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

  /**
   * The environment variables to pass to the container.
   *
   * Default: - No environment variables.
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The environment files to pass to the container.
   *
   * Default: - No environment files.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
   */
  public fun environmentFiles(): List<EnvironmentFile> =
      unwrap(this).getEnvironmentFiles()?.map(EnvironmentFile::wrap) ?: emptyList()

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
   */
  public fun essential(): Boolean? = unwrap(this).getEssential()

  /**
   * A list of hostnames and IP address mappings to append to the /etc/hosts file on the container.
   *
   * Default: - No extra hosts.
   */
  public fun extraHosts(): Map<String, String> = unwrap(this).getExtraHosts() ?: emptyMap()

  /**
   * The number of GPUs assigned to the container.
   *
   * Default: - No GPUs assigned.
   */
  public fun gpuCount(): Number? = unwrap(this).getGpuCount()

  /**
   * The health check command and associated configuration parameters for the container.
   *
   * Default: - Health check configuration from container.
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * The hostname to use for your container.
   *
   * Default: - Automatic hostname.
   */
  public fun hostname(): String? = unwrap(this).getHostname()

  /**
   * The image used to start a container.
   *
   * This string is passed directly to the Docker daemon.
   * Images in the Docker Hub registry are available by default.
   * Other repositories are specified with either repository-url/image:tag or
   * repository-url/image&#64;digest.
   * TODO: Update these to specify using classes of IContainerImage
   */
  public fun image(): ContainerImage

  /**
   * The inference accelerators referenced by the container.
   *
   * Default: - No inference accelerators assigned.
   */
  public fun inferenceAcceleratorResources(): List<String> =
      unwrap(this).getInferenceAcceleratorResources() ?: emptyList()

  /**
   * When this parameter is true, you can deploy containerized applications that require stdin or a
   * tty to be allocated.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
   */
  public fun interactive(): Boolean? = unwrap(this).getInteractive()

  /**
   * Linux-specific modifications that are applied to the container, such as Linux kernel
   * capabilities.
   *
   * For more information see
   * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
   *
   * Default: - No Linux parameters.
   */
  public fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  /**
   * The log configuration specification for the container.
   *
   * Default: - Containers use the same logging driver that the Docker daemon uses.
   */
  public fun logging(): LogDriver? = unwrap(this).getLogging()?.let(LogDriver::wrap)

  /**
   * The amount (in MiB) of memory to present to the container.
   *
   * If your container attempts to exceed the allocated memory, the container
   * is terminated.
   *
   * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
   *
   * Default: - No memory limit.
   */
  public fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

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
   */
  public fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

  /**
   * The port mappings to add to the container definition.
   *
   * Default: - No ports are mapped.
   */
  public fun portMappings(): List<PortMapping> =
      unwrap(this).getPortMappings()?.map(PortMapping::wrap) ?: emptyList()

  /**
   * Specifies whether the container is marked as privileged.
   *
   * When this parameter is true, the container is given elevated privileges on the host container
   * instance (similar to the root user).
   *
   * Default: false
   */
  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * When this parameter is true, a TTY is allocated.
   *
   * This parameter maps to Tty in the "Create a container section" of the
   * Docker Remote API and the --tty option to `docker run`.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_pseudoterminal)
   */
  public fun pseudoTerminal(): Boolean? = unwrap(this).getPseudoTerminal()

  /**
   * When this parameter is true, the container is given read-only access to its root file system.
   *
   * Default: false
   */
  public fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

  /**
   * A period of time that the container must run for before a restart can be attempted.
   *
   * A container can be restarted only once every `restartAttemptPeriod` seconds.
   * If a container isn't able to run for this time period and exits early, it will not be
   * restarted.
   *
   * This property can't be used if `enableRestartPolicy` is set to false.
   *
   * You can set a minimum `restartAttemptPeriod` of 60 seconds and a maximum `restartAttemptPeriod`
   * of 1800 seconds.
   *
   * Default: - Duration.seconds(300) if `enableRestartPolicy` is true, otherwise no period.
   */
  public fun restartAttemptPeriod(): Duration? =
      unwrap(this).getRestartAttemptPeriod()?.let(Duration::wrap)

  /**
   * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
   *
   * This property can't be used if `enableRestartPolicy` is set to false.
   *
   * You can specify a maximum of 50 container exit codes.
   *
   * Default: - No exit codes are ignored.
   */
  public fun restartIgnoredExitCodes(): List<Number> = unwrap(this).getRestartIgnoredExitCodes() ?:
      emptyList()

  /**
   * The secret environment variables to pass to the container.
   *
   * Default: - No secret environment variables.
   */
  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * Time duration (in seconds) to wait before giving up on resolving dependencies for a container.
   *
   * Default: - none
   */
  public fun startTimeout(): Duration? = unwrap(this).getStartTimeout()?.let(Duration::wrap)

  /**
   * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't exit
   * normally on its own.
   *
   * Default: - none
   */
  public fun stopTimeout(): Duration? = unwrap(this).getStopTimeout()?.let(Duration::wrap)

  /**
   * A list of namespaced kernel parameters to set in the container.
   *
   * Default: - No system controls are set.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
   */
  public fun systemControls(): List<SystemControl> =
      unwrap(this).getSystemControls()?.map(SystemControl::wrap) ?: emptyList()

  /**
   * An array of ulimits to set in the container.
   */
  public fun ulimits(): List<Ulimit> = unwrap(this).getUlimits()?.map(Ulimit::wrap) ?: emptyList()

  /**
   * The user to use inside the container.
   *
   * This parameter maps to User in the Create a container section of the Docker Remote API and
   * the --user option to docker run.
   *
   * Default: root
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-user)
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * The working directory in which to run commands inside the container.
   *
   * Default: /
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [ContainerDefinitionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String)

    /**
     * @param containerName The name of the container.
     */
    public fun containerName(containerName: String)

    /**
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    public fun cpu(cpu: Number)

    /**
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication.
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     */
    public fun credentialSpecs(credentialSpecs: List<CredentialSpec>)

    /**
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication.
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     */
    public fun credentialSpecs(vararg credentialSpecs: CredentialSpec)

    /**
     * @param disableNetworking Specifies whether networking is disabled within the container.
     * When this parameter is true, networking is disabled within the container.
     */
    public fun disableNetworking(disableNetworking: Boolean)

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    public fun dnsSearchDomains(dnsSearchDomains: List<String>)

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    public fun dnsSearchDomains(vararg dnsSearchDomains: String)

    /**
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * @param dockerLabels A key/value map of labels to add to the container.
     */
    public fun dockerLabels(dockerLabels: Map<String, String>)

    /**
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems.
     */
    public fun dockerSecurityOptions(dockerSecurityOptions: List<String>)

    /**
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems.
     */
    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String)

    /**
     * @param enableRestartPolicy Enable a restart policy for a container.
     * When you set up a restart policy, Amazon ECS can restart the container without needing to
     * replace the task.
     */
    public fun enableRestartPolicy(enableRestartPolicy: Boolean)

    /**
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    public fun entryPoint(entryPoint: List<String>)

    /**
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    public fun entryPoint(vararg entryPoint: String)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param environmentFiles The environment files to pass to the container.
     */
    public fun environmentFiles(environmentFiles: List<EnvironmentFile>)

    /**
     * @param environmentFiles The environment files to pass to the container.
     */
    public fun environmentFiles(vararg environmentFiles: EnvironmentFile)

    /**
     * @param essential Specifies whether the container is marked essential.
     * If the essential parameter of a container is marked as true, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped.
     * If the essential parameter of a container is marked as false, then its failure does not
     * affect the rest of the containers in a task. All tasks must have at least one essential
     * container.
     *
     * If this parameter is omitted, a container is assumed to be essential.
     */
    public fun essential(essential: Boolean)

    /**
     * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts
     * file on the container.
     */
    public fun extraHosts(extraHosts: Map<String, String>)

    /**
     * @param gpuCount The number of GPUs assigned to the container.
     */
    public fun gpuCount(gpuCount: Number)

    /**
     * @param healthCheck The health check command and associated configuration parameters for the
     * container.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param healthCheck The health check command and associated configuration parameters for the
     * container.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c2eddcaf6154676e242d8ba80f31f3ba21462375ef1f65663ebe4d99d7077ff")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param hostname The hostname to use for your container.
     */
    public fun hostname(hostname: String)

    /**
     * @param image The image used to start a container. 
     * This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default.
     * Other repositories are specified with either repository-url/image:tag or
     * repository-url/image&#64;digest.
     * TODO: Update these to specify using classes of IContainerImage
     */
    public fun image(image: ContainerImage)

    /**
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>)

    /**
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String)

    /**
     * @param interactive When this parameter is true, you can deploy containerized applications
     * that require stdin or a tty to be allocated.
     */
    public fun interactive(interactive: Boolean)

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as Linux kernel capabilities.
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     */
    public fun linuxParameters(linuxParameters: LinuxParameters)

    /**
     * @param logging The log configuration specification for the container.
     */
    public fun logging(logging: LogDriver)

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryLimitMiB(memoryLimitMiB: Number)

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    public fun memoryReservationMiB(memoryReservationMiB: Number)

    /**
     * @param portMappings The port mappings to add to the container definition.
     */
    public fun portMappings(portMappings: List<PortMapping>)

    /**
     * @param portMappings The port mappings to add to the container definition.
     */
    public fun portMappings(vararg portMappings: PortMapping)

    /**
     * @param privileged Specifies whether the container is marked as privileged.
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     */
    public fun privileged(privileged: Boolean)

    /**
     * @param pseudoTerminal When this parameter is true, a TTY is allocated.
     * This parameter maps to Tty in the "Create a container section" of the
     * Docker Remote API and the --tty option to `docker run`.
     */
    public fun pseudoTerminal(pseudoTerminal: Boolean)

    /**
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     * access to its root file system.
     */
    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    /**
     * @param restartAttemptPeriod A period of time that the container must run for before a restart
     * can be attempted.
     * A container can be restarted only once every `restartAttemptPeriod` seconds.
     * If a container isn't able to run for this time period and exits early, it will not be
     * restarted.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can set a minimum `restartAttemptPeriod` of 60 seconds and a maximum
     * `restartAttemptPeriod`
     * of 1800 seconds.
     */
    public fun restartAttemptPeriod(restartAttemptPeriod: Duration)

    /**
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on.
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     */
    public fun restartIgnoredExitCodes(restartIgnoredExitCodes: List<Number>)

    /**
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on.
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     */
    public fun restartIgnoredExitCodes(vararg restartIgnoredExitCodes: Number)

    /**
     * @param secrets The secret environment variables to pass to the container.
     */
    public fun secrets(secrets: Map<String, Secret>)

    /**
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     * dependencies for a container.
     */
    public fun startTimeout(startTimeout: Duration)

    /**
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     * killed if it doesn't exit normally on its own.
     */
    public fun stopTimeout(stopTimeout: Duration)

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    public fun systemControls(systemControls: List<SystemControl>)

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    public fun systemControls(vararg systemControls: SystemControl)

    /**
     * @param ulimits An array of ulimits to set in the container.
     */
    public fun ulimits(ulimits: List<Ulimit>)

    /**
     * @param ulimits An array of ulimits to set in the container.
     */
    public fun ulimits(vararg ulimits: Ulimit)

    /**
     * @param user The user to use inside the container.
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     */
    public fun user(user: String)

    /**
     * @param workingDirectory The working directory in which to run commands inside the container.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.Builder =
        software.amazon.awscdk.services.ecs.ContainerDefinitionOptions.builder()

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param containerName The name of the container.
     */
    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    /**
     * @param cpu The minimum number of CPU units to reserve for the container.
     */
    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    /**
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication.
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     */
    override fun credentialSpecs(credentialSpecs: List<CredentialSpec>) {
      cdkBuilder.credentialSpecs(credentialSpecs.map(CredentialSpec.Companion::unwrap))
    }

    /**
     * @param credentialSpecs A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`)
     * file that configures the container for Active Directory authentication.
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     */
    override fun credentialSpecs(vararg credentialSpecs: CredentialSpec): Unit =
        credentialSpecs(credentialSpecs.toList())

    /**
     * @param disableNetworking Specifies whether networking is disabled within the container.
     * When this parameter is true, networking is disabled within the container.
     */
    override fun disableNetworking(disableNetworking: Boolean) {
      cdkBuilder.disableNetworking(disableNetworking)
    }

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
      cdkBuilder.dnsSearchDomains(dnsSearchDomains)
    }

    /**
     * @param dnsSearchDomains A list of DNS search domains that are presented to the container.
     */
    override fun dnsSearchDomains(vararg dnsSearchDomains: String): Unit =
        dnsSearchDomains(dnsSearchDomains.toList())

    /**
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * @param dnsServers A list of DNS servers that are presented to the container.
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * @param dockerLabels A key/value map of labels to add to the container.
     */
    override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    /**
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems.
     */
    override fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
      cdkBuilder.dockerSecurityOptions(dockerSecurityOptions)
    }

    /**
     * @param dockerSecurityOptions A list of strings to provide custom labels for SELinux and
     * AppArmor multi-level security systems.
     */
    override fun dockerSecurityOptions(vararg dockerSecurityOptions: String): Unit =
        dockerSecurityOptions(dockerSecurityOptions.toList())

    /**
     * @param enableRestartPolicy Enable a restart policy for a container.
     * When you set up a restart policy, Amazon ECS can restart the container without needing to
     * replace the task.
     */
    override fun enableRestartPolicy(enableRestartPolicy: Boolean) {
      cdkBuilder.enableRestartPolicy(enableRestartPolicy)
    }

    /**
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    override fun entryPoint(entryPoint: List<String>) {
      cdkBuilder.entryPoint(entryPoint)
    }

    /**
     * @param entryPoint The ENTRYPOINT value to pass to the container.
     */
    override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param environmentFiles The environment files to pass to the container.
     */
    override fun environmentFiles(environmentFiles: List<EnvironmentFile>) {
      cdkBuilder.environmentFiles(environmentFiles.map(EnvironmentFile.Companion::unwrap))
    }

    /**
     * @param environmentFiles The environment files to pass to the container.
     */
    override fun environmentFiles(vararg environmentFiles: EnvironmentFile): Unit =
        environmentFiles(environmentFiles.toList())

    /**
     * @param essential Specifies whether the container is marked essential.
     * If the essential parameter of a container is marked as true, and that container fails
     * or stops for any reason, all other containers that are part of the task are stopped.
     * If the essential parameter of a container is marked as false, then its failure does not
     * affect the rest of the containers in a task. All tasks must have at least one essential
     * container.
     *
     * If this parameter is omitted, a container is assumed to be essential.
     */
    override fun essential(essential: Boolean) {
      cdkBuilder.essential(essential)
    }

    /**
     * @param extraHosts A list of hostnames and IP address mappings to append to the /etc/hosts
     * file on the container.
     */
    override fun extraHosts(extraHosts: Map<String, String>) {
      cdkBuilder.extraHosts(extraHosts)
    }

    /**
     * @param gpuCount The number of GPUs assigned to the container.
     */
    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    /**
     * @param healthCheck The health check command and associated configuration parameters for the
     * container.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
    }

    /**
     * @param healthCheck The health check command and associated configuration parameters for the
     * container.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c2eddcaf6154676e242d8ba80f31f3ba21462375ef1f65663ebe4d99d7077ff")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param hostname The hostname to use for your container.
     */
    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    /**
     * @param image The image used to start a container. 
     * This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default.
     * Other repositories are specified with either repository-url/image:tag or
     * repository-url/image&#64;digest.
     * TODO: Update these to specify using classes of IContainerImage
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage.Companion::unwrap))
    }

    /**
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    override fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>) {
      cdkBuilder.inferenceAcceleratorResources(inferenceAcceleratorResources)
    }

    /**
     * @param inferenceAcceleratorResources The inference accelerators referenced by the container.
     */
    override fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String): Unit =
        inferenceAcceleratorResources(inferenceAcceleratorResources.toList())

    /**
     * @param interactive When this parameter is true, you can deploy containerized applications
     * that require stdin or a tty to be allocated.
     */
    override fun interactive(interactive: Boolean) {
      cdkBuilder.interactive(interactive)
    }

    /**
     * @param linuxParameters Linux-specific modifications that are applied to the container, such
     * as Linux kernel capabilities.
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     */
    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters.Companion::unwrap))
    }

    /**
     * @param logging The log configuration specification for the container.
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver.Companion::unwrap))
    }

    /**
     * @param memoryLimitMiB The amount (in MiB) of memory to present to the container.
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    /**
     * @param memoryReservationMiB The soft limit (in MiB) of memory to reserve for the container.
     * When system memory is under heavy contention, Docker attempts to keep the
     * container memory to this soft limit. However, your container can consume more
     * memory when it needs to, up to either the hard limit specified with the memory
     * parameter (if applicable), or all of the available memory on the container
     * instance, whichever comes first.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     */
    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    /**
     * @param portMappings The port mappings to add to the container definition.
     */
    override fun portMappings(portMappings: List<PortMapping>) {
      cdkBuilder.portMappings(portMappings.map(PortMapping.Companion::unwrap))
    }

    /**
     * @param portMappings The port mappings to add to the container definition.
     */
    override fun portMappings(vararg portMappings: PortMapping): Unit =
        portMappings(portMappings.toList())

    /**
     * @param privileged Specifies whether the container is marked as privileged.
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     */
    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    /**
     * @param pseudoTerminal When this parameter is true, a TTY is allocated.
     * This parameter maps to Tty in the "Create a container section" of the
     * Docker Remote API and the --tty option to `docker run`.
     */
    override fun pseudoTerminal(pseudoTerminal: Boolean) {
      cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    /**
     * @param readonlyRootFilesystem When this parameter is true, the container is given read-only
     * access to its root file system.
     */
    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    /**
     * @param restartAttemptPeriod A period of time that the container must run for before a restart
     * can be attempted.
     * A container can be restarted only once every `restartAttemptPeriod` seconds.
     * If a container isn't able to run for this time period and exits early, it will not be
     * restarted.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can set a minimum `restartAttemptPeriod` of 60 seconds and a maximum
     * `restartAttemptPeriod`
     * of 1800 seconds.
     */
    override fun restartAttemptPeriod(restartAttemptPeriod: Duration) {
      cdkBuilder.restartAttemptPeriod(restartAttemptPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on.
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     */
    override fun restartIgnoredExitCodes(restartIgnoredExitCodes: List<Number>) {
      cdkBuilder.restartIgnoredExitCodes(restartIgnoredExitCodes)
    }

    /**
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on.
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     */
    override fun restartIgnoredExitCodes(vararg restartIgnoredExitCodes: Number): Unit =
        restartIgnoredExitCodes(restartIgnoredExitCodes.toList())

    /**
     * @param secrets The secret environment variables to pass to the container.
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * @param startTimeout Time duration (in seconds) to wait before giving up on resolving
     * dependencies for a container.
     */
    override fun startTimeout(startTimeout: Duration) {
      cdkBuilder.startTimeout(startTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param stopTimeout Time duration (in seconds) to wait before the container is forcefully
     * killed if it doesn't exit normally on its own.
     */
    override fun stopTimeout(stopTimeout: Duration) {
      cdkBuilder.stopTimeout(stopTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    override fun systemControls(systemControls: List<SystemControl>) {
      cdkBuilder.systemControls(systemControls.map(SystemControl.Companion::unwrap))
    }

    /**
     * @param systemControls A list of namespaced kernel parameters to set in the container.
     */
    override fun systemControls(vararg systemControls: SystemControl): Unit =
        systemControls(systemControls.toList())

    /**
     * @param ulimits An array of ulimits to set in the container.
     */
    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit.Companion::unwrap))
    }

    /**
     * @param ulimits An array of ulimits to set in the container.
     */
    override fun ulimits(vararg ulimits: Ulimit): Unit = ulimits(ulimits.toList())

    /**
     * @param user The user to use inside the container.
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * @param workingDirectory The working directory in which to run commands inside the container.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDefinitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinitionOptions,
  ) : CdkObject(cdkObject),
      ContainerDefinitionOptions {
    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The name of the container.
     *
     * Default: - id of node associated with ContainerDefinition.
     */
    override fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The minimum number of CPU units to reserve for the container.
     *
     * Default: - No minimum CPU units reserved.
     */
    override fun cpu(): Number? = unwrap(this).getCpu()

    /**
     * A list of ARNs in SSM or Amazon S3 to a credential spec (`CredSpec`) file that configures the
     * container for Active Directory authentication.
     *
     * We recommend that you use this parameter instead of the `dockerSecurityOptions`.
     *
     * Currently, only one credential spec is allowed per container definition.
     *
     * Default: - No credential specs.
     */
    override fun credentialSpecs(): List<CredentialSpec> =
        unwrap(this).getCredentialSpecs()?.map(CredentialSpec::wrap) ?: emptyList()

    /**
     * Specifies whether networking is disabled within the container.
     *
     * When this parameter is true, networking is disabled within the container.
     *
     * Default: false
     */
    override fun disableNetworking(): Boolean? = unwrap(this).getDisableNetworking()

    /**
     * A list of DNS search domains that are presented to the container.
     *
     * Default: - No search domains.
     */
    override fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?:
        emptyList()

    /**
     * A list of DNS servers that are presented to the container.
     *
     * Default: - Default DNS servers.
     */
    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    /**
     * A key/value map of labels to add to the container.
     *
     * Default: - No labels.
     */
    override fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

    /**
     * A list of strings to provide custom labels for SELinux and AppArmor multi-level security
     * systems.
     *
     * Default: - No security labels.
     */
    override fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions() ?:
        emptyList()

    /**
     * Enable a restart policy for a container.
     *
     * When you set up a restart policy, Amazon ECS can restart the container without needing to
     * replace the task.
     *
     * Default: - false unless `restartIgnoredExitCodes` or `restartAttemptPeriod` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-restart-policy.html)
     */
    override fun enableRestartPolicy(): Boolean? = unwrap(this).getEnableRestartPolicy()

    /**
     * The ENTRYPOINT value to pass to the container.
     *
     * Default: - Entry point configured in container.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     */
    override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    /**
     * The environment variables to pass to the container.
     *
     * Default: - No environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The environment files to pass to the container.
     *
     * Default: - No environment files.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
     */
    override fun environmentFiles(): List<EnvironmentFile> =
        unwrap(this).getEnvironmentFiles()?.map(EnvironmentFile::wrap) ?: emptyList()

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
     */
    override fun essential(): Boolean? = unwrap(this).getEssential()

    /**
     * A list of hostnames and IP address mappings to append to the /etc/hosts file on the
     * container.
     *
     * Default: - No extra hosts.
     */
    override fun extraHosts(): Map<String, String> = unwrap(this).getExtraHosts() ?: emptyMap()

    /**
     * The number of GPUs assigned to the container.
     *
     * Default: - No GPUs assigned.
     */
    override fun gpuCount(): Number? = unwrap(this).getGpuCount()

    /**
     * The health check command and associated configuration parameters for the container.
     *
     * Default: - Health check configuration from container.
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * The hostname to use for your container.
     *
     * Default: - Automatic hostname.
     */
    override fun hostname(): String? = unwrap(this).getHostname()

    /**
     * The image used to start a container.
     *
     * This string is passed directly to the Docker daemon.
     * Images in the Docker Hub registry are available by default.
     * Other repositories are specified with either repository-url/image:tag or
     * repository-url/image&#64;digest.
     * TODO: Update these to specify using classes of IContainerImage
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The inference accelerators referenced by the container.
     *
     * Default: - No inference accelerators assigned.
     */
    override fun inferenceAcceleratorResources(): List<String> =
        unwrap(this).getInferenceAcceleratorResources() ?: emptyList()

    /**
     * When this parameter is true, you can deploy containerized applications that require stdin or
     * a tty to be allocated.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html#cfn-ecs-taskdefinition-containerdefinition-interactive)
     */
    override fun interactive(): Boolean? = unwrap(this).getInteractive()

    /**
     * Linux-specific modifications that are applied to the container, such as Linux kernel
     * capabilities.
     *
     * For more information see
     * [KernelCapabilities](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_KernelCapabilities.html).
     *
     * Default: - No Linux parameters.
     */
    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    /**
     * The log configuration specification for the container.
     *
     * Default: - Containers use the same logging driver that the Docker daemon uses.
     */
    override fun logging(): LogDriver? = unwrap(this).getLogging()?.let(LogDriver::wrap)

    /**
     * The amount (in MiB) of memory to present to the container.
     *
     * If your container attempts to exceed the allocated memory, the container
     * is terminated.
     *
     * At least one of memoryLimitMiB and memoryReservationMiB is required for non-Fargate services.
     *
     * Default: - No memory limit.
     */
    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

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
     */
    override fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

    /**
     * The port mappings to add to the container definition.
     *
     * Default: - No ports are mapped.
     */
    override fun portMappings(): List<PortMapping> =
        unwrap(this).getPortMappings()?.map(PortMapping::wrap) ?: emptyList()

    /**
     * Specifies whether the container is marked as privileged.
     *
     * When this parameter is true, the container is given elevated privileges on the host container
     * instance (similar to the root user).
     *
     * Default: false
     */
    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    /**
     * When this parameter is true, a TTY is allocated.
     *
     * This parameter maps to Tty in the "Create a container section" of the
     * Docker Remote API and the --tty option to `docker run`.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_pseudoterminal)
     */
    override fun pseudoTerminal(): Boolean? = unwrap(this).getPseudoTerminal()

    /**
     * When this parameter is true, the container is given read-only access to its root file system.
     *
     * Default: false
     */
    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    /**
     * A period of time that the container must run for before a restart can be attempted.
     *
     * A container can be restarted only once every `restartAttemptPeriod` seconds.
     * If a container isn't able to run for this time period and exits early, it will not be
     * restarted.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can set a minimum `restartAttemptPeriod` of 60 seconds and a maximum
     * `restartAttemptPeriod`
     * of 1800 seconds.
     *
     * Default: - Duration.seconds(300) if `enableRestartPolicy` is true, otherwise no period.
     */
    override fun restartAttemptPeriod(): Duration? =
        unwrap(this).getRestartAttemptPeriod()?.let(Duration::wrap)

    /**
     * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     *
     * Default: - No exit codes are ignored.
     */
    override fun restartIgnoredExitCodes(): List<Number> = unwrap(this).getRestartIgnoredExitCodes()
        ?: emptyList()

    /**
     * The secret environment variables to pass to the container.
     *
     * Default: - No secret environment variables.
     */
    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    /**
     * Time duration (in seconds) to wait before giving up on resolving dependencies for a
     * container.
     *
     * Default: - none
     */
    override fun startTimeout(): Duration? = unwrap(this).getStartTimeout()?.let(Duration::wrap)

    /**
     * Time duration (in seconds) to wait before the container is forcefully killed if it doesn't
     * exit normally on its own.
     *
     * Default: - none
     */
    override fun stopTimeout(): Duration? = unwrap(this).getStopTimeout()?.let(Duration::wrap)

    /**
     * A list of namespaced kernel parameters to set in the container.
     *
     * Default: - No system controls are set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_systemcontrols)
     */
    override fun systemControls(): List<SystemControl> =
        unwrap(this).getSystemControls()?.map(SystemControl::wrap) ?: emptyList()

    /**
     * An array of ulimits to set in the container.
     */
    override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits()?.map(Ulimit::wrap) ?:
        emptyList()

    /**
     * The user to use inside the container.
     *
     * This parameter maps to User in the Create a container section of the Docker Remote API and
     * the --user option to docker run.
     *
     * Default: root
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-user)
     */
    override fun user(): String? = unwrap(this).getUser()

    /**
     * The working directory in which to run commands inside the container.
     *
     * Default: /
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinitionOptions):
        ContainerDefinitionOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ContainerDefinitionOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinitionOptions):
        software.amazon.awscdk.services.ecs.ContainerDefinitionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ContainerDefinitionOptions
  }
}
