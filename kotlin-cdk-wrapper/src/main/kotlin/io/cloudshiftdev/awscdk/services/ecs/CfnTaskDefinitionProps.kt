@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTaskDefinitionProps {
  public fun containerDefinitions(): Any? = unwrap(this).getContainerDefinitions()

  public fun cpu(): String? = unwrap(this).getCpu()

  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun family(): String? = unwrap(this).getFamily()

  public fun inferenceAccelerators(): Any? = unwrap(this).getInferenceAccelerators()

  public fun ipcMode(): String? = unwrap(this).getIpcMode()

  public fun memory(): String? = unwrap(this).getMemory()

  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  public fun pidMode(): String? = unwrap(this).getPidMode()

  public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  public fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

  public fun requiresCompatibilities(): List<String> = unwrap(this).getRequiresCompatibilities() ?:
      emptyList()

  public fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

  public fun volumes(): Any? = unwrap(this).getVolumes()

  @CdkDslMarker
  public interface Builder {
    public fun containerDefinitions(containerDefinitions: IResolvable)

    public fun containerDefinitions(containerDefinitions: List<Any>)

    public fun containerDefinitions(vararg containerDefinitions: Any)

    public fun cpu(cpu: String)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("041b950090cfc9852bfb744e0f3f56eeb75104184479bc13f883353e356453fe")
    public
        fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty.Builder.() -> Unit)

    public fun executionRoleArn(executionRoleArn: String)

    public fun family(family: String)

    public fun inferenceAccelerators(inferenceAccelerators: IResolvable)

    public fun inferenceAccelerators(inferenceAccelerators: List<Any>)

    public fun inferenceAccelerators(vararg inferenceAccelerators: Any)

    public fun ipcMode(ipcMode: String)

    public fun memory(memory: String)

    public fun networkMode(networkMode: String)

    public fun pidMode(pidMode: String)

    public fun placementConstraints(placementConstraints: IResolvable)

    public fun placementConstraints(placementConstraints: List<Any>)

    public fun placementConstraints(vararg placementConstraints: Any)

    public fun proxyConfiguration(proxyConfiguration: IResolvable)

    public fun proxyConfiguration(proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167557af3f8fe427e1c1bdc077aee9d37e0f064d476bc2176faa1e995f8f0a9c")
    public
        fun proxyConfiguration(proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty.Builder.() -> Unit)

    public fun requiresCompatibilities(requiresCompatibilities: List<String>)

    public fun requiresCompatibilities(vararg requiresCompatibilities: String)

    public fun runtimePlatform(runtimePlatform: IResolvable)

    public fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f8ca60933771d6a181e09c848f3ad875b7eff4ba5e3d55a01ae2ba0b9af589c")
    public
        fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskRoleArn(taskRoleArn: String)

    public fun volumes(volumes: IResolvable)

    public fun volumes(volumes: List<Any>)

    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.builder()

    override fun containerDefinitions(containerDefinitions: IResolvable) {
      cdkBuilder.containerDefinitions(containerDefinitions.let(IResolvable::unwrap))
    }

    override fun containerDefinitions(containerDefinitions: List<Any>) {
      cdkBuilder.containerDefinitions(containerDefinitions)
    }

    override fun containerDefinitions(vararg containerDefinitions: Any): Unit =
        containerDefinitions(containerDefinitions.toList())

    override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    override fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(CfnTaskDefinition.EphemeralStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("041b950090cfc9852bfb744e0f3f56eeb75104184479bc13f883353e356453fe")
    override
        fun ephemeralStorage(ephemeralStorage: CfnTaskDefinition.EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(CfnTaskDefinition.EphemeralStorageProperty(ephemeralStorage))

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.let(IResolvable::unwrap))
    }

    override fun inferenceAccelerators(inferenceAccelerators: List<Any>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators)
    }

    override fun inferenceAccelerators(vararg inferenceAccelerators: Any): Unit =
        inferenceAccelerators(inferenceAccelerators.toList())

    override fun ipcMode(ipcMode: String) {
      cdkBuilder.ipcMode(ipcMode)
    }

    override fun memory(memory: String) {
      cdkBuilder.memory(memory)
    }

    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    override fun pidMode(pidMode: String) {
      cdkBuilder.pidMode(pidMode)
    }

    override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    override fun placementConstraints(vararg placementConstraints: Any): Unit =
        placementConstraints(placementConstraints.toList())

    override fun proxyConfiguration(proxyConfiguration: IResolvable) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(IResolvable::unwrap))
    }

    override
        fun proxyConfiguration(proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(CfnTaskDefinition.ProxyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("167557af3f8fe427e1c1bdc077aee9d37e0f064d476bc2176faa1e995f8f0a9c")
    override
        fun proxyConfiguration(proxyConfiguration: CfnTaskDefinition.ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = proxyConfiguration(CfnTaskDefinition.ProxyConfigurationProperty(proxyConfiguration))

    override fun requiresCompatibilities(requiresCompatibilities: List<String>) {
      cdkBuilder.requiresCompatibilities(requiresCompatibilities)
    }

    override fun requiresCompatibilities(vararg requiresCompatibilities: String): Unit =
        requiresCompatibilities(requiresCompatibilities.toList())

    override fun runtimePlatform(runtimePlatform: IResolvable) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(CfnTaskDefinition.RuntimePlatformProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f8ca60933771d6a181e09c848f3ad875b7eff4ba5e3d55a01ae2ba0b9af589c")
    override
        fun runtimePlatform(runtimePlatform: CfnTaskDefinition.RuntimePlatformProperty.Builder.() -> Unit):
        Unit = runtimePlatform(CfnTaskDefinition.RuntimePlatformProperty(runtimePlatform))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskRoleArn(taskRoleArn: String) {
      cdkBuilder.taskRoleArn(taskRoleArn)
    }

    override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
    }

    override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes)
    }

    override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps,
  ) : CdkObject(cdkObject), CfnTaskDefinitionProps {
    override fun containerDefinitions(): Any? = unwrap(this).getContainerDefinitions()

    override fun cpu(): String? = unwrap(this).getCpu()

    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun family(): String? = unwrap(this).getFamily()

    override fun inferenceAccelerators(): Any? = unwrap(this).getInferenceAccelerators()

    override fun ipcMode(): String? = unwrap(this).getIpcMode()

    override fun memory(): String? = unwrap(this).getMemory()

    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    override fun pidMode(): String? = unwrap(this).getPidMode()

    override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    override fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

    override fun requiresCompatibilities(): List<String> = unwrap(this).getRequiresCompatibilities()
        ?: emptyList()

    override fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

    override fun volumes(): Any? = unwrap(this).getVolumes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps):
        CfnTaskDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinitionProps):
        software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps
  }
}
