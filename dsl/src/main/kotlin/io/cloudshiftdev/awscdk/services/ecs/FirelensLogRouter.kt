package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FirelensLogRouter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouter,
) : ContainerDefinition(cdkObject) {
  public open fun firelensConfig(): FirelensConfig =
      unwrap(this).getFirelensConfig().let(FirelensConfig::wrap)

  public override fun renderContainerDefinition(): CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition().let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  public override fun renderContainerDefinition(_taskDefinition: TaskDefinition):
      CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition(_taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  public interface Builder {
    public fun command(command: List<String>) {
    }

    public fun containerName(containerName: String) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun credentialSpecs(credentialSpecs: List<CredentialSpec>) {
    }

    public fun disableNetworking(disableNetworking: Boolean) {
    }

    public fun dnsSearchDomains(dnsSearchDomains: List<String>) {
    }

    public fun dnsServers(dnsServers: List<String>) {
    }

    public fun dockerLabels(dockerLabels: Map<String, String>) {
    }

    public fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
    }

    public fun entryPoint(entryPoint: List<String>) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun environmentFiles(environmentFiles: List<EnvironmentFile>) {
    }

    public fun essential(essential: Boolean) {
    }

    public fun extraHosts(extraHosts: Map<String, String>) {
    }

    public fun firelensConfig(firelensConfig: FirelensConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    public fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit) {
    }

    public fun gpuCount(gpuCount: Number) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit) {
    }

    public fun hostname(hostname: String) {
    }

    public fun image(image: ContainerImage) {
    }

    public fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>) {
    }

    public fun interactive(interactive: Boolean) {
    }

    public fun linuxParameters(linuxParameters: LinuxParameters) {
    }

    public fun logging(logging: LogDriver) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun portMappings(portMappings: List<PortMapping>) {
    }

    public fun privileged(privileged: Boolean) {
    }

    public fun pseudoTerminal(pseudoTerminal: Boolean) {
    }

    public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
    }

    public fun secrets(secrets: Map<String, Secret>) {
    }

    public fun startTimeout(startTimeout: Duration) {
    }

    public fun stopTimeout(stopTimeout: Duration) {
    }

    public fun systemControls(systemControls: List<SystemControl>) {
    }

    public fun taskDefinition(taskDefinition: TaskDefinition) {
    }

    public fun ulimits(ulimits: List<Ulimit>) {
    }

    public fun user(user: String) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder =
        software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder.create(scope, id)

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun credentialSpecs(credentialSpecs: List<CredentialSpec>) {
      cdkBuilder.credentialSpecs(credentialSpecs.map(CredentialSpec::unwrap))
    }

    public override fun disableNetworking(disableNetworking: Boolean) {
      cdkBuilder.disableNetworking(disableNetworking)
    }

    public override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
      cdkBuilder.dnsSearchDomains(dnsSearchDomains)
    }

    public override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    public override fun dockerLabels(dockerLabels: Map<String, String>) {
      cdkBuilder.dockerLabels(dockerLabels)
    }

    public override fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
      cdkBuilder.dockerSecurityOptions(dockerSecurityOptions)
    }

    public override fun entryPoint(entryPoint: List<String>) {
      cdkBuilder.entryPoint(entryPoint)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun environmentFiles(environmentFiles: List<EnvironmentFile>) {
      cdkBuilder.environmentFiles(environmentFiles.map(EnvironmentFile::unwrap))
    }

    public override fun essential(essential: Boolean) {
      cdkBuilder.essential(essential)
    }

    public override fun extraHosts(extraHosts: Map<String, String>) {
      cdkBuilder.extraHosts(extraHosts)
    }

    public override fun firelensConfig(firelensConfig: FirelensConfig) {
      cdkBuilder.firelensConfig(firelensConfig.let(FirelensConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    public override fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit): Unit =
        firelensConfig(FirelensConfig(firelensConfig))

    public override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
    public override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    public override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    public override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    public override fun inferenceAcceleratorResources(inferenceAcceleratorResources: List<String>) {
      cdkBuilder.inferenceAcceleratorResources(inferenceAcceleratorResources)
    }

    public override fun interactive(interactive: Boolean) {
      cdkBuilder.interactive(interactive)
    }

    public override fun linuxParameters(linuxParameters: LinuxParameters) {
      cdkBuilder.linuxParameters(linuxParameters.let(LinuxParameters::unwrap))
    }

    public override fun logging(logging: LogDriver) {
      cdkBuilder.logging(logging.let(LogDriver::unwrap))
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public override fun portMappings(portMappings: List<PortMapping>) {
      cdkBuilder.portMappings(portMappings.map(PortMapping::unwrap))
    }

    public override fun privileged(privileged: Boolean) {
      cdkBuilder.privileged(privileged)
    }

    public override fun pseudoTerminal(pseudoTerminal: Boolean) {
      cdkBuilder.pseudoTerminal(pseudoTerminal)
    }

    public override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
    }

    public override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues { Secret.unwrap(it.value)})
    }

    public override fun startTimeout(startTimeout: Duration) {
      cdkBuilder.startTimeout(startTimeout.let(Duration::unwrap))
    }

    public override fun stopTimeout(stopTimeout: Duration) {
      cdkBuilder.stopTimeout(stopTimeout.let(Duration::unwrap))
    }

    public override fun systemControls(systemControls: List<SystemControl>) {
      cdkBuilder.systemControls(systemControls.map(SystemControl::unwrap))
    }

    public override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    public override fun ulimits(ulimits: List<Ulimit>) {
      cdkBuilder.ulimits(ulimits.map(Ulimit::unwrap))
    }

    public override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FirelensLogRouter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.ecs.FirelensLogRouter = wrapped.cdkObject
  }
}
