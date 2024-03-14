package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSlackWorkspaceConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun teamId(): String = unwrap(this).getTeamId()

  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  public open fun versionId(): String? = unwrap(this).getVersionId()

  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  public interface Builder {
    public fun teamId(teamId: String) {
    }

    public fun versionId(versionId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration.Builder.create(scope,
        id)

    public override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    public override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSlackWorkspaceConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSlackWorkspaceConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration):
        CfnSlackWorkspaceConfiguration = CfnSlackWorkspaceConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSlackWorkspaceConfiguration):
        software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration =
        wrapped.cdkObject
  }
}
