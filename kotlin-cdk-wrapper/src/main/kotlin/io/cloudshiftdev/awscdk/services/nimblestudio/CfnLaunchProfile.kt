@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunchProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLaunchProfileId(): String = unwrap(this).getAttrLaunchProfileId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds()

  public open fun ec2SubnetIds(`value`: List<String>) {
    unwrap(this).setEc2SubnetIds(`value`)
  }

  public open fun ec2SubnetIds(vararg `value`: String): Unit = ec2SubnetIds(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun launchProfileProtocolVersions(): List<String> =
      unwrap(this).getLaunchProfileProtocolVersions()

  public open fun launchProfileProtocolVersions(`value`: List<String>) {
    unwrap(this).setLaunchProfileProtocolVersions(`value`)
  }

  public open fun launchProfileProtocolVersions(vararg `value`: String): Unit =
      launchProfileProtocolVersions(`value`.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun streamConfiguration(): Any = unwrap(this).getStreamConfiguration()

  public open fun streamConfiguration(`value`: IResolvable) {
    unwrap(this).setStreamConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun streamConfiguration(`value`: StreamConfigurationProperty) {
    unwrap(this).setStreamConfiguration(`value`.let(StreamConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f283d6cd17a9b024cb69645d2866d3e444cfc421682064b274a8879a890dadb4")
  public open fun streamConfiguration(`value`: StreamConfigurationProperty.Builder.() -> Unit): Unit
      = streamConfiguration(StreamConfigurationProperty(`value`))

  public open fun studioComponentIds(): List<String> = unwrap(this).getStudioComponentIds()

  public open fun studioComponentIds(`value`: List<String>) {
    unwrap(this).setStudioComponentIds(`value`)
  }

  public open fun studioComponentIds(vararg `value`: String): Unit =
      studioComponentIds(`value`.toList())

  public open fun studioId(): String = unwrap(this).getStudioId()

  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ec2SubnetIds(ec2SubnetIds: List<String>)

    public fun ec2SubnetIds(vararg ec2SubnetIds: String)

    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>)

    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String)

    public fun name(name: String)

    public fun streamConfiguration(streamConfiguration: IResolvable)

    public fun streamConfiguration(streamConfiguration: StreamConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    public
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit)

    public fun studioComponentIds(studioComponentIds: List<String>)

    public fun studioComponentIds(vararg studioComponentIds: String)

    public fun studioId(studioId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
      cdkBuilder.ec2SubnetIds(ec2SubnetIds)
    }

    override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
        ec2SubnetIds(ec2SubnetIds.toList())

    override fun launchProfileProtocolVersions(launchProfileProtocolVersions: List<String>) {
      cdkBuilder.launchProfileProtocolVersions(launchProfileProtocolVersions)
    }

    override fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String): Unit =
        launchProfileProtocolVersions(launchProfileProtocolVersions.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun streamConfiguration(streamConfiguration: IResolvable) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(IResolvable::unwrap))
    }

    override fun streamConfiguration(streamConfiguration: StreamConfigurationProperty) {
      cdkBuilder.streamConfiguration(streamConfiguration.let(StreamConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3698d518770f3d74705b416bc81e2434819c2c071182060cb23be9cccdc6f03")
    override
        fun streamConfiguration(streamConfiguration: StreamConfigurationProperty.Builder.() -> Unit):
        Unit = streamConfiguration(StreamConfigurationProperty(streamConfiguration))

    override fun studioComponentIds(studioComponentIds: List<String>) {
      cdkBuilder.studioComponentIds(studioComponentIds)
    }

    override fun studioComponentIds(vararg studioComponentIds: String): Unit =
        studioComponentIds(studioComponentIds.toList())

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile):
        CfnLaunchProfile = CfnLaunchProfile(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchProfile):
        software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile = wrapped.cdkObject
  }

  public interface VolumeConfigurationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun size(): Number? = unwrap(this).getSize()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    @CdkDslMarker
    public interface Builder {
      public fun iops(iops: Number)

      public fun size(size: Number)

      public fun throughput(throughput: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty.builder()

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty,
    ) : CdkObject(cdkObject), VolumeConfigurationProperty {
      override fun iops(): Number? = unwrap(this).getIops()

      override fun size(): Number? = unwrap(this).getSize()

      override fun throughput(): Number? = unwrap(this).getThroughput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty):
          VolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.VolumeConfigurationProperty
    }
  }

  public interface StreamConfigurationProperty {
    public fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

    public fun clipboardMode(): String

    public fun ec2InstanceTypes(): List<String>

    public fun maxSessionLengthInMinutes(): Number? = unwrap(this).getMaxSessionLengthInMinutes()

    public fun maxStoppedSessionLengthInMinutes(): Number? =
        unwrap(this).getMaxStoppedSessionLengthInMinutes()

    public fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

    public fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

    public fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

    public fun streamingImageIds(): List<String>

    public fun volumeConfiguration(): Any? = unwrap(this).getVolumeConfiguration()

    @CdkDslMarker
    public interface Builder {
      public fun automaticTerminationMode(automaticTerminationMode: String)

      public fun clipboardMode(clipboardMode: String)

      public fun ec2InstanceTypes(ec2InstanceTypes: List<String>)

      public fun ec2InstanceTypes(vararg ec2InstanceTypes: String)

      public fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number)

      public fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number)

      public fun sessionBackup(sessionBackup: IResolvable)

      public fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      public
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit)

      public fun sessionPersistenceMode(sessionPersistenceMode: String)

      public fun sessionStorage(sessionStorage: IResolvable)

      public fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      public
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit)

      public fun streamingImageIds(streamingImageIds: List<String>)

      public fun streamingImageIds(vararg streamingImageIds: String)

      public fun volumeConfiguration(volumeConfiguration: IResolvable)

      public fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd8c78b11abc1309c12b60352c63def2d14cf73b2a59c3faa574426649e5b85")
      public
          fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.builder()

      override fun automaticTerminationMode(automaticTerminationMode: String) {
        cdkBuilder.automaticTerminationMode(automaticTerminationMode)
      }

      override fun clipboardMode(clipboardMode: String) {
        cdkBuilder.clipboardMode(clipboardMode)
      }

      override fun ec2InstanceTypes(ec2InstanceTypes: List<String>) {
        cdkBuilder.ec2InstanceTypes(ec2InstanceTypes)
      }

      override fun ec2InstanceTypes(vararg ec2InstanceTypes: String): Unit =
          ec2InstanceTypes(ec2InstanceTypes.toList())

      override fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number) {
        cdkBuilder.maxSessionLengthInMinutes(maxSessionLengthInMinutes)
      }

      override fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number) {
        cdkBuilder.maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes)
      }

      override fun sessionBackup(sessionBackup: IResolvable) {
        cdkBuilder.sessionBackup(sessionBackup.let(IResolvable::unwrap))
      }

      override fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty) {
        cdkBuilder.sessionBackup(sessionBackup.let(StreamConfigurationSessionBackupProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ddc4c021317db72cacf355d33a0c36a14aca572e2f04692d19d4565d4472214")
      override
          fun sessionBackup(sessionBackup: StreamConfigurationSessionBackupProperty.Builder.() -> Unit):
          Unit = sessionBackup(StreamConfigurationSessionBackupProperty(sessionBackup))

      override fun sessionPersistenceMode(sessionPersistenceMode: String) {
        cdkBuilder.sessionPersistenceMode(sessionPersistenceMode)
      }

      override fun sessionStorage(sessionStorage: IResolvable) {
        cdkBuilder.sessionStorage(sessionStorage.let(IResolvable::unwrap))
      }

      override fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty) {
        cdkBuilder.sessionStorage(sessionStorage.let(StreamConfigurationSessionStorageProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf2fcfb08f02da9561ce6289f8628c8d85bbd7c1be0d4d3ea22f5b6921890323")
      override
          fun sessionStorage(sessionStorage: StreamConfigurationSessionStorageProperty.Builder.() -> Unit):
          Unit = sessionStorage(StreamConfigurationSessionStorageProperty(sessionStorage))

      override fun streamingImageIds(streamingImageIds: List<String>) {
        cdkBuilder.streamingImageIds(streamingImageIds)
      }

      override fun streamingImageIds(vararg streamingImageIds: String): Unit =
          streamingImageIds(streamingImageIds.toList())

      override fun volumeConfiguration(volumeConfiguration: IResolvable) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(IResolvable::unwrap))
      }

      override fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty) {
        cdkBuilder.volumeConfiguration(volumeConfiguration.let(VolumeConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd8c78b11abc1309c12b60352c63def2d14cf73b2a59c3faa574426649e5b85")
      override
          fun volumeConfiguration(volumeConfiguration: VolumeConfigurationProperty.Builder.() -> Unit):
          Unit = volumeConfiguration(VolumeConfigurationProperty(volumeConfiguration))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty,
    ) : CdkObject(cdkObject), StreamConfigurationProperty {
      override fun automaticTerminationMode(): String? = unwrap(this).getAutomaticTerminationMode()

      override fun clipboardMode(): String = unwrap(this).getClipboardMode()

      override fun ec2InstanceTypes(): List<String> = unwrap(this).getEc2InstanceTypes()

      override fun maxSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxSessionLengthInMinutes()

      override fun maxStoppedSessionLengthInMinutes(): Number? =
          unwrap(this).getMaxStoppedSessionLengthInMinutes()

      override fun sessionBackup(): Any? = unwrap(this).getSessionBackup()

      override fun sessionPersistenceMode(): String? = unwrap(this).getSessionPersistenceMode()

      override fun sessionStorage(): Any? = unwrap(this).getSessionStorage()

      override fun streamingImageIds(): List<String> = unwrap(this).getStreamingImageIds()

      override fun volumeConfiguration(): Any? = unwrap(this).getVolumeConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty):
          StreamConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty
    }
  }

  public interface StreamingSessionStorageRootProperty {
    public fun linux(): String? = unwrap(this).getLinux()

    public fun windows(): String? = unwrap(this).getWindows()

    @CdkDslMarker
    public interface Builder {
      public fun linux(linux: String)

      public fun windows(windows: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty.builder()

      override fun linux(linux: String) {
        cdkBuilder.linux(linux)
      }

      override fun windows(windows: String) {
        cdkBuilder.windows(windows)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty,
    ) : CdkObject(cdkObject), StreamingSessionStorageRootProperty {
      override fun linux(): String? = unwrap(this).getLinux()

      override fun windows(): String? = unwrap(this).getWindows()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingSessionStorageRootProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty):
          StreamingSessionStorageRootProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingSessionStorageRootProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamingSessionStorageRootProperty
    }
  }

  public interface StreamConfigurationSessionStorageProperty {
    public fun mode(): List<String>

    public fun root(): Any? = unwrap(this).getRoot()

    @CdkDslMarker
    public interface Builder {
      public fun mode(mode: List<String>)

      public fun mode(vararg mode: String)

      public fun root(root: IResolvable)

      public fun root(root: StreamingSessionStorageRootProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0c44feeeddfb6ec40191a44a0bf186008b7d44aa76d4f9f40d5b30baab837d")
      public fun root(root: StreamingSessionStorageRootProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty.builder()

      override fun mode(mode: List<String>) {
        cdkBuilder.mode(mode)
      }

      override fun mode(vararg mode: String): Unit = mode(mode.toList())

      override fun root(root: IResolvable) {
        cdkBuilder.root(root.let(IResolvable::unwrap))
      }

      override fun root(root: StreamingSessionStorageRootProperty) {
        cdkBuilder.root(root.let(StreamingSessionStorageRootProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc0c44feeeddfb6ec40191a44a0bf186008b7d44aa76d4f9f40d5b30baab837d")
      override fun root(root: StreamingSessionStorageRootProperty.Builder.() -> Unit): Unit =
          root(StreamingSessionStorageRootProperty(root))

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty,
    ) : CdkObject(cdkObject), StreamConfigurationSessionStorageProperty {
      override fun mode(): List<String> = unwrap(this).getMode()

      override fun root(): Any? = unwrap(this).getRoot()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamConfigurationSessionStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty):
          StreamConfigurationSessionStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationSessionStorageProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionStorageProperty
    }
  }

  public interface StreamConfigurationSessionBackupProperty {
    public fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

    public fun mode(): String? = unwrap(this).getMode()

    @CdkDslMarker
    public interface Builder {
      public fun maxBackupsToRetain(maxBackupsToRetain: Number)

      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

      override fun maxBackupsToRetain(maxBackupsToRetain: Number) {
        cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty,
    ) : CdkObject(cdkObject), StreamConfigurationSessionBackupProperty {
      override fun maxBackupsToRetain(): Number? = unwrap(this).getMaxBackupsToRetain()

      override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamConfigurationSessionBackupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty):
          StreamConfigurationSessionBackupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamConfigurationSessionBackupProperty):
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationSessionBackupProperty
    }
  }
}
