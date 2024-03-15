@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSlackWorkspaceConfigurationProps {
  public fun teamId(): String

  public fun versionId(): String? = unwrap(this).getVersionId()

  @CdkDslMarker
  public interface Builder {
    public fun teamId(teamId: String)

    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps.builder()

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build():
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps,
  ) : CdkObject(cdkObject), CfnSlackWorkspaceConfigurationProps {
    override fun teamId(): String = unwrap(this).getTeamId()

    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSlackWorkspaceConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps):
        CfnSlackWorkspaceConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackWorkspaceConfigurationProps):
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
  }
}
