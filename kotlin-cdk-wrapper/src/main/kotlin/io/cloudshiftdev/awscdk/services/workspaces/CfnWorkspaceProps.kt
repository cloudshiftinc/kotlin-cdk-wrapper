@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWorkspaceProps {
  public fun bundleId(): String

  public fun directoryId(): String

  public fun rootVolumeEncryptionEnabled(): Any? = unwrap(this).getRootVolumeEncryptionEnabled()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userName(): String

  public fun userVolumeEncryptionEnabled(): Any? = unwrap(this).getUserVolumeEncryptionEnabled()

  public fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

  public fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()

  @CdkDslMarker
  public interface Builder {
    public fun bundleId(bundleId: String)

    public fun directoryId(directoryId: String)

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean)

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean)

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable)

    public fun volumeEncryptionKey(volumeEncryptionKey: String)

    public fun workspaceProperties(workspaceProperties: IResolvable)

    public fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfcdd4ee7d9d252c6ce7284cbe74b7b230029def700a5196f835c827f7d37b1a")
    public
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.builder()

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    override fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    override fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
      cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun volumeEncryptionKey(volumeEncryptionKey: String) {
      cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    override fun workspaceProperties(workspaceProperties: IResolvable) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(IResolvable::unwrap))
    }

    override
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty) {
      cdkBuilder.workspaceProperties(workspaceProperties.let(CfnWorkspace.WorkspacePropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfcdd4ee7d9d252c6ce7284cbe74b7b230029def700a5196f835c827f7d37b1a")
    override
        fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit):
        Unit = workspaceProperties(CfnWorkspace.WorkspacePropertiesProperty(workspaceProperties))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    override fun bundleId(): String = unwrap(this).getBundleId()

    override fun directoryId(): String = unwrap(this).getDirectoryId()

    override fun rootVolumeEncryptionEnabled(): Any? = unwrap(this).getRootVolumeEncryptionEnabled()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userName(): String = unwrap(this).getUserName()

    override fun userVolumeEncryptionEnabled(): Any? = unwrap(this).getUserVolumeEncryptionEnabled()

    override fun volumeEncryptionKey(): String? = unwrap(this).getVolumeEncryptionKey()

    override fun workspaceProperties(): Any? = unwrap(this).getWorkspaceProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspaceProps):
        CfnWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.workspaces.CfnWorkspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
  }
}
