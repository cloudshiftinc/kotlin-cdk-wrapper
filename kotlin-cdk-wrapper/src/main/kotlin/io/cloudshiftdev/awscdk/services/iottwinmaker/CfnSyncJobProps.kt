@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnSyncJobProps {
  public fun syncRole(): String

  public fun syncSource(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun syncRole(syncRole: String)

    public fun syncSource(syncSource: String)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps.builder()

    override fun syncRole(syncRole: String) {
      cdkBuilder.syncRole(syncRole)
    }

    override fun syncSource(syncSource: String) {
      cdkBuilder.syncSource(syncSource)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps,
  ) : CdkObject(cdkObject), CfnSyncJobProps {
    override fun syncRole(): String = unwrap(this).getSyncRole()

    override fun syncSource(): String = unwrap(this).getSyncSource()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSyncJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps):
        CfnSyncJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSyncJobProps):
        software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps
  }
}
