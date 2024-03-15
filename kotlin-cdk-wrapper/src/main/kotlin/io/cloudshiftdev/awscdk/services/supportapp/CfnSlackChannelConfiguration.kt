@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSlackChannelConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun channelId(): String = unwrap(this).getChannelId()

  public open fun channelId(`value`: String) {
    unwrap(this).setChannelId(`value`)
  }

  public open fun channelName(): String? = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun channelRoleArn(): String = unwrap(this).getChannelRoleArn()

  public open fun channelRoleArn(`value`: String) {
    unwrap(this).setChannelRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun notifyOnAddCorrespondenceToCase(): Any? =
      unwrap(this).getNotifyOnAddCorrespondenceToCase()

  public open fun notifyOnAddCorrespondenceToCase(`value`: Boolean) {
    unwrap(this).setNotifyOnAddCorrespondenceToCase(`value`)
  }

  public open fun notifyOnAddCorrespondenceToCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnAddCorrespondenceToCase(`value`.let(IResolvable::unwrap))
  }

  public open fun notifyOnCaseSeverity(): String = unwrap(this).getNotifyOnCaseSeverity()

  public open fun notifyOnCaseSeverity(`value`: String) {
    unwrap(this).setNotifyOnCaseSeverity(`value`)
  }

  public open fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

  public open fun notifyOnCreateOrReopenCase(`value`: Boolean) {
    unwrap(this).setNotifyOnCreateOrReopenCase(`value`)
  }

  public open fun notifyOnCreateOrReopenCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnCreateOrReopenCase(`value`.let(IResolvable::unwrap))
  }

  public open fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

  public open fun notifyOnResolveCase(`value`: Boolean) {
    unwrap(this).setNotifyOnResolveCase(`value`)
  }

  public open fun notifyOnResolveCase(`value`: IResolvable) {
    unwrap(this).setNotifyOnResolveCase(`value`.let(IResolvable::unwrap))
  }

  public open fun teamId(): String = unwrap(this).getTeamId()

  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun channelId(channelId: String)

    public fun channelName(channelName: String)

    public fun channelRoleArn(channelRoleArn: String)

    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean)

    public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable)

    public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String)

    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean)

    public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable)

    public fun notifyOnResolveCase(notifyOnResolveCase: Boolean)

    public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable)

    public fun teamId(teamId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.Builder.create(scope,
        id)

    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun channelRoleArn(channelRoleArn: String) {
      cdkBuilder.channelRoleArn(channelRoleArn)
    }

    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
    }

    override fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
      cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase.let(IResolvable::unwrap))
    }

    override fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
      cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
    }

    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
    }

    override fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
      cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase.let(IResolvable::unwrap))
    }

    override fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
    }

    override fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
      cdkBuilder.notifyOnResolveCase(notifyOnResolveCase.let(IResolvable::unwrap))
    }

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSlackChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSlackChannelConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration):
        CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfiguration):
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration = wrapped.cdkObject
  }
}
