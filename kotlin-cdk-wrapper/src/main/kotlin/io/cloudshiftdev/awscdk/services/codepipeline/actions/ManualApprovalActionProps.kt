@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ManualApprovalActionProps : CommonAwsActionProps {
  public fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

  public fun externalEntityLink(): String? = unwrap(this).getExternalEntityLink()

  public fun notificationTopic(): ITopic? = unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

  public fun notifyEmails(): List<String> = unwrap(this).getNotifyEmails() ?: emptyList()

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
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps.builder()

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

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps,
  ) : CdkObject(cdkObject), ManualApprovalActionProps {
    override fun actionName(): String = unwrap(this).getActionName()

    override fun additionalInformation(): String? = unwrap(this).getAdditionalInformation()

    override fun externalEntityLink(): String? = unwrap(this).getExternalEntityLink()

    override fun notificationTopic(): ITopic? =
        unwrap(this).getNotificationTopic()?.let(ITopic::wrap)

    override fun notifyEmails(): List<String> = unwrap(this).getNotifyEmails() ?: emptyList()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps):
        ManualApprovalActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalActionProps):
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps
  }
}
