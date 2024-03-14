package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
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

public open class CfnTaskDefinition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrTaskDefinitionArn(): String = unwrap(this).getAttrTaskDefinitionArn()

  public open fun containerDefinitions(): Any? = unwrap(this).getContainerDefinitions()

  public open fun containerDefinitions(`value`: IResolvable) {
    unwrap(this).setContainerDefinitions(`value`.let(IResolvable::unwrap))
  }

  public open fun containerDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setContainerDefinitions(__idx_ac66f0)
  }

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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

  public open fun proxyConfiguration(`value`: IResolvable) {
    unwrap(this).setProxyConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty) {
    unwrap(this).setProxyConfiguration(`value`.let(ProxyConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38ba444d8dd1fee3ccca4656939eb6ded97f61af7318d18ba80a91bd293ef875")
  public open fun proxyConfiguration(`value`: ProxyConfigurationProperty.Builder.() -> Unit): Unit =
      proxyConfiguration(ProxyConfigurationProperty(`value`))

  public open fun requiresCompatibilities(): List<String> =
      unwrap(this).getRequiresCompatibilities() ?: emptyList()

  public open fun requiresCompatibilities(`value`: List<String>) {
    unwrap(this).setRequiresCompatibilities(`value`)
  }

  public open fun runtimePlatform(): Any? = unwrap(this).getRuntimePlatform()

  public open fun runtimePlatform(`value`: IResolvable) {
    unwrap(this).setRuntimePlatform(`value`.let(IResolvable::unwrap))
  }

  public open fun runtimePlatform(`value`: RuntimePlatformProperty) {
    unwrap(this).setRuntimePlatform(`value`.let(RuntimePlatformProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("167815019ae1b2a8cf0011c6ad292f21fef20d314b1ddefbf756ea37c979ba39")
  public open fun runtimePlatform(`value`: RuntimePlatformProperty.Builder.() -> Unit): Unit =
      runtimePlatform(RuntimePlatformProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

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

  public interface Builder {
    public fun containerDefinitions(containerDefinitions: IResolvable) {
    }

    public fun containerDefinitions(containerDefinitions: List<Any>) {
    }

    public fun cpu(cpu: String) {
    }

    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    }

    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun family(family: String) {
    }

    public fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
    }

    public fun inferenceAccelerators(inferenceAccelerators: List<Any>) {
    }

    public fun ipcMode(ipcMode: String) {
    }

    public fun memory(memory: String) {
    }

    public fun networkMode(networkMode: String) {
    }

    public fun pidMode(pidMode: String) {
    }

    public fun placementConstraints(placementConstraints: IResolvable) {
    }

    public fun placementConstraints(placementConstraints: List<Any>) {
    }

    public fun proxyConfiguration(proxyConfiguration: IResolvable) {
    }

    public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    public
        fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit) {
    }

    public fun requiresCompatibilities(requiresCompatibilities: List<String>) {
    }

    public fun runtimePlatform(runtimePlatform: IResolvable) {
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    public fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun taskRoleArn(taskRoleArn: String) {
    }

    public fun volumes(volumes: IResolvable) {
    }

    public fun volumes(volumes: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskDefinition.Builder.create(scope, id)

    public override fun containerDefinitions(containerDefinitions: IResolvable) {
      cdkBuilder.containerDefinitions(containerDefinitions.let(IResolvable::unwrap))
    }

    public override fun containerDefinitions(containerDefinitions: List<Any>) {
      cdkBuilder.containerDefinitions(containerDefinitions)
    }

    public override fun cpu(cpu: String) {
      cdkBuilder.cpu(cpu)
    }

    public override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    public override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07eb9118df2c92bfa42e14be488a6b2946a8e770eb53d75322005f8017dcb297")
    public override
        fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit): Unit =
        ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun inferenceAccelerators(inferenceAccelerators: IResolvable) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators.let(IResolvable::unwrap))
    }

    public override fun inferenceAccelerators(inferenceAccelerators: List<Any>) {
      cdkBuilder.inferenceAccelerators(inferenceAccelerators)
    }

    public override fun ipcMode(ipcMode: String) {
      cdkBuilder.ipcMode(ipcMode)
    }

    public override fun memory(memory: String) {
      cdkBuilder.memory(memory)
    }

    public override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    public override fun pidMode(pidMode: String) {
      cdkBuilder.pidMode(pidMode)
    }

    public override fun placementConstraints(placementConstraints: IResolvable) {
      cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
    }

    public override fun placementConstraints(placementConstraints: List<Any>) {
      cdkBuilder.placementConstraints(placementConstraints)
    }

    public override fun proxyConfiguration(proxyConfiguration: IResolvable) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(IResolvable::unwrap))
    }

    public override fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
      cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7fd9ecd76c23d731d998232c8f5fda8b0432cdcb319136d0cf2e32f35c61f73")
    public override
        fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
        Unit = proxyConfiguration(ProxyConfigurationProperty(proxyConfiguration))

    public override fun requiresCompatibilities(requiresCompatibilities: List<String>) {
      cdkBuilder.requiresCompatibilities(requiresCompatibilities)
    }

    public override fun runtimePlatform(runtimePlatform: IResolvable) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(IResolvable::unwrap))
    }

    public override fun runtimePlatform(runtimePlatform: RuntimePlatformProperty) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatformProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55c109b01f495e4bfa184cbae89955095d1c5c2165048e7b490d60c7db60ea54")
    public override
        fun runtimePlatform(runtimePlatform: RuntimePlatformProperty.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatformProperty(runtimePlatform))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun taskRoleArn(taskRoleArn: String) {
      cdkBuilder.taskRoleArn(taskRoleArn)
    }

    public override fun volumes(volumes: IResolvable) {
      cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
    }

    public override fun volumes(volumes: List<Any>) {
      cdkBuilder.volumes(volumes)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun sourcePath(sourcePath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.builder()

      public override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty,
    ) : HostVolumePropertiesProperty {
      public override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty):
          HostVolumePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostVolumePropertiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SystemControlProperty {
    public fun namespace(): String? = unwrap(this).getNamespace()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun namespace(namespace: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty.builder()

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty,
    ) : SystemControlProperty {
      public override fun namespace(): String? = unwrap(this).getNamespace()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SystemControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty):
          SystemControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SystemControlProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SystemControlProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FirelensConfigurationProperty {
    public fun options(): Any? = unwrap(this).getOptions()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun options(options: IResolvable) {
      }

      public fun options(options: Map<String, String>) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty.builder()

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty,
    ) : FirelensConfigurationProperty {
      public override fun options(): Any? = unwrap(this).getOptions()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty):
          FirelensConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirelensConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.FirelensConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TmpfsProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?: emptyList()

    public fun size(): Number

    public interface Builder {
      public fun containerPath(containerPath: String) {
      }

      public fun mountOptions(mountOptions: List<String>) {
      }

      public fun size(size: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.builder()

      public override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      public override fun mountOptions(mountOptions: List<String>) {
        cdkBuilder.mountOptions(mountOptions)
      }

      public override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty,
    ) : TmpfsProperty {
      public override fun containerPath(): String? = unwrap(this).getContainerPath()

      public override fun mountOptions(): List<String> = unwrap(this).getMountOptions() ?:
          emptyList()

      public override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TmpfsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty):
          TmpfsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TmpfsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HostEntryProperty {
    public fun hostname(): String? = unwrap(this).getHostname()

    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    public interface Builder {
      public fun hostname(hostname: String) {
      }

      public fun ipAddress(ipAddress: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.builder()

      public override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      public override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty,
    ) : HostEntryProperty {
      public override fun hostname(): String? = unwrap(this).getHostname()

      public override fun ipAddress(): String? = unwrap(this).getIpAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HostEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty):
          HostEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostEntryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EnvironmentFileProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty,
    ) : EnvironmentFileProperty {
      public override fun type(): String? = unwrap(this).getType()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty):
          EnvironmentFileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentFileProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EnvironmentFileProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface UlimitProperty {
    public fun hardLimit(): Number

    public fun name(): String

    public fun softLimit(): Number

    public interface Builder {
      public fun hardLimit(hardLimit: Number) {
      }

      public fun name(name: String) {
      }

      public fun softLimit(softLimit: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty.builder()

      public override fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty,
    ) : UlimitProperty {
      public override fun hardLimit(): Number = unwrap(this).getHardLimit()

      public override fun name(): String = unwrap(this).getName()

      public override fun softLimit(): Number = unwrap(this).getSoftLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UlimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty):
          UlimitProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UlimitProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.UlimitProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VolumeFromProperty {
    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun sourceContainer(): String? = unwrap(this).getSourceContainer()

    public interface Builder {
      public fun readOnly(readOnly: Boolean) {
      }

      public fun readOnly(readOnly: IResolvable) {
      }

      public fun sourceContainer(sourceContainer: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty.builder()

      public override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      public override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public override fun sourceContainer(sourceContainer: String) {
        cdkBuilder.sourceContainer(sourceContainer)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty,
    ) : VolumeFromProperty {
      public override fun readOnly(): Any? = unwrap(this).getReadOnly()

      public override fun sourceContainer(): String? = unwrap(this).getSourceContainer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeFromProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty):
          VolumeFromProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeFromProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeFromProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DockerVolumeConfigurationProperty {
    public fun autoprovision(): Any? = unwrap(this).getAutoprovision()

    public fun driver(): String? = unwrap(this).getDriver()

    public fun driverOpts(): Any? = unwrap(this).getDriverOpts()

    public fun labels(): Any? = unwrap(this).getLabels()

    public fun scope(): String? = unwrap(this).getScope()

    public interface Builder {
      public fun autoprovision(autoprovision: Boolean) {
      }

      public fun autoprovision(autoprovision: IResolvable) {
      }

      public fun driver(driver: String) {
      }

      public fun driverOpts(driverOpts: IResolvable) {
      }

      public fun driverOpts(driverOpts: Map<String, String>) {
      }

      public fun labels(labels: IResolvable) {
      }

      public fun labels(labels: Map<String, String>) {
      }

      public fun scope(scope: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty.builder()

      public override fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
      }

      public override fun autoprovision(autoprovision: IResolvable) {
        cdkBuilder.autoprovision(autoprovision.let(IResolvable::unwrap))
      }

      public override fun driver(driver: String) {
        cdkBuilder.driver(driver)
      }

      public override fun driverOpts(driverOpts: IResolvable) {
        cdkBuilder.driverOpts(driverOpts.let(IResolvable::unwrap))
      }

      public override fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
      }

      public override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      public override fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
      }

      public override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty,
    ) : DockerVolumeConfigurationProperty {
      public override fun autoprovision(): Any? = unwrap(this).getAutoprovision()

      public override fun driver(): String? = unwrap(this).getDriver()

      public override fun driverOpts(): Any? = unwrap(this).getDriverOpts()

      public override fun labels(): Any? = unwrap(this).getLabels()

      public override fun scope(): String? = unwrap(this).getScope()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EFSVolumeConfigurationProperty {
    public fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

    public fun filesystemId(): String

    public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    public interface Builder {
      public fun authorizationConfig(authorizationConfig: IResolvable) {
      }

      public fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      public
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit) {
      }

      public fun filesystemId(filesystemId: String) {
      }

      public fun rootDirectory(rootDirectory: String) {
      }

      public fun transitEncryption(transitEncryption: String) {
      }

      public fun transitEncryptionPort(transitEncryptionPort: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty.builder()

      public override fun authorizationConfig(authorizationConfig: IResolvable) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(IResolvable::unwrap))
      }

      public override fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty) {
        cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43a14e096c85e15a78eec7ef1bbe5a3cb80d900972837ecf8db4370d73749b4")
      public override
          fun authorizationConfig(authorizationConfig: AuthorizationConfigProperty.Builder.() -> Unit):
          Unit = authorizationConfig(AuthorizationConfigProperty(authorizationConfig))

      public override fun filesystemId(filesystemId: String) {
        cdkBuilder.filesystemId(filesystemId)
      }

      public override fun rootDirectory(rootDirectory: String) {
        cdkBuilder.rootDirectory(rootDirectory)
      }

      public override fun transitEncryption(transitEncryption: String) {
        cdkBuilder.transitEncryption(transitEncryption)
      }

      public override fun transitEncryptionPort(transitEncryptionPort: Number) {
        cdkBuilder.transitEncryptionPort(transitEncryptionPort)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty,
    ) : EFSVolumeConfigurationProperty {
      public override fun authorizationConfig(): Any? = unwrap(this).getAuthorizationConfig()

      public override fun filesystemId(): String = unwrap(this).getFilesystemId()

      public override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

      public override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

      public override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EFSVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty):
          EFSVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSVolumeConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EFSVolumeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MountPointProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun sourceVolume(): String? = unwrap(this).getSourceVolume()

    public interface Builder {
      public fun containerPath(containerPath: String) {
      }

      public fun readOnly(readOnly: Boolean) {
      }

      public fun readOnly(readOnly: IResolvable) {
      }

      public fun sourceVolume(sourceVolume: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.builder()

      public override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      public override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      public override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public override fun sourceVolume(sourceVolume: String) {
        cdkBuilder.sourceVolume(sourceVolume)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty,
    ) : MountPointProperty {
      public override fun containerPath(): String? = unwrap(this).getContainerPath()

      public override fun readOnly(): Any? = unwrap(this).getReadOnly()

      public override fun sourceVolume(): String? = unwrap(this).getSourceVolume()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MountPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty):
          MountPointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountPointProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AuthorizationConfigProperty {
    public fun accessPointId(): String? = unwrap(this).getAccessPointId()

    public fun iam(): String? = unwrap(this).getIam()

    public interface Builder {
      public fun accessPointId(accessPointId: String) {
      }

      public fun iam(iam: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty.builder()

      public override fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
      }

      public override fun iam(iam: String) {
        cdkBuilder.iam(iam)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty,
    ) : AuthorizationConfigProperty {
      public override fun accessPointId(): String? = unwrap(this).getAccessPointId()

      public override fun iam(): String? = unwrap(this).getIam()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty):
          AuthorizationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationConfigProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.AuthorizationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InferenceAcceleratorProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun deviceType(): String? = unwrap(this).getDeviceType()

    public interface Builder {
      public fun deviceName(deviceName: String) {
      }

      public fun deviceType(deviceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty,
    ) : InferenceAcceleratorProperty {
      public override fun deviceName(): String? = unwrap(this).getDeviceName()

      public override fun deviceType(): String? = unwrap(this).getDeviceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty):
          InferenceAcceleratorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InferenceAcceleratorProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.InferenceAcceleratorProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TaskDefinitionPlacementConstraintProperty {
    public fun expression(): String? = unwrap(this).getExpression()

    public fun type(): String

    public interface Builder {
      public fun expression(expression: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder()

      public override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty,
    ) : TaskDefinitionPlacementConstraintProperty {
      public override fun expression(): String? = unwrap(this).getExpression()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RuntimePlatformProperty {
    public fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

    public fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()

    public interface Builder {
      public fun cpuArchitecture(cpuArchitecture: String) {
      }

      public fun operatingSystemFamily(operatingSystemFamily: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty.builder()

      public override fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
      }

      public override fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty,
    ) : RuntimePlatformProperty {
      public override fun cpuArchitecture(): String? = unwrap(this).getCpuArchitecture()

      public override fun operatingSystemFamily(): String? = unwrap(this).getOperatingSystemFamily()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimePlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty):
          RuntimePlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimePlatformProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RuntimePlatformProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ContainerDependencyProperty {
    public fun condition(): String? = unwrap(this).getCondition()

    public fun containerName(): String? = unwrap(this).getContainerName()

    public interface Builder {
      public fun condition(condition: String) {
      }

      public fun containerName(containerName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty.builder()

      public override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty,
    ) : ContainerDependencyProperty {
      public override fun condition(): String? = unwrap(this).getCondition()

      public override fun containerName(): String? = unwrap(this).getContainerName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty):
          ContainerDependencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDependencyProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDependencyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KeyValuePairProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty,
    ) : KeyValuePairProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValuePairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty):
          KeyValuePairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValuePairProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KeyValuePairProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeviceProperty {
    public fun containerPath(): String? = unwrap(this).getContainerPath()

    public fun hostPath(): String? = unwrap(this).getHostPath()

    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    public interface Builder {
      public fun containerPath(containerPath: String) {
      }

      public fun hostPath(hostPath: String) {
      }

      public fun permissions(permissions: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty.builder()

      public override fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
      }

      public override fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
      }

      public override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty,
    ) : DeviceProperty {
      public override fun containerPath(): String? = unwrap(this).getContainerPath()

      public override fun hostPath(): String? = unwrap(this).getHostPath()

      public override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty):
          DeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.DeviceProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun capabilities(capabilities: IResolvable) {
      }

      public fun capabilities(capabilities: KernelCapabilitiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      public fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit) {
      }

      public fun devices(devices: IResolvable) {
      }

      public fun devices(devices: List<Any>) {
      }

      public fun initProcessEnabled(initProcessEnabled: Boolean) {
      }

      public fun initProcessEnabled(initProcessEnabled: IResolvable) {
      }

      public fun maxSwap(maxSwap: Number) {
      }

      public fun sharedMemorySize(sharedMemorySize: Number) {
      }

      public fun swappiness(swappiness: Number) {
      }

      public fun tmpfs(tmpfs: IResolvable) {
      }

      public fun tmpfs(tmpfs: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty.builder()

      public override fun capabilities(capabilities: IResolvable) {
        cdkBuilder.capabilities(capabilities.let(IResolvable::unwrap))
      }

      public override fun capabilities(capabilities: KernelCapabilitiesProperty) {
        cdkBuilder.capabilities(capabilities.let(KernelCapabilitiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d10aaa6a433a74fbb4881c1f9b1fea32c8374cd97bb050bf7c42862af656c32")
      public override fun capabilities(capabilities: KernelCapabilitiesProperty.Builder.() -> Unit):
          Unit = capabilities(KernelCapabilitiesProperty(capabilities))

      public override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      public override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      public override fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
      }

      public override fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled.let(IResolvable::unwrap))
      }

      public override fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
      }

      public override fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
      }

      public override fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
      }

      public override fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs.let(IResolvable::unwrap))
      }

      public override fun tmpfs(tmpfs: List<Any>) {
        cdkBuilder.tmpfs(tmpfs)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty,
    ) : LinuxParametersProperty {
      public override fun capabilities(): Any? = unwrap(this).getCapabilities()

      public override fun devices(): Any? = unwrap(this).getDevices()

      public override fun initProcessEnabled(): Any? = unwrap(this).getInitProcessEnabled()

      public override fun maxSwap(): Number? = unwrap(this).getMaxSwap()

      public override fun sharedMemorySize(): Number? = unwrap(this).getSharedMemorySize()

      public override fun swappiness(): Number? = unwrap(this).getSwappiness()

      public override fun tmpfs(): Any? = unwrap(this).getTmpfs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LinuxParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty):
          LinuxParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LinuxParametersProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LinuxParametersProperty = (wrapped
          as Wrapper).cdkObject
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

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun cpu(cpu: Number) {
      }

      public fun credentialSpecs(credentialSpecs: List<String>) {
      }

      public fun dependsOn(dependsOn: IResolvable) {
      }

      public fun dependsOn(dependsOn: List<Any>) {
      }

      public fun disableNetworking(disableNetworking: Boolean) {
      }

      public fun disableNetworking(disableNetworking: IResolvable) {
      }

      public fun dnsSearchDomains(dnsSearchDomains: List<String>) {
      }

      public fun dnsServers(dnsServers: List<String>) {
      }

      public fun dockerLabels(dockerLabels: IResolvable) {
      }

      public fun dockerLabels(dockerLabels: Map<String, String>) {
      }

      public fun dockerSecurityOptions(dockerSecurityOptions: List<String>) {
      }

      public fun entryPoint(entryPoint: List<String>) {
      }

      public fun environment(environment: IResolvable) {
      }

      public fun environment(environment: List<Any>) {
      }

      public fun environmentFiles(environmentFiles: IResolvable) {
      }

      public fun environmentFiles(environmentFiles: List<Any>) {
      }

      public fun essential(essential: Boolean) {
      }

      public fun essential(essential: IResolvable) {
      }

      public fun extraHosts(extraHosts: IResolvable) {
      }

      public fun extraHosts(extraHosts: List<Any>) {
      }

      public fun firelensConfiguration(firelensConfiguration: IResolvable) {
      }

      public fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      public
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit) {
      }

      public fun healthCheck(healthCheck: IResolvable) {
      }

      public fun healthCheck(healthCheck: HealthCheckProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit) {
      }

      public fun hostname(hostname: String) {
      }

      public fun image(image: String) {
      }

      public fun interactive(interactive: Boolean) {
      }

      public fun interactive(interactive: IResolvable) {
      }

      public fun links(links: List<String>) {
      }

      public fun linuxParameters(linuxParameters: IResolvable) {
      }

      public fun linuxParameters(linuxParameters: LinuxParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      public fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit) {
      }

      public fun logConfiguration(logConfiguration: IResolvable) {
      }

      public fun logConfiguration(logConfiguration: LogConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit) {
      }

      public fun memory(memory: Number) {
      }

      public fun memoryReservation(memoryReservation: Number) {
      }

      public fun mountPoints(mountPoints: IResolvable) {
      }

      public fun mountPoints(mountPoints: List<Any>) {
      }

      public fun name(name: String) {
      }

      public fun portMappings(portMappings: IResolvable) {
      }

      public fun portMappings(portMappings: List<Any>) {
      }

      public fun privileged(privileged: Boolean) {
      }

      public fun privileged(privileged: IResolvable) {
      }

      public fun pseudoTerminal(pseudoTerminal: Boolean) {
      }

      public fun pseudoTerminal(pseudoTerminal: IResolvable) {
      }

      public fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
      }

      public fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
      }

      public fun repositoryCredentials(repositoryCredentials: IResolvable) {
      }

      public fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      public
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit) {
      }

      public fun resourceRequirements(resourceRequirements: IResolvable) {
      }

      public fun resourceRequirements(resourceRequirements: List<Any>) {
      }

      public fun secrets(secrets: IResolvable) {
      }

      public fun secrets(secrets: List<Any>) {
      }

      public fun startTimeout(startTimeout: Number) {
      }

      public fun stopTimeout(stopTimeout: Number) {
      }

      public fun systemControls(systemControls: IResolvable) {
      }

      public fun systemControls(systemControls: List<Any>) {
      }

      public fun ulimits(ulimits: IResolvable) {
      }

      public fun ulimits(ulimits: List<Any>) {
      }

      public fun user(user: String) {
      }

      public fun volumesFrom(volumesFrom: IResolvable) {
      }

      public fun volumesFrom(volumesFrom: List<Any>) {
      }

      public fun workingDirectory(workingDirectory: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
      }

      public override fun credentialSpecs(credentialSpecs: List<String>) {
        cdkBuilder.credentialSpecs(credentialSpecs)
      }

      public override fun dependsOn(dependsOn: IResolvable) {
        cdkBuilder.dependsOn(dependsOn.let(IResolvable::unwrap))
      }

      public override fun dependsOn(dependsOn: List<Any>) {
        cdkBuilder.dependsOn(dependsOn)
      }

      public override fun disableNetworking(disableNetworking: Boolean) {
        cdkBuilder.disableNetworking(disableNetworking)
      }

      public override fun disableNetworking(disableNetworking: IResolvable) {
        cdkBuilder.disableNetworking(disableNetworking.let(IResolvable::unwrap))
      }

      public override fun dnsSearchDomains(dnsSearchDomains: List<String>) {
        cdkBuilder.dnsSearchDomains(dnsSearchDomains)
      }

      public override fun dnsServers(dnsServers: List<String>) {
        cdkBuilder.dnsServers(dnsServers)
      }

      public override fun dockerLabels(dockerLabels: IResolvable) {
        cdkBuilder.dockerLabels(dockerLabels.let(IResolvable::unwrap))
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

      public override fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment.let(IResolvable::unwrap))
      }

      public override fun environment(environment: List<Any>) {
        cdkBuilder.environment(environment)
      }

      public override fun environmentFiles(environmentFiles: IResolvable) {
        cdkBuilder.environmentFiles(environmentFiles.let(IResolvable::unwrap))
      }

      public override fun environmentFiles(environmentFiles: List<Any>) {
        cdkBuilder.environmentFiles(environmentFiles)
      }

      public override fun essential(essential: Boolean) {
        cdkBuilder.essential(essential)
      }

      public override fun essential(essential: IResolvable) {
        cdkBuilder.essential(essential.let(IResolvable::unwrap))
      }

      public override fun extraHosts(extraHosts: IResolvable) {
        cdkBuilder.extraHosts(extraHosts.let(IResolvable::unwrap))
      }

      public override fun extraHosts(extraHosts: List<Any>) {
        cdkBuilder.extraHosts(extraHosts)
      }

      public override fun firelensConfiguration(firelensConfiguration: IResolvable) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty) {
        cdkBuilder.firelensConfiguration(firelensConfiguration.let(FirelensConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bdf9e3619a9ba246df3a94c70122e527af2753f380b30534a84033404399c66")
      public override
          fun firelensConfiguration(firelensConfiguration: FirelensConfigurationProperty.Builder.() -> Unit):
          Unit = firelensConfiguration(FirelensConfigurationProperty(firelensConfiguration))

      public override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      public override fun healthCheck(healthCheck: HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4837bfb05965defb7163e5c30084bb5c602354f2849160a0750db163cca2bd1d")
      public override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckProperty(healthCheck))

      public override fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public override fun interactive(interactive: Boolean) {
        cdkBuilder.interactive(interactive)
      }

      public override fun interactive(interactive: IResolvable) {
        cdkBuilder.interactive(interactive.let(IResolvable::unwrap))
      }

      public override fun links(links: List<String>) {
        cdkBuilder.links(links)
      }

      public override fun linuxParameters(linuxParameters: IResolvable) {
        cdkBuilder.linuxParameters(linuxParameters.let(IResolvable::unwrap))
      }

      public override fun linuxParameters(linuxParameters: LinuxParametersProperty) {
        cdkBuilder.linuxParameters(linuxParameters.let(LinuxParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87aef773eb485e9bf242ce5977a3da60b770cd6e5d45895b0ff3f622786871e0")
      public override
          fun linuxParameters(linuxParameters: LinuxParametersProperty.Builder.() -> Unit): Unit =
          linuxParameters(LinuxParametersProperty(linuxParameters))

      public override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      public override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58fa3547d7435a292db84bb94db3afc0f4e9ccab8bfa55b903bea1a8fb6c047a")
      public override
          fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit): Unit
          = logConfiguration(LogConfigurationProperty(logConfiguration))

      public override fun memory(memory: Number) {
        cdkBuilder.memory(memory)
      }

      public override fun memoryReservation(memoryReservation: Number) {
        cdkBuilder.memoryReservation(memoryReservation)
      }

      public override fun mountPoints(mountPoints: IResolvable) {
        cdkBuilder.mountPoints(mountPoints.let(IResolvable::unwrap))
      }

      public override fun mountPoints(mountPoints: List<Any>) {
        cdkBuilder.mountPoints(mountPoints)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun portMappings(portMappings: IResolvable) {
        cdkBuilder.portMappings(portMappings.let(IResolvable::unwrap))
      }

      public override fun portMappings(portMappings: List<Any>) {
        cdkBuilder.portMappings(portMappings)
      }

      public override fun privileged(privileged: Boolean) {
        cdkBuilder.privileged(privileged)
      }

      public override fun privileged(privileged: IResolvable) {
        cdkBuilder.privileged(privileged.let(IResolvable::unwrap))
      }

      public override fun pseudoTerminal(pseudoTerminal: Boolean) {
        cdkBuilder.pseudoTerminal(pseudoTerminal)
      }

      public override fun pseudoTerminal(pseudoTerminal: IResolvable) {
        cdkBuilder.pseudoTerminal(pseudoTerminal.let(IResolvable::unwrap))
      }

      public override fun readonlyRootFilesystem(readonlyRootFilesystem: Boolean) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem)
      }

      public override fun readonlyRootFilesystem(readonlyRootFilesystem: IResolvable) {
        cdkBuilder.readonlyRootFilesystem(readonlyRootFilesystem.let(IResolvable::unwrap))
      }

      public override fun repositoryCredentials(repositoryCredentials: IResolvable) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(IResolvable::unwrap))
      }

      public override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty) {
        cdkBuilder.repositoryCredentials(repositoryCredentials.let(RepositoryCredentialsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133d624ac512a6234e78ff9370fd0c740dbb6fb1060203563d1b348483ad1376")
      public override
          fun repositoryCredentials(repositoryCredentials: RepositoryCredentialsProperty.Builder.() -> Unit):
          Unit = repositoryCredentials(RepositoryCredentialsProperty(repositoryCredentials))

      public override fun resourceRequirements(resourceRequirements: IResolvable) {
        cdkBuilder.resourceRequirements(resourceRequirements.let(IResolvable::unwrap))
      }

      public override fun resourceRequirements(resourceRequirements: List<Any>) {
        cdkBuilder.resourceRequirements(resourceRequirements)
      }

      public override fun secrets(secrets: IResolvable) {
        cdkBuilder.secrets(secrets.let(IResolvable::unwrap))
      }

      public override fun secrets(secrets: List<Any>) {
        cdkBuilder.secrets(secrets)
      }

      public override fun startTimeout(startTimeout: Number) {
        cdkBuilder.startTimeout(startTimeout)
      }

      public override fun stopTimeout(stopTimeout: Number) {
        cdkBuilder.stopTimeout(stopTimeout)
      }

      public override fun systemControls(systemControls: IResolvable) {
        cdkBuilder.systemControls(systemControls.let(IResolvable::unwrap))
      }

      public override fun systemControls(systemControls: List<Any>) {
        cdkBuilder.systemControls(systemControls)
      }

      public override fun ulimits(ulimits: IResolvable) {
        cdkBuilder.ulimits(ulimits.let(IResolvable::unwrap))
      }

      public override fun ulimits(ulimits: List<Any>) {
        cdkBuilder.ulimits(ulimits)
      }

      public override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public override fun volumesFrom(volumesFrom: IResolvable) {
        cdkBuilder.volumesFrom(volumesFrom.let(IResolvable::unwrap))
      }

      public override fun volumesFrom(volumesFrom: List<Any>) {
        cdkBuilder.volumesFrom(volumesFrom)
      }

      public override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty,
    ) : ContainerDefinitionProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun cpu(): Number? = unwrap(this).getCpu()

      public override fun credentialSpecs(): List<String> = unwrap(this).getCredentialSpecs() ?:
          emptyList()

      public override fun dependsOn(): Any? = unwrap(this).getDependsOn()

      public override fun disableNetworking(): Any? = unwrap(this).getDisableNetworking()

      public override fun dnsSearchDomains(): List<String> = unwrap(this).getDnsSearchDomains() ?:
          emptyList()

      public override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

      public override fun dockerLabels(): Any? = unwrap(this).getDockerLabels()

      public override fun dockerSecurityOptions(): List<String> =
          unwrap(this).getDockerSecurityOptions() ?: emptyList()

      public override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      public override fun environment(): Any? = unwrap(this).getEnvironment()

      public override fun environmentFiles(): Any? = unwrap(this).getEnvironmentFiles()

      public override fun essential(): Any? = unwrap(this).getEssential()

      public override fun extraHosts(): Any? = unwrap(this).getExtraHosts()

      public override fun firelensConfiguration(): Any? = unwrap(this).getFirelensConfiguration()

      public override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      public override fun hostname(): String? = unwrap(this).getHostname()

      public override fun image(): String = unwrap(this).getImage()

      public override fun interactive(): Any? = unwrap(this).getInteractive()

      public override fun links(): List<String> = unwrap(this).getLinks() ?: emptyList()

      public override fun linuxParameters(): Any? = unwrap(this).getLinuxParameters()

      public override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      public override fun memory(): Number? = unwrap(this).getMemory()

      public override fun memoryReservation(): Number? = unwrap(this).getMemoryReservation()

      public override fun mountPoints(): Any? = unwrap(this).getMountPoints()

      public override fun name(): String = unwrap(this).getName()

      public override fun portMappings(): Any? = unwrap(this).getPortMappings()

      public override fun privileged(): Any? = unwrap(this).getPrivileged()

      public override fun pseudoTerminal(): Any? = unwrap(this).getPseudoTerminal()

      public override fun readonlyRootFilesystem(): Any? = unwrap(this).getReadonlyRootFilesystem()

      public override fun repositoryCredentials(): Any? = unwrap(this).getRepositoryCredentials()

      public override fun resourceRequirements(): Any? = unwrap(this).getResourceRequirements()

      public override fun secrets(): Any? = unwrap(this).getSecrets()

      public override fun startTimeout(): Number? = unwrap(this).getStartTimeout()

      public override fun stopTimeout(): Number? = unwrap(this).getStopTimeout()

      public override fun systemControls(): Any? = unwrap(this).getSystemControls()

      public override fun ulimits(): Any? = unwrap(this).getUlimits()

      public override fun user(): String? = unwrap(this).getUser()

      public override fun volumesFrom(): Any? = unwrap(this).getVolumesFrom()

      public override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty):
          ContainerDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDefinitionProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ContainerDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProxyConfigurationProperty {
    public fun containerName(): String

    public fun proxyConfigurationProperties(): Any? = unwrap(this).getProxyConfigurationProperties()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun containerName(containerName: String) {
      }

      public fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
      }

      public fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty.builder()

      public override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      public override fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties.let(IResolvable::unwrap))
      }

      public override fun proxyConfigurationProperties(proxyConfigurationProperties: List<Any>) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty,
    ) : ProxyConfigurationProperty {
      public override fun containerName(): String = unwrap(this).getContainerName()

      public override fun proxyConfigurationProperties(): Any? =
          unwrap(this).getProxyConfigurationProperties()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty):
          ProxyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RepositoryCredentialsProperty {
    public fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()

    public interface Builder {
      public fun credentialsParameter(credentialsParameter: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty.builder()

      public override fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty,
    ) : RepositoryCredentialsProperty {
      public override fun credentialsParameter(): String? = unwrap(this).getCredentialsParameter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty):
          RepositoryCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryCredentialsProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.RepositoryCredentialsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SecretProperty {
    public fun name(): String

    public fun valueFrom(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun valueFrom(valueFrom: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty,
    ) : SecretProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun valueFrom(): String = unwrap(this).getValueFrom()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty):
          SecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.SecretProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    public fun logDriver(): String

    public fun options(): Any? = unwrap(this).getOptions()

    public fun secretOptions(): Any? = unwrap(this).getSecretOptions()

    public interface Builder {
      public fun logDriver(logDriver: String) {
      }

      public fun options(options: IResolvable) {
      }

      public fun options(options: Map<String, String>) {
      }

      public fun secretOptions(secretOptions: IResolvable) {
      }

      public fun secretOptions(secretOptions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty.builder()

      public override fun logDriver(logDriver: String) {
        cdkBuilder.logDriver(logDriver)
      }

      public override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      public override fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
      }

      public override fun secretOptions(secretOptions: IResolvable) {
        cdkBuilder.secretOptions(secretOptions.let(IResolvable::unwrap))
      }

      public override fun secretOptions(secretOptions: List<Any>) {
        cdkBuilder.secretOptions(secretOptions)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      public override fun logDriver(): String = unwrap(this).getLogDriver()

      public override fun options(): Any? = unwrap(this).getOptions()

      public override fun secretOptions(): Any? = unwrap(this).getSecretOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.LogConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PortMappingProperty {
    public fun appProtocol(): String? = unwrap(this).getAppProtocol()

    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    public fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

    public fun hostPort(): Number? = unwrap(this).getHostPort()

    public fun name(): String? = unwrap(this).getName()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public interface Builder {
      public fun appProtocol(appProtocol: String) {
      }

      public fun containerPort(containerPort: Number) {
      }

      public fun containerPortRange(containerPortRange: String) {
      }

      public fun hostPort(hostPort: Number) {
      }

      public fun name(name: String) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.builder()

      public override fun appProtocol(appProtocol: String) {
        cdkBuilder.appProtocol(appProtocol)
      }

      public override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      public override fun containerPortRange(containerPortRange: String) {
        cdkBuilder.containerPortRange(containerPortRange)
      }

      public override fun hostPort(hostPort: Number) {
        cdkBuilder.hostPort(hostPort)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty,
    ) : PortMappingProperty {
      public override fun appProtocol(): String? = unwrap(this).getAppProtocol()

      public override fun containerPort(): Number? = unwrap(this).getContainerPort()

      public override fun containerPortRange(): String? = unwrap(this).getContainerPortRange()

      public override fun hostPort(): Number? = unwrap(this).getHostPort()

      public override fun name(): String? = unwrap(this).getName()

      public override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty):
          PortMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HealthCheckProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun retries(): Number? = unwrap(this).getRetries()

    public fun startPeriod(): Number? = unwrap(this).getStartPeriod()

    public fun timeout(): Number? = unwrap(this).getTimeout()

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun interval(interval: Number) {
      }

      public fun retries(retries: Number) {
      }

      public fun startPeriod(startPeriod: Number) {
      }

      public fun timeout(timeout: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun retries(retries: Number) {
        cdkBuilder.retries(retries)
      }

      public override fun startPeriod(startPeriod: Number) {
        cdkBuilder.startPeriod(startPeriod)
      }

      public override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty,
    ) : HealthCheckProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun retries(): Number? = unwrap(this).getRetries()

      public override fun startPeriod(): Number? = unwrap(this).getStartPeriod()

      public override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty):
          HealthCheckProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.HealthCheckProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResourceRequirementProperty {
    public fun type(): String

    public fun `value`(): String

    public interface Builder {
      public fun type(type: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty,
    ) : ResourceRequirementProperty {
      public override fun type(): String = unwrap(this).getType()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty):
          ResourceRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceRequirementProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.ResourceRequirementProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EphemeralStorageProperty {
    public fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()

    public interface Builder {
      public fun sizeInGiB(sizeInGiB: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty.builder()

      public override fun sizeInGiB(sizeInGiB: Number) {
        cdkBuilder.sizeInGiB(sizeInGiB)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty,
    ) : EphemeralStorageProperty {
      public override fun sizeInGiB(): Number? = unwrap(this).getSizeInGiB()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty):
          EphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VolumeProperty {
    public fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

    public fun dockerVolumeConfiguration(): Any? = unwrap(this).getDockerVolumeConfiguration()

    public fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

    public fun host(): Any? = unwrap(this).getHost()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun configuredAtLaunch(configuredAtLaunch: Boolean) {
      }

      public fun configuredAtLaunch(configuredAtLaunch: IResolvable) {
      }

      public fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
      }

      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      public
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
      }

      public fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      public
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun host(host: IResolvable) {
      }

      public fun host(host: HostVolumePropertiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      public fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.builder()

      public override fun configuredAtLaunch(configuredAtLaunch: Boolean) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch)
      }

      public override fun configuredAtLaunch(configuredAtLaunch: IResolvable) {
        cdkBuilder.configuredAtLaunch(configuredAtLaunch.let(IResolvable::unwrap))
      }

      public override fun dockerVolumeConfiguration(dockerVolumeConfiguration: IResolvable) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty) {
        cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(DockerVolumeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("075ee6512e2348d8ee6c081e6cd8718a87bfae276002d2237e9f90a4bcfda739")
      public override
          fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfigurationProperty.Builder.() -> Unit):
          Unit =
          dockerVolumeConfiguration(DockerVolumeConfigurationProperty(dockerVolumeConfiguration))

      public override fun efsVolumeConfiguration(efsVolumeConfiguration: IResolvable) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty) {
        cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EFSVolumeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("038579f621b28993c3567dfa72c9d6cbd7adfcea5c48508a982e775a1af9b03f")
      public override
          fun efsVolumeConfiguration(efsVolumeConfiguration: EFSVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = efsVolumeConfiguration(EFSVolumeConfigurationProperty(efsVolumeConfiguration))

      public override fun host(host: IResolvable) {
        cdkBuilder.host(host.let(IResolvable::unwrap))
      }

      public override fun host(host: HostVolumePropertiesProperty) {
        cdkBuilder.host(host.let(HostVolumePropertiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f66f0cbb452d5748de372d592d494c2890e58dbe7b21c9be9a8e212099a6f2b")
      public override fun host(host: HostVolumePropertiesProperty.Builder.() -> Unit): Unit =
          host(HostVolumePropertiesProperty(host))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty,
    ) : VolumeProperty {
      public override fun configuredAtLaunch(): Any? = unwrap(this).getConfiguredAtLaunch()

      public override fun dockerVolumeConfiguration(): Any? =
          unwrap(this).getDockerVolumeConfiguration()

      public override fun efsVolumeConfiguration(): Any? = unwrap(this).getEfsVolumeConfiguration()

      public override fun host(): Any? = unwrap(this).getHost()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty):
          VolumeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KernelCapabilitiesProperty {
    public fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

    public fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()

    public interface Builder {
      public fun add(add: List<String>) {
      }

      public fun drop(drop: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.builder()

      public override fun add(add: List<String>) {
        cdkBuilder.add(add)
      }

      public override fun drop(drop: List<String>) {
        cdkBuilder.drop(drop)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty,
    ) : KernelCapabilitiesProperty {
      public override fun add(): List<String> = unwrap(this).getAdd() ?: emptyList()

      public override fun drop(): List<String> = unwrap(this).getDrop() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KernelCapabilitiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty):
          KernelCapabilitiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelCapabilitiesProperty):
          software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
