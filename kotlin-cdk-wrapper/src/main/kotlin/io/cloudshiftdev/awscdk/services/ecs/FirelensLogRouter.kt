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

public open class FirelensLogRouter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouter,
) : ContainerDefinition(cdkObject) {
  public open fun firelensConfig(): FirelensConfig =
      unwrap(this).getFirelensConfig().let(FirelensConfig::wrap)

  public override fun renderContainerDefinition(): CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition().let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  public override fun renderContainerDefinition(_taskDefinition: TaskDefinition):
      CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition(_taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

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

    public fun firelensConfig(firelensConfig: FirelensConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    public fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit)

    public fun gpuCount(gpuCount: Number)

    public fun healthCheck(healthCheck: HealthCheck)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder =
        software.amazon.awscdk.services.ecs.FirelensLogRouter.Builder.create(scope, id)

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

    override fun firelensConfig(firelensConfig: FirelensConfig) {
      cdkBuilder.firelensConfig(firelensConfig.let(FirelensConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("504aa4c37511ab646db5ddb40dafa85a3bf9f0efd8d7e6203f4beefa91fc00c2")
    override fun firelensConfig(firelensConfig: FirelensConfig.Builder.() -> Unit): Unit =
        firelensConfig(FirelensConfig(firelensConfig))

    override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43466bb9fc4edc2c70e19a43206777ceb0985c7d8ac4c701c9df39423c736346")
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
        software.amazon.awscdk.services.ecs.FirelensLogRouter = wrapped.cdkObject
  }
}
