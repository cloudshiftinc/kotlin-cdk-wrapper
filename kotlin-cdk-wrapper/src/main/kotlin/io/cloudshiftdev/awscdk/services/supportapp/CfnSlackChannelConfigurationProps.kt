@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnSlackChannelConfigurationProps {
  public fun channelId(): String

  public fun channelName(): String? = unwrap(this).getChannelName()

  public fun channelRoleArn(): String

  public fun notifyOnAddCorrespondenceToCase(): Any? =
      unwrap(this).getNotifyOnAddCorrespondenceToCase()

  public fun notifyOnCaseSeverity(): String

  public fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

  public fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

  public fun teamId(): String

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps.builder()

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

    public fun build(): software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps,
  ) : CdkObject(cdkObject), CfnSlackChannelConfigurationProps {
    override fun channelId(): String = unwrap(this).getChannelId()

    override fun channelName(): String? = unwrap(this).getChannelName()

    override fun channelRoleArn(): String = unwrap(this).getChannelRoleArn()

    override fun notifyOnAddCorrespondenceToCase(): Any? =
        unwrap(this).getNotifyOnAddCorrespondenceToCase()

    override fun notifyOnCaseSeverity(): String = unwrap(this).getNotifyOnCaseSeverity()

    override fun notifyOnCreateOrReopenCase(): Any? = unwrap(this).getNotifyOnCreateOrReopenCase()

    override fun notifyOnResolveCase(): Any? = unwrap(this).getNotifyOnResolveCase()

    override fun teamId(): String = unwrap(this).getTeamId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSlackChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps):
        CfnSlackChannelConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfigurationProps):
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
  }
}
