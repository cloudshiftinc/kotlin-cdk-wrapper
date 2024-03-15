@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface INotificationRule : IResource {
  public fun addTarget(arg0: INotificationRuleTarget): Boolean

  public fun notificationRuleArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRule,
  ) : CdkObject(cdkObject), INotificationRule {
    override fun addTarget(arg0: INotificationRuleTarget): Boolean =
        unwrap(this).addTarget(arg0.let(INotificationRuleTarget::unwrap))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun notificationRuleArn(): String = unwrap(this).getNotificationRuleArn()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRule):
        INotificationRule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INotificationRule):
        software.amazon.awscdk.services.codestarnotifications.INotificationRule = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.INotificationRule
  }
}
