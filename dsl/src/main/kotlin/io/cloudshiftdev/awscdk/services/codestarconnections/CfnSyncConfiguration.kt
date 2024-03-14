package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSyncConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrProviderType(): String = unwrap(this).getAttrProviderType()

  public open fun attrRepositoryName(): String = unwrap(this).getAttrRepositoryName()

  public open fun branch(): String = unwrap(this).getBranch()

  public open fun branch(`value`: String) {
    unwrap(this).setBranch(`value`)
  }

  public open fun configFile(): String = unwrap(this).getConfigFile()

  public open fun configFile(`value`: String) {
    unwrap(this).setConfigFile(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun repositoryLinkId(): String = unwrap(this).getRepositoryLinkId()

  public open fun repositoryLinkId(`value`: String) {
    unwrap(this).setRepositoryLinkId(`value`)
  }

  public open fun resourceName(): String = unwrap(this).getResourceName()

  public open fun resourceName(`value`: String) {
    unwrap(this).setResourceName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun syncType(): String = unwrap(this).getSyncType()

  public open fun syncType(`value`: String) {
    unwrap(this).setSyncType(`value`)
  }

  public interface Builder {
    public fun branch(branch: String) {
    }

    public fun configFile(configFile: String) {
    }

    public fun repositoryLinkId(repositoryLinkId: String) {
    }

    public fun resourceName(resourceName: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun syncType(syncType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration.Builder.create(scope,
        id)

    public override fun branch(branch: String) {
      cdkBuilder.branch(branch)
    }

    public override fun configFile(configFile: String) {
      cdkBuilder.configFile(configFile)
    }

    public override fun repositoryLinkId(repositoryLinkId: String) {
      cdkBuilder.repositoryLinkId(repositoryLinkId)
    }

    public override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun syncType(syncType: String) {
      cdkBuilder.syncType(syncType)
    }

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSyncConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSyncConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration):
        CfnSyncConfiguration = CfnSyncConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSyncConfiguration):
        software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration = wrapped.cdkObject
  }
}
