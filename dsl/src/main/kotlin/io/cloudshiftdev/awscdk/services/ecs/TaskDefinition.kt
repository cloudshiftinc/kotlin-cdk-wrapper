package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.TaskDefinition,
) : Resource(cdkObject), ITaskDefinition {
  public open fun addContainer(id: String, props: ContainerDefinitionOptions): ContainerDefinition =
      unwrap(this).addContainer(id,
      props.let(ContainerDefinitionOptions::unwrap)).let(ContainerDefinition::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad60dadcf6b5a99535d38733285d125986065c711b1844893efc32b804589a91")
  public open fun addContainer(id: String, props: ContainerDefinitionOptions.Builder.() -> Unit):
      ContainerDefinition = addContainer(id, ContainerDefinitionOptions(props))

  public open fun addExtension(extension: ITaskDefinitionExtension) {
    unwrap(this).addExtension(extension.let(ITaskDefinitionExtension::unwrap))
  }

  public open fun addFirelensLogRouter(id: String, props: FirelensLogRouterDefinitionOptions):
      FirelensLogRouter = unwrap(this).addFirelensLogRouter(id,
      props.let(FirelensLogRouterDefinitionOptions::unwrap)).let(FirelensLogRouter::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("258a71ad373c4fb9e743bd33d3129ca14a28d65c32d22a7f72744771987c7982")
  public open fun addFirelensLogRouter(id: String,
      props: FirelensLogRouterDefinitionOptions.Builder.() -> Unit): FirelensLogRouter =
      addFirelensLogRouter(id, FirelensLogRouterDefinitionOptions(props))

  public open fun addInferenceAccelerator(inferenceAccelerator: InferenceAccelerator) {
    unwrap(this).addInferenceAccelerator(inferenceAccelerator.let(InferenceAccelerator::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5ed9df469538219aa4a519c5c670da4fa01bf9950e8d2a410fbf5d7fc465f966")
  public open
      fun addInferenceAccelerator(inferenceAccelerator: InferenceAccelerator.Builder.() -> Unit):
      Unit = addInferenceAccelerator(InferenceAccelerator(inferenceAccelerator))

  public open fun addPlacementConstraint(constraint: PlacementConstraint) {
    unwrap(this).addPlacementConstraint(constraint.let(PlacementConstraint::unwrap))
  }

  public open fun addToExecutionRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToExecutionRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ee0881b1f72939d0f8c599ca7ef5c095e7f2670a8906152a8367c1e12787a29")
  public open fun addToExecutionRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToExecutionRolePolicy(PolicyStatement(statement))

  public open fun addToTaskRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToTaskRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4455c89f8cab571ccd1f229ecd42ae6b3966874f347caabc39813cfc1946816f")
  public open fun addToTaskRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToTaskRolePolicy(PolicyStatement(statement))

  public open fun addVolume(volume: Volume) {
    unwrap(this).addVolume(volume.let(Volume::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bffd0bc09d79ff6543111408c1d0d29f051556ff9169fbf7b3c3851b9e888429")
  public open fun addVolume(volume: Volume.Builder.() -> Unit): Unit = addVolume(Volume(volume))

  public override fun compatibility(): Compatibility =
      unwrap(this).getCompatibility().let(Compatibility::wrap)

  public open fun defaultContainer(): ContainerDefinition? =
      unwrap(this).getDefaultContainer()?.let(ContainerDefinition::wrap)

  public open fun defaultContainer(`value`: ContainerDefinition) {
    unwrap(this).setDefaultContainer(`value`.let(ContainerDefinition::unwrap))
  }

  public open fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

  public override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public open fun family(): String = unwrap(this).getFamily()

  public open fun findContainer(containerName: String): ContainerDefinition? =
      unwrap(this).findContainer(containerName)?.let(ContainerDefinition::wrap)

  public open fun findPortMappingByName(name: String): PortMapping? =
      unwrap(this).findPortMappingByName(name)?.let(PortMapping::wrap)

  public open fun grantRun(grantee: IGrantable): Grant =
      unwrap(this).grantRun(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun inferenceAccelerators(): List<InferenceAccelerator> =
      unwrap(this).getInferenceAccelerators().map(InferenceAccelerator::wrap)

  public override fun isEc2Compatible(): Boolean = unwrap(this).getIsEc2Compatible()

  public override fun isExternalCompatible(): Boolean = unwrap(this).getIsExternalCompatible()

  public override fun isFargateCompatible(): Boolean = unwrap(this).getIsFargateCompatible()

  public override fun networkMode(): NetworkMode =
      unwrap(this).getNetworkMode().let(NetworkMode::wrap)

  public open fun obtainExecutionRole(): IRole = unwrap(this).obtainExecutionRole().let(IRole::wrap)

  public open fun referencesSecretJsonField(): Boolean? =
      unwrap(this).getReferencesSecretJsonField()

  public override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

  public override fun taskRole(): IRole = unwrap(this).getTaskRole().let(IRole::wrap)

  public interface Builder {
    public fun compatibility(compatibility: Compatibility) {
    }

    public fun cpu(cpu: String) {
    }

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    }

    public fun executionRole(executionRole: IRole) {
    }

    public fun family(family: String) {
    }

    public fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
    }

    public fun ipcMode(ipcMode: IpcMode) {
    }

    public fun memoryMiB(memoryMiB: String) {
    }

    public fun networkMode(networkMode: NetworkMode) {
    }

    public fun pidMode(pidMode: PidMode) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2ff86d615eead154754b56faf36a13fe8e205c4641867bc32276e89999f71c9")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit) {
    }

    public fun taskRole(taskRole: IRole) {
    }

    public fun volumes(volumes: List<Volume>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.TaskDefinition.Builder.create(scope, id)

    public override fun compatibility(compatibility: Compatibility) {
      cdkBuilder.compatibility(compatibility.let(Compatibility::unwrap))
    }

    public override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    public override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun inferenceAccelerators(inferenceAccelerators: List<InferenceAccelerator>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.map(InferenceAccelerator::unwrap))
    }

    public override fun ipcMode(ipcMode: IpcMode) {
      cdkBuilder.ipcMode(ipcMode.let(IpcMode::unwrap))
    }

    public override fun memoryMiB(memoryMiB: String) {
      cdkBuilder.memoryMiB(memoryMiB)
    }

    public override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    public override fun pidMode(pidMode: PidMode) {
      cdkBuilder.pidMode(pidMode.let(PidMode::unwrap))
    }

    public override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    public override fun proxyConfiguration(proxyConfiguration: ProxyConfiguration) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfiguration::unwrap))
    }

    public override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2ff86d615eead154754b56faf36a13fe8e205c4641867bc32276e89999f71c9")
    public override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    public override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public override fun volumes(volumes: List<Volume>) {
      cdkBuilder.volumes(volumes.map(Volume::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.TaskDefinition = cdkBuilder.build()
  }

  public companion object {
    public open fun fromTaskDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      taskDefinitionArn: String,
    ): ITaskDefinition =
        software.amazon.awscdk.services.ecs.TaskDefinition.fromTaskDefinitionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, taskDefinitionArn).let(ITaskDefinition::wrap)

    public open fun fromTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TaskDefinitionAttributes,
    ): ITaskDefinition =
        software.amazon.awscdk.services.ecs.TaskDefinition.fromTaskDefinitionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(TaskDefinitionAttributes::unwrap)).let(ITaskDefinition::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed824df4eec5e5f45c3bcd7ff84cc08d918cf494c5b6d021f8cb2e318fba063c")
    public open fun fromTaskDefinitionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TaskDefinitionAttributes.Builder.() -> Unit,
    ): ITaskDefinition = fromTaskDefinitionAttributes(scope, id, TaskDefinitionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinition): TaskDefinition
        = TaskDefinition(cdkObject)

    internal fun unwrap(wrapped: TaskDefinition): software.amazon.awscdk.services.ecs.TaskDefinition
        = wrapped.cdkObject
  }
}
