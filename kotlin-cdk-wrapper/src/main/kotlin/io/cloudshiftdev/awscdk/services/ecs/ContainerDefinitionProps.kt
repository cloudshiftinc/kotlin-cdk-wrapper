@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ContainerDefinitionProps : ContainerDefinitionOptions {
  public fun taskDefinition(): TaskDefinition

  @CdkDslMarker
  public interface Builder {
    public fun command(command: List<String>)

    public fun command(vararg command: String)

    public fun containerName(containerName: String)

    public fun cpu(cpu: Number)

    public fun credentialSpecs(credentialSpecs: List<CredentialSpec>)

    public fun credentialSpecs(vararg credentialSpecs: CredentialSpec)

    public fun disableNetworking(disableNetworking: Boolean)

    public fun dnsSearchDomains(dnsSearchDomains: List<String>)

    public fun dnsSearchDomains(vararg dnsSearchDomains: String)

    public fun dnsServers(dnsServers: List<String>)

    public fun dnsServers(vararg dnsServers: String)

    public fun dockerLabels(dockerLabels: Map<String, String>)

    public fun dockerSecurityOptions(dockerSecurityOptions: List<String>)

    public fun dockerSecurityOptions(vararg dockerSecurityOptions: String)

    public fun entryPoint(entryPoint: List<String>)

    public fun entryPoint(vararg entryPoint: String)

    public fun environment(environment: Map<String, String>)

    public fun environmentFiles(environmentFiles: List<EnvironmentFile>)

    public fun environmentFiles(vararg environmentFiles: EnvironmentFile)

    public fun essential(essential: Boolean)

    public fun extraHosts(extraHosts: Map<String, String>)

    public fun gpuCount(gpuCount: Number)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cd3958f57a0a4a05de7f77396f060ed2e57fe3b514666e875fc076e955d0d7")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    public fun hostname(hostname: String)

    public fun image(image: ContainerImage)

    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>)

    public fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String)

    public fun interactive(interactive: Boolean)

    public fun linuxParameters(linuxParameters: LinuxParameters)

    public fun logging(logging: LogDriver)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun memoryReservationMiB(memoryReservationMiB: Number)

    public fun portMappings(portMappings: List<PortMapping>)

    public fun portMappings(vararg portMappings: PortMapping)

    public fun privileged(privileged: Boolean)

    public fun pseudoTerminal(pseudoTerminal: Boolean)

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

    public fun secrets(secrets: Map<String, Secret>)

    public fun startTimeout(startTimeout: Duration)

    public fun stopTimeout(stopTimeout: Duration)

    public fun systemControls(systemControls: List<SystemControl>)

    public fun systemControls(vararg systemControls: SystemControl)

    public fun taskDefinition(taskDefinition: TaskDefinition)

    public fun ulimits(ulimits: List<Ulimit>)

    public fun ulimits(vararg ulimits: Ulimit)

    public fun user(user: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.ContainerDefinitionProps.builder()

    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    override fun command(vararg command: String): Unit = command(command.toList())

    override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun credentialSpecs(credentialSpecs: List<CredentialSpec>) {
      cdkBuilder.credentialSpecs(credentialSpecs.map(CredentialSpec::unwrap))
    }

    override fun credentialSpecs(vararg credentialSpecs: CredentialSpec): Unit =
        credentialSpecs(credentialSpecs.toList())

    override fun disableNetworking(disableNetworking: Boolean) {
      cdkBuilder.disableNetworking(disableNetworking)
    }

    override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
      cdkBuilder.dnsSearchDomains(dnsSearchDomains)
    }

    override fun dnsSearchDomains(vararg dnsSearchDomains: String): Unit =
        dnsSearchDomains(dnsSearchDomains.toList())

    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    override fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
      cdkBuilder.dockerSecurityOptions(dockerSecurityOptions)
    }

    override fun dockerSecurityOptions(vararg dockerSecurityOptions: String): Unit =
        dockerSecurityOptions(dockerSecurityOptions.toList())

    override fun entryPoint(entryPoint: List<String>) {
      cdkBuilder.entryPoint(entryPoint)
    }

    override fun entryPoint(vararg entryPoint: String): Unit = entryPoint(entryPoint.toList())

    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    override fun environmentFiles(environmentFiles: List<EnvironmentFile>) {
      cdkBuilder.environmentFiles(environmentFiles.map(EnvironmentFile::unwrap))
    }

    override fun environmentFiles(vararg environmentFiles: EnvironmentFile): Unit =
        environmentFiles(environmentFiles.toList())

    override fun essential(essential: Boolean) {
      cdkBuilder.essential(essential)
    }

    override fun extraHosts(extraHosts: Map<String, String>) {
      cdkBuilder.extraHosts(extraHosts)
    }

    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cd3958f57a0a4a05de7f77396f060ed2e57fe3b514666e875fc076e955d0d7")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    override fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>) {
      cdkBuilder.inferenceAcceleratorResources(inferenceAcceleratorResources)
    }

    override fun inferenceAcceleratorResources(vararg inferenceAcceleratorResources: String): Unit =
        inferenceAcceleratorResources(inferenceAcceleratorResources.toList())

    override fun interactive(interactive: Boolean) {
      cdkBuilder.interactive(interactive)
    }

    override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    override fun portMappings(portMappings: List<PortMapping>) {
      cdkBuilder.portMappings(portMappings.map(PortMapping::unwrap))
    }

    override fun portMappings(vararg portMappings: PortMapping): Unit =
        portMappings(portMappings.toList())

    override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    override fun pseudoTerminal(pseudoTerminal: Boolean) {
      cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    override fun startTimeout(startTimeout: Duration) {
      cdkBuilder.startTimeout(startTimeout.let(Duration::unwrap))
    }

    override fun stopTimeout(stopTimeout: Duration) {
      cdkBuilder.stopTimeout(stopTimeout.let(Duration::unwrap))
    }

    override fun systemControls(systemControls: List<SystemControl>) {
      cdkBuilder.systemControls(systemControls.map(SystemControl::unwrap))
    }

    override fun systemControls(vararg systemControls: SystemControl): Unit =
        systemControls(systemControls.toList())

    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit::unwrap))
    }

    override fun ulimits(vararg ulimits: Ulimit): Unit = ulimits(ulimits.toList())

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinitionProps,
  ) : CdkObject(cdkObject), ContainerDefinitionProps {
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    override fun containerName(): String? = unwrap(this).getContainerName()

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun credentialSpecs(): List<CredentialSpec> =
        unwrap(this).getCredentialSpecs()?.map(CredentialSpec::wrap) ?: emptyList()

    override fun disableNetworking(): Boolean? = unwrap(this).getDisableNetworking()

    override fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?:
        emptyList()

    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    override fun dockerLabels(): Map<String, String> = unwrap(this).getDockerLabels() ?: emptyMap()

    override fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions() ?:
        emptyList()

    override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    override fun environmentFiles(): List<EnvironmentFile> =
        unwrap(this).getEnvironmentFiles()?.map(EnvironmentFile::wrap) ?: emptyList()

    override fun essential(): Boolean? = unwrap(this).getEssential()

    override fun extraHosts(): Map<String, String> = unwrap(this).getExtraHosts() ?: emptyMap()

    override fun gpuCount(): Number? = unwrap(this).getGpuCount()

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun hostname(): String? = unwrap(this).getHostname()

    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    override fun inferenceAcceleratorResources(): List<String> =
        unwrap(this).getInferenceAcceleratorResources() ?: emptyList()

    override fun interactive(): Boolean? = unwrap(this).getInteractive()

    override fun linuxParameters(): LinuxParameters? =
        unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

    override fun logging(): LogDriver? = unwrap(this).getLogging()?.let(LogDriver::wrap)

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun memoryReservationMiB(): Number? = unwrap(this).getMemoryReservationMiB()

    override fun portMappings(): List<PortMapping> =
        unwrap(this).getPortMappings()?.map(PortMapping::wrap) ?: emptyList()

    override fun privileged(): Boolean? = unwrap(this).getPrivileged()

    override fun pseudoTerminal(): Boolean? = unwrap(this).getPseudoTerminal()

    override fun readonlyRootFilesystem(): Boolean? = unwrap(this).getReadonlyRootFilesystem()

    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

    override fun startTimeout(): Duration? = unwrap(this).getStartTimeout()?.let(Duration::wrap)

    override fun stopTimeout(): Duration? = unwrap(this).getStopTimeout()?.let(Duration::wrap)

    override fun systemControls(): List<SystemControl> =
        unwrap(this).getSystemControls()?.map(SystemControl::wrap) ?: emptyList()

    override fun taskDefinition(): TaskDefinition =
        unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

    override fun ulimits(): List<Ulimit> = unwrap(this).getUlimits()?.map(Ulimit::wrap) ?:
        emptyList()

    override fun user(): String? = unwrap(this).getUser()

    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinitionProps):
        ContainerDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDefinitionProps):
        software.amazon.awscdk.services.ecs.ContainerDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ContainerDefinitionProps
  }
}
