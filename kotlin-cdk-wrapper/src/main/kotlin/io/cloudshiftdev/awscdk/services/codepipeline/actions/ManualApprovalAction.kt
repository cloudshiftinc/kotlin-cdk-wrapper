@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class ManualApprovalAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction,
) : Action(cdkObject) {
  public open fun grantManualApproval(grantable: IGrantable) {
    unwrap(this).grantManualApproval(grantable.let(IGrantable::unwrap))
  }

  public open fun notificationTopic(): ITopic? =
      unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun additionalInformation(additionalInformation: String)

    public fun externalEntityLink(externalEntityLink: String)

    public fun notificationTopic(notificationTopic: ITopic)

    public fun notifyEmails(notifyEmails: List<String>)

    public fun notifyEmails(vararg notifyEmails: String)

    public fun role(role: IRole)

    public fun runOrder(runOrder: Number)

    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction.Builder.create()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun additionalInformation(additionalInformation: String) {
      cdkBuilder.additionalInformation(additionalInformation)
    }

    override fun externalEntityLink(externalEntityLink: String) {
      cdkBuilder.externalEntityLink(externalEntityLink)
    }

    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    override fun notifyEmails(notifyEmails: List<String>) {
      cdkBuilder.notifyEmails(notifyEmails)
    }

    override fun notifyEmails(vararg notifyEmails: String): Unit =
        notifyEmails(notifyEmails.toList())

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalAction {
      val builderImpl = BuilderImpl()
      return ManualApprovalAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction):
        ManualApprovalAction = ManualApprovalAction(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalAction):
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalAction =
        wrapped.cdkObject
  }
}
