@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSyncConfigurationProps {
  public fun branch(): String

  public fun configFile(): String

  public fun repositoryLinkId(): String

  public fun resourceName(): String

  public fun roleArn(): String

  public fun syncType(): String

  @CdkDslMarker
  public interface Builder {
    public fun branch(branch: String)

    public fun configFile(configFile: String)

    public fun repositoryLinkId(repositoryLinkId: String)

    public fun resourceName(resourceName: String)

    public fun roleArn(roleArn: String)

    public fun syncType(syncType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps.builder()

    override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    override fun configFile(configFile: String) {
      cdkBuilder.configFile(configFile)
    }

    override fun repositoryLinkId(repositoryLinkId: String) {
      cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build():
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps,
  ) : CdkObject(cdkObject), CfnSyncConfigurationProps {
    override fun branch(): String = unwrap(this).getBranch()

    override fun configFile(): String = unwrap(this).getConfigFile()

    override fun repositoryLinkId(): String = unwrap(this).getRepositoryLinkId()

    override fun resourceName(): String = unwrap(this).getResourceName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun syncType(): String = unwrap(this).getSyncType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSyncConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps):
        CfnSyncConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSyncConfigurationProps):
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps
  }
}
