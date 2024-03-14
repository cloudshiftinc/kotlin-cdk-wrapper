package io.cloudshiftdev.awscdk.services.workspaces

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun bundleId(): String = unwrap(this).getBundleId()

  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun rootVolumeEncryptionEnabled(): Any? =
      unwrap(this).getRootVolumeEncryptionEnabled()

  public open fun rootVolumeEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setRootVolumeEncryptionEnabled(`value`)
  }

  public open fun rootVolumeEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setRootVolumeEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public open fun userVolumeEncryptionEnabled(): Any? =
      unwrap(this).getUserVolumeEncryptionEnabled()

  public open fun userVolumeEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setUserVolumeEncryptionEnabled(`value`)
  }

  public open fun userVolumeEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setUserVolumeEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

  public open fun volumeEncryptionKey(`value`: String) {
    unwrap(this).setVolumeEncryptionKey(`value`)
  }

  public open fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()

  public open fun workspaceProperties(`value`: IResolvable) {
    unwrap(this).setWorkspaceProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun workspaceProperties(`value`: WorkspacePropertiesProperty) {
    unwrap(this).setWorkspaceProperties(`value`.let(WorkspacePropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5106cf308affef8a381cdba948e2b0384febdcba5fd4b6f9b44f6b4f47d93673")
  public open fun workspaceProperties(`value`: WorkspacePropertiesProperty.Builder.() -> Unit): Unit
      = workspaceProperties(WorkspacePropertiesProperty(`value`))

  public interface Builder {
    public fun bundleId(bundleId: String) {
    }

    public fun directoryId(directoryId: String) {
    }

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
    }

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun userName(userName: String) {
    }

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
    }

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
    }

    public fun volumeEncryptionKey(volumeEncryptionKey: String) {
    }

    public fun workspaceProperties(workspaceProperties: IResolvable) {
    }

    public fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c513f7198f435a1a76ee09cbc2718464f34127212b93b77acf4625ed6f422f3")
    public
        fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder.create(scope, id)

    public override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    public override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    public override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    public override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    public override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    public override fun volumeEncryptionKey(volumeEncryptionKey: String) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    public override fun workspaceProperties(workspaceProperties: IResolvable) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(IResolvable::unwrap))
    }

    public override fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(WorkspacePropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c513f7198f435a1a76ee09cbc2718464f34127212b93b77acf4625ed6f422f3")
    public override
        fun workspaceProperties(workspaceProperties: WorkspacePropertiesProperty.Builder.() -> Unit):
        Unit = workspaceProperties(WorkspacePropertiesProperty(workspaceProperties))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace):
        CfnWorkspace = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace):
        software.amazon.awscdk.services.workspaces.CfnWorkspace = wrapped.cdkObject
  }

  public interface WorkspacePropertiesProperty {
    public fun computeTypeName(): String? = unwrap(this).getComputeTypeName()

    public fun rootVolumeSizeGib(): Number? = unwrap(this).getRootVolumeSizeGib()

    public fun runningMode(): String? = unwrap(this).getRunningMode()

    public fun runningModeAutoStopTimeoutInMinutes(): Number? =
        unwrap(this).getRunningModeAutoStopTimeoutInMinutes()

    public fun userVolumeSizeGib(): Number? = unwrap(this).getUserVolumeSizeGib()

    public interface Builder {
      public fun computeTypeName(computeTypeName: String) {
      }

      public fun rootVolumeSizeGib(rootVolumeSizeGib: Number) {
      }

      public fun runningMode(runningMode: String) {
      }

      public fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number) {
      }

      public fun userVolumeSizeGib(userVolumeSizeGib: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.builder()

      public override fun computeTypeName(computeTypeName: String) {
        cdkBuilder.computeTypeName(computeTypeName)
      }

      public override fun rootVolumeSizeGib(rootVolumeSizeGib: Number) {
        cdkBuilder.rootVolumeSizeGib(rootVolumeSizeGib)
      }

      public override fun runningMode(runningMode: String) {
        cdkBuilder.runningMode(runningMode)
      }

      public override
          fun runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes: Number) {
        cdkBuilder.runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes)
      }

      public override fun userVolumeSizeGib(userVolumeSizeGib: Number) {
        cdkBuilder.userVolumeSizeGib(userVolumeSizeGib)
      }

      public fun build():
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty,
    ) : WorkspacePropertiesProperty {
      public override fun computeTypeName(): String? = unwrap(this).getComputeTypeName()

      public override fun rootVolumeSizeGib(): Number? = unwrap(this).getRootVolumeSizeGib()

      public override fun runningMode(): String? = unwrap(this).getRunningMode()

      public override fun runningModeAutoStopTimeoutInMinutes(): Number? =
          unwrap(this).getRunningModeAutoStopTimeoutInMinutes()

      public override fun userVolumeSizeGib(): Number? = unwrap(this).getUserVolumeSizeGib()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkspacePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty):
          WorkspacePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkspacePropertiesProperty):
          software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
