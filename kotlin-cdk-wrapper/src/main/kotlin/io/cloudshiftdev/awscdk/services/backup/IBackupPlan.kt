@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IBackupPlan : IResource {
  public fun backupPlanId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.IBackupPlan,
  ) : CdkObject(cdkObject), IBackupPlan {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun backupPlanId(): String = unwrap(this).getBackupPlanId()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.IBackupPlan): IBackupPlan =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBackupPlan): software.amazon.awscdk.services.backup.IBackupPlan =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.backup.IBackupPlan
  }
}
