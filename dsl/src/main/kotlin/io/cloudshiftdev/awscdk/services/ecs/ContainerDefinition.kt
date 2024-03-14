package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
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

public open class ContainerDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ContainerDefinition,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun addContainerDependencies(containerDependencies: ContainerDependency) {
    unwrap(this).addContainerDependencies(containerDependencies.let(ContainerDependency::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88806b46064561a05cee758bbc018174d73d3488ac652242faf6a5e6f9d0d0b4")
  public open
      fun addContainerDependencies(containerDependencies: ContainerDependency.Builder.() -> Unit):
      Unit = addContainerDependencies(ContainerDependency(containerDependencies))

  public open fun addEnvironment(name: String, `value`: String) {
    unwrap(this).addEnvironment(name, `value`)
  }

  public open fun addInferenceAcceleratorResource(inferenceAcceleratorResources: String) {
    unwrap(this).addInferenceAcceleratorResource(inferenceAcceleratorResources)
  }

  public open fun addLink(container: ContainerDefinition) {
    unwrap(this).addLink(container.let(ContainerDefinition::unwrap))
  }

  public open fun addLink(container: ContainerDefinition, alias: String) {
    unwrap(this).addLink(container.let(ContainerDefinition::unwrap), alias)
  }

  public open fun addMountPoints(mountPoints: MountPoint) {
    unwrap(this).addMountPoints(mountPoints.let(MountPoint::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e14b36bfa3981e2bfe79e474ad186b93d0db3606bf9e701e9efe18115f473eb1")
  public open fun addMountPoints(mountPoints: MountPoint.Builder.() -> Unit): Unit =
      addMountPoints(MountPoint(mountPoints))

  public open fun addPortMappings(portMappings: PortMapping) {
    unwrap(this).addPortMappings(portMappings.let(PortMapping::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbd7e9d940149ead69e277851262f04b176580ab2abd1e849027bf1b0dbf4ca5")
  public open fun addPortMappings(portMappings: PortMapping.Builder.() -> Unit): Unit =
      addPortMappings(PortMapping(portMappings))

  public open fun addScratch(scratch: ScratchSpace) {
    unwrap(this).addScratch(scratch.let(ScratchSpace::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff9c0c8fd5fea6c56869107ca1ed417cebf096c9cb8f88c14f25f3f4f9d98c37")
  public open fun addScratch(scratch: ScratchSpace.Builder.() -> Unit): Unit =
      addScratch(ScratchSpace(scratch))

  public open fun addSecret(name: String, secret: Secret) {
    unwrap(this).addSecret(name, secret.let(Secret::unwrap))
  }

  public open fun addToExecutionPolicy(statement: PolicyStatement) {
    unwrap(this).addToExecutionPolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("039a93f76689b8a320db575cd26546b187f84c8bfb6b107d1e314cc8f3f67537")
  public open fun addToExecutionPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToExecutionPolicy(PolicyStatement(statement))

  public open fun addUlimits(ulimits: Ulimit) {
    unwrap(this).addUlimits(ulimits.let(Ulimit::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d7fc6aed419eb143848f2368ac5d27d23987101d3eab2d6425dcefdd725824f")
  public open fun addUlimits(ulimits: Ulimit.Builder.() -> Unit): Unit = addUlimits(Ulimit(ulimits))

  public open fun addVolumesFrom(volumesFrom: VolumeFrom) {
    unwrap(this).addVolumesFrom(volumesFrom.let(VolumeFrom::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5ab90466bf3e8ae1ece29b6168441a4c551332eb319e332c19e82f267866b48")
  public open fun addVolumesFrom(volumesFrom: VolumeFrom.Builder.() -> Unit): Unit =
      addVolumesFrom(VolumeFrom(volumesFrom))

  public open fun containerDependencies(): List<ContainerDependency> =
      unwrap(this).getContainerDependencies().map(ContainerDependency::wrap)

  public open fun containerName(): String = unwrap(this).getContainerName()

  public open fun containerPort(): Number = unwrap(this).getContainerPort()

  public open fun cpu(): Number? = unwrap(this).getCpu()

  public open fun credentialSpecs(): List<CredentialSpecConfig> =
      unwrap(this).getCredentialSpecs()?.map(CredentialSpecConfig::wrap) ?: emptyList()

  public open fun environmentFiles(): List<EnvironmentFileConfig> =
      unwrap(this).getEnvironmentFiles()?.map(EnvironmentFileConfig::wrap) ?: emptyList()

  public open fun essential(): Boolean = unwrap(this).getEssential()

  public open fun findPortMapping(containerPort: Number, protocol: Protocol): PortMapping? =
      unwrap(this).findPortMapping(containerPort,
      protocol.let(Protocol::unwrap))?.let(PortMapping::wrap)

  public open fun findPortMappingByName(name: String): PortMapping? =
      unwrap(this).findPortMappingByName(name)?.let(PortMapping::wrap)

  public open fun imageName(): String = unwrap(this).getImageName()

  public open fun ingressPort(): Number = unwrap(this).getIngressPort()

  public open fun linuxParameters(): LinuxParameters? =
      unwrap(this).getLinuxParameters()?.let(LinuxParameters::wrap)

  public open fun logDriverConfig(): LogDriverConfig? =
      unwrap(this).getLogDriverConfig()?.let(LogDriverConfig::wrap)

  public open fun memoryLimitSpecified(): Boolean = unwrap(this).getMemoryLimitSpecified()

  public open fun mountPoints(): List<MountPoint> =
      unwrap(this).getMountPoints().map(MountPoint::wrap)

  public open fun portMappings(): List<PortMapping> =
      unwrap(this).getPortMappings().map(PortMapping::wrap)

  public open fun pseudoTerminal(): Boolean? = unwrap(this).getPseudoTerminal()

  public open fun referencesSecretJsonField(): Boolean? =
      unwrap(this).getReferencesSecretJsonField()

  public open fun renderContainerDefinition(): CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition().let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  public open fun renderContainerDefinition(_taskDefinition: TaskDefinition):
      CfnTaskDefinition.ContainerDefinitionProperty =
      unwrap(this).renderContainerDefinition(_taskDefinition.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ContainerDefinitionProperty::wrap)

  public open fun taskDefinition(): TaskDefinition =
      unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)

  public open fun ulimits(): List<Ulimit> = unwrap(this).getUlimits().map(Ulimit::wrap)

  public open fun volumesFrom(): List<VolumeFrom> =
      unwrap(this).getVolumesFrom().map(VolumeFrom::wrap)

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

    public fun gpuCount(gpuCount: Number) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e1e6a2539bf792ecb2959114207c3aed5a48bf132e85318c8c57f72f4e73ed7")
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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDefinition.Builder =
        software.amazon.awscdk.services.ecs.ContainerDefinition.Builder.create(scope, id)

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

    public override fun gpuCount(gpuCount: Number) {
      cdkBuilder.gpuCount(gpuCount)
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e1e6a2539bf792ecb2959114207c3aed5a48bf132e85318c8c57f72f4e73ed7")
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

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDefinition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.ecs.ContainerDefinition = wrapped.cdkObject
  }
}
