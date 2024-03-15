@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrTaskDefinitionArn(): String = unwrap(this).getAttrTaskDefinitionArn()

  public open fun containerDefinitions(): Any? = unwrap(this).getContainerDefinitions()

  public open fun containerDefinitions(`value`: IResolvable) {
    unwrap(this).setContainerDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun containerDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setContainerDefinitions(__idx_ac66f0)
  }

  public open fun containerDefinitions(vararg __idx_ac66f0: Any): Unit =
      containerDefinitions(__idx_ac66f0.toList())

  public open fun cpu(): String? = unwrap(this).getCpu()

  public open fun cpu(`value`: String) {
    unwrap(this).setCpu(`value`)
  }

  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbc89d75553d59902919905573ea08c8940af31c51cd9de060318472828178a8")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public open fun family(): String? = unwrap(this).getFamily()

  public open fun family(`value`: String) {
    unwrap(this).setFamily(`value`)
  }

  public open fun inferenceAccelerators(): Any? = unwrap(this).getInferenceAccelerators()

  public open fun inferenceAccelerators(`value`: IResolvable) {
    unwrap(this).setInferenceAccelerators(`value`.let(IResolvable::unwrap))
  }

  public open fun inferenceAccelerators(__idx_ac66f0: List<Any>) {
    unwrap(this).setInferenceAccelerators(__idx_ac66f0)
  }

  public open fun inferenceAccelerators(vararg __idx_ac66f0: Any): Unit =
      inferenceAccelerators(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipcMode(): String? = unwrap(this).getIpcMode()

  public open fun ipcMode(`value`: String) {
    unwrap(this).setIpcMode(`value`)
  }

  public open fun memory(): String? = unwrap(this).getMemory()

  public open fun memory(`value`: String) {
    unwrap(this).setMemory(`value`)
  }

  public open fun networkMode(): String? = unwrap(this).getNetworkMode()

  public open fun networkMode(`value`: String) {
    unwrap(this).setNetworkMode(`value`)
  }

  public open fun pidMode(): String? = unwrap(this).getPidMode()

  public open fun pidMode(`value`: String) {
    unwrap(this).setPidMode(`value`)
  }

  public open fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

  public open fun placementConstraints(`value`: IResolvable) {
    unwrap(this).setPlacementConstraints(`value`.let(IResolvable::unwrap))
  }

  public open fun placementConstraints(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlacementConstraints(__idx_ac66f0)
  }

  public open fun placementConstraints(vararg __idx_ac66f0: Any): Unit =
      placementConstraints(__idx_ac66f0.toList())

  public open fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

  public open fun proxyConfiguration(`value`: IResolvable) {
    unwrap(this).setProxyConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty) {
    unwrap(this).setProxyConfiguration(`value`.let(ProxyConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38ba444d8dd1fee3ccca4656939eb6ded97f61af7318d18ba80a91bd293ef875")
  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty.Builder.() -> Unit): Unit =
      proxyConfiguration(ProxyConfigurationProperty(`value`))

  public open fun requiresCompatibilities(): List<String> =
      unwrap(this).getRequiresCompatibilities() ?: emptyList()

  public open fun requiresCompatibilities(`value`: List<String>) {
    unwrap(this).setRequiresCompatibilities(`value`)
  }

  public open fun requiresCompatibilities(vararg `value`: String): Unit =
      requiresCompatibilities(`value`.toList())

  public open fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

  public open fun runtimePlatform(`value`: IResolvable) {
    unwrap(this).setRuntimePlatform(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimePlatform(`value`: RuntimePlatformProperty) {
    unwrap(this).setRuntimePlatform(`value`.let(RuntimePlatformProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("167815019ae1b2a8cf0011c6ad292f21fef20d314b1ddefbf756ea37c979ba39")
  public open fun runtimePlatform(`value`: RuntimePlatformProperty.Builder.() -> Unit): Unit =
      runtimePlatform(RuntimePlatformProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun taskRoleArn(): String? = unwrap(this).getTaskRoleArn()

  public open fun taskRoleArn(`value`: String) {
    unwrap(this).setTaskRoleArn(`value`)
  }

  public open fun volumes(): Any? = unwrap(this).getVolumes()

  public open fun volumes(`value`: IResolvable) {
    unwrap(this).setVolumes(`value`.let(IResolvable::unwrap))
  }

  public open fun volumes(__idx_ac66f0: List<Any>) {
    unwrap(this).setVolumes(__idx_ac66f0)
  }

  public open fun volumes(vararg __idx_ac66f0: Any): Unit = volumes(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun containerDefinitions(containerDefinitions: IResolvable)

    public fun containerDefinitions(containerDefinitions: List<Any>)

    public fun containerDefinitions(vararg containerDefinitions: Any)

    public fun cpu(cpu: String)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit)

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

    public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit)

    public fun requiresCompatibilities(requiresCompatibilities: List<String>)

    public fun requiresCompatibilities(vararg requiresCompatibilities: String)

    public fun runtimePlatform(runtimePlatform: IResolvable)

    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskRoleArn(taskRoleArn: String)

    public fun volumes(volumes: IResolvable)

    public fun volumes(volumes: List<Any>)

    public fun volumes(vararg volumes: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder.create(scope, id)

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

    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

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

    override fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    override
        fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = proxyConfiguration(ProxyConfigurationProperty(proxyConfiguration))

    override fun requiresCompatibilities(requiresCompatibilities: List<String>) {
      cdkBuilder.requiresCompatibilities(requiresCompatibilities)
    }

    override fun requiresCompatibilities(vararg requiresCompatibilities: String): Unit =
        requiresCompatibilities(requiresCompatibilities.toList())

    override fun runtimePlatform(runtimePlatform: IResolvable) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit): Unit
        = runtimePlatform(RuntimePlatformProperty(runtimePlatform))

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

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnTaskDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition):
        CfnTaskDefinition = CfnTaskDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinition):
        software.amazon.awscdk.services.ecs.CfnTaskDefinition = wrapped.cdkObject
  }

  public interface HostVolumePropertiesProperty {
    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    @CdkDslMarker
    public interface Builder {
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.builder()

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty,
    ) : CdkObject(cdkObject), HostVolumePropertiesProperty {
      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty):
          HostVolumePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostVolumePropertiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty
    }
  }

  public interface SystemControlProperty {
    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun namespace(namespace: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.builder()

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty,
    ) : CdkObject(cdkObject), SystemControlProperty {
      override fun namespace(): String? = unwrap(this).getNamespace()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SystemControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty):
          SystemControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemControlProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty
    }
  }

  public interface FirelensConfigurationProperty {
    public fun options(): Any? = unwrap(this).getOptions()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun options(options: IResolvable)

      public fun options(options: Map<String, String>)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.builder()

      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty,
    ) : CdkObject(cdkObject), FirelensConfigurationProperty {
      override fun options(): Any? = unwrap(this).getOptions()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty):
          FirelensConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirelensConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty
    }
  }

  public interface TmpfsProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

    public fun size(): Number

    @CdkDslMarker
    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun mountOptions(mountOptions: List<String>)

      public fun mountOptions(vararg mountOptions: String)

      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun mountOptions(mountOptions: List<String>) {
        cdkBuilder.mountOptions(mountOptions)
      }

      override fun mountOptions(vararg mountOptions: String): Unit =
          mountOptions(mountOptions.toList())

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty,
    ) : CdkObject(cdkObject), TmpfsProperty {
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      override fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

      override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TmpfsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty):
          TmpfsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TmpfsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty
    }
  }

  public interface HostEntryProperty {
    public fun hostname(): String? = unwrap(this).getHostname()

    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    @CdkDslMarker
    public interface Builder {
      public fun hostname(hostname: String)

      public fun ipAddress(ipAddress: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.builder()

      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty,
    ) : CdkObject(cdkObject), HostEntryProperty {
      override fun hostname(): String? = unwrap(this).getHostname()

      override fun ipAddress(): String? = unwrap(this).getIpAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty):
          HostEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostEntryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty
    }
  }

  public interface EnvironmentFileProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty,
    ) : CdkObject(cdkObject), EnvironmentFileProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty):
          EnvironmentFileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentFileProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty
    }
  }

  public interface UlimitProperty {
    public fun hardLimit(): Number

    public fun name(): String

    public fun softLimit(): Number

    @CdkDslMarker
    public interface Builder {
      public fun hardLimit(hardLimit: Number)

      public fun name(name: String)

      public fun softLimit(softLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.builder()

      override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty,
    ) : CdkObject(cdkObject), UlimitProperty {
      override fun hardLimit(): Number = unwrap(this).getHardLimit()

      override fun name(): String = unwrap(this).getName()

      override fun softLimit(): Number = unwrap(this).getSoftLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UlimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty):
          UlimitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UlimitProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty
    }
  }

  public interface VolumeFromProperty {
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun sourceContainer(): String? = unwrap(this).getSourceContainer()

    @CdkDslMarker
    public interface Builder {
      public fun readOnly(readOnly: Boolean)

      public fun readOnly(readOnly: IResolvable)

      public fun sourceContainer(sourceContainer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.builder()

      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      override fun sourceContainer(sourceContainer: String) {
        cdkBuilder.sourceContainer(sourceContainer)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty,
    ) : CdkObject(cdkObject), VolumeFromProperty {
      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      override fun sourceContainer(): String? = unwrap(this).getSourceContainer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeFromProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty):
          VolumeFromProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeFromProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty
    }
  }

  public interface DockerVolumeConfigurationProperty {
    public fun autoprovision(): Any? = unwrap(this).getAutoprovision()

    public fun driver(): String? = unwrap(this).getDriver()

    public fun driverOpts(): Any? = unwrap(this).getDriverOpts()

    public fun labels(): Any? = unwrap(this).getLabels()

    public fun scope(): String? = unwrap(this).getScope()

    @CdkDslMarker
    public interface Builder {
      public fun autoprovision(autoprovision: Boolean)

      public fun autoprovision(autoprovision: IResolvable)

      public fun driver(driver: String)

      public fun driverOpts(driverOpts: IResolvable)

      public fun driverOpts(driverOpts: Map<String, String>)

      public fun labels(labels: IResolvable)

      public fun labels(labels: Map<String, String>)

      public fun scope(scope: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.builder()

      override fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
      }

      override fun autoprovision(autoprovision: IResolvable) {
        cdkBuilder.autoprovision(autoprovision.let(IResolvable::unwrap))
      }

      override fun driver(driver: String) {
        cdkBuilder.driver(driver)
      }

      override fun driverOpts(driverOpts: IResolvable) {
        cdkBuilder.driverOpts(driverOpts.let(IResolvable::unwrap))
      }

      override fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
      }

      override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      override fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
      }

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), DockerVolumeConfigurationProperty {
      override fun autoprovision(): Any? = unwrap(this).getAutoprovision()

      override fun driver(): String? = unwrap(this).getDriver()

      override fun driverOpts(): Any? = unwrap(this).getDriverOpts()

      override fun labels(): Any? = unwrap(this).getLabels()

      override fun scope(): String? = unwrap(this).getScope()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DockerVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty):
          DockerVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DockerVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty
    }
  }

  public interface EFSVolumeConfigurationProperty {
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    public fun filesystemId(): String

    public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    @CdkDslMarker
    public interface Builder {
      public fun authorizationConfig(authorizationConfig: IResolvable)

      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit)

      public fun filesystemId(filesystemId: String)

      public fun rootDirectory(rootDirectory: String)

      public fun transitEncryption(transitEncryption: String)

      public fun transitEncryptionPort(transitEncryptionPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.builder()

      override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      override fun filesystemId(filesystemId: String) {
        cdkBuilder.filesystemId(filesystemId)
      }

      override fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
      }

      override fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
      }

      override fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty,
    ) : CdkObject(cdkObject), EFSVolumeConfigurationProperty {
      override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      override fun filesystemId(): String = unwrap(this).getFilesystemId()

      override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

      override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

      override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EFSVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty):
          EFSVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty
    }
  }

  public interface MountPointProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun sourceVolume(): String? = unwrap(this).getSourceVolume()

    @CdkDslMarker
    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun readOnly(readOnly: Boolean)

      public fun readOnly(readOnly: IResolvable)

      public fun sourceVolume(sourceVolume: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      override fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty,
    ) : CdkObject(cdkObject), MountPointProperty {
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      override fun readOnly(): Any? = unwrap(this).getReadOnly()

      override fun sourceVolume(): String? = unwrap(this).getSourceVolume()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty):
          MountPointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountPointProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty
    }
  }

  public interface AuthorizationConfigProperty {
    public fun accessPointId(): String? = unwrap(this).getAccessPointId()

    public fun iam(): String? = unwrap(this).getIam()

    @CdkDslMarker
    public interface Builder {
      public fun accessPointId(accessPointId: String)

      public fun iam(iam: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.builder()

      override fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
      }

      override fun iam(iam: String) {
        cdkBuilder.iam(iam)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty,
    ) : CdkObject(cdkObject), AuthorizationConfigProperty {
      override fun accessPointId(): String? = unwrap(this).getAccessPointId()

      override fun iam(): String? = unwrap(this).getIam()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty):
          AuthorizationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty
    }
  }

  public interface InferenceAcceleratorProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun deviceType(): String? = unwrap(this).getDeviceType()

    @CdkDslMarker
    public interface Builder {
      public fun deviceName(deviceName: String)

      public fun deviceType(deviceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.builder()

      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty,
    ) : CdkObject(cdkObject), InferenceAcceleratorProperty {
      override fun deviceName(): String? = unwrap(this).getDeviceName()

      override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty):
          InferenceAcceleratorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceAcceleratorProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty
    }
  }

  public interface TaskDefinitionPlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun expression(expression: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty,
    ) : CdkObject(cdkObject), TaskDefinitionPlacementConstraintProperty {
      override fun expression(): String? = unwrap(this).getExpression()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TaskDefinitionPlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty):
          TaskDefinitionPlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskDefinitionPlacementConstraintProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
    }
  }

  public interface RuntimePlatformProperty {
    public fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

    public fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()

    @CdkDslMarker
    public interface Builder {
      public fun cpuArchitecture(cpuArchitecture: String)

      public fun operatingSystemFamily(operatingSystemFamily: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.builder()

      override fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
      }

      override fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty,
    ) : CdkObject(cdkObject), RuntimePlatformProperty {
      override fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

      override fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty):
          RuntimePlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePlatformProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty
    }
  }

  public interface ContainerDependencyProperty {
    public fun condition(): String? = unwrap(this).getCondition()

    public fun containerName(): String? = unwrap(this).getContainerName()

    @CdkDslMarker
    public interface Builder {
      public fun condition(condition: String)

      public fun containerName(containerName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.builder()

      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty,
    ) : CdkObject(cdkObject), ContainerDependencyProperty {
      override fun condition(): String? = unwrap(this).getCondition()

      override fun containerName(): String? = unwrap(this).getContainerName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty):
          ContainerDependencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDependencyProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty
    }
  }

  public interface KeyValuePairProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty,
    ) : CdkObject(cdkObject), KeyValuePairProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty):
          KeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValuePairProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty
    }
  }

  public interface DeviceProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun hostPath(): String? = unwrap(this).getHostPath()

    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun containerPath(containerPath: String)

      public fun hostPath(hostPath: String)

      public fun permissions(permissions: List<String>)

      public fun permissions(vararg permissions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.builder()

      override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      override fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
      }

      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty,
    ) : CdkObject(cdkObject), DeviceProperty {
      override fun containerPath(): String? = unwrap(this).getContainerPath()

      override fun hostPath(): String? = unwrap(this).getHostPath()

      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty
    }
  }

  public interface LinuxParametersProperty {
    public fun capabilities(): Any? = unwrap(this).getCapabilities()

    public fun devices(): Any? = unwrap(this).getDevices()

    public fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

    public fun maxSwap(): Number? = unwrap(this).getMaxSwap()

    public fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

    public fun swappiness(): Number? = unwrap(this).getSwappiness()

    public fun tmpfs(): Any? = unwrap(this).getTmpfs()

    @CdkDslMarker
    public interface Builder {
      public fun capabilities(capabilities: IResolvable)

      public fun capabilities(capabilities: KernelCapabilitiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      public fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit)

      public fun devices(devices: IResolvable)

      public fun devices(devices: List<Any>)

      public fun devices(vararg devices: Any)

      public fun initProcessEnabled(initProcessEnabled: Boolean)

      public fun initProcessEnabled(initProcessEnabled: IResolvable)

      public fun maxSwap(maxSwap: Number)

      public fun sharedMemorySize(sharedMemorySize: Number)

      public fun swappiness(swappiness: Number)

      public fun tmpfs(tmpfs: IResolvable)

      public fun tmpfs(tmpfs: List<Any>)

      public fun tmpfs(vararg tmpfs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.builder()

      override fun capabilities(capabilities: IResolvable) {
        cdkBuilder.capabilities(capabilities.let(IResolvable::unwrap))
      }

      override fun capabilities(capabilities: KernelCapabilitiesProperty) {
        cdkBuilder.capabilities(capabilities.let(KernelCapabilitiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      override fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit): Unit =
          capabilities(KernelCapabilitiesProperty(capabilities))

      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      override fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
      }

      override fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled.let(IResolvable::unwrap))
      }

      override fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
      }

      override fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
      }

      override fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
      }

      override fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs.let(IResolvable::unwrap))
      }

      override fun tmpfs(tmpfs: List<Any>) {
        cdkBuilder.tmpfs(tmpfs)
      }

      override fun tmpfs(vararg tmpfs: Any): Unit = tmpfs(tmpfs.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty,
    ) : CdkObject(cdkObject), LinuxParametersProperty {
      override fun capabilities(): Any? = unwrap(this).getCapabilities()

      override fun devices(): Any? = unwrap(this).getDevices()

      override fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

      override fun maxSwap(): Number? = unwrap(this).getMaxSwap()

      override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

      override fun swappiness(): Number? = unwrap(this).getSwappiness()

      override fun tmpfs(): Any? = unwrap(this).getTmpfs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty):
          LinuxParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinuxParametersProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty
    }
  }

  public interface ContainerDefinitionProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun cpu(): Number? = unwrap(this).getCpu()

    public fun credentialSpecs(): List<String> = unwrap(this).getCredentialSpecs() ?: emptyList()

    public fun dependsOn(): Any? = unwrap(this).getDependsOn()

    public fun disableNetworking(): Any? = unwrap(this).getDisableNetworking()

    public fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?: emptyList()

    public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    public fun dockerLabels(): Any? = unwrap(this).getDockerLabels()

    public fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions() ?:
        emptyList()

    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    public fun environment(): Any? = unwrap(this).getEnvironment()

    public fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

    public fun essential(): Any? = unwrap(this).getEssential()

    public fun extraHosts(): Any? = unwrap(this).getExtraHosts()

    public fun firelensConfiguration(): Any? = unwrap(this).getFirelensConfiguration()

    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    public fun hostname(): String? = unwrap(this).getHostname()

    public fun image(): String

    public fun interactive(): Any? = unwrap(this).getInteractive()

    public fun links(): List<String> = unwrap(this).getLinks() ?: emptyList()

    public fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    public fun memory(): Number? = unwrap(this).getMemory()

    public fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

    public fun mountPoints(): Any? = unwrap(this).getMountPoints()

    public fun name(): String

    public fun portMappings(): Any? = unwrap(this).getPortMappings()

    public fun privileged(): Any? = unwrap(this).getPrivileged()

    public fun pseudoTerminal(): Any? = unwrap(this).getPseudoTerminal()

    public fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

    public fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

    public fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

    public fun secrets(): Any? = unwrap(this).getSecrets()

    public fun startTimeout(): Number? = unwrap(this).getStartTimeout()

    public fun stopTimeout(): Number? = unwrap(this).getStopTimeout()

    public fun systemControls(): Any? = unwrap(this).getSystemControls()

    public fun ulimits(): Any? = unwrap(this).getUlimits()

    public fun user(): String? = unwrap(this).getUser()

    public fun volumesFrom(): Any? = unwrap(this).getVolumesFrom()

    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    @CdkDslMarker
    public interface Builder {
      public fun command(command: List<String>)

      public fun command(vararg command: String)

      public fun cpu(cpu: Number)

      public fun credentialSpecs(credentialSpecs: List<String>)

      public fun credentialSpecs(vararg credentialSpecs: String)

      public fun dependsOn(dependsOn: IResolvable)

      public fun dependsOn(dependsOn: List<Any>)

      public fun dependsOn(vararg dependsOn: Any)

      public fun disableNetworking(disableNetworking: Boolean)

      public fun disableNetworking(disableNetworking: IResolvable)

      public fun dnsSearchDomains(dnsSearchDomains: List<String>)

      public fun dnsSearchDomains(vararg dnsSearchDomains: String)

      public fun dnsServers(dnsServers: List<String>)

      public fun dnsServers(vararg dnsServers: String)

      public fun dockerLabels(dockerLabels: IResolvable)

      public fun dockerLabels(dockerLabels: Map<String, String>)

      public fun dockerSecurityOptions(dockerSecurityOptions: List<String>)

      public fun dockerSecurityOptions(vararg dockerSecurityOptions: String)

      public fun entryPoint(entryPoint: List<String>)

      public fun entryPoint(vararg entryPoint: String)

      public fun environment(environment: IResolvable)

      public fun environment(environment: List<Any>)

      public fun environment(vararg environment: Any)

      public fun environmentFiles(environmentFiles: IResolvable)

      public fun environmentFiles(environmentFiles: List<Any>)

      public fun environmentFiles(vararg environmentFiles: Any)

      public fun essential(essential: Boolean)

      public fun essential(essential: IResolvable)

      public fun extraHosts(extraHosts: IResolvable)

      public fun extraHosts(extraHosts: List<Any>)

      public fun extraHosts(vararg extraHosts: Any)

      public fun firelensConfiguration(firelensConfiguration: IResolvable)

      public fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      public
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit)

      public fun healthCheck(healthCheck: IResolvable)

      public fun healthCheck(healthCheck: HealthCheckProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

      public fun hostname(hostname: String)

      public fun image(image: String)

      public fun interactive(interactive: Boolean)

      public fun interactive(interactive: IResolvable)

      public fun links(links: List<String>)

      public fun links(vararg links: String)

      public fun linuxParameters(linuxParameters: IResolvable)

      public fun linuxParameters(linuxParameters: LinuxParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit)

      public fun logConfiguration(logConfiguration: IResolvable)

      public fun logConfiguration(logConfiguration: LogConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

      public fun memory(memory: Number)

      public fun memoryReservation(memoryReservation: Number)

      public fun mountPoints(mountPoints: IResolvable)

      public fun mountPoints(mountPoints: List<Any>)

      public fun mountPoints(vararg mountPoints: Any)

      public fun name(name: String)

      public fun portMappings(portMappings: IResolvable)

      public fun portMappings(portMappings: List<Any>)

      public fun portMappings(vararg portMappings: Any)

      public fun privileged(privileged: Boolean)

      public fun privileged(privileged: IResolvable)

      public fun pseudoTerminal(pseudoTerminal: Boolean)

      public fun pseudoTerminal(pseudoTerminal: IResolvable)

      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean)

      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable)

      public fun repositoryCredentials(repositoryCredentials: IResolvable)

      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit)

      public fun resourceRequirements(resourceRequirements: IResolvable)

      public fun resourceRequirements(resourceRequirements: List<Any>)

      public fun resourceRequirements(vararg resourceRequirements: Any)

      public fun secrets(secrets: IResolvable)

      public fun secrets(secrets: List<Any>)

      public fun secrets(vararg secrets: Any)

      public fun startTimeout(startTimeout: Number)

      public fun stopTimeout(stopTimeout: Number)

      public fun systemControls(systemControls: IResolvable)

      public fun systemControls(systemControls: List<Any>)

      public fun systemControls(vararg systemControls: Any)

      public fun ulimits(ulimits: IResolvable)

      public fun ulimits(ulimits: List<Any>)

      public fun ulimits(vararg ulimits: Any)

      public fun user(user: String)

      public fun volumesFrom(volumesFrom: IResolvable)

      public fun volumesFrom(volumesFrom: List<Any>)

      public fun volumesFrom(vararg volumesFrom: Any)

      public fun workingDirectory(workingDirectory: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun command(vararg command: String): Unit = command(command.toList())

      override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      override fun credentialSpecs(credentialSpecs: List<String>) {
        cdkBuilder.credentialSpecs(credentialSpecs)
      }

      override fun credentialSpecs(vararg credentialSpecs: String): Unit =
          credentialSpecs(credentialSpecs.toList())

      override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      override fun dependsOn(vararg dependsOn: Any): Unit = dependsOn(dependsOn.toList())

      override fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
      }

      override fun disableNetworking(disableNetworking: IResolvable) {
        cdkBuilder.disableNetworking(disableNetworking.let(IResolvable::unwrap))
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

      override fun dockerLabels(dockerLabels: IResolvable) {
        cdkBuilder.dockerLabels(dockerLabels.let(IResolvable::unwrap))
      }

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

      override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      override fun environment(vararg environment: Any): Unit = environment(environment.toList())

      override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      override fun environmentFiles(vararg environmentFiles: Any): Unit =
          environmentFiles(environmentFiles.toList())

      override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable::unwrap))
      }

      override fun extraHosts(extraHosts: IResolvable) {
        cdkBuilder.extraHosts(extraHosts.let(IResolvable::unwrap))
      }

      override fun extraHosts(extraHosts: List<Any>) {
        cdkBuilder.extraHosts(extraHosts)
      }

      override fun extraHosts(vararg extraHosts: Any): Unit = extraHosts(extraHosts.toList())

      override fun firelensConfiguration(firelensConfiguration: IResolvable) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(IResolvable::unwrap))
      }

      override fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(FirelensConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      override
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit):
          Unit = firelensConfiguration(FirelensConfigurationProperty(firelensConfiguration))

      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      override fun healthCheck(healthCheck: HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckProperty(healthCheck))

      override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      override fun interactive(interactive: Boolean) {
        cdkBuilder.interactive(interactive)
      }

      override fun interactive(interactive: IResolvable) {
        cdkBuilder.interactive(interactive.let(IResolvable::unwrap))
      }

      override fun links(links: List<String>) {
        cdkBuilder.links(links)
      }

      override fun links(vararg links: String): Unit = links(links.toList())

      override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      override fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit):
          Unit = linuxParameters(LinuxParametersProperty(linuxParameters))

      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

      override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      override fun mountPoints(vararg mountPoints: Any): Unit = mountPoints(mountPoints.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun portMappings(portMappings: IResolvable) {
        cdkBuilder.portMappings(portMappings.let(IResolvable::unwrap))
      }

      override fun portMappings(portMappings: List<Any>) {
        cdkBuilder.portMappings(portMappings)
      }

      override fun portMappings(vararg portMappings: Any): Unit =
          portMappings(portMappings.toList())

      override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      override fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
      }

      override fun pseudoTerminal(pseudoTerminal: IResolvable) {
        cdkBuilder.pseudoTerminal(pseudoTerminal.let(IResolvable::unwrap))
      }

      override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      override fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      override fun resourceRequirements(vararg resourceRequirements: Any): Unit =
          resourceRequirements(resourceRequirements.toList())

      override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      override fun secrets(vararg secrets: Any): Unit = secrets(secrets.toList())

      override fun startTimeout(startTimeout: Number) {
        cdkBuilder.startTimeout(startTimeout)
      }

      override fun stopTimeout(stopTimeout: Number) {
        cdkBuilder.stopTimeout(stopTimeout)
      }

      override fun systemControls(systemControls: IResolvable) {
        cdkBuilder.systemControls(systemControls.let(IResolvable::unwrap))
      }

      override fun systemControls(systemControls: List<Any>) {
        cdkBuilder.systemControls(systemControls)
      }

      override fun systemControls(vararg systemControls: Any): Unit =
          systemControls(systemControls.toList())

      override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      override fun ulimits(vararg ulimits: Any): Unit = ulimits(ulimits.toList())

      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      override fun volumesFrom(volumesFrom: IResolvable) {
        cdkBuilder.volumesFrom(volumesFrom.let(IResolvable::unwrap))
      }

      override fun volumesFrom(volumesFrom: List<Any>) {
        cdkBuilder.volumesFrom(volumesFrom)
      }

      override fun volumesFrom(vararg volumesFrom: Any): Unit = volumesFrom(volumesFrom.toList())

      override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty,
    ) : CdkObject(cdkObject), ContainerDefinitionProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun cpu(): Number? = unwrap(this).getCpu()

      override fun credentialSpecs(): List<String> = unwrap(this).getCredentialSpecs() ?:
          emptyList()

      override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      override fun disableNetworking(): Any? = unwrap(this).getDisableNetworking()

      override fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?:
          emptyList()

      override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

      override fun dockerLabels(): Any? = unwrap(this).getDockerLabels()

      override fun dockerSecurityOptions(): List<String> = unwrap(this).getDockerSecurityOptions()
          ?: emptyList()

      override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      override fun environment(): Any? = unwrap(this).getEnvironment()

      override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      override fun essential(): Any? = unwrap(this).getEssential()

      override fun extraHosts(): Any? = unwrap(this).getExtraHosts()

      override fun firelensConfiguration(): Any? = unwrap(this).getFirelensConfiguration()

      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      override fun hostname(): String? = unwrap(this).getHostname()

      override fun image(): String = unwrap(this).getImage()

      override fun interactive(): Any? = unwrap(this).getInteractive()

      override fun links(): List<String> = unwrap(this).getLinks() ?: emptyList()

      override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      override fun memory(): Number? = unwrap(this).getMemory()

      override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      override fun name(): String = unwrap(this).getName()

      override fun portMappings(): Any? = unwrap(this).getPortMappings()

      override fun privileged(): Any? = unwrap(this).getPrivileged()

      override fun pseudoTerminal(): Any? = unwrap(this).getPseudoTerminal()

      override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      override fun secrets(): Any? = unwrap(this).getSecrets()

      override fun startTimeout(): Number? = unwrap(this).getStartTimeout()

      override fun stopTimeout(): Number? = unwrap(this).getStopTimeout()

      override fun systemControls(): Any? = unwrap(this).getSystemControls()

      override fun ulimits(): Any? = unwrap(this).getUlimits()

      override fun user(): String? = unwrap(this).getUser()

      override fun volumesFrom(): Any? = unwrap(this).getVolumesFrom()

      override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty):
          ContainerDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty
    }
  }

  public interface ProxyConfigurationProperty {
    public fun containerName(): String

    public fun proxyConfigurationProperties(): Any? = unwrap(this).getProxyConfigurationProperties()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun containerName(containerName: String)

      public fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable)

      public fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>)

      public fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.builder()

      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      override fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties.let(IResolvable::unwrap))
      }

      override fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties)
      }

      override fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any): Unit =
          proxyConfigurationProperties(proxyConfigurationProperties.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty,
    ) : CdkObject(cdkObject), ProxyConfigurationProperty {
      override fun containerName(): String = unwrap(this).getContainerName()

      override fun proxyConfigurationProperties(): Any? =
          unwrap(this).getProxyConfigurationProperties()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty):
          ProxyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty
    }
  }

  public interface RepositoryCredentialsProperty {
    public fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()

    @CdkDslMarker
    public interface Builder {
      public fun credentialsParameter(credentialsParameter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.builder()

      override fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty,
    ) : CdkObject(cdkObject), RepositoryCredentialsProperty {
      override fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty):
          RepositoryCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCredentialsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty
    }
  }

  public interface SecretProperty {
    public fun name(): String

    public fun valueFrom(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun valueFrom(valueFrom: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty,
    ) : CdkObject(cdkObject), SecretProperty {
      override fun name(): String = unwrap(this).getName()

      override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty):
          SecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty
    }
  }

  public interface LogConfigurationProperty {
    public fun logDriver(): String

    public fun options(): Any? = unwrap(this).getOptions()

    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    @CdkDslMarker
    public interface Builder {
      public fun logDriver(logDriver: String)

      public fun options(options: IResolvable)

      public fun options(options: Map<String, String>)

      public fun secretOptions(secretOptions: IResolvable)

      public fun secretOptions(secretOptions: List<Any>)

      public fun secretOptions(vararg secretOptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.builder()

      override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      override fun secretOptions(vararg secretOptions: Any): Unit =
          secretOptions(secretOptions.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty,
    ) : CdkObject(cdkObject), LogConfigurationProperty {
      override fun logDriver(): String = unwrap(this).getLogDriver()

      override fun options(): Any? = unwrap(this).getOptions()

      override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty
    }
  }

  public interface PortMappingProperty {
    public fun appProtocol(): String? = unwrap(this).getAppProtocol()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

    public fun hostPort(): Number? = unwrap(this).getHostPort()

    public fun name(): String? = unwrap(this).getName()

    public fun protocol(): String? = unwrap(this).getProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun appProtocol(appProtocol: String)

      public fun containerPort(containerPort: Number)

      public fun containerPortRange(containerPortRange: String)

      public fun hostPort(hostPort: Number)

      public fun name(name: String)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.builder()

      override fun appProtocol(appProtocol: String) {
        cdkBuilder.appProtocol(appProtocol)
      }

      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      override fun containerPortRange(containerPortRange: String) {
        cdkBuilder.containerPortRange(containerPortRange)
      }

      override fun hostPort(hostPort: Number) {
        cdkBuilder.hostPort(hostPort)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty,
    ) : CdkObject(cdkObject), PortMappingProperty {
      override fun appProtocol(): String? = unwrap(this).getAppProtocol()

      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

      override fun hostPort(): Number? = unwrap(this).getHostPort()

      override fun name(): String? = unwrap(this).getName()

      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty):
          PortMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty
    }
  }

  public interface HealthCheckProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun retries(): Number? = unwrap(this).getRetries()

    public fun startPeriod(): Number? = unwrap(this).getStartPeriod()

    public fun timeout(): Number? = unwrap(this).getTimeout()

    @CdkDslMarker
    public interface Builder {
      public fun command(command: List<String>)

      public fun command(vararg command: String)

      public fun interval(interval: Number)

      public fun retries(retries: Number)

      public fun startPeriod(startPeriod: Number)

      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.builder()

      override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      override fun command(vararg command: String): Unit = command(command.toList())

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      override fun startPeriod(startPeriod: Number) {
        cdkBuilder.startPeriod(startPeriod)
      }

      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty,
    ) : CdkObject(cdkObject), HealthCheckProperty {
      override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun retries(): Number? = unwrap(this).getRetries()

      override fun startPeriod(): Number? = unwrap(this).getStartPeriod()

      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty):
          HealthCheckProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty
    }
  }

  public interface ResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun type(type: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty,
    ) : CdkObject(cdkObject), ResourceRequirementProperty {
      override fun type(): String = unwrap(this).getType()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty):
          ResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceRequirementProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty
    }
  }

  public interface EphemeralStorageProperty {
    public fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

    @CdkDslMarker
    public interface Builder {
      public fun sizeInGiB(sizeInGiB: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.builder()

      override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty,
    ) : CdkObject(cdkObject), EphemeralStorageProperty {
      override fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty):
          EphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty
    }
  }

  public interface VolumeProperty {
    public fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

    public fun dockerVolumeConfiguration(): Any? = unwrap(this).getDockerVolumeConfiguration()

    public fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

    public fun host(): Any? = unwrap(this).getHost()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun configuredAtLaunch(configuredAtLaunch: Boolean)

      public fun configuredAtLaunch(configuredAtLaunch: IResolvable)

      public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable)

      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit)

      public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable)

      public fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      public
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit)

      public fun host(host: IResolvable)

      public fun host(host: HostVolumePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      public fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.builder()

      override fun configuredAtLaunch(configuredAtLaunch: Boolean) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch)
      }

      override fun configuredAtLaunch(configuredAtLaunch: IResolvable) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch.let(IResolvable::unwrap))
      }

      override fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(DockerVolumeConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit):
          Unit =
          dockerVolumeConfiguration(DockerVolumeConfigurationProperty(dockerVolumeConfiguration))

      override fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(IResolvable::unwrap))
      }

      override fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EFSVolumeConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = efsVolumeConfiguration(EFSVolumeConfigurationProperty(efsVolumeConfiguration))

      override fun host(host: IResolvable) {
        cdkBuilder.host(host.let(IResolvable::unwrap))
      }

      override fun host(host: HostVolumePropertiesProperty) {
        cdkBuilder.host(host.let(HostVolumePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      override fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit): Unit =
          host(HostVolumePropertiesProperty(host))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty,
    ) : CdkObject(cdkObject), VolumeProperty {
      override fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

      override fun dockerVolumeConfiguration(): Any? = unwrap(this).getDockerVolumeConfiguration()

      override fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

      override fun host(): Any? = unwrap(this).getHost()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty):
          VolumeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty
    }
  }

  public interface KernelCapabilitiesProperty {
    public fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

    public fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun add(add: List<String>)

      public fun add(vararg add: String)

      public fun drop(drop: List<String>)

      public fun drop(vararg drop: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.builder()

      override fun add(add: List<String>) {
        cdkBuilder.add(add)
      }

      override fun add(vararg add: String): Unit = add(add.toList())

      override fun drop(drop: List<String>) {
        cdkBuilder.drop(drop)
      }

      override fun drop(vararg drop: String): Unit = drop(drop.toList())

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty,
    ) : CdkObject(cdkObject), KernelCapabilitiesProperty {
      override fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

      override fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty):
          KernelCapabilitiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelCapabilitiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty
    }
  }
}
