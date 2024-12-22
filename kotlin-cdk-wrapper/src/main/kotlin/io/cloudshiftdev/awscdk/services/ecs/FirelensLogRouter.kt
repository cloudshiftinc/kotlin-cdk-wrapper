@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
 * Firelens log router.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * AppProtocol appProtocol;
 * ContainerImage containerImage;
 * CredentialSpec credentialSpec;
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
 * .credentialSpecs(List.of(credentialSpec))
 * .disableNetworking(false)
 * .dnsSearchDomains(List.of("dnsSearchDomains"))
 * .dnsServers(List.of("dnsServers"))
 * .dockerLabels(Map.of(
 * "dockerLabelsKey", "dockerLabels"))
 * .dockerSecurityOptions(List.of("dockerSecurityOptions"))
 * .enableRestartPolicy(false)
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
 * .interactive(false)
 * .linuxParameters(linuxParameters)
 * .logging(logDriver)
 * .memoryLimitMiB(123)
 * .memoryReservationMiB(123)
 * .portMappings(List.of(PortMapping.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .appProtocol(appProtocol)
 * .containerPortRange("containerPortRange")
 * .hostPort(123)
 * .name("name")
 * .protocol(Protocol.TCP)
 * .build()))
 * .privileged(false)
 * .pseudoTerminal(false)
 * .readonlyRootFilesystem(false)
 * .restartAttemptPeriod(Duration.minutes(30))
 * .restartIgnoredExitCodes(List.of(123))
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
public open class FirelensLogRouter(
  cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouter,
) : ContainerDefinition(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FirelensLogRouterProps,
  ) :
      this(software.amazon.awscdk.services.ecs.FirelensLogRouter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FirelensLogRouterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FirelensLogRouterProps.Builder.() -> Unit,
  ) : this(scope, id, FirelensLogRouterProps(props)
  )

  /**
   * Firelens configuration.
   */
  public open fun firelensConfig(): FirelensConfig =
      unwrap(this).getFirelensConfig().let(FirelensConfig::wrap)

  /**
   * Render this container definition to a CloudFormation object.
   *
   * @param _taskDefinition
   */
  public override fun renderContainerDefinition(): CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition().let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  /**
   * Render this container definition to a CloudFormation object.
   *
   * @param _taskDefinition
   */
  public override fun renderContainerDefinition(taskDefinition: TaskDefinition):
      CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap)).let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.FirelensLogRouter].
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
     * Enable a restart policy for a container.
     *
     * When you set up a restart policy, Amazon ECS can restart the container without needing to
     * replace the task.
     *
     * Default: - false unless `restartIgnoredExitCodes` or `restartAttemptPeriod` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-restart-policy.html)
     * @param enableRestartPolicy Enable a restart policy for a container. 
     */
    public fun enableRestartPolicy(enableRestartPolicy: Boolean)

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
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration. 
     */
    public fun firelensConfig(firelensConfig: FirelensConfig)

    /**
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    public fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit)

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
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
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
     *
     * @param restartAttemptPeriod A period of time that the container must run for before a restart
     * can be attempted. 
     */
    public fun restartAttemptPeriod(restartAttemptPeriod: Duration)

    /**
     * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     *
     * Default: - No exit codes are ignored.
     *
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on. 
     */
    public fun restartIgnoredExitCodes(restartIgnoredExitCodes: List<Number>)

    /**
     * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     *
     * Default: - No exit codes are ignored.
     *
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on. 
     */
    public fun restartIgnoredExitCodes(vararg restartIgnoredExitCodes: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder =
        software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder.create(scope, id)

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
      cdkBuilder.credentialSpecs(credentialSpecs.map(CredentialSpec.Companion::unwrap))
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
     * Enable a restart policy for a container.
     *
     * When you set up a restart policy, Amazon ECS can restart the container without needing to
     * replace the task.
     *
     * Default: - false unless `restartIgnoredExitCodes` or `restartAttemptPeriod` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-restart-policy.html)
     * @param enableRestartPolicy Enable a restart policy for a container. 
     */
    override fun enableRestartPolicy(enableRestartPolicy: Boolean) {
      cdkBuilder.enableRestartPolicy(enableRestartPolicy)
    }

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
      cdkBuilder.environmentFiles(environmentFiles.map(EnvironmentFile.Companion::unwrap))
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
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration. 
     */
    override fun firelensConfig(firelensConfig: FirelensConfig) {
      cdkBuilder.firelensConfig(firelensConfig.let(FirelensConfig.Companion::unwrap))
    }

    /**
     * Firelens configuration.
     *
     * @param firelensConfig Firelens configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    override fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit): Unit =
        firelensConfig(FirelensConfig(firelensConfig))

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
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
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
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
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
      cdkBuilder.image(image.let(ContainerImage.Companion::unwrap))
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
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters.Companion::unwrap))
    }

    /**
     * The log configuration specification for the container.
     *
     * Default: - Containers use the same logging driver that the Docker daemon uses.
     *
     * @param logging The log configuration specification for the container. 
     */
    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver.Companion::unwrap))
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
      cdkBuilder.portMappings(portMappings.map(PortMapping.Companion::unwrap))
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
     *
     * @param restartAttemptPeriod A period of time that the container must run for before a restart
     * can be attempted. 
     */
    override fun restartAttemptPeriod(restartAttemptPeriod: Duration) {
      cdkBuilder.restartAttemptPeriod(restartAttemptPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     *
     * Default: - No exit codes are ignored.
     *
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on. 
     */
    override fun restartIgnoredExitCodes(restartIgnoredExitCodes: List<Number>) {
      cdkBuilder.restartIgnoredExitCodes(restartIgnoredExitCodes)
    }

    /**
     * A list of exit codes that Amazon ECS will ignore and not attempt a restart on.
     *
     * This property can't be used if `enableRestartPolicy` is set to false.
     *
     * You can specify a maximum of 50 container exit codes.
     *
     * Default: - No exit codes are ignored.
     *
     * @param restartIgnoredExitCodes A list of exit codes that Amazon ECS will ignore and not
     * attempt a restart on. 
     */
    override fun restartIgnoredExitCodes(vararg restartIgnoredExitCodes: Number): Unit =
        restartIgnoredExitCodes(restartIgnoredExitCodes.toList())

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
      cdkBuilder.startTimeout(startTimeout.let(Duration.Companion::unwrap))
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
      cdkBuilder.stopTimeout(stopTimeout.let(Duration.Companion::unwrap))
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
      cdkBuilder.systemControls(systemControls.map(SystemControl.Companion::unwrap))
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
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    /**
     * An array of ulimits to set in the container.
     *
     * @param ulimits An array of ulimits to set in the container. 
     */
    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit.Companion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ecs.FirelensLogRouter = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FirelensLogRouter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FirelensLogRouter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouter):
        FirelensLogRouter = FirelensLogRouter(cdkObject)

    internal fun unwrap(wrapped: FirelensLogRouter):
        software.amazon.awscdk.services.ecs.FirelensLogRouter = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.FirelensLogRouter
  }
}
